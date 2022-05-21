
package power.keepeersofthestones.gui;

import power.keepeersofthestones.procedures.ReturnLevel3Procedure;
import power.keepeersofthestones.procedures.ReturnLevel2Procedure;
import power.keepeersofthestones.procedures.ReturnLevel1Procedure;
import power.keepeersofthestones.procedures.NonWaterPowerProcedure;
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

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class LevelsAndSkillsPageGuiWindow extends ContainerScreen<LevelsAndSkillsPageGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = LevelsAndSkillsPageGui.guistate;

	public LevelsAndSkillsPageGuiWindow(LevelsAndSkillsPageGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
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

		if (ReturnLevel1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.guiLeft + -113, this.guiTop + -70, 0, 0, 16, 16, 16, 16);
		}
		if (ReturnLevel2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.guiLeft + -113, this.guiTop + -40, 0, 0, 16, 16, 16, 16);
		}
		if (NonWaterPowerProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/elemental_coin.png"));
			this.blit(ms, this.guiLeft + 86, this.guiTop + -95, 0, 0, 16, 16, 16, 16);
		}
		if (ReturnLevel2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.guiLeft + -63, this.guiTop + -70, 0, 0, 19, 18, 19, 18);
		}
		if (ReturnLevel3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.guiLeft + -63, this.guiTop + -45, 0, 0, 19, 18, 19, 18);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/level_checked.png"));
		this.blit(ms, this.guiLeft + 136, this.guiTop + -95, 0, 0, 19, 18, 19, 18);

		if (ReturnLevel1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/level_checked.png"));
			this.blit(ms, this.guiLeft + -63, this.guiTop + -95, 0, 0, 19, 18, 19, 18);
		}
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
		this.font.drawString(ms, "Levels", -108, -112, -13421773);
		this.font.drawString(ms, "Level 2", -163, -65, -13421773);
		this.font.drawString(ms, "Level 3", -163, -40, -13421773);
		this.font.drawString(ms, "Skills", 89, -112, -13421773);
		this.font.drawString(ms, "Aqua Power", 26, -90, -13421773);
		this.font.drawString(ms, "Level 1", -163, -90, -13421773);
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
		this.addButton(new Button(this.guiLeft + -88, this.guiTop + -70, 61, 20, new StringTextComponent("4"), e -> {
			if (ReturnLevel1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageGui.ButtonPressedMessage(0, x, y, z));
				LevelsAndSkillsPageGui.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + -88, this.guiTop + -45, 61, 20, new StringTextComponent("16"), e -> {
			if (ReturnLevel2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageGui.ButtonPressedMessage(1, x, y, z));
				LevelsAndSkillsPageGui.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (ReturnLevel2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + 111, this.guiTop + -95, 61, 20, new StringTextComponent("12"), e -> {
			if (NonWaterPowerProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageGui.ButtonPressedMessage(2, x, y, z));
				LevelsAndSkillsPageGui.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(MatrixStack ms, int gx, int gy, float ticks) {
				if (NonWaterPowerProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
						(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll)))
					super.render(ms, gx, gy, ticks);
			}
		});
		this.addButton(new Button(this.guiLeft + -171, this.guiTop + 86, 30, 20, new StringTextComponent("<"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new LevelsAndSkillsPageGui.ButtonPressedMessage(3, x, y, z));
				LevelsAndSkillsPageGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
