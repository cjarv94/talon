package com.cjarv94.talon.mobs;

import com.cjarv94.talon.TalonClient;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class OwlEntityRenderer extends MobEntityRenderer<OwlEntity, OwlEntityModel> {
	
	public OwlEntityRenderer(EntityRendererFactory.Context context) {
		super(context, new OwlEntityModel(context.getPart(TalonClient.MODEL_OWL_LAYER)), 0.5f);
	}

	@Override
	public Identifier getTexture(OwlEntity entity) {
		return new Identifier("talon", "textures/owl.png");
	}
}
