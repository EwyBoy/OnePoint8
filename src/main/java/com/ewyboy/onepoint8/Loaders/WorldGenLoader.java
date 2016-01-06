package com.ewyboy.onepoint8.Loaders;

import com.ewyboy.onepoint8.WorldGen.WorldgenPyramid;

public class WorldGenLoader {

    public static WorldgenPyramid worldGenPyramid;

    public static void loadWorldGen() {
        worldGenPyramid = new WorldgenPyramid();
        //GameRegistry.registerWorldGenerator(worldGenPyramid,1);
    }
}
