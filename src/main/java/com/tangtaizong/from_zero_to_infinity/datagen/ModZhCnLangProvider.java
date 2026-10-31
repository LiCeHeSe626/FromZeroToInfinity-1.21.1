package com.tangtaizong.from_zero_to_infinity.datagen;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, FromZeroToInfinityMod.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        //add(ModItems.TRITANIUM_INGOT.get(), "三钛锭");
        add(ModItems.ASTRAL_TITANIUM_INGOT.get(), "星体钛锭");
        add(ModItems.CELESTIAL_TUNGSTEN_INGOT.get(), "天体钨锭");
        add(ModItems.METEORITE_NICKEL_INGOT.get(), "陨星镍锭");




    }
}