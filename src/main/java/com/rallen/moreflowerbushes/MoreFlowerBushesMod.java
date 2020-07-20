package com.rallen.moreflowerbushes;

import com.rallen.moreflowerbushes.common.holders.MoreFlowerBushesBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod("moreflowerbushes")
public class MoreFlowerBushesMod
{
    public static final String MOD_ID = "moreflowerbushes";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static MoreFlowerBushesMod Instance;

    public MoreFlowerBushesMod() {
        Instance = this;
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        //register listeners to the event bus
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.blue_sage_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.butterfly_weed_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.fuchsia_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.purple_hibiscus_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.mountain_laurel_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.larkspur_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.hortensia_block, RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MoreFlowerBushesBlocks.golden_shower_block, RenderType.getCutout());
    }

}
