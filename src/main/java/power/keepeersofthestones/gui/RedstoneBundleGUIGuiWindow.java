
package power.keepeersofthestones.gui;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RedstoneBundleGUIGuiWindow extends ContainerScreen<RedstoneBundleGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = RedstoneBundleGUIGui.guistate;

	public RedstoneBundleGUIGuiWindow(RedstoneBundleGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 300;
		this.ySize = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/redstone_bundle_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Select the mechanism to add", 77, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 24, 135, 20, new StringTextComponent("Piston"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(0, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 51, 135, 20, new StringTextComponent("Piston extension"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(1, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 78, 135, 20, new StringTextComponent("Observer "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(2, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 105, 135, 20, new StringTextComponent("Redstone Block"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(3, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 132, 77, 20, new StringTextComponent("Comparator"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(4, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 14, this.guiTop + 159, 93, 20, new StringTextComponent("Redstone Lamp"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(5, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 104, this.guiTop + 132, 72, 20, new StringTextComponent("Repeater "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(6, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 113, this.guiTop + 159, 51, 20, new StringTextComponent("Lever"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(7, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 167, this.guiTop + 159, 98, 20, new StringTextComponent("Redstone Torch"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(8, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 185, this.guiTop + 132, 56, 20, new StringTextComponent("Hopper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(9, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 158, this.guiTop + 105, 61, 20, new StringTextComponent("Dropper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(10, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 158, this.guiTop + 78, 72, 20, new StringTextComponent("Dispenser"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new RedstoneBundleGUIGui.ButtonPressedMessage(11, x, y, z));
				RedstoneBundleGUIGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
	}
}
