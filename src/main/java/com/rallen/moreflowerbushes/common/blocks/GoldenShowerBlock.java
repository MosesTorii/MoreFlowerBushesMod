package com.rallen.moreflowerbushes.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GoldenShowerBlock extends MoreFlowerBushesBlock {
    private static Properties props = Properties.create(Material.TALL_PLANTS)
            .hardnessAndResistance(0.5f)
            .sound(SoundType.PLANT)
            .harvestLevel(0);

    public GoldenShowerBlock() {
        super(props, "golden_shower_block");
    }
}