package net.leo.testmod;

import net.fabricmc.api.ModInitializer;

import net.leo.testmod.item.ModItemGroups;
import net.leo.testmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreCreativeTabs implements ModInitializer {
    public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}