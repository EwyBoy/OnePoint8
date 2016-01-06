package com.ewyboy.onepoint8.Loaders;

import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(StringMap.ModID)
public class CreativeTabLoader {
    public static CreativeTabs OnePoint8Tab = new CreativeTabs(StringMap.ModName) {
        public ItemStack getIconItemStack(){return new ItemStack(BlockLoader.TestBlock);}
        @Override
        public Item getTabIconItem() {return null;}
    };
}
