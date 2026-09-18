package com.tangtaizong.from_zero_to_infinity;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import com.tangtaizong.from_zero_to_infinity.item.ModItems;


import java.util.function.Supplier;

import static com.tangtaizong.from_zero_to_infinity.item.ModItems.BRONZE_INGOT;

public enum ModToolTiers  implements Tier {
    BRONZE(ModToolMaterials.INCORRECT_FOR_BRONZE_TOOL,180,6.0F,1.5F,8,()->Ingredient.of(ModItems.BRONZE_INGOT.get())),
    TITANIUM(ModToolMaterials.INCORRECT_FOR_TI_W_CO_TOOL,1674,8.5F,4.0F,19,()->Ingredient.of(ModItems.TITANIUM_INGOT.get())),
    ENDITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,2031,9.0F,5.0F,14,()->Ingredient.of(ModItems.ENDITE_INGOT.get())),
    OVERWORLDITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,2014,8.0F,6.0F,17,()->Ingredient.of(ModItems.OVERWORLDITE_INGOT.get())),
    TIME_ALLOY(ModToolMaterials.INCORRECT_FOR_TIME_ALLOY_TOOL,13789,59.0F,9.0F,26,()->Ingredient.of(ModItems.TIME_ALLOY_INGOT.get())),
    STEEL(ModToolMaterials.INCORRECT_FOR_STEEL_TOOL,1145,7.0F,3.5F,15,()->Ingredient.of(ModItems.STEEL_INGOT.get())),
    TUNGSTEN(ModToolMaterials.INCORRECT_FOR_TI_W_CO_TOOL,1713,8.0F,4.0F,17,()->Ingredient.of(ModItems.TUNGSTEN_INGOT.get())),
    COBALT(ModToolMaterials.INCORRECT_FOR_TI_W_CO_TOOL,1653,8.8F,4.2F,20,()->Ingredient.of(ModItems.COBALT_INGOT.get())),
    ;
    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    ModToolTiers(TagKey<Block> incorrectBlocksForDrops, int uses, float speed, float damage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
