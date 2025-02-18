package com.kaigurke.kaismod.block;

import com.kaigurke.kaismod.KaisMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
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
	//--------------------
    // 	  WOOD TYPES
	//--------------------

	// ------------------------------------------------------------------------------------------------------------
	// ----------------------------------------Kaigrove Blocks-----------------------------------------------------
	// ------------------------------------------------------------------------------------------------------------

    // Kaigrove Planks
    public static final RegistryKey<Block> KAIGROVE_PLANKS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_planks")
    );

    public static final Block KAIGROVE_PLANKS_KEY = register(
		    new Block(AbstractBlock.Settings.copy(Blocks.MANGROVE_PLANKS).registryKey(KAIGROVE_PLANKS).sounds(BlockSoundGroup.WOOD)),
		    KAIGROVE_PLANKS,
		    true
    );
    // Kaigrove Log
	public static final RegistryKey<Block> KAIGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_log")
	);

	public static final Block KAIGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)
						.registryKey(KAIGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), KAIGROVE_LOG, true
	);

	// Stripped Kaigrove Log
	public static final RegistryKey<Block> STRIPPED_KAIGROVE_LOG = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_kaigrove_log")
	);

	public static final Block STRIPPED_KAIGROVE_LOG_KEY = register(
		new PillarBlock(
				AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG)
						.registryKey(STRIPPED_KAIGROVE_LOG)
						.sounds(BlockSoundGroup.WOOD)
		), STRIPPED_KAIGROVE_LOG, true
	);

	// Kaigrove Stairs
	public static final RegistryKey<Block> KAIGROVE_STAIRS = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_stairs")
    );

	public static final Block KAIGROVE_STAIRS_KEY = register(
			new StairsBlock(ModBlocks.KAIGROVE_PLANKS_KEY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_STAIRS).registryKey(KAIGROVE_STAIRS).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_STAIRS,
			true
	);

	// Kaigrove Slab
	public static final RegistryKey<Block> KAIGROVE_SLAB = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_slab")
    );

	public static final Block KAIGROVE_SLAB_KEY = register(
			new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_SLAB).registryKey(KAIGROVE_SLAB).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_SLAB,
			true
	);

	// Kaigrove Button
	public static final RegistryKey<Block> KAIGROVE_BUTTON = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_button")
    );

	public static final Block KAIGROVE_BUTTON_KEY = register(
			new ButtonBlock(BlockSetType.MANGROVE, 10, AbstractBlock.Settings.copy(Blocks.MANGROVE_BUTTON).registryKey(KAIGROVE_BUTTON).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_BUTTON,
			true
	);

	// Kaigrove Pressure Plate
	public static final RegistryKey<Block> KAIGROVE_PRESSURE_PLATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_pressure_plate")
    );

	public static final Block KAIGROVE_PRESSURE_PLATE_KEY = register(
			new PressurePlateBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_PRESSURE_PLATE).registryKey(KAIGROVE_PRESSURE_PLATE).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_PRESSURE_PLATE,
			true
	);

	// Kaigrove FENCE
	public static final RegistryKey<Block> KAIGROVE_FENCE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_fence")
    );

	public static final Block KAIGROVE_FENCE_KEY = register(
			new FenceBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE).registryKey(KAIGROVE_FENCE).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_FENCE,
			true
	);

	// Kaigrove FENCE GATE
	public static final RegistryKey<Block> KAIGROVE_FENCE_GATE = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_fence_gate")
    );

	public static final Block KAIGROVE_FENCE_GATE_KEY = register(
			new FenceGateBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_FENCE_GATE).registryKey(KAIGROVE_FENCE_GATE).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_FENCE_GATE,
			true
	);

	// Kaigrove Door
	public static final RegistryKey<Block> KAIGROVE_DOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_door")
    );

	public static final Block KAIGROVE_DOOR_KEY = register(
			new DoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_DOOR).registryKey(KAIGROVE_DOOR).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_DOOR,
			true
	);

	// Kaigrove Trapdoor
	public static final RegistryKey<Block> KAIGROVE_TRAPDOOR = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_trapdoor")
    );

	public static final Block KAIGROVE_TRAPDOOR_KEY = register(
			new TrapdoorBlock(BlockSetType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_TRAPDOOR).registryKey(KAIGROVE_TRAPDOOR).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_TRAPDOOR,
			true
	);

	// Kaigrove Sign
	public static final RegistryKey<Block> KAIGROVE_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_sign")
    );

	public static final Block KAIGROVE_SIGN_KEY = register(
			new SignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_SIGN).registryKey(KAIGROVE_SIGN).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_SIGN,
			true
	);

	// Kaigrove Hanging Sign
	public static final RegistryKey<Block> KAIGROVE_HANGING_SIGN = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_hanging_sign")
    );

	public static final Block KAIGROVE_HANGING_SIGN_KEY = register(
			new HangingSignBlock(WoodType.MANGROVE, AbstractBlock.Settings.copy(Blocks.MANGROVE_HANGING_SIGN).registryKey(KAIGROVE_HANGING_SIGN).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_HANGING_SIGN,
			true
	);

	// Kaigrove Wood
	public static final RegistryKey<Block> KAIGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "kaigrove_wood")
    );

	public static final Block KAIGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).registryKey(KAIGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			KAIGROVE_WOOD,
			true
	);

	// Stripped Kaigrove Wood
	public static final RegistryKey<Block> STRIPPED_KAIGROVE_WOOD = RegistryKey.of(
		RegistryKeys.BLOCK,
		Identifier.of(KaisMod.MOD_ID, "stripped_kaigrove_wood")
    );

	public static final Block STRIPPED_KAIGROVE_WOOD_KEY = register(
			new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).registryKey(STRIPPED_KAIGROVE_WOOD).sounds(BlockSoundGroup.WOOD)),
			STRIPPED_KAIGROVE_WOOD,
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





    public static void initialize() {
        KaisMod.LOGGER.info("Registering mod blocks for " + KaisMod.MOD_ID);

		StrippableBlockRegistry.register(KAIGROVE_LOG_KEY, STRIPPED_KAIGROVE_LOG_KEY);
		StrippableBlockRegistry.register(KAIGROVE_WOOD_KEY, STRIPPED_KAIGROVE_WOOD_KEY);
		StrippableBlockRegistry.register(LIGHT_MANGROVE_LOG_KEY, STRIPPED_LIGHT_MANGROVE_LOG_KEY);
		StrippableBlockRegistry.register(LIGHT_MANGROVE_WOOD_KEY, STRIPPED_LIGHT_MANGROVE_WOOD_KEY);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
			// Kaigrove
            entries.add(KAIGROVE_LOG_KEY.asItem());
			entries.add(STRIPPED_KAIGROVE_LOG_KEY.asItem());
			entries.add(KAIGROVE_WOOD_KEY.asItem());
			entries.add(STRIPPED_KAIGROVE_WOOD_KEY.asItem());
			entries.add(KAIGROVE_PLANKS_KEY.asItem());
			entries.add(KAIGROVE_STAIRS_KEY.asItem());
			entries.add(KAIGROVE_SLAB_KEY.asItem());
			entries.add(KAIGROVE_FENCE_KEY.asItem());
			entries.add(KAIGROVE_FENCE_GATE_KEY.asItem());
			entries.add(KAIGROVE_DOOR_KEY.asItem());
			entries.add(KAIGROVE_TRAPDOOR_KEY.asItem());
			entries.add(KAIGROVE_PRESSURE_PLATE_KEY.asItem());
			entries.add(KAIGROVE_BUTTON_KEY.asItem());
			
			
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
        });

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
			entries.add(KAIGROVE_SIGN_KEY.asItem());
            entries.add(LIGHT_MANGROVE_SIGN_KEY.asItem());
			entries.add(KAIGROVE_HANGING_SIGN_KEY.asItem());
			entries.add(LIGHT_MANGROVE_HANGING_SIGN_KEY.asItem());
        });
    }

}
