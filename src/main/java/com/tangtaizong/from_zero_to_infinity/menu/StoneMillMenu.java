package com.tangtaizong.from_zero_to_infinity.menu;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.ItemStackHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class StoneMillMenu extends AbstractContainerMenu {

    private final ContainerLevelAccess access;


    public StoneMillMenu(int containerId, Inventory playerInv) {
        this(containerId, playerInv, new ItemStackHandler(2), ContainerLevelAccess.NULL);
    }

    public StoneMillMenu(int containerId, Inventory playerInv, IItemHandler dataInventory,
                         ContainerLevelAccess access) {
        super(ModMenus.STONE_MILL.get(), containerId);
        this.access = access;


        this.addSlot(new SlotItemHandler(dataInventory, 0, 56, 35));

        this.addSlot(new SlotItemHandler(dataInventory, 1, 116, 35) {
            @Override public boolean mayPlace(ItemStack stack) { return false; }
        });


        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 9; col++)
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 8 + col * 18, 84 + row * 18));


        for (int col = 0; col < 9; col++)
            this.addSlot(new Slot(playerInv, col, 8 + col * 18, 142));
    }

    @Override
    public boolean stillValid(Player player) {
        return AbstractContainerMenu.stillValid(this.access, player,
                com.tangtaizong.from_zero_to_infinity.block.ModBlocks.STONE_MILL.get());
    }

    // 槽位分布：0=输入, 1=输出, 2-28=背包, 29-37=快捷栏
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack quickMovedStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem()) {
            ItemStack rawStack = slot.getItem();
            quickMovedStack = rawStack.copy();

            if (index == 1) {
                // 输出槽 → 玩家背包
                if (!this.moveItemStackTo(rawStack, 2, 38, true)) return ItemStack.EMPTY;
                slot.onQuickCraft(rawStack, quickMovedStack);
            } else if (index == 0) {
                // 输入槽 → 玩家背包
                if (!this.moveItemStackTo(rawStack, 2, 38, true)) return ItemStack.EMPTY;
            } else {
                // 玩家背包 → 输入槽
                if (!this.moveItemStackTo(rawStack, 0, 1, false)) {
                    if (index < 29) {
                        // 背包 → 快捷栏
                        if (!this.moveItemStackTo(rawStack, 29, 38, false)) return ItemStack.EMPTY;
                    } else {
                        // 快捷栏 → 背包
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