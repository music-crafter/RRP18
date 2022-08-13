package com.musiccrafter.rrp18.item;

import com.musiccrafter.rrp18.RRP18;
import com.musiccrafter.rrp18.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RRP18.MOD_ID);

    // Metals

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    // Natural Resources

    public static final RegistryObject<Item> PLANT_FIBER = ITEMS.register("plant_fiber",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> CHARCOAL_DUST = ITEMS.register("charcoal_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> CHALK_DUST = ITEMS.register("chalk_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    // Logs

    public static final RegistryObject<Item> ASPEN_LOG = ITEMS.register("aspen_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> BAOBAB_LOG = ITEMS.register("baobab_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> CYPRESS_LOG = ITEMS.register("cypress_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> FIR_LOG = ITEMS.register("fir_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> JACARANDA_LOG = ITEMS.register("jacaranda_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> MAHOGANY_LOG = ITEMS.register("mahogany_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> MANGROVE_LOG = ITEMS.register("mangrove_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> MAPLE_LOG = ITEMS.register("maple_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> PALM_LOG = ITEMS.register("palm_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> PALO_VERDE_LOG = ITEMS.register("palo_verde_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> PINE_LOG = ITEMS.register("pine_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> RAINBOW_EUCALYPTUS_LOG = ITEMS.register("rainbow_eucalyptus_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> REDWOOD_LOG = ITEMS.register("redwood_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> WILLOW_LOG = ITEMS.register("willow_log",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    // Leatherworking

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> ROCK_SALT = ITEMS.register("rock_salt",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> QUICKLIME = ITEMS.register("quicklime",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> TANNING_SOLUTION = ITEMS.register("tanning_solution",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> DEER_HIDE = ITEMS.register("deer_hide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> BOAR_HIDE = ITEMS.register("boar_hide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> MOOSE_HIDE = ITEMS.register("moose_hide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> COW_HIDE = ITEMS.register("cow_hide",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    // Food

    public static final RegistryObject<Item> FLATBREAD = ITEMS.register("flatbread",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB).food(ModFoods.FLATBREAD)));

    // TConstruct Casts

    public static final RegistryObject<Item> UNFIRED_PICK_HEAD = ITEMS.register("unfired_pick_head",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    // Crops

    public static final RegistryObject<Item> SUGAR_BEET_SEEDS = ITEMS.register("sugar_beet_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SUGAR_BEET_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.RRP_TAB)));

    public static final RegistryObject<Item> SUGAR_BEET = ITEMS.register("sugar_beet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RRP_TAB).food(ModFoods.SUGAR_BEET)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
