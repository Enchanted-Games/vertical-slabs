package games.enchanted.verticalSlabs;

import games.enchanted.verticalSlabs.blockTypes.CombinableVerticalSlabBlock;
import games.enchanted.verticalSlabs.blockTypes.OxidizableVerticalSlab;
import games.enchanted.verticalSlabs.util.BlockAndBlockItem;
import net.minecraft.block.*;
import net.minecraft.block.AbstractBlock.Settings;
import net.minecraft.block.Oxidizable.OxidationLevel;
import net.minecraft.item.BlockItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class BlockTypes {
    public static BlockAndBlockItem woodSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.WOOD);
    }

    public static BlockAndBlockItem cherryWoodSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.CHERRY_WOOD);
    }

    public static BlockAndBlockItem bambooSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.BAMBOO_WOOD);
    }

    public static BlockAndBlockItem netherWoodSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.NETHER_WOOD);
    }

    public static BlockAndBlockItem stoneSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.STONE);
    }

    public static BlockAndBlockItem netherBrickSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.NETHER_BRICKS);
    }

    public static BlockAndBlockItem deepslateSlab(String id) {
        return registerVerticalSlab(id,3.5f,6f,BlockSoundGroup.DEEPSLATE);
    }

    public static BlockAndBlockItem deelsplateBrickSlab(String id) {
        return registerVerticalSlab(id,3.5f,6f,BlockSoundGroup.DEEPSLATE_BRICKS);
    }

    public static BlockAndBlockItem deepslateTileSlab(String id) {
        return registerVerticalSlab(id,3.5f,6f,BlockSoundGroup.DEEPSLATE_TILES);
    }

    public static BlockAndBlockItem blackstoneSlab(String id) {
        return registerVerticalSlab(id,2f,6f,BlockSoundGroup.STONE);
    }

    public static BlockAndBlockItem copperSlab(String id, OxidationLevel oxidationLevel) {
        return registerOxidizableVerticalSlab(id,1.5f,3f,BlockSoundGroup.COPPER, oxidationLevel);
    }

    public static BlockAndBlockItem mudBrickSlab(String id) {
        return registerVerticalSlab(id,1.5f,3f,BlockSoundGroup.MUD_BRICKS);
    }


    private static BlockItem registerBlockItem(String id, Block block) {
		BlockItem.Settings settings = new BlockItem.Settings();
		return Registry.register(Registries.ITEM, new Identifier(VerticalSlabs.MOD_ID, id), new BlockItem(block, settings));
    }
    private static BlockAndBlockItem registerVerticalSlab(String id, float hardness, float resistance, BlockSoundGroup soundGroup) {
        final Settings blockSettings = AbstractBlock.Settings.create().strength(hardness, resistance).sounds(soundGroup);
        final Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new CombinableVerticalSlabBlock(blockSettings));
        final BlockItem registeredBlockItem = registerBlockItem(id, registeredBlock);
        return new BlockAndBlockItem(registeredBlock, registeredBlockItem);
    }
    private static BlockAndBlockItem registerOxidizableVerticalSlab(String id, float hardness, float resistance, BlockSoundGroup soundGroup, OxidationLevel oxidationLevel) {
        final Settings blockSettings = AbstractBlock.Settings.create().strength(hardness, resistance).sounds(soundGroup);
        final Block registeredBlock = Registry.register(Registries.BLOCK, new Identifier(VerticalSlabs.MOD_ID, id), new OxidizableVerticalSlab(oxidationLevel, blockSettings));
        final BlockItem registeredBlockItem = registerBlockItem(id, registeredBlock);
        return new BlockAndBlockItem(registeredBlock, registeredBlockItem);
    }
}
