package games.enchanted.verticalSlabs;

import net.fabricmc.api.ModInitializer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import games.enchanted.verticalSlabs.registration.ModBlocks;
import games.enchanted.verticalSlabs.registration.ModFabricRegistries;
import games.enchanted.verticalSlabs.registration.ModItemGroups;

public class VerticalSlabs implements ModInitializer {

    // mod id
    public static final String MOD_ID = "enchanted-vertical-slabs";
    // logger
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs");

    @Override
    public void onInitialize() {
        // calls block class to register blocks and block items
        ModBlocks.registerBlocks();

        // special properties for blocks
        ModFabricRegistries.registerFlammables();
        ModFabricRegistries.registerOxidisables();

        // creates item groups and adds items to vanilla groups
        ModItemGroups.createItemGroups();

        // logs to console that the mod is ready
        LOGGER.info("[evs] Enchanted Vertical Slabs initialized!");
    }
}