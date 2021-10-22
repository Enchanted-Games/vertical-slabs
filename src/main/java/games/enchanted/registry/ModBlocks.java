package games.enchanted.registry;

import com.google.gson.JsonObject;
import games.enchanted.VerticalSlabs;
import games.enchanted.registry.recipes.BlockRecipes;
import games.enchanted.registry.recipes.RecipeMixin;
import games.enchanted.registry.types.CombinableVerticalSlabBlock;
import games.enchanted.registry.types.OxidizableVerticalSlab;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks{
    // wood slabs
    public static final Block VERTICAL_OAK_SLAB = registerVerticalWoodSlab("vertical_oak_slab");
    public static final Block VERTICAL_SPRUCE_SLAB = registerVerticalWoodSlab("vertical_spruce_slab");
    public static final Block VERTICAL_BIRCH_SLAB = registerVerticalWoodSlab("vertical_birch_slab");
    public static final Block VERTICAL_JUNGLE_SLAB = registerVerticalWoodSlab("vertical_jungle_slab");
    public static final Block VERTICAL_ACACIA_SLAB = registerVerticalWoodSlab("vertical_acacia_slab");
    public static final Block VERTICAL_DARK_OAK_SLAB = registerVerticalWoodSlab("vertical_dark_oak_slab");
    public static final Block VERTICAL_CRIMSON_SLAB = registerVerticalNetherWoodSlab("vertical_crimson_slab");
    public static final Block VERTICAL_WARPED_SLAB = registerVerticalNetherWoodSlab("vertical_warped_slab");

    // stone slabs
    public static final Block VERTICAL_STONE_SLAB = registerVerticalStoneSlab("vertical_stone_slab");
    public static final Block VERTICAL_SMOOTH_STONE_SLAB = registerVerticalStoneSlab("vertical_smooth_stone_slab");
    public static final Block VERTICAL_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_sandstone_slab");
    public static final Block VERTICAL_CUT_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_cut_sandstone_slab");
    public static final Block VERTICAL_PETRIFIED_OAK_SLAB = registerVerticalStoneSlab("vertical_petrified_oak_slab");
    public static final Block VERTICAL_COBBLESTONE_SLAB = registerVerticalStoneSlab("vertical_cobblestone_slab");
    public static final Block VERTICAL_BRICK_SLAB = registerVerticalStoneSlab("vertical_brick_slab");
    public static final Block VERTICAL_STONE_BRICK_SLAB = registerVerticalStoneSlab("vertical_stone_brick_slab");
    public static final Block VERTICAL_NETHER_BRICK_SLAB = registerVerticalNetherBrickSlab("vertical_nether_brick_slab");
    public static final Block VERTICAL_QUARTZ_SLAB = registerVerticalStoneSlab("vertical_quartz_slab");
    public static final Block VERTICAL_SMOOTH_QUARTZ_SLAB = registerVerticalStoneSlab("vertical_smooth_quartz_slab");
    public static final Block VERTICAL_RED_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_red_sandstone_slab");
    public static final Block VERTICAL_CUT_RED_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_cut_red_sandstone_slab");
    public static final Block VERTICAL_PURPUR_SLAB = registerVerticalStoneSlab("vertical_purpur_slab");
    public static final Block VERTICAL_PRISMARINE_SLAB = registerVerticalStoneSlab("vertical_prismarine_slab");
    public static final Block VERTICAL_PRISMARINE_BRICK_SLAB = registerVerticalStoneSlab("vertical_prismarine_brick_slab");
    public static final Block VERTICAL_DARK_PRISMARINE__SLAB = registerVerticalStoneSlab("vertical_dark_prismarine_slab");
    public static final Block VERTICAL_POLISHED_GRANITE_SLAB = registerVerticalStoneSlab("vertical_polished_granite_slab");
    public static final Block VERTICAL_SMOOTH_RED_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_smooth_red_sandstone_slab");
    public static final Block VERTICAL_MOSSY_STONE_BRICK_SLAB = registerVerticalStoneSlab("vertical_mossy_stone_brick_slab");

    public static final Block VERTICAL_POLISHEED_DIORITE_SLAB = registerVerticalStoneSlab("vertical_polished_diorite_slab");
    public static final Block VERTICAL_MOSSY_COBBLESTONE_SLAB = registerVerticalStoneSlab("vertical_mossy_cobblestone_slab");
    public static final Block VERTICAL_ENDSTONE_BRICK_SLAB = registerVerticalStoneSlab("vertical_end_stone_brick_slab");
    public static final Block VERTICAL_SMOOTH_SANDSTONE_SLAB = registerVerticalStoneSlab("vertical_smooth_sandstone_slab");
    public static final Block VERTICAL_GRANITE_SLAB = registerVerticalStoneSlab("vertical_granite_slab");
    public static final Block VERTICAL_ANDESITE_SLAB = registerVerticalStoneSlab("vertical_andesite_slab");
    public static final Block VERTICAL_RED_NETHER_BRICK_SLAB = registerVerticalNetherBrickSlab("vertical_red_nether_brick_slab");
    public static final Block VERTICAL_POLISHED_ANDESITE_SLAB = registerVerticalStoneSlab("vertical_polished_andesite_slab");
    public static final Block VERTICAL_DIORITE_SLAB = registerVerticalStoneSlab("vertical_diorite_slab");
    public static final Block VERTICAL_COBBLED_DEEPSLATE_SLAB = registerVerticalDeepslateSlab("vertical_cobbled_deepslate_slab");
    public static final Block VERTICAL_POLISHED_DEEPSLATE_SLAB = registerVerticalDeepslateSlab("vertical_polished_deepslate_slab");
    public static final Block VERTICAL_DEEPSLATE_BRICK_SLAB = registerVerticalDeepslateBrickSlab("vertical_deepslate_brick_slab");
    public static final Block VERTICAL_DEEPSLATE_TILE_SLAB = registerVerticalDeepslateTileSlab("vertical_deepslate_tile_slab");
    public static final Block VERTICAL_BLACKSTONE_SLAB = registerVerticalBlackstoneSlab("vertical_blackstone_slab");
    public static final Block VERTICAL_POLISHED_BLACKSTONE_SLAB = registerVerticalBlackstoneSlab("vertical_polished_blackstone_slab");
    public static final Block VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB = registerVerticalBlackstoneSlab("vertical_polished_blackstone_brick_slab");

    public static final Block VERTICAL_CUT_COPPER_SLAB = registerVerticalCopperSlab("vertical_cut_copper_slab");
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerVerticalCopperSlab("vertical_exposed_cut_copper_slab");
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerVerticalCopperSlab("vertical_weathered_cut_copper_slab");
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerVerticalCopperSlab("vertical_oxidized_cut_copper_slab");

    // block registry
    private static Block register(String id, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), block);
    }
    // slab types
    public static Block registerVerticalWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalNetherWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalStoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalNetherBrickSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.NETHER_BRICKS).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_NETHER_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_PLACE));
    }
    public static Block registerVerticalDeepslateBrickSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_BRICKS).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_BRICKS_PLACE));
    }
    public static Block registerVerticalDeepslateTileSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(3.5f, 6f).sounds(BlockSoundGroup.DEEPSLATE_TILES).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_DEEPSLATE_TILES_PLACE));
    }
    public static Block registerVerticalBlackstoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalCopperSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.METAL).strength(3f, 6f).sounds(BlockSoundGroup.COPPER).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_COPPER_PLACE));
    }


    public static void registerBlocks(){
        
    }
}
