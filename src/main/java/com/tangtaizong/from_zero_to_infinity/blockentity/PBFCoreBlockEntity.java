package com.tangtaizong.from_zero_to_infinity.blockentity;

import com.tangtaizong.from_zero_to_infinity.recipe.ModRecipes;
import com.tangtaizong.from_zero_to_infinity.recipe.PBFRecipeInput;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.items.ItemStackHandler;

import java.util.HashMap;
import java.util.Map;

public class PBFCoreBlockEntity extends BlockEntity {

    public static final int INPUT_START = 0;
    public static final int INPUT_COUNT = 6;
    public static final int FUEL_SLOT = 6;
    public static final int SOLID_OUTPUT = 7;
    public static final int TOTAL_SLOTS = 8;

    public record FuelData(int burnTime, int maxTemperature) {}

    private static final Map<net.minecraft.world.item.Item, FuelData> FUEL_DATA = new HashMap<>();

    static {
        FUEL_DATA.put(Items.COAL,         new FuelData(1600, 800));
        FUEL_DATA.put(Items.CHARCOAL,     new FuelData(1600, 800));
        FUEL_DATA.put(Items.COAL_BLOCK,   new FuelData(16000, 900));
        FUEL_DATA.put(Items.BLAZE_POWDER, new FuelData(1200, 1000));
        FUEL_DATA.put(Items.BLAZE_ROD,    new FuelData(2400, 1000));
        FUEL_DATA.put(Items.LAVA_BUCKET,  new FuelData(20000, 1300));
    }

    public static FuelData getFuelData(ItemStack stack) {
        return FUEL_DATA.get(stack.getItem());
    }

    public final ItemStackHandler inventory = new ItemStackHandler(TOTAL_SLOTS) {
        @Override
        protected void onContentsChanged(int slot) {
            setChanged();
        }
    };

    private int progress = 0;
    private int maxProgress = 0;
    private int burnTime = 0;
    private int burnDuration = 0;
    private int temperature = 0;
    private int currentMaxTemp = 0;

    public PBFCoreBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.PBF_CORE.get(), pos, state);
    }

    public void tick() {
        if (level == null || level.isClientSide()) return;

        // 1. 消耗燃料
        if (burnTime <= 0) {
            ItemStack fuel = inventory.getStackInSlot(FUEL_SLOT);
            FuelData data = getFuelData(fuel);
            if (data != null) {
                burnTime = data.burnTime();
                burnDuration = data.burnTime();
                currentMaxTemp = data.maxTemperature();
                fuel.shrink(1);
                setChanged();
            } else {
                currentMaxTemp = 0;
            }
        }
        if (burnTime > 0) {
            burnTime--;
        }

        // 2. 温度逻辑
        if (burnTime > 0 && currentMaxTemp > 0) {
            if (temperature < currentMaxTemp) {
                temperature = Math.min(currentMaxTemp, temperature + 2);
            }
        } else {
            if (temperature > 0) {
                temperature = Math.max(0, temperature - 1);
            }
        }

        // 3. 配方匹配
        ItemStack[] inputs = new ItemStack[INPUT_COUNT];
        for (int i = 0; i < INPUT_COUNT; i++) {
            inputs[i] = inventory.getStackInSlot(INPUT_START + i);
        }

        PBFRecipeInput recipeInput = new PBFRecipeInput(inputs, temperature);
        var optional = level.getRecipeManager()
                .getRecipeFor(ModRecipes.PBF_TYPE.get(), recipeInput, level);

        if (optional.isEmpty()) {
            resetProgress();
            return;
        }

        var recipe = optional.get().value();
        int needed = recipe.getProcessingTime();
        ItemStack solidResult = recipe.getSolidResult();

        if (!canOutput(SOLID_OUTPUT, solidResult)) {
            resetProgress();
            return;
        }

        if (maxProgress != needed) {
            progress = 0;
            maxProgress = needed;
            setChanged();
        }

        progress++;

        if (progress >= maxProgress) {
            for (int i = 0; i < INPUT_COUNT; i++) {
                inventory.extractItem(INPUT_START + i, 1, false);
            }
            insertOrGrow(SOLID_OUTPUT, solidResult);
            progress = 0;
            setChanged();
        }
    }

    private boolean canOutput(int slot, ItemStack result) {
        if (result.isEmpty()) return true;
        ItemStack out = inventory.getStackInSlot(slot);
        return out.isEmpty()
                || (ItemStack.isSameItemSameComponents(out, result)
                && out.getCount() + result.getCount() <= out.getMaxStackSize());
    }

    private void insertOrGrow(int slot, ItemStack result) {
        if (result.isEmpty()) return;
        ItemStack out = inventory.getStackInSlot(slot);
        if (out.isEmpty()) {
            inventory.insertItem(slot, result.copy(), false);
        } else {
            out.grow(result.getCount());
        }
    }

    private void resetProgress() {
        if (progress != 0) {
            progress = 0;
            setChanged();
        }
        maxProgress = 0;
    }

    public int getProgress() { return progress; }
    public int getMaxProgress() { return maxProgress; }
    public int getBurnTime() { return burnTime; }
    public int getBurnDuration() { return burnDuration; }
    public int getTemperature() { return temperature; }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.put("inventory", inventory.serializeNBT(registries));
        tag.putInt("progress", progress);
        tag.putInt("maxProgress", maxProgress);
        tag.putInt("burnTime", burnTime);
        tag.putInt("burnDuration", burnDuration);
        tag.putInt("temperature", temperature);
        tag.putInt("currentMaxTemp", currentMaxTemp);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        inventory.deserializeNBT(registries, tag.getCompound("inventory"));
        progress = tag.getInt("progress");
        maxProgress = tag.getInt("maxProgress");
        burnTime = tag.getInt("burnTime");
        burnDuration = tag.getInt("burnDuration");
        temperature = tag.getInt("temperature");
        currentMaxTemp = tag.getInt("currentMaxTemp");
    }
}