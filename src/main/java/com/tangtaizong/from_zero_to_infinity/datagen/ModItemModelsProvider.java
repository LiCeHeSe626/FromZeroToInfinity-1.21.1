package com.tangtaizong.from_zero_to_infinity.datagen;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output,  ExistingFileHelper existingFileHelper) {
        super(output, FromZeroToInfinityMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.ADAMANTIUM_INGOT.get());
        basicItem(ModItems.ENRICHED_NAQUADAH_INGOT.get());
        basicItem(ModItems.EUPHEMIUM_INGOT.get());
        basicItem(ModItems.GHIORSIUM_INGOT.get());
        basicItem(ModItems.MITHRIL_INGOT.get());
        basicItem(ModItems.NAQUADAH_INGOT.get());
        basicItem(ModItems.NAQUADRIA_INGOT.get());
        basicItem(ModItems.QUANTANIUM_INGOT.get());
        basicItem(ModItems.SCHRABIDIUM_INGOT.get());
        basicItem(ModItems.TRINIUM_INGOT.get());
        basicItem(ModItems.TRITANIUM_INGOT.get());
        basicItem(ModItems.VIBRANIUM_INGOT.get());
        basicItem(ModItems.DOURANIUM_INGOT.get());
    }
}