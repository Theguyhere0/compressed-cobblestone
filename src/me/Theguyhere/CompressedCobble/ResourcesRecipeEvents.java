package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

public class ResourcesRecipeEvents implements Listener {
	@EventHandler
	public void restrictCobbleConversion(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 2 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (found)
					e.getInventory().setResult(null);
		}
	}
	
	@EventHandler
	public void restrictC0p5BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC1Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (!item.getType().equals(Material.COBBLESTONE))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
		
	@EventHandler
	public void restrictC1BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC1p5Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BASALT))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.BLACKSTONE))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC1p5BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.OBSIDIAN))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.BLACKSTONE))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2p5Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.OBSIDIAN))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.GILDED_BLACKSTONE))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC2p5BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.GLOWSTONE))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.GILDED_BLACKSTONE))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3p5Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.GLOWSTONE))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.MAGMA_BLOCK))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC3p5BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.CRYING_OBSIDIAN))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.MAGMA_BLOCK))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4p5Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.CRYING_OBSIDIAN))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.ANCIENT_DEBRIS))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC4p5BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC5Recipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BEDROCK))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.ANCIENT_DEBRIS))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictC5BackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCNotRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BEDROCK))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.END_PORTAL_FRAME))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCNotBackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCARecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^12 (531,441) Cobblestone");
		output.add(ChatColor.RED + "" + ChatColor.ITALIC + "Caution!! Item will destroy blocks it touches.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 1 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore1 = new ArrayList<String>();
				lore1.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
				lore1.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				List<String> lore2 = new ArrayList<String>();
				lore2.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
				lore2.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BARRIER))
							if (!item.hasItemMeta() || !lore1.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.END_PORTAL_FRAME))
							if (!item.hasItemMeta() || !lore2.equals(item.getItemMeta().getLore()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCABackRecipe(PrepareItemCraftEvent e) {
		List<String> output = new ArrayList<String>();
		output.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
		output.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 9 && e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getLore().equals(output)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^12 (531,441) Cobblestone");
				lore.add(ChatColor.RED + "" + ChatColor.ITALIC + "Caution!! Item will destroy blocks it touches.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null && item.hasItemMeta())
						if (lore.equals(item.getItemMeta().getLore()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
}
