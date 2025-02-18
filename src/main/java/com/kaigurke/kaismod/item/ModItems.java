package com.kaigurke.kaismod.item;

import com.kaigurke.kaismod.KaisMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final RegistryKey<ItemGroup> KAISMOD_ITEMS_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(KaisMod.MOD_ID, "item_group"));
    public static final ItemGroup KAISMOD_ITEMS_GROUP = FabricItemGroup.builder()
		.icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM))
		.displayName(Text.translatable("itemGroup.kaismod.items"))
		.build();

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(KaisMod.MOD_ID, name), item);
    }

    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(KaisMod.MOD_ID, "example_item")))));

    public static final Item JETT_SMOKE = registerItem("jett_smoke", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(KaisMod.MOD_ID, "jett_smoke")))));




    
    public static void registerModItems() {
        KaisMod.LOGGER.info("Registering mod items for " + KaisMod.MOD_ID);
        Registry.register(Registries.ITEM_GROUP, KAISMOD_ITEMS_GROUP_KEY, KAISMOD_ITEMS_GROUP);


        ItemGroupEvents.modifyEntriesEvent(KAISMOD_ITEMS_GROUP_KEY).register(entries -> {
            entries.add(EXAMPLE_ITEM);
        });
    }

}
