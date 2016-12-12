package com.thvardhan.epicbanana;

import com.thvardhan.epicbanana.blocks.BananaTrunk;
import com.thvardhan.epicbanana.blocks.BananaTrunk;
import com.thvardhan.epicbanana.blocks.FruitPear;
import com.thvardhan.epicbanana.handlers.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ModBlocks {

    public static HashMap<Block,String> blocks=new HashMap<Block, String>();

    /*
    To make new blocks just do a blocks.put with material,name(unlocalized),name you will be using (unlocalized prefferd);
     */

    public static void createModBlocks(){
        blocks.put(new BananaTrunk(Material.WOOD,"banana_trunk"),"banana_trunk");
        blocks.put(new FruitPear(Material.WOOD,"pear"),"pear");
        System.out.println(blocks.keySet().iterator().next().getRegistryName());
        registerAllBlocks();
    }

    private final static void registerAllBlocks(){
        for (Block key:
                blocks.keySet()) {
            RegistryHandler.registerBlockWithItem(key);
        }
    }

}
