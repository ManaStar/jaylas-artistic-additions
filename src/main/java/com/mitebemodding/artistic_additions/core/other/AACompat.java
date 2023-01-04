package com.mitebemodding.artistic_additions.core.other;

import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class AACompat {
    public static void init() {
        registerFlammable();
    }

    public static void registerFlammable(){
        FireBlock fire = (FireBlock) Blocks.FIRE;

        //Lattices
        fire.setFlammable(AABlocks.OAK_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.SPRUCE_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.BIRCH_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.JUNGLE_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.ACACIA_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.DARK_OAK_LATTICE.get(), 5, 20);
        fire.setFlammable(AABlocks.MANGROVE_LATTICE.get(), 5, 20);

        //Crates
        fire.setFlammable(AABlocks.OAK_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.SPRUCE_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.BIRCH_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.JUNGLE_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.ACACIA_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.DARK_OAK_CRATE.get(), 5, 20);
        fire.setFlammable(AABlocks.MANGROVE_CRATE.get(), 5, 20);
    }
}
