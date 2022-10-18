
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
public class EBSoundGuiWindow extends ContainerScreen<EBSoundGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = EBSoundGui.guistate;

	public EBSoundGuiWindow(EBSoundGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 0;
		this.ySize = 0;
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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/book_of_elements_book.png"));
		this.blit(ms, this.guiLeft + -244, this.guiTop + -127, 0, 0, 512, 256, 512, 256);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/sound_stone.png"));
		this.blit(ms, this.guiLeft + -104, this.guiTop + -109, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/sound_master.png"));
		this.blit(ms, this.guiLeft + 93, this.guiTop + -109, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/sound_element.png"));
		this.blit(ms, this.guiLeft + 71, this.guiTop + -85, 0, 0, 61, 128, 61, 128);

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
		this.font.drawString(ms, "Class: Additional", -162, -85, -12829636);
		this.font.drawString(ms, "Element: Sound", -162, -67, -12829636);
		this.font.drawString(ms, "Force: Distortion", -162, -49, -12829636);
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
		this.addButton(new Button(this.guiLeft + 152, this.guiTop + 86, 30, 20, new StringTextComponent(">"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new EBSoundGui.ButtonPressedMessage(0, x, y, z));
				EBSoundGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
