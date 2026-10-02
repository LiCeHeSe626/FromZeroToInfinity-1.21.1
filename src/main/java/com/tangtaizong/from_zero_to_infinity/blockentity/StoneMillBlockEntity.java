package com.tangtaizong.from_zero_to_infinity.blockentity;


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

    // 0 号槽 = 输入，1 号槽 = 输出
    public final ItemStackHandler inventory = new ItemStackHandler(2) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    public StoneMillBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.STONE_MILL.get(), pos, state);
    }

    public void tick() {
        if (level == null || level.isClientSide()) return;

        ItemStack input = inventory.getStackInSlot(0);
        if (input.isEmpty()) return;

        MillingRecipeInput recipeInput = new MillingRecipeInput(input);
        var optional = level.getRecipeManager()
                .getRecipeFor(ModRecipes.MILLING_TYPE.get(), recipeInput, level);

        optional.ifPresent(holder -> {
            ItemStack result = holder.value().assemble(recipeInput, level.registryAccess());
            ItemStack output = inventory.getStackInSlot(1);
            // 输出槽为空或可堆叠
            if (output.isEmpty()) {
                inventory.extractItem(0, 1, false);
                inventory.insertItem(1, result, false);
            } else if (ItemStack.isSameItemSameComponents(output, result)
                    && output.getCount() + result.getCount() <= output.getMaxStackSize()) {
                inventory.extractItem(0, 1, false);
                inventory.insertItem(1, result, false);
            }
        });
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
    }
}