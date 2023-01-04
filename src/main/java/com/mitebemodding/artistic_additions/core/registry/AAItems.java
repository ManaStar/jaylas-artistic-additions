package com.mitebemodding.artistic_additions.core.registry;

import com.mitebemodding.artistic_additions.common.item.FuelBlockItem;
import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtisticAdditions.MODID);

    //Lattices
    public static final RegistryObject<Item> OAK_LATTICE = ITEMS.register("oak_lattice", () -> new FuelBlockItem(AABlocks.OAK_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> SPRUCE_LATTICE = ITEMS.register("spruce_lattice", () -> new FuelBlockItem(AABlocks.SPRUCE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> BIRCH_LATTICE = ITEMS.register("birch_lattice", () -> new FuelBlockItem(AABlocks.BIRCH_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> JUNGLE_LATTICE = ITEMS.register("jungle_lattice", () -> new FuelBlockItem(AABlocks.JUNGLE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> ACACIA_LATTICE = ITEMS.register("acacia_lattice", () -> new FuelBlockItem(AABlocks.ACACIA_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> DARK_OAK_LATTICE = ITEMS.register("dark_oak_lattice", () -> new FuelBlockItem(AABlocks.DARK_OAK_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> MANGROVE_LATTICE = ITEMS.register("mangrove_lattice", () -> new FuelBlockItem(AABlocks.MANGROVE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> CRIMSON_LATTICE = ITEMS.register("crimson_lattice", () -> new BlockItem(AABlocks.CRIMSON_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WARPED_LATTICE = ITEMS.register("warped_lattice", () -> new BlockItem(AABlocks.WARPED_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

    //Crates
    public static final RegistryObject<Item> OAK_CRATE = ITEMS.register("oak_crate", () -> new FuelBlockItem(AABlocks.OAK_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> SPRUCE_CRATE = ITEMS.register("spruce_crate", () -> new FuelBlockItem(AABlocks.SPRUCE_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> BIRCH_CRATE = ITEMS.register("birch_crate", () -> new FuelBlockItem(AABlocks.BIRCH_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> JUNGLE_CRATE = ITEMS.register("jungle_crate", () -> new FuelBlockItem(AABlocks.JUNGLE_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> ACACIA_CRATE = ITEMS.register("acacia_crate", () -> new FuelBlockItem(AABlocks.ACACIA_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> DARK_OAK_CRATE = ITEMS.register("dark_oak_crate", () -> new FuelBlockItem(AABlocks.DARK_OAK_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> MANGROVE_CRATE = ITEMS.register("mangrove_crate", () -> new FuelBlockItem(AABlocks.MANGROVE_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS), 300));
    public static final RegistryObject<Item> CRIMSON_CRATE = ITEMS.register("crimson_crate", () -> new BlockItem(AABlocks.CRIMSON_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WARPED_CRATE = ITEMS.register("warped_crate", () -> new BlockItem(AABlocks.WARPED_CRATE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
