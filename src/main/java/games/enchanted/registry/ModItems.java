package games.enchanted.registry;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.VerticalSlabItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //block items
    // wood slabs
    public static final BlockItem VERTICAL_OAK_SLAB = registerBlockItem(ModBlocks.VERTICAL_OAK_SLAB ,"vertical_oak_slab");
    public static final BlockItem VERTICAL_SPRUCE_SLAB = registerBlockItem(ModBlocks.VERTICAL_SPRUCE_SLAB ,"vertical_spruce_slab");
    public static final BlockItem VERTICAL_BIRCH_SLAB = registerBlockItem(ModBlocks.VERTICAL_BIRCH_SLAB ,"vertical_birch_slab");
    public static final BlockItem VERTICAL_JUNGLE_SLAB = registerBlockItem(ModBlocks.VERTICAL_JUNGLE_SLAB ,"vertical_jungle_slab");
    public static final BlockItem VERTICAL_ACACIA_SLAB = registerBlockItem(ModBlocks.VERTICAL_ACACIA_SLAB ,"vertical_acacia_slab");
    public static final BlockItem VERTICAL_DARK_OAK_SLAB = registerBlockItem(ModBlocks.VERTICAL_DARK_OAK_SLAB ,"vertical_dark_oak_slab");
    public static final BlockItem VERTICAL_CRIMSON_SLAB = registerBlockItem(ModBlocks.VERTICAL_CRIMSON_SLAB ,"vertical_crimson_slab");
    public static final BlockItem VERTICAL_WARPED_SLAB = registerBlockItem(ModBlocks.VERTICAL_WARPED_SLAB ,"vertical_warped_slab");
    
    // stone slabs
    public static final BlockItem VERTICAL_STONE_SLAB = registerBlockItem(ModBlocks.VERTICAL_STONE_SLAB ,"vertical_stone_slab");

    public static BlockItem registerBlockItem(Block blockId ,String id) {
        Item.Settings settings = new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
        return Registry.register(Registry.ITEM, new Identifier(VerticalSlabs.MOD_ID, id), new VerticalSlabItem(blockId, settings));
    }

    public static void registerItems(){
        //Registry.register(Registry.ITEM, new Identifier(VerticalSlabs.MOD_ID, "vertical_oak_slab"), VERTICAL_OAK_SLAB);
    }
}
