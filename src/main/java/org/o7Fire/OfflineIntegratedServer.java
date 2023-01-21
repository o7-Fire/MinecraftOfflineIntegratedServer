package org.o7Fire;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = OfflineIntegratedServer.MODID, version = OfflineIntegratedServer.VERSION, acceptableRemoteVersions = "*")
public class OfflineIntegratedServer
{
    public static final String MODID = "OfflineIntegratedServer";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		System.out.println("OfflineIntegratedServer is loaded!");
    }
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.getServer().setOnlineMode(false);
    }
}
