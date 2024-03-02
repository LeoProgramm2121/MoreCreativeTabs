package net.leo.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leo.testmod.MoreCreativeTabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup Redstone = Registry.register(Registries.ITEM_GROUP, new Identifier(MoreCreativeTabs.MOD_ID,
            "ruby"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.redstone")).icon(() -> new ItemStack(Items.REDSTONE))
            .entries((displayContext, entries) -> {
                entries.add(Items.OBSIDIAN);
                entries.add(Items.IRON_BLOCK);
                entries.add(Items.GLOWSTONE);
                entries.add(Items.GLASS);
                entries.add(Items.REDSTONE);
                entries.add(Items.REPEATER);
                entries.add(Items.COMPARATOR);
                entries.add(Items.REDSTONE_TORCH);
                entries.add(Items.REDSTONE_BLOCK);
                entries.add(Items.COMMAND_BLOCK_MINECART);
                entries.add(Items.COMMAND_BLOCK);
                entries.add(Items.CHAIN_COMMAND_BLOCK);
                entries.add(Items.REPEATING_COMMAND_BLOCK);
                entries.add(Items.SCULK_SENSOR);
                entries.add(Items.CALIBRATED_SCULK_SENSOR);
                entries.add(Items.RAIL);
                entries.add(Items.POWERED_RAIL);
                entries.add(Items.DETECTOR_RAIL);
                entries.add(Items.STICKY_PISTON);
                entries.add(Items.PISTON);
                entries.add(Items.OBSERVER);
                entries.add(Items.DISPENSER);
                entries.add(Items.DROPPER);
                entries.add(Items.HOPPER);
                entries.add(Items.NOTE_BLOCK);
                entries.add(Items.REDSTONE_LAMP);
                entries.add(Items.ACTIVATOR_RAIL);
                entries.add(Items.TNT);
                entries.add(Items.TNT_MINECART);
                entries.add(Items.OAK_PRESSURE_PLATE);
                entries.add(Items.STONE_PRESSURE_PLATE);
                entries.add(Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
                entries.add(Items.HEAVY_WEIGHTED_PRESSURE_PLATE);
                entries.add(Items.LEVER);
                entries.add(Items.OAK_BUTTON);
                entries.add(Items.STONE_BUTTON);

            }).build());


    public static void registerItemGroups() {
        MoreCreativeTabs.LOGGER.info("Registering Item Groups for " + MoreCreativeTabs.MOD_ID);
    }
}
