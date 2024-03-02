package net.leo.MoreCreativeTabs.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.leo.MoreCreativeTabs.morecreativetabs;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class moditemgroups {

    public static final ItemGroup OP_STUFF = Registry.register(Registries.ITEM_GROUP,
            new Identifier(morecreativetabs.MOD_ID, "opstuff"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.op"))
                    .icon(() -> new ItemStack(Items.LIGHT)).entries((displayContext, entries) -> {
                        entries.add(Items.COMMAND_BLOCK_MINECART);
                        entries.add(Items.COMMAND_BLOCK);
                        entries.add(Items.CHAIN_COMMAND_BLOCK);
                        entries.add(Items.REPEATING_COMMAND_BLOCK);
                        entries.add(Items.LIGHT);
                        entries.add(Items.JIGSAW);
                        entries.add(Items.STRUCTURE_BLOCK);
                        entries.add(Items.STRUCTURE_VOID);
                        entries.add(Items.BARRIER);
                        entries.add(Items.DEBUG_STICK);
                        entries.add(Items.LIGHT);

                    }).build());

    public static final ItemGroup REDSTONE = Registry.register(Registries.ITEM_GROUP, new Identifier(morecreativetabs.MOD_ID,
            "redstone"), FabricItemGroup.builder().displayName(Text.translatable("itemGroup.redstone")).icon(() -> new ItemStack(Items.REDSTONE))
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
                entries.add(Items.SLIME_BLOCK);
                entries.add(Items.HONEY_BLOCK);
                entries.add(Items.OAK_PRESSURE_PLATE);
                entries.add(Items.STONE_PRESSURE_PLATE);
                entries.add(Items.LIGHT_WEIGHTED_PRESSURE_PLATE);
                entries.add(Items.HEAVY_WEIGHTED_PRESSURE_PLATE);
                entries.add(Items.LEVER);
                entries.add(Items.OAK_BUTTON);
                entries.add(Items.STONE_BUTTON);
                entries.add(Items.TNT);
                entries.add(Items.TNT_MINECART);

            }).build());


    public static void registerItemGroups() {
        morecreativetabs.LOGGER.info("Registering Item Groups for " + morecreativetabs.MOD_ID);
    }
}
