package com.thvardhan.epicbanana.structures;

import com.thvardhan.epicbanana.ModBlocks;
import com.thvardhan.epicbanana.blocks.BananaTrunk;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

import static com.thvardhan.epicbanana.Utils.getKey;
import static com.thvardhan.epicbanana.Utils.setBlock;

public class TreeBanana {

    static Random rand=new Random();

    public TreeBanana(World world,BlockPos pos){


        int r=rand.nextInt(5)+4;

        for (int i = 0; i <= r; i++) {
            setBlock(world, getKey("banana_log"), new BlockPos(pos.getX(), pos.getY()+i, pos.getZ()));
        }



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+i-1,pos.getY()+r+1,pos.getZ()+j-1));
            }

        }

        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-1,pos.getY()+r+2,pos.getZ()-1));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-1,pos.getY()+r+3,pos.getZ()-1));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-2,pos.getY()+r+2,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+1,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+1,pos.getZ()-3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r,pos.getZ()-3));

        int d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r-d,pos.getZ()-3));
        }
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-2,pos.getY()+r+2,pos.getZ()));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+2,pos.getZ()));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-4,pos.getY()+r+2,pos.getZ()));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-5,pos.getY()+r+1,pos.getZ()));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-5,pos.getY()+r+1-d,pos.getZ()));
        }

        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-1,pos.getY()+r+2,pos.getZ()+1));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-1,pos.getY()+r+3,pos.getZ()+1));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-2,pos.getY()+r+3,pos.getZ()+2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+3,pos.getZ()+3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+2,pos.getZ()+3));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()-3,pos.getY()+r+2-d,pos.getZ()+3));
        }


        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+2,pos.getZ()+2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+2,pos.getZ()+3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+1,pos.getZ()+4));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+1-d,pos.getZ()+4));
        }


        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r+2,pos.getZ()+2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r+1,pos.getZ()+2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r+2,pos.getZ()+3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r+1,pos.getZ()+3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r,pos.getZ()+3));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r-d,pos.getZ()+3));
        }

        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r+1,pos.getZ()));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r+1,pos.getZ()));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+4,pos.getY()+r,pos.getZ()));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+4,pos.getY()+r-d,pos.getZ()));
        }

        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+2,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+2,pos.getZ()-3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+1,pos.getZ()-4));

        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX(),pos.getY()+r+1-d,pos.getZ()-4));
        }

        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r+1,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+2,pos.getY()+r+2,pos.getZ()-2));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+3,pos.getY()+r+2,pos.getZ()-3));
        setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+4,pos.getY()+r+1,pos.getZ()-4));
        d=Math.abs(rand.nextInt(5)-r);

        for (int i = 0; i < d; i++) {
            setBlock(world,getKey("banana_leaf"),new BlockPos(pos.getX()+4,pos.getY()+r+1-d,pos.getZ()-4));
        }


    }


}
