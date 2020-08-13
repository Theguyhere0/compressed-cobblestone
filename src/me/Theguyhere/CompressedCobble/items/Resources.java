package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Resources {
	public ItemStack c0p5() {
		ItemStack item = new ItemStack(Material.BASALT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		
		
		return item;
	}
	
	public ItemStack c1() {
		ItemStack item = new ItemStack(Material.BLACKSTONE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T2 Resilient Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "" + "Contains 3^2 (9) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c1p5() {
		ItemStack item = new ItemStack(Material.OBSIDIAN);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.YELLOW + "T3 Metallic Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c2() {
		ItemStack item = new ItemStack(Material.GILDED_BLACKSTONE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T4 Gilded Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack c2p5() {
		ItemStack item = new ItemStack(Material.GLOWSTONE);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.GOLD + "T5 Shiny Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack c3() {
		ItemStack item = new ItemStack(Material.MAGMA_BLOCK);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T6 Blazing Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);
		
		return item;
	}
	
	public ItemStack c3p5() {
		ItemStack item = new ItemStack(Material.CRYING_OBSIDIAN);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_RED + "T7 Mystical Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack c4() {
		ItemStack item = new ItemStack(Material.ANCIENT_DEBRIS);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "T8 Draconian Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack c4p5() {
		ItemStack item = new ItemStack(Material.BEDROCK);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack c5() {
		ItemStack item = new ItemStack(Material.END_PORTAL_FRAME);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack cNot() {
		ItemStack item = new ItemStack(Material.BARRIER);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Not Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}

	public ItemStack cA() {
		ItemStack item = new ItemStack(Material.COMMAND_BLOCK);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Anti-Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 3^12 (531,441) Cobblestone");
		lore.add(ChatColor.RED + "" + ChatColor.ITALIC + "Caution!! Item will destroy blocks it touches.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
}
