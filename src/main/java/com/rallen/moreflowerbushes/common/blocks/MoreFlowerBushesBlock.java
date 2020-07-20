package com.rallen.moreflowerbushes.common.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class MoreFlowerBushesBlock extends DoublePlantBlock {
    private static Properties props = Properties.create(Material.TALL_PLANTS)
            .hardnessAndResistance(0f)
            .sound(SoundType.PLANT)
            .doesNotBlockMovement()
            .tickRandomly()
            .harvestLevel(0);
    protected MoreFlowerBushesBlock(String registryName) {
        super(props);
        setRegistryName(registryName);

    }

    @Override
    public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

}