package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
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

public class Tools {
//	Pickaxes
	public ItemStack c0p5Pick() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Pickaxe");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add("9 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Pick() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Stony I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "27 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 1);
		
		return item;
	}
	
	public ItemStack c1p5Pick() {
		ItemStack item = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Stony I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "81 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 1);
		
		return item;
	}
	
	public ItemStack c2Pick() {
		ItemStack item = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Stony II");
		lore.add(ChatColor.GRAY + "Fortune I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "243 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 2);
		
		return item;
	}
	
	public ItemStack c2p5Pick() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Stony II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "729 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 2);
		
		return item;
	}
	
	public ItemStack c3Pick() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Stony III");
		lore.add(ChatColor.GRAY + "Fiery");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,187 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 3);
		
		return item;
	}
	
	public ItemStack c3p5Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 6, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency VIII");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Fortune VI");
		lore.add(ChatColor.GRAY + "Stony III");
		lore.add(ChatColor.GRAY + "Fiery");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6,561 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 3);
		
		return item;
	}
	
	public ItemStack c4Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 8, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency X");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Fortune VIII");
		lore.add(ChatColor.GRAY + "Stony IV");
		lore.add(ChatColor.GRAY + "Fiery");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "19,683 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 4);
		
		return item;
	}
	
	public ItemStack c4p5Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Fortune X");
		lore.add(ChatColor.GRAY + "Stony IV");
		lore.add(ChatColor.GRAY + "Fiery");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,049 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 4);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack c5Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Fortune XV");
		lore.add(ChatColor.GRAY + "Stony V");
		lore.add(ChatColor.GRAY + "Fiery");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "177,138 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
//	Axes
	public ItemStack c0p5Axe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Axe");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Axe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Petrifying I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "27 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 1);
		
		return item;
	}
	
	public ItemStack c1p5Axe() {
		ItemStack item = new ItemStack(Material.IRON_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency III");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Petrifying I");
		lore.add(ChatColor.GRAY + "Sharpness I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "81 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 1);
		
		return item;
	}
	
	public ItemStack c2Axe() {
		ItemStack item = new ItemStack(Material.IRON_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Sharpness III");
		lore.add(ChatColor.GRAY + "Petrifying II");
		lore.add(ChatColor.GRAY + "Fortune I");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "243 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 2);
		
		return item;
	}
	
	public ItemStack c2p5Axe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Petrifying II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "729 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 2);
		
		return item;
	}
	
	public ItemStack c3Axe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness VIII");
		lore.add(ChatColor.GRAY + "Efficiency VI");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Fortune V");
		lore.add(ChatColor.GRAY + "Looting V");
		lore.add(ChatColor.GRAY + "Petrifying III");
		lore.add(ChatColor.GRAY + "Fire Aspect I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,187 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 3);
		
		return item;
	}
	
	public ItemStack c3p5Axe() {
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 6, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 12, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XII");
		lore.add(ChatColor.GRAY + "Efficiency VIII");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Fortune VI");
		lore.add(ChatColor.GRAY + "Looting VI");
		lore.add(ChatColor.GRAY + "Petrifying III");
		lore.add(ChatColor.GRAY + "Fire Aspect II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6,561 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 3);
		
		return item;
	}
	
	public ItemStack c4Axe() {
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 8, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 18, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XVII");
		lore.add(ChatColor.GRAY + "Efficiency X");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Fortune VIII");
		lore.add(ChatColor.GRAY + "Looting VIII");
		lore.add(ChatColor.GRAY + "Petrifying IV");
		lore.add(ChatColor.GRAY + "Fire Aspect III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "19,683 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 4);
		
		return item;
	}
	
	public ItemStack c4p5Axe() {
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XXV");
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Fortune X");
		lore.add(ChatColor.GRAY + "Looting X");
		lore.add(ChatColor.GRAY + "Petrifying IV");
		lore.add(ChatColor.GRAY + "Fire Aspect IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,059 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 4);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack c5Axe() {
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 15, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 40, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XL");
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Fortune XV");
		lore.add(ChatColor.GRAY + "Looting XV");
		lore.add(ChatColor.GRAY + "Petrifying V");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "177,138 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
//	Shovels
	public ItemStack c0p5Spade() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Shovel");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Spade() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Rocky I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 1);
		
		return item;
	}
	
	public ItemStack c1p5Spade() {
		ItemStack item = new ItemStack(Material.IRON_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Rocky I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "27 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 1);
		
		return item;
	}
	
	public ItemStack c2Spade() {
		ItemStack item = new ItemStack(Material.IRON_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Rocky II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "81 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 2);
		
		return item;
	}
	
	public ItemStack c2p5Spade() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Rocky II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "243 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 2);
		
		return item;
	}
	
	public ItemStack c3Spade() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Rocky III");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "729 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 3);
		
		return item;
	}
	
	public ItemStack c3p5Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency VIII");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Rocky III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,187 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 3);
		
		return item;
	}
	
	public ItemStack c4Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency X");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Rocky IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6,561 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 4);
		
		return item;
	}
	
	public ItemStack c4p5Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Rocky IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "19,683 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack c5Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Rocky V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,049 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
//	Hoes
	public ItemStack c0p5Hoe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Scythe");
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Hoe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Pebbly I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "18 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 1);
		
		return item;
	}
	
	public ItemStack c1p5Hoe() {
		ItemStack item = new ItemStack(Material.IRON_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency III");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Pebbly I");
		lore.add(ChatColor.GRAY + "Sharpness I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "54 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 1);
		
		return item;
	}
	
	public ItemStack c2Hoe() {
		ItemStack item = new ItemStack(Material.IRON_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Pebbly II");
		lore.add(ChatColor.GRAY + "Sharpness II");
		lore.add(ChatColor.GRAY + "Fortune I");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "162 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 2);
		
		return item;
	}
	
	public ItemStack c2p5Hoe() {
		ItemStack item = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency V");
		lore.add(ChatColor.GRAY + "Unbreaking IV");
		lore.add(ChatColor.GRAY + "Sharpness III");
		lore.add(ChatColor.GRAY + "Fortune III");
		lore.add(ChatColor.GRAY + "Pebbly II");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "486 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 2);
		
		return item;
	}
	
	public ItemStack c3Hoe() {
		ItemStack item = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency VI");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Fortune V");
		lore.add(ChatColor.GRAY + "Sharpness IV");
		lore.add(ChatColor.GRAY + "Pebbly III");
		lore.add(ChatColor.GRAY + "Looting II");
		lore.add(ChatColor.GRAY + "Fire Aspect I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,458 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 3);
		
		return item;
	}
	
	public ItemStack c3p5Hoe() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 6, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency VIII");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Fortune VI");
		lore.add(ChatColor.GRAY + "Sharpness VI");
		lore.add(ChatColor.GRAY + "Pebbly III");
		lore.add(ChatColor.GRAY + "Looting II");
		lore.add(ChatColor.GRAY + "Fire Aspect II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "4,374 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 3);
		
		return item;
	}
	
	public ItemStack c4Hoe() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 8, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency X");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Fortune VIII");
		lore.add(ChatColor.GRAY + "Sharpness VIII");
		lore.add(ChatColor.GRAY + "Pebbly IV");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add(ChatColor.GRAY + "Fire Aspect III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "13,122 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 4);
		
		return item;
	}
	
	public ItemStack c4p5Hoe() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Fortune X");
		lore.add(ChatColor.GRAY + "Sharpness X");
		lore.add(ChatColor.GRAY + "Pebbly IV");
		lore.add(ChatColor.GRAY + "Fire Aspect IV");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "39,366 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 4);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack c5Hoe() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 12, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Fortune XV");
		lore.add(ChatColor.GRAY + "Sharpness XII");
		lore.add(ChatColor.GRAY + "Pebbly V");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Looting IV");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "118,092 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
//	Swords
	public ItemStack c0p5Sword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Sword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Medusa I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "18 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 1);
		
		return item;
	}
	
	public ItemStack c1p5Sword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness III");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Medusa I");
		lore.add(ChatColor.GRAY + "Sweeping Edge I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "54 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 1);
		
		return item;
	}
	
	public ItemStack c2Sword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 2, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Medusa II");
		lore.add(ChatColor.GRAY + "Sweeping Edge II");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "162 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 2);
		
		return item;
	}
	
	public ItemStack c2p5Sword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness V");
		lore.add(ChatColor.GRAY + "Unbreaking IV");
		lore.add(ChatColor.GRAY + "Sweeping Edge III");
		lore.add(ChatColor.GRAY + "Medusa III");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "486 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 3);
		
		return item;
	}
	
	public ItemStack c3Sword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness VII");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Looting V");
		lore.add(ChatColor.GRAY + "Sweeping Edge IV");
		lore.add(ChatColor.GRAY + "Medusa IV");
		lore.add(ChatColor.GRAY + "Fire Aspect I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,458 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 4);
		
		return item;
	}
	
	public ItemStack c3p5Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 6, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness X");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Looting VI");
		lore.add(ChatColor.GRAY + "Sweeping Edge VI");
		lore.add(ChatColor.GRAY + "Medusa V");
		lore.add(ChatColor.GRAY + "Fire Aspect II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "4,374 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 5);
		
		return item;
	}
	
	public ItemStack c4Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 8, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XV");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Looting VIII");
		lore.add(ChatColor.GRAY + "Sweeping Edge VIII");
		lore.add(ChatColor.GRAY + "Medusa VI");
		lore.add(ChatColor.GRAY + "Fire Aspect III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "13,122 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 6);
		
		return item;
	}
	
	public ItemStack c4p5Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XX");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Looting X");
		lore.add(ChatColor.GRAY + "Sweeping Edge X");
		lore.add(ChatColor.GRAY + "Medusa VII");
		lore.add(ChatColor.GRAY + "Fire Aspect IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "39,366 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 7);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack c5Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 12, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 15, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Sharpness XXV");
		lore.add(ChatColor.GRAY + "Looting XV");
		lore.add(ChatColor.GRAY + "Sweeping Edge XII");
		lore.add(ChatColor.GRAY + "Medusa VIII");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "118,092 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 8);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
//	Ranged weapons
	public ItemStack c0p5Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "18 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "54 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "162 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2p5Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "486 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c3Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);
		meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,458 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c3p5Range() {
		ItemStack item = new ItemStack(Material.CROSSBOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Crossbow");
		meta.addEnchant(Enchantment.QUICK_CHARGE, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.PIERCING, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		meta.addEnchant(Enchantment.MULTISHOT, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("Quick Charge IV");
		lore.add("Unbreaking IV");
		lore.add("Piercing IV");
		lore.add("Looting II");
		lore.add("Powered I");
		lore.add("Multishot");
		lore.add("Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "4,374 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.POWERED, 1);

		return item;
	}
	
	public ItemStack c4Range() {
		ItemStack item = new ItemStack(Material.CROSSBOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Crossbow");
		meta.addEnchant(Enchantment.QUICK_CHARGE, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PIERCING, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		meta.addEnchant(Enchantment.MULTISHOT, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("Quick Charge V");
		lore.add("Unbreaking V");
		lore.add("Piercing V");
		lore.add("Looting III");
		lore.add("Powered II");
		lore.add("Multishot");
		lore.add("Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "13,122 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.POWERED, 2);

		return item;
	}
	
	public ItemStack c4p5Range() {
		ItemStack item = new ItemStack(Material.TRIDENT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Trident");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.RIPTIDE, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Riptide IV");
		lore.add(ChatColor.GRAY + "Looting IV");
		lore.add(ChatColor.GRAY + "Projectile I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "39,366 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PROJECTILE, 1);
		
		return item;
	}
	
	public ItemStack c5Range() {
		ItemStack item = new ItemStack(Material.TRIDENT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Trident");
		meta.addEnchant(Enchantment.RIPTIDE, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Projectile II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "118,092 Cobblestone");
		meta.setLore(lore);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PROJECTILE, 2);
		
		return item;
	}
	
//	Helmets
	public ItemStack c0p5Helmet() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "15 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Helmet() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "45 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5Helmet() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "135 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2Helmet() {
		ItemStack item = new ItemStack(Material.IRON_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.OXYGEN, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "405 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);

		return item;
	}
	
	public ItemStack c2p5Helmet() {
		ItemStack item = new ItemStack(Material.IRON_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Helmet");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.OXYGEN, 1, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,215 Cobblestone");
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
	
	public ItemStack c3Helmet() {
		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);
		meta.addEnchant(Enchantment.OXYGEN, 2, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3,645 Cobblestone");
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
	
	public ItemStack c3p5Helmet() {
		ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.OXYGEN, 3, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "10,935 Cobblestone");
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
	
	public ItemStack c4Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.OXYGEN, 3, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "32,805 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c4p5Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Helmet");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Aqua Affinity");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Radar");
		lore.add(ChatColor.GRAY + "Water Breathing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "98,415 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c5Helmet() {
		ItemStack item = new ItemStack(Material.NETHERITE_HELMET);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Helmet");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.WATER_WORKER, 1, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Radar");
		lore.add(ChatColor.GRAY + "Water Breathing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "295,245 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add(ChatColor.GRAY + "Vulcan");
		lore.add("");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.RADAR, 1);
		item.addUnsafeEnchantment(CustomEnchants.WATER_BREATHING, 1);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.HERO, 5);
		item.addUnsafeEnchantment(CustomEnchants.HEALTHY, 1);
		item.addUnsafeEnchantment(CustomEnchants.RESISTANCE, 3);
		item.addUnsafeEnchantment(CustomEnchants.STRENGTH, 4);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
//	Chestplates
	public ItemStack c0p5Chestplate() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "24 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Chestplate() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "72 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5Chestplate() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "216 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2Chestplate() {
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "648 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);

		return item;
	}
	
	public ItemStack c2p5Chestplate() {
		ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Chestplate");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,944 Cobblestone");
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
	
	public ItemStack c3Chestplate() {
		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Haste I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "5,832 Cobblestone");
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
	
	public ItemStack c3p5Chestplate() {
		ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking VII");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns III");
		lore.add(ChatColor.GRAY + "Haste I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "17,496 Cobblestone");
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
	
	public ItemStack c4Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns IV");
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "52,488 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c4p5Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Chestplate");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "157,464 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c5Chestplate() {
		ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Chestplate");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "472,392 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add(ChatColor.GRAY + "Vulcan");
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
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
//	Leggings
	public ItemStack c0p5Leggings() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "21 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Leggings() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "63 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5Leggings() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "189 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2Leggings() {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "567 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky I");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.LUCKY, 1);
		
		return item;
	}
	
	public ItemStack c2p5Leggings() {
		ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Leggings");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,701 Cobblestone");
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
	
	public ItemStack c3Leggings() {
		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "5,103 Cobblestone");
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
	
	public ItemStack c3p5Leggings() {
		ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "15,309 Cobblestone");
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
	
	public ItemStack c4Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "45,927 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c4p5Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Leggings");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking XV");
		lore.add(ChatColor.GRAY + "Protection V");
		lore.add(ChatColor.GRAY + "Thorns V");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Dolphin");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "137,781 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c5Leggings() {
		ItemStack item = new ItemStack(Material.NETHERITE_LEGGINGS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Leggings");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Dolphin");
		lore.add(ChatColor.GRAY + "Saturation");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "413,343 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add(ChatColor.GRAY + "Vulcan");
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
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
//	Boots
	public ItemStack c0p5Boots() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
		LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		
		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "12 Cobblestone");
		meta.setLore(lore);
		meta.setColor(Color.GRAY);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1Boots() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "36 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5Boots() {
		ItemStack item = new ItemStack(Material.CHAINMAIL_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "108 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.SPEEDY, 1);

		return item;
	}
	
	public ItemStack c2Boots() {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Protection II");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Thorns I");
		lore.add(ChatColor.GRAY + "Feather Falling I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "324 Cobblestone");
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
	
	public ItemStack c2p5Boots() {
		ItemStack item = new ItemStack(Material.IRON_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Boots");
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.THORNS, 1, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Protection III");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Thorns I");
		lore.add(ChatColor.GRAY + "Feather Falling I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "972 Cobblestone");
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
	
	public ItemStack c3Boots() {
		ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		meta.addEnchant(Enchantment.THORNS, 2, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Protection III");
		lore.add(ChatColor.GRAY + "Thorns II");
		lore.add(ChatColor.GRAY + "Feather Falling II");
		lore.add(ChatColor.GRAY + "Speedy I");
		lore.add(ChatColor.GRAY + "Soul Speed I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,916 Cobblestone");
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
	
	public ItemStack c3p5Boots() {
		ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 3, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Unbreaking VII");
		lore.add(ChatColor.GRAY + "Protection IV");
		lore.add(ChatColor.GRAY + "Thorns III");
		lore.add(ChatColor.GRAY + "Feather Falling II");
		lore.add(ChatColor.GRAY + "Speedy II");
		lore.add(ChatColor.GRAY + "Soul Speed I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "8,748 Cobblestone");
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
	
	public ItemStack c4Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 4, true);
		meta.addEnchant(Enchantment.THORNS, 4, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 3, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
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
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "26,244 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky III");
		lore.add(ChatColor.GRAY + "Strength II");
		lore.add(ChatColor.GRAY + "Absorption II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c4p5Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Boots");
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.THORNS, 5, true);
		meta.addEnchant(Enchantment.PROTECTION_FALL, 5, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<String>();
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
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "78,732 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky IV");
		lore.add(ChatColor.GRAY + "Absorption IV");
		lore.add(ChatColor.GRAY + "Strength III");
		lore.add(ChatColor.GRAY + "Hero II");
		lore.add(ChatColor.GRAY + "Resistance I");
		lore.add(ChatColor.GRAY + "Vulcan");
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
	
	public ItemStack c5Boots() {
		ItemStack item = new ItemStack(Material.NETHERITE_BOOTS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Boots");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 5, true);
		meta.addEnchant(Enchantment.SOUL_SPEED, 3, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Speedy III");
		lore.add(ChatColor.GRAY + "Jump II");
		lore.add(ChatColor.GRAY + "Soft Landing");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This armor harnesses the security of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "236,196 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add(ChatColor.GRAY + "Vulcan");
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
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
	
//	Elytra
	public ItemStack elytra() {
		ItemStack item = new ItemStack(Material.ELYTRA);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Terminal Stone Wings");
		meta.addEnchant(Enchantment.THORNS, 7, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Haste II");
		lore.add(ChatColor.GRAY + "Dolphin");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "These wings mobilize the power of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "472,392 Cobblestone");
		lore.add("");
		lore.add(ChatColor.GOLD + "Set Bonus:");
		lore.add(ChatColor.GRAY + "Lucky V");
		lore.add(ChatColor.GRAY + "Hero V");
		lore.add(ChatColor.GRAY + "Strength IV");
		lore.add(ChatColor.GRAY + "Resistance II");
		lore.add(ChatColor.GRAY + "Healthy");
		lore.add(ChatColor.GRAY + "Vulcan");
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
		item.addUnsafeEnchantment(CustomEnchants.DOLPHIN, 1);
		item.addUnsafeEnchantment(CustomEnchants.VULCAN, 1);

		return item;
	}
}
