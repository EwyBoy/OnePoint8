package com.ewyboy.onepoint8;

import com.ewyboy.onepoint8.Loaders.BlockLoader;
import com.ewyboy.onepoint8.Loaders.ItemLoader;
import com.ewyboy.onepoint8.Loaders.WorldGenLoader;
import com.ewyboy.onepoint8.Networking.CommonProxy;
import com.ewyboy.onepoint8.Util.Logger;
import com.ewyboy.onepoint8.Util.StringMap;
import com.google.common.base.Stopwatch;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.concurrent.TimeUnit;

@Mod(modid = StringMap.ModID, name = StringMap.ModName, version = StringMap.BuildVersion, acceptedMinecraftVersions = "["+StringMap.MinecraftVersion+"]")
public class OnePoint8 {

    @Mod.Instance(StringMap.ModID)
    public static OnePoint8 instance;

    @SidedProxy(modId = StringMap.ModID, clientSide = StringMap.clientProxyPath, serverSide = StringMap.commonProxyPath)
    public static CommonProxy proxy;

    private long launchTime;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Pre-Initialization started");
                launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Pre-Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Pre-Initialization process successfully done");
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Initialization started");
                BlockLoader.loadBlocks();
                ItemLoader.loadItems();
                proxy.bindRenderers();
                WorldGenLoader.loadWorldGen();
        launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Initialization process successfully done");
    }

    @EventHandler
    public void PostInit(FMLPostInitializationEvent event) {
        Stopwatch watch = Stopwatch.createStarted();
            Logger.info("Post-Initialization started");
                launchTime += watch.elapsed(TimeUnit.MILLISECONDS);
            Logger.info("Post-Initialization finished after " + watch.elapsed(TimeUnit.MILLISECONDS) + "ms");
        Logger.info("Post-Initialization process successfully done");
        Logger.info("Total Initialization time was " + launchTime);
    }
}
