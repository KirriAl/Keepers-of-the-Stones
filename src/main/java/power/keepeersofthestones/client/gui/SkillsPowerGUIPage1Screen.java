
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SkillsPowerGUIPage1Menu;
import power.keepeersofthestones.procedures.ReturnLevel3Procedure;
import power.keepeersofthestones.procedures.ReturnLevel2Procedure;
import power.keepeersofthestones.procedures.ReturnLevel1Procedure;
import power.keepeersofthestones.procedures.NonWaterPowerProcedure;
import power.keepeersofthestones.network.SkillsPowerGUIPage1ButtonMessage;
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

public class SkillsPowerGUIPage1Screen extends AbstractContainerScreen<SkillsPowerGUIPage1Menu> {
	private final static HashMap<String, Object> guistate = SkillsPowerGUIPage1Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillsPowerGUIPage1Screen(SkillsPowerGUIPage1Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 315;
		this.imageHeight = 233;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/skills_power_gui_page_1.png");

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
		if (ReturnLevel1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 40, this.topPos + 49, 0, 0, 19, 18, 19, 18);
		}
		if (ReturnLevel2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 130, this.topPos + 49, 0, 0, 19, 18, 19, 18);
		}
		if (ReturnLevel3Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 220, this.topPos + 49, 0, 0, 19, 18, 19, 18);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
		this.blit(ms, this.leftPos + 121, this.topPos + 85, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/water_power_skill.png"));
		this.blit(ms, this.leftPos + 40, this.topPos + 31, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Skills", 112, 4, -12829636);
		this.font.draw(poseStack, "1/1", 13, 4, -12829636);
		this.font.draw(poseStack, "Soon", 130, 31, -12829636);
		this.font.draw(poseStack, "Soon", 220, 31, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 112, this.topPos + 49, 61, 20, new TextComponent("Upgrade"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 202, this.topPos + 49, 61, 20, new TextComponent("Upgrade"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 274, this.topPos + 4, 30, 20, new TextComponent("?"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SkillsPowerGUIPage1ButtonMessage(2, x, y, z));
				SkillsPowerGUIPage1ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 211, this.topPos + 4, 56, 20, new TextComponent("Levels"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SkillsPowerGUIPage1ButtonMessage(3, x, y, z));
				SkillsPowerGUIPage1ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 22, this.topPos + 49, 61, 20, new TextComponent("Upgrade"), e -> {
			if (NonWaterPowerProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new SkillsPowerGUIPage1ButtonMessage(4, x, y, z));
				SkillsPowerGUIPage1ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (NonWaterPowerProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 256, this.topPos + 202, 46, 20, new TextComponent("NEXT"), e -> {
		}));
	}
}
