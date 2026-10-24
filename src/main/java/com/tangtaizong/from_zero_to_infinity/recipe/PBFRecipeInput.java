package com.tangtaizong.from_zero_to_infinity.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeInput;

public record PBFRecipeInput(ItemStack[] inputs, int temperature) implements RecipeInput {

    @Override
    public ItemStack getItem(int slot) {
        if (slot < 0 || slot >= inputs.length) {
            throw new IllegalArgumentException("No item for index " + slot);
        }
        return inputs[slot];
    }

    @Override
    public int size() {
        return inputs.length;
    }
}