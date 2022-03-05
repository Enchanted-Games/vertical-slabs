package games.enchanted.registry;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {

    public static void registerFlammables(){
        // Flammable blocks
        int Encouragement = 5;
        int Flammability = 20;

        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_OAK_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_SPRUCE_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_BIRCH_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_JUNGLE_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_ACACIA_SLAB, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.VERTICAL_DARK_OAK_SLAB, Encouragement, Flammability);
    }

}
