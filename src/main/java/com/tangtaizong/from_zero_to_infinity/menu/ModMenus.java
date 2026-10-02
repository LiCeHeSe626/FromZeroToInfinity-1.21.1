package com.tangtaizong.from_zero_to_infinity.menu;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, FromZeroToInfinityMod.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<StoneMillMenu>> STONE_MILL =
            MENUS.register("stone_mill",
                    () -> new MenuType<>(StoneMillMenu::new, net.minecraft.world.flag.FeatureFlags.DEFAULT_FLAGS));
}