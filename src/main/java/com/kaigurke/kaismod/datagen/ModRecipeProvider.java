package com.kaigurke.kaismod.datagen;

import java.util.concurrent.CompletableFuture;

import com.kaigurke.kaismod.block.ModBlocks;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

public class ModRecipeProvider extends FabricRecipeProvider{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
	protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
		return new RecipeGenerator(registryLookup, exporter) {
			@Override
			public void generate() {
				// Recipes for Kaigrove Planks
				createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.KAIGROVE_PLANKS_KEY, 4)
					.input(ModBlocks.KAIGROVE_LOG_KEY)
					.criterion(hasItem(ModBlocks.KAIGROVE_LOG_KEY), conditionsFromItem(ModBlocks.KAIGROVE_LOG_KEY))
					.offerTo(exporter);

				// Button recipe for Kaigrove Planks
				createButtonRecipe(ModBlocks.KAIGROVE_BUTTON_KEY, Ingredient.ofItems(ModBlocks.KAIGROVE_PLANKS_KEY))
					.criterion(hasItem(ModBlocks.KAIGROVE_PLANKS_KEY), conditionsFromItem(ModBlocks.KAIGROVE_PLANKS_KEY))
					.offerTo(exporter);

				// Recipes for Light Mangrove Planks
				createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_MANGROVE_PLANKS_KEY, 4)
					.input(ModBlocks.LIGHT_MANGROVE_LOG_KEY)
					.criterion(hasItem(ModBlocks.LIGHT_MANGROVE_LOG_KEY), conditionsFromItem(ModBlocks.LIGHT_MANGROVE_LOG_KEY))
					.offerTo(exporter);
			}
		};
	}

	@Override
	public String getName() {
		return "ModRecipeProvider";
	}

}
