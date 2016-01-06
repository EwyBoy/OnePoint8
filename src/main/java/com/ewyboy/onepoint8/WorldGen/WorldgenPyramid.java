package com.ewyboy.onepoint8.WorldGen;

import com.ewyboy.onepoint8.Loaders.BlockLoader;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldgenPyramid implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        int pyramidRadius = 16, pyramidHeight = 16;

        BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), 100, chunkZ*16 + random.nextInt(16));

        BiomeGenBase biomeGenBase = world.getBiomeGenForCoords(pos);
        if (biomeGenBase.biomeName.equals("Desert")) {
            IBlockState block = BlockLoader.TestBlock.getBlockState().getBaseState();
            for (int y = 0; y < pyramidHeight; y++) {
                pyramidRadius--;
                for (int x = ((pyramidRadius) * (-1));  x < pyramidRadius; x++) {
                    for (int z = ((pyramidRadius) * (-1)); z < pyramidRadius; z++) {
                        world.setBlockState(pos.add(x,y,z), block, 3);
                    }
                }
            }
        }
    }
}
