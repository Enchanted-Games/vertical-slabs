package games.enchanted.registry;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.VerticalSlabBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks{
    
    public static final Block VERTICAL_OAK_SLAB = registerVerticalWoodSlab("vertical_oak_slab");
    public static final Block VERTICAL_SPRUCE_SLAB = registerVerticalWoodSlab("vertical_spruce_slab");
    public static final Block VERTICAL_BIRCH_SLAB = registerVerticalWoodSlab("vertical_birch_slab");
    public static final Block VERTICAL_JUNGLE_SLAB = registerVerticalWoodSlab("vertical_jungle_slab");
    public static final Block VERTICAL_ACACIA_SLAB = registerVerticalWoodSlab("vertical_acacia_slab");
    public static final Block VERTICAL_DARK_OAK_SLAB = registerVerticalWoodSlab("vertical_dark_oak_slab");
    public static final Block VERTICAL_CRIMSON_SLAB = registerVerticalNetherWoodSlab("vertical_crimson_slab");

    public static Block registerVerticalWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.WOOD).strength(2f, 30f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new VerticalSlabBlock(settings));
    }
    public static Block registerVerticalNetherWoodSlab(String id) {
        final Settings settings = FabricBlockSettings.of(Material.NETHER_WOOD).strength(2f, 30f).sounds(BlockSoundGroup.WOOD).breakByTool(FabricToolTags.AXES);
        return Registry.register(Registry.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new VerticalSlabBlock(settings));
    }

    public static void registerBlocks(){
        
    }
}
