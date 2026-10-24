package com.tangtaizong.from_zero_to_infinity.recipe;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.network.codec.ByteBufCodecs;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;

public class PBFRecipeSerializer implements RecipeSerializer<PBFRecipe> {

    public static final MapCodec<PBFRecipe> CODEC = RecordCodecBuilder.mapCodec(inst -> inst.group(
            Ingredient.CODEC.listOf().fieldOf("inputs").forGetter(PBFRecipe::getInputs),
            ItemStack.CODEC.fieldOf("solid_result").forGetter(PBFRecipe::getSolidResult),
            Codec.INT.optionalFieldOf("processing_time", 200).forGetter(PBFRecipe::getProcessingTime),
            Codec.INT.optionalFieldOf("min_temperature", 0).forGetter(PBFRecipe::getMinTemperature)
    ).apply(inst, PBFRecipe::new));

    public static final StreamCodec<RegistryFriendlyByteBuf, PBFRecipe> STREAM_CODEC =
            StreamCodec.composite(
                    Ingredient.CONTENTS_STREAM_CODEC.apply(ByteBufCodecs.list()), PBFRecipe::getInputs,
                    ItemStack.STREAM_CODEC, PBFRecipe::getSolidResult,
                    ByteBufCodecs.VAR_INT, PBFRecipe::getProcessingTime,
                    ByteBufCodecs.VAR_INT, PBFRecipe::getMinTemperature,
                    PBFRecipe::new
            );

    @Override
    public MapCodec<PBFRecipe> codec() { return CODEC; }

    @Override
    public StreamCodec<RegistryFriendlyByteBuf, PBFRecipe> streamCodec() { return STREAM_CODEC; }
}