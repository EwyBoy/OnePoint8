package com.ewyboy.onepoint8.Items;

import com.ewyboy.onepoint8.Loaders.CreativeTabLoader;
import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class TestItem extends Item {

    public TestItem() {
        setCreativeTab(CreativeTabLoader.OnePoint8Tab);
        setUnlocalizedName(StringMap.TestItem);
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ) {
        IBlockState block = world.getBlockState(pos);
        for (int i = pos.getY(); i < world.getActualHeight(); i++) {
            world.setBlockState(pos.add(0,i,0), block, 3);
        }
        return false;
    }
}
