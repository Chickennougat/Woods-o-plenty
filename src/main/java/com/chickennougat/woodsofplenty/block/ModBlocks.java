package com.chickennougat.woodsofplenty.block;

import com.chickennougat.woodsofplenty.WoodsOfPlenty;
import com.chickennougat.woodsofplenty.item.ModItems;
import com.chickennougat.woodsofplenty.item.WoodsofPlentyCreativeModeTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, WoodsOfPlenty.MOD_ID);

    public static final RegistryObject<Block> blue_dyed_oak_planks = registerBlock("blue_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> white_dyed_oak_planks = registerBlock("white_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> orange_dyed_oak_planks = registerBlock("orange_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> magenta_dyed_oak_planks = registerBlock("magenta_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> lightblue_dyed_oak_planks = registerBlock("lightblue_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> yellow_dyed_oak_planks = registerBlock("yellow_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> lime_dyed_oak_planks = registerBlock("lime_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> pink_dyed_oak_planks = registerBlock("pink_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> gray_dyed_oak_planks = registerBlock("gray_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> light_gray_dyed_oak_planks = registerBlock("light_gray_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> cyan_dyed_oak_planks = registerBlock("cyan_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> purple_dyed_oak_planks = registerBlock("purple_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> brown_dyed_oak_planks = registerBlock("brown_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> green_dyed_oak_planks = registerBlock("green_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> red_dyed_oak_planks = registerBlock("red_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);
    public static final RegistryObject<Block> black_dyed_oak_planks = registerBlock("black_dyed_oak_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(0.5f).requiresCorrectToolForDrops()), WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB);






    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));


    }
    public static void register(IEventBus eventBus) {BLOCKS.register(eventBus);}
}
