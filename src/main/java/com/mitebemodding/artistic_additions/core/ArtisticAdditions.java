package com.mitebemodding.artistic_additions.core;

import com.mitebemodding.artistic_additions.core.data.client.AABlockStateProvider;
import com.mitebemodding.artistic_additions.core.data.client.AAItemModelProvider;
import com.mitebemodding.artistic_additions.core.data.client.AALanguageProvider;
import com.mitebemodding.artistic_additions.core.data.server.AALootTableProvider;
import com.mitebemodding.artistic_additions.core.data.server.AARecipeProvider;
import com.mitebemodding.artistic_additions.core.data.server.tags.AABlockTagsProvider;
import com.mitebemodding.artistic_additions.core.data.server.tags.AAItemTagsProvider;
import com.mitebemodding.artistic_additions.core.other.AACompat;
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
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
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

        bus.addListener(this::commonSetup);
        bus.addListener(this::gatherData);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(AACompat::init);
    }

    @SubscribeEvent
    public void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        AABlockTagsProvider blockTagsProvider = new AABlockTagsProvider(generator, fileHelper);

        //Client
        generator.addProvider(event.includeClient(), new AALanguageProvider(generator));
        generator.addProvider(event.includeClient(), new AABlockStateProvider(generator, fileHelper));
        generator.addProvider(event.includeClient(), new AAItemModelProvider(generator, fileHelper));

        //Server
        generator.addProvider(event.includeServer(), new AALootTableProvider(generator));
        generator.addProvider(event.includeServer(), new AARecipeProvider(generator));
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new AAItemTagsProvider(generator, blockTagsProvider, fileHelper));
    }
}
