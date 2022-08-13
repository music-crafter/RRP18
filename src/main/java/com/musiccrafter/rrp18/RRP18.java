package com.musiccrafter.rrp18;

import com.mojang.logging.LogUtils;
import com.musiccrafter.rrp18.block.ModBlocks;
import com.musiccrafter.rrp18.item.ModItems;
import com.musiccrafter.rrp18.util.ModTags;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RRP18.MOD_ID)
public class RRP18
{
    public static final String MOD_ID = "rrp";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public RRP18()
    {
        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModTags.register();

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register the enqueueIMC method for modloading

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SUGAR_BEET_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.STRAW_BED.get(), RenderType.cutout());

    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
