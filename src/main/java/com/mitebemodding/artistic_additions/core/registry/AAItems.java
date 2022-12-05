package com.mitebemodding.artistic_additions.core.registry;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AAItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArtisticAdditions.MODID);

    public static final RegistryObject<Item> OAK_LATTICE = ITEMS.register("oak_lattice", () -> new BlockItem(AABlocks.OAK_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> SPRUCE_LATTICE = ITEMS.register("spruce_lattice", () -> new BlockItem(AABlocks.SPRUCE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> BIRCH_LATTICE = ITEMS.register("birch_lattice", () -> new BlockItem(AABlocks.BIRCH_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> JUNGLE_LATTICE = ITEMS.register("jungle_lattice", () -> new BlockItem(AABlocks.JUNGLE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ACACIA_LATTICE = ITEMS.register("acacia_lattice", () -> new BlockItem(AABlocks.ACACIA_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> DARK_OAK_LATTICE = ITEMS.register("dark_oak_lattice", () -> new BlockItem(AABlocks.DARK_OAK_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> MANGROVE_LATTICE = ITEMS.register("mangrove_lattice", () -> new BlockItem(AABlocks.MANGROVE_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> CRIMSON_LATTICE = ITEMS.register("crimson_lattice", () -> new BlockItem(AABlocks.CRIMSON_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> WARPED_LATTICE = ITEMS.register("warped_lattice", () -> new BlockItem(AABlocks.WARPED_LATTICE.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));

}
