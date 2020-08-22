package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;

import me.Theguyhere.CompressedCobble.Main;

public class ResourceRecipeEvents implements Listener {
	private Resources r;
	
	public ResourceRecipeEvents (Resources r) {
		this.r = r;
	}
	
	@EventHandler
	public void restrictCobbleConversion(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().getAmount() == 2 && e.getRecipe().getResult().getType().equals(Material.COBBLESTONE)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(item, r.t2()))
							found = true;
				if (found)
					e.getInventory().setResult(null);
		}
	}
	
	@EventHandler
	public void restrictT1BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, new ItemStack(Material.COBBLESTONE), r.t1());
	}
	
	@EventHandler
	public void restrictT2Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t2(), new ItemStack(Material.COBBLESTONE), r.t1());
	}
		
	@EventHandler
	public void restrictT2BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, new ItemStack(Material.COBBLESTONE), r.t2());
	}
	
	@EventHandler
	public void restrictT3Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t3(), r.t1(), r.t2());
	}
	
	@EventHandler
	public void restrictT3BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, r.t2(), r.t3());
	}
	
	@EventHandler
	public void restrictT4Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t4(), r.t3(), r.t2());
	}
	
	@EventHandler
	public void restrictT4BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, r.t2(), r.t4());
	}
	
	@EventHandler
	public void restrictT5Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t5(), r.t3(), r.t4());
	}
	
	@EventHandler
	public void restrictT5BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, r.t4(), r.t5());
	}
	
	@EventHandler
	public void restrictT6Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t6(), r.t5(), r.t4());
	}
	
	@EventHandler
	public void restrictT6BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, r.t4(), r.t6());
	}
	
	@EventHandler
	public void restrictT7Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t7(), r.t5(), r.t6());
	}
	
	@EventHandler
	public void restrictT7BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, r.t6(), r.t7());
	}
	
	@EventHandler
	public void restrictT8Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t8(), r.t7(), r.t6());
	}
	
	@EventHandler
	public void restrictT8BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, r.t6(), r.t8());
	}
	
	@EventHandler
	public void restrictT9Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t9(), r.t7(), r.t8());
	}
	
	@EventHandler
	public void restrictT9BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, r.t8(), r.t9());
	}
	
	@EventHandler
	public void restrictT10Recipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.t10(), r.t9(), r.t8());
	}
	
	@EventHandler
	public void restrictT10BackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, r.t8(), r.t10());
	}
	
	@EventHandler
	public void restrictNotRecipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.not(), r.t9(), r.t10());
	}
	
	@EventHandler
	public void restrictNotBackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 3, r.t10(), r.not());
	}
	
	@EventHandler
	public void restrictAntiRecipe(PrepareItemCraftEvent e) {
		restrictRecipe(e, r.a(), r.not(), r.t10());
	}
	
	@EventHandler
	public void restrictAntiBackRecipe(PrepareItemCraftEvent e) {
		restrictBackRecipe(e, 9, r.t10(), r.a());
	}
	
	private void restrictBackRecipe(PrepareItemCraftEvent e, int amount, ItemStack to, ItemStack from) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();

			if (result.getAmount() == amount && Main.equals(result, to)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (Main.equals(item, from))
							found = true;
				if (!found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	private void restrictRecipe(PrepareItemCraftEvent e, ItemStack to, ItemStack from1, ItemStack from2) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			
			if (result.getAmount() == 1 && Main.equals(result, to)) {
				boolean found = false;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(from1.getType()))
							if (!Main.equals(item, from1))
								found = true;
						if (type.equals(from2.getType()))
							if (!Main.equals(item, from2))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
}
