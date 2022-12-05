package com.mitebemodding.artistic_additions.core.data.server;

import com.google.common.collect.ImmutableList;
import com.mitebemodding.artistic_additions.core.registry.AABlocks;
import com.mojang.datafixers.util.Pair;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.ValidationContext;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class AALootTableProvider extends LootTableProvider {
    public AALootTableProvider(DataGenerator generator) {
        super(generator);
    }

    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> lootTables = ImmutableList.of(Pair.of(AABlockLoot::new, LootContextParamSets.BLOCK));

    @Override
    protected @NotNull List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootContextParamSet>> getTables() {
        return this.lootTables;
    }

    @Override
    protected void validate(@NotNull Map<ResourceLocation, LootTable> map, @NotNull ValidationContext validationtracker) {
    }

    public static class AABlockLoot extends BlockLoot {
        @Override
        protected void addTables() {
            this.dropSelf(AABlocks.OAK_LATTICE.get());
            this.dropSelf(AABlocks.SPRUCE_LATTICE.get());
            this.dropSelf(AABlocks.BIRCH_LATTICE.get());
            this.dropSelf(AABlocks.JUNGLE_LATTICE.get());
            this.dropSelf(AABlocks.ACACIA_LATTICE.get());
            this.dropSelf(AABlocks.DARK_OAK_LATTICE.get());
            this.dropSelf(AABlocks.MANGROVE_LATTICE.get());
        }

        @Override
        protected @NotNull Iterable<Block> getKnownBlocks() {
            return AABlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
        }
    }
}
