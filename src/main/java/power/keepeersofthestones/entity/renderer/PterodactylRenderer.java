
package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.entity.PterodactylEntity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PterodactylRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PterodactylEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelPterodactyl(), 1.2f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("power:textures/entities/pterodactyl.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelPterodactyl extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body_r1;
		private final ModelRenderer wings;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer upper_beak;
		private final ModelRenderer upper_beak1_r1;
		private final ModelRenderer lower_beak;
		private final ModelRenderer lower_beak1_r1;
		private final ModelRenderer crest;
		private final ModelRenderer crest_r1;
		private final ModelRenderer legs0;
		private final ModelRenderer leg0_r1;
		private final ModelRenderer paw0;
		private final ModelRenderer paw0_r1;
		private final ModelRenderer legs1;
		private final ModelRenderer leg1_r1;
		private final ModelRenderer paw1;
		private final ModelRenderer paw1_r1;
		private final ModelRenderer tail;
		private final ModelRenderer tail_r1;
		private final ModelRenderer left_wing;
		private final ModelRenderer left_wing_r1;
		private final ModelRenderer left_wing_r2;
		private final ModelRenderer left_wing_r3;
		private final ModelRenderer left_wing_r4;
		private final ModelRenderer left_wing_r5;
		private final ModelRenderer left_wing_r6;
		private final ModelRenderer left_wing_r7;
		private final ModelRenderer left_wing_part;
		private final ModelRenderer left_wing_part_r1;
		private final ModelRenderer left_wing_part_r2;
		private final ModelRenderer left_wing_part_r3;
		private final ModelRenderer left_wing_part_r4;
		private final ModelRenderer left_wing2;
		private final ModelRenderer left_wing_r8;
		private final ModelRenderer left_wing_r9;
		private final ModelRenderer left_wing_r10;
		private final ModelRenderer left_wing_r11;
		private final ModelRenderer left_wing_r12;
		private final ModelRenderer left_wing_r13;
		private final ModelRenderer left_wing_r14;
		private final ModelRenderer left_wing_part2;
		private final ModelRenderer left_wing_part_r5;
		private final ModelRenderer left_wing_part_r6;
		private final ModelRenderer left_wing_part_r7;
		private final ModelRenderer left_wing_part_r8;
		private final ModelRenderer bb_main;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;

		public ModelPterodactyl() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(-1.0F, 8.5F, 4.0F);
			body_r1 = new ModelRenderer(this);
			body_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body_r1);
			setRotationAngle(body_r1, -0.2618F, 0.0F, 0.0F);
			body_r1.setTextureOffset(0, 91).addBox(-3.0F, -0.5F, -16.0F, 6.0F, 5.0F, 32.0F, 0.0F, false);
			wings = new ModelRenderer(this);
			wings.setRotationPoint(-1.0F, 6.5F, 5.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(-1.0F, 6.9578F, -11.5664F);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -2.5F, -3.5586F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.1309F, 0.0F, 0.0F);
			head_r1.setTextureOffset(32, 48).addBox(-2.5F, -5.1805F, -9.5783F, 5.0F, 5.0F, 11.0F, 0.0F, false);
			upper_beak = new ModelRenderer(this);
			upper_beak.setRotationPoint(0.0F, 1.6673F, -10.4391F);
			head.addChild(upper_beak);
			upper_beak1_r1 = new ModelRenderer(this);
			upper_beak1_r1.setRotationPoint(0.0F, -4.1673F, 6.8805F);
			upper_beak.addChild(upper_beak1_r1);
			setRotationAngle(upper_beak1_r1, 0.1309F, 0.0F, 0.0F);
			upper_beak1_r1.setTextureOffset(3, 41).addBox(-1.5F, -2.2371F, -20.838F, 3.0F, 2.0F, 6.0F, 0.0F, false);
			upper_beak1_r1.setTextureOffset(3, 40).addBox(-2.0F, -3.2576F, -15.5712F, 4.0F, 3.0F, 6.0F, 0.0F, false);
			lower_beak = new ModelRenderer(this);
			lower_beak.setRotationPoint(0.0F, 2.1289F, -10.1981F);
			head.addChild(lower_beak);
			lower_beak1_r1 = new ModelRenderer(this);
			lower_beak1_r1.setRotationPoint(0.0F, -4.6288F, 6.6395F);
			lower_beak.addChild(lower_beak1_r1);
			setRotationAngle(lower_beak1_r1, 0.1309F, 0.0F, 0.0F);
			lower_beak1_r1.setTextureOffset(68, 24).addBox(-2.0F, -0.2813F, -8.658F, 4.0F, 1.0F, 9.0F, 0.0F, false);
			lower_beak1_r1.setTextureOffset(0, 45).addBox(-1.5F, -0.2813F, -20.658F, 3.0F, 1.0F, 12.0F, 0.0F, false);
			crest = new ModelRenderer(this);
			crest.setRotationPoint(0.0F, -3.3578F, -4.9336F);
			head.addChild(crest);
			crest_r1 = new ModelRenderer(this);
			crest_r1.setRotationPoint(0.0F, 0.8578F, 1.375F);
			crest.addChild(crest_r1);
			setRotationAngle(crest_r1, 0.0873F, 0.0F, 0.0F);
			crest_r1.setTextureOffset(109, 117).addBox(-0.5F, -8.8578F, -7.625F, 1.0F, 4.0F, 7.0F, 0.0F, false);
			legs0 = new ModelRenderer(this);
			legs0.setRotationPoint(-4.0F, 14.6465F, 17.8826F);
			setRotationAngle(legs0, -0.1745F, 0.0F, 0.0F);
			leg0_r1 = new ModelRenderer(this);
			leg0_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
			legs0.addChild(leg0_r1);
			setRotationAngle(leg0_r1, -0.2618F, 0.0F, 0.0F);
			leg0_r1.setTextureOffset(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F, 8.0F, 0.0F, false);
			paw0 = new ModelRenderer(this);
			paw0.setRotationPoint(-1.0F, 2.356F, 5.9748F);
			legs0.addChild(paw0);
			paw0_r1 = new ModelRenderer(this);
			paw0_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			paw0.addChild(paw0_r1);
			setRotationAngle(paw0_r1, -0.2618F, 0.0F, 0.0F);
			paw0_r1.setTextureOffset(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			legs1 = new ModelRenderer(this);
			legs1.setRotationPoint(3.0F, 14.6465F, 17.8826F);
			setRotationAngle(legs1, -0.1745F, 0.0F, 0.0F);
			leg1_r1 = new ModelRenderer(this);
			leg1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			legs1.addChild(leg1_r1);
			setRotationAngle(leg1_r1, -0.2618F, 0.0F, 0.0F);
			leg1_r1.setTextureOffset(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F, 8.0F, 0.0F, false);
			paw1 = new ModelRenderer(this);
			paw1.setRotationPoint(0.0F, 2.356F, 5.9748F);
			legs1.addChild(paw1);
			paw1_r1 = new ModelRenderer(this);
			paw1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			paw1.addChild(paw1_r1);
			setRotationAngle(paw1_r1, -0.2618F, 0.0F, 0.0F);
			paw1_r1.setTextureOffset(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(-1.0F, 8.909F, 19.9166F);
			tail_r1 = new ModelRenderer(this);
			tail_r1.setRotationPoint(0.0F, 2.0F, 0.0F);
			tail.addChild(tail_r1);
			setRotationAngle(tail_r1, -0.2182F, 0.0F, 0.0F);
			tail_r1.setTextureOffset(31, 119).addBox(-1.5F, 1.8333F, -0.1819F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(3.1117F, 6.1889F, -6.7036F);
			setRotationAngle(left_wing, -0.2618F, 0.0F, 0.0F);
			left_wing.setTextureOffset(77, 29).addBox(-1.1117F, -2.1889F, -1.2964F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			left_wing_r1 = new ModelRenderer(this);
			left_wing_r1.setRotationPoint(3.3883F, -0.1889F, 0.7036F);
			left_wing.addChild(left_wing_r1);
			setRotationAngle(left_wing_r1, 0.0F, -0.3491F, 0.0F);
			left_wing_r1.setTextureOffset(74, 30).addBox(-1.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			left_wing_r2 = new ModelRenderer(this);
			left_wing_r2.setRotationPoint(3.3883F, -0.1889F, 0.7036F);
			left_wing.addChild(left_wing_r2);
			setRotationAngle(left_wing_r2, 0.0F, -0.1745F, 0.0F);
			left_wing_r2.setTextureOffset(64, 22).addBox(-4.5F, -0.1F, 1.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			left_wing_r3 = new ModelRenderer(this);
			left_wing_r3.setRotationPoint(8.6087F, -0.1889F, 2.9465F);
			left_wing.addChild(left_wing_r3);
			setRotationAngle(left_wing_r3, 0.0F, -1.1345F, 0.0F);
			left_wing_r3.setTextureOffset(63, 19).addBox(1.1693F, -0.4F, -13.3825F, 8.0F, 1.0F, 13.0F, 0.0F, false);
			left_wing_r3.setTextureOffset(71, 21).addBox(-0.8307F, -1.0F, -11.3825F, 2.0F, 2.0F, 11.0F, 0.0F, false);
			left_wing_r4 = new ModelRenderer(this);
			left_wing_r4.setRotationPoint(9.6854F, 0.1111F, 9.1968F);
			left_wing.addChild(left_wing_r4);
			setRotationAngle(left_wing_r4, 0.0F, -0.5236F, 0.0F);
			left_wing_r4.setTextureOffset(66, 22).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			left_wing_r5 = new ModelRenderer(this);
			left_wing_r5.setRotationPoint(16.7916F, 0.3111F, -2.8892F);
			left_wing.addChild(left_wing_r5);
			setRotationAngle(left_wing_r5, 0.0F, -0.8727F, 0.0F);
			left_wing_r5.setTextureOffset(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_r6 = new ModelRenderer(this);
			left_wing_r6.setRotationPoint(17.6979F, 0.3111F, -3.3118F);
			left_wing.addChild(left_wing_r6);
			setRotationAngle(left_wing_r6, 0.0F, -1.1345F, 0.0F);
			left_wing_r6.setTextureOffset(81, 31).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_r7 = new ModelRenderer(this);
			left_wing_r7.setRotationPoint(18.6042F, 0.3111F, -3.7344F);
			left_wing.addChild(left_wing_r7);
			setRotationAngle(left_wing_r7, 0.0F, -1.3963F, 0.0F);
			left_wing_r7.setTextureOffset(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_part = new ModelRenderer(this);
			left_wing_part.setRotationPoint(22.827F, -0.1889F, 1.9566F);
			left_wing.addChild(left_wing_part);
			left_wing_part_r1 = new ModelRenderer(this);
			left_wing_part_r1.setRotationPoint(42.5613F, -0.5F, 9.2469F);
			left_wing_part.addChild(left_wing_part_r1);
			setRotationAngle(left_wing_part_r1, 0.0F, -0.1309F, 0.0F);
			left_wing_part_r1.setTextureOffset(33, 68).addBox(-44.5F, 0.0F, -3.5F, 43.0F, 1.0F, 2.0F, 0.0F, false);
			left_wing_part_r1.setTextureOffset(37, 68).addBox(-44.5F, 0.0F, -5.5F, 39.0F, 1.0F, 2.0F, 0.0F, false);
			left_wing_part_r1.setTextureOffset(46, 69).addBox(-44.5F, 0.0F, -6.5F, 31.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_part_r1.setTextureOffset(28, 67).addBox(-44.5F, 0.0F, -1.5F, 47.0F, 1.0F, 3.0F, 0.0F, false);
			left_wing_part_r2 = new ModelRenderer(this);
			left_wing_part_r2.setRotationPoint(-4.5802F, 0.0F, -3.0481F);
			left_wing_part.addChild(left_wing_part_r2);
			setRotationAngle(left_wing_part_r2, 0.0F, -1.6581F, 0.0F);
			left_wing_part_r2.setTextureOffset(63, 13).addBox(-1.2443F, -1.0F, -18.9409F, 2.0F, 2.0F, 19.0F, 0.0F, false);
			left_wing_part_r3 = new ModelRenderer(this);
			left_wing_part_r3.setRotationPoint(13.7662F, 0.0F, -0.6383F);
			left_wing_part.addChild(left_wing_part_r3);
			setRotationAngle(left_wing_part_r3, 0.0F, -1.789F, 0.0F);
			left_wing_part_r3.setTextureOffset(57, 7).addBox(-2.0459F, -1.0F, -24.4543F, 2.0F, 2.0F, 25.0F, 0.0F, false);
			left_wing_part_r4 = new ModelRenderer(this);
			left_wing_part_r4.setRotationPoint(38.7487F, 0.0F, 4.7157F);
			left_wing_part.addChild(left_wing_part_r4);
			setRotationAngle(left_wing_part_r4, 0.0F, -2.1817F, 0.0F);
			left_wing_part_r4.setTextureOffset(71, 21).addBox(-0.8895F, -1.0F, -9.1216F, 2.0F, 2.0F, 11.0F, 0.0F, false);
			left_wing2 = new ModelRenderer(this);
			left_wing2.setRotationPoint(-4.8883F, 6.1889F, -6.7036F);
			setRotationAngle(left_wing2, -2.8798F, 3.1416F, 0.0F);
			left_wing2.setTextureOffset(78, 64).addBox(-1.1117F, -2.1889F, -1.2964F, 4.0F, 3.0F, 3.0F, 0.0F, false);
			left_wing_r8 = new ModelRenderer(this);
			left_wing_r8.setRotationPoint(3.3883F, -0.1889F, 0.7036F);
			left_wing2.addChild(left_wing_r8);
			setRotationAngle(left_wing_r8, 0.0F, -0.3491F, 0.0F);
			left_wing_r8.setTextureOffset(75, 65).addBox(-1.5F, -1.0F, -1.0F, 8.0F, 2.0F, 2.0F, 0.0F, false);
			left_wing_r9 = new ModelRenderer(this);
			left_wing_r9.setRotationPoint(3.3883F, -0.1889F, 0.7036F);
			left_wing2.addChild(left_wing_r9);
			setRotationAngle(left_wing_r9, 0.0F, -0.1745F, 0.0F);
			left_wing_r9.setTextureOffset(64, 57).addBox(-4.5F, -0.1F, 1.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
			left_wing_r10 = new ModelRenderer(this);
			left_wing_r10.setRotationPoint(8.6087F, -0.1889F, 2.9465F);
			left_wing2.addChild(left_wing_r10);
			setRotationAngle(left_wing_r10, 0.0F, -1.1345F, 0.0F);
			left_wing_r10.setTextureOffset(64, 54).addBox(1.1693F, -0.4F, -13.3825F, 8.0F, 1.0F, 13.0F, 0.0F, false);
			left_wing_r10.setTextureOffset(72, 56).addBox(-0.8307F, -1.0F, -11.3825F, 2.0F, 2.0F, 11.0F, 0.0F, false);
			left_wing_r11 = new ModelRenderer(this);
			left_wing_r11.setRotationPoint(9.6854F, 0.1111F, 9.1968F);
			left_wing2.addChild(left_wing_r11);
			setRotationAngle(left_wing_r11, 0.0F, -0.5236F, 0.0F);
			left_wing_r11.setTextureOffset(67, 57).addBox(-4.0F, -0.5F, -5.0F, 8.0F, 1.0F, 10.0F, 0.0F, false);
			left_wing_r12 = new ModelRenderer(this);
			left_wing_r12.setRotationPoint(16.7916F, 0.3111F, -2.8892F);
			left_wing2.addChild(left_wing_r12);
			setRotationAngle(left_wing_r12, 0.0F, -0.8727F, 0.0F);
			left_wing_r12.setTextureOffset(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_r13 = new ModelRenderer(this);
			left_wing_r13.setRotationPoint(17.6979F, 0.3111F, -3.3118F);
			left_wing2.addChild(left_wing_r13);
			setRotationAngle(left_wing_r13, 0.0F, -1.1345F, 0.0F);
			left_wing_r13.setTextureOffset(81, 31).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_r14 = new ModelRenderer(this);
			left_wing_r14.setRotationPoint(18.6042F, 0.3111F, -3.7344F);
			left_wing2.addChild(left_wing_r14);
			setRotationAngle(left_wing_r14, 0.0F, -1.3963F, 0.0F);
			left_wing_r14.setTextureOffset(80, 31).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_part2 = new ModelRenderer(this);
			left_wing_part2.setRotationPoint(22.827F, -0.1889F, 1.9566F);
			left_wing2.addChild(left_wing_part2);
			left_wing_part_r5 = new ModelRenderer(this);
			left_wing_part_r5.setRotationPoint(42.5613F, -0.5F, 9.2469F);
			left_wing_part2.addChild(left_wing_part_r5);
			setRotationAngle(left_wing_part_r5, 0.0F, -0.1309F, 0.0F);
			left_wing_part_r5.setTextureOffset(33, 68).addBox(-44.5F, 0.0F, -3.5F, 43.0F, 1.0F, 2.0F, 0.0F, false);
			left_wing_part_r5.setTextureOffset(37, 68).addBox(-44.5F, 0.0F, -5.5F, 39.0F, 1.0F, 2.0F, 0.0F, false);
			left_wing_part_r5.setTextureOffset(46, 69).addBox(-44.5F, 0.0F, -6.5F, 31.0F, 1.0F, 1.0F, 0.0F, false);
			left_wing_part_r5.setTextureOffset(28, 67).addBox(-44.5F, 0.0F, -1.5F, 47.0F, 1.0F, 3.0F, 0.0F, false);
			left_wing_part_r6 = new ModelRenderer(this);
			left_wing_part_r6.setRotationPoint(-4.5802F, 0.0F, -3.0481F);
			left_wing_part2.addChild(left_wing_part_r6);
			setRotationAngle(left_wing_part_r6, 0.0F, -1.6581F, 0.0F);
			left_wing_part_r6.setTextureOffset(64, 48).addBox(-1.2443F, -1.0F, -18.9409F, 2.0F, 2.0F, 19.0F, 0.0F, false);
			left_wing_part_r7 = new ModelRenderer(this);
			left_wing_part_r7.setRotationPoint(13.7662F, 0.0F, -0.6383F);
			left_wing_part2.addChild(left_wing_part_r7);
			setRotationAngle(left_wing_part_r7, 0.0F, -1.789F, 0.0F);
			left_wing_part_r7.setTextureOffset(58, 42).addBox(-2.0459F, -1.0F, -24.4543F, 2.0F, 2.0F, 25.0F, 0.0F, false);
			left_wing_part_r8 = new ModelRenderer(this);
			left_wing_part_r8.setRotationPoint(38.7487F, 0.0F, 4.7157F);
			left_wing_part2.addChild(left_wing_part_r8);
			setRotationAngle(left_wing_part_r8, 0.0F, -2.1817F, 0.0F);
			left_wing_part_r8.setTextureOffset(72, 56).addBox(-0.8895F, -1.0F, -9.1216F, 2.0F, 2.0F, 11.0F, 0.0F, false);
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.5F, -15.5F, 6.5F);
			bb_main.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.2618F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(76, 30).addBox(-3.5F, -0.9F, -10.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(76, 30).addBox(-3.5F, -0.9F, 6.5F, 6.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r1.setTextureOffset(63, 17).addBox(-3.5F, -1.9F, -8.5F, 6.0F, 2.0F, 15.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-1.0F, -17.3631F, -13.1623F);
			bb_main.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(31, 119).addBox(-1.5F, -2.35F, -5.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-1.0F, -14.5F, -16.0F);
			bb_main.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.2618F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(30, 119).addBox(-2.0F, -6.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			wings.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			legs0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			legs1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_wing.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			left_wing2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
