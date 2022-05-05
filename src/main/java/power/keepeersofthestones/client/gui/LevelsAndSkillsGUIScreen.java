
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.LevelsAndSkillsGUIMenu;
import power.keepeersofthestones.procedures.ReturnLevel3Procedure;
import power.keepeersofthestones.procedures.ReturnLevel2Procedure;
import power.keepeersofthestones.procedures.ReturnLevel1Procedure;
import power.keepeersofthestones.network.LevelsAndSkillsGUIButtonMessage;
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

public class LevelsAndSkillsGUIScreen extends AbstractContainerScreen<LevelsAndSkillsGUIMenu> {
	private final static HashMap<String, Object> guistate = LevelsAndSkillsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LevelsAndSkillsGUIScreen(LevelsAndSkillsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 315;
		this.imageHeight = 233;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/levels_and_skills_gui.png");

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
		this.font.draw(poseStack, "Level 1", 31, 31, -12829636);
		this.font.draw(poseStack, "Levels & Skills", 112, 4, -12829636);
		this.font.draw(poseStack, "Level 2", 121, 31, -12829636);
		this.font.draw(poseStack, "Level 3", 211, 31, -12829636);
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
			if (ReturnLevel1Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsGUIButtonMessage(0, x, y, z));
				LevelsAndSkillsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 202, this.topPos + 49, 61, 20, new TextComponent("Upgrade"), e -> {
			if (ReturnLevel2Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsGUIButtonMessage(1, x, y, z));
				LevelsAndSkillsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 274, this.topPos + 4, 30, 20, new TextComponent("?"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsGUIButtonMessage(2, x, y, z));
				LevelsAndSkillsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 211, this.topPos + 4, 56, 20, new TextComponent("Skills"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel3Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
	}
}
