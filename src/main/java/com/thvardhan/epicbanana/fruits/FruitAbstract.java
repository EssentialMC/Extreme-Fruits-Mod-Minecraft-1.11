package com.thvardhan.epicbanana.fruits;

import com.thvardhan.epicbanana.EpicBananaMain;
import com.thvardhan.epicbanana.handlers.CreativeTabHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.HashMap;

public abstract class FruitAbstract extends Block {

    static final PropertyDirection face=PropertyDirection.create("face");
    private static NBTTagCompound dir=new NBTTagCompound();

    public FruitAbstract(Material materialIn,String name) {
        super(materialIn);
        this.blockHardness=0.4F;
        this.blockResistance=1F;
        this.setRegistryName(EpicBananaMain.MODID+""+name);
        this.setUnlocalizedName(EpicBananaMain.MODID+""+name);
        this.setCreativeTab(CreativeTabHandler.getTab("fruit"));
        this.setDefaultState(this.blockState.getBaseState().withProperty(face,EnumFacing.UP));
    }

    @Override
    public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
        if (RANDOM.nextBoolean()){
            dir.setBoolean(pos.toString(),true);
        worldIn.setBlockState(pos,state.withProperty(face,EnumFacing.UP));}else {
            worldIn.setBlockState(pos,state.withProperty(face,EnumFacing.DOWN));
            dir.setBoolean(pos.toString(),false);
        }



    }

    @Override
    public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
        return true;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this,face);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        return getDefaultState().withProperty(face, meta == 0 ? EnumFacing.UP : EnumFacing.DOWN);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumFacing face = (EnumFacing) state.getValue(this.face);
        return EnumFacing.DOWN.getIndex();
    }

}
