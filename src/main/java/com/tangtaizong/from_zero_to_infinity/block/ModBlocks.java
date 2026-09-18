package com.tangtaizong.from_zero_to_infinity.block;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS=
            DeferredRegister.createBlocks(FromZeroToInfinityMod.MOD_ID);

    public static final DeferredBlock<Block> TIN_BLOCK=
            register("tin_block",()->new Block(BlockBehaviour.Properties.of().strength(2.0F,30.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CASSITERITE_ORE=
            register("cassiterite_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.0F,12.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_CASSITERITE_ORE=
            register("deepslate_cassiterite_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> DEEPSLATE_COBALT_ORE=
            register("deepslate_cobalt_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NETHER_SCHEELITE_ORE=
            register("nether_scheelite_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> NETHER_WOLFRAMITE_ORE=
            register("nether_wolframite_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_TITANIUM_ORE=
            register("end_titanium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_IRIDIUM_ORE=
            register("end_iridium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_OSMIUM_ORE=
            register("end_osmium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_PALLADIUM_ORE=
            register("end_palladium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_PLATINUM_ORE=
            register("end_platinum_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_RHODIUM_ORE=
            register("end_rhodium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_RUTHENIUM_ORE=
            register("end_ruthenium_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> END_SILVER_ORE=
            register("end_silver_ore",()->new Block(BlockBehaviour.Properties.of().strength(1.2F,15.0F)
                    .requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> MODERN_DEBRIS=
            register("modern_debris",()->new Block(BlockBehaviour.Properties.of().strength(30.0F,1200.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FUTURE_DEBRIS=
            register("future_debris",()->new Block(BlockBehaviour.Properties.of().strength(30.0F,1200.0F)
                    .requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> STONE_PILE=
            register("stone_pile",()->new StonePileBlock(BlockBehaviour.Properties.of().strength(0.5F,1.0F).noOcclusion()
            ));


    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, ()->new BlockItem(block.get(),new Item.Properties()));
    }

    private static <T extends Block> DeferredBlock<T> register(String name, Supplier<T> block) {
        DeferredBlock<T> blocks=BLOCKS.register(name, block);
        registerBlockItems(name, blocks);
        return blocks;
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
