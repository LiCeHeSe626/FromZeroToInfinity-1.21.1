package com.tangtaizong.from_zero_to_infinity;

import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.ItemTooltipEvent;

@EventBusSubscriber(modid = "from_zero_to_infinity", value = Dist.CLIENT)
public class TooltipEventHandler {
    @SubscribeEvent
    public static void onItemTooltip(ItemTooltipEvent event) {
        ItemStack stack = event.getItemStack();
        if (stack.getItem() == ModItems.ENDITE_SCRAP.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.endite_scrap.desc"));
        }
        if (stack.getItem() == ModItems.OVERWORLDITE_SCRAP.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.overworldite_scrap.desc"));
        }
        if (stack.getItem() == ModItems.HELIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.helium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.LITHIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.lithium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.BERYLLIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.beryllium.desc"));
        }
        if (stack.getItem() == ModItems.NEON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.neon_ingot.desc"));
        }
        if (stack.getItem() == ModItems.SODIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.sodium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.MAGNESIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.magnesium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.ALUMINIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.aluminium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.ARGON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.argon_ingot.desc"));
        }
        if (stack.getItem() == ModItems.POTASSIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.potassium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.CALCIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.calcium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.TITANIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.titanium_ingot.desc"));
        }

        if (stack.getItem() == Items.IRON_INGOT) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.iron_ingot.desc"));
        }
        if (stack.getItem() == ModItems.COBALT_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.cobalt_ingot.desc"));
        }
        if (stack.getItem() == Items.COPPER_INGOT) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.copper_ingot.desc"));
        }
        if (stack.getItem() == ModItems.ZINC_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.zinc_ingot.desc"));
        }

        if (stack.getItem() == ModItems.KRYPTON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.krypton_ingot.desc"));
        }

        if (stack.getItem() == ModItems.RUBIDIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.rubidium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.STRONTIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.strontium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.RUTHENIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.ruthenium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.RHODIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.rhodium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.PALLADIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.palladium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.SILVER_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.silver_ingot.desc"));
        }
        if (stack.getItem() == ModItems.TIN_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.tin_ingot.desc"));
        }

        if (stack.getItem() == ModItems.XENON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.xenon_ingot.desc"));
        }

        if (stack.getItem() == ModItems.CESIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.cesium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.BARIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.barium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.CERIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.cerium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.EUROPIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.europium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.TUNGSTEN_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.tungsten_ingot.desc"));
        }

        if (stack.getItem() == ModItems.OSMIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.osmium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.IRIDIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.iridium_ingot.desc"));
        }

        if (stack.getItem() == ModItems.PLATINUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.platinum_ingot.desc"));
        }
        if (stack.getItem() == Items.GOLD_INGOT) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.gold_ingot.desc"));
        }
        if (stack.getItem() == ModItems.LEAD_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.lead_ingot.desc"));
        }

        if (stack.getItem() == ModItems.RADON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.radon_ingot.desc"));
        }

        if (stack.getItem() == ModItems.FRANCIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.francium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.RADIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.radium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.THORIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.thorium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.URANIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.uranium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.NEPTUNIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.neptunium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.PLUTONIUM_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.plutonium_ingot.desc"));
        }
        if (stack.getItem() == ModItems.OGANESSON_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.oganesson_ingot.desc"));
        }














        if (stack.getItem() == ModItems.TIME_ALLOY_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.time_alloy_ingot.desc"));
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.time_alloy_ingot.desc1"));
        }
        if (stack.getItem() == ModItems.SPACE_ALLOY_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.space_alloy_ingot.desc"));
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.space_alloy_ingot.desc1"));
        }
        if (stack.getItem() == ModItems.YP_ALLOY_INGOT.get()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.yp_alloy_ingot.desc"));
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.yp_alloy_ingot.desc1"));
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.yp_alloy_ingot.desc2"));
        }
        if (stack.getItem() == ModBlocks.FUTURE_DEBRIS.get().asItem()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.future_debris.desc"));
        }
        if (stack.getItem() == ModBlocks.MODERN_DEBRIS.get().asItem()) {
            event.getToolTip().add(Component.translatable("tooltip.from_zero_to_infinity.modern_debris.desc"));
        }

    }
}
