package com.tangtaizong.from_zero_to_infinity.structure;

import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import com.tangtaizong.from_zero_to_infinity.block.PbfBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;

public class PBF {
    private final static BlockPattern pattern = BlockPatternBuilder.start()
            .aisle("ABA", "CVC", "ADA")
            .aisle("AEA", "EVE", "AEA")
            .aisle("AAA", "AVA", "AAA")
            .aisle("AAA", "AFA", "AAA")
            .where('A', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_BRICKS.get())))
            .where('B', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_CORE.get())))
            .where('C', BlockInWorld.hasState(state ->
                    state.is(ModBlocks.PBF_AIR_INLET.get())
                            && isFacingNorthOrSouth(state)))
            .where('D', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_DISCHARGE_OUTLET.get())))
            .where('E', BlockInWorld.hasState(state ->
                    state.is(ModBlocks.PBF_DISCHARGE_OUTLET.get())
                            && isFacingNorthOrSouth(state)))
            .where('F', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_AIR_OUTLET.get())))
            .where('V', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.AIR)))
            .build();
    private final static BlockPattern patternEW = BlockPatternBuilder.start()
            .aisle("ABA", "CVC", "ADA")
            .aisle("AEA", "EVE", "AEA")
            .aisle("AAA", "AVA", "AAA")
            .aisle("AAA", "AFA", "AAA")
            .where('A', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_BRICKS.get())))
            .where('B', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_CORE.get())))
            .where('C', BlockInWorld.hasState(state ->
                    state.is(ModBlocks.PBF_AIR_INLET.get())
                            && isFacingEastOrWest(state)))
            .where('D', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_DISCHARGE_OUTLET.get())))
            .where('E', BlockInWorld.hasState(state ->
                    state.is(ModBlocks.PBF_DISCHARGE_OUTLET.get())
                            && isFacingEastOrWest(state)))
            .where('F', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.PBF_AIR_OUTLET.get())))
            .where('V', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.AIR)))
            .build();
    public static BlockPattern.BlockPatternMatch findStructure(Level level, BlockPos corePos) {
        BlockPattern.BlockPatternMatch match = pattern.find(level, corePos);
        if (match != null) return match;
        return patternEW.find(level, corePos);
    }

    public static boolean isFormed(Level level, BlockPos corePos) {
        return findStructure(level, corePos) != null;
    }
    private static boolean isFacingNorthOrSouth(net.minecraft.world.level.block.state.BlockState state) {
        if (!state.hasProperty(PbfBlocks.FACING)) return false;
        Direction facing = state.getValue(PbfBlocks.FACING);
        return facing == Direction.NORTH || facing == Direction.SOUTH;
    }
    private static boolean isFacingEastOrWest(net.minecraft.world.level.block.state.BlockState state) {
        if (!state.hasProperty(PbfBlocks.FACING)) return false;
        Direction facing = state.getValue(PbfBlocks.FACING);
        return facing == Direction.EAST || facing == Direction.WEST;
    }
}

