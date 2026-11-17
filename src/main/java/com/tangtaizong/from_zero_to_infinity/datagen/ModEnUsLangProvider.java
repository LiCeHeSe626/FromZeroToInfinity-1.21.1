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
        //add(ModItems.TRITANIUM_INGOT.get(), "Tritanium Ingot");
        add(ModItems.ENDIUM_INGOT.get(), "Endium Ingot");
        add(ModItems.TRANSCENDIUM_INGOT.get(), "Transcendium Ingot");
        add(ModItems.STARIUM_INGOT.get(), "Starium Ingot");
        add(ModItems.COMET_SILVER_INGOT.get(), "Comet Silver Ingot");




    }
}