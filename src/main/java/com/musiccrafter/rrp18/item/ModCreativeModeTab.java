package com.musiccrafter.rrp18.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab RRP_TAB = new CreativeModeTab("rrpmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_TIN.get());
        }
    };
}
