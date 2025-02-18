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

        blockStateModelGenerator.registerLog(ModBlocks.KAIGROVE_LOG_KEY).log(ModBlocks.KAIGROVE_LOG_KEY).wood(ModBlocks.KAIGROVE_WOOD_KEY);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_KAIGROVE_LOG_KEY).log(ModBlocks.STRIPPED_KAIGROVE_LOG_KEY).wood(ModBlocks.STRIPPED_KAIGROVE_WOOD_KEY);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.KAIGROVE_PLANKS_KEY)
        .stairs(ModBlocks.KAIGROVE_STAIRS_KEY)
        .slab(ModBlocks.KAIGROVE_SLAB_KEY)
        .fence(ModBlocks.KAIGROVE_FENCE_KEY)
        .fenceGate(ModBlocks.KAIGROVE_FENCE_GATE_KEY)
        .button(ModBlocks.KAIGROVE_BUTTON_KEY)
        .pressurePlate(ModBlocks.KAIGROVE_PRESSURE_PLATE_KEY);


        blockStateModelGenerator.registerDoor(ModBlocks.KAIGROVE_DOOR_KEY);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.KAIGROVE_TRAPDOOR_KEY);
        
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
    
}
