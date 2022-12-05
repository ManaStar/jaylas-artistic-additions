package com.mitebemodding.artistic_additions;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ArtisticAdditions.MODID)
public class ArtisticAdditions
{
    public static final String MODID = "artistic_additions";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ArtisticAdditions()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
