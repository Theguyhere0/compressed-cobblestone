package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class ToolsRecipeEvents implements Listener {
	@EventHandler
	public void restrictC0p5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.WHITE + "T1 Durable Stone Pickaxe";
		String axe = ChatColor.WHITE + "T1 Durable Stone Axe";
		String spade = ChatColor.WHITE + "T1 Durable Stone Shovel";
		String hoe = ChatColor.WHITE + "T1 Durable Stone Scythe";
		String sword = ChatColor.WHITE + "T1 Durable Stone Sword";
		String helmet = ChatColor.WHITE + "T1 Durable Stone Helmet";
		String chestplate = ChatColor.WHITE + "T1 Durable Stone Chestplate";
		String leggings = ChatColor.WHITE + "T1 Durable Stone Leggings";
		String boots = ChatColor.WHITE + "T1 Durable Stone Boots";
		String range = ChatColor.WHITE + "T1 Durable Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^0.5 (3) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.BASALT))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC1ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.YELLOW + "T2 Resilient Stone Pickaxe";
		String axe = ChatColor.YELLOW + "T2 Resilient Stone Axe";
		String spade = ChatColor.YELLOW + "T2 Resilient Stone Shovel";
		String hoe = ChatColor.YELLOW + "T2 Resilient Stone Scythe";
		String sword = ChatColor.YELLOW + "T2 Resilient Stone Sword";
		String helmet = ChatColor.YELLOW + "T2 Resilient Stone Helmet";
		String chestplate = ChatColor.YELLOW + "T2 Resilient Stone Chestplate";
		String leggings = ChatColor.YELLOW + "T2 Resilient Stone Leggings";
		String boots = ChatColor.YELLOW + "T2 Resilient Stone Boots";
		String range = ChatColor.YELLOW + "T2 Resilient Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^1 (9) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.BLACKSTONE))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC1p5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.YELLOW + "T3 Metallic Stone Pickaxe";
		String axe = ChatColor.YELLOW + "T3 Metallic Stone Axe";
		String spade = ChatColor.YELLOW + "T3 Metallic Stone Shovel";
		String hoe = ChatColor.YELLOW + "T3 Metallic Stone Scythe";
		String sword = ChatColor.YELLOW + "T3 Metallic Stone Sword";
		String helmet = ChatColor.YELLOW + "T3 Metallic Stone Helmet";
		String chestplate = ChatColor.YELLOW + "T3 Metallic Stone Chestplate";
		String leggings = ChatColor.YELLOW + "T3 Metallic Stone Leggings";
		String boots = ChatColor.YELLOW + "T3 Metallic Stone Boots";
		String range = ChatColor.YELLOW + "T3 Metallic Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^1.5 (27) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.OBSIDIAN))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.GOLD + "T4 Gilded Stone Pickaxe";
		String axe = ChatColor.GOLD + "T4 Gilded Stone Axe";
		String spade = ChatColor.GOLD + "T4 Gilded Stone Shovel";
		String hoe = ChatColor.GOLD + "T4 Gilded Stone Scythe";
		String sword = ChatColor.GOLD + "T4 Gilded Stone Sword";
		String helmet = ChatColor.GOLD + "T4 Gilded Stone Helmet";
		String chestplate = ChatColor.GOLD + "T4 Gilded Stone Chestplate";
		String leggings = ChatColor.GOLD + "T4 Gilded Stone Leggings";
		String boots = ChatColor.GOLD + "T4 Gilded Stone Boots";
		String range = ChatColor.GOLD + "T4 Gilded Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^2 (81) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.GILDED_BLACKSTONE))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2p5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.GOLD + "T5 Shiny Stone Pickaxe";
		String axe = ChatColor.GOLD + "T5 Shiny Stone Axe";
		String spade = ChatColor.GOLD + "T5 Shiny Stone Shovel";
		String hoe = ChatColor.GOLD + "T5 Shiny Stone Scythe";
		String sword = ChatColor.GOLD + "T5 Shiny Stone Sword";
		String helmet = ChatColor.GOLD + "T5 Shiny Stone Helmet";
		String chestplate = ChatColor.GOLD + "T5 Shiny Stone Chestplate";
		String leggings = ChatColor.GOLD + "T5 Shiny Stone Leggings";
		String boots = ChatColor.GOLD + "T5 Shiny Stone Boots";
		String range = ChatColor.GOLD + "T5 Shiny Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^2.5 (243) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.GLOWSTONE))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.DARK_RED + "T6 Blazing Stone Pickaxe";
		String axe = ChatColor.DARK_RED + "T6 Blazing Stone Axe";
		String spade = ChatColor.DARK_RED + "T6 Blazing Stone Shovel";
		String hoe = ChatColor.DARK_RED + "T6 Blazing Stone Scythe";
		String sword = ChatColor.DARK_RED + "T6 Blazing Stone Sword";
		String helmet = ChatColor.DARK_RED + "T6 Blazing Stone Helmet";
		String chestplate = ChatColor.DARK_RED + "T6 Blazing Stone Chestplate";
		String leggings = ChatColor.DARK_RED + "T6 Blazing Stone Leggings";
		String boots = ChatColor.DARK_RED + "T6 Blazing Stone Boots";
		String range = ChatColor.DARK_RED + "T6 Blazing Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^3 (729) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.MAGMA_BLOCK))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3p5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.DARK_RED + "T7 Mystical Stone Pickaxe";
		String axe = ChatColor.DARK_RED + "T7 Mystical Stone Axe";
		String spade = ChatColor.DARK_RED + "T7 Mystical Stone Shovel";
		String hoe = ChatColor.DARK_RED + "T7 Mystical Stone Scythe";
		String sword = ChatColor.DARK_RED + "T7 Mystical Stone Sword";
		String helmet = ChatColor.DARK_RED + "T7 Mystical Stone Helmet";
		String chestplate = ChatColor.DARK_RED + "T7 Mystical Stone Chestplate";
		String leggings = ChatColor.DARK_RED + "T7 Mystical Stone Leggings";
		String boots = ChatColor.DARK_RED + "T7 Mystical Stone Boots";
		String range = ChatColor.DARK_RED + "T7 Mystical Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^3.5 (2,187) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.CRYING_OBSIDIAN))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.RED + "T8 Draconian Stone Pickaxe";
		String axe = ChatColor.RED + "T8 Draconian Stone Axe";
		String spade = ChatColor.RED + "T8 Draconian Stone Shovel";
		String hoe = ChatColor.RED + "T8 Draconian Stone Scythe";
		String sword = ChatColor.RED + "T8 Draconian Stone Sword";
		String helmet = ChatColor.RED + "T8 Draconian Stone Helmet";
		String chestplate = ChatColor.RED + "T8 Draconian Stone Chestplate";
		String leggings = ChatColor.RED + "T8 Draconian Stone Leggings";
		String boots = ChatColor.RED + "T8 Draconian Stone Boots";
		String range = ChatColor.RED + "T8 Draconian Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^4 (6,561) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.ANCIENT_DEBRIS))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4p5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Pickaxe";
		String axe = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Axe";
		String spade = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Shovel";
		String hoe = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Scythe";
		String sword = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Sword";
		String helmet = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Helmet";
		String chestplate = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Chestplate";
		String leggings = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Leggings";
		String boots = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Boots";
		String range = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^4.5 (19,683) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.BEDROCK))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC5ToolRecipe(PrepareItemCraftEvent e) {
		String pick = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Pickaxe";
		String axe = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Axe";
		String spade = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Shovel";
		String hoe = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Scythe";
		String sword = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Sword";
		String helmet = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Helmet";
		String chestplate = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Chestplate";
		String leggings = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Leggings";
		String boots = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Boots";
		String elytra = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "Terminal Stone Wings";
		String range = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Boots";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && ((e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(elytra) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 9^5 (59,049) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.END_PORTAL_FRAME))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
}
