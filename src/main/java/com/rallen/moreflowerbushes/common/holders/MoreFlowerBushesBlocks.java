package com.rallen.moreflowerbushes.common.holders;

import com.rallen.moreflowerbushes.MoreFlowerBushesMod;
import com.rallen.moreflowerbushes.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = MoreFlowerBushesMod.MOD_ID, bus = Bus.MOD)
@ObjectHolder(MoreFlowerBushesMod.MOD_ID)
public class MoreFlowerBushesBlocks {

    public static final Block blue_sage_block = null;
    public static final Block butterfly_weed_block = null;
    public static final Block fuchsia_block = null;
    public static final Block golden_shower_block = null;
    public static final Block hortensia_block = null;
    public static final Block larkspur_block = null;
    public static final Block mountain_laurel_block = null;
    public static final Block purple_hibiscus_block = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlueSageBlock());
        event.getRegistry().register(new ButterflyWeedBlock());
        event.getRegistry().register(new FuchsiaBlock());
        event.getRegistry().register(new GoldenShowerBlock());
        event.getRegistry().register(new HortensiaBlock());
        event.getRegistry().register(new LarkspurBlock());
        event.getRegistry().register(new MountainLaurelBlock());
        event.getRegistry().register(new PurpleHibiscusBlock());
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new BlockItem(blue_sage_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(blue_sage_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(butterfly_weed_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(butterfly_weed_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(fuchsia_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(fuchsia_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(golden_shower_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(golden_shower_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(hortensia_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(hortensia_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(larkspur_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(larkspur_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(mountain_laurel_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(mountain_laurel_block.getRegistryName()));

        event.getRegistry().register(new BlockItem(purple_hibiscus_block,
                new Item.Properties().group(ItemGroup.DECORATIONS))
                .setRegistryName(purple_hibiscus_block.getRegistryName()));

    }
}