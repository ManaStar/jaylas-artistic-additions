package com.mitebemodding.artistic_additions.core.data.client;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AABlockStateProvider extends BlockStateProvider {
    public AABlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ArtisticAdditions.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Lattices
        simpleBlock(AABlocks.OAK_LATTICE.get());
        simpleBlock(AABlocks.SPRUCE_LATTICE.get());
        simpleBlock(AABlocks.BIRCH_LATTICE.get());
        simpleBlock(AABlocks.JUNGLE_LATTICE.get());
        simpleBlock(AABlocks.ACACIA_LATTICE.get());
        simpleBlock(AABlocks.DARK_OAK_LATTICE.get());
        simpleBlock(AABlocks.MANGROVE_LATTICE.get());
        simpleBlock(AABlocks.CRIMSON_LATTICE.get());
        simpleBlock(AABlocks.WARPED_LATTICE.get());

        //Crate
        simpleBlock(AABlocks.OAK_CRATE.get());
        simpleBlock(AABlocks.SPRUCE_CRATE.get());
        simpleBlock(AABlocks.BIRCH_CRATE.get());
        simpleBlock(AABlocks.JUNGLE_CRATE.get());
        simpleBlock(AABlocks.ACACIA_CRATE.get());
        simpleBlock(AABlocks.DARK_OAK_CRATE.get());
        simpleBlock(AABlocks.MANGROVE_CRATE.get());
        simpleBlock(AABlocks.CRIMSON_CRATE.get());
        simpleBlock(AABlocks.WARPED_CRATE.get());
    }
}
