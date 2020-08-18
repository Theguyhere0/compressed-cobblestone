package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import me.Theguyhere.CompressedCobble.Main;

public class ResourceRecipes implements Listener {
	private Plugin plugin;
	
	public ResourceRecipes(Main plugin) {
		this.plugin = plugin;
	}
	
	public ShapelessRecipe fleshConversion() {
		ItemStack item = new ItemStack(Material.LEATHER);
		
		NamespacedKey key = new NamespacedKey(plugin, "leather");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.ROTTEN_FLESH);
		
		return recipe;
	}
	
	public ShapelessRecipe blackstoneConversion() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 2);
		
		NamespacedKey key = new NamespacedKey(plugin, "cobblestone_x2");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(2, Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe netherrackConversion() {
		ItemStack item = new ItemStack(Material.COBBLESTONE);
		
		NamespacedKey key = new NamespacedKey(plugin, "cobblestone_alt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("NN", "N ");
		
		recipe.setIngredient('N', Material.NETHERRACK);
		
		return recipe;
	}
	
	public ShapelessRecipe coalConversion() {
		ItemStack item = new Resources().t5();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5_coal");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.COAL_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe redstoneConversion() {
		ItemStack item = new Resources().t5();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5_redstone");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.REDSTONE_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe quartzConversion() {
		ItemStack item = new Resources().t5();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5_quartz");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.QUARTZ_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe lapisConversion() {
		ItemStack item = new Resources().t6();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_lapis");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.LAPIS_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe ironConversion() {
		ItemStack item = new Resources().t6();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_iron");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.IRON_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe goldConversion() {
		ItemStack item = new Resources().t7();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7_gold");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GOLD_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe emeraldConversion() {
		ItemStack item = new Resources().t8();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8_emerald");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.EMERALD_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe diamondConversion() {
		ItemStack item = new Resources().t9();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9_diamond");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe netheriteConversion() {
		ItemStack item = new Resources().t10();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10_netherite");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.NETHERITE_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe t1Recipe() {
		ItemStack item = new Resources().t1();
		
		NamespacedKey key = new NamespacedKey(plugin, "c0.5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.COBBLESTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t1BackRecipe() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 3);
		
		NamespacedKey key = new NamespacedKey(plugin, "cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BASALT);
		
		return recipe;
	}
	
	public ShapedRecipe t2Recipe() {
		ItemStack item = new Resources().t2();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BASALT);
		
		return recipe;
	}
	
	public ShapelessRecipe t2AltRecipe() {
		ItemStack item = new Resources().t2();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.COBBLESTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t2BackRecipe() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 9);
		
		NamespacedKey key = new NamespacedKey(plugin, "cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe t3Recipe() {
		ItemStack item = new Resources().t3();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t3AltRecipe() {
		ItemStack item = new Resources().t3();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BASALT);
		
		return recipe;
	}
	
	public ShapelessRecipe t3BackRecipe() {
		ItemStack item = new Resources().t2();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(plugin, "t2_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe t4Recipe() {
		ItemStack item = new Resources().t4();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe t4AltRecipe() {
		ItemStack item = new Resources().t4();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t4BackRecipe() {
		ItemStack item = new Resources().t2();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(plugin, "t2_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe t5Recipe() {
		ItemStack item = new Resources().t5();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t5AltRecipe() {
		ItemStack item = new Resources().t5();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe t5BackRecipe() {
		ItemStack item = new Resources().t4();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(plugin, "t4_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe t6Recipe() {
		ItemStack item = new Resources().t6();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t6AltRecipe() {
		ItemStack item = new Resources().t6();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t6BackRecipe() {
		ItemStack item = new Resources().t4();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(plugin, "t4_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe t7Recipe() {
		ItemStack item = new Resources().t7();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe t7AltRecipe() {
		ItemStack item = new Resources().t7();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe t7BackRecipe() {
		ItemStack item = new Resources().t6();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe t8Recipe() {
		ItemStack item = new Resources().t8();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe t8AltRecipe() {
		ItemStack item = new Resources().t8();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe t8BackRecipe() {
		ItemStack item = new Resources().t6();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(plugin, "t6_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapedRecipe t9Recipe() {
		ItemStack item = new Resources().t9();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapelessRecipe t9AltRecipe() {
		ItemStack item = new Resources().t9();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe t9BackRecipe() {
		ItemStack item = new Resources().t8();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(plugin, "t8_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapedRecipe t10Recipe() {
		ItemStack item = new Resources().t10();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapelessRecipe t10AltRecipe() {
		ItemStack item = new Resources().t10();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapelessRecipe t10BackRecipe() {
		ItemStack item = new Resources().t8();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(plugin, "t8_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
	public ShapedRecipe notRecipe() {
		ItemStack item = new Resources().not();
		
		NamespacedKey key = new NamespacedKey(plugin, "not_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
	public ShapelessRecipe notAltRecipe() {
		ItemStack item = new Resources().not();
		
		NamespacedKey key = new NamespacedKey(plugin, "not_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapelessRecipe notBackRecipe() {
		ItemStack item = new Resources().t10();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(plugin, "t10_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BARRIER);
		
		return recipe;
	}
	
	public ShapedRecipe aRecipe() {
		ItemStack item = new Resources().a();
		
		NamespacedKey key = new NamespacedKey(plugin, "a_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BARRIER);
		
		return recipe;
	}
	
	public ShapelessRecipe aAltRecipe() {
		ItemStack item = new Resources().a();
		
		NamespacedKey key = new NamespacedKey(plugin, "a_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
	public ShapelessRecipe aBackRecipe() {
		ItemStack item = new Resources().t10();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(plugin, "t10_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.COMMAND_BLOCK);
		
		return recipe;
	}
}
