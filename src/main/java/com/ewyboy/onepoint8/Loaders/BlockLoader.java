package com.ewyboy.onepoint8.Loaders;

import com.ewyboy.onepoint8.Blocks.TestBlock;
import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockLoader {

    public static Block TestBlock;

    public static void loadBlocks() {
        TestBlock = new TestBlock();
        GameRegistry.registerBlock(TestBlock, StringMap.TestBlock);
    }
}
