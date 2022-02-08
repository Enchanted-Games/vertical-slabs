package games.enchanted.addons;

import games.enchanted.VerticalSlabs;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class BetterendGroup {

    public static void build() {

        @SuppressWarnings("unused")
            final ItemGroup VERTICAL_SLABS_BETTEREND_GROUP = FabricItemGroupBuilder.create(
            new Identifier(VerticalSlabs.MOD_ID, "vertical_betterend_slabs"))
            // group icon
            .icon(() -> new ItemStack(BetterendBlocks.VERTICAL_TENANEA_SLAB))
            // items in the group
            .appendItems(stacks -> {
                stacks.add(new ItemStack(BetterendBlocks.VERTICAL_AZURE_JADESTONE_BRICK_SLAB));

            }
        ).build();


    }

}
