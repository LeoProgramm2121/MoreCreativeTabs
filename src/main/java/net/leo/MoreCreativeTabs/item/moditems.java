package net.leo.MoreCreativeTabs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.leo.MoreCreativeTabs.morecreativetabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class moditems {

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(morecreativetabs.MOD_ID, name), item);
    }

    public static void registerModItems() {
        morecreativetabs.LOGGER.info("Registering Mod Items for " + morecreativetabs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(moditems::addItemsToIngredientItemGroup);
    }
}
