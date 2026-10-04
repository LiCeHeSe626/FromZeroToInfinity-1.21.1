package com.tangtaizong.from_zero_to_infinity.block;

import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;

public interface IFacingBlock {

    DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    default void addFacing(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    default BlockState facingPlacement(BlockState defaultState, BlockPlaceContext context) {
        return defaultState.setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    default BlockState facingRotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    default BlockState facingMirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }
}