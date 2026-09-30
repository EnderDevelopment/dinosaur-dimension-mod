package com.gbrimareco27.dinosaurdimensionmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class DinosaurDimensionMod implements ModInitializer {
    public static final String MOD_ID = "dinosaurdimensionmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block PORTAL_BLOCK = new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN));

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Dinosaur Dimension Mod");

        Registry.register(Registries.BLOCK, new Identifier(MOD_ID, "portal_block"), PORTAL_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "portal_block"), new BlockItem(PORTAL_BLOCK, new Item.Settings()));

        // Register other blocks, items, and entities here
    }
}
