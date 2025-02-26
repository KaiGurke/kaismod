package com.kaigurke.kaismod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

import com.kaigurke.kaismod.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    
    @Override
    public void generate() {
        addDrop(ModBlocks.STRIPPED_KAIGROVE_LOG_KEY);
        addDrop(ModBlocks.KAIGROVE_LOG_KEY);
        addDrop(ModBlocks.STRIPPED_KAIGROVE_WOOD_KEY);
        addDrop(ModBlocks.KAIGROVE_WOOD_KEY);
        addDrop(ModBlocks.KAIGROVE_PLANKS_KEY);
        addDrop(ModBlocks.KAIGROVE_BUTTON_KEY);
        addDrop(ModBlocks.KAIGROVE_PRESSURE_PLATE_KEY);
        addDrop(ModBlocks.KAIGROVE_SLAB_KEY, slabDrops(ModBlocks.KAIGROVE_SLAB_KEY));
        addDrop(ModBlocks.KAIGROVE_FENCE_KEY);
        addDrop(ModBlocks.KAIGROVE_FENCE_GATE_KEY);
        addDrop(ModBlocks.KAIGROVE_DOOR_KEY, doorDrops(ModBlocks.KAIGROVE_DOOR_KEY));
        addDrop(ModBlocks.KAIGROVE_TRAPDOOR_KEY);
        addDrop(ModBlocks.KAIGROVE_STAIRS_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_BUTTON_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_PRESSURE_PLATE_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_SLAB_KEY, slabDrops(ModBlocks.LIGHT_MANGROVE_SLAB_KEY));
        addDrop(ModBlocks.LIGHT_MANGROVE_FENCE_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_FENCE_GATE_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_DOOR_KEY, doorDrops(ModBlocks.LIGHT_MANGROVE_DOOR_KEY));
        addDrop(ModBlocks.LIGHT_MANGROVE_TRAPDOOR_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_STAIRS_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_SIGN_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_HANGING_SIGN_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_PLANKS_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_LOG_KEY);
        addDrop(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG_KEY);
        addDrop(ModBlocks.LIGHT_MANGROVE_WOOD_KEY);
        addDrop(ModBlocks.LIMESTONE_KEY);
        addDrop(ModBlocks.PLACEHOLDER_MUD_BRICKS_KEY);
        addDrop(ModBlocks.ROSE_WOOL_KEY);
        addDrop(ModBlocks.SAKURA_PLANKS_KEY);
        addDrop(ModBlocks.SPRING_GREEN_WOOL_KEY);
        addDrop(ModBlocks.LAVENDER_PLANKS_KEY);
    }
}
