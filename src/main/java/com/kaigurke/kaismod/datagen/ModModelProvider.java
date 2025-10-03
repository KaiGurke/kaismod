package com.kaigurke.kaismod.datagen;

import com.kaigurke.kaismod.block.ModBlocks;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
//import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider{
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerLog(ModBlocks.LIGHT_MANGROVE_LOG_KEY).log(ModBlocks.LIGHT_MANGROVE_LOG_KEY).wood(ModBlocks.LIGHT_MANGROVE_WOOD_KEY);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG_KEY).log(ModBlocks.STRIPPED_LIGHT_MANGROVE_LOG_KEY).wood(ModBlocks.STRIPPED_LIGHT_MANGROVE_WOOD_KEY);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_MANGROVE_PLANKS_KEY)
        .stairs(ModBlocks.LIGHT_MANGROVE_STAIRS_KEY)
        .slab(ModBlocks.LIGHT_MANGROVE_SLAB_KEY)
        .fence(ModBlocks.LIGHT_MANGROVE_FENCE_KEY)
        .fenceGate(ModBlocks.LIGHT_MANGROVE_FENCE_GATE_KEY)
        .button(ModBlocks.LIGHT_MANGROVE_BUTTON_KEY)
        .pressurePlate(ModBlocks.LIGHT_MANGROVE_PRESSURE_PLATE_KEY);
        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_MANGROVE_DOOR_KEY);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_MANGROVE_TRAPDOOR_KEY);

        blockStateModelGenerator.registerLog(ModBlocks.GREEN_MANGROVE_LOG_KEY).log(ModBlocks.GREEN_MANGROVE_LOG_KEY).wood(ModBlocks.GREEN_MANGROVE_WOOD_KEY);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_GREEN_MANGROVE_LOG_KEY).log(ModBlocks.STRIPPED_GREEN_MANGROVE_LOG_KEY).wood(ModBlocks.STRIPPED_GREEN_MANGROVE_WOOD_KEY);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_MANGROVE_PLANKS_KEY)
        .stairs(ModBlocks.GREEN_MANGROVE_STAIRS_KEY)
        .slab(ModBlocks.GREEN_MANGROVE_SLAB_KEY)
        .fence(ModBlocks.GREEN_MANGROVE_FENCE_KEY)
        .fenceGate(ModBlocks.GREEN_MANGROVE_FENCE_GATE_KEY)
        .button(ModBlocks.GREEN_MANGROVE_BUTTON_KEY)
        .pressurePlate(ModBlocks.GREEN_MANGROVE_PRESSURE_PLATE_KEY);
        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_MANGROVE_DOOR_KEY);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GREEN_MANGROVE_TRAPDOOR_KEY);

        blockStateModelGenerator.registerLog(ModBlocks.SAKURA_LOG_KEY).log(ModBlocks.SAKURA_LOG_KEY).wood(ModBlocks.SAKURA_WOOD_KEY);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SAKURA_LOG_KEY).log(ModBlocks.STRIPPED_SAKURA_LOG_KEY).wood(ModBlocks.STRIPPED_SAKURA_WOOD_KEY);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAKURA_PLANKS_KEY)
        .stairs(ModBlocks.SAKURA_STAIRS_KEY)
        .slab(ModBlocks.SAKURA_SLAB_KEY)
        .fence(ModBlocks.SAKURA_FENCE_KEY)
        .fenceGate(ModBlocks.SAKURA_FENCE_GATE_KEY)
        .button(ModBlocks.SAKURA_BUTTON_KEY)
        .pressurePlate(ModBlocks.SAKURA_PRESSURE_PLATE_KEY);
        blockStateModelGenerator.registerDoor(ModBlocks.SAKURA_DOOR_KEY);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAKURA_TRAPDOOR_KEY);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LAVENDER_PLANKS_KEY);
        
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PLACEHOLDER_MUD_BRICKS_KEY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LIMESTONE_KEY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ROSE_WOOL_KEY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SPRING_GREEN_WOOL_KEY);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ORANGE_PLACEHOLDER_KEY);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREYBOX_PLACEHOLDER_KEY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
    
}
