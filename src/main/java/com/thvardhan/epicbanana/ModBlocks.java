package com.thvardhan.epicbanana;

import com.thvardhan.epicbanana.blocks.BananaLeaf;
import com.thvardhan.epicbanana.blocks.BananaTrunk;
import com.thvardhan.epicbanana.fruits.FruitBanana;
import com.thvardhan.epicbanana.fruits.FruitPear;
import com.thvardhan.epicbanana.handlers.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.HashMap;

public class ModBlocks {

    /*
    Why hashmap? because i am too lazy to register all blocks with GameRegistry
    so instead i am using a hashmap with loop. (which does the game registry)
     */

    public static HashMap<Block,String> blocks=new HashMap<Block, String>();

    /*
    To make new blocks just do a blocks.put with material,name(unlocalized),name
    you will be using (unlocalized prefferd);
     */

    public static void createModBlocks(){
        blocks.put(new BananaTrunk(Material.WOOD,"banana_log"),"banana_log");
        blocks.put(new BananaLeaf("banana_leaf"),"banana_leaf");
        blocks.put(new FruitPear(Material.WOOD,"pear"),"pear");
        blocks.put(new FruitBanana(Material.WOOD,"banana"),"banana");
        registerAllBlocks();
    }

    private final static void registerAllBlocks(){
        for (Block key:
                blocks.keySet()) {
            RegistryHandler.registerBlockWithItem(key);
        }
    }

}
