package games.enchanted.verticalSlabs.registration;

import games.enchanted.verticalSlabs.VerticalSlabs;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

	public static void createItemGroups() {

		final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
				.icon(() -> new ItemStack(ModBlocks.VERTICAL_OAK_SLAB.asBlockItem()))
				.displayName(Text.translatable("itemGroup.enchanted-vertical-slabs.vertical_slabs"))
				.build();
		Registry.register(Registries.ITEM_GROUP, new Identifier(VerticalSlabs.MOD_ID, "vertical_slabs"), ITEM_GROUP);

		final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP,
				new Identifier(VerticalSlabs.MOD_ID, "vertical_slabs"));

		ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_REGISTRY_KEY).register(content -> {
			content.add(ModBlocks.VERTICAL_OAK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SPRUCE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_BIRCH_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_JUNGLE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_ACACIA_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_MANGROVE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_CHERRY_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_BAMBOO_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_CRIMSON_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WARPED_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_STONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_COBBLESTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_STONE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_GRANITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_DIORITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_ANDESITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_MUD_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_PRISMARINE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_BLACKSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_ENDSTONE_BRICK_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_PURPUR_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_QUARTZ_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asBlockItem());
			content.add(ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asBlockItem());
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.addAfter(Items.OAK_SLAB, ModBlocks.VERTICAL_OAK_SLAB.asBlockItem());
			content.addAfter(Items.SPRUCE_SLAB, ModBlocks.VERTICAL_SPRUCE_SLAB.asBlockItem());
			content.addAfter(Items.BIRCH_SLAB, ModBlocks.VERTICAL_BIRCH_SLAB.asBlockItem());
			content.addAfter(Items.JUNGLE_SLAB, ModBlocks.VERTICAL_JUNGLE_SLAB.asBlockItem());
			content.addAfter(Items.ACACIA_SLAB, ModBlocks.VERTICAL_ACACIA_SLAB.asBlockItem());
			content.addAfter(Items.DARK_OAK_SLAB, ModBlocks.VERTICAL_DARK_OAK_SLAB.asBlockItem());
			content.addAfter(Items.MANGROVE_SLAB, ModBlocks.VERTICAL_MANGROVE_SLAB.asBlockItem());
			content.addAfter(Items.CHERRY_SLAB, ModBlocks.VERTICAL_CHERRY_SLAB.asBlockItem());
			content.addAfter(Items.BAMBOO_SLAB, ModBlocks.VERTICAL_BAMBOO_SLAB.asBlockItem());
			content.addAfter(Items.BAMBOO_MOSAIC_SLAB, ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asBlockItem());
			content.addAfter(Items.CRIMSON_SLAB, ModBlocks.VERTICAL_CRIMSON_SLAB.asBlockItem());
			content.addAfter(Items.WARPED_SLAB, ModBlocks.VERTICAL_WARPED_SLAB.asBlockItem());
			content.addAfter(Items.STONE_SLAB, ModBlocks.VERTICAL_STONE_SLAB.asBlockItem());
			content.addAfter(Items.COBBLESTONE_SLAB, ModBlocks.VERTICAL_COBBLESTONE_SLAB.asBlockItem());
			content.addAfter(Items.MOSSY_COBBLESTONE_SLAB, ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB.asBlockItem());
			content.addAfter(Items.SMOOTH_STONE_SLAB, ModBlocks.VERTICAL_SMOOTH_STONE_SLAB.asBlockItem());
			content.addAfter(Items.STONE_BRICK_SLAB, ModBlocks.VERTICAL_STONE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.MOSSY_STONE_BRICK_SLAB, ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.GRANITE_SLAB, ModBlocks.VERTICAL_GRANITE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_GRANITE_SLAB, ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB.asBlockItem());
			content.addAfter(Items.DIORITE_SLAB, ModBlocks.VERTICAL_DIORITE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_DIORITE_SLAB, ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB.asBlockItem());
			content.addAfter(Items.ANDESITE_SLAB, ModBlocks.VERTICAL_ANDESITE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_ANDESITE_SLAB, ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB.asBlockItem());
			content.addAfter(Items.COBBLED_DEEPSLATE_SLAB, ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_DEEPSLATE_SLAB, ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB.asBlockItem());
			content.addAfter(Items.DEEPSLATE_BRICK_SLAB, ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.DEEPSLATE_TILE_SLAB, ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB.asBlockItem());
			content.addAfter(Items.BRICK_SLAB, ModBlocks.VERTICAL_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.MUD_BRICK_SLAB, ModBlocks.VERTICAL_MUD_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.SANDSTONE_SLAB, ModBlocks.VERTICAL_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.SMOOTH_SANDSTONE_SLAB, ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.CUT_SANDSTONE_SLAB, ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.RED_SANDSTONE_SLAB, ModBlocks.VERTICAL_RED_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.SMOOTH_RED_SANDSTONE_SLAB, ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.CUT_RED_SANDSTONE_SLAB, ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB.asBlockItem());
			content.addAfter(Items.PRISMARINE_SLAB, ModBlocks.VERTICAL_PRISMARINE_SLAB.asBlockItem());
			content.addAfter(Items.PRISMARINE_BRICK_SLAB, ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.DARK_PRISMARINE_SLAB, ModBlocks.VERTICAL_DARK_PRISMARINE_SLAB.asBlockItem());
			content.addAfter(Items.NETHER_BRICK_SLAB, ModBlocks.VERTICAL_NETHER_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.RED_NETHER_BRICK_SLAB, ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.BLACKSTONE_SLAB, ModBlocks.VERTICAL_BLACKSTONE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_BLACKSTONE_SLAB, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB.asBlockItem());
			content.addAfter(Items.POLISHED_BLACKSTONE_BRICK_SLAB, ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.END_STONE_BRICK_SLAB, ModBlocks.VERTICAL_ENDSTONE_BRICK_SLAB.asBlockItem());
			content.addAfter(Items.PURPUR_SLAB, ModBlocks.VERTICAL_PURPUR_SLAB.asBlockItem());
			content.addAfter(Items.QUARTZ_SLAB, ModBlocks.VERTICAL_QUARTZ_SLAB.asBlockItem());
			content.addAfter(Items.SMOOTH_QUARTZ_SLAB, ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB.asBlockItem());
			content.addAfter(Items.CUT_COPPER_SLAB, ModBlocks.VERTICAL_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.EXPOSED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.WEATHERED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.OXIDIZED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.WAXED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.WAXED_EXPOSED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.WAXED_WEATHERED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asBlockItem());
			content.addAfter(Items.WAXED_OXIDIZED_CUT_COPPER_SLAB, ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asBlockItem());
		});

	}
}