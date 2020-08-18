package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import me.Theguyhere.CompressedCobble.Main;

public class ResourceRecipeEvents implements Listener {
	@EventHandler
	public void restrictCobbleConversion(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 2 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(item, new Resources().t2()))
							found = true;
				if (found)
					e.getInventory().setResult(null);
		}
	}
	
	@EventHandler
	public void restrictT1BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 3 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(item, new Resources().t1()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictT2Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t2())) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (!item.getType().equals(Material.COBBLESTONE))
							if (!Main.equals(item, new Resources().t1()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
		
	@EventHandler
	public void restrictT2BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 9 && result.getType().equals(Material.COBBLESTONE)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t2()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT3Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t3())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BASALT))
							if (!Main.equals(result, new Resources().t1()))
								found = true;
						if (type.equals(Material.BLACKSTONE))
							if (!Main.equals(result, new Resources().t2()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT3BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 3 && Main.equals(result, new Resources().t2())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t3()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT4Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t4())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.OBSIDIAN))
							if (!Main.equals(result, new Resources().t3()))
								found = true;
						if (type.equals(Material.BLACKSTONE))
							if (!Main.equals(result, new Resources().t2()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT4BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 9 && Main.equals(result, new Resources().t2())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t4()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT5Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t5())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.OBSIDIAN))
							if (!Main.equals(result, new Resources().t3()))
								found = true;
						if (type.equals(Material.GILDED_BLACKSTONE))
							if (!Main.equals(result, new Resources().t4()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT5BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 3 && Main.equals(result, new Resources().t4())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t5()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT6Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t6())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.GLOWSTONE))
							if (!Main.equals(result, new Resources().t5()))
								found = true;
						if (type.equals(Material.GILDED_BLACKSTONE))
							if (!Main.equals(result, new Resources().t4()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT6BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 9 && Main.equals(result, new Resources().t4())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t6()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT7Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t7())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.GLOWSTONE))
							if (!Main.equals(result, new Resources().t5()))
								found = true;
						if (type.equals(Material.MAGMA_BLOCK))
							if (!Main.equals(result, new Resources().t6()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT7BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 3 && Main.equals(result, new Resources().t6())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t7()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT8Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t8())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.CRYING_OBSIDIAN))
							if (!Main.equals(result, new Resources().t7()))
								found = true;
						if (type.equals(Material.MAGMA_BLOCK))
							if (!Main.equals(result, new Resources().t6()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT8BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 9 && Main.equals(result, new Resources().t6())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t8()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT9Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 1 && Main.equals(result, new Resources().t9())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.CRYING_OBSIDIAN))
							if (!Main.equals(result, new Resources().t7()))
								found = true;
						if (type.equals(Material.ANCIENT_DEBRIS))
							if (!Main.equals(result, new Resources().t8()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT9BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 3 && Main.equals(result, new Resources().t8())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t9()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT10Recipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 1 && Main.equals(result, new Resources().t10())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BEDROCK))
							if (!Main.equals(result, new Resources().t9()))
								found = true;
						if (type.equals(Material.ANCIENT_DEBRIS))
							if (!Main.equals(result, new Resources().t8()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictT10BackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 9 && Main.equals(result, new Resources().t8())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().t10()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictNotRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 1 && Main.equals(result, new Resources().not())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BEDROCK))
							if (!Main.equals(result, new Resources().t9()))
								found = true;
						if (type.equals(Material.END_PORTAL_FRAME))
							if (!Main.equals(result, new Resources().t10()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictNotBackRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 3 && Main.equals(result, new Resources().t10())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().not()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictAntiRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 1 && Main.equals(result, new Resources().a())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BARRIER))
							if (!Main.equals(result, new Resources().not()))
								found = true;
						if (type.equals(Material.END_PORTAL_FRAME))
							if (!Main.equals(result, new Resources().t10()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictAntiBackRecipe(PrepareItemCraftEvent e) {		
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == 9 && Main.equals(result, new Resources().t10())) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(result, new Resources().a()))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
}
