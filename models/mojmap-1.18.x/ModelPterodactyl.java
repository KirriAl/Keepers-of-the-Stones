// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelPterodactyl<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "pterodactyl"), "main");
	private final ModelPart body;
	private final ModelPart wings;
	private final ModelPart head;
	private final ModelPart legs0;
	private final ModelPart legs1;
	private final ModelPart tail;

	public ModelPterodactyl(ModelPart root) {
		this.body = root.getChild("body");
		this.wings = root.getChild("wings");
		this.head = root.getChild("head");
		this.legs0 = root.getChild("legs0");
		this.legs1 = root.getChild("legs1");
		this.tail = root.getChild("tail");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.5F, 4.0F));

		PartDefinition body_r1 = body
				.addOrReplaceChild("body_r1",
						CubeListBuilder.create().texOffs(0, 91).addBox(-3.0F, -2.5F, -16.0F, 6.0F, 5.0F, 32.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition wings = partdefinition.addOrReplaceChild("wings", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 6.5F, 5.0F));

		PartDefinition wing0_r1 = wings.addOrReplaceChild("wing0_r1",
				CubeListBuilder.create().texOffs(40, 0).addBox(-6.0F, -0.5F, -32.0F, 12.0F, 1.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition wing1_r1 = wings.addOrReplaceChild("wing1_r1",
				CubeListBuilder.create().texOffs(40, 0).addBox(-6.0F, -0.5F, 0.0F, 12.0F, 1.0F, 32.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, -1.5708F, -1.4835F, 1.5708F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 6.9578F, -11.5664F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(32, 48).addBox(-2.5F, -3.2627F, -10.5379F, 5.0F, 5.0F, 11.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.4578F, 0.0664F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upper_beak = head.addOrReplaceChild("upper_beak", CubeListBuilder.create(),
				PartPose.offset(0.0F, 1.6673F, -10.4391F));

		PartDefinition upper_beak1_r1 = upper_beak.addOrReplaceChild("upper_beak1_r1",
				CubeListBuilder.create().texOffs(3, 41).addBox(-1.5F, -2.1299F, -5.9535F, 3.0F, 2.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.3749F, -5.9945F, 0.0436F, 0.0F, 0.0F));

		PartDefinition upper_beak0_r1 = upper_beak.addOrReplaceChild("upper_beak0_r1",
				CubeListBuilder.create().texOffs(3, 40).addBox(-2.0F, -2.6299F, -5.9535F, 4.0F, 3.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.3749F, -0.0055F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lower_beak = head.addOrReplaceChild("lower_beak", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.1289F, -10.1981F));

		PartDefinition lower_beak1_r1 = lower_beak.addOrReplaceChild("lower_beak1_r1",
				CubeListBuilder.create().texOffs(68, 24).addBox(-1.5F, -0.9362F, -8.4905F, 3.0F, 1.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0327F, 9.2507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition lower_beak0_r1 = lower_beak.addOrReplaceChild("lower_beak0_r1",
				CubeListBuilder.create().texOffs(0, 45).addBox(-1.5F, -0.5436F, -11.499F, 3.0F, 1.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0327F, 0.2507F, 0.0436F, 0.0F, 0.0F));

		PartDefinition crest = head.addOrReplaceChild("crest", CubeListBuilder.create().texOffs(109, 117).addBox(-0.5F,
				-4.0F, -3.5F, 1.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.3578F, -4.9336F));

		PartDefinition legs0 = partdefinition.addOrReplaceChild("legs0", CubeListBuilder.create(),
				PartPose.offset(-4.0F, 9.6465F, 18.8826F));

		PartDefinition leg0_r1 = legs0.addOrReplaceChild("leg0_r1",
				CubeListBuilder.create().texOffs(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition paw0 = legs0.addOrReplaceChild("paw0", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 2.356F, 5.9748F));

		PartDefinition paw0_r1 = paw0.addOrReplaceChild(
				"paw0_r1", CubeListBuilder.create().texOffs(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition legs1 = partdefinition.addOrReplaceChild("legs1", CubeListBuilder.create(),
				PartPose.offset(3.0F, 9.6465F, 18.8826F));

		PartDefinition leg1_r1 = legs1.addOrReplaceChild(
				"leg1_r1", CubeListBuilder.create().texOffs(108, 119).addBox(-1.0F, -0.3105F, -0.8434F, 2.0F, 1.0F,
						8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition paw1 = legs1.addOrReplaceChild("paw1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 2.356F, 5.9748F));

		PartDefinition paw1_r1 = paw1.addOrReplaceChild(
				"paw1_r1", CubeListBuilder.create().texOffs(122, 125).addBox(-1.0F, -0.0341F, -0.2412F, 2.0F, 2.0F,
						1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create(),
				PartPose.offset(-1.0F, 8.909F, 19.9166F));

		PartDefinition tail_r1 = tail
				.addOrReplaceChild("tail_r1",
						CubeListBuilder.create().texOffs(31, 119).addBox(-1.5F, -1.1743F, -0.0076F, 3.0F, 2.0F, 4.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		wings.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs0.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		legs1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.wings.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
	}
}