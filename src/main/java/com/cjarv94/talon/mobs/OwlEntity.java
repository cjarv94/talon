package com.cjarv94.talon.mobs;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public class OwlEntity extends PathAwareEntity {
	public OwlEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
		super(entityType, world);
	}
}