package com.tangtaizong.from_zero_to_infinity.fluid;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(BuiltInRegistries.FLUID, FromZeroToInfinityMod.MOD_ID);
    public static  void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
