package net.legendzary.ppbmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.legendzary.ppbmod.PushpinbirdMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PUSHPIN = registerItem("pushpin", new Item(new Item.Settings()));

    public static final Item PUSHPIBALD = registerItem("pushpibald", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PushpinbirdMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PushpinbirdMod.LOGGER.info("Registering Mod Items for " + PushpinbirdMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT). register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(PUSHPIN);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS). register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PUSHPIBALD);
        });
    }
}
