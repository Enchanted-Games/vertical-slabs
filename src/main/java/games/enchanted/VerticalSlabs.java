package games.enchanted;

import games.enchanted.registry.ModItems;
import games.enchanted.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class VerticalSlabs implements ModInitializer{

    public static final String MOD_ID = "enchanted-vertical-slabs";

    // creative tabs
    public static final ItemGroup VERTICAL_SLABS_GROUP = FabricItemGroupBuilder.create(
        new Identifier(MOD_ID, "vertical_slabs"))
        .icon(() -> new ItemStack(ModItems.VERTICAL_OAK_SLAB))
        .appendItems(stacks -> {
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
        }
    ).build();

    @Override
    public void onInitialize() {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
    
}