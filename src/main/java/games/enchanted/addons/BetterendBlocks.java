package games.enchanted.addons;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.ModBlocks;
import games.enchanted.registry.types.CombinableVerticalSlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BetterendBlocks {

    // betterend wood slabs
    public static final Block VERTICAL_DRAGON_TREE_SLAB = registerVerticalWoodSlab("vertical_dragon_tree_slab");
    public static final Block VERTICAL_END_LOTUS_SLAB = registerVerticalWoodSlab("vertical_end_lotus_slab");
    public static final Block VERTICAL_HELIX_TREE_SLAB = registerVerticalWoodSlab("vertical_helix_tree_slab");
    public static final Block VERTICAL_JELLYSHROOM_SLAB = registerVerticalWoodSlab("vertical_jellyshroom_slab");
    public static final Block VERTICAL_LACUSGROVE_SLAB = registerVerticalWoodSlab("vertical_lacusgrove_slab");
    public static final Block VERTICAL_LUCERNIA_SLAB = registerVerticalWoodSlab("vertical_lucernia_slab");
    public static final Block VERTICAL_MOSSY_GLOWSHROOM_SLAB = registerVerticalWoodSlab("vertical_mossy_glowshroom_slab");
    public static final Block VERTICAL_NEON_CACTUS_SLAB = registerVerticalWoodSlab("vertical_neon_cactus_slab");
    public static final Block VERTICAL_PYTHADENDRON_SLAB = registerVerticalWoodSlab("vertical_pythadendron_slab");
    public static final Block VERTICAL_TENANEA_SLAB = registerVerticalWoodSlab("vertical_tenanea_slab");
    public static final Block VERTICAL_UMBRELLA_TREE_SLAB = registerVerticalWoodSlab("vertical_umbrella_tree_slab");

    // betterend stone slabs
    public static final Block VERTICAL_AZURE_JADESTONE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_azure_jadestone_slab");
    public static final Block VERTICAL_AZURE_JADESTONE_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_azure_jadestone_brick_slab");
    public static final Block VERTICAL_DRAGON_BONE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_dragon_bone_slab");
    public static final Block VERTICAL_FLAVOLITE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_flavolite_slab");
    public static final Block VERTICAL_FLAVOLITE_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_flavolite_brick_slab");
    public static final Block VERTICAL_SANDY_JADESTONE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_sandy_jadestone_slab");
    public static final Block VERTICAL_SANDY_JADESTONE_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_sandy_jadestone_brick_slab");
    public static final Block VERTICAL_SMARAGDANT_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_smaragdant_slab");
    public static final Block VERTICAL_SMARAGDANT_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_smaragdant_brick_slab");
    public static final Block VERTICAL_SULPHURIC_ROCK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_sulphuric_rock_slab");
    public static final Block VERTICAL_SULPHURIC_ROCK_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_sulphuric_rock_brick_slab");
    public static final Block VERTICAL_TERMINITE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_terminite_slab");
    public static final Block VERTICAL_THALLASIUM_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_thallasium_slab");
    public static final Block VERTICAL_UMBRALITH_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_umbralith_slab");
    public static final Block VERTICAL_UMBRALITH_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_umbralith_brick_slab");
    public static final Block VERTICAL_VIOLECITE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_violecite_slab");
    public static final Block VERTICAL_VIOLECITE_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_violecite_brick_slab");
    public static final Block VERTICAL_VIRID_JADESTONE_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_virid_jadestone_slab");
    public static final Block VERTICAL_VIRID_JADESTONE_BRICK_SLAB = ModBlocks.registerVerticalStoneSlab("vertical_virid_jadestone_brick_slab");

    
    public static Block registerVerticalWoodSlab(String id) {
       
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 6f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_WOOD_PLACE));
    }
    public static Block registerVerticalStoneSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.STONE).strength(2f, 6f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(settings, SoundEvents.BLOCK_STONE_PLACE));
    }

    public static void registerBlocks() {

    }
    
}
