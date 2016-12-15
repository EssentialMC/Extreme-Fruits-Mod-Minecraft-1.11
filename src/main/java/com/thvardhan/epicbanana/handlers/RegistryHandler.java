package com.thvardhan.epicbanana.handlers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class RegistryHandler {

    /**
     * registers the item with GameRegistry
     * @param item
     */
    public static void registerItem(Item item) {
        GameRegistry.register(item);
    }

    /**
     * registers the block with GameRegistry
     * @param block
     */
    public static void registerBlock(Block block) {
        GameRegistry.register(block);
    }

    public static void registerBlockItem(Block block) {
        GameRegistry.register(new
                ItemBlock(block).setRegistryName(block.getRegistryName())
        );
    }

    public static void registerBlockWithItem(Block block) {
        GameRegistry.register(block);
        ItemBlock b=new ItemBlock(block);
        registerItemForRender(b.setRegistryName(block.getRegistryName()));
        GameRegistry.register(b);
    }


    @SideOnly(Side.CLIENT)
    public static void registerBlockForRender(Block block) {

        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(block), 0,
                new ModelResourceLocation(
                       block.getRegistryName(),
                        "inventory")
        );
    }

    @SideOnly(Side.CLIENT)
    public static void registerItemForRender(Item item) {
        ModelLoader.setCustomModelResourceLocation(
                item, 0,
                new ModelResourceLocation(
                        item.getRegistryName(),
                        "inventory")
        );
    }
}
