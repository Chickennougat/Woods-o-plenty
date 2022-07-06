package com.chickennougat.woodsofplenty.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class WoodsofPlentyCreativeModeTab {

    public static final CreativeModeTab WOODSOFPLENTY_TAB = new CreativeModeTab("TAB_WOODS") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.blue_dyed_oak_planks.get());
        }
    };
}
