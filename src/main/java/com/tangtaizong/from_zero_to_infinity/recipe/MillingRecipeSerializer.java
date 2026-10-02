package com.tangtaizong.from_zero_to_infinity.recipe;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class MillingRecipeSerializer implements RecipeSerializer<MillingRecipe> {

    public static final MapCodec<MillingRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Ingredient.CODEC.fieldOf("ingredient").forGetter(MillingRecipe::getInputItem),
            ItemStack.CODEC.fieldOf("result").forGetter(MillingRecipe::getResult)
    ).apply(inst, MillingRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, MillingRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC, MillingRecipe::getInputItem,
                    ItemStack.STREAM_CODEC, MillingRecipe::getResult,
                    MillingRecipe::new
            );

    @Override
    public MapCodec<MillingRecipe> codec() { return CODEC; }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, MillingRecipe> streamCodec() { return STREAM_CODEC; }
}