package com.ewyboy.onepoint8.Loaders;

import com.ewyboy.onepoint8.Items.TestItem;
import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemLoader {

    public static Item TestItem;

    public static void loadItems() {
        TestItem = new TestItem();
        GameRegistry.registerItem(TestItem, StringMap.TestItem);
    }
}
