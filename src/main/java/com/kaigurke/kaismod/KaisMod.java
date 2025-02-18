package com.kaigurke.kaismod;

import com.kaigurke.kaismod.entity.ModEntities;
import com.kaigurke.kaismod.item.ModItems;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.kaigurke.kaismod.block.ModBlocks;

public class KaisMod implements ModInitializer {
    public static final String MOD_ID = "kaismod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.initialize();
        ModEntities.initialize();
    }
}