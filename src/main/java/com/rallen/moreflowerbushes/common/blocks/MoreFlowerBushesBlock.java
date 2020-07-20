package com.rallen.moreflowerbushes.common.blocks;

import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class MoreFlowerBushesBlock extends DoublePlantBlock {
    private static Properties props = Properties.create(Material.TALL_PLANTS)
            .hardnessAndResistance(0.5f)
            .sound(SoundType.PLANT)
            .doesNotBlockMovement()
            .variableOpacity()
            .notSolid()
            .harvestLevel(0);
    protected MoreFlowerBushesBlock(String registryName) {
        super(props);
        setRegistryName(registryName);

    }
}