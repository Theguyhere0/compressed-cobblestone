package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.LeatherArmorMeta;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;

@SuppressWarnings("SpellCheckingInspection")
public class Armor {
//	Helmets
	public ItemStack t1Helmet() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();

		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "12 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Helmet() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "48 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t3Helmet() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "156 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t4Helmet() {
		ItemStack item = new ItemStack(Material.IRON_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.OXYGEN, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "480 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);

		return item;
	}
	
	public ItemStack t5Helmet() {
		ItemStack item = new ItemStack(Material.IRON_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.OXYGEN, 1, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,452 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		lore.add(ChatColor.GRAY + "Resistance I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);

		return item;
	}
	
	public ItemStack t6Helmet() {
		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);
		meta.addEnchant(Enchantment.OXYGEN, 2, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "4,368 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);

		return item;
	}
	
	public ItemStack t7Helmet() {
		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.OXYGEN, 3, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "13,116 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		lore.add(ChatColor.GRAY + "Absorption I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 1);

		return item;
	}
	
	public ItemStack t8Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.OXYGEN, 3, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "39,360 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 3);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 2);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t9Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Aqua Affinity");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Radar");
		lore.add(ChatColor.GRAY + "Water Breathing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "118,092 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.WATER_BREATHING, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 4);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 3);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t10Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Helmet");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add(ChatColor.GRAY + "Water Breathing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "354,288 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.WATER_BREATHING, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
	public ItemStack notHelmet() {
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Not Stone Crown");
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Disarming I");
		lore.add(ChatColor.GRAY + "Radar");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "708,588 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.DISARMING, 1);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
	public ItemStack aHelmet() {
		ItemStack item = new ItemStack(Material.GOLDEN_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Anti-Stone Crown");
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Disarming II");
		lore.add(ChatColor.GRAY + "Aqua Affinity");
		lore.add(ChatColor.GRAY + "Radar");
		lore.add(ChatColor.GRAY + "Water Breathing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,834,352 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.WATER_BREATHING, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);
		item.addUnsafeEnchantment(CustomEnchants.DISARMING, 2);

		return item;
	}
	
	public Collection<Material> helmets() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.LEATHER_HELMET);
		items.add(Material.CHAINMAIL_HELMET);
		items.add(Material.GOLDEN_HELMET);
		items.add(Material.IRON_HELMET);
		items.add(Material.DIAMOND_HELMET);
		items.add(Material.NETHERITE_HELMET);

		return items;
	}
	
//	Chestplates
	public ItemStack t1Chestplate() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "21 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Chestplate() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "84 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t3Chestplate() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "273 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t4Chestplate() {
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "840 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);

		return item;
	}
	
	public ItemStack t5Chestplate() {
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,541 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		lore.add(ChatColor.GRAY + "Resistance I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);

		return item;
	}
	
	public ItemStack t6Chestplate() {
		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Haste I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "7,644 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);

		return item;
	}
	
	public ItemStack t7Chestplate() {
		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking VII");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns III");
		lore.add(ChatColor.GRAY + "Haste I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "22,953 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		lore.add(ChatColor.GRAY + "Absorption I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 1);

		return item;
	}
	
	public ItemStack t8Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns IV");
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "68,880 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 3);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 2);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t9Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "206,661 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 4);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 3);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t10Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Chestplate");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "620,004 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
	public Collection<Material> chestplates() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.LEATHER_CHESTPLATE);
		items.add(Material.CHAINMAIL_CHESTPLATE);
		items.add(Material.GOLDEN_CHESTPLATE);
		items.add(Material.IRON_CHESTPLATE);
		items.add(Material.DIAMOND_CHESTPLATE);
		items.add(Material.NETHERITE_CHESTPLATE);

		return items;
	}

//	Leggings
	public ItemStack t1Leggings() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "18 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Leggings() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "72 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t3Leggings() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "234 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t4Leggings() {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "720 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		
		return item;
	}
	
	public ItemStack t5Leggings() {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,178 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		lore.add(ChatColor.GRAY + "Resistance I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);

		return item;
	}
	
	public ItemStack t6Leggings() {
		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6,552 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);

		return item;
	}
	
	public ItemStack t7Leggings() {
		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "19,674 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		lore.add(ChatColor.GRAY + "Absorption I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 1);

		return item;
	}
	
	public ItemStack t8Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,040 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 3);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 2);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t9Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Dolphin");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "177,138 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.DOLPHIN, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 4);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 3);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);
		
		return item;
	}
	
	public ItemStack t10Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Leggings");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Dolphin");
		lore.add(ChatColor.GRAY + "Saturation");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "531,432 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.DOLPHIN, 1);
		item.addUnsafeEnchantment(CustomEnchants.SATURATION, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
	public Collection<Material> leggings() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.LEATHER_LEGGINGS);
		items.add(Material.CHAINMAIL_LEGGINGS);
		items.add(Material.GOLDEN_LEGGINGS);
		items.add(Material.IRON_LEGGINGS);
		items.add(Material.DIAMOND_LEGGINGS);
		items.add(Material.NETHERITE_LEGGINGS);

		return items;
	}
	
//	Boots
	public ItemStack t1Boots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Boots() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "36 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t3Boots() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "117 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 1);

		return item;
	}
	
	public ItemStack t4Boots() {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Protection II");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Thorns I");
		lore.add(ChatColor.GRAY + "Feather Falling I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "360 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		
		return item;
	}
	
	public ItemStack t5Boots() {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Protection III");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Thorns I");
		lore.add(ChatColor.GRAY + "Feather Falling I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,089 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		lore.add(ChatColor.GRAY + "Resistance I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);

		return item;
	}
	
	public ItemStack t6Boots() {
		ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Protection III");
		lore.add(ChatColor.GRAY + "Thorns II");
		lore.add(ChatColor.GRAY + "Feather Falling II");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Soul Speed I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3,276 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);

		return item;
	}
	
	public ItemStack t7Boots() {
		ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking VII");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns III");
		lore.add(ChatColor.GRAY + "Feather Falling II");
		lore.add(ChatColor.GRAY + "Speedy II");
		lore.add(ChatColor.GRAY + "Soul Speed I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9,837 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Strength I");
		lore.add(ChatColor.GRAY + "Absorption I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 2);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 1);

		return item;
	}
	
	public ItemStack t8Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns IV");
		lore.add(ChatColor.GRAY + "Feather Falling III");
		lore.add(ChatColor.GRAY + "Speedy II");
		lore.add(ChatColor.GRAY + "Soul Speed II");
		lore.add(ChatColor.GRAY + "Jump I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "29,520 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 3);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 2);
		item.addUnsafeEnchantment(CustomEnchants.JUMP, 1);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t9Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Feather Falling V");
		lore.add(ChatColor.GRAY + "Soul Speed III");
		lore.add(ChatColor.GRAY + "Speedy II");
		lore.add(ChatColor.GRAY + "Jump II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "88,569 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 4);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 3);
		item.addUnsafeEnchantment(CustomEnchants.JUMP, 2);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t10Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Boots");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Speedy III");
		lore.add(ChatColor.GRAY + "Jump II");
		lore.add(ChatColor.GRAY + "Soft Landing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "265,716 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 3);
		item.addUnsafeEnchantment(CustomEnchants.SOFT_LANDING, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.JUMP, 2);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
	public Collection<Material> boots() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.LEATHER_BOOTS);
		items.add(Material.CHAINMAIL_BOOTS);
		items.add(Material.GOLDEN_BOOTS);
		items.add(Material.IRON_BOOTS);
		items.add(Material.DIAMOND_BOOTS);
		items.add(Material.NETHERITE_BOOTS);

		return items;
	}
	
//	Elytra
	public ItemStack t9Elytra() {
		ItemStack item = new ItemStack(Material.ELYTRA);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Elytra");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "These wings mobilize the power of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "157,464 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.ABSORPTION, 4);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 1);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 3);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
	public ItemStack t10Elytra() {
		ItemStack item = new ItemStack(Material.ELYTRA);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Elytra");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "These wings mobilize the power of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "629,856 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Vulcan II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.HASTE, 2);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 2);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 2);

		return item;
	}
	
//	Tiers
	public Collection<ItemStack> t0s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(new ItemStack(Material.LEATHER_HELMET));
		items.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		items.add(new ItemStack(Material.LEATHER_LEGGINGS));
		items.add(new ItemStack(Material.LEATHER_BOOTS));
		items.add(new ItemStack(Material.ELYTRA));

		return items;
	}

	public Collection<ItemStack> t1s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t1Helmet());
		items.add(t1Chestplate());
		items.add(t1Leggings());
		items.add(t1Boots());

		return items;
	}
	
	public Collection<ItemStack> t2s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t2Helmet());
		items.add(t2Chestplate());
		items.add(t2Leggings());
		items.add(t2Boots());

		return items;
	}

	public Collection<ItemStack> t3s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t3Helmet());
		items.add(t3Chestplate());
		items.add(t3Leggings());
		items.add(t3Boots());

		return items;
	}

	public Collection<ItemStack> t4s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t4Helmet());
		items.add(t4Chestplate());
		items.add(t4Leggings());
		items.add(t4Boots());

		return items;
	}

	public Collection<ItemStack> t5s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t5Helmet());
		items.add(t5Chestplate());
		items.add(t5Leggings());
		items.add(t5Boots());

		return items;
	}

	public Collection<ItemStack> t6s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t6Helmet());
		items.add(t6Chestplate());
		items.add(t6Leggings());
		items.add(t6Boots());

		return items;
	}

	public Collection<ItemStack> t7s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t7Helmet());
		items.add(t7Chestplate());
		items.add(t7Leggings());
		items.add(t7Boots());

		return items;
	}

	public Collection<ItemStack> t8s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t8Helmet());
		items.add(t8Chestplate());
		items.add(t8Leggings());
		items.add(t8Boots());

		return items;
	}

	public Collection<ItemStack> t9s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t9Helmet());
		items.add(t9Chestplate());
		items.add(t9Leggings());
		items.add(t9Boots());
		items.add(t9Elytra());

		return items;
	}

	public Collection<ItemStack> t10s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t10Helmet());
		items.add(t10Chestplate());
		items.add(t10Leggings());
		items.add(t10Boots());
		items.add(t10Elytra());

		return items;
	}
	
	public Collection<ItemStack> nots() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(notHelmet());

		return items;
	}

	public Collection<ItemStack> antis() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(aHelmet());

		return items;
	}
}
