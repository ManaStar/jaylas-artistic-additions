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
        //Blocks
        add(AABlocks.OAK_LATTICE.get(), "Oak Lattice");
        add(AABlocks.SPRUCE_LATTICE.get(), "Spruce Lattice");
        add(AABlocks.BIRCH_LATTICE.get(), "Birch Lattice");
        add(AABlocks.JUNGLE_LATTICE.get(), "Jungle Lattice");
        add(AABlocks.ACACIA_LATTICE.get(), "Acacia Lattice");
        add(AABlocks.DARK_OAK_LATTICE.get(), "Dark Oak Lattice");
        add(AABlocks.MANGROVE_LATTICE.get(), "Mangrove Lattice");
        add(AABlocks.CRIMSON_LATTICE.get(), "Crimson Lattice");
        add(AABlocks.WARPED_LATTICE.get(), "Warped Lattice");

        add(AABlocks.OAK_CRATE.get(), "Oak Crate");
        add(AABlocks.SPRUCE_CRATE.get(), "Spruce Crate");
        add(AABlocks.BIRCH_CRATE.get(), "Birch Crate");
        add(AABlocks.JUNGLE_CRATE.get(), "Jungle Crate");
        add(AABlocks.ACACIA_CRATE.get(), "Acacia Crate");
        add(AABlocks.DARK_OAK_CRATE.get(), "Dark Oak Crate");
        add(AABlocks.MANGROVE_CRATE.get(), "Mangrove Crate");
        add(AABlocks.CRIMSON_CRATE.get(), "Crimson Crate");
        add(AABlocks.WARPED_CRATE.get(), "Warped Crate");
    }
}
