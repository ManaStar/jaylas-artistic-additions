package com.mitebemodding.artistic_additions.core.data.client;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class AAItemModelProvider extends ItemModelProvider {
    public AAItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ArtisticAdditions.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        //Lattices
        basicBlockItem(AABlocks.OAK_LATTICE);
        basicBlockItem(AABlocks.SPRUCE_LATTICE);
        basicBlockItem(AABlocks.BIRCH_LATTICE);
        basicBlockItem(AABlocks.JUNGLE_LATTICE);
        basicBlockItem(AABlocks.ACACIA_LATTICE);
        basicBlockItem(AABlocks.DARK_OAK_LATTICE);
        basicBlockItem(AABlocks.MANGROVE_LATTICE);
        basicBlockItem(AABlocks.CRIMSON_LATTICE);
        basicBlockItem(AABlocks.WARPED_LATTICE);

        //Crates
        basicBlockItem(AABlocks.OAK_CRATE);
        basicBlockItem(AABlocks.SPRUCE_CRATE);
        basicBlockItem(AABlocks.BIRCH_CRATE);
        basicBlockItem(AABlocks.JUNGLE_CRATE);
        basicBlockItem(AABlocks.ACACIA_CRATE);
        basicBlockItem(AABlocks.DARK_OAK_CRATE);
        basicBlockItem(AABlocks.MANGROVE_CRATE);
        basicBlockItem(AABlocks.CRIMSON_CRATE);
        basicBlockItem(AABlocks.WARPED_CRATE);
    }

    private void basicBlockItem(Supplier<? extends Block> block) {
        withExistingParent(name(block), new ResourceLocation(ArtisticAdditions.MODID, "block/" + name(block)));
    }

    private static String name(Supplier<? extends Block> block) {
        return ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
    }
}
