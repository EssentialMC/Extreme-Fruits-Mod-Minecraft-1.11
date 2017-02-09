package com.thvardhan.epicbanana.blocks;

import com.thvardhan.epicbanana.EpicBananaMain;
import com.thvardhan.epicbanana.ModBlocks;
import com.thvardhan.epicbanana.Utils;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import java.util.List;
import java.util.Random;


public class BananaLeaf extends BlockLeaves
{
    public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

    public BlockPlanks.EnumType type;

    public ItemBlock item;

    public BananaLeaf(String name) {
        super();
        setRegistryName(EpicBananaMain.MODID+name);
        setUnlocalizedName(EpicBananaMain.MODID+name);

        //setDefaultState(this.blockState.getBaseState()/*.withProperty(LEVEL, new Integer(0))*/);
        type = BlockPlanks.EnumType.OAK;
    }


    @Override
    protected int getSaplingDropChance(IBlockState state) {
        return type == BlockPlanks.EnumType.JUNGLE ? 40 : super.getSaplingDropChance(state);
    }

    @Override
    protected ItemStack createStackedBlock(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this), 1, type.getMetadata());
    }




    @Override
    public BlockPlanks.EnumType getWoodType(int meta) {
        return BlockPlanks.EnumType.OAK;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this);
    }


    @Override
    public List<ItemStack> onSheared(ItemStack itemStack, net.minecraft.world.IBlockAccess world, BlockPos pos, int fortune) {
        Block block = type.getMetadata() < 4 ? Blocks.LEAVES : Blocks.LEAVES2;
        int meta = type.getMetadata() % 4;
        return java.util.Arrays.asList(new ItemStack(block, 1, meta));
    }


    @Override
    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
        super.randomTick(worldIn, pos, state, random);
    }

    /**
     * Just here to prevent BlockLeaves's updateTick from running.
     */
    @Override
    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        worldIn.scheduleBlockUpdate(pos,this,100,1);
    }



    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return Minecraft.isFancyGraphicsEnabled() ? BlockRenderLayer.CUTOUT_MIPPED : BlockRenderLayer.SOLID;
    }

    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return !Minecraft.isFancyGraphicsEnabled();
    }
}