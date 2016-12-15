package com.thvardhan.epicbanana.fruits;


import com.thvardhan.epicbanana.EpicBananaMain;
import com.thvardhan.epicbanana.handlers.CreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FruitPear extends FruitAbstract {


    public FruitPear(Material materialIn,String name) {
        super(materialIn,name);
    }


}
