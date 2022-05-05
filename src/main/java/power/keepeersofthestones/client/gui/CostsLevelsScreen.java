
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.CostsLevelsMenu;
import power.keepeersofthestones.network.CostsLevelsButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class CostsLevelsScreen extends AbstractContainerScreen<CostsLevelsMenu> {
	private final static HashMap<String, Object> guistate = CostsLevelsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CostsLevelsScreen(CostsLevelsMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 315;
		this.imageHeight = 233;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/costs_levels.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
		this.blit(ms, this.leftPos + 31, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
		this.blit(ms, this.leftPos + 130, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
		this.blit(ms, this.leftPos + 220, this.topPos + 49, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Level 1", 25, 31, -12829636);
		this.font.draw(poseStack, "Cost levels", 130, 5, -12829636);
		this.font.draw(poseStack, "Level 2", 121, 31, -12829636);
		this.font.draw(poseStack, "Level 3", 220, 31, -12829636);
		this.font.draw(poseStack, "0", 49, 52, -12829636);
		this.font.draw(poseStack, "4", 148, 52, -12829636);
		this.font.draw(poseStack, "16", 237, 52, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 101, this.topPos + 76, 103, 20, new TextComponent("Back to Upgrade"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CostsLevelsButtonMessage(0, x, y, z));
				CostsLevelsButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
