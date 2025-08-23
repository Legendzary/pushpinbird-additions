package net.legendzary.ppbmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.legendzary.ppbmod.block.ModBlocks;
import net.legendzary.ppbmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUSHPIBALD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUSHPIBALD_ORE_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PUSHPIBALD_ORE_DEEPSLATE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PUSHPIBALD, Models.GENERATED);

        itemModelGenerator.register(ModItems.PUSHPIBALD_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUSHPIBALD_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUSHPIBALD_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUSHPIBALD_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.PUSHPIBALD_HOE, Models.HANDHELD);
    }
}
