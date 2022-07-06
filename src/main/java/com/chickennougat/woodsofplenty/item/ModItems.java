package com.chickennougat.woodsofplenty.item;


import com.chickennougat.woodsofplenty.WoodsOfPlenty;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WoodsOfPlenty.MOD_ID);

    public static final RegistryObject<Item> red_dyed_oak_planks = ITEMS.register("red_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> white_dyed_oak_planks = ITEMS.register("white_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> orange_dyed_oak_planks = ITEMS.register("orange_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> magenta_dyed_oak_planks = ITEMS.register("magenta_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> lightblue_dyed_oak_planks = ITEMS.register("lightblue_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> yellow_dyed_oak_planks = ITEMS.register("yellow_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> lime_dyed_oak_planks = ITEMS.register("lime_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> pink_dyed_oak_planks = ITEMS.register("pink_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> gray_dyed_oak_planks = ITEMS.register("gray_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> light_gray_dyed_oak_planks = ITEMS.register("light_gray_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> cyan_dyed_oak_planks = ITEMS.register("cyan_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> purple_dyed_oak_planks = ITEMS.register("purple_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> blue_dyed_oak_planks = ITEMS.register("blue_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> brown_dyed_oak_planks = ITEMS.register("brown_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> green_dyed_oak_planks = ITEMS.register("green_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    public static final RegistryObject<Item> black_dyed_oak_planks = ITEMS.register("black_dyed_oak_planks",
            () -> new Item(new Item.Properties().tab(WoodsofPlentyCreativeModeTab.WOODSOFPLENTY_TAB)));
    






    public static void register(IEventBus eventBus) {ITEMS.register(eventBus);}
}
