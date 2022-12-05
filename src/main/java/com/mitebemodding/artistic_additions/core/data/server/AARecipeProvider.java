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
        latticeRecipe(Items.OAK_PLANKS, AAItems.OAK_LATTICE, consumer);
        latticeRecipe(Items.SPRUCE_PLANKS, AAItems.SPRUCE_LATTICE, consumer);
        latticeRecipe(Items.BIRCH_PLANKS, AAItems.BIRCH_LATTICE, consumer);
        latticeRecipe(Items.JUNGLE_PLANKS, AAItems.JUNGLE_LATTICE, consumer);
        latticeRecipe(Items.ACACIA_PLANKS, AAItems.ACACIA_LATTICE, consumer);
        latticeRecipe(Items.DARK_OAK_PLANKS, AAItems.DARK_OAK_LATTICE, consumer);
        latticeRecipe(Items.MANGROVE_PLANKS, AAItems.MANGROVE_LATTICE, consumer);
    }

    public static void latticeRecipe(ItemLike planks, Supplier<Item> lattice, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(lattice.get(), 2).define('P', planks).define('S', Tags.Items.RODS_WOODEN).pattern("PS").pattern("SP").unlockedBy(getHasName(planks), has(planks)).group("wooden_lattices").save(consumer, new ResourceLocation(ArtisticAdditions.MODID, getItemName(lattice.get())));
    }
}
