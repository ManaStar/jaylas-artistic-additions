package com.mitebemodding.artistic_additions.core;

import com.mitebemodding.artistic_additions.core.data.client.AALanguageProvider;
import com.mitebemodding.artistic_additions.core.data.server.AALootTableProvider;
import com.mitebemodding.artistic_additions.core.data.server.AARecipeProvider;
import com.mitebemodding.artistic_additions.core.data.server.tags.AABlockTagsProvider;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import com.mitebemodding.artistic_additions.core.registry.AAItems;
import com.mojang.logging.LogUtils;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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

        AAItems.ITEMS.register(bus);
        AABlocks.BLOCKS.register(bus);

        bus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        //Client
        generator.addProvider(event.includeClient(), new AALanguageProvider(generator));

        //Server
        generator.addProvider(event.includeServer(), new AALootTableProvider(generator));
        generator.addProvider(event.includeServer(), new AARecipeProvider(generator));
        generator.addProvider(event.includeServer(), new AABlockTagsProvider(generator, fileHelper));
    }
}
