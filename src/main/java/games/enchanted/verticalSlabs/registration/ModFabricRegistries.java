package games.enchanted.verticalSlabs.registration;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class ModFabricRegistries {

    public static void registerFlammables(){
        // Flammable blocks
        int Encouragement = 5;
        int Flammability = 20;

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_MANGROVE_SLAB.asBlock(), Encouragement, Flammability);
        
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_SLAB.asBlock(), Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BAMBOO_MOSAIC_SLAB.asBlock(), Encouragement, Flammability);
    }

    public static void registerOxidisables(){
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asBlock());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asBlock());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asBlock());
        
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.VERTICAL_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_WAXED_CUT_COPPER_SLAB.asBlock());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.VERTICAL_EXPOSED_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB.asBlock());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.VERTICAL_WEATHERED_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB.asBlock());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.VERTICAL_OXIDIZED_CUT_COPPER_SLAB.asBlock(), ModBlocks.VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB.asBlock());
    }

}
