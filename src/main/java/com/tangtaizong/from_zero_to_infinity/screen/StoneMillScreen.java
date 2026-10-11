package com.tangtaizong.from_zero_to_infinity.screen;

import com.tangtaizong.from_zero_to_infinity.FromZeroToInfinityMod;
import com.tangtaizong.from_zero_to_infinity.menu.StoneMillMenu;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class StoneMillScreen extends AbstractContainerScreen<StoneMillMenu> {

    private static final ResourceLocation BACKGROUND = ResourceLocation.fromNamespaceAndPath(
            FromZeroToInfinityMod.MOD_ID, "textures/gui/container/stone_mill.png");
    private static final int TEXTURE_WIDTH = 256;
    private static final int TEXTURE_HEIGHT = 256;


    public StoneMillScreen(StoneMillMenu menu, Inventory playerInv, Component title) {
        super(menu, playerInv, title);
        // 背景 PNG 尺寸
        this.imageWidth = 176;//宽
        this.imageHeight = 166;//高
        this.titleLabelX = 8;//标题X
        this.titleLabelY = 6;//标题Y
        this.inventoryLabelX = 8;//物品栏
        this.inventoryLabelY = 72;//
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTick, int mouseX, int mouseY) {
        graphics.blit(BACKGROUND, this.leftPos, this.topPos, 0, 0,
                this.imageWidth, this.imageHeight, TEXTURE_WIDTH, TEXTURE_HEIGHT);
        int progress = this.menu.getProgress();
        int max = this.menu.getMaxProgress();


        if (max > 0) {
            int width = (int) ((float) progress / max *24);

            graphics.fill(this.leftPos + 82, this.topPos + 41,
                    this.leftPos + 82 +width, this.topPos + 41 + 3,
                    0xFFffffff);
        }

    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(graphics,mouseX, mouseY, partialTick);
        super.render(graphics, mouseX, mouseY, partialTick);
        this.renderTooltip(graphics, mouseX, mouseY);
    }
}