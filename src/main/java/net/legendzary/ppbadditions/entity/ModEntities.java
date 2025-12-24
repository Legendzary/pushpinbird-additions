package net.legendzary.ppbadditions.entity;

import net.legendzary.ppbadditions.PushpinbirdAdditions;
import net.legendzary.ppbadditions.entity.custom.PushpinProjectileEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<PushpinProjectileEntity> PUSHPIN = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(PushpinbirdAdditions.MOD_ID, "pushpin"),
            EntityType.Builder.<PushpinProjectileEntity>create(PushpinProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build());


    public static void registerModEntities() {
        PushpinbirdAdditions.LOGGER.info("Registering Mod Entities for " + PushpinbirdAdditions.MOD_ID);
    }
}
