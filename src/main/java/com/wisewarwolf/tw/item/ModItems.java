package com.wisewarwolf.tw.item;

import com.wisewarwolf.tw.TimeWatchMod;
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
            new Item(new FabricItemSettings()));
    public static final Item BASIC_WATCH = registerItem("basic_watch",
            new Item(new FabricItemSettings()));
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



    public static void addItemsToItemGroup(){
        addToItemGroup(ItemGroups.COMBAT, TIME_WATCH);
        addToItemGroup(ItemGroups.COMBAT, BASIC_WATCH);
        addToItemGroup(ItemGroups.INGREDIENTS, TIME_WATCH_CLOCK);
        addToItemGroup(ItemGroups.INGREDIENTS, BASIC_WATCH_CLOCK);
        addToItemGroup(ItemGroups.INGREDIENTS, WATCH_BASE);
        addToItemGroup(ItemGroups.INGREDIENTS, LEATHER_STRAP);

        addToItemGroup(ModItemGroup.TIME_GROUP, TIME_WATCH);
        addToItemGroup(ModItemGroup.TIME_GROUP, BASIC_WATCH);
        addToItemGroup(ModItemGroup.TIME_GROUP, TIME_WATCH_CLOCK);
        addToItemGroup(ModItemGroup.TIME_GROUP, BASIC_WATCH_CLOCK);
        addToItemGroup(ModItemGroup.TIME_GROUP, WATCH_BASE);
        addToItemGroup(ModItemGroup.TIME_GROUP, LEATHER_STRAP);

    }




    private static void addToItemGroup(ItemGroup group, Item item){
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
    public static void registerModItems() {
        TimeWatchMod.LOGGER.info("Registering Mod Items for " + TimeWatchMod.MOD_ID);

        addItemsToItemGroup();
    }
}
