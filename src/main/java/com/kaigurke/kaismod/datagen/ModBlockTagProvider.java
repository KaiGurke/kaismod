package com.kaigurke.kaismod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import com.kaigurke.kaismod.block.ModBlocks;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    
    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
            .add(ModBlocks.GREEN_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_GREEN_MANGROVE_LOG)
            .add(ModBlocks.GREEN_MANGROVE_WOOD)
            .add(ModBlocks.STRIPPED_GREEN_MANGROVE_WOOD)
            .add(ModBlocks.GREEN_MANGROVE_PLANKS)
            .add(ModBlocks.GREEN_MANGROVE_BUTTON)
            .add(ModBlocks.GREEN_MANGROVE_PRESSURE_PLATE)
            .add(ModBlocks.GREEN_MANGROVE_SLAB)
            .add(ModBlocks.GREEN_MANGROVE_FENCE)
            .add(ModBlocks.GREEN_MANGROVE_FENCE_GATE)
            .add(ModBlocks.GREEN_MANGROVE_DOOR)
            .add(ModBlocks.GREEN_MANGROVE_TRAPDOOR)
            .add(ModBlocks.GREEN_MANGROVE_STAIRS)
            .add(ModBlocks.LIGHT_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG)
            .add(ModBlocks.LIGHT_MANGROVE_WOOD)
            .add(ModBlocks.STRIPPED_LIGHT_MANGROVE_WOOD)
            .add(ModBlocks.LIGHT_MANGROVE_PLANKS)
            .add(ModBlocks.LIGHT_MANGROVE_BUTTON)
            .add(ModBlocks.LIGHT_MANGROVE_PRESSURE_PLATE)
            .add(ModBlocks.LIGHT_MANGROVE_SLAB)
            .add(ModBlocks.LIGHT_MANGROVE_FENCE)
            .add(ModBlocks.LIGHT_MANGROVE_FENCE_GATE)
            .add(ModBlocks.LIGHT_MANGROVE_DOOR)
            .add(ModBlocks.LIGHT_MANGROVE_TRAPDOOR)
            .add(ModBlocks.LIGHT_MANGROVE_STAIRS);
        getOrCreateTagBuilder(BlockTags.PLANKS)
            .add(ModBlocks.GREEN_MANGROVE_PLANKS)
            .add(ModBlocks.LIGHT_MANGROVE_PLANKS);
        getOrCreateTagBuilder(BlockTags.LOGS)
            .add(ModBlocks.GREEN_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_GREEN_MANGROVE_LOG)
            .add(ModBlocks.LIGHT_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
            .add(ModBlocks.GREEN_MANGROVE_BUTTON)
            .add(ModBlocks.LIGHT_MANGROVE_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
            .add(ModBlocks.GREEN_MANGROVE_DOOR)
            .add(ModBlocks.LIGHT_MANGROVE_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)  
            .add(ModBlocks.GREEN_MANGROVE_FENCE)
            .add(ModBlocks.LIGHT_MANGROVE_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
            .add(ModBlocks.GREEN_MANGROVE_PRESSURE_PLATE)
            .add(ModBlocks.LIGHT_MANGROVE_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
            .add(ModBlocks.GREEN_MANGROVE_SLAB)
            .add(ModBlocks.LIGHT_MANGROVE_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
            .add(ModBlocks.GREEN_MANGROVE_STAIRS)
            .add(ModBlocks.LIGHT_MANGROVE_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
            .add(ModBlocks.GREEN_MANGROVE_TRAPDOOR)
            .add(ModBlocks.LIGHT_MANGROVE_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
            .add(ModBlocks.GREEN_MANGROVE_FENCE_GATE)
            .add(ModBlocks.LIGHT_MANGROVE_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
            .add(ModBlocks.GREEN_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_GREEN_MANGROVE_LOG)
            .add(ModBlocks.LIGHT_MANGROVE_LOG)
            .add(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG);
        getOrCreateTagBuilder(BlockTags.ALL_SIGNS)
            .add(ModBlocks.GREEN_MANGROVE_SIGN)
            .add(ModBlocks.LIGHT_MANGROVE_SIGN);
        getOrCreateTagBuilder(BlockTags.ALL_HANGING_SIGNS)
            .add(ModBlocks.GREEN_MANGROVE_HANGING_SIGN)
            .add(ModBlocks.LIGHT_MANGROVE_HANGING_SIGN);
    }
}
