package com.thvardhan.epicbanana.handlers;

import com.thvardhan.epicbanana.blocks.BananaTrunk;
import com.thvardhan.epicbanana.structures.TreeBanana;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenHandler implements IWorldGenerator {

    private void generateSurface(World world, Random rand, int chunkX, int chunkZ)
    {


            int i = chunkX + rand.nextInt(16);
            int k = chunkZ + rand.nextInt(16);
            int j = world.getHeightmapHeight(i, k);

            new TreeBanana(world, new BlockPos(i, j, k));


    }
    private void generateNether(World world, Random random, int blockX, int blockZ)
    {
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimension())
        {
            case -1: generateNether(world, random, chunkX*16, chunkZ*16);
            case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
        }
    }
}
