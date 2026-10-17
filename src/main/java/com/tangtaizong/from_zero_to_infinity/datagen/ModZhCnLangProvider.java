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
        add(ModItems.TRITANIUM_INGOT.get(), "三钛锭");
        add(ModItems.ADAMANTIUM_INGOT.get(), "精金锭");
        add(ModItems.ENRICHED_NAQUADAH_INGOT.get(), "富集硅岩锭");
        add(ModItems.EUPHEMIUM_INGOT.get(), "Ep锭");
        add(ModItems.GHIORSIUM_INGOT.get(), "Gh锭");
        add(ModItems.MITHRIL_INGOT.get(), "秘银锭");
        add(ModItems.NAQUADRIA_INGOT.get(), "超能硅岩锭");
        add(ModItems.NAQUADAH_INGOT.get(), "硅岩锭");
        add(ModItems.QUANTANIUM_INGOT.get(), "量子锭");
        add(ModItems.SCHRABIDIUM_INGOT.get(), "Sa锭");
        add(ModItems.TRINIUM_INGOT.get(), "Ke锭");
        add(ModItems.VIBRANIUM_INGOT.get(), "振金锭");
        add(ModItems.DOURANIUM_INGOT.get(), "双铀锭");

    }
}