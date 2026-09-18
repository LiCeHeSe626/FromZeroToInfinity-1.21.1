package com.tangtaizong.from_zero_to_infinity.item;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.ModToolTiers;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS=
            DeferredRegister.createItems(FromZeroToInfinityMod.MOD_ID);

    public static final DeferredItem<Item> TIN_INGOT=
            ITEMS.register("tin_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ALUMINIUM_INGOT=
            ITEMS.register("aluminium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SILVER_INGOT=
            ITEMS.register("silver_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ZINC_INGOT=
            ITEMS.register("zinc_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COBALT_INGOT=
            ITEMS.register("cobalt_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LEAD_INGOT=
            ITEMS.register("lead_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TITANIUM_INGOT=
            ITEMS.register("titanium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> STEEL_INGOT=
            ITEMS.register("steel_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NEPTUNIUM_INGOT=
            ITEMS.register("neptunium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLUTONIUM_INGOT=
            ITEMS.register("plutonium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RADIUM_INGOT=
            ITEMS.register("radium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> URANIUM_INGOT=
            ITEMS.register("uranium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TUNGSTEN_INGOT=
            ITEMS.register("tungsten_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIME_ALLOY_INGOT=
            ITEMS.register("time_alloy_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SPACE_ALLOY_INGOT=
            ITEMS.register("space_alloy_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> THORIUM_INGOT=
            ITEMS.register("thorium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHARP_STONE=
            ITEMS.register("stoneage/sharp_stone",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NORMAL_STONE=
            ITEMS.register("stoneage/normal_stone",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> OVERWORLDITE_SCRAP=
            ITEMS.register("overworldite_scrap",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ENDITE_SCRAP=
            ITEMS.register("endite_scrap",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BARIUM_INGOT=
            ITEMS.register("barium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BERYLLIUM_INGOT=
            ITEMS.register("beryllium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CALCIUM_INGOT=
            ITEMS.register("calcium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CESIUM_INGOT=
            ITEMS.register("cesium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FRANCIUM_INGOT=
            ITEMS.register("francium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LITHIUM_INGOT=
            ITEMS.register("lithium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGNESIUM_INGOT=
            ITEMS.register("magnesium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> POTASSIUM_INGOT=
            ITEMS.register("potassium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RUBIDIUM_INGOT=
            ITEMS.register("rubidium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>SODIUM_INGOT=
            ITEMS.register("sodium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>OVERWORLDITE_INGOT=
            ITEMS.register("overworldite_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>ENDITE_INGOT=
            ITEMS.register("endite_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>OSMIUM_INGOT=
            ITEMS.register("osmium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>BRONZE_INGOT=
            ITEMS.register("bronze_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>BRASS_INGOT=
            ITEMS.register("brass_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>STRONTIUM_INGOT=
            ITEMS.register("strontium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>PIG_IRON_INGOT=
            ITEMS.register("pig_iron_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>WROUGHT_IRON_INGOT=
            ITEMS.register("wrought_iron_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>IRIDIUM_INGOT=
            ITEMS.register("iridium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>PALLADIUM_INGOT=
            ITEMS.register("palladium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RHODIUM_INGOT=
            ITEMS.register("rhodium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RUTHENIUM_INGOT=
            ITEMS.register("ruthenium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>PLATINUM_INGOT=
            ITEMS.register("platinum_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>HELICOPTER_INGOT=
            ITEMS.register("helicopter_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>HELIUM_INGOT=
            ITEMS.register("helium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>EUROPIUM_INGOT=
            ITEMS.register("europium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>XENON_INGOT=
            ITEMS.register("xeon_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>KRYPTON_INGOT=
            ITEMS.register("krypton_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>NEON_INGOT=
            ITEMS.register("neon_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>ARGON_INGOT=
            ITEMS.register("argon_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RADON_INGOT=
            ITEMS.register("radon_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>OGANESSON_INGOT=
            ITEMS.register("oganesson_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>LICEHESE_INGOT=
            ITEMS.register("licehese_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>CERIUM_INGOT=
            ITEMS.register("cerium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>SELENIUM_INGOT=
            ITEMS.register("selenium_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>CLAY_BRICK=
            ITEMS.register("clay_brick",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>YP_ALLOY_INGOT=
            ITEMS.register("yp_alloy_ingot",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>STEEL_CG_INGOT=
            ITEMS.register("steel_cg_ingot",() -> new Item(new Item.Properties()));





    public static final DeferredItem<Item>TIME_WATCH=
            ITEMS.register("time_watch",() -> new Item(new Item.Properties()));




    public static final DeferredItem<Item>CASSITERITE=
            ITEMS.register("cassiterite",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_COBALT=
            ITEMS.register("raw_cobalt",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_TITANIUM=
            ITEMS.register("raw_titanium",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_TUNGSTEN=
            ITEMS.register("raw_tungsten",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>SCHEELITE=
            ITEMS.register("scheelite",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>WOLFRAMITE=
            ITEMS.register("wolframite",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_SILVER=
            ITEMS.register("raw_silver",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_IRIDIUM=
            ITEMS.register("raw_iridium",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_OSMIUM=
            ITEMS.register("raw_osmium",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_PALLADIUM=
            ITEMS.register("raw_palladium",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_PLATINUM=
            ITEMS.register("raw_platinum",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_RHODIUM=
            ITEMS.register("raw_rhodium",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>RAW_RUTHENIUM=
            ITEMS.register("raw_ruthenium",() -> new Item(new Item.Properties()));









    public static final DeferredItem<Item>STONE_BLOCK=
            ITEMS.register("stoneage/stone_block",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>CLAY_BUCKET=
            ITEMS.register("stoneage/clay_bucket",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>WATER_CLAY_BUCKET=
            ITEMS.register("stoneage/water_clay_bucket",() -> new Item(new Item.Properties()));


    public static final DeferredItem<SmithingTemplateItem> NETHERITE_UPGRADE_SMITHING_TEMPLATE =
            ITEMS.register("template/netherite_upgrade_smithing_template",
                    () -> new SmithingTemplateItem(
                            Component.translatable("item.from_zero_to_infinity.netherite_upgrade_smithing_template.applies_to"),
                            Component.translatable("item.from_zero_to_infinity.netherite_upgrade_smithing_template.ingredients"),
                            Component.translatable("item.from_zero_to_infinity.netherite_upgrade_smithing_template.upgrade"),
                            Component.translatable("item.from_zero_to_infinity.netherite_upgrade_smithing_template.base_slot"),
                            Component.translatable("item.from_zero_to_infinity.netherite_upgrade_smithing_template.additions_slot"),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot")),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))
                    )
            );
    public static final DeferredItem<SmithingTemplateItem> ENDITE_UPGRADE_SMITHING_TEMPLATE =
            ITEMS.register("template/endite_upgrade_smithing_template",
                    () -> new SmithingTemplateItem(
                            Component.translatable("item.from_zero_to_infinity.endite_upgrade_smithing_template.applies_to"),
                            Component.translatable("item.from_zero_to_infinity.endite_upgrade_smithing_template.ingredients"),
                            Component.translatable("item.from_zero_to_infinity.endite_upgrade_smithing_template.upgrade"),
                            Component.translatable("item.from_zero_to_infinity.endite_upgrade_smithing_template.base_slot"),
                            Component.translatable("item.from_zero_to_infinity.endite_upgrade_smithing_template.additions_slot"),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot")),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))
                    )
            );
    public static final DeferredItem<SmithingTemplateItem> OVERWORLDITE_UPGRADE_SMITHING_TEMPLATE =
            ITEMS.register("template/overworldite_upgrade_smithing_template",
                    () -> new SmithingTemplateItem(
                            Component.translatable("item.from_zero_to_infinity.overworldite_upgrade_smithing_template.applies_to"),
                            Component.translatable("item.from_zero_to_infinity.overworldite_upgrade_smithing_template.ingredients"),
                            Component.translatable("item.from_zero_to_infinity.overworldite_upgrade_smithing_template.upgrade"),
                            Component.translatable("item.from_zero_to_infinity.overworldite_upgrade_smithing_template.base_slot"),
                            Component.translatable("item.from_zero_to_infinity.overworldite_upgrade_smithing_template.additions_slot"),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot")),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))
                    )
            );

    public static final DeferredItem<Item>TIME_UPGRADE_SMITHING_TEMPLATE=
            ITEMS.register("template/time_upgrade_smithing_template",
                    () -> new SmithingTemplateItem(Component.translatable("item.from_zero_to_infinity.time_upgrade_smithing_template.applies_to"),
                            Component.translatable("item.from_zero_to_infinity.time_upgrade_smithing_template.ingredients"),
                            Component.translatable("item.from_zero_to_infinity.time_upgrade_smithing_template.upgrade"),
                            Component.translatable("item.from_zero_to_infinity.time_upgrade_smithing_template.base_slot"),
                            Component.translatable("item.from_zero_to_infinity.time_upgrade_smithing_template.additions_slot"),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot")),
                            List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_ingot"))));




    //pickaxe

    public static final DeferredItem<Item>BRONZE_PICKAXE= ITEMS.register("bronze_pickaxe",
                    () -> new PickaxeItem(ModToolTiers.BRONZE,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE,-2.0F,3.0F))));
    public static final DeferredItem<Item>TIME_ALLOY_PICKAXE= ITEMS.register("time_alloy_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TIME_ALLOY,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TIME_ALLOY,-1.0F,13.0F))));
    public static final DeferredItem<Item>STEEL_PICKAXE= ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL,-2.0F,3.0F))));
    public static final DeferredItem<Item>COBALT_PICKAXE= ITEMS.register("cobalt_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COBALT,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.COBALT,-2.0F,3.0F))));
    public static final DeferredItem<Item>ENDITE_PICKAXE= ITEMS.register("endite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ENDITE,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.ENDITE,-2.0F,8.0F))));
    public static final DeferredItem<Item>OVERWORLDITE_PICKAXE= ITEMS.register("overworldite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.OVERWORLDITE,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.OVERWORLDITE,-2.0F,3.0F))));
    public static final DeferredItem<Item>TITANIUM_PICKAXE= ITEMS.register("titanium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TITANIUM,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TITANIUM,-2.0F,3.0F))));
    public static final DeferredItem<Item>TUNGSTEN_PICKAXE= ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TUNGSTEN,new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.TUNGSTEN,-2.0F,3.0F))));


    //sword
    public static final DeferredItem<Item>BRONZE_SWORD= ITEMS.register("bronze_sword",
            () -> new SwordItem(ModToolTiers.BRONZE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE,2.0F,3.0F))));
    public static final DeferredItem<Item>TITANIUM_SWORD= ITEMS.register("titanium_sword",
            () -> new SwordItem(ModToolTiers.TITANIUM,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM,2.0F,3.0F))));
    public static final DeferredItem<Item>ENDITE_SWORD= ITEMS.register("endite_sword",
            () -> new SwordItem(ModToolTiers.ENDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ENDITE,2.0F,4.5F))));
    public static final DeferredItem<Item>TIME_ALLOY_SWORD= ITEMS.register("time_alloy_sword",
            () -> new SwordItem(ModToolTiers.TIME_ALLOY,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIME_ALLOY,4.0F,7.0F))));
    public static final DeferredItem<Item>COBALT_SWORD= ITEMS.register("cobalt_sword",
            () -> new SwordItem(ModToolTiers.COBALT,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT,2.0F,2.7F))));
    public static final DeferredItem<Item>TUNGSTEN_SWORD= ITEMS.register("tungsten_sword",
            () -> new SwordItem(ModToolTiers.TUNGSTEN,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN,2.0F,3.0F))));
    public static final DeferredItem<Item>STEEL_SWORD= ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL,2.0F,3.0F))));
    public static final DeferredItem<Item>OVERWORLDITE_SWORD= ITEMS.register("overworldite_sword",
            () -> new SwordItem(ModToolTiers.OVERWORLDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OVERWORLDITE,2.0F,3.0F))));
    //shovel

    public static final DeferredItem<Item>TIME_ALLOY_SHOVEL= ITEMS.register("time_alloy_shovel",
            () -> new ShovelItem(ModToolTiers.TIME_ALLOY,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIME_ALLOY,4.0F,7.0F))));
    public static final DeferredItem<Item>BRONZE_SHOVEL= ITEMS.register("bronze_shovel",
            () -> new ShovelItem(ModToolTiers.BRONZE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE,-1.0F,3.0F))));
    public static final DeferredItem<Item>STEEL_SHOVEL= ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL,-1.0F,3.0F))));
    public static final DeferredItem<Item>COBALT_SHOVEL= ITEMS.register("cobalt_shovel",
            () -> new ShovelItem(ModToolTiers.COBALT,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT,-1.0F,3.0F))));
    public static final DeferredItem<Item>TITANIUM_SHOVEL= ITEMS.register("titanium_shovel",
            () -> new ShovelItem(ModToolTiers.TITANIUM,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM,-1.0F,3.0F))));
    public static final DeferredItem<Item>TUNGSTEN_SHOVEL= ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(ModToolTiers.TUNGSTEN,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN,-1.0F,3.0F))));
    public static final DeferredItem<Item>ENDITE_SHOVEL= ITEMS.register("endite_shovel",
            () -> new ShovelItem(ModToolTiers.ENDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ENDITE,-1.0F,3.0F))));
    public static final DeferredItem<Item>OVERWORLDITE_SHOVEL= ITEMS.register("overworldite_shovel",
            () -> new ShovelItem(ModToolTiers.OVERWORLDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OVERWORLDITE,-1.0F,3.0F))));



    //hoe
    public static final DeferredItem<Item>TIME_ALLOY_HOE= ITEMS.register("time_alloy_hoe",
            () -> new HoeItem(ModToolTiers.TIME_ALLOY,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIME_ALLOY,4.0F,7.0F))));
    public static final DeferredItem<Item>BRONZE_HOE= ITEMS.register("bronze_hoe",
            () -> new HoeItem(ModToolTiers.BRONZE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE,-1.0F,3.0F))));
    public static final DeferredItem<Item>STEEL_HOE= ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL,-1.0F,3.0F))));
    public static final DeferredItem<Item>COBALT_HOE= ITEMS.register("cobalt_hoe",
            () -> new HoeItem(ModToolTiers.COBALT,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT,-1.0F,3.0F))));
    public static final DeferredItem<Item>TITANIUM_HOE= ITEMS.register("titanium_hoe",
            () -> new HoeItem(ModToolTiers.TITANIUM,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM,-1.0F,3.0F))));
    public static final DeferredItem<Item>TUNGSTEN_HOE= ITEMS.register("tungsten_hoe",
            () -> new HoeItem(ModToolTiers.TUNGSTEN,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN,-1.0F,3.0F))));
    public static final DeferredItem<Item>ENDITE_HOE= ITEMS.register("endite_hoe",
            () -> new HoeItem(ModToolTiers.ENDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ENDITE,-1.0F,3.0F))));
    public static final DeferredItem<Item>OVERWORLDITE_HOE= ITEMS.register("overworldite_hoe",
            () -> new HoeItem(ModToolTiers.OVERWORLDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OVERWORLDITE,-1.0F,3.0F))));



    //axe
    public static final DeferredItem<Item>TIME_ALLOY_AXE= ITEMS.register("time_alloy_axe",
            () -> new AxeItem(ModToolTiers.TIME_ALLOY,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TIME_ALLOY,8.0F,6.0F))));
    public static final DeferredItem<Item>ENDITE_AXE= ITEMS.register("endite_axe",
            () -> new AxeItem(ModToolTiers.ENDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ENDITE,6.0F,5.0F))));
    public static final DeferredItem<Item>BRONZE_AXE= ITEMS.register("bronze_axe",
            () -> new AxeItem(ModToolTiers.BRONZE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE,6.0F,2.0F))));
    public static final DeferredItem<Item>STEEL_AXE= ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STEEL,6.0F,2.0F))));
    public static final DeferredItem<Item>COBALT_AXE= ITEMS.register("cobalt_axe",
            () -> new AxeItem(ModToolTiers.COBALT,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.COBALT,6.0F,2.0F))));
    public static final DeferredItem<Item>TITANIUM_AXE= ITEMS.register("titanium_axe",
            () -> new AxeItem(ModToolTiers.TITANIUM,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TITANIUM,6.0F,2.0F))));
    public static final DeferredItem<Item>TUNGSTEN_AXE= ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModToolTiers.TUNGSTEN,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.TUNGSTEN,6.0F,2.0F))));
    public static final DeferredItem<Item>OVERWORLDITE_AXE= ITEMS.register("overworldite_axe",
            () -> new AxeItem(ModToolTiers.OVERWORLDITE,new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.OVERWORLDITE,6.0F,2.0F))));


    //armor
    //public static final DeferredItem<Item>TIME_ALLOY_HELMET=ITEMS.register("time_alloy_helmet",
           // ()->new ArmorItem(ModArmorMaterials.TIME_ALLOY,ArmorItem.Type.HELMET,
                   // new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(67))));
    //public static final DeferredItem<Item>TIME_ALLOY_CHESTPLATE=ITEMS.register("time_alloy_chestplate",
           // ()->new ArmorItem(ModArmorMaterials.TIME_ALLOY,ArmorItem.Type.CHESTPLATE,
                   // new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(67))));
    //public static final DeferredItem<Item>TIME_ALLOY_LEGGINGS=ITEMS.register("time_alloy_leggings",
           // ()->new ArmorItem(ModArmorMaterials.TIME_ALLOY,ArmorItem.Type.LEGGINGS,
                  //  new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(67))));
    //public static final DeferredItem<Item>TIME_ALLOY_BOOTS=ITEMS.register("time_alloy_boots",
           // ()->new ArmorItem(ModArmorMaterials.TIME_ALLOY,ArmorItem.Type.BOOTS,
                   // new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(67))));

    public static final DeferredItem<Item>TIME_ALLOY_AXE_COARSE_GRAIN=
            ITEMS.register("time_alloy_axe_coarse_grain",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>TIME_ALLOY_HOE_COARSE_GRAIN=
            ITEMS.register("time_alloy_hoe_coarse_grain",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>TIME_ALLOY_PICKAXE_COARSE_GRAIN=
            ITEMS.register("time_alloy_pickaxe_coarse_grain",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>TIME_ALLOY_SWORD_COARSE_GRAIN=
            ITEMS.register("time_alloy_sword_coarse_grain",() -> new Item(new Item.Properties()));
    public static final DeferredItem<Item>TIME_ALLOY_SHOVEL_COARSE_GRAIN=
            ITEMS.register("time_alloy_shovel_coarse_grain",() -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
    }
}
