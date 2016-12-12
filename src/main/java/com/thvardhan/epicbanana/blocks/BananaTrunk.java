package com.thvardhan.epicbanana.blocks;

import com.thvardhan.epicbanana.EpicBananaMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BananaTrunk extends Block {

    public BananaTrunk(Material materialIn,String name) {

        super(materialIn);
        this.blockHardness=0.4F;
        this.blockResistance=1F;
        this.setRegistryName(EpicBananaMain.MODID+""+name);
        this.setUnlocalizedName(EpicBananaMain.MODID+""+name);
        this.setCreativeTab(CreativeTabs.FOOD);
    }

    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
