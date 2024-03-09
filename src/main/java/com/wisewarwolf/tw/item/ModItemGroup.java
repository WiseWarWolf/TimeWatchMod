package com.wisewarwolf.tw.item;

import com.wisewarwolf.tw.TimeWatchMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup TIME_GROUP;

    public static void registerItemGroups(){
        TIME_GROUP = FabricItemGroup.builder(new Identifier(TimeWatchMod.MOD_ID, "time_watch"))
                .displayName(Text.translatable("itemgroup.time_group"))
                .icon(()-> new ItemStack(ModItems.TIME_WATCH)).build();
    }
}
