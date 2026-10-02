package com.tangtaizong.from_zero_to_infinity.recipe;


import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class MillingRecipe implements Recipe<MillingRecipeInput> {

    private final Ingredient inputItem;
    private final ItemStack result;
    private final int processingTime;

    public MillingRecipe(Ingredient inputItem, ItemStack result,int processingTime) {
        this.inputItem = inputItem;
        this.result = result;
        this.processingTime = processingTime;
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        NonNullList<Ingredient> list = NonNullList.create();
        list.add(this.inputItem);
        return list;
    }

    @Override
    public boolean canCraftInDimensions(int width, int height) {
        return width * height >= 1;
    }

    @Override
    public boolean matches(MillingRecipeInput input, Level level) {
        return this.inputItem.test(input.stack());
    }

    @Override
    public ItemStack getResultItem(HolderLookup.Provider registries) {
        return this.result;
    }

    @Override
    public ItemStack assemble(MillingRecipeInput input, HolderLookup.Provider registries) {
        return this.result.copy();
    }

    @Override
    public RecipeType<?> getType() {
        return ModRecipes.MILLING_TYPE.get();
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return ModRecipes.MILLING_SERIALIZER.get();
    }


    public Ingredient getInputItem() { return inputItem; }
    public ItemStack getResult() { return result; }
    public int getProcessingTime() { return processingTime; }
}