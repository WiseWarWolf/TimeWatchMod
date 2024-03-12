package com.wisewarwolf.tw.item;

import com.wisewarwolf.tw.TimeWatchMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TIME_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TimeWatchMod.MOD_ID, "time_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.time_group"))
                    .icon(()-> new ItemStack(ModItems.TIME_WATCH)).entries((displayContext, entries) -> {
                        entries.add(ModItems.TIME_WATCH);
                        entries.add(ModItems.BASIC_WATCH);

                        //Building Ingredients
                        entries.add(ModItems.WATCH_BASE);
                        entries.add(ModItems.TIME_WATCH_CLOCK);
                        entries.add(ModItems.BASIC_WATCH_CLOCK);
                        entries.add(ModItems.LEATHER_STRAP);

                    }).build());

    public static void registerItemGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(ModItems.WATCH_BASE);
            entries.add(ModItems.TIME_WATCH_CLOCK);
            entries.add(ModItems.BASIC_WATCH_CLOCK);
            entries.add(ModItems.LEATHER_STRAP);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(ModItems.TIME_WATCH);
            entries.add(ModItems.BASIC_WATCH);
        });
    }
}
