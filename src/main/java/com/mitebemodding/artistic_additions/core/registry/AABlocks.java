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

    //Lattices
    public static final RegistryObject<Block> OAK_LATTICE = BLOCKS.register("oak_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.WOOD)));
    public static final RegistryObject<Block> SPRUCE_LATTICE = BLOCKS.register("spruce_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.PODZOL)));
    public static final RegistryObject<Block> BIRCH_LATTICE = BLOCKS.register("birch_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.SAND)));
    public static final RegistryObject<Block> JUNGLE_LATTICE = BLOCKS.register("jungle_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.DIRT)));
    public static final RegistryObject<Block> ACACIA_LATTICE = BLOCKS.register("acacia_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> DARK_OAK_LATTICE = BLOCKS.register("dark_oak_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> MANGROVE_LATTICE = BLOCKS.register("mangrove_lattice", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> CRIMSON_LATTICE = BLOCKS.register("crimson_lattice", () -> new Block(AABlockProperties.netherWoodenBlock(MaterialColor.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_LATTICE = BLOCKS.register("warped_lattice", () -> new Block(AABlockProperties.netherWoodenBlock(MaterialColor.WARPED_STEM)));

    //Crates
    public static final RegistryObject<Block> OAK_CRATE = BLOCKS.register("oak_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.WOOD)));
    public static final RegistryObject<Block> SPRUCE_CRATE = BLOCKS.register("spruce_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.PODZOL)));
    public static final RegistryObject<Block> BIRCH_CRATE = BLOCKS.register("birch_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.SAND)));
    public static final RegistryObject<Block> JUNGLE_CRATE = BLOCKS.register("jungle_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.DIRT)));
    public static final RegistryObject<Block> ACACIA_CRATE = BLOCKS.register("acacia_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_ORANGE)));
    public static final RegistryObject<Block> DARK_OAK_CRATE = BLOCKS.register("dark_oak_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_BROWN)));
    public static final RegistryObject<Block> MANGROVE_CRATE = BLOCKS.register("mangrove_crate", () -> new Block(AABlockProperties.woodenBlock(MaterialColor.COLOR_RED)));
    public static final RegistryObject<Block> CRIMSON_CRATE = BLOCKS.register("crimson_crate", () -> new Block(AABlockProperties.netherWoodenBlock(MaterialColor.CRIMSON_STEM)));
    public static final RegistryObject<Block> WARPED_CRATE = BLOCKS.register("warped_crate", () -> new Block(AABlockProperties.netherWoodenBlock(MaterialColor.WARPED_STEM)));

    public static class AABlockProperties {
        public static BlockBehaviour.Properties woodenBlock(Material material, MaterialColor materialColor){
            return BlockBehaviour.Properties.of(material, materialColor).strength(2.0F, 3.0F).sound(SoundType.WOOD);
        }
        public static BlockBehaviour.Properties woodenBlock(MaterialColor materialColor) {
            return woodenBlock(Material.WOOD, materialColor);
        }

        public static BlockBehaviour.Properties netherWoodenBlock(MaterialColor materialColor) {
            return woodenBlock(Material.NETHER_WOOD, materialColor);
        }
    }
}
