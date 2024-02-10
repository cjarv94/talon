package com.cjarv94.talon;

import com.cjarv94.talon.mobs.OwlEntityModel;
import com.cjarv94.talon.mobs.OwlEntityRenderer;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class TalonClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_OWL_LAYER = new EntityModelLayer(new Identifier("talon", "owl_model"), "main");

	@Override
	public void onInitializeClient() {
		EntityRendererRegistry.register(Talon.OWL, (context) -> {
		return new OwlEntityRenderer(context);
		});

		EntityModelLayerRegistry.registerModelLayer(MODEL_OWL_LAYER, OwlEntityModel::getTexturedModelData);
	}
}