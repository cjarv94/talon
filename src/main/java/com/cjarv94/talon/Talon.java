package com.cjarv94.talon;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.minecraft.util.Identifier;
import com.cjarv94.talon.mobs.OwlEntity;

public class Talon implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "talon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	// Entities definitions
	public static final EntityType<OwlEntity> OWL = Registry.register(
			Registries.ENTITY_TYPE,
			new Identifier("talon", "owl"),
			FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, OwlEntity::new)
					.dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing talon...");

		// Initialize attributes for Entities
		FabricDefaultAttributeRegistry.register(OWL, OwlEntity.createMobAttributes());
	}
}