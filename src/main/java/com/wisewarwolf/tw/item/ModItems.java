package com.wisewarwolf.tw.item;

import com.wisewarwolf.tw.TimeWatchMod;
import com.wisewarwolf.tw.item.custom.BasicWatchItem;
import com.wisewarwolf.tw.item.custom.TimeWatchItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item TIME_WATCH = registerItem("time_watch",
            new TimeWatchItem(new FabricItemSettings().maxCount(1)));

    public static final Item BASIC_WATCH = registerItem("basic_watch",
            new BasicWatchItem(new FabricItemSettings().maxCount(1)));

    public static final Item LEATHER_STRAP = registerItem("leather_strap",
            new Item(new FabricItemSettings()));
    public static final Item WATCH_BASE = registerItem("watch_base",
            new Item(new FabricItemSettings()));
    public static final Item TIME_WATCH_CLOCK = registerItem("time_watch_clock",
            new Item(new FabricItemSettings()));
    public static final Item BASIC_WATCH_CLOCK = registerItem("basic_watch_clock",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TimeWatchMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TimeWatchMod.LOGGER.info("Registering Mod Items for " + TimeWatchMod.MOD_ID);
    }
}
