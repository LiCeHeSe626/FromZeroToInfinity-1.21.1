package com.tangtaizong.from_zero_to_infinity.datagen;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, FromZeroToInfinityMod.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.TRITANIUM_INGOT.get(), "Tritanium Ingot");
        add(ModItems.ADAMANTIUM_INGOT.get(), "Adamantium Ingot");
        add(ModItems.ENRICHED_NAQUADAH_INGOT.get(), "Enriched Naquadah Ingot");
        add(ModItems.EUPHEMIUM_INGOT.get(), "Euphemium Ingot");
        add(ModItems.GHIORSIUM_INGOT.get(), "Ghiorsium Ingot");
        add(ModItems.MITHRIL_INGOT.get(), "Mithril Ingot");
        add(ModItems.NAQUADRIA_INGOT.get(), "Naquadria Ingot");
        add(ModItems.NAQUADAH_INGOT.get(), "Naquadah Ingot");
        add(ModItems.QUANTANIUM_INGOT.get(), "Quantanium Ingot");
        add(ModItems.SCHRABIDIUM_INGOT.get(), "Schrabidium Ingot");
        add(ModItems.TRINIUM_INGOT.get(), "Trinium Ingot");
        add(ModItems.VIBRANIUM_INGOT.get(), "Vibranium Ingot");
        add(ModItems.DOURANIUM_INGOT.get(), "Douranium Ingot");

    }
}