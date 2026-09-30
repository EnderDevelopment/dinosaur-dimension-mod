package com.gbrimareco27.dinosaurdimensionmod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.world.World;

public
class BossDinosaurEntity extends MobEntity {
    protected BossDinosaurEntity(EntityType<? extends MobEntity> entityType, World world) {
        super(entityType, world);
    }

    // Add boss-specific methods and behaviors here
}
