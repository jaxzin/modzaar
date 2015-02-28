package com.jaxzin.modzaar;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Modzaar.MODID, version = Modzaar.VERSION)
public class Modzaar
{
    public static final String MODID = "modzaar";
    public static final String VERSION = "1.0-SNAPSHOT";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }
}
