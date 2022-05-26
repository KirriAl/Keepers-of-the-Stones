// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModelPlesiosaurus extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer neck;
	private final ModelRenderer neck_r1;
	private final ModelRenderer lower_jaw;
	private final ModelRenderer fins0;
	private final ModelRenderer fin0_r1;
	private final ModelRenderer fin2_r1;
	private final ModelRenderer fins1;
	private final ModelRenderer fin1_r1;
	private final ModelRenderer fin3_r1;
	private final ModelRenderer body;
	private final ModelRenderer tail;
	private final ModelRenderer tail_r1;

	public ModelPlesiosaurus() {
		textureWidth = 512;
		textureHeight = 512;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -5.0F, 35.0F);
		head.setTextureOffset(436, 476).addBox(-7.0F, -35.0F, 46.0F, 14.0F, 12.0F, 24.0F, 0.0F, false);

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, -0.1603F, 0.134F);
		head.addChild(neck);

		neck_r1 = new ModelRenderer(this);
		neck_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		neck.addChild(neck_r1);
		setRotationAngle(neck_r1, -1.0472F, 0.0F, 0.0F);
		neck_r1.setTextureOffset(0, 300).addBox(-5.0F, -56.1865F, -4.8923F, 10.0F, 64.0F, 10.0F, 0.0F, false);

		lower_jaw = new ModelRenderer(this);
		lower_jaw.setRotationPoint(0.0F, -21.0F, 47.0F);
		head.addChild(lower_jaw);
		lower_jaw.setTextureOffset(64, 484).addBox(-7.0F, -2.0F, -1.0F, 14.0F, 4.0F, 24.0F, 0.0F, false);

		fins0 = new ModelRenderer(this);
		fins0.setRotationPoint(16.5F, 15.0F, -9.0F);

		fin0_r1 = new ModelRenderer(this);
		fin0_r1.setRotationPoint(-0.5F, -4.0F, 25.0F);
		fins0.addChild(fin0_r1);
		setRotationAngle(fin0_r1, 0.0F, 0.0F, 0.2618F);
		fin0_r1.setTextureOffset(346, 280).addBox(-1.4418F, -0.7598F, -8.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);

		fin2_r1 = new ModelRenderer(this);
		fin2_r1.setRotationPoint(-1.5F, -4.0F, -25.0F);
		fins0.addChild(fin2_r1);
		setRotationAngle(fin2_r1, 0.0F, 0.0F, 0.2618F);
		fin2_r1.setTextureOffset(346, 280).addBox(0.4901F, -1.2774F, -8.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);

		fins1 = new ModelRenderer(this);
		fins1.setRotationPoint(-19.0F, 15.0F, -9.0F);

		fin1_r1 = new ModelRenderer(this);
		fin1_r1.setRotationPoint(3.0F, -4.0F, 25.0F);
		fins1.addChild(fin1_r1);
		setRotationAngle(fin1_r1, 0.0F, 0.0F, -0.2618F);
		fin1_r1.setTextureOffset(323, 345).addBox(-33.456F, -1.5362F, -8.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);

		fin3_r1 = new ModelRenderer(this);
		fin3_r1.setRotationPoint(2.0F, -5.0F, -25.0F);
		fins1.addChild(fin3_r1);
		setRotationAngle(fin3_r1, 0.0F, 0.0F, -0.2618F);
		fin3_r1.setTextureOffset(323, 345).addBox(-32.7489F, -0.3115F, -8.0F, 32.0F, 2.0F, 16.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.0F, 4.0F, -8.5F);
		body.setTextureOffset(1, 395).addBox(-17.0F, -16.0F, -42.5F, 34.0F, 32.0F, 85.0F, 0.0F, false);

		tail = new ModelRenderer(this);
		tail.setRotationPoint(-1.0F, -5.3129F, -51.7626F);

		tail_r1 = new ModelRenderer(this);
		tail_r1.setRotationPoint(0.0F, -0.0532F, -0.1919F);
		tail.addChild(tail_r1);
		setRotationAngle(tail_r1, -1.309F, 0.0F, 0.0F);
		tail_r1.setTextureOffset(472, 0).addBox(-5.0F, -4.6474F, -4.9176F, 10.0F, 40.0F, 10.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		fins0.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		fins1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		tail.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}