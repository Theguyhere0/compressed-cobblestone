package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import me.Theguyhere.CompressedCobble.Main;

public class ToolRecipes implements Listener {	
	private Main plugin;
	private Tools t;
	
	public ToolRecipes(Main plugin, Tools t) {
		this.plugin = plugin;
		this.t = t;
	}

	//	Pickaxes
	public ShapedRecipe t1PickRecipe() {
		ItemStack item = t.t1Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe t2PickRecipe() {
		ItemStack item = t.t2Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe t3PickRecipe() {
		ItemStack item = t.t3Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t4PickRecipe() {
		ItemStack item = t.t4Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t5PickRecipe() {
		ItemStack item = t.t5Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t6PickRecipe() {
		ItemStack item = t.t6Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t7PickRecipe() {
		ItemStack item = t.t7Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t8PickRecipe() {
		ItemStack item = t.t8Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe t9PickRecipe() {
		ItemStack item = t.t9Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);
	
		return recipe;
	}
	
	public ShapedRecipe t10PickRecipe() {
		ItemStack item = t.t10Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);
	
		return recipe;
	}
		
	public ShapelessRecipe t0PickFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t1PickFixRecipe() {
		ItemStack item = t.t1Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t2PickFixRecipe() {
		ItemStack item = t.t2Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t3PickFixRecipe() {
		ItemStack item = t.t3Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t4PickFixRecipe() {
		ItemStack item = t.t4Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t5PickFixRecipe() {
		ItemStack item = t.t5Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t6PickFixRecipe() {
		ItemStack item = t.t6Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t7PickFixRecipe() {
		ItemStack item = t.t7Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t8PickFixRecipe() {
		ItemStack item = t.t8Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t9PickFixRecipe() {
		ItemStack item = t.t9Pick();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}
	
	//Axes
	public ShapedRecipe t1AxeRecipe() {
		ItemStack item = t.t1Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t2AxeRecipe() {
		ItemStack item = t.t2Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t3AxeRecipe() {
		ItemStack item = t.t3Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t4AxeRecipe() {
		ItemStack item = t.t4Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t5AxeRecipe() {
		ItemStack item = t.t5Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t6AxeRecipe() {
		ItemStack item = t.t6Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t7AxeRecipe() {
		ItemStack item = t.t7Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t8AxeRecipe() {
		ItemStack item = t.t8Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t9AxeRecipe() {
		ItemStack item = t.t9Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);
	
		return recipe;
	}
	
	public ShapedRecipe t10AxeRecipe() {
		ItemStack item = t.t10Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);
	
		return recipe;
	}
	
	public ShapelessRecipe t0AxeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t1AxeFixRecipe() {
		ItemStack item = t.t1Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t2AxeFixRecipe() {
		ItemStack item = t.t2Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t3AxeFixRecipe() {
		ItemStack item = t.t3Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t4AxeFixRecipe() {
		ItemStack item = t.t4Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t5AxeFixRecipe() {
		ItemStack item = t.t5Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t6AxeFixRecipe() {
		ItemStack item = t.t6Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t7AxeFixRecipe() {
		ItemStack item = t.t7Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t8AxeFixRecipe() {
		ItemStack item = t.t8Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe t9AxeFixRecipe() {
		ItemStack item = t.t9Axe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}
	
	//Shovels
	public ShapedRecipe t1SpadeRecipe() {
		ItemStack item = t.t1Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t2SpadeRecipe() {
		ItemStack item = t.t2Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t3SpadeRecipe() {
		ItemStack item = t.t3Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t4SpadeRecipe() {
		ItemStack item = t.t4Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t5SpadeRecipe() {
		ItemStack item = t.t5Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t6SpadeRecipe() {
		ItemStack item = t.t6Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t7SpadeRecipe() {
		ItemStack item = t.t7Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t8SpadeRecipe() {
		ItemStack item = t.t8Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t9SpadeRecipe() {
		ItemStack item = t.t9Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);
	
		return recipe;
	}
	
	public ShapedRecipe t10SpadeRecipe() {
		ItemStack item = t.t10Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);
	
		return recipe;
	}
	
	public ShapelessRecipe t0SpadeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t1SpadeFixRecipe() {
		ItemStack item = t.t1Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t2SpadeFixRecipe() {
		ItemStack item = t.t2Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t3SpadeFixRecipe() {
		ItemStack item = t.t3Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t4SpadeFixRecipe() {
		ItemStack item = t.t4Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t5SpadeFixRecipe() {
		ItemStack item = t.t5Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t6SpadeFixRecipe() {
		ItemStack item = t.t6Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t7SpadeFixRecipe() {
		ItemStack item = t.t7Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t8SpadeFixRecipe() {
		ItemStack item = t.t8Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe t9SpadeFixRecipe() {
		ItemStack item = t.t9Spade();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}
	
	//Hoes
	public ShapedRecipe t1HoeRecipe() {
		ItemStack item = t.t1Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t2HoeRecipe() {
		ItemStack item = t.t2Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t3HoeRecipe() {
		ItemStack item = t.t3Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t4HoeRecipe() {
		ItemStack item = t.t4Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t5HoeRecipe() {
		ItemStack item = t.t5Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t6HoeRecipe() {
		ItemStack item = t.t6Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t7HoeRecipe() {
		ItemStack item = t.t7Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t8HoeRecipe() {
		ItemStack item = t.t8Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t9HoeRecipe() {
		ItemStack item = t.t9Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);
	
		return recipe;
	}
	
	public ShapedRecipe t10HoeRecipe() {
		ItemStack item = t.t10Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);
	
		return recipe;
	}
	
	public ShapelessRecipe t0HoeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t1HoeFixRecipe() {
		ItemStack item = t.t1Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t2HoeFixRecipe() {
		ItemStack item = t.t2Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t3HoeFixRecipe() {
		ItemStack item = t.t3Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t4HoeFixRecipe() {
		ItemStack item = t.t4Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t5HoeFixRecipe() {
		ItemStack item = t.t5Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t6HoeFixRecipe() {
		ItemStack item = t.t6Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t7HoeFixRecipe() {
		ItemStack item = t.t7Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t8HoeFixRecipe() {
		ItemStack item = t.t8Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe t9HoeFixRecipe() {
		ItemStack item = t.t9Hoe();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}
	
	//Swords
	public ShapedRecipe t1SwordRecipe() {
		ItemStack item = t.t1Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t2SwordRecipe() {
		ItemStack item = t.t2Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t3SwordRecipe() {
		ItemStack item = t.t3Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t4SwordRecipe() {
		ItemStack item = t.t4Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t5SwordRecipe() {
		ItemStack item = t.t5Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t6SwordRecipe() {
		ItemStack item = t.t6Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t7SwordRecipe() {
		ItemStack item = t.t7Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t8SwordRecipe() {
		ItemStack item = t.t8Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t9SwordRecipe() {
		ItemStack item = t.t9Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);
	
		return recipe;
	}
	
	public ShapedRecipe t10SwordRecipe() {
		ItemStack item = t.t10Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);
	
		return recipe;
	}
	
	public ShapelessRecipe t0SwordFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t1SwordFixRecipe() {
		ItemStack item = t.t1Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t2SwordFixRecipe() {
		ItemStack item = t.t2Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t3SwordFixRecipe() {
		ItemStack item = t.t3Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t4SwordFixRecipe() {
		ItemStack item = t.t4Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t5SwordFixRecipe() {
		ItemStack item = t.t5Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t6SwordFixRecipe() {
		ItemStack item = t.t6Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t7SwordFixRecipe() {
		ItemStack item = t.t7Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t8SwordFixRecipe() {
		ItemStack item = t.t8Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe t9SwordFixRecipe() {
		ItemStack item = t.t9Sword();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}
	
	//Ranged weapons
	public ShapedRecipe t1RangeRecipe() {
		ItemStack item = t.t1Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t2RangeRecipe() {
		ItemStack item = t.t2Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t3RangeRecipe() {
		ItemStack item = t.t3Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t4RangeRecipe() {
		ItemStack item = t.t4Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t5RangeRecipe() {
		ItemStack item = t.t5Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t6RangeRecipe() {
		ItemStack item = t.t6Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t7RangeRecipe() {
		ItemStack item = t.t7Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.BOW);
	
		return recipe;
	}
	
	public ShapedRecipe t8RangeRecipe() {
		ItemStack item = t.t8Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.CROSSBOW);
	
		return recipe;
	}
	
	public ShapedRecipe t9RangeRecipe() {
		ItemStack item = t.t9Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		recipe.setIngredient('P', Material.CROSSBOW);
	
		return recipe;
	}
	
	public ShapedRecipe t10RangeRecipe() {
		ItemStack item = t.t10Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		recipe.setIngredient('P', Material.TRIDENT);
	
		return recipe;
	}
	
	public ShapelessRecipe t0RangeFixRecipe() {
		ItemStack item = new ItemStack(Material.BOW);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.STICK);
		recipe.addIngredient(Material.STRING);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t1RangeFixRecipe() {
		ItemStack item = t.t1Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t2RangeFixRecipe() {
		ItemStack item = t.t2Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t3RangeFixRecipe() {
		ItemStack item = t.t3Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t4RangeFixRecipe() {
		ItemStack item = t.t4Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t5RangeFixRecipe() {
		ItemStack item = t.t5Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t6RangeFixRecipe() {
		ItemStack item = t.t6Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t7RangeFixRecipe() {
		ItemStack item = t.t7Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.CROSSBOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t8RangeFixRecipe() {
		ItemStack item = t.t8Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.CROSSBOW);
		
		return recipe;
	}
	
	public ShapelessRecipe t9RangeFixRecipe() {
		ItemStack item = t.t9Range();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
	
		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.TRIDENT);
		
		return recipe;
	}
	
//	Shields
	public ShapedRecipe t0shieldRecipe() {
		ItemStack item = new ItemStack(Material.SHIELD);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PIP", "PPP", " P ");
		
		recipe.setIngredient('P', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.CRIMSON_PLANKS,
				Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
		recipe.setIngredient('I', Material.IRON_BLOCK);

		return recipe;
	}
	
	public ShapedRecipe t5ShieldRecipe() {
		ItemStack item = t.t5Shield();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CGC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('G', Material.GOLD_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapedRecipe t8ShieldRecipe() {
		ItemStack item = t.t8Shield();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CDC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapedRecipe t10ShieldRecipe() {
		ItemStack item = t.t10Shield();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CNC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('N', Material.NETHERITE_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapelessRecipe t0ShieldFixRecipe() {
		ItemStack item = new ItemStack(Material.SHIELD);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.CRIMSON_PLANKS,
				Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}
		
	public ShapelessRecipe t5ShieldFixRecipe() {
		ItemStack item = t.t5Shield();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}

	public ShapelessRecipe t8ShieldFixRecipe() {
		ItemStack item = t.t8Shield();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}
}
