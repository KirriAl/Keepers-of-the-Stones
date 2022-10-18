
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.RedstoneBundleGUIMenu;
import power.keepeersofthestones.network.RedstoneBundleGUIButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class RedstoneBundleGUIScreen extends AbstractContainerScreen<RedstoneBundleGUIMenu> {
	private final static HashMap<String, Object> guistate = RedstoneBundleGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public RedstoneBundleGUIScreen(RedstoneBundleGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 300;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/redstone_bundle_gui.png");

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
		this.font.draw(poseStack, "Select the mechanism to add", 77, 6, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 24, 135, 20, Component.literal("Piston"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(0, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 51, 135, 20, Component.literal("Piston extension"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(1, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 78, 135, 20, Component.literal("Observer "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(2, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 105, 135, 20, Component.literal("Redstone Block"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(3, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 132, 77, 20, Component.literal("Comparator"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(4, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 14, this.topPos + 159, 93, 20, Component.literal("Redstone Lamp"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(5, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 104, this.topPos + 132, 72, 20, Component.literal("Repeater "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(6, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 113, this.topPos + 159, 51, 20, Component.literal("Lever"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(7, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 167, this.topPos + 159, 98, 20, Component.literal("Redstone Torch"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(8, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 185, this.topPos + 132, 56, 20, Component.literal("Hopper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(9, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 105, 61, 20, Component.literal("Dropper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(10, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 158, this.topPos + 78, 72, 20, Component.literal("Dispenser"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIButtonMessage(11, x, y, z));
				RedstoneBundleGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
	}
}
