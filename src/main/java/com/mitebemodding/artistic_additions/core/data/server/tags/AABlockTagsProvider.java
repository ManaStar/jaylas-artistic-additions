package com.mitebemodding.artistic_additions.core.data.server.tags;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class AABlockTagsProvider extends BlockTagsProvider {
    public AABlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper fileHelper) {
        super(generator, ArtisticAdditions.MODID, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(BlockTags.MINEABLE_WITH_AXE).add(
                AABlocks.OAK_LATTICE.get(),
                AABlocks.SPRUCE_LATTICE.get(),
                AABlocks.BIRCH_LATTICE.get(),
                AABlocks.JUNGLE_LATTICE.get(),
                AABlocks.ACACIA_LATTICE.get(),
                AABlocks.DARK_OAK_LATTICE.get(),
                AABlocks.MANGROVE_LATTICE.get(),
                AABlocks.CRIMSON_LATTICE.get(),
                AABlocks.WARPED_LATTICE.get()
        );
        tag(BlockTags.NON_FLAMMABLE_WOOD).add(
                AABlocks.CRIMSON_LATTICE.get(),
                AABlocks.WARPED_LATTICE.get()
        );
    }
}
