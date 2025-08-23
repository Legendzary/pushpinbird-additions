package net.legendzary.ppbmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.legendzary.ppbmod.block.ModBlocks;
import net.legendzary.ppbmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> PUSHPIN_SMELTABLES = List.of(ModBlocks.PUSHPIBALD_ORE_STONE, ModBlocks.PUSHPIBALD_ORE_DEEPSLATE);

        offerSmelting(exporter, PUSHPIN_SMELTABLES, RecipeCategory.MISC, ModItems.PUSHPIBALD, 0.25f, 200, "PUSHPIBALD");
        offerBlasting(exporter, PUSHPIN_SMELTABLES, RecipeCategory.MISC, ModItems.PUSHPIBALD, 0.25f, 100, "PUSHPIBALD");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.PUSHPIBALD, RecipeCategory.DECORATIONS, ModBlocks.PUSHPIBALD_BLOCK);

/*      ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PUSHPIBALD_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.PUSHPIN)
                .criterion(hasItem(ModItems.PUSHPIN), conditionsFromItem(ModItems.PUSHPIN))
                .offerTo(exporter);*/

        ShapelessRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.PUSHPIN, 4)
                .input(Items.RED_DYE)
                .input(Items.IRON_INGOT)
                .criterion(hasItem(ModBlocks.PUSHPIBALD_BLOCK), conditionsFromItem(ModBlocks.PUSHPIBALD_BLOCK))
                .offerTo(exporter);
    }
}
