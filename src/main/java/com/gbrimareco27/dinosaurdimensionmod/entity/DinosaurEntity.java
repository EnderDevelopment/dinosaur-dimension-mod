package com.gbrimareco27.dinosaurdimensionmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public
class DinosaurEntity extends MobEntity {
    protected DinosaurEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    // Add dinosaur-specific methods and behaviors here
}
