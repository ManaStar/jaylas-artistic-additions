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

    public static final RegistryObject<Block> OAK_LATTICE = BLOCKS.register("oak_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.WOOD)));
    public static final RegistryObject<Block> SPRUCE_LATTICE = BLOCKS.register("spruce_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.PODZOL)));
    public static final RegistryObject<Block> BIRCH_LATTICE = BLOCKS.register("birch_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.SAND)));
    public static final RegistryObject<Block> JUNGLE_LATTICE = BLOCKS.register("jungle_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.DIRT)));
    public static final RegistryObject<Block> ACACIA_LATTICE = BLOCKS.register("acacia_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> DARK_OAK_LATTICE = BLOCKS.register("dark_oak_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> MANGROVE_LATTICE = BLOCKS.register("mangrove_lattice", () -> new Block(AABlockProperties.lattice(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> CRIMSON_LATTICE = BLOCKS.register("crimson_lattice", () -> new Block(AABlockProperties.netherLattice(MaterialColor.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_LATTICE = BLOCKS.register("warped_lattice", () -> new Block(AABlockProperties.netherLattice(MaterialColor.WARPED_STEM)));

    public static class AABlockProperties {
        public static BlockBehaviour.Properties lattice(Material material, MaterialColor materialColor){
            return BlockBehaviour.Properties.of(material, materialColor).strength(2.0F, 3.0F).sound(SoundType.WOOD);
        }
        public static BlockBehaviour.Properties lattice(MaterialColor materialColor) {
            return lattice(Material.WOOD, materialColor);
        }

        public static BlockBehaviour.Properties netherLattice(MaterialColor materialColor) {
            return lattice(Material.NETHER_WOOD, materialColor);
        }
    }
}
