package com.kaigurke.kaismod;

import com.kaigurke.kaismod.datagen.ModBlockTagProvider;
import com.kaigurke.kaismod.datagen.ModLootTableProvider;
import com.kaigurke.kaismod.datagen.ModModelProvider;
import com.kaigurke.kaismod.datagen.ModRecipeProvider;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class KaisModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		
		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
