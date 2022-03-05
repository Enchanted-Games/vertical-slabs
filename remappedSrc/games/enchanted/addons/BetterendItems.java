package games.enchanted.addons;

import games.enchanted.VerticalSlabs;
import games.enchanted.registry.types.VerticalSlabItem;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class BetterendItems {

    // betterend wood slabs
    public static final BlockItem VERTICAL_DRAGON_TREE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_DRAGON_TREE_SLAB ,"vertical_dragon_tree_slab");
    public static final BlockItem VERTICAL_END_LOTUS_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_END_LOTUS_SLAB ,"vertical_end_lotus_slab");
    public static final BlockItem VERTICAL_HELIX_TREE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_HELIX_TREE_SLAB ,"vertical_helix_tree_slab");
    public static final BlockItem VERTICAL_JELLYSHROOM_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_JELLYSHROOM_SLAB ,"vertical_jellyshroom_slab");
    public static final BlockItem VERTICAL_LACUSGROVE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_LACUSGROVE_SLAB ,"vertical_lacusgrove_slab");
    public static final BlockItem VERTICAL_LUCERNIA_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_LUCERNIA_SLAB ,"vertical_lucernia_slab");
    public static final BlockItem VERTICAL_MOSSY_GLOWSHROOM_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_MOSSY_GLOWSHROOM_SLAB ,"vertical_mossy_glowshroom_slab");
    public static final BlockItem VERTICAL_NEON_CACTUS_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_NEON_CACTUS_SLAB ,"vertical_neon_cactus_slab");
    public static final BlockItem VERTICAL_PYTHADENDRON_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_PYTHADENDRON_SLAB ,"vertical_pythadendron_slab");
    public static final BlockItem VERTICAL_TENANEA_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_TENANEA_SLAB ,"vertical_tenanea_slab");
    public static final BlockItem VERTICAL_UMBRELLA_TREE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_UMBRELLA_TREE_SLAB ,"vertical_umbrella_tree_slab");


    // betterend stone slabs
    public static final BlockItem VERTICAL_AZURE_JADESTONE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_AZURE_JADESTONE_SLAB ,"vertical_azure_jadestone_slab");
    public static final BlockItem VERTICAL_AZURE_JADESTONE_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_AZURE_JADESTONE_BRICK_SLAB ,"vertical_azure_jadestone_brick_slab");
    public static final BlockItem VERTICAL_DRAGON_BONE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_DRAGON_BONE_SLAB ,"vertical_dragon_bone_slab");
    public static final BlockItem VERTICAL_FLAVOLITE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_FLAVOLITE_SLAB ,"vertical_flavolite_slab");
    public static final BlockItem VERTICAL_FLAVOLITE_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_FLAVOLITE_BRICK_SLAB ,"vertical_flavolite_brick_slab");
    public static final BlockItem VERTICAL_SANDY_JADESTONE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SANDY_JADESTONE_SLAB ,"vertical_sandy_jadestone_slab");
    public static final BlockItem VERTICAL_SANDY_JADESTONE_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SANDY_JADESTONE_BRICK_SLAB ,"vertical_sandy_jadestone_brick_slab");
    public static final BlockItem VERTICAL_SMARAGDANT_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SMARAGDANT_SLAB ,"vertical_smaragdant_slab");
    public static final BlockItem VERTICAL_SMARAGDANT_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SMARAGDANT_BRICK_SLAB ,"vertical_smaragdant_brick_slab");
    public static final BlockItem VERTICAL_SULPHURIC_ROCK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SULPHURIC_ROCK_SLAB ,"vertical_sulphuric_rock_slab");
    public static final BlockItem VERTICAL_SULPHURIC_ROCK_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_SULPHURIC_ROCK_BRICK_SLAB ,"vertical_sulphuric_rock_brick_slab");
    public static final BlockItem VERTICAL_TERMINITE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_TERMINITE_SLAB ,"vertical_terminite_slab");
    public static final BlockItem VERTICAL_THALLASIUM_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_THALLASIUM_SLAB ,"vertical_thallasium_slab");
    public static final BlockItem VERTICAL_UMBRALITH_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_UMBRALITH_SLAB ,"vertical_umbralith_slab");
    public static final BlockItem VERTICAL_UMBRALITH_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_UMBRALITH_BRICK_SLAB ,"vertical_umbralith_brick_slab");
    public static final BlockItem VERTICAL_VIOLECITE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_VIOLECITE_SLAB ,"vertical_violecite_slab");
    public static final BlockItem VERTICAL_VIOLECITE_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_VIOLECITE_BRICK_SLAB ,"vertical_violecite_brick_slab");
    public static final BlockItem VERTICAL_VIRID_JADESTONE_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_VIRID_JADESTONE_SLAB ,"vertical_virid_jadestone_slab");
    public static final BlockItem VERTICAL_VIRID_JADESTONE_BRICK_SLAB = registerBlockItem(BetterendBlocks.VERTICAL_VIRID_JADESTONE_BRICK_SLAB ,"vertical_virid_jadestone_brick_slab");


    public static BlockItem registerBlockItem(Block blockId ,String id) {
        Item.Settings settings = new Item.Settings().group(ItemGroup.BUILDING_BLOCKS);
        return Registry.register(Registry.ITEM, new Identifier(VerticalSlabs.MOD_ID, id), new VerticalSlabItem(blockId, settings));
    }


    public static void registerItems() {
    }

}
