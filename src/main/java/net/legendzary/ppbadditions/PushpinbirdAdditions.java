package net.legendzary.ppbadditions;

import net.fabricmc.api.ModInitializer;

import net.legendzary.ppbadditions.block.ModBlocks;
import net.legendzary.ppbadditions.entity.ModEntities;
import net.legendzary.ppbadditions.item.ModItemGroups;
import net.legendzary.ppbadditions.item.ModItems;
import net.legendzary.ppbadditions.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PushpinbirdAdditions implements ModInitializer {
	public static final String MOD_ID = "ppbadditions";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
        ModEntities.registerModEntities();
        ModWorldGeneration.generateModWorldGen();
	}
}