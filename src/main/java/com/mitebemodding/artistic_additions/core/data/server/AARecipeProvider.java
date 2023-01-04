package com.mitebemodding.artistic_additions.core.data.server;

import com.mitebemodding.artistic_additions.core.ArtisticAdditions;
import com.mitebemodding.artistic_additions.core.registry.AAItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AARecipeProvider extends RecipeProvider {
    public AARecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
        //Lattices
        latticeRecipe(Items.OAK_PLANKS, AAItems.OAK_LATTICE, consumer);
        latticeRecipe(Items.SPRUCE_PLANKS, AAItems.SPRUCE_LATTICE, consumer);
        latticeRecipe(Items.BIRCH_PLANKS, AAItems.BIRCH_LATTICE, consumer);
        latticeRecipe(Items.JUNGLE_PLANKS, AAItems.JUNGLE_LATTICE, consumer);
        latticeRecipe(Items.ACACIA_PLANKS, AAItems.ACACIA_LATTICE, consumer);
        latticeRecipe(Items.DARK_OAK_PLANKS, AAItems.DARK_OAK_LATTICE, consumer);
        latticeRecipe(Items.MANGROVE_PLANKS, AAItems.MANGROVE_LATTICE, consumer);
        latticeRecipe(Items.CRIMSON_PLANKS, AAItems.CRIMSON_LATTICE, consumer);
        latticeRecipe(Items.WARPED_PLANKS, AAItems.WARPED_LATTICE, consumer);

        //Crates
        crateRecipe(Items.OAK_PLANKS, AAItems.OAK_CRATE, consumer);
        crateRecipe(Items.SPRUCE_PLANKS, AAItems.SPRUCE_CRATE, consumer);
        crateRecipe(Items.BIRCH_PLANKS, AAItems.BIRCH_CRATE, consumer);
        crateRecipe(Items.JUNGLE_PLANKS, AAItems.JUNGLE_CRATE, consumer);
        crateRecipe(Items.ACACIA_PLANKS, AAItems.ACACIA_CRATE, consumer);
        crateRecipe(Items.DARK_OAK_PLANKS, AAItems.DARK_OAK_CRATE, consumer);
        crateRecipe(Items.MANGROVE_PLANKS, AAItems.MANGROVE_CRATE, consumer);
        crateRecipe(Items.CRIMSON_PLANKS, AAItems.CRIMSON_CRATE, consumer);
        crateRecipe(Items.WARPED_PLANKS, AAItems.WARPED_CRATE, consumer);
    }

    public static void latticeRecipe(ItemLike planks, Supplier<Item> lattice, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(lattice.get(), 3).define('P', planks).define('S', Tags.Items.RODS_WOODEN)
                .pattern("PS")
                .pattern("SP")
                .unlockedBy(getHasName(planks), has(planks))
                .group("wooden_lattices")
                .save(consumer, new ResourceLocation(ArtisticAdditions.MODID, getItemName(lattice.get())));
    }

    public static void crateRecipe(ItemLike planks, Supplier<Item> crate, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(crate.get(), 5).define('P', planks).define('S', Tags.Items.RODS_WOODEN)
                .pattern("PSP")
                .pattern("S S")
                .pattern("PSP")
                .unlockedBy(getHasName(planks), has(planks))
                .group("wooden_crates")
                .save(consumer, new ResourceLocation(ArtisticAdditions.MODID, getItemName(crate.get())));
    }
}
