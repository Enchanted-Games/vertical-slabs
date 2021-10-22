package games.enchanted.registry.recipes;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import games.enchanted.VerticalSlabs;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.Map;

@Mixin(RecipeManager.class)
public class RecipeMixin {

    @Inject(method = "apply*", at = @At("HEAD"))
    public void interceptApply(Map < Identifier, JsonElement > map, JsonObject RECIPE_JSON) {
        map.put(new Identifier(VerticalSlabs.MOD_ID, "copper_pickaxe"), RECIPE_JSON);
    }

}
