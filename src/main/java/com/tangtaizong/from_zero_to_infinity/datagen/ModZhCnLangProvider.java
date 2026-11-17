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
        add(ModItems.ENDIUM_INGOT.get(), "终末锭");
        add(ModItems.TRANSCENDIUM_INGOT.get(), "超限锭");
        add(ModItems.STARIUM_INGOT.get(), "星辰锭");
        add(ModItems.COMET_SILVER_INGOT.get(), "彗星银锭");




    }
}