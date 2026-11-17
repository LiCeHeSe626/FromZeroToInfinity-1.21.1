package com.tangtaizong.from_zero_to_infinity.fluid;

import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import java.util.Properties;

public abstract class SewageFluid extends BaseFlowingFluid {
    public SewageFluid(Properties properties) {
        super(properties);
    }
    public static class Source extends SewageFluid {

        public Source(Properties properties) {
            super(properties);
        }

        @Override
        public boolean isSource(FluidState fluidState) {
            return true;
        }

        @Override
        public int getAmount(FluidState fluidState) {
            return 8;
        }
    }
    public static class Flowing extends SewageFluid {
        public Flowing(Properties properties) {
            super(properties);
        }

        @Override
        public boolean isSource(FluidState state) {
            return false;
        }

        @Override
        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }
        @Override
        protected  void createFluidStateDefinition(StateDefinition.Builder<Fluid,FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }
    }
}
