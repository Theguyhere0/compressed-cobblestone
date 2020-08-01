package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import org.bukkit.inventory.meta.ItemMeta;

public class Resources {
	public ItemStack c0p5() {
		ItemStack item = new ItemStack(Material.BASALT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.WHITE + "T1 Durable Cobblestone");
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GRAY + "Contains 9^0.5 (3) Cobblestone");
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
		lore.add(ChatColor.GRAY + "" + "Contains 9^1 (9) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^1.5 (27) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^2 (81) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^2.5 (243) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^3 (729) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^3.5 (2,187) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^4 (6,561) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^4.5 (19,683) Cobblestone");
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
		lore.add(ChatColor.GRAY + "Contains 9^5 (59,049) Cobblestone");
		lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		meta.setLore(lore);
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		
		item.setItemMeta(meta);

		return item;
	}
	
	public ItemStack guide() {
		ItemStack item = new ItemStack(Material.WRITTEN_BOOK);
		BookMeta meta = (BookMeta) item.getItemMeta();
		meta.setTitle(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Compressed Cobblestone");
		meta.setAuthor("Theguyhere");
		
		List<String> pages = new ArrayList<String>();
		pages.add("This is a " + ChatColor.BOLD + "guide" + ChatColor.RESET + " to the compressed cobblestone plugin. You can always summon this book by using " + ChatColor.GOLD +
				"" + ChatColor.BOLD + "/cchelp.");
		pages.add(ChatColor.BOLD + "Resources");
		pages.add("As per the title, there are new resources in the plugin: compressed cobblestone."
				+ " Cobblestone compression comes in tiers, with each tier holding 3x more cobblestone than the last.");
		pages.add("There are 10 tiers of compression with the highest holding 59,049 cobble per block!"
				+ " Craft the next tier with 3 cobble, or 2 tiers up with 9 cobble.");
		pages.add("Alternatively, use " + ChatColor.GOLD + "" + ChatColor.BOLD + "/cccraft" + ChatColor.RESET + " to automagically convert to the highest tiers of cobble!"
				+ " You can also convert backwards from high compression to low in the crafting grid.");
		pages.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "      Caution!      " + ChatColor.RESET +
				"If you place the compressed cobble, they will revert to the vanilla bocks they were based on."
				+ " Keep that in mind if you want to place them. All resources are also usable in their vanilla form.");
		pages.add("You will find very quickly that normal resources like iron, gold, diamond, emerald, and netherite lose value with the new recipes and items."
				+ " Luckily, there is a way to convert these resources to compressed cobblestone!");
		pages.add("9 coal blocks = T5     9 redstone blocks = T5                         9 quartz blocks = T5   9 iron blocks = T6     9 lapis blocks = T6     "
				+ "9 gold blocks = T7     9 emerald blocks = T8 9 diamond blocks = T9  9 netherite blocks = T10");
		pages.add(ChatColor.BOLD + "Crafting & Items");
		pages.add("CC offers new tools, weapons, and armor, all with their own crafting recipes! For the most part, just replace normal resources with compressed cobble."
				+ " Crafting tools of tiers 6-8 need blaze rods instead of sticks, and end rods for tiers 9 & 10.");
		pages.add("For armor, tiers 6-8 need blaze powder, and tiers 9 & 10 need end crystals. Helmets and leggings require the extra resource in the middle sqauare."
				+ " Chestplates and boots require the extra resource in the top middle square.");
		pages.add(ChatColor.DARK_RED + "" + ChatColor.BOLD + "      Caution!      " + ChatColor.RESET +
				"Do not repair any item with custom enchants! The custom enchants will be lost.");
		pages.add("Ranged weapons are a little different. Top row: blank, s-material, cobble; Middle row: rod, rod, s-material. Bottom row: blank, s-material, cobble"
				+ " S-material is either string for tiers 1-5, slime ball for 6-8, or sponge for 9 & 10.");
		pages.add("Rods are either stick for tiers 1-5, blaze rod for 6-8, or end rod for 9 & 10. Cobble is the associated tier of compressed cobblestone");
		pages.add("There are a few extra recipes to help get more cobble. Two blackstone creates two cobblestone and three netherrack creates one."
				+ " This conversion doesn't happen with the /cccraft command.");
		pages.add("One more note about craft. Because shields are incredibly important early game, they will take an iron block to make instead of an iron ingot."
				+ " I mean, what are you going to do with all that iron you dont need?");
		pages.add("One final note about items, " + ChatColor.BOLD + "your ability to use them depend on your experience level." + ChatColor.RESET +
				" Every tier requires 5 levels, chainmail requires 5, iron anything requires 10, gold armor require 15, diamond anything require 20, and netherite anything require 30.");
		pages.add(ChatColor.BOLD + "Enchants");
		pages.add("A lot of custom enchants have been added. Most have names that are self explanatory but a few may need further explaining.");
		pages.add(ChatColor.BOLD + "Telepathy" + ChatColor.RESET + " - Items that normally drop from mining/killing will appear in player inventory, or at the player's feet if their inventory is full.");
		pages.add(ChatColor.BOLD + "Stony, Petrifying, Rocky, Pebbly, Medusa" + ChatColor.RESET + " - A chance to get compressed cobble as a drop instead of normal drops."
				+ " Higher levels mean higher drop rate and better drops");
		pages.add(ChatColor.BOLD + "Fiery" + ChatColor.RESET + " - Iron and gold ores will automatically be smelted into ingots.");
		pages.add(ChatColor.BOLD + "Radar" + ChatColor.RESET + " - Permenant night vision.");
		pages.add(ChatColor.BOLD + "Soft Landing" + ChatColor.RESET + " - No fall damage.");
		pages.add(ChatColor.BOLD + "Healthy" + ChatColor.RESET + " - Doubles normal max health.");
		pages.add(ChatColor.BOLD + "Vulcan" + ChatColor.RESET + " - Permenant fire resistance.");
		pages.add(ChatColor.BOLD + "Powered" + ChatColor.RESET + " - Basically power for crossbows because late game, they needed to be buffed to be useful.");
		pages.add(ChatColor.BOLD + "Projectile" + ChatColor.RESET + " - Trident shoots super strong arrows with a cooldown between shots. Higher levels do more damage, but with a longer cooldown.");
		pages.add("A known issue with the way enchants work is that " + ChatColor.BOLD + "many potion effects cannot be obtained normally and can only be obtained through wearing armor.");
		pages.add("The following potion effects are affected: night vision, water breathing, haste, speed, luck, resistance, strength, hero of the village, "
				+ "dolphin's grace, jump, and fire resistance.");
		pages.add(ChatColor.BOLD + "Mobs");
		pages.add("Mobs behave normally, but mobs near the player will recieve CC gear depend on the highest tier CC item (not including cobblestone) in your inventory."
				+ ChatColor.RED + " Basically, don't skip too far or the mobs will get very strong.");
		pages.add("If there are multiple players, the highest tiered item out of all players in its check radius will be used to determine gear generation.");
		pages.add(ChatColor.DARK_GRAY + "" + ChatColor.BOLD + "Enjoy!");

		meta.setPages(pages);
		
		item.setItemMeta(meta);
		
		return item;
	}
}
