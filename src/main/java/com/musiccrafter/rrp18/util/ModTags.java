package com.musiccrafter.rrp18.util;

import com.musiccrafter.rrp18.RRP18;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static void register() {
        Blocks.registerBlockTags();
        Items.registerItemTags();
    }

    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(RRP18.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

        public static void registerBlockTags() {}

    }

    public static class Items {

        public static final TagKey<Item> BOTTLE =
                tag("bottle");

        public static final TagKey<Item> TINDER =
                tag("tinder");

        public static final TagKey<Item> ROCKS =
                tag("rocks");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(RRP18.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        public static void registerItemTags() {}

    }

}
