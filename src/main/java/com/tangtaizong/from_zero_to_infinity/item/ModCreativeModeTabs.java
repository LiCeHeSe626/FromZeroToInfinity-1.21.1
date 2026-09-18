package com.tangtaizong.from_zero_to_infinity.item;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FromZeroToInfinityMod.MOD_ID);
    public  static final Supplier<CreativeModeTab>FZTI_MATERIAL=
            CREATIVE_MOD_TABS.register("fzti_material",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.TIME_ALLOY_INGOT.get()))
                    .title(Component.translatable("itemGroup.fzti_material"))
                    .displayItems((parameters,output)->{
                        output.accept(ModItems.HELIUM_INGOT);//2
                        output.accept(ModItems.LITHIUM_INGOT);//3
                        output.accept(ModItems.BERYLLIUM_INGOT);//4
                        output.accept(ModItems.NEON_INGOT);//10
                        output.accept(ModItems.SODIUM_INGOT);//11
                        output.accept(ModItems.MAGNESIUM_INGOT);//12
                        output.accept(ModItems.ALUMINIUM_INGOT);//13
                        output.accept(ModItems.ARGON_INGOT);//18
                        output.accept(ModItems.POTASSIUM_INGOT);//19
                        output.accept(ModItems.CALCIUM_INGOT);//20
                        output.accept(ModItems.TITANIUM_INGOT);//22
                        output.accept(Items.IRON_INGOT);//26=iron
                        output.accept(ModItems.COBALT_INGOT);//27
                        output.accept(Items.COPPER_INGOT);//29=copper
                        output.accept(ModItems.ZINC_INGOT);//30
                        output.accept(ModItems.SELENIUM_INGOT);//34
                        output.accept(ModItems.KRYPTON_INGOT);//36
                        output.accept(ModItems.RUBIDIUM_INGOT);//37
                        output.accept(ModItems.STRONTIUM_INGOT);//38
                        output.accept(ModItems.RUTHENIUM_INGOT);//44
                        output.accept(ModItems.RHODIUM_INGOT);//45
                        output.accept(ModItems.PALLADIUM_INGOT);//46
                        output.accept(ModItems.SILVER_INGOT);//47
                        output.accept(ModItems.TIN_INGOT);//50
                        output.accept(ModItems.XENON_INGOT);//56
                        output.accept(ModItems.CESIUM_INGOT);//55
                        output.accept(ModItems.BARIUM_INGOT);//56
                        output.accept(ModItems.CERIUM_INGOT);//58
                        output.accept(ModItems.EUROPIUM_INGOT);//63
                        output.accept(ModItems.TUNGSTEN_INGOT);//75
                        output.accept(ModItems.OSMIUM_INGOT);//76
                        output.accept(ModItems.IRIDIUM_INGOT);//77
                        output.accept(ModItems.PLATINUM_INGOT);//78
                        output.accept(Items.GOLD_INGOT);//79=gold
                        output.accept(ModItems.LEAD_INGOT);//82
                        output.accept(ModItems.RADON_INGOT);//86
                        output.accept(ModItems.FRANCIUM_INGOT);//87
                        output.accept(ModItems.RADIUM_INGOT);//88
                        output.accept(ModItems.THORIUM_INGOT);//90
                        output.accept(ModItems.URANIUM_INGOT);//92
                        output.accept(ModItems.NEPTUNIUM_INGOT);//93
                        output.accept(ModItems.PLUTONIUM_INGOT);//94
                        output.accept(ModItems.OGANESSON_INGOT);//118
                        //alloys
                        output.accept(ModItems.BRASS_INGOT);
                        output.accept(ModItems.BRONZE_INGOT);//coppers
                        output.accept(ModItems.STEEL_CG_INGOT);
                        output.accept(ModItems.PIG_IRON_INGOT);
                        output.accept(ModItems.WROUGHT_IRON_INGOT);
                        output.accept(ModItems.STEEL_INGOT);//irons
                        output.accept(ModItems.HELICOPTER_INGOT);
                        output.accept(ModItems.LICEHESE_INGOT);//???
                        output.accept(ModItems.SPACE_ALLOY_INGOT);
                        output.accept(ModItems.TIME_ALLOY_INGOT);
                        output.accept(ModItems.YP_ALLOY_INGOT);
                        output.accept(ModItems.ENDITE_SCRAP);
                        output.accept(ModItems.OVERWORLDITE_SCRAP);
                        output.accept(ModItems.OVERWORLDITE_INGOT);
                        output.accept(ModItems.ENDITE_INGOT);//!!!

                        output.accept(ModItems.CLAY_BRICK);//clay




                    }).build());
    public  static final Supplier<CreativeModeTab>FZTI_STONE_AGE=
            CREATIVE_MOD_TABS.register("fzti_stone_age",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.SHARP_STONE.get()))
                    .title(Component.translatable("itemGroup.fzti_stone_age"))
                    .displayItems((parameters,output)->{
                        output.accept(ModItems.SHARP_STONE);
                        output.accept(ModItems.NORMAL_STONE);
                        output.accept(ModItems.STONE_BLOCK);
                        output.accept(ModItems.CLAY_BUCKET);
                        output.accept(ModItems.WATER_CLAY_BUCKET);
                        output.accept(ModBlocks.STONE_PILE);

                    }).build());
    public  static final Supplier<CreativeModeTab>FZTI_ORES=
            CREATIVE_MOD_TABS.register("fzti_ores",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModBlocks.MODERN_DEBRIS.get()))
                    .title(Component.translatable("itemGroup.fzti_ores"))
                    .displayItems((parameters,output)->{
                        output.accept(ModBlocks.MODERN_DEBRIS);
                        output.accept(ModBlocks.FUTURE_DEBRIS);
                        output.accept(ModBlocks.CASSITERITE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_CASSITERITE_ORE);
                        output.accept(ModBlocks.DEEPSLATE_COBALT_ORE);
                        output.accept(ModBlocks.NETHER_WOLFRAMITE_ORE);
                        output.accept(ModBlocks.NETHER_SCHEELITE_ORE);
                        output.accept(ModBlocks.END_TITANIUM_ORE);
                        output.accept(ModBlocks.END_IRIDIUM_ORE);
                        output.accept(ModBlocks.END_OSMIUM_ORE);
                        output.accept(ModBlocks.END_RHODIUM_ORE);
                        output.accept(ModBlocks.END_RUTHENIUM_ORE);
                        output.accept(ModBlocks.END_PALLADIUM_ORE);
                        output.accept(ModBlocks.END_PLATINUM_ORE);
                        output.accept(ModBlocks.END_SILVER_ORE);
                        output.accept(ModItems.CASSITERITE);
                        output.accept(ModItems.RAW_COBALT);
                        output.accept(ModItems.RAW_TITANIUM);
                        output.accept(ModItems.RAW_TUNGSTEN);
                        output.accept(ModItems.SCHEELITE);
                        output.accept(ModItems.RAW_IRIDIUM);
                        output.accept(ModItems.RAW_OSMIUM);
                        output.accept(ModItems.RAW_PALLADIUM);
                        output.accept(ModItems.RAW_PLATINUM);
                        output.accept(ModItems.RAW_RUTHENIUM);
                        output.accept(ModItems.RAW_RHODIUM);
                        output.accept(ModItems.RAW_SILVER);
                        output.accept(ModItems.WOLFRAMITE);
                    }).build());
    public  static final Supplier<CreativeModeTab>FZTI_TOOLS=
            CREATIVE_MOD_TABS.register("fzti_tools",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.BRONZE_PICKAXE.get()))
                    .title(Component.translatable("itemGroup.fzti_tools"))
                    .displayItems((parameters,output)->{
                        output.accept(ModItems.BRONZE_PICKAXE);
                        output.accept(ModItems.BRONZE_SWORD);
                        output.accept(ModItems.BRONZE_AXE);
                        output.accept(ModItems.BRONZE_SHOVEL);
                        output.accept(ModItems.BRONZE_HOE);
                        output.accept(ModItems.STEEL_PICKAXE);
                        output.accept(ModItems.STEEL_SWORD);
                        output.accept(ModItems.STEEL_AXE);
                        output.accept(ModItems.STEEL_SHOVEL);
                        output.accept(ModItems.STEEL_HOE);
                        output.accept(ModItems.COBALT_PICKAXE);
                        output.accept(ModItems.COBALT_SWORD);
                        output.accept(ModItems.COBALT_AXE);
                        output.accept(ModItems.COBALT_SHOVEL);
                        output.accept(ModItems.COBALT_HOE);
                        output.accept(ModItems.TUNGSTEN_PICKAXE);
                        output.accept(ModItems.TUNGSTEN_SWORD);
                        output.accept(ModItems.TUNGSTEN_AXE);
                        output.accept(ModItems.TUNGSTEN_SHOVEL);
                        output.accept(ModItems.TUNGSTEN_HOE);
                        output.accept(ModItems.TITANIUM_PICKAXE);
                        output.accept(ModItems.TITANIUM_SWORD);
                        output.accept(ModItems.TITANIUM_AXE);
                        output.accept(ModItems.TITANIUM_SHOVEL);
                        output.accept(ModItems.TITANIUM_HOE);
                        output.accept(ModItems.OVERWORLDITE_PICKAXE);
                        output.accept(ModItems.OVERWORLDITE_SWORD);
                        output.accept(ModItems.OVERWORLDITE_AXE);
                        output.accept(ModItems.OVERWORLDITE_SHOVEL);
                        output.accept(ModItems.OVERWORLDITE_HOE);
                        output.accept(ModItems.ENDITE_PICKAXE);
                        output.accept(ModItems.ENDITE_SWORD);
                        output.accept(ModItems.ENDITE_AXE);
                        output.accept(ModItems.ENDITE_SHOVEL);
                        output.accept(ModItems.ENDITE_HOE);
                        output.accept(ModItems.TIME_ALLOY_PICKAXE);
                        output.accept(ModItems.TIME_ALLOY_SWORD);
                        output.accept(ModItems.TIME_ALLOY_AXE);
                        output.accept(ModItems.TIME_ALLOY_SHOVEL);
                        output.accept(ModItems.TIME_ALLOY_HOE);



                        output.accept(ModItems.TIME_WATCH);



                       // output.accept(ModItems.TIME_ALLOY_LEGGINGS);
                        //output.accept(ModItems.TIME_ALLOY_BOOTS);
                       // output.accept(ModItems.TIME_ALLOY_CHESTPLATE);
                        //output.accept(ModItems.TIME_ALLOY_HELMET);
                    }).build());
    public  static final Supplier<CreativeModeTab>FZTI_TEMPLATES=
            CREATIVE_MOD_TABS.register("fzti_templates",()->CreativeModeTab.builder()
                    .icon(()->new ItemStack(ModItems.TIME_UPGRADE_SMITHING_TEMPLATE.get()))
                    .title(Component.translatable("itemGroup.fzti_templates"))
                    .displayItems((parameters,output)->{
                        output.accept(ModItems.NETHERITE_UPGRADE_SMITHING_TEMPLATE);
                        output.accept(ModItems.ENDITE_UPGRADE_SMITHING_TEMPLATE);
                        output.accept(ModItems.OVERWORLDITE_UPGRADE_SMITHING_TEMPLATE);
                        output.accept(ModItems.TIME_UPGRADE_SMITHING_TEMPLATE);

                    }).build());
    public  static  void  register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
