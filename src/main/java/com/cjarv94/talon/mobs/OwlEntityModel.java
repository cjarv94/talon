// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

package com.cjarv94.talon.mobs;

import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class OwlEntityModel extends EntityModel<OwlEntity> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	private final ModelPart feet;
	private final ModelPart head;
	private final ModelPart wing1;
	private final ModelPart wing2;
	private final ModelPart bb_main;

	public OwlEntityModel(ModelPart modelPart) {
		this.feet = modelPart.getChild("feet");
		this.head = modelPart.getChild("head");
		this.wing1 = modelPart.getChild("wing1");
		this.wing2 = modelPart.getChild("wing2");
		this.bb_main = modelPart.getChild("bb_main");
	}

	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();

		modelPartData.addChild("feet", ModelPartBuilder.create().uv(14, 12).cuboid(-1.0F, -2.0F, 0.0F, 1.0F, 2.0F, 1.0F)
		.uv(14, 12).cuboid(-1.0F, -2.0F, 3.0F, 1.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		modelPartData.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -14.0F, -1.0F, 7.0F, 5.0F, 6.0F)
		.uv(0, 3).cuboid(-5.0F, -14.0F, -1.0F, 1.0F, 1.0F, 2.0F)
		.uv(0, 1).cuboid(-5.0F, -14.0F, -2.0F, 2.0F, 1.0F, 1.0F)
		.uv(0, 1).cuboid(-5.0F, -14.0F, 5.0F, 2.0F, 1.0F, 1.0F)
		.uv(0, 3).cuboid(-5.0F, -14.0F, 3.0F, 1.0F, 1.0F, 2.0F)
		.uv(18, 11).cuboid(-5.0F, -14.0F, 1.0F, 1.0F, 5.0F, 2.0F), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		modelPartData.addChild("wing1", ModelPartBuilder.create().uv(28, 0).cuboid(-2.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F)
		.uv(24, 1).cuboid(-3.0F, -8.0F, 4.0F, 1.0F, 4.0F, 1.0F)
		.uv(20, 2).cuboid(-4.0F, -8.0F, 4.0F, 1.0F, 3.0F, 1.0F), ModelTransform.pivot(2.0F, 24.0F, 1.0F));

		modelPartData.addChild("wing2", ModelPartBuilder.create().uv(28, 0).cuboid(-2.0F, -8.0F, 4.0F, 1.0F, 5.0F, 1.0F)
		.uv(24, 1).cuboid(-3.0F, -8.0F, 4.0F, 1.0F, 4.0F, 1.0F)
		.uv(20, 2).cuboid(-4.0F, -8.0F, 4.0F, 1.0F, 3.0F, 1.0F), ModelTransform.pivot(2.0F, 24.0F, -6.0F));

		modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 15).cuboid(-3.0F, -9.0F, -1.0F, 5.0F, 7.0F, 6.0F), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		return TexturedModelData.of(modelData, 32, 32);
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green,
			float blue, float alpha) {
		feet.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		wing1.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		wing2.render(matrices, vertices, light, overlay, red, green, blue, alpha);
		bb_main.render(matrices, vertices, light, overlay, red, green, blue, alpha);
	}

	@Override
	public void setAngles(OwlEntity var1, float var2, float var3, float var4, float var5, float var6) {
	}
}