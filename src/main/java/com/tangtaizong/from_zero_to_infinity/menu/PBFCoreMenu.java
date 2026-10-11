package com.tangtaizong.from_zero_to_infinity.menu;

import com.tangtaizong.from_zero_to_infinity.blockentity.PBFCoreBlockEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class PBFCoreMenu extends AbstractContainerMenu {

    private final ContainerLevelAccess access;

    public PBFCoreMenu(int containerId, Inventory playerInv) {
        this(containerId, playerInv, new ItemStackHandler(2),
                ContainerLevelAccess.NULL, null);
    }

    public PBFCoreMenu(int containerId, Inventory playerInv,
                       IItemHandler dataInventory,
                       ContainerLevelAccess access,
                       PBFCoreBlockEntity core) {
        super(ModMenus.PBF_CORE.get(), containerId);
        this.access = access;

        this.addSlot(new SlotItemHandler(dataInventory, 0, 56, 35));
        this.addSlot(new SlotItemHandler(dataInventory, 1, 116, 35) {
            @Override public boolean mayPlace(ItemStack stack) { return false; }
        });

        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9,
                        8 + col * 18, 84 + row * 18));

        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
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

            if (index == 1) {
                if (!this.moveItemStackTo(rawStack, 2, 38, true)) return ItemStack.EMPTY;
                slot.onQuickCraft(rawStack, quickMovedStack);
            } else if (index == 0) {
                if (!this.moveItemStackTo(rawStack, 2, 38, true)) return ItemStack.EMPTY;
            } else {
                if (!this.moveItemStackTo(rawStack, 0, 1, false)) {
                    if (index < 29) {
                        if (!this.moveItemStackTo(rawStack, 29, 38, false)) return ItemStack.EMPTY;
                    } else {
                        if (!this.moveItemStackTo(rawStack, 2, 29, false)) return ItemStack.EMPTY;
                    }
                }
            }

            if (rawStack.isEmpty()) slot.set(ItemStack.EMPTY);
            else slot.setChanged();
            slot.onTake(player, rawStack);
        }
        return quickMovedStack;
    }
}
