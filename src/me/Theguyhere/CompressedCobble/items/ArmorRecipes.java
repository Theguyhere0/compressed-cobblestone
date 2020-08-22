package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import me.Theguyhere.CompressedCobble.Main;

public class ArmorRecipes implements Listener {
	private Main plugin;
	private Armor a;
	
	public ArmorRecipes(Main plugin, Armor a) {
		this.plugin = plugin;
		this.a = a;
	}

//	Helmets
	public ShapedRecipe t1HelmetRecipe() {
		ItemStack item = a.t1Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t2HelmetRecipe() {
		ItemStack item = a.t2Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapedRecipe t3HelmetRecipe() {
		ItemStack item = a.t3Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t4HelmetRecipe() {
		ItemStack item = a.t4Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t5HelmetRecipe() {
		ItemStack item = a.t5Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t6HelmetRecipe() {
		ItemStack item = a.t6Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t7HelmetRecipe() {
		ItemStack item = a.t7Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t8HelmetRecipe() {
		ItemStack item = a.t8Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t9HelmetRecipe() {
		ItemStack item = a.t9Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t10HelmetRecipe() {
		ItemStack item = a.t10Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe notHelmetRecipe() {
		ItemStack item = a.notHelmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "cNotHelmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CWC", "CNC", "   ");
		
		recipe.setIngredient('C', Material.BARRIER);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('W', Material.CONDUIT);

		return recipe;
	}
	
	public ShapedRecipe aHelmetRecipe() {
		ItemStack item = a.aHelmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "cAHelmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CNC", "   ");
		
		recipe.setIngredient('C', Material.COMMAND_BLOCK);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('P', Material.GOLDEN_HELMET);

		return recipe;
	}

	public ShapelessRecipe t0HelmetFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe t1HelmetFixRecipe() {
		ItemStack item = a.t1Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe t2HelmetFixRecipe() {
		ItemStack item = a.t2Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t3HelmetFixRecipe() {
		ItemStack item = a.t3Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe t4HelmetFixRecipe() {
		ItemStack item = a.t4Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t5HelmetFixRecipe() {
		ItemStack item = a.t5Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t6HelmetFixRecipe() {
		ItemStack item = a.t6Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t7HelmetFixRecipe() {
		ItemStack item = a.t7Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t8HelmetFixRecipe() {
		ItemStack item = a.t8Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe t9HelmetFixRecipe() {
		ItemStack item = a.t9Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_HELMET);
		
		return recipe;
	}

//	Helmet Alts
	public ShapedRecipe t1HelmetAltRecipe() {
		ItemStack item = a.t1Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t2HelmetAltRecipe() {
		ItemStack item = a.t2Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapedRecipe t3HelmetAltRecipe() {
		ItemStack item = a.t3Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t4HelmetAltRecipe() {
		ItemStack item = a.t4Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t5HelmetAltRecipe() {
		ItemStack item = a.t5Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t6HelmetAltRecipe() {
		ItemStack item = a.t6Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t7HelmetAltRecipe() {
		ItemStack item = a.t7Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t8HelmetAltRecipe() {
		ItemStack item = a.t8Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t9HelmetAltRecipe() {
		ItemStack item = a.t9Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CEC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe t10HelmetAltRecipe() {
		ItemStack item = a.t10Helmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CEC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe notHelmetAltRecipe() {
		ItemStack item = a.notHelmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "cNotHelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CWC", "CNC");
		
		recipe.setIngredient('C', Material.BARRIER);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('W', Material.CONDUIT);

		return recipe;
	}
	
	public ShapedRecipe aHelmetAltRecipe() {
		ItemStack item = a.aHelmet();
		
		NamespacedKey key = new NamespacedKey(plugin, "cAHelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CNC");
		
		recipe.setIngredient('C', Material.COMMAND_BLOCK);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('P', Material.GOLDEN_HELMET);

		return recipe;
	}

//	Chestplates
	public ShapedRecipe t1ChestplateRecipe() {
		ItemStack item = a.t1Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t2ChestplateRecipe() {
		ItemStack item = a.t2Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapedRecipe t3ChestplateRecipe() {
		ItemStack item = a.t3Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t4ChestplateRecipe() {
		ItemStack item = a.t4Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t5ChestplateRecipe() {
		ItemStack item = a.t5Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t6ChestplateRecipe() {
		ItemStack item = a.t6Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t7ChestplateRecipe() {
		ItemStack item = a.t7Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t8ChestplateRecipe() {
		ItemStack item = a.t8Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t9ChestplateRecipe() {
		ItemStack item = a.t9Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe t10ChestplateRecipe() {
		ItemStack item = a.t10Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_CHESTPLATE);

		return recipe;
	}

	public ShapelessRecipe t0ChestplateFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe t1ChestplateFixRecipe() {
		ItemStack item = a.t1Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe t2ChestplateFixRecipe() {
		ItemStack item = a.t2Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t3ChestplateFixRecipe() {
		ItemStack item = a.t3Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe t4ChestplateFixRecipe() {
		ItemStack item = a.t4Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t5ChestplateFixRecipe() {
		ItemStack item = a.t5Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t6ChestplateFixRecipe() {
		ItemStack item = a.t6Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t7ChestplateFixRecipe() {
		ItemStack item = a.t7Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t8ChestplateFixRecipe() {
		ItemStack item = a.t8Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe t9ChestplateFixRecipe() {
		ItemStack item = a.t9Chestplate();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_CHESTPLATE);
		
		return recipe;
	}

//	Leggings
	public ShapedRecipe t1LeggingsRecipe() {
		ItemStack item = a.t1Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t2LeggingsRecipe() {
		ItemStack item = a.t2Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapedRecipe t3LeggingsRecipe() {
		ItemStack item = a.t3Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t4LeggingsRecipe() {
		ItemStack item = a.t4Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t5LeggingsRecipe() {
		ItemStack item = a.t5Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t6LeggingsRecipe() {
		ItemStack item = a.t6Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t7LeggingsRecipe() {
		ItemStack item = a.t7Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t8LeggingsRecipe() {
		ItemStack item = a.t8Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t9LeggingsRecipe() {
		ItemStack item = a.t9Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe t10LeggingsRecipe() {
		ItemStack item = a.t10Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_LEGGINGS);

		return recipe;
	}
	
	public ShapelessRecipe t0LeggingsFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe t1LeggingsFixRecipe() {
		ItemStack item = a.t1Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe t2LeggingsFixRecipe() {
		ItemStack item = a.t2Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t3LeggingsFixRecipe() {
		ItemStack item = a.t3Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe t4LeggingsFixRecipe() {
		ItemStack item = a.t4Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t5LeggingsFixRecipe() {
		ItemStack item = a.t5Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t6LeggingsFixRecipe() {
		ItemStack item = a.t6Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t7LeggingsFixRecipe() {
		ItemStack item = a.t7Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t8LeggingsFixRecipe() {
		ItemStack item = a.t8Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe t9LeggingsFixRecipe() {
		ItemStack item = a.t9Leggings();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_LEGGINGS);
		
		return recipe;
	}

//	Boots
	public ShapedRecipe t1BootsRecipe() {
		ItemStack item = a.t1Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t2BootsRecipe() {
		ItemStack item = a.t2Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapedRecipe t3BootsRecipe() {
		ItemStack item = a.t3Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t4BootsRecipe() {
		ItemStack item = a.t4Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t5BootsRecipe() {
		ItemStack item = a.t5Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t6BootsRecipe() {
		ItemStack item = a.t6Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t7BootsRecipe() {
		ItemStack item = a.t7Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t8BootsRecipe() {
		ItemStack item = a.t8Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t9BootsRecipe() {
		ItemStack item = a.t9Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t10BootsRecipe() {
		ItemStack item = a.t10Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapelessRecipe t0BootsFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
		
		NamespacedKey key = new NamespacedKey(plugin, "t0BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe t1BootsFixRecipe() {
		ItemStack item = a.t1Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe t2BootsFixRecipe() {
		ItemStack item = a.t2Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t3BootsFixRecipe() {
		ItemStack item = a.t3Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe t4BootsFixRecipe() {
		ItemStack item = a.t4Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t5BootsFixRecipe() {
		ItemStack item = a.t5Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t6BootsFixRecipe() {
		ItemStack item = a.t6Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t7BootsFixRecipe() {
		ItemStack item = a.t7Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t8BootsFixRecipe() {
		ItemStack item = a.t8Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe t9BootsFixRecipe() {
		ItemStack item = a.t9Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_BOOTS);
		
		return recipe;
	}

//	Boots Alts
	public ShapedRecipe t1BootsAltRecipe() {
		ItemStack item = a.t1Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t1BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t2BootsAltRecipe() {
		ItemStack item = a.t2Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t2BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapedRecipe t3BootsAltRecipe() {
		ItemStack item = a.t3Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t3BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t4BootsAltRecipe() {
		ItemStack item = a.t4Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t4BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t5BootsAltRecipe() {
		ItemStack item = a.t5Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t6BootsAltRecipe() {
		ItemStack item = a.t6Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t6BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t7BootsAltRecipe() {
		ItemStack item = a.t7Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t7BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t8BootsAltRecipe() {
		ItemStack item = a.t8Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t8BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t9BootsAltRecipe() {
		ItemStack item = a.t9Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe t10BootsAltRecipe() {
		ItemStack item = a.t10Boots();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
//	Elytra
	public ShapedRecipe t9ElytraRecipe() {
		ItemStack item = a.t9Elytra();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9Elytra");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "CCC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.ELYTRA);
		
		return recipe;
	}

	public ShapedRecipe t10ElytraRecipe() {
		ItemStack item = a.t10Elytra();
		
		NamespacedKey key = new NamespacedKey(plugin, "t10Elytra");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.ELYTRA);
		
		return recipe;
	}
	
	public ShapelessRecipe t9ElytraFixRecipe() {
		ItemStack item = a.t9Elytra();
		
		NamespacedKey key = new NamespacedKey(plugin, "t9ElytraFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.ELYTRA);
		
		return recipe;
	}
}
