package net.leo.MoreCreativeTabs;

import net.fabricmc.api.ModInitializer;

import net.leo.MoreCreativeTabs.item.moditemgroups;
import net.leo.MoreCreativeTabs.item.moditems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class morecreativetabs implements ModInitializer {
    public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		moditemgroups.registerItemGroups();
		moditems.registerModItems();
	}
}