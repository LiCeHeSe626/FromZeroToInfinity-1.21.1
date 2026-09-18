package com.tangtaizong.from_zero_to_infinity;

import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.level.BlockDropsEvent;
import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@EventBusSubscriber(modid = "from_zero_to_infinity")
public class ModEvents {

    private static int getTierLevel(net.minecraft.world.item.Tier tier) {
        float speed = tier.getSpeed();
        if (tier == Tiers.WOOD) return 1;
        if (tier == Tiers.STONE||tier==Tiers.IRON) return 2;
        if (tier == Tiers.DIAMOND||tier==ModToolTiers.BRONZE ) return 3;
        if (tier == ModToolTiers.STEEL) return 4;
        if (tier == ModToolTiers.COBALT||tier == ModToolTiers.TUNGSTEN||tier == ModToolTiers.TITANIUM) return 5;
        if (tier == Tiers.NETHERITE||tier == ModToolTiers.ENDITE||tier == ModToolTiers.OVERWORLDITE) return 6;
        if (tier == ModToolTiers.TIME_ALLOY)return 7;
        if (speed>=0.0F&&speed<=2.0F) return 1;
        if (speed>=2.0F&&speed<=4.0F) return 2;
        if (speed>=4.0F&&speed<=6.0F) return 3;
        if (speed>=6.0F&&speed<=7.0F) return 4;
        if (speed>=7.0F&&speed<=8.0F) return 5;
        if (speed>=8.0F&&speed<=9.0F) return 6;
        if (speed>=9.0F) return 7;
        return 0;
    }
    //这个方法会减缓挖掘速度
    @SubscribeEvent
    public static void onBreakSpeed(PlayerEvent.BreakSpeed event) {
        BlockState state = event.getState();
        Player player = event.getEntity();

        int required = getRequiredTier(state);
        if (required <= 0) return;

        int actual = getToolTierLevel(player.getMainHandItem());
        if (actual < required) {

            event.setNewSpeed(event.getOriginalSpeed() * 0.01f);
        }
    }
    //这个方法会取消破坏
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        Player player = event.getPlayer();
        BlockState state = event.getState();

        int required = getRequiredTier(state);
        if (required <= 0) return;

        int actual = getToolTierLevel(player.getMainHandItem());
        if (actual < required) {
            event.setCanceled(true);
            player.displayClientMessage(
                    getRequiredMessage(state),
                    true);
        }
    }

    //这个方法会取消掉落
    @SubscribeEvent
    public static void onBlockDrops(BlockDropsEvent event) {
        BlockState state = event.getState();

        int required = getRequiredTier(state);
        if (required <= 0) return;

        Entity breaker = event.getBreaker();
        int actual = 0;
        if (breaker instanceof Player player) {
            actual = getToolTierLevel(player.getMainHandItem());
        }

        if (actual < required) {
            event.getDrops().clear();
            event.setDroppedExperience(0);
        }
    }




    private static int getRequiredTier(BlockState state) {
        Block block = state.getBlock();





        if (block == Blocks.DIAMOND_ORE
                || block == Blocks.DEEPSLATE_DIAMOND_ORE
                || block == Blocks.DIAMOND_BLOCK) return 4;


        if (block == Blocks.ANCIENT_DEBRIS) return 5;


        if (block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_IRON_ORE
                || block == Blocks.IRON_BLOCK || block == Blocks.STONE
                || block == Blocks.END_STONE || block == Blocks.DEEPSLATE
                || block == Blocks.DIORITE || block == Blocks.GRANITE
                || block == Blocks.TUFF
                || block == Blocks.DEEPSLATE_GOLD_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE
                || block == Blocks.DEEPSLATE_REDSTONE_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE
                || block == Blocks.REDSTONE_ORE || block == Blocks.LAPIS_ORE
                || block == Blocks.EMERALD_ORE || block == Blocks.GOLD_ORE
                || block == Blocks.REDSTONE_BLOCK || block == Blocks.GOLD_BLOCK
                || block == Blocks.LAPIS_BLOCK || block == Blocks.EMERALD_BLOCK
                || block == Blocks.COBBLESTONE || block == Blocks.COBBLED_DEEPSLATE
        ) return 3;


        if (block == Blocks.COPPER_ORE || block == Blocks.DEEPSLATE_COPPER_ORE||state.is(BlockTags.LOGS)) return 2;

        return 0;
    }


    private static Component getRequiredMessage(BlockState state) {
        Block block = state.getBlock();

        if (state.is(BlockTags.LOGS)) {
            return Component.translatable("message.from_zero_to_infinity.need_stone_tool");
        }
        if (block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE
                || block == Blocks.DIAMOND_BLOCK) {
            return Component.translatable("message.from_zero_to_infinity.need_steel_tool");
        }
        if (block == Blocks.ANCIENT_DEBRIS) {
            return Component.translatable("message.from_zero_to_infinity.need_cobalt_tool");
        }
        if (block == Blocks.COPPER_ORE || block == Blocks.DEEPSLATE_COPPER_ORE) {
            return Component.translatable("message.from_zero_to_infinity.need_stone_tool");
        }
        return Component.translatable("message.from_zero_to_infinity.need_bronze_tool");
    }


    private static int getToolTierLevel(ItemStack tool) {
        if (tool.isEmpty()) return 0;
        if (tool.getItem() instanceof TieredItem tieredItem) {
            return getTierLevel(tieredItem.getTier());
        }
        return 0;
    }
}