package games.enchanted;

import games.enchanted.registry.ModFabricRegistries;
import games.enchanted.registry.ModItems;
import games.enchanted.registry.ModItemGroups;
import games.enchanted.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.MinecraftVersion;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VerticalSlabs implements ModInitializer{

    // mod id
    public static final String MOD_ID = "enchanted-vertical-slabs";
    public static Boolean is1_18 = false; // if true, no 1.19 blocks are registered
    // logger
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs");

    @Override
    public void onInitialize() {
        LOGGER.info("[evs] Running Minecraft " + MinecraftVersion.CURRENT.getName());
        if(is1_18){
            LOGGER.info("[evs] Skipping 1.19 blocks and items");
        }

        // calls block and item classes to register blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        // registers special properties for blocks
        ModFabricRegistries.registerFlammables();
        ModFabricRegistries.registerOxidisables();

        // creates item groups and adds items to vanilla groups
        ModItemGroups.createItemGroups();

        // logs to console that the mod is ready
        LOGGER.info("[evs] Enchanted Vertical Slabs initialized!");
    }
}