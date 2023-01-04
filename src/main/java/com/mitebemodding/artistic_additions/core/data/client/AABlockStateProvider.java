package com.mitebemodding.artistic_additions.core.data.client;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class AABlockStateProvider extends BlockStateProvider {
    public AABlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ArtisticAdditions.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        //Lattices
        latticeBlock(AABlocks.OAK_LATTICE, Blocks.OAK_PLANKS);
        latticeBlock(AABlocks.SPRUCE_LATTICE, Blocks.SPRUCE_PLANKS);
        latticeBlock(AABlocks.BIRCH_LATTICE, Blocks.BIRCH_PLANKS);
        latticeBlock(AABlocks.JUNGLE_LATTICE, Blocks.JUNGLE_PLANKS);
        latticeBlock(AABlocks.ACACIA_LATTICE, Blocks.ACACIA_PLANKS);
        latticeBlock(AABlocks.DARK_OAK_LATTICE, Blocks.DARK_OAK_PLANKS);
        latticeBlock(AABlocks.MANGROVE_LATTICE, Blocks.MANGROVE_PLANKS);
        latticeBlock(AABlocks.CRIMSON_LATTICE, Blocks.CRIMSON_PLANKS);
        latticeBlock(AABlocks.WARPED_LATTICE, Blocks.WARPED_PLANKS);

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

    private void cubeColumn(Supplier<? extends Block> block, ResourceLocation side, ResourceLocation end) {
        simpleBlock(block.get(), models().cubeColumn(name(block), side, end));
    }

    private void cubeColumn(Supplier<? extends Block> block) {
        cubeColumn(block, new ResourceLocation(ArtisticAdditions.MODID, "block/" + name(block) + "_side"), new ResourceLocation(ArtisticAdditions.MODID, "block/" + name(block) + "_end"));
    }

    private void latticeBlock(Supplier<? extends Block> block, Block planks) {
        cubeColumn(block, new ResourceLocation(ArtisticAdditions.MODID, "block/" + name(block)), new ResourceLocation(ForgeRegistries.BLOCKS.getKey(planks).getNamespace(), "block/" + name(planks)));
    }

    private static String name(Supplier<? extends Block> block) {
        return ForgeRegistries.BLOCKS.getKey(block.get()).getPath();
    }

    private static String name(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block).getPath();
    }
}
