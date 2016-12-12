package com.thvardhan.epicbanana.handlers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

import java.util.HashMap;

public final class CreativeTabHandler {

    private static final HashMap<String, CreativeTabs> tabs = new HashMap();

    public static void addCreativeTab(String module, ItemStack icon) {
        CreativeTabs instance = new CreativeTabIconHandler(module, icon);
        tabs.put(module, instance);
    }

    public static CreativeTabs getTab(String module) {
        return tabs.get(module);
    }

}