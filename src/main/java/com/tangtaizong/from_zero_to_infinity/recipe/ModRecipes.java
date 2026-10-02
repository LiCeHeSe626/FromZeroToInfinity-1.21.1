package com.tangtaizong.from_zero_to_infinity.recipe;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModRecipes {

    public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES =
            DeferredRegister.create(Registries.RECIPE_TYPE, FromZeroToInfinityMod.MOD_ID);
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS =
            DeferredRegister.create(Registries.RECIPE_SERIALIZER, FromZeroToInfinityMod.MOD_ID);

    public static final DeferredHolder<RecipeType<?>, RecipeType<MillingRecipe>> MILLING_TYPE =
            RECIPE_TYPES.register("milling",
                    () -> RecipeType.<MillingRecipe>simple(
                            ResourceLocation.fromNamespaceAndPath(FromZeroToInfinityMod.MOD_ID, "milling")));

    public static final DeferredHolder<RecipeSerializer<?>, RecipeSerializer<MillingRecipe>> MILLING_SERIALIZER =
            RECIPE_SERIALIZERS.register("milling", MillingRecipeSerializer::new);
}