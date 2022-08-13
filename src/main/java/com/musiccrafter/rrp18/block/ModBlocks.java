package com.musiccrafter.rrp18.block;

import com.musiccrafter.rrp18.RRP18;
import com.musiccrafter.rrp18.block.custom.StrawBedBlock;
import com.musiccrafter.rrp18.block.custom.SugarBeetCropBlock;
import com.musiccrafter.rrp18.item.ModCreativeModeTab;
import com.musiccrafter.rrp18.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RRP18.MOD_ID);

    // Salt

    public static final RegistryObject<Block> SALT_BLOCK = registerBlock("salt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(0.5f).sound(SoundType.SAND)), ModCreativeModeTab.RRP_TAB);

    public static final RegistryObject<Block> ROCK_SALT_BLOCK = registerBlock("rock_salt_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.RRP_TAB);

    // Ores

    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.RRP_TAB);

    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.RRP_TAB);

    public static final RegistryObject<Block> LEAD_ORE = registerBlock("lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.RRP_TAB);

    public static final RegistryObject<Block> DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4.5f).requiresCorrectToolForDrops()), ModCreativeModeTab.RRP_TAB);

    // Crops

    public static final RegistryObject<Block> SUGAR_BEET_CROP = BLOCKS.register("sugar_beet_crop",
            () -> new SugarBeetCropBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)
                    .strength(0f).noCollission().noOcclusion()));

    // Beds

    public static final RegistryObject<Block> STRAW_BED = registerBlock("straw_bed",
            () -> new StrawBedBlock(BlockBehaviour.Properties.of(Material.LEAVES)
                    .strength(0.2f).sound(SoundType.GRASS).noOcclusion()), ModCreativeModeTab.RRP_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}