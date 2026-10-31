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
        add(ModItems.ASTRAL_TITANIUM_INGOT.get(), "ASTRAL_TITANIUM_INGOT");
        add(ModItems.CELESTIAL_TUNGSTEN_INGOT.get(), "CELESTIAL_TUNGSTEN_INGOT");
        add(ModItems.METEORITE_NICKEL_INGOT.get(), "METEORITE_NICKEL_INGOT");


    }
}