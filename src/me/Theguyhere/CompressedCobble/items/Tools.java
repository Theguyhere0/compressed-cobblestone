package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;

@SuppressWarnings("SpellCheckingInspection")
public class Tools {
//	Pickaxes
	public ItemStack t1Pick() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Pickaxe");
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Pick() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Stony I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "27 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 1);
		
		return item;
	}
	
	public ItemStack t3Pick() {
		ItemStack item = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Stony I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "81 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 1);
		
		return item;
	}
	
	public ItemStack t4Pick() {
		ItemStack item = new ItemStack(Material.IRON_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t5Pick() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Stony II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "729 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.STONY, 2);
		
		return item;
	}
	
	public ItemStack t6Pick() {
		ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t7Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 6, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	
	public ItemStack t8Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 8, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t9Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t10Pick() {
		ItemStack item = new ItemStack(Material.NETHERITE_PICKAXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Pickaxe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
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
	
	public Collection<Material> picks() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.WOODEN_PICKAXE);
		items.add(Material.STONE_PICKAXE);
		items.add(Material.GOLDEN_PICKAXE);
		items.add(Material.IRON_PICKAXE);
		items.add(Material.DIAMOND_PICKAXE);
		items.add(Material.NETHERITE_PICKAXE);

		return items;
	}
	
//	Axes
	public ItemStack t1Axe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Axe");
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Axe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Petrifying I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "27 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 1);
		
		return item;
	}
	
	public ItemStack t3Axe() {
		ItemStack item = new ItemStack(Material.IRON_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t4Axe() {
		ItemStack item = new ItemStack(Material.IRON_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t5Axe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Petrifying II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "729 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 2);
		
		return item;
	}
	
	
	public ItemStack t6Axe() {
		ItemStack item = new ItemStack(Material.DIAMOND_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 8, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t7Axe() {
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

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t8Axe() {
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

		List<String> lore = new ArrayList<>();
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
	
	public ItemStack t9Axe() {
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

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness XXV");
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Fortune X");
		lore.add(ChatColor.GRAY + "Looting X");
		lore.add(ChatColor.GRAY + "Petrifying V");
		lore.add(ChatColor.GRAY + "Fire Aspect IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,059 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack t10Axe() {
		ItemStack item = new ItemStack(Material.NETHERITE_AXE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Axe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 15, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 40, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness XL");
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Fortune XV");
		lore.add(ChatColor.GRAY + "Looting XV");
		lore.add(ChatColor.GRAY + "Petrifying VI");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "177,138 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PETRIFYING, 6);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public Collection<Material> axes() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.WOODEN_AXE);
		items.add(Material.STONE_AXE);
		items.add(Material.GOLDEN_AXE);
		items.add(Material.IRON_AXE);
		items.add(Material.DIAMOND_AXE);
		items.add(Material.NETHERITE_AXE);

		return items;
	}

//	Shovels
	public ItemStack t1Spade() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Shovel");
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "4 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Spade() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Rocky I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "13 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 1);
		
		return item;
	}
	
	public ItemStack t3Spade() {
		ItemStack item = new ItemStack(Material.IRON_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Rocky I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "40 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 1);
		
		return item;
	}
	
	
	public ItemStack t4Spade() {
		ItemStack item = new ItemStack(Material.IRON_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Rocky II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "121 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 2);
		
		return item;
	}
	
	public ItemStack t5Spade() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Rocky II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "364 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 2);
		
		return item;
	}
	
	public ItemStack t6Spade() {
		ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Rocky III");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,093 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 3);
		
		return item;
	}
	
	public ItemStack t7Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 8, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency VIII");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Rocky III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3,280 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 3);
		
		return item;
	}
	
	public ItemStack t8Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency X");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Rocky IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9,841 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 4);
		
		return item;
	}
	
	public ItemStack t9Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Rocky IV");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "29,524 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 4);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack t10Spade() {
		ItemStack item = new ItemStack(Material.NETHERITE_SHOVEL);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Shovel");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Rocky V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "88,573 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.ROCKY, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public Collection<Material> spades() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.WOODEN_SHOVEL);
		items.add(Material.STONE_SHOVEL);
		items.add(Material.GOLDEN_SHOVEL);
		items.add(Material.IRON_SHOVEL);
		items.add(Material.DIAMOND_SHOVEL);
		items.add(Material.NETHERITE_SHOVEL);

		return items;
	}
	
//	Hoes
	public ItemStack t1Hoe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Scythe");
		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "5 Cobblestone");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DIG_SPEED, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Hoe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Pebbly I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "14 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 1);
		
		return item;
	}
	
	public ItemStack t3Hoe() {
		ItemStack item = new ItemStack(Material.IRON_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency III");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Pebbly I");
		lore.add(ChatColor.GRAY + "Sharpness I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "41 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 1);
		
		return item;
	}
	
	public ItemStack t4Hoe() {
		ItemStack item = new ItemStack(Material.IRON_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 1, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Pebbly II");
		lore.add(ChatColor.GRAY + "Sharpness II");
		lore.add(ChatColor.GRAY + "Fortune I");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "122 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 2);
		
		return item;
	}
	
	public ItemStack t5Hoe() {
		ItemStack item = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency V");
		lore.add(ChatColor.GRAY + "Unbreaking IV");
		lore.add(ChatColor.GRAY + "Sharpness III");
		lore.add(ChatColor.GRAY + "Fortune III");
		lore.add(ChatColor.GRAY + "Pebbly II");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "365 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 2);
		
		return item;
	}
	
	public ItemStack t6Hoe() {
		ItemStack item = new ItemStack(Material.DIAMOND_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 6, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency VI");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Fortune V");
		lore.add(ChatColor.GRAY + "Sharpness IV");
		lore.add(ChatColor.GRAY + "Pebbly III");
		lore.add(ChatColor.GRAY + "Looting II");
		lore.add(ChatColor.GRAY + "Fire Aspect I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,094 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 3);
		
		return item;
	}
	
	public ItemStack t7Hoe() {
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

		List<String> lore = new ArrayList<>();
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
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3,281 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 3);
		
		return item;
	}
	
	public ItemStack t8Hoe() {
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

		List<String> lore = new ArrayList<>();
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
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9,842 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 4);
		
		return item;
	}
	
	public ItemStack t9Hoe() {
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

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency XV");
		lore.add(ChatColor.GRAY + "Unbreaking X");
		lore.add(ChatColor.GRAY + "Fortune X");
		lore.add(ChatColor.GRAY + "Sharpness X");
		lore.add(ChatColor.GRAY + "Pebbly V");
		lore.add(ChatColor.GRAY + "Fire Aspect IV");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "29,525 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 5);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack t10Hoe() {
		ItemStack item = new ItemStack(Material.NETHERITE_HOE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Scythe");
		meta.addEnchant(Enchantment.DIG_SPEED, 20, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 15, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 12, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Efficiency XX");
		lore.add(ChatColor.GRAY + "Fortune XV");
		lore.add(ChatColor.GRAY + "Sharpness XII");
		lore.add(ChatColor.GRAY + "Pebbly VI");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Looting IV");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This tool holds the might of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "88,574 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PEBBLY, 6);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public Collection<Material> hoes() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.WOODEN_HOE);
		items.add(Material.STONE_HOE);
		items.add(Material.GOLDEN_HOE);
		items.add(Material.IRON_HOE);
		items.add(Material.DIAMOND_HOE);
		items.add(Material.NETHERITE_HOE);

		return items;
	}
	
//	Swords
	public ItemStack t1Sword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "5 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Sword() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Medusa I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "14 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 1);
		
		return item;
	}
	
	public ItemStack t3Sword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness III");
		lore.add(ChatColor.GRAY + "Unbreaking II");
		lore.add(ChatColor.GRAY + "Medusa I");
		lore.add(ChatColor.GRAY + "Sweeping Edge I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "41 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 1);
		
		return item;
	}
	
	public ItemStack t4Sword() {
		ItemStack item = new ItemStack(Material.IRON_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 2, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness IV");
		lore.add(ChatColor.GRAY + "Unbreaking III");
		lore.add(ChatColor.GRAY + "Medusa II");
		lore.add(ChatColor.GRAY + "Sweeping Edge II");
		lore.add(ChatColor.GRAY + "Looting I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "122 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 2);
		
		return item;
	}
	
	public ItemStack t5Sword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness V");
		lore.add(ChatColor.GRAY + "Unbreaking IV");
		lore.add(ChatColor.GRAY + "Sweeping Edge III");
		lore.add(ChatColor.GRAY + "Medusa III");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "365 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 3);
		
		return item;
	}
	
	public ItemStack t6Sword() {
		ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 7, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness VII");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Looting V");
		lore.add(ChatColor.GRAY + "Sweeping Edge IV");
		lore.add(ChatColor.GRAY + "Medusa IV");
		lore.add(ChatColor.GRAY + "Fire Aspect I");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,094 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 4);
		
		return item;
	}
	
	public ItemStack t7Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		meta.addEnchant(Enchantment.DURABILITY, 6, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 6, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 6, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness X");
		lore.add(ChatColor.GRAY + "Unbreaking VI");
		lore.add(ChatColor.GRAY + "Looting VI");
		lore.add(ChatColor.GRAY + "Sweeping Edge VI");
		lore.add(ChatColor.GRAY + "Medusa V");
		lore.add(ChatColor.GRAY + "Fire Aspect II");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "3,281 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 5);
		
		return item;
	}
	
	public ItemStack t8Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 15, true);
		meta.addEnchant(Enchantment.DURABILITY, 8, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 8, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 8, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness XV");
		lore.add(ChatColor.GRAY + "Unbreaking VIII");
		lore.add(ChatColor.GRAY + "Looting VIII");
		lore.add(ChatColor.GRAY + "Sweeping Edge VIII");
		lore.add(ChatColor.GRAY + "Medusa VI");
		lore.add(ChatColor.GRAY + "Fire Aspect III");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "9,842 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 6);
		
		return item;
	}
	
	public ItemStack t9Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 20, true);
		meta.addEnchant(Enchantment.DURABILITY, 10, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 10, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
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
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "29,525 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 7);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public ItemStack t10Sword() {
		ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Sword");
		meta.addEnchant(Enchantment.DAMAGE_ALL, 25, true);
		meta.addEnchant(Enchantment.SWEEPING_EDGE, 12, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 15, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Sharpness XXV");
		lore.add(ChatColor.GRAY + "Looting XV");
		lore.add(ChatColor.GRAY + "Sweeping Edge XII");
		lore.add(ChatColor.GRAY + "Medusa VIII");
		lore.add(ChatColor.GRAY + "Fire Aspect V");
		lore.add(ChatColor.GRAY + "Telepathy");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "88,574 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.MEDUSA, 8);
		item.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);
		
		return item;
	}
	
	public Collection<Material> swords() {
		Collection<Material> items = new HashSet<>();
		items.add(Material.WOODEN_SWORD);
		items.add(Material.STONE_SWORD);
		items.add(Material.GOLDEN_SWORD);
		items.add(Material.IRON_SWORD);
		items.add(Material.DIAMOND_SWORD);
		items.add(Material.NETHERITE_SWORD);

		return items;
	}
	
//	Ranged weapons
	public ItemStack t1Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t2Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "24 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t3Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "78 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t4Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "240 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t5Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 2, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "726 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t6Range() {
		ItemStack item = new ItemStack(Material.BOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Stone Bow");
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
		meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 3, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1, true);
		meta.addEnchant(Enchantment.ARROW_FIRE, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "2,184 Cobblestone");
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack t7Range() {
		ItemStack item = new ItemStack(Material.CROSSBOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Stone Crossbow");
		meta.addEnchant(Enchantment.QUICK_CHARGE, 4, true);
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.PIERCING, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 2, true);
		meta.addEnchant(Enchantment.MULTISHOT, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Quick Charge IV");
		lore.add(ChatColor.GRAY + "Unbreaking IV");
		lore.add(ChatColor.GRAY + "Piercing IV");
		lore.add(ChatColor.GRAY + "Looting II");
		lore.add(ChatColor.GRAY + "Powered I");
		lore.add(ChatColor.GRAY + "Multishot");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "6,558 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.POWERED, 1);

		return item;
	}
	
	public ItemStack t8Range() {
		ItemStack item = new ItemStack(Material.CROSSBOW);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Crossbow");
		meta.addEnchant(Enchantment.QUICK_CHARGE, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.PIERCING, 5, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 3, true);
		meta.addEnchant(Enchantment.MULTISHOT, 1, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Quick Charge V");
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Piercing V");
		lore.add(ChatColor.GRAY + "Looting III");
		lore.add(ChatColor.GRAY + "Powered II");
		lore.add(ChatColor.GRAY + "Multishot");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "19,680 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.POWERED, 2);

		return item;
	}
	
	public ItemStack t9Range() {
		ItemStack item = new ItemStack(Material.TRIDENT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Trident");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.RIPTIDE, 4, true);
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 4, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Riptide IV");
		lore.add(ChatColor.GRAY + "Looting IV");
		lore.add(ChatColor.GRAY + "Projectile I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "59,046 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PROJECTILE, 1);
		
		return item;
	}
	
	public ItemStack t10Range() {
		ItemStack item = new ItemStack(Material.TRIDENT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Trident");
		meta.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Projectile II");
		lore.add(ChatColor.GRAY + "Rocket");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This weapon holds the strength of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "117,138 Cobblestone");
		meta.setLore(lore);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.PROJECTILE, 2);
		item.addUnsafeEnchantment(CustomEnchants.ROCKET, 1);
		
		return item;
	}
		
//	Shields
	public ItemStack t5Shield() {
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Stone Shield");
		meta.addEnchant(Enchantment.DURABILITY, 3, true);

		List<String> lore = new ArrayList<>();
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This shield employs the rigidity of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "1,215 Cobblestone");
		meta.setLore(lore);

		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack t8Shield() {
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Stone Shield");
		meta.addEnchant(Enchantment.DURABILITY, 5, true);
		meta.addEnchant(Enchantment.MENDING, 1, true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Unbreaking V");
		lore.add(ChatColor.GRAY + "Immunity I");
		lore.add(ChatColor.GRAY + "Mending");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This shield employs the rigidity of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "34,020 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.IMMUNITY, 1);

		return item;
	}
	
	public ItemStack t10Shield() {
		ItemStack item = new ItemStack(Material.SHIELD);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Shield");
		meta.addEnchant(Enchantment.MENDING, 1, true);
		meta.setUnbreakable(true);

		List<String> lore = new ArrayList<>();
		lore.add(ChatColor.GRAY + "Immunity II");
		lore.add("");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "This shield employs the rigidity of ");
		lore.add(ChatColor.DARK_AQUA + "" + ChatColor.ITALIC + "329,265 Cobblestone");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

		item.setItemMeta(meta);
		item.addUnsafeEnchantment(CustomEnchants.IMMUNITY, 2);

		return item;
	}
	
//	Tiers
	public Collection<ItemStack> t0s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(new ItemStack(Material.STONE_PICKAXE));
		items.add(new ItemStack(Material.STONE_AXE));
		items.add(new ItemStack(Material.STONE_SHOVEL));
		items.add(new ItemStack(Material.STONE_HOE));
		items.add(new ItemStack(Material.STONE_SWORD));
		items.add(new ItemStack(Material.BOW));
		items.add(new ItemStack(Material.SHIELD));

		return items;
	}
	
	public Collection<ItemStack> t1s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t1Pick());
		items.add(t1Axe());
		items.add(t1Spade());
		items.add(t1Hoe());
		items.add(t1Sword());
		items.add(t1Range());

		return items;
	}
	
	public Collection<ItemStack> t2s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t2Pick());
		items.add(t2Axe());
		items.add(t2Spade());
		items.add(t2Hoe());
		items.add(t2Sword());
		items.add(t2Range());

		return items;
	}

	public Collection<ItemStack> t3s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t3Pick());
		items.add(t3Axe());
		items.add(t3Spade());
		items.add(t3Hoe());
		items.add(t3Sword());
		items.add(t3Range());

		return items;
	}

	public Collection<ItemStack> t4s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t4Pick());
		items.add(t4Axe());
		items.add(t4Spade());
		items.add(t4Hoe());
		items.add(t4Sword());
		items.add(t4Range());

		return items;
	}

	public Collection<ItemStack> t5s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t5Pick());
		items.add(t5Axe());
		items.add(t5Spade());
		items.add(t5Hoe());
		items.add(t5Sword());
		items.add(t5Range());
		items.add(t5Shield());

		return items;
	}

	public Collection<ItemStack> t6s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t6Pick());
		items.add(t6Axe());
		items.add(t6Spade());
		items.add(t6Hoe());
		items.add(t6Sword());
		items.add(t6Range());

		return items;
	}

	public Collection<ItemStack> t7s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t7Pick());
		items.add(t7Axe());
		items.add(t7Spade());
		items.add(t7Hoe());
		items.add(t7Sword());
		items.add(t7Range());

		return items;
	}

	public Collection<ItemStack> t8s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t8Pick());
		items.add(t8Axe());
		items.add(t8Spade());
		items.add(t8Hoe());
		items.add(t8Sword());
		items.add(t8Range());
		items.add(t8Shield());

		return items;
	}

	public Collection<ItemStack> t9s() {
		Collection<ItemStack> items = new HashSet<>();
		items.add(t9Pick());
		items.add(t9Axe());
		items.add(t9Spade());
		items.add(t9Hoe());
		items.add(t9Sword());
		items.add(t9Range());

		return items;
	}

	public Collection<ItemStack> t10s() {
		Collection<ItemStack> items = new HashSet<>();
		
		items.add(t10Pick());
		items.add(t10Axe());
		items.add(t10Spade());
		items.add(t10Hoe());
		items.add(t10Sword());
		items.add(t10Range());
		items.add(t10Shield());

		return items;
	}
}
