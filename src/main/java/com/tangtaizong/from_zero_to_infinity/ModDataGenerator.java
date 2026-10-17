package com.tangtaizong.from_zero_to_infinity;

import com.tangtaizong.from_zero_to_infinity.block.ModBlocks;
import com.tangtaizong.from_zero_to_infinity.datagen.ModEnUsLangProvider;
import com.tangtaizong.from_zero_to_infinity.datagen.ModItemModelsProvider;
import com.tangtaizong.from_zero_to_infinity.datagen.ModZhCnLangProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid=FromZeroToInfinityMod.MOD_ID)
public class ModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput=generator.getPackOutput();
        ExistingFileHelper existingFileHelper=event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lockupProvider=event.getLookupProvider();
        generator.addProvider(event.includeClient(), new ModItemModelsProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModZhCnLangProvider(packOutput));
        generator.addProvider(event.includeClient(), new ModEnUsLangProvider(packOutput));
    }
}