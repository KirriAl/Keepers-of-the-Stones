// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeltyrannosaurus_rex extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer shoulder;
	private final ModelRenderer neck1;
	private final ModelRenderer neck2;
	private final ModelRenderer arm0;
	private final ModelRenderer forearm0;
	private final ModelRenderer paw0;
	private final ModelRenderer arm1;
	private final ModelRenderer forearm1;
	private final ModelRenderer paw1;
	private final ModelRenderer tail0;
	private final ModelRenderer tail1;
	private final ModelRenderer tail2;
	private final ModelRenderer tail3;
	private final ModelRenderer thigh1;
	private final ModelRenderer knee1;
	private final ModelRenderer shin1;
	private final ModelRenderer feet1;
	private final ModelRenderer head;
	private final ModelRenderer upper_jaw0;
	private final ModelRenderer upper_jaw1;
	private final ModelRenderer lower_jaw;
	private final ModelRenderer thigh2;
	private final ModelRenderer knee2;
	private final ModelRenderer shin2;
	private final ModelRenderer feet2;
	private final ModelRenderer scallop;
	private final ModelRenderer scallop1;
	private final ModelRenderer scallop2;

	public Modeltyrannosaurus_rex() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -1.5F, 6.0F);
		setRotationAngle(body, 0.0873F, 0.0F, 0.0F);
		body.setTextureOffset(0, 26).addBox(-5.0F, -10.5F, -13.0F, 10.0F, 15.0F, 10.0F, 0.0F, false);

		shoulder = new ModelRenderer(this);
		shoulder.setRotationPoint(0.0F, -0.4F, -5.0F);
		body.addChild(shoulder);
		shoulder.setTextureOffset(0, 0).addBox(-4.5F, -6.5F, -21.0F, 9.0F, 13.0F, 13.0F, 0.0F, false);

		neck1 = new ModelRenderer(this);
		neck1.setRotationPoint(0.0F, -2.3836F, -25.0237F);
		shoulder.addChild(neck1);
		setRotationAngle(neck1, -0.2182F, 0.0F, 0.0F);
		neck1.setTextureOffset(3, 26).addBox(-3.5F, -5.0F, -5.0F, 7.0F, 8.0F, 10.0F, 0.0F, false);

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, 3.5F, -2.0F);
		neck1.addChild(neck2);
		neck2.setTextureOffset(55, 68).addBox(-2.5F, -0.8F, -2.75F, 5.0F, 3.0F, 11.0F, 0.0F, false);

		arm0 = new ModelRenderer(this);
		arm0.setRotationPoint(-3.5F, 6.4F, -20.0F);
		shoulder.addChild(arm0);

		forearm0 = new ModelRenderer(this);
		forearm0.setRotationPoint(1.0F, 1.0F, 0.0F);
		arm0.addChild(forearm0);
		setRotationAngle(forearm0, -0.4363F, 0.0F, 0.0F);
		forearm0.setTextureOffset(0, 26).addBox(-0.9F, -2.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		paw0 = new ModelRenderer(this);
		paw0.setRotationPoint(0.0F, 4.5F, 2.0F);
		forearm0.addChild(paw0);
		paw0.setTextureOffset(0, 27).addBox(-0.9F, -1.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		arm1 = new ModelRenderer(this);
		arm1.setRotationPoint(3.5F, 6.4F, -20.0F);
		shoulder.addChild(arm1);

		forearm1 = new ModelRenderer(this);
		forearm1.setRotationPoint(0.0F, 0.0F, 0.0F);
		arm1.addChild(forearm1);
		setRotationAngle(forearm1, -0.4363F, 0.0F, 0.0F);
		forearm1.setTextureOffset(0, 26).addBox(-1.1F, -1.0F, 0.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);

		paw1 = new ModelRenderer(this);
		paw1.setRotationPoint(0.0F, 4.5F, 2.0F);
		forearm1.addChild(paw1);
		paw1.setTextureOffset(0, 27).addBox(-1.1F, -0.5F, 0.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		tail0 = new ModelRenderer(this);
		tail0.setRotationPoint(0.0F, -2.0F, -1.0F);
		body.addChild(tail0);
		tail0.setTextureOffset(4, 29).addBox(-4.5F, -8.3F, -2.0F, 9.0F, 14.0F, 7.0F, 0.0F, false);

		tail1 = new ModelRenderer(this);
		tail1.setRotationPoint(0.0F, -1.0F, 14.0F);
		tail0.addChild(tail1);

		tail2 = new ModelRenderer(this);
		tail2.setRotationPoint(0.0F, -3.4F, -2.5F);
		tail1.addChild(tail2);
		tail2.setTextureOffset(27, 38).addBox(-2.5F, -3.5F, -6.5F, 5.0F, 7.0F, 13.0F, 0.0F, false);

		tail3 = new ModelRenderer(this);
		tail3.setRotationPoint(0.0F, 0.4F, 6.5F);
		tail2.addChild(tail3);
		tail3.setTextureOffset(34, 14).addBox(-1.5F, -2.7F, 0.0F, 3.0F, 5.0F, 12.0F, 0.0F, false);

		thigh1 = new ModelRenderer(this);
		thigh1.setRotationPoint(4.0F, 3.0F, -4.0F);
		thigh1.setTextureOffset(6, 27).addBox(0.0F, -5.0F, -4.0F, 5.0F, 14.0F, 9.0F, 0.0F, false);

		knee1 = new ModelRenderer(this);
		knee1.setRotationPoint(2.5F, 8.0F, 0.0F);
		thigh1.addChild(knee1);
		knee1.setTextureOffset(58, 67).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);

		shin1 = new ModelRenderer(this);
		shin1.setRotationPoint(0.0F, 3.0F, 5.5F);
		knee1.addChild(shin1);
		shin1.setTextureOffset(67, 70).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		feet1 = new ModelRenderer(this);
		feet1.setRotationPoint(0.0F, 8.0F, -0.5F);
		shin1.addChild(feet1);
		feet1.setTextureOffset(52, 70).addBox(-3.5F, 0.0F, -7.0F, 7.0F, 2.0F, 10.0F, 0.0F, false);
		feet1.setTextureOffset(0, 125).addBox(2.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		feet1.setTextureOffset(0, 125).addBox(-3.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		feet1.setTextureOffset(0, 125).addBox(-0.5F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -10.35F, -25.6F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.setTextureOffset(56, 51).addBox(-4.0F, -5.0F, -3.5F, 8.0F, 10.0F, 7.0F, 0.02F, false);

		upper_jaw0 = new ModelRenderer(this);
		upper_jaw0.setRotationPoint(0.0F, 1.95F, -3.4F);
		head.addChild(upper_jaw0);
		upper_jaw0.setTextureOffset(31, 0).addBox(-3.5F, -5.95F, -3.1F, 7.0F, 6.0F, 3.0F, 0.0F, false);

		upper_jaw1 = new ModelRenderer(this);
		upper_jaw1.setRotationPoint(0.0F, -3.45F, -3.0F);
		upper_jaw0.addChild(upper_jaw1);
		upper_jaw1.setTextureOffset(75, 28).addBox(-3.5F, -1.5F, -6.1F, 7.0F, 5.0F, 6.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(-3.4F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(-3.4F, 3.35F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(-3.4F, 3.35F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(2.4F, 3.35F, -4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(2.4F, 3.35F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(2.4F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(0.5F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		upper_jaw1.setTextureOffset(124, 0).addBox(-1.5F, 3.35F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		lower_jaw = new ModelRenderer(this);
		lower_jaw.setRotationPoint(0.0F, 1.95F, -3.4F);
		head.addChild(lower_jaw);
		setRotationAngle(lower_jaw, 0.3491F, 0.0F, 0.0F);
		lower_jaw.setTextureOffset(23, 70).addBox(-3.5F, 0.05F, -8.6F, 7.0F, 3.0F, 9.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(-3.4F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(-1.5F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(0.5F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(2.4F, -0.9F, -8.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(2.4F, -0.9F, -6.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		lower_jaw.setTextureOffset(124, 0).addBox(-3.4F, -0.9F, -6.4F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		thigh2 = new ModelRenderer(this);
		thigh2.setRotationPoint(-9.0F, 3.0F, -4.0F);
		thigh2.setTextureOffset(6, 27).addBox(0.0F, -5.0F, -4.0F, 5.0F, 14.0F, 9.0F, 0.0F, false);

		knee2 = new ModelRenderer(this);
		knee2.setRotationPoint(2.5F, 8.0F, 0.0F);
		thigh2.addChild(knee2);
		knee2.setTextureOffset(58, 67).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 5.0F, 10.0F, 0.0F, false);

		shin2 = new ModelRenderer(this);
		shin2.setRotationPoint(0.0F, 3.0F, 5.5F);
		knee2.addChild(shin2);
		shin2.setTextureOffset(67, 70).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 9.0F, 3.0F, 0.0F, false);

		feet2 = new ModelRenderer(this);
		feet2.setRotationPoint(0.0F, 8.0F, -0.5F);
		shin2.addChild(feet2);
		feet2.setTextureOffset(51, 70).addBox(-3.5F, 0.0F, -7.0F, 7.0F, 2.0F, 10.0F, 0.0F, false);
		feet2.setTextureOffset(0, 125).addBox(2.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		feet2.setTextureOffset(0, 125).addBox(-3.0F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
		feet2.setTextureOffset(0, 125).addBox(-0.5F, 1.0F, -9.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		scallop = new ModelRenderer(this);
		scallop.setRotationPoint(-0.5F, -16.5F, -29.5F);
		setRotationAngle(scallop, -0.5236F, 0.0F, 0.0F);
		scallop.setTextureOffset(120, 123).addBox(-1.0F, -0.5F, -0.5F, 3.0F, 4.0F, 1.0F, 0.0F, false);

		scallop1 = new ModelRenderer(this);
		scallop1.setRotationPoint(2.5F, 0.0F, 2.0F);
		scallop.addChild(scallop1);
		setRotationAngle(scallop1, -0.3491F, 0.0F, 0.0F);
		scallop1.setTextureOffset(122, 124).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		scallop2 = new ModelRenderer(this);
		scallop2.setRotationPoint(-2.5F, 0.0F, 2.0F);
		scallop.addChild(scallop2);
		setRotationAngle(scallop2, -0.3491F, 0.0F, 0.0F);
		scallop2.setTextureOffset(122, 124).addBox(-0.5F, -1.5F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		thigh1.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		thigh2.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		scallop.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.thigh2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.thigh1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}