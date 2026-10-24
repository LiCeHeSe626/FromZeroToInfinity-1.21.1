package com.tangtaizong.from_zero_to_infinity.recipe;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

import java.util.List;

public class PBFRecipe implements Recipe<PBFRecipeInput> {

    private final List<Ingredient> inputs;
    private final ItemStack solidResult;
    private final int processingTime;
    private final int minTemperature;

    public PBFRecipe(List<Ingredient> inputs, ItemStack solidResult,
                     int processingTime, int minTemperature) {
        this.inputs = inputs;
        this.solidResult = solidResult;
        this.processingTime = processingTime;
        this.minTemperature = minTemperature;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.addAll(inputs);
        return list;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= inputs.size();
    }

    @Override
    public boolean matches(PBFRecipeInput input, Level level) {
        if (input.temperature() < minTemperature) return false;
        for (int i = 0; i < inputs.size(); i++) {
            if (!inputs.get(i).test(input.getItem(i))) return false;
        }
        return true;
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return solidResult;
    }

    @Override
    public ItemStack assemble(PBFRecipeInput input, HolderLookup.Provider registries) {
        return solidResult.copy();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.PBF_TYPE.get();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.PBF_SERIALIZER.get();
    }

    public ItemStack getSolidResult() { return solidResult; }
    public int getProcessingTime() { return processingTime; }
    public int getMinTemperature() { return minTemperature; }
    public List<Ingredient> getInputs() { return inputs; }
}