package com.tangtaizong.from_zero_to_infinity.blockentity;

import com.tangtaizong.from_zero_to_infinity.recipe.MillingRecipe;
import com.tangtaizong.from_zero_to_infinity.recipe.MillingRecipeInput;
import com.tangtaizong.from_zero_to_infinity.recipe.ModRecipes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;

public class StoneMillBlockEntity extends BlockEntity {


    public final ItemStackHandler inventory = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private int progress = 0;
    private int maxProgress = 0;

    public StoneMillBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.STONE_MILL.get(), pos, state);
    }

    public void tick() {
        if (level == null || level.isClientSide()) return;

        ItemStack input = inventory.getStackInSlot(0);


        if (input.isEmpty()) {
            resetProgress();
            return;
        }

        MillingRecipeInput recipeInput = new MillingRecipeInput(input);
        var optional = level.getRecipeManager()
                .getRecipeFor(ModRecipes.MILLING_TYPE.get(), recipeInput, level);


        if (optional.isEmpty()) {
            resetProgress();
            return;
        }

        MillingRecipe recipe = optional.get().value();
        int needed = recipe.getProcessingTime();
        ItemStack result = recipe.assemble(recipeInput, level.registryAccess());
        ItemStack output = inventory.getStackInSlot(1);


        boolean canOutput = output.isEmpty()
                || (ItemStack.isSameItemSameComponents(output, result)
                && output.getCount() + result.getCount() <= output.getMaxStackSize());

        if (!canOutput) {
            resetProgress();
            return;
        }


        if (maxProgress != needed) {
            progress = 0;
            maxProgress = needed;
            setChanged();
        }

        progress++;


        if (progress >= maxProgress) {
            inventory.extractItem(0, 1, false);   // 消耗 1 个输入
            inventory.insertItem(1, result, false); // 产出结果
            progress = 0;
            setChanged();
        }
    }

    private void resetProgress() {
        if (progress != 0) {
            progress = 0;
            setChanged();
        }
        maxProgress = 0;
    }


    public int getProgress() { return progress; }
    public int getMaxProgress() { return maxProgress; }


    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
        tag.putInt("progress", progress);
        tag.putInt("maxProgress", maxProgress);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("progress");
        maxProgress = tag.getInt("maxProgress");
    }
}