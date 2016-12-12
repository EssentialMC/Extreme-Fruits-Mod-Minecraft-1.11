package com.thvardhan.epicbanana.handlers;

import com.thvardhan.epicbanana.EpicBananaMain;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public final class CreativeTabIconHandler extends CreativeTabs {
    private final ItemStack icon;

    public CreativeTabIconHandler(String module, ItemStack icon) {
        super(EpicBananaMain.MODID + "." + module);
        this.icon = icon;
    }

    @Override
    public ItemStack getTabIconItem() {
        return icon;
    }
}