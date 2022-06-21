package games.enchanted;

import games.enchanted.registry.ModFlammableBlocks;
import games.enchanted.registry.ModItems;
import games.enchanted.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.MinecraftVersion;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerticalSlabs implements ModInitializer{

    // mod id
    public static final String MOD_ID = "enchanted-vertical-slabs";
    public static String minecraftCurrentVersion = MinecraftVersion.CURRENT.getReleaseTarget();
    // logger
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs");

    @Override
    public void onInitialize() {
        LOGGER.info("[" + MOD_ID + "] Detected Minecraft " + minecraftCurrentVersion + " (release target)");

        // calls block and item classes to register blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        // registers flammable blocks
        ModFlammableBlocks.registerFlammables();

        // logs to console that the mod is ready
        LOGGER.info("[" + MOD_ID + "] Enchanted Vertical Slabs initialized!");
    }

    // creative tabs
    public static final ItemGroup VERTICAL_SLABS_GROUP = FabricItemGroupBuilder.create(
        new Identifier(MOD_ID, "vertical_slabs"))
        // group icon
        .icon(() -> new ItemStack(ModItems.VERTICAL_OAK_SLAB))
        // items in the group
        .appendItems(stacks -> {
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CUT_COPPER_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SPRUCE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_BIRCH_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_JUNGLE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_ACACIA_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DARK_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CRIMSON_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_WARPED_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_STONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_STONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CUT_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PETRIFIED_OAK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_COBBLESTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_STONE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_NETHER_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_QUARTZ_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_RED_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_CUT_RED_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PURPUR_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PRISMARINE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_PRISMARINE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DARK_PRISMARINE__SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_GRANITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_RED_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_MOSSY_STONE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_DIORITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_MOSSY_COBBLESTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_ENDSTONE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_SANDSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_SMOOTH_QUARTZ_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_GRANITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_ANDESITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_RED_NETHER_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_ANDESITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DIORITE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_COBBLED_DEEPSLATE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_DEEPSLATE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DEEPSLATE_BRICK_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_DEEPSLATE_TILE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_BLACKSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_SLAB));
            stacks.add(new ItemStack(ModBlocks.VERTICAL_POLISHED_BLACKSTONE_BRICK_SLAB));

        }
    ).build();

    
    
}