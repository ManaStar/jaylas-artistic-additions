package com.mitebemodding.artistic_additions.core.data.server.tags;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class AAItemTagsProvider extends ItemTagsProvider {
    public AAItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper fileHelper) {
        super(generator, blockTagsProvider, ArtisticAdditions.MODID, fileHelper);
    }

    @Override
    protected void addTags() {
        tag(ItemTags.NON_FLAMMABLE_WOOD).add(
                AAItems.CRIMSON_LATTICE.get(),
                AAItems.WARPED_LATTICE.get(),

                AAItems.CRIMSON_CRATE.get(),
                AAItems.WARPED_CRATE.get()
        );
    }
}
