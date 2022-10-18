// Made with Blockbench 4.4.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelrocketmodel extends EntityModel<Entity> {
	private final ModelRenderer Fuselage;
	private final ModelRenderer engine;
	private final ModelRenderer cabin;
	private final ModelRenderer seat_back_r1;
	private final ModelRenderer pik;

	public Modelrocketmodel() {
		textureWidth = 64;
		textureHeight = 64;

		Fuselage = new ModelRenderer(this);
		Fuselage.setRotationPoint(-0.5F, -13.5455F, -2.0F);
		Fuselage.setTextureOffset(0, 0).addBox(-4.5F, 23.5455F, -3.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
		Fuselage.setTextureOffset(0, 0).addBox(-4.5F, 19.5455F, -3.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
		Fuselage.setTextureOffset(150, 150).addBox(-5.5F, 15.5455F, -4.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
		Fuselage.setTextureOffset(0, 21).addBox(-4.5F, 11.5455F, -3.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
		Fuselage.setTextureOffset(150, 150).addBox(-5.5F, 7.5455F, -4.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
		Fuselage.setTextureOffset(18, 0).addBox(-4.5F, 3.5455F, -3.0F, 10.0F, 4.0F, 10.0F, 0.0F, false);
		Fuselage.setTextureOffset(150, 150).addBox(-5.5F, -0.4545F, -4.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);

		engine = new ModelRenderer(this);
		engine.setRotationPoint(0.0F, 0.0F, 0.0F);
		Fuselage.addChild(engine);
		engine.setTextureOffset(150, 150).addBox(5.5F, 21.5455F, 0.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-1.5F, 21.5455F, 7.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-6.5F, 21.5455F, 0.0F, 2.0F, 6.0F, 4.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-1.5F, 21.5455F, -5.0F, 4.0F, 6.0F, 2.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-7.5F, 27.5455F, -1.0F, 3.0F, 10.0F, 6.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(5.5F, 27.5455F, -1.0F, 3.0F, 10.0F, 6.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-2.5F, 27.5455F, -6.0F, 6.0F, 10.0F, 3.0F, 0.0F, false);
		engine.setTextureOffset(150, 150).addBox(-2.5F, 27.5455F, 7.0F, 6.0F, 10.0F, 3.0F, 0.0F, false);

		cabin = new ModelRenderer(this);
		cabin.setRotationPoint(-0.5F, -50.4063F, -1.125F);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 27.4063F, 6.125F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 23.4063F, 6.125F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 19.4063F, 6.125F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 15.4063F, 6.125F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 27.4063F, -3.875F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 15.4063F, -3.875F, 10.0F, 4.0F, 0.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 27.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 23.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 19.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(-4.5F, 15.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(4.5F, 27.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(4.5F, 23.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(4.5F, 19.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(0, 0).addBox(4.5F, 15.4063F, -3.875F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(12, 0).addBox(-4.5F, 31.4063F, -3.875F, 10.0F, 5.0F, 10.0F, 0.0F, false);
		cabin.setTextureOffset(4, 51).addBox(-2.5F, 29.4063F, -0.875F, 6.0F, 1.0F, 4.0F, 0.0F, false);

		seat_back_r1 = new ModelRenderer(this);
		seat_back_r1.setRotationPoint(0.5F, 20.1563F, 0.625F);
		cabin.addChild(seat_back_r1);
		setRotationAngle(seat_back_r1, -1.5708F, 0.0F, 0.0F);
		seat_back_r1.setTextureOffset(2, 49).addBox(-3.0F, -2.5F, 3.25F, 6.0F, 1.0F, 6.0F, 0.0F, false);

		pik = new ModelRenderer(this);
		pik.setRotationPoint(0.0F, 29.692F, -0.875F);
		cabin.addChild(pik);
		pik.setTextureOffset(150, 150).addBox(-4.5F, -16.2857F, -3.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);
		pik.setTextureOffset(150, 150).addBox(-3.5F, -18.2857F, -2.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		pik.setTextureOffset(150, 150).addBox(-2.5F, -20.2857F, -1.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		pik.setTextureOffset(150, 150).addBox(-1.5F, -22.2857F, 0.0F, 4.0F, 2.0F, 4.0F, 0.0F, false);
		pik.setTextureOffset(150, 150).addBox(-0.5F, -24.2857F, 1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Fuselage.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		cabin.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}