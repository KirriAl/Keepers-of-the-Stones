
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
public class BuildingGUIGuiWindow extends ContainerScreen<BuildingGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BuildingGUIGui.guistate;

	public BuildingGUIGuiWindow(BuildingGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 255;
		this.ySize = 211;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/building_gui.png");

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
		this.font.drawString(ms, "Select the structure you want to place", 28, 11, -12829636);
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
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 56, 61, 20, new StringTextComponent("Library"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(0, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 118, this.guiTop + 29, 77, 20, new StringTextComponent("Blacksmith"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(1, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 29, 87, 20, new StringTextComponent("Butcher Shop"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(2, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 91, this.guiTop + 56, 82, 20, new StringTextComponent("Streetlight"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(3, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 83, 87, 20, new StringTextComponent("Maia Pyramid"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(4, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 118, this.guiTop + 83, 93, 20, new StringTextComponent("Medieval Town"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(5, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 110, 108, 20, new StringTextComponent("Overgrown Church"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(6, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
	}
}
