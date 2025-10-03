package com.kaigurke.kaismod.block;

import com.kaigurke.kaismod.KaisMod;
import com.kaigurke.kaismod.item.ModItems;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
	public static Block register(Block block, RegistryKey<Block> blockKey, boolean shouldRegisterItem) {
		// Sometimes, you may not want to register an item for the block.
		// Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
		if (shouldRegisterItem) {
			// Items need to be registered with a different type of registry key, but the ID
			// can be the same.
			RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());

			BlockItem blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
			Registry.register(Registries.ITEM, itemKey, blockItem);
		}

		return Registry.register(Registries.BLOCK, blockKey, block);
	}

    // 	  WOOD TYPES

	 // Green Mangrove
    public static final RegistryKey<Block> GREEN_MANGROVE_PLANKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_planks")
    );

    public static final Block GREEN_MANGROVE_PLANKS_KEY = register(
		    new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).registryKey(GREEN_MANGROVE_PLANKS).sounds(BlockSoundGroup.WOOD)),
		    GREEN_MANGROVE_PLANKS,
		    true
    );

	public static final RegistryKey<Block> GREEN_MANGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_log")
	);

	public static final Block GREEN_MANGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)
						.registryKey(GREEN_MANGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), GREEN_MANGROVE_LOG, true
	);

	public static final RegistryKey<Block> STRIPPED_GREEN_MANGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_green_mangrove_log")
	);

	public static final Block STRIPPED_GREEN_MANGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)
						.registryKey(STRIPPED_GREEN_MANGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), STRIPPED_GREEN_MANGROVE_LOG, true
	);

	public static final RegistryKey<Block> GREEN_MANGROVE_STAIRS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_stairs")
    );

	public static final Block GREEN_MANGROVE_STAIRS_KEY = register(
			new StairsBlock(ModBlocks.GREEN_MANGROVE_PLANKS_KEY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_STAIRS).registryKey(GREEN_MANGROVE_STAIRS).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_STAIRS,
			true
	);

	public static final RegistryKey<Block> GREEN_MANGROVE_SLAB = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_slab")
    );

	public static final Block GREEN_MANGROVE_SLAB_KEY = register(
			new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB).registryKey(GREEN_MANGROVE_SLAB).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_SLAB,
			true
	);

	public static final RegistryKey<Block> GREEN_MANGROVE_BUTTON = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_button")
    );

	public static final Block GREEN_MANGROVE_BUTTON_KEY = register(
			new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(Blocks.MANGROVE_BUTTON).registryKey(GREEN_MANGROVE_BUTTON).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_BUTTON,
			true
	);

	public static final RegistryKey<Block> GREEN_MANGROVE_PRESSURE_PLATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_pressure_plate")
    );

	public static final Block GREEN_MANGROVE_PRESSURE_PLATE_KEY = register(
			new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE).registryKey(GREEN_MANGROVE_PRESSURE_PLATE).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_PRESSURE_PLATE,
			true
	);

	// Kaigrove FENCE
	public static final RegistryKey<Block> GREEN_MANGROVE_FENCE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_fence")
    );

	public static final Block GREEN_MANGROVE_FENCE_KEY = register(
			new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE).registryKey(GREEN_MANGROVE_FENCE).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_FENCE,
			true
	);

	// Kaigrove FENCE GATE
	public static final RegistryKey<Block> GREEN_MANGROVE_FENCE_GATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_fence_gate")
    );

	public static final Block GREEN_MANGROVE_FENCE_GATE_KEY = register(
			new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE).registryKey(GREEN_MANGROVE_FENCE_GATE).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_FENCE_GATE,
			true
	);

	// Kaigrove Door
	public static final RegistryKey<Block> GREEN_MANGROVE_DOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_door")
    );

	public static final Block GREEN_MANGROVE_DOOR_KEY = register(
			new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_DOOR).registryKey(GREEN_MANGROVE_DOOR).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_DOOR,
			true
	);

	// Kaigrove Trapdoor
	public static final RegistryKey<Block> GREEN_MANGROVE_TRAPDOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_trapdoor")
    );

	public static final Block GREEN_MANGROVE_TRAPDOOR_KEY = register(
			new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR).registryKey(GREEN_MANGROVE_TRAPDOOR).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_TRAPDOOR,
			true
	);

	// Kaigrove Sign
	public static final RegistryKey<Block> GREEN_MANGROVE_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_sign")
    );

	public static final Block GREEN_MANGROVE_SIGN_KEY = register(
			new SignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN).registryKey(GREEN_MANGROVE_SIGN).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_SIGN,
			true
	);

	// Kaigrove Wall Sign
	public static final RegistryKey<Block> GREEN_MANGROVE_WALL_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_wall_sign")
	);

	public static final Block GREEN_MANGROVE_WALL_SIGN_KEY = register(
		new WallSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_SIGN).registryKey(GREEN_MANGROVE_WALL_SIGN).sounds(BlockSoundGroup.WOOD)),
		GREEN_MANGROVE_WALL_SIGN,
		false
	);

	// Kaigrove Hanging Sign
	public static final RegistryKey<Block> GREEN_MANGROVE_HANGING_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_hanging_sign")
    );

	public static final Block GREEN_MANGROVE_HANGING_SIGN_KEY = register(
			new HangingSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN).registryKey(GREEN_MANGROVE_HANGING_SIGN).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_HANGING_SIGN,
			true
	);

	// Kaigrove Wall Hanging Sign
	public static final RegistryKey<Block> GREEN_MANGROVE_WALL_HANGING_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_wall_hanging_sign")
	);

	public static final Block GREEN_MANGROVE_WALL_HANGING_SIGN_KEY = register(
		new WallHangingSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_HANGING_SIGN).registryKey(GREEN_MANGROVE_WALL_HANGING_SIGN).sounds(BlockSoundGroup.WOOD)),
		GREEN_MANGROVE_WALL_HANGING_SIGN,
		false
	);
	// Kaigrove Wood
	public static final RegistryKey<Block> GREEN_MANGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "green_mangrove_wood")
    );

	public static final Block GREEN_MANGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).registryKey(GREEN_MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			GREEN_MANGROVE_WOOD,
			true
	);

	// Stripped Kaigrove Wood
	public static final RegistryKey<Block> STRIPPED_GREEN_MANGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_green_mangrove_wood")
    );

	public static final Block STRIPPED_GREEN_MANGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).registryKey(STRIPPED_GREEN_MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			STRIPPED_GREEN_MANGROVE_WOOD,
			true
	);




	//---------------------------------------------------------------------------------------------------------------------------
	// ---------------------Light Mangrove Blocks / Old Mangrove Blocks from Minecraft LIVE--------------------------------------
	//---------------------------------------------------------------------------------------------------------------------------
	// Light Mangrove Planks
	public static final RegistryKey<Block> LIGHT_MANGROVE_PLANKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_planks")
    );

    public static final Block LIGHT_MANGROVE_PLANKS_KEY = register(
		    new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).registryKey(LIGHT_MANGROVE_PLANKS).sounds(BlockSoundGroup.WOOD)),
		    LIGHT_MANGROVE_PLANKS,
		    true
    );

	// Light Mangrove Log
	public static final RegistryKey<Block> LIGHT_MANGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_log")
	);

	public static final Block LIGHT_MANGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)
						.registryKey(LIGHT_MANGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), LIGHT_MANGROVE_LOG, true
	);

	// Stripped Light Mangrove Log
	public static final RegistryKey<Block> STRIPPED_LIGHT_MANGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_light_mangrove_log")
	);

	public static final Block STRIPPED_LIGHT_MANGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)
						.registryKey(STRIPPED_LIGHT_MANGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), STRIPPED_LIGHT_MANGROVE_LOG, true
	);

	// Light Mangrove Stairs
	public static final RegistryKey<Block> LIGHT_MANGROVE_STAIRS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_stairs")
    );

	public static final Block LIGHT_MANGROVE_STAIRS_KEY = register(
			new StairsBlock(ModBlocks.LIGHT_MANGROVE_PLANKS_KEY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_STAIRS).registryKey(LIGHT_MANGROVE_STAIRS).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_STAIRS,
			true
	);

	// Light Mangrove Slab
	public static final RegistryKey<Block> LIGHT_MANGROVE_SLAB = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_slab")
    );

	public static final Block LIGHT_MANGROVE_SLAB_KEY = register(
			new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB).registryKey(LIGHT_MANGROVE_SLAB).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_SLAB,
			true
	);

	// Light Mangrove Button
	public static final RegistryKey<Block> LIGHT_MANGROVE_BUTTON = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_button")
    );

	public static final Block LIGHT_MANGROVE_BUTTON_KEY = register(
			new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(Blocks.MANGROVE_BUTTON).registryKey(LIGHT_MANGROVE_BUTTON).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_BUTTON,
			true
	);

	// Light Mangrove Pressure Plate
	public static final RegistryKey<Block> LIGHT_MANGROVE_PRESSURE_PLATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_pressure_plate")
    );

	public static final Block LIGHT_MANGROVE_PRESSURE_PLATE_KEY = register(
			new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE).registryKey(LIGHT_MANGROVE_PRESSURE_PLATE).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_PRESSURE_PLATE,
			true
	);

	// Light Mangrove FENCE
	public static final RegistryKey<Block> LIGHT_MANGROVE_FENCE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_fence")
    );

	public static final Block LIGHT_MANGROVE_FENCE_KEY = register(
			new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE).registryKey(LIGHT_MANGROVE_FENCE).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_FENCE,
			true
	);

	// Light Mangrove FENCE GATE
	public static final RegistryKey<Block> LIGHT_MANGROVE_FENCE_GATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_fence_gate")
    );

	public static final Block LIGHT_MANGROVE_FENCE_GATE_KEY = register(
			new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE).registryKey(LIGHT_MANGROVE_FENCE_GATE).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_FENCE_GATE,
			true
	);

	// Light Mangrove Door
	public static final RegistryKey<Block> LIGHT_MANGROVE_DOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_door")
    );

	public static final Block LIGHT_MANGROVE_DOOR_KEY = register(
			new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_DOOR).registryKey(LIGHT_MANGROVE_DOOR).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_DOOR,
			true
	);

	// Light Mangrove Trapdoor
	public static final RegistryKey<Block> LIGHT_MANGROVE_TRAPDOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_trapdoor")
    );

	public static final Block LIGHT_MANGROVE_TRAPDOOR_KEY = register(
			new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR).registryKey(LIGHT_MANGROVE_TRAPDOOR).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_TRAPDOOR,
			true
	);

	// Light Mangrove Sign
	public static final RegistryKey<Block> LIGHT_MANGROVE_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_sign")
    );

	public static final Block LIGHT_MANGROVE_SIGN_KEY = register(
			new SignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN).registryKey(LIGHT_MANGROVE_SIGN).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_SIGN,
			true
	);

	// Light Mangrove Wall Sign
	public static final RegistryKey<Block> LIGHT_MANGROVE_WALL_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_wall_sign")
	);
	public static final Block LIGHT_MANGROVE_WALL_SIGN_KEY = register(
		new WallSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_SIGN).registryKey(LIGHT_MANGROVE_WALL_SIGN).sounds(BlockSoundGroup.WOOD)),
		LIGHT_MANGROVE_WALL_SIGN,
		false
	);

	// Light Mangrove Hanging Sign
	public static final RegistryKey<Block> LIGHT_MANGROVE_HANGING_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_hanging_sign")
    );

	public static final Block LIGHT_MANGROVE_HANGING_SIGN_KEY = register(
			new HangingSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN).registryKey(LIGHT_MANGROVE_HANGING_SIGN).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_HANGING_SIGN,
			true
	);

	// Light Mangrove Wall Hanging Sign
	public static final RegistryKey<Block> LIGHT_MANGROVE_WALL_HANGING_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_wall_hanging_sign")
	);

	public static final Block LIGHT_MANGROVE_WALL_HANGING_SIGN_KEY = register(
		new WallHangingSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_WALL_HANGING_SIGN).registryKey(LIGHT_MANGROVE_WALL_HANGING_SIGN).sounds(BlockSoundGroup.WOOD)),
		LIGHT_MANGROVE_WALL_HANGING_SIGN,
		false
	);
	// Light Mangrove Wood
	public static final RegistryKey<Block> LIGHT_MANGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "light_mangrove_wood")
    );

	public static final Block LIGHT_MANGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).registryKey(LIGHT_MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			LIGHT_MANGROVE_WOOD,
			true
	);

	// Stripped Light Mangrove Wood
	public static final RegistryKey<Block> STRIPPED_LIGHT_MANGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_light_mangrove_wood")
    );

	public static final Block STRIPPED_LIGHT_MANGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).registryKey(STRIPPED_LIGHT_MANGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			STRIPPED_LIGHT_MANGROVE_WOOD,
			true
	);

	// Sakura

	// Sakura Planks
	public static final RegistryKey<Block> SAKURA_PLANKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_planks")
	);

	public static final Block SAKURA_PLANKS_KEY = register(
		    new Block(
				AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)
					.registryKey(SAKURA_PLANKS)
					.sounds(BlockSoundGroup.CHERRY_WOOD)
			), SAKURA_PLANKS,
		    true
	);

	public static final RegistryKey<Block> SAKURA_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_log")
	);

	public static final Block SAKURA_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)
						.registryKey(SAKURA_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), SAKURA_LOG, true
	);

	public static final RegistryKey<Block> STRIPPED_SAKURA_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_sakura_log")
	);

	public static final Block STRIPPED_SAKURA_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS)
						.registryKey(SAKURA_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), STRIPPED_SAKURA_LOG, true
	);

public static final RegistryKey<Block> SAKURA_STAIRS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_stairs")
    );

	public static final Block SAKURA_STAIRS_KEY = register(
			new StairsBlock(ModBlocks.SAKURA_PLANKS_KEY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHERRY_STAIRS).registryKey(GREEN_MANGROVE_STAIRS).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_STAIRS,
			true
	);

	public static final RegistryKey<Block> SAKURA_SLAB = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_slab")
    );

	public static final Block SAKURA_SLAB_KEY = register(
			new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_SLAB).registryKey(SAKURA_SLAB).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_SLAB,
			true
	);

	public static final RegistryKey<Block> SAKURA_BUTTON = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_button")
    );

	public static final Block SAKURA_BUTTON_KEY = register(
			new ButtonBlock(BlockSetType.CHERRY, 12, AbstractBlock.Settings.copy(Blocks.CHERRY_BUTTON).registryKey(SAKURA_BUTTON).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_BUTTON,
			true
	);

	public static final RegistryKey<Block> SAKURA_PRESSURE_PLATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_pressure_plate")
    );

	public static final Block SAKURA_PRESSURE_PLATE_KEY = register(
			new PressurePlateBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_PRESSURE_PLATE).registryKey(SAKURA_PRESSURE_PLATE).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_PRESSURE_PLATE,
			true
	);

	public static final RegistryKey<Block> SAKURA_FENCE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_fence")
    );

	public static final Block SAKURA_FENCE_KEY = register(
			new FenceBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE).registryKey(SAKURA_FENCE).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_FENCE,
			true
	);

	public static final RegistryKey<Block> SAKURA_FENCE_GATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_fence_gate")
    );

	public static final Block SAKURA_FENCE_GATE_KEY = register(
			new FenceGateBlock(WoodType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_FENCE_GATE).registryKey(SAKURA_FENCE_GATE).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_FENCE_GATE,
			true
	);

	public static final RegistryKey<Block> SAKURA_DOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_door")
    );

	public static final Block SAKURA_DOOR_KEY = register(
			new DoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_DOOR).registryKey(SAKURA_DOOR).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_DOOR,
			true
	);

	public static final RegistryKey<Block> SAKURA_TRAPDOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_trapdoor")
    );

	public static final Block SAKURA_TRAPDOOR_KEY = register(
			new TrapdoorBlock(BlockSetType.CHERRY, AbstractBlock.Settings.copy(Blocks.CHERRY_TRAPDOOR).registryKey(SAKURA_TRAPDOOR).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_TRAPDOOR,
			true
	);

	public static final RegistryKey<Block> SAKURA_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "sakura_wood")
    );

	public static final Block SAKURA_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).registryKey(SAKURA_WOOD).sounds(BlockSoundGroup.CHERRY_WOOD)),
			SAKURA_WOOD,
			true
	);

	public static final RegistryKey<Block> STRIPPED_SAKURA_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_sakura_wood")
    );

	public static final Block STRIPPED_SAKURA_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD).registryKey(STRIPPED_SAKURA_WOOD).sounds(BlockSoundGroup.CHERRY_WOOD)),
			STRIPPED_SAKURA_WOOD,
			true
	);
	// Lavender

	// Lavender Planks
	public static final RegistryKey<Block> LAVENDER_PLANKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "lavender_planks")
	);

	public static final Block LAVENDER_PLANKS_KEY = register(
		    new Block(AbstractBlock.Settings.copy(Blocks.CHERRY_PLANKS).registryKey(LAVENDER_PLANKS).sounds(BlockSoundGroup.CHERRY_WOOD)),
		    LAVENDER_PLANKS,
		    true
	);

	

	// ----------------
	// 	Stone Types
	// ----------------

	public static final RegistryKey<Block> LIMESTONE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "limestone")
	);

	public static final Block LIMESTONE_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.STONE).registryKey(LIMESTONE).sounds(BlockSoundGroup.STONE)),
		LIMESTONE,
		true
	);

	public static final RegistryKey<Block> PLACEHOLDER_MUD_BRICKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "placeholder_mud_bricks")
	);

	public static final Block PLACEHOLDER_MUD_BRICKS_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.MUD_BRICKS).registryKey(PLACEHOLDER_MUD_BRICKS).sounds(BlockSoundGroup.MUD_BRICKS)),
		PLACEHOLDER_MUD_BRICKS,
		true
	);

	// ----------------
	// 	OTHER BLOCKS
	// ----------------

	public static final RegistryKey<Block> SPRING_GREEN_WOOL = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "spring_green_wool")
	);

	public static final Block SPRING_GREEN_WOOL_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).registryKey(SPRING_GREEN_WOOL).sounds(BlockSoundGroup.WOOL)),
		SPRING_GREEN_WOOL,
		true
	);

	public static final RegistryKey<Block> ROSE_WOOL = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "rose_wool")
	);

	public static final Block ROSE_WOOL_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).registryKey(ROSE_WOOL).sounds(BlockSoundGroup.WOOL)),
		ROSE_WOOL,
		true
	);
	//DEV BLOCKS
	public static final RegistryKey<Block> ORANGE_PLACEHOLDER = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "orange_placeholder")
	);

	public static final Block ORANGE_PLACEHOLDER_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK).registryKey(ORANGE_PLACEHOLDER).sounds(BlockSoundGroup.STONE)),
		ORANGE_PLACEHOLDER,
		true
	);

	public static final RegistryKey<Block> GREYBOX_PLACEHOLDER = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "greybox_placeholder")
	);

	public static final Block GREYBOX_PLACEHOLDER_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.BEDROCK).registryKey(GREYBOX_PLACEHOLDER).sounds(BlockSoundGroup.STONE)),
		GREYBOX_PLACEHOLDER,
		true
	);

	public static final RegistryKey<Block> TILES_BLOCK = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "tiles_block")
	);

	public static final Block TILES_BLOCK_KEY = register(
		new Block(AbstractBlock.Settings.copy(Blocks.STONE).registryKey(TILES_BLOCK).sounds(BlockSoundGroup.STONE)),
		TILES_BLOCK,
		true
	);

    public static void initialize() {
        KaisMod.LOGGER.info("Registering mod blocks for " + KaisMod.MOD_ID);

		StrippableBlockRegistry.register(GREEN_MANGROVE_LOG_KEY, STRIPPED_GREEN_MANGROVE_LOG_KEY);
		StrippableBlockRegistry.register(GREEN_MANGROVE_WOOD_KEY, STRIPPED_GREEN_MANGROVE_WOOD_KEY);
		StrippableBlockRegistry.register(LIGHT_MANGROVE_LOG_KEY, STRIPPED_LIGHT_MANGROVE_LOG_KEY);
		StrippableBlockRegistry.register(LIGHT_MANGROVE_WOOD_KEY, STRIPPED_LIGHT_MANGROVE_WOOD_KEY);
		StrippableBlockRegistry.register(SAKURA_LOG_KEY, STRIPPED_SAKURA_LOG_KEY);
		StrippableBlockRegistry.register(SAKURA_WOOD_KEY, STRIPPED_SAKURA_WOOD_KEY);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			// Kaigrove
            entries.add(GREEN_MANGROVE_LOG_KEY.asItem());
			entries.add(STRIPPED_GREEN_MANGROVE_LOG_KEY.asItem());
			entries.add(GREEN_MANGROVE_WOOD_KEY.asItem());
			entries.add(STRIPPED_GREEN_MANGROVE_WOOD_KEY.asItem());
			entries.add(GREEN_MANGROVE_PLANKS_KEY.asItem());
			entries.add(GREEN_MANGROVE_STAIRS_KEY.asItem());
			entries.add(GREEN_MANGROVE_SLAB_KEY.asItem());
			entries.add(GREEN_MANGROVE_FENCE_KEY.asItem());
			entries.add(GREEN_MANGROVE_FENCE_GATE_KEY.asItem());
			entries.add(GREEN_MANGROVE_DOOR_KEY.asItem());
			entries.add(GREEN_MANGROVE_TRAPDOOR_KEY.asItem());
			entries.add(GREEN_MANGROVE_PRESSURE_PLATE_KEY.asItem());
			entries.add(GREEN_MANGROVE_BUTTON_KEY.asItem());
			
			// Light Mangrove
			entries.add(LIGHT_MANGROVE_LOG_KEY.asItem());
			entries.add(STRIPPED_LIGHT_MANGROVE_LOG_KEY.asItem());
			entries.add(LIGHT_MANGROVE_WOOD_KEY.asItem());
			entries.add(STRIPPED_LIGHT_MANGROVE_WOOD_KEY.asItem());
			entries.add(LIGHT_MANGROVE_PLANKS_KEY.asItem());
			entries.add(LIGHT_MANGROVE_STAIRS_KEY.asItem());
			entries.add(LIGHT_MANGROVE_SLAB_KEY.asItem());
			entries.add(LIGHT_MANGROVE_FENCE_KEY.asItem());
			entries.add(LIGHT_MANGROVE_FENCE_GATE_KEY.asItem());
			entries.add(LIGHT_MANGROVE_DOOR_KEY.asItem());
			entries.add(LIGHT_MANGROVE_TRAPDOOR_KEY.asItem());
			entries.add(LIGHT_MANGROVE_PRESSURE_PLATE_KEY.asItem());
			entries.add(LIGHT_MANGROVE_BUTTON_KEY.asItem());

			// Sakura
			entries.add(SAKURA_LOG_KEY.asItem());
			entries.add(STRIPPED_SAKURA_LOG_KEY.asItem());
			entries.add(SAKURA_WOOD_KEY.asItem());
			entries.add(STRIPPED_SAKURA_WOOD_KEY.asItem());
			entries.add(SAKURA_PLANKS_KEY.asItem());
			entries.add(SAKURA_STAIRS_KEY.asItem());
			entries.add(SAKURA_SLAB_KEY.asItem());
			entries.add(SAKURA_FENCE_KEY.asItem());
			entries.add(SAKURA_FENCE_GATE_KEY.asItem());
			entries.add(SAKURA_DOOR_KEY.asItem());
			entries.add(SAKURA_TRAPDOOR_KEY.asItem());
			entries.add(SAKURA_PRESSURE_PLATE_KEY.asItem());
			entries.add(SAKURA_BUTTON_KEY.asItem());
			
			// Lavender
			entries.add(LAVENDER_PLANKS_KEY.asItem());

			// Other
			entries.add(TILES_BLOCK_KEY.asItem());
			entries.add(LIMESTONE_KEY.asItem());
			entries.add(PLACEHOLDER_MUD_BRICKS_KEY.asItem());
        });

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.add(GREEN_MANGROVE_SIGN_KEY.asItem());
            entries.add(LIGHT_MANGROVE_SIGN_KEY.asItem());
			entries.add(GREEN_MANGROVE_HANGING_SIGN_KEY.asItem());
			entries.add(LIGHT_MANGROVE_HANGING_SIGN_KEY.asItem());
        });

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(entries -> {
			entries.add(SPRING_GREEN_WOOL_KEY.asItem());
			entries.add(ROSE_WOOL_KEY.asItem());
		});

		ItemGroupEvents.modifyEntriesEvent(ModItems.KAISMOD_BLOCKS_GROUP_KEY).register(entries -> {
            entries.add(GREYBOX_PLACEHOLDER_KEY.asItem());
        });
    }

}
