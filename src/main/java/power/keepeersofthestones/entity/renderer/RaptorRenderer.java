
package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.entity.RaptorEntity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class RaptorRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RaptorEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelRaptor(), 1.2f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("power:textures/entities/raptor.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 4.2.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModelRaptor extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer body0_r1;
		private final ModelRenderer body1;
		private final ModelRenderer body1_r1;
		private final ModelRenderer legs0;
		private final ModelRenderer thigh0_r1;
		private final ModelRenderer knee0_r1;
		private final ModelRenderer legs1;
		private final ModelRenderer knee1_r1;
		private final ModelRenderer thigh1_r1;
		private final ModelRenderer head;
		private final ModelRenderer jaw;
		private final ModelRenderer neck1;
		private final ModelRenderer neck1_r1;
		private final ModelRenderer arms;
		private final ModelRenderer forearm2_r1;
		private final ModelRenderer paw1;
		private final ModelRenderer paw2_r1;
		private final ModelRenderer paw1_r1;
		private final ModelRenderer tail2;
		private final ModelRenderer tail2_r1;
		private final ModelRenderer tail3;

		public ModelRaptor() {
			textureWidth = 128;
			textureHeight = 128;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 12.6944F, 1.0304F);
			setRotationAngle(body, 0.0873F, 0.0F, 0.0F);
			body0_r1 = new ModelRenderer(this);
			body0_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body.addChild(body0_r1);
			setRotationAngle(body0_r1, -0.1309F, 0.0F, 0.0F);
			body0_r1.setTextureOffset(5, 31).addBox(-4.5F, -3.5F, -2.5F, 9.0F, 7.0F, 5.0F, 0.0F, false);
			body1 = new ModelRenderer(this);
			body1.setRotationPoint(0.0F, -0.7433F, -6.9428F);
			body.addChild(body1);
			body1_r1 = new ModelRenderer(this);
			body1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			body1.addChild(body1_r1);
			setRotationAngle(body1_r1, -0.1309F, 0.0F, 0.0F);
			body1_r1.setTextureOffset(4, 4).addBox(-4.5F, -3.5F, -4.5F, 9.0F, 7.0F, 9.0F, 0.0F, false);
			legs0 = new ModelRenderer(this);
			legs0.setRotationPoint(4.5F, 11.4306F, 2.0256F);
			legs0.setTextureOffset(63, 73).addBox(-1.0F, 11.5694F, -3.7756F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			legs0.setTextureOffset(67, 70).addBox(-1.0F, 8.9694F, -1.7756F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			thigh0_r1 = new ModelRenderer(this);
			thigh0_r1.setRotationPoint(0.0F, 0.3957F, -0.5104F);
			legs0.addChild(thigh0_r1);
			setRotationAngle(thigh0_r1, -0.1745F, 0.0F, 0.0F);
			thigh0_r1.setTextureOffset(10, 55).addBox(-1.5F, -1.0304F, -1.1527F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			knee0_r1 = new ModelRenderer(this);
			knee0_r1.setRotationPoint(0.0F, 5.0656F, -0.9384F);
			legs0.addChild(knee0_r1);
			setRotationAngle(knee0_r1, 0.0873F, 0.0F, 0.0F);
			knee0_r1.setTextureOffset(67, 74).addBox(-1.0F, -0.0076F, -1.1743F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			legs1 = new ModelRenderer(this);
			legs1.setRotationPoint(-4.5F, 11.4893F, 2.0274F);
			legs1.setTextureOffset(63, 73).addBox(-1.0F, 11.5107F, -3.7774F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			legs1.setTextureOffset(67, 70).addBox(-1.0F, 8.9107F, -1.7774F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			knee1_r1 = new ModelRenderer(this);
			knee1_r1.setRotationPoint(0.0F, 5.0069F, -0.9403F);
			legs1.addChild(knee1_r1);
			setRotationAngle(knee1_r1, 0.0873F, 0.0F, 0.0F);
			knee1_r1.setTextureOffset(67, 71).addBox(-1.0F, -0.0076F, -1.1743F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			thigh1_r1 = new ModelRenderer(this);
			thigh1_r1.setRotationPoint(0.0F, 0.5716F, -0.5049F);
			legs1.addChild(thigh1_r1);
			setRotationAngle(thigh1_r1, -0.1745F, 0.0F, 0.0F);
			thigh1_r1.setTextureOffset(10, 55).addBox(-1.5F, -1.0304F, -1.1527F, 3.0F, 6.0F, 3.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 9.5F, -9.1F);
			head.setTextureOffset(56, 51).addBox(-2.5F, -7.0F, -11.5F, 5.0F, 4.0F, 9.0F, 0.02F, false);
			jaw = new ModelRenderer(this);
			jaw.setRotationPoint(0.0F, -2.5F, -3.4F);
			head.addChild(jaw);
			jaw.setTextureOffset(60, 72).addBox(-2.0F, -0.5F, -7.0F, 4.0F, 1.0F, 8.0F, 0.0F, false);
			neck1 = new ModelRenderer(this);
			neck1.setRotationPoint(0.0F, 0.2567F, 0.0702F);
			head.addChild(neck1);
			setRotationAngle(neck1, -0.2182F, 0.0F, 0.0F);
			neck1_r1 = new ModelRenderer(this);
			neck1_r1.setRotationPoint(0.0F, -0.496F, 0.3981F);
			neck1.addChild(neck1_r1);
			setRotationAngle(neck1_r1, -0.7854F, 0.0F, 0.0F);
			neck1_r1.setTextureOffset(53, 33).addBox(-2.5F, -0.7929F, -7.5355F, 5.0F, 3.0F, 8.0F, 0.0F, false);
			arms = new ModelRenderer(this);
			arms.setRotationPoint(-0.1F, 14.5188F, -10.6673F);
			setRotationAngle(arms, -0.4363F, 0.0F, 0.0F);
			forearm2_r1 = new ModelRenderer(this);
			forearm2_r1.setRotationPoint(-2.5F, 0.0F, 0.0F);
			arms.addChild(forearm2_r1);
			setRotationAngle(forearm2_r1, -0.1745F, 0.0F, 0.0F);
			forearm2_r1.setTextureOffset(122, 0).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			forearm2_r1.setTextureOffset(122, 0).addBox(4.0F, -2.0F, -0.5F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			paw1 = new ModelRenderer(this);
			paw1.setRotationPoint(0.0F, 2.6494F, 0.5662F);
			arms.addChild(paw1);
			paw2_r1 = new ModelRenderer(this);
			paw2_r1.setRotationPoint(-2.5F, -0.5F, -1.0F);
			paw1.addChild(paw2_r1);
			setRotationAngle(paw2_r1, -0.2182F, 0.0F, 0.0F);
			paw2_r1.setTextureOffset(118, 124).addBox(-1.0F, -0.2283F, -0.4155F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			paw1_r1 = new ModelRenderer(this);
			paw1_r1.setRotationPoint(2.5F, -0.5F, -1.0F);
			paw1.addChild(paw1_r1);
			setRotationAngle(paw1_r1, -0.2182F, 0.0F, 0.0F);
			paw1_r1.setTextureOffset(118, 124).addBox(-1.0F, -0.2283F, -0.4155F, 2.0F, 1.0F, 3.0F, 0.0F, false);
			tail2 = new ModelRenderer(this);
			tail2.setRotationPoint(0.0F, 10.6809F, 3.6662F);
			tail2_r1 = new ModelRenderer(this);
			tail2_r1.setRotationPoint(0.0F, -0.0038F, 0.4459F);
			tail2.addChild(tail2_r1);
			setRotationAngle(tail2_r1, 0.0436F, 0.0F, 0.0F);
			tail2_r1.setTextureOffset(34, 43).addBox(-1.5F, -0.8412F, -0.4494F, 3.0F, 2.0F, 8.0F, 0.0F, false);
			tail3 = new ModelRenderer(this);
			tail3.setRotationPoint(0.0F, -0.6123F, 8.1548F);
			tail2.addChild(tail3);
			tail3.setTextureOffset(40, 18).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			legs0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			legs1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			arms.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			tail2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.legs0.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.legs1.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

}
