package com.tangtaizong.from_zero_to_infinity.blockentity;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, FromZeroToInfinityMod.MOD_ID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<StoneMillBlockEntity>> STONE_MILL =
            BLOCK_ENTITIES.register("stone_mill",
                    () -> BlockEntityType.Builder.of(StoneMillBlockEntity::new,
                            ModBlocks.STONE_MILL.get()).build(null));
}