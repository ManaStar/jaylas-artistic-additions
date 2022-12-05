package com.mitebemodding.artistic_additions.core.data.client;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class AALanguageProvider extends LanguageProvider {
    public AALanguageProvider(DataGenerator generator) {
        super(generator, ArtisticAdditions.MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(AABlocks.OAK_LATTICE.get(), "Oak Lattice");
        add(AABlocks.SPRUCE_LATTICE.get(), "Spruce Lattice");
        add(AABlocks.BIRCH_LATTICE.get(), "Birch Lattice");
        add(AABlocks.JUNGLE_LATTICE.get(), "Jungle Lattice");
        add(AABlocks.ACACIA_LATTICE.get(), "Acacia Lattice");
        add(AABlocks.DARK_OAK_LATTICE.get(), "Dark Oak Lattice");
        add(AABlocks.MANGROVE_LATTICE.get(), "Mangrove Lattice");
        add(AABlocks.CRIMSON_LATTICE.get(), "Crimson Lattice");
        add(AABlocks.WARPED_LATTICE.get(), "Warped Lattice");
    }
}
