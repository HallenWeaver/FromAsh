package net.hallenweaver.fromash.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hallenweaver.fromash.FromAsh;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item.Settings ASH_PILE_SETTINGS = new Item.Settings();
    public static final Item ASH_PILE = registerItem("ash_pile", ASH_PILE_SETTINGS);

    public static final Item.Settings SLAG_SETTINGS = new Item.Settings();
    public static final Item SLAG = registerItem("slag", SLAG_SETTINGS);

    private static Item registerItem(String name, Item.Settings itemSettings) {
        Identifier id = Identifier.of(FromAsh.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);

        return Registry.register(Registries.ITEM, key, new Item(settings));
    }

    public static void registerModItems() {
        FromAsh.LOGGER.info("Registering mod items for " + FromAsh.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ASH_PILE);
            entries.add(SLAG);
        });
    }
}
