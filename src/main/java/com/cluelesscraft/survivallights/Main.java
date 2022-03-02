package com.cluelesscraft.survivallights;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

// Survival Lights plugin written by Robella.
// https://robella.carrd.co/
// Discord: Robella#0015 for inquiries.

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemStack result = new ItemStack(Material.LIGHT, 1);
        // The result of the recipe added will give you 1 light source.
        NamespacedKey key = new NamespacedKey(this, "light_source_block");
        // Adds NBT tag with light source block as the name.
        ShapedRecipe recipe = new ShapedRecipe(key, result);
        // Adds new shaped recipe.
        recipe.shape(
                " G ",
                "G G",
                " G "
        );
        // Recipe as shown in a crafting table.
        recipe.setIngredient('G', Material.GLOWSTONE_DUST);
        // G in the crafting table is glowstone dust.
        Bukkit.addRecipe(recipe);
        // Adds recipe to server.

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
