package com.wisewarwolf.tw;

import com.wisewarwolf.tw.item.ModItemGroup;
import com.wisewarwolf.tw.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeWatchMod implements ModInitializer {
	public static final String MOD_ID = "timewatchmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("timewatchmod");

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();

	}
}