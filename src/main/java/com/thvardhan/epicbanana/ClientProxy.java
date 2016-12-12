package com.thvardhan.epicbanana;

import com.thvardhan.epicbanana.handlers.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
       // RegistryHandler.registerBlockForRender(ModBlocks.bananaTrunk);
        renderAllBlocks();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    private final void renderAllBlocks(){
        for (Block key:
                ModBlocks.blocks.keySet()) {
            RegistryHandler.registerBlockForRender(key);
        }
    }


}