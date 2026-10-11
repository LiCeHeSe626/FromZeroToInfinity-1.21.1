package com.tangtaizong.from_zero_to_infinity.block;

import com.mojang.serialization.MapCodec;
import com.tangtaizong.from_zero_to_infinity.blockentity.PBFCoreBlockEntity;
import com.tangtaizong.from_zero_to_infinity.menu.PBFCoreMenu;
import com.tangtaizong.from_zero_to_infinity.structure.PBF;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class PBFCoreBlock extends BaseEntityBlock {

    public PBFCoreBlock(Properties props) { super(props); }
    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return null;
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PBFCoreBlockEntity(pos, state);
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (level.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        // 服务端：检测结构
        if (PBF.isFormed(level, pos)) {
            // 成型：打开 GUI
            if (player instanceof ServerPlayer sp) {
                sp.openMenu(state.getMenuProvider(level, pos));
            }
        } else {
            // 未成型：提示消息
            player.displayClientMessage(
                    Component.translatable("message.from_zero_to_infinity.pbf_not_formed"),
                    true);  // true = 显示在快捷栏上方
        }
        return InteractionResult.CONSUME;
    }

    @Nullable
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        BlockEntity be = level.getBlockEntity(pos);
        if (!(be instanceof PBFCoreBlockEntity core)) return null;
        return new SimpleMenuProvider(
                (containerId, playerInv, player) -> new PBFCoreMenu(
                        containerId, playerInv, core.inventory,
                        ContainerLevelAccess.create(level, pos), core),
                Component.translatable("menu.from_zero_to_infinity.pbf_core"));
    }
}
