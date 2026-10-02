package com.tangtaizong.from_zero_to_infinity.event;


import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.UseItemOnBlockEvent;

@EventBusSubscriber(modid = FromZeroToInfinityMod.MOD_ID)
public class StoneMill {
    @SubscribeEvent
    public static void onUseItemOnBlock(UseItemOnBlockEvent event) {

        if (event.getUsePhase() != UseItemOnBlockEvent.UsePhase.BLOCK) return;

        var context = event.getUseOnContext();
        var player = context.getPlayer();
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        ItemStack stack = player.getItemInHand(context.getHand());


        if (!stack.is(ModItems.STONE_BLOCK.get())) return;
        if (!state.is(Blocks.STONE)) return;
        if (level.isClientSide()) {
            event.cancelWithResult(net.minecraft.world.ItemInteractionResult.sidedSuccess(true));
            return;
        }
        level.setBlockAndUpdate(pos, ModBlocks.STONE_MILL.get().defaultBlockState());
        stack.shrink(1);
        level.playSound(null, pos, SoundEvents.STONE_PLACE, SoundSource.BLOCKS, 1.0f, 1.0f);
        event.cancelWithResult(net.minecraft.world.ItemInteractionResult.sidedSuccess(false));
    }
}
