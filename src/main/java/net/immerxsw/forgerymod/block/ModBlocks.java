package net.immerxsw.forgerymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.immerxsw.forgerymod.ForgeryMod;
import net.immerxsw.forgerymod.item.ModItemGroup;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block ORE_TIN = registerBlock("ore_tin",
            new OreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 3.0f)), ModItemGroup.FORGERY);
    public static final Block BLOCK_TIN = registerBlock("block_tin",
            new OreBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f, 6.0f)), ModItemGroup.FORGERY);
    public static final Block BLOCK_BRONZE = registerBlock("block_bronze",
            new OreBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f)), ModItemGroup.FORGERY);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(ForgeryMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(ForgeryMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
    public static void registerModBlocks() {
        ForgeryMod.LOGGER.debug("Registering Mod Blocks for " + ForgeryMod.MOD_ID);
    }
}
