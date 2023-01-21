package org.o7Fire;


import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = OfflineIntegratedServer.MODID, version = OfflineIntegratedServer.VERSION, acceptableRemoteVersions = "*")
public class OfflineIntegratedServer
{
    public static final String MODID = "OfflineIntegratedServer";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
		System.out.println("OfflineIntegratedServer is loaded!");
    }
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event)
    {
        event.getServer().setOnlineMode(false);
    }
}
