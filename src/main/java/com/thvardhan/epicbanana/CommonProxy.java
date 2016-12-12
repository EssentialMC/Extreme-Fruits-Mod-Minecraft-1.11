package com.thvardhan.epicbanana;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.thvardhan.epicbanana.handlers.CreativeTabHandler.addCreativeTab;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event){
        createTabs();
        ModItems.createModItems();
        ModBlocks.createModBlocks();

    }

    public void init(FMLInitializationEvent event){

    }

    public void postInit(FMLPostInitializationEvent event){

    }

    private static void createTabs(){
        addCreativeTab("tree", new ItemStack(Items.PAPER));
        addCreativeTab("fruit", new ItemStack(Items.CAKE));
        addCreativeTab("misc", new ItemStack(Items.GLOWSTONE_DUST));
    }

}
