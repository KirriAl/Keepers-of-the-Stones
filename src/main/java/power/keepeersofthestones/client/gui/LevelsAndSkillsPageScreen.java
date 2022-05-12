
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.LevelsAndSkillsPageMenu;
import power.keepeersofthestones.procedures.ReturnLevel3Procedure;
import power.keepeersofthestones.procedures.ReturnLevel2Procedure;
import power.keepeersofthestones.procedures.ReturnLevel1Procedure;
import power.keepeersofthestones.procedures.NonWaterPowerProcedure;
import power.keepeersofthestones.network.LevelsAndSkillsPageButtonMessage;
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

public class LevelsAndSkillsPageScreen extends AbstractContainerScreen<LevelsAndSkillsPageMenu> {
	private final static HashMap<String, Object> guistate = LevelsAndSkillsPageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public LevelsAndSkillsPageScreen(LevelsAndSkillsPageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/book_of_elements_book.png"));
		this.blit(ms, this.leftPos + -156, this.topPos + -44, 0, 0, 512, 256, 512, 256);

		if (ReturnLevel1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + -25, this.topPos + 13, 0, 0, 16, 16, 16, 16);
		}
		if (ReturnLevel2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + -25, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (NonWaterPowerProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + 174, this.topPos + -12, 0, 0, 16, 16, 16, 16);
		}
		if (ReturnLevel2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 24, this.topPos + 13, 0, 0, 19, 18, 19, 18);
		}
		if (ReturnLevel3Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 24, this.topPos + 38, 0, 0, 19, 18, 19, 18);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
		this.blit(ms, this.leftPos + 224, this.topPos + -12, 0, 0, 19, 18, 19, 18);

		if (ReturnLevel1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.leftPos + 24, this.topPos + -12, 0, 0, 19, 18, 19, 18);
		}
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
		this.font.draw(poseStack, "Levels", -25, -27, -13421773);
		this.font.draw(poseStack, "Level 2", -75, 18, -13421773);
		this.font.draw(poseStack, "Level 3", -75, 43, -13421773);
		this.font.draw(poseStack, "Skills", 165, -23, -13421773);
		this.font.draw(poseStack, "Aqua Power", 114, -7, -13421773);
		this.font.draw(poseStack, "Level 1", -75, -7, -13421773);
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
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 13, 61, 20, new TextComponent("4"), e -> {
			if (ReturnLevel1Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(0, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 0, this.topPos + 38, 61, 20, new TextComponent("16"), e -> {
			if (ReturnLevel2Procedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(1, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 199, this.topPos + -12, 61, 20, new TextComponent("12"), e -> {
			if (NonWaterPowerProcedure.execute(entity)) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(2, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (NonWaterPowerProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + -83, this.topPos + 169, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(3, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
