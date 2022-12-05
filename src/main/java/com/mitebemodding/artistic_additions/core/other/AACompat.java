package com.mitebemodding.artistic_additions.core.other;

import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;

public class AACompat {
    public static void init() {

    }

    public static void registerFlammable(){
        FireBlock fire = (FireBlock) Blocks.FIRE;
        //fire.setFlammable(AABlocks.OAK_LATTICE.get(), 5, 20);
    }
}
