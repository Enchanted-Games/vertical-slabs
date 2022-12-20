package games.enchanted;

import games.enchanted.registry.ModFabricRegistries;
import games.enchanted.registry.ModItems;
import games.enchanted.registry.ModBlocks;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
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
    public static Boolean is1_18 = minecraftCurrentVersion.contains("1.18");
    // logger
    public static final Logger LOGGER = LogManager.getLogger("Enchanted Vertical Slabs");

    // creative tabs
    public static final ItemGroup VERTICAL_SLABS_GROUP = FabricItemGroup.builder(new Identifier(MOD_ID, "vertical_slabs"))
        // group icon
        .icon(() -> new ItemStack(ModItems.VERTICAL_OAK_SLAB))
        .build();

    ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP).register(content -> {
    	content.add(CUSTOM_ITEM);
    });

    @Override
    public void onInitialize() {
        LOGGER.info("[" + MOD_ID + "] Detected Minecraft " + minecraftCurrentVersion + " (release target)");
        if(is1_18){
            LOGGER.info("[" + MOD_ID + "] Skipping 1.19 blocks and items");
        }

        // calls block and item classes to register blocks and items
        ModItems.registerItems();
        ModBlocks.registerBlocks();

        // registers special properties for blocks
        ModFabricRegistries.registerFlammables();
        ModFabricRegistries.registerOxidisables();

        // logs to console that the mod is ready
        LOGGER.info("[" + MOD_ID + "] Enchanted Vertical Slabs initialized!");
    }
}