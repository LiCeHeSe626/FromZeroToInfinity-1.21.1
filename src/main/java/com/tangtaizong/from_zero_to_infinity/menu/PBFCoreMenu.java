package com.tangtaizong.from_zero_to_infinity.menu;

import com.tangtaizong.from_zero_to_infinity.blockentity.PBFCoreBlockEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class PBFCoreMenu extends AbstractContainerMenu {

    private final ContainerLevelAccess access;

    private final DataSlot progressSlot;
    private final DataSlot maxProgressSlot;
    private final DataSlot burnTimeSlot;
    private final DataSlot burnDurationSlot;

    public PBFCoreMenu(int containerId, Inventory playerInv) {
        this(containerId, playerInv, new ItemStackHandler(PBFCoreBlockEntity.TOTAL_SLOTS),
                ContainerLevelAccess.NULL, null);
    }

    public PBFCoreMenu(int containerId, Inventory playerInv,
                       IItemHandler dataInventory,
                       ContainerLevelAccess access,
                       PBFCoreBlockEntity core) {
        super(ModMenus.PBF_CORE.get(), containerId);
        this.access = access;

        for (int i = 0; i < PBFCoreBlockEntity.INPUT_COUNT; i++) {
            int row = i / 3;
            int col = i % 3;
            this.addSlot(new SlotItemHandler(dataInventory,
                    PBFCoreBlockEntity.INPUT_START + i,
                    26 + col * 18, 17 + row * 18));
        }

        this.addSlot(new SlotItemHandler(dataInventory,
                PBFCoreBlockEntity.FUEL_SLOT, 26, 71) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return AbstractFurnaceBlockEntity.getFuel().containsKey(stack.getItem());
            }
        });

        this.addSlot(new SlotItemHandler(dataInventory,
                PBFCoreBlockEntity.SOLID_OUTPUT, 134, 44) {
            @Override public boolean mayPlace(ItemStack stack) { return false; }
        });

        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9,
                        8 + col * 18, 84 + row * 18));

        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));

        if (core != null) {
            this.progressSlot = slot(core::getProgress);
            this.maxProgressSlot = slot(core::getMaxProgress);
            this.burnTimeSlot = slot(core::getBurnTime);
            this.burnDurationSlot = slot(core::getBurnDuration);
        } else {
            this.progressSlot = DataSlot.standalone();
            this.maxProgressSlot = DataSlot.standalone();
            this.burnTimeSlot = DataSlot.standalone();
            this.burnDurationSlot = DataSlot.standalone();
        }
        this.addDataSlot(progressSlot);
        this.addDataSlot(maxProgressSlot);
        this.addDataSlot(burnTimeSlot);
        this.addDataSlot(burnDurationSlot);
    }

    private static DataSlot slot(java.util.function.IntSupplier getter) {
        return new DataSlot() {
            @Override public int get() { return getter.getAsInt(); }
            @Override public void set(int value) { }
        };
    }

    @Override
    public boolean stillValid(Player player) {
        return AbstractContainerMenu.stillValid(this.access, player,
                com.tangtaizong.from_zero_to_infinity.block.ModBlocks.PBF_CORE.get());
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack quickMovedStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack rawStack = slot.getItem();
            quickMovedStack = rawStack.copy();

            if (index == 7) {
                if (!this.moveItemStackTo(rawStack, 8, 44, true)) return ItemStack.EMPTY;
                slot.onQuickCraft(rawStack, quickMovedStack);
            } else if (index >= 0 && index <= 6) {
                if (!this.moveItemStackTo(rawStack, 8, 44, true)) return ItemStack.EMPTY;
            } else {
                boolean moved = false;
                if (AbstractFurnaceBlockEntity.getFuel().containsKey(rawStack.getItem())) {
                    moved = this.moveItemStackTo(rawStack, 6, 7, false);
                }
                if (!moved) {
                    moved = this.moveItemStackTo(rawStack, 0, 6, false);
                }
                if (!moved) {
                    if (index < 35) {
                        if (!this.moveItemStackTo(rawStack, 35, 44, false)) return ItemStack.EMPTY;
                    } else {
                        if (!this.moveItemStackTo(rawStack, 8, 35, false)) return ItemStack.EMPTY;
                    }
                }
            }

            if (rawStack.isEmpty()) slot.set(ItemStack.EMPTY);
            else slot.setChanged();
            slot.onTake(player, rawStack);
        }
        return quickMovedStack;
    }

    public int getProgress() { return progressSlot.get(); }
    public int getMaxProgress() { return maxProgressSlot.get(); }
    public int getBurnTime() { return burnTimeSlot.get(); }
    public int getBurnDuration() { return burnDurationSlot.get(); }
}