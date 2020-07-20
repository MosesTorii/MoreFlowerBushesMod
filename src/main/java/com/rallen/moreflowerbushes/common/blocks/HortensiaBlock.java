package com.rallen.moreflowerbushes.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class HortensiaBlock extends MoreFlowerBushesBlock {
    private static Properties props = Properties.create(Material.TALL_PLANTS)
            .hardnessAndResistance(0.5f)
            .sound(SoundType.PLANT)
            .harvestLevel(0);

    public HortensiaBlock() {
        super(props, "hortensia_block");
    }
}