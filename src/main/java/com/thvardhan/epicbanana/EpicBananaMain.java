package com.thvardhan.epicbanana;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EpicBananaMain.MODID, version = EpicBananaMain.VERSION,name= EpicBananaMain.NAME)
public class EpicBananaMain
{
    public static final String MODID = "epicbanana";
    public static final String VERSION = "1.0";
    public static final String NAME="Epic Banana Mod";
    @SidedProxy(clientSide="com.thvardhan.epicbanana.ClientProxy", serverSide="com.thvardhan.epicbanana.ServerProxy")
    public static CommonProxy proxy;





    @Mod.Instance(MODID)
    public static EpicBananaMain instance;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        proxy.preInit(event);


    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }


}