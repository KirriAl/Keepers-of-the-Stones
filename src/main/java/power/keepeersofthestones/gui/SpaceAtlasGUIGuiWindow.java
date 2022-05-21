
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
public class SpaceAtlasGUIGuiWindow extends ContainerScreen<SpaceAtlasGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SpaceAtlasGUIGui.guistate;

	public SpaceAtlasGUIGuiWindow(SpaceAtlasGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 512;
		this.ySize = 512;
	}

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/space_atlas.png"));
		this.blit(ms, this.guiLeft + 11, this.guiTop + 130, 0, 0, 512, 256, 512, 256);

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
		this.font.drawString(ms, "Atlas of Space Travel", 99, 153, -16777216);
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
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 198, 46, 20, new StringTextComponent("Moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIGui.ButtonPressedMessage(0, x, y, z));
				SpaceAtlasGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 171, 51, 20, new StringTextComponent("Earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIGui.ButtonPressedMessage(1, x, y, z));
				SpaceAtlasGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 225, 46, 20, new StringTextComponent("Mars"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIGui.ButtonPressedMessage(2, x, y, z));
				SpaceAtlasGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 252, 51, 20, new StringTextComponent("Venus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIGui.ButtonPressedMessage(3, x, y, z));
				SpaceAtlasGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 84, this.guiTop + 276, 72, 20, new StringTextComponent("Enceladus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIGui.ButtonPressedMessage(4, x, y, z));
				SpaceAtlasGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
