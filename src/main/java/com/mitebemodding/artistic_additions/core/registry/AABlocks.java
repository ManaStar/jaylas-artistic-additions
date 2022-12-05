package com.mitebemodding.artistic_additions.core.registry;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AABlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ArtisticAdditions.MODID);

    public static final RegistryObject<Block> OAK_LATTICE = BLOCKS.register("oak_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.WOOD)));
    public static final RegistryObject<Block> SPRUCE_LATTICE = BLOCKS.register("spruce_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.PODZOL)));
    public static final RegistryObject<Block> BIRCH_LATTICE = BLOCKS.register("birch_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.SAND)));
    public static final RegistryObject<Block> JUNGLE_LATTICE = BLOCKS.register("jungle_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.DIRT)));
    public static final RegistryObject<Block> ACACIA_LATTICE = BLOCKS.register("acacia_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> DARK_OAK_LATTICE = BLOCKS.register("dark_oak_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> MANGROVE_LATTICE = BLOCKS.register("mangrove_lattice", () -> new Block(Properties.LATTICES.color(MaterialColor.COLOR_RED)));

    public static class Properties {
        public static final BlockBehaviour.Properties LATTICES = BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD);
    }
}
