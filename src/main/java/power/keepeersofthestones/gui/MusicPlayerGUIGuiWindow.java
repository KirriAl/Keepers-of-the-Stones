
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
public class MusicPlayerGUIGuiWindow extends ContainerScreen<MusicPlayerGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = MusicPlayerGUIGui.guistate;

	public MusicPlayerGUIGuiWindow(MusicPlayerGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 300;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/music_player_gui.png");

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
		this.font.drawString(ms, "Music Player", 122, 7, -12829636);
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
		this.addButton(new Button(this.guiLeft + 239, this.guiTop + 7, 46, 20, new StringTextComponent("Stop"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(0, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 23, this.guiTop + 34, 30, 20, new StringTextComponent("1"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(1, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 59, this.guiTop + 34, 30, 20, new StringTextComponent("2"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(2, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 95, this.guiTop + 34, 30, 20, new StringTextComponent("3"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(3, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 131, this.guiTop + 34, 30, 20, new StringTextComponent("4"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(4, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 167, this.guiTop + 34, 30, 20, new StringTextComponent("5"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(5, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 23, this.guiTop + 61, 30, 20, new StringTextComponent("6"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(6, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 59, this.guiTop + 61, 30, 20, new StringTextComponent("7"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(7, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 95, this.guiTop + 61, 30, 20, new StringTextComponent("8"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(8, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 131, this.guiTop + 61, 30, 20, new StringTextComponent("9"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(9, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 167, this.guiTop + 61, 30, 20, new StringTextComponent("10"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new MusicPlayerGUIGui.ButtonPressedMessage(10, x, y, z));
				MusicPlayerGUIGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
	}
}
