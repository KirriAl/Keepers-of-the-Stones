
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.LevelsAndSkillsPageMenu;
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
		this.imageWidth = 512;
		this.imageHeight = 512;
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
		this.blit(ms, this.leftPos + 11, this.topPos + 129, 0, 0, 512, 256, 512, 256);

		if (ReturnLevel1Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + 144, this.topPos + 170, 0, 0, 16, 16, 16, 16);
		}
		if (ReturnLevel2Procedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + 144, this.topPos + 201, 0, 0, 16, 16, 16, 16);
		}
		if (NonWaterPowerProcedure.execute(entity)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.leftPos + 353, this.topPos + 170, 0, 0, 16, 16, 16, 16);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
		this.blit(ms, this.leftPos + 183, this.topPos + 168, 0, 0, 19, 18, 19, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
		this.blit(ms, this.leftPos + 183, this.topPos + 197, 0, 0, 19, 18, 19, 18);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/level_checked.png"));
		this.blit(ms, this.leftPos + 393, this.topPos + 168, 0, 0, 19, 18, 19, 18);

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
		this.font.draw(poseStack, "Levels", 140, 148, -13421773);
		this.font.draw(poseStack, "Level 2", 94, 174, -13421773);
		this.font.draw(poseStack, "Level 3", 94, 201, -13421773);
		this.font.draw(poseStack, "Skills", 333, 150, -13421773);
		this.font.draw(poseStack, "Aqua Power", 290, 173, -13421773);
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
		this.addRenderableWidget(new Button(this.leftPos + 162, this.topPos + 168, 61, 20, new TextComponent("4"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 162, this.topPos + 196, 61, 20, new TextComponent("16"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 371, this.topPos + 168, 61, 20, new TextComponent("12"), e -> {
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (NonWaterPowerProcedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addRenderableWidget(new Button(this.leftPos + 84, this.topPos + 342, 30, 20, new TextComponent("<"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageButtonMessage(3, x, y, z));
				LevelsAndSkillsPageButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
