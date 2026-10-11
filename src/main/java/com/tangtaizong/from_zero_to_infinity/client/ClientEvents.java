package com.tangtaizong.from_zero_to_infinity.client;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.menu.ModMenus;
import com.tangtaizong.from_zero_to_infinity.screen.StoneMillScreen;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import com.tangtaizong.from_zero_to_infinity.screen.PBFCoreScreen;

@EventBusSubscriber(modid = FromZeroToInfinityMod.MOD_ID, value = Dist.CLIENT)
public class ClientEvents {

    @SubscribeEvent
    public static void registerScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenus.STONE_MILL.get(), StoneMillScreen::new);
        event.register(ModMenus.PBF_CORE.get(), PBFCoreScreen::new);
    }
}