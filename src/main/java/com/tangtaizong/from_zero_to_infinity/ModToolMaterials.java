package com.tangtaizong.from_zero_to_infinity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModToolMaterials {
    public static final TagKey<Block> INCORRECT_FOR_TIME_ALLOY_TOOL =
            TagKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath("from_zero_to_infinity", "incorrect_for_time_alloy_tool")
            );
    public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL =
            TagKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath("from_zero_to_infinity", "incorrect_for_bronze_tool")
            );
    public static final TagKey<Block> INCORRECT_FOR_STEEL_TOOL =
            TagKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath("from_zero_to_infinity", "incorrect_for_steel_tool")
            );
    public static final TagKey<Block> INCORRECT_FOR_TI_W_CO_TOOL =
            TagKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath("from_zero_to_infinity", "incorrect_for_ti_w_co_tool")
            );
}
