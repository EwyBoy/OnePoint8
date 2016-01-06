package com.ewyboy.onepoint8.Blocks;

import com.ewyboy.onepoint8.Loaders.CreativeTabLoader;
import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TestBlock extends Block {

    public TestBlock() {
        super(Material.anvil);
        setCreativeTab(CreativeTabLoader.OnePoint8Tab);
        setUnlocalizedName(StringMap.TestBlock);
    }

    @Override
    public IBlockState onBlockPlaced(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        int pyramidRadius = 16, pyramidHeight = 16;

        if (placer.isSneaking()) {
            IBlockState block = this.getBlockState().getBaseState();
            for (int y = 0; y < pyramidHeight; y++) {
                pyramidRadius--;
                for (int x = ((pyramidRadius) * (-1));  x < pyramidRadius; x++) {
                    for (int z = ((pyramidRadius) * (-1)); z < pyramidRadius; z++) {
                        world.setBlockState(pos.add(x,y,z), block, 3);
                    }
                }
            }
        }
        return super.onBlockPlaced(world, pos, facing, hitX, hitY, hitZ, meta, placer);
    }
}
