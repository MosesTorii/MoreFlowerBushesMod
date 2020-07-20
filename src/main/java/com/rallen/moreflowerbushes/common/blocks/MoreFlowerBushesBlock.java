package com.rallen.moreflowerbushes.common.blocks;

import net.minecraft.block.TallGrassBlock;

public class MoreFlowerBushesBlock extends TallGrassBlock {
    protected MoreFlowerBushesBlock(Properties props, String registryName) {
        super(props);
        setRegistryName(registryName);
    }
}