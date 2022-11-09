package games.enchanted.shared;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.CombinableVerticalSlabBlock;
import games.enchanted.registry.types.OxidizableVerticalSlab;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class registerBlocks {
    // slab types
    public static Block registerVerticalWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalNetherWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalStoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalNetherBrickSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.NETHER_BRICKS);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_NETHER_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_PLACE));
    }
    public static Block registerVerticalDeepslateBrickSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateTileSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_TILES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_TILES_PLACE));
    }
    public static Block registerVerticalBlackstoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalCopperSlab(String id, OxidationLevel oxidationLevel) {
        final Settings settings = FabricBlockSettings.of(Material.METAL).strength(3f, 6f).sounds(BlockSoundGroup.COPPER);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new OxidizableVerticalSlab(oxidationLevel , settings, SoundEvents.BLOCK_COPPER_PLACE));
    }
    public static Block registerVerticalMudSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(1.5f, 3f).sounds(BlockSoundGroup.MUD_BRICKS);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_MUD_BRICKS_PLACE));
    }
    
}
