package com.thvardhan.epicbanana;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.HashMap;

public class Utils {

    public static void setBlock(World world, Block block, BlockPos pos){
        world.setBlockState(pos,block.getDefaultState(),2);
    }

    public static Block getKey(String value){
        for(Block key : ModBlocks.blocks.keySet()){
            if(ModBlocks.blocks.get(key).equals(value)){
                return key;
            }
        }
        return null;
    }

}
