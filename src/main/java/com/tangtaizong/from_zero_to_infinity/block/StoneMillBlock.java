package com.tangtaizong.from_zero_to_infinity.block;

import com.mojang.serialization.MapCodec;
import com.tangtaizong.from_zero_to_infinity.blockentity.ModBlockEntities;
import com.tangtaizong.from_zero_to_infinity.blockentity.StoneMillBlockEntity;
import com.tangtaizong.from_zero_to_infinity.menu.StoneMillMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class StoneMillBlock extends BaseEntityBlock{

    public StoneMillBlock(Properties props) { super(props); }
    private static final VoxelShape SHAPE = Block.box(0.0, 0.0, 0.0, 16.0, 10.0, 16.0);
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return null;
    }
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new StoneMillBlockEntity(pos, state);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof StoneMillBlockEntity mill)) return null;
        return new SimpleMenuProvider(
                (containerId, playerInv, player) -> new StoneMillMenu(
                        containerId, playerInv, mill.inventory,
                        ContainerLevelAccess.create(level, pos)),
                Component.translatable("menu.from_zero_to_infinity.stone_mill"));
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (!level.isClientSide && player instanceof net.minecraft.server.level.ServerPlayer sp) {
            sp.openMenu(state.getMenuProvider(level, pos));
        }
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
                                                                  BlockEntityType<T> type) {
        return level.isClientSide ? null
                : createTickerHelper(type, ModBlockEntities.STONE_MILL.get(),
                (lvl, pos, st, be) -> be.tick());
    }
}