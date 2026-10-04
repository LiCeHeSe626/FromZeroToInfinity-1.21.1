package com.tangtaizong.from_zero_to_infinity.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;

public class PbfBlocks extends Block implements IFacingBlock
{
    public PbfBlocks(Properties properties)
    {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        addFacing(builder);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return facingPlacement(this.defaultBlockState(), context);
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return facingRotate(state, rotation);
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return facingMirror(state, mirror);
    }
}
