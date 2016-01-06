package com.ewyboy.onepoint8.Networking;

import com.ewyboy.onepoint8.Loaders.BlockLoader;
import com.ewyboy.onepoint8.Loaders.ItemLoader;
import com.ewyboy.onepoint8.Util.StringMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ClientProxy extends CommonProxy {

    @Override
    public void bindRenderers() {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(BlockLoader.TestBlock), 0, new ModelResourceLocation(StringMap.ModID + ":" + "TestBlock", "inventory"));
        renderItem.getItemModelMesher().register(ItemLoader.TestItem, 0, new ModelResourceLocation(StringMap.ModID + ":" + "TestItem", "inventory"));
    }
}
