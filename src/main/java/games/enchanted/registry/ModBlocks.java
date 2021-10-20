package games.enchanted.registry;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.CombinableVerticalSlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
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


    // slab types
    public static Block registerVerticalWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 30f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalNetherWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f, 30f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalStoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 30f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }
    public static Block registerVerticalNetherBrickSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 30f).sounds(BlockSoundGroup.NETHER_BRICKS).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_NETHER_BRICKS_PLACE));
    }

    public static void registerBlocks(){
        
    }
}
