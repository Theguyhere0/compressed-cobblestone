package me.Theguyhere.CompressedCobble.items;

import java.util.ArrayList;
import java.util.Collection;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import me.Theguyhere.CompressedCobble.Main;

public class ToolArmorRecipeEvents implements Listener {
	private Resources r;
	private Tools t;
	private Armor a;
	
	public ToolArmorRecipeEvents(Resources r, Tools t, Armor a) {
		this.r = r;
		this.t = t;
		this.a = a;
	}
	
	@EventHandler
	public void restrictT0ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean two = false;
			
			if (t.t0s().contains(result) || a.t0s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BLACKSTONE))
							found = true;
						found = vanillaCheck(t.picks(), item, result, two, found, 43);
						found = vanillaCheck(t.axes(), item, result, two, found, 43);
						if (t.spades().contains(type)) {
							Damageable dam = null;
							int d = 0;
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								two = true;
							}
						}
						found = vanillaCheck(t.hoes(), item, result, two, found, 66);
						found = vanillaCheck(t.swords(), item, result, two, found, 66);
						found = vanillaCheck(a.helmets(), item, result, two, found, 11);
						found = vanillaCheck(a.chestplates(), item, result, two, found, 10);
						found = vanillaCheck(a.leggings(), item, result, two, found, 11);
						found = vanillaCheck(a.boots(), item, result, two, found, 16);
						found = standardCheck(Material.BOW, item, result, two, found, 128);
						found = standardCheck(Material.SHIELD, item, result, two, found, 56);
					}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT1ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;
			
			if (t.t1s().contains(result) || a.t1s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t1().getType())) {
							if (!Main.equals(item, r.t1()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						found = itemCheck(item, new ItemStack(Material.STONE_PICKAXE), t.t1Pick(), result, low, found, 43).get(0);
						low = itemCheck(item, new ItemStack(Material.STONE_PICKAXE), t.t1Pick(), result, low, found, 43).get(1);
						found = itemCheck(item, new ItemStack(Material.STONE_AXE), t.t1Axe(), result, low, found, 43).get(0);
						low = itemCheck(item, new ItemStack(Material.STONE_AXE), t.t1Axe(), result, low, found, 43).get(1);
						found = shovelCheck(item, new ItemStack(Material.STONE_SHOVEL), t.t1Spade(), result, low, found).get(0);
						low = shovelCheck(item, new ItemStack(Material.STONE_SHOVEL), t.t1Spade(), result, low, found).get(1);
						found = itemCheck(item, new ItemStack(Material.STONE_HOE), t.t1Hoe(), result, low, found, 66).get(0);
						low = itemCheck(item, new ItemStack(Material.STONE_HOE), t.t1Hoe(), result, low, found, 66).get(1);
						found = itemCheck(item, new ItemStack(Material.STONE_SWORD), t.t1Sword(), result, low, found, 66).get(0);
						low = itemCheck(item, new ItemStack(Material.STONE_SWORD), t.t1Sword(), result, low, found, 66).get(1);
						found = itemCheck(item, new ItemStack(Material.LEATHER_HELMET), a.t1Helmet(), result, low, found, 11).get(0);
						low = itemCheck(item, new ItemStack(Material.LEATHER_HELMET), a.t1Helmet(), result, low, found, 11).get(1);
						found = itemCheck(item, new ItemStack(Material.LEATHER_CHESTPLATE), a.t1Chestplate(), result, low, found, 10).get(0);
						low = itemCheck(item, new ItemStack(Material.LEATHER_CHESTPLATE), a.t1Chestplate(), result, low, found, 10).get(1);
						found = itemCheck(item, new ItemStack(Material.LEATHER_LEGGINGS), a.t1Leggings(), result, low, found, 11).get(0);
						low = itemCheck(item, new ItemStack(Material.LEATHER_LEGGINGS), a.t1Leggings(), result, low, found, 11).get(1);
						found = itemCheck(item, new ItemStack(Material.LEATHER_BOOTS), a.t1Boots(), result, low, found, 16).get(0);
						low = itemCheck(item, new ItemStack(Material.LEATHER_BOOTS), a.t1Boots(), result, low, found, 16).get(1);
						found = itemCheck(item, new ItemStack(Material.BOW), t.t1Range(), result, low, found, 128).get(0);
						low = itemCheck(item, new ItemStack(Material.BOW), t.t1Range(), result, low, found, 128).get(1);
					}
				if (t.t1s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t1s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT2ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;
			
			if (t.t2s().contains(result) || a.t2s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t2().getType())) {
							if (!Main.equals(item, r.t2()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						found = itemCheck(item, t.t1Pick(), t.t2Pick(), result, low, found, 43).get(0);
						found = itemCheck(item, t.t1Axe(), t.t2Axe(), result, low, found, 43).get(0);
						found = shovelCheck(item, t.t1Spade(), t.t2Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t1Hoe(), t.t2Hoe(), result, low, found, 66).get(0);
						found = itemCheck(item, t.t1Sword(), t.t2Sword(), result, low, found, 66).get(0);
						found = itemCheck(item, a.t1Helmet(), a.t2Helmet(), result, low, found, 41).get(0);
						found = itemCheck(item, a.t1Chestplate(), a.t2Chestplate(), result, low, found, 30).get(0);
						found = itemCheck(item, a.t1Leggings(), a.t2Leggings(), result, low, found, 32).get(0);
						found = itemCheck(item, a.t1Boots(), a.t2Boots(), result, low, found, 49).get(0);
						found = itemCheck(item, t.t1Range(), t.t2Range(), result, low, found, 128).get(0);
						low = itemCheck(item, t.t1Pick(), t.t2Pick(), result, low, found, 43).get(1);
						low = itemCheck(item, t.t1Axe(), t.t2Axe(), result, low, found, 43).get(1);
						low = shovelCheck(item, t.t1Spade(), t.t2Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t1Hoe(), t.t2Hoe(), result, low, found, 66).get(1);
						low = itemCheck(item, t.t1Sword(), t.t2Sword(), result, low, found, 66).get(1);
						low = itemCheck(item, a.t1Helmet(), a.t2Helmet(), result, low, found, 41).get(1);
						low = itemCheck(item, a.t1Chestplate(), a.t2Chestplate(), result, low, found, 31).get(1);
						low = itemCheck(item, a.t1Leggings(), a.t2Leggings(), result, low, found, 32).get(1);
						low = itemCheck(item, a.t1Boots(), a.t2Boots(), result, low, found, 49).get(1);
						low = itemCheck(item, t.t1Range(), t.t2Range(), result, low, found, 128).get(1);
					}
				if (t.t2s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t2s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT3ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t3s().contains(result) || a.t3s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t3().getType())) {
							if (!Main.equals(item, r.t3()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						found = itemCheck(item, t.t2Pick(), t.t3Pick(), result, low, found, 83).get(0);
						found = itemCheck(item, t.t2Axe(), t.t3Axe(), result, low, found, 83).get(0);
						found = shovelCheck(item, t.t2Spade(), t.t3Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t2Hoe(), t.t3Hoe(), result, low, found, 125).get(0);
						found = itemCheck(item, t.t2Sword(), t.t3Sword(), result, low, found, 125).get(0);
						found = itemCheck(item, a.t2Helmet(), a.t3Helmet(), result, low, found, 41).get(0);
						found = itemCheck(item, a.t2Chestplate(), a.t3Chestplate(), result, low, found, 30).get(0);
						found = itemCheck(item, a.t2Leggings(), a.t3Leggings(), result, low, found, 32).get(0);
						found = itemCheck(item, a.t2Boots(), a.t3Boots(), result, low, found, 49).get(0);
						found = itemCheck(item, t.t2Range(), t.t3Range(), result, low, found, 128).get(0);
						low = itemCheck(item, t.t2Pick(), t.t3Pick(), result, low, found, 83).get(1);
						low = itemCheck(item, t.t2Axe(), t.t3Axe(), result, low, found, 83).get(1);
						low = shovelCheck(item, t.t2Spade(), t.t3Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t2Hoe(), t.t3Hoe(), result, low, found, 125).get(1);
						low = itemCheck(item, t.t2Sword(), t.t3Sword(), result, low, found, 125).get(1);
						low = itemCheck(item, a.t2Helmet(), a.t3Helmet(), result, low, found, 41).get(1);
						low = itemCheck(item, a.t2Chestplate(), a.t3Chestplate(), result, low, found, 30).get(1);
						low = itemCheck(item, a.t2Leggings(), a.t3Leggings(), result, low, found, 32).get(1);
						low = itemCheck(item, a.t2Boots(), a.t3Boots(), result, low, found, 49).get(1);
						low = itemCheck(item, t.t2Range(), t.t3Range(), result, low, found, 128).get(1);
					}
				if (t.t3s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t3s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT4ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t4s().contains(result) || a.t4s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t4().getType())) {
							if (!Main.equals(item, r.t4()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						found = itemCheck(item, t.t3Pick(), t.t4Pick(), result, low, found, 83).get(0);
						found = itemCheck(item, t.t3Axe(), t.t4Axe(), result, low, found, 83).get(0);
						found = shovelCheck(item, t.t3Spade(), t.t4Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t3Hoe(), t.t4Hoe(), result, low, found, 125).get(0);
						found = itemCheck(item, t.t3Sword(), t.t4Sword(), result, low, found, 125).get(0);
						found = itemCheck(item, a.t3Helmet(), a.t4Helmet(), result, low, found, 41).get(0);
						found = itemCheck(item, a.t3Chestplate(), a.t4Chestplate(), result, low, found, 30).get(0);
						found = itemCheck(item, a.t3Leggings(), a.t4Leggings(), result, low, found, 32).get(0);
						found = itemCheck(item, a.t3Boots(), a.t4Boots(), result, low, found, 49).get(0);
						found = itemCheck(item, t.t3Range(), t.t4Range(), result, low, found, 128).get(0);
						low = itemCheck(item, t.t3Pick(), t.t4Pick(), result, low, found, 83).get(1);
						low = itemCheck(item, t.t3Axe(), t.t4Axe(), result, low, found, 83).get(1);
						low = shovelCheck(item, t.t3Spade(), t.t4Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t3Hoe(), t.t4Hoe(), result, low, found, 125).get(1);
						low = itemCheck(item, t.t3Sword(), t.t4Sword(), result, low, found, 125).get(1);
						low = itemCheck(item, a.t3Helmet(), a.t4Helmet(), result, low, found, 41).get(1);
						low = itemCheck(item, a.t3Chestplate(), a.t4Chestplate(), result, low, found, 30).get(1);
						low = itemCheck(item, a.t3Leggings(), a.t4Leggings(), result, low, found, 32).get(1);
						low = itemCheck(item, a.t3Boots(), a.t4Boots(), result, low, found, 49).get(1);
						low = itemCheck(item, t.t3Range(), t.t4Range(), result, low, found, 128).get(1);
					}
				if (t.t4s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t4s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT5ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t5s().contains(result) || a.t5s().contains(result)) {

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t5().getType())) {
							if (!Main.equals(item, r.t5()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						found = itemCheck(item, t.t4Pick(), t.t5Pick(), result, low, found, 520).get(0);
						found = itemCheck(item, t.t4Axe(), t.t5Axe(), result, low, found, 520).get(0);
						found = shovelCheck(item, t.t4Spade(), t.t5Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t4Hoe(), t.t5Hoe(), result, low, found, 789).get(0);
						found = itemCheck(item, t.t4Sword(), t.t5Sword(), result, low, found, 789).get(0);
						found = itemCheck(item, a.t4Helmet(), a.t5Helmet(), result, low, found, 41).get(0);
						found = itemCheck(item, a.t4Chestplate(), a.t5Chestplate(), result, low, found, 30).get(0);
						found = itemCheck(item, a.t4Leggings(), a.t5Leggings(), result, low, found, 32).get(0);
						found = itemCheck(item, a.t4Boots(), a.t5Boots(), result, low, found, 49).get(0);
						found = itemCheck(item, t.t4Range(), t.t5Range(), result, low, found, 128).get(0);
						found = itemCheck(item, new ItemStack(Material.SHIELD), t.t5Shield(), result, low, found, 56).get(0);
						low = itemCheck(item, t.t4Pick(), t.t5Pick(), result, low, found, 520).get(1);
						low = itemCheck(item, t.t4Axe(), t.t5Axe(), result, low, found, 520).get(1);
						low = shovelCheck(item, t.t4Spade(), t.t5Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t4Hoe(), t.t5Hoe(), result, low, found, 789).get(1);
						low = itemCheck(item, t.t4Sword(), t.t5Sword(), result, low, found, 789).get(1);
						low = itemCheck(item, a.t4Helmet(), a.t5Helmet(), result, low, found, 41).get(1);
						low = itemCheck(item, a.t4Chestplate(), a.t5Chestplate(), result, low, found, 30).get(1);
						low = itemCheck(item, a.t4Leggings(), a.t5Leggings(), result, low, found, 32).get(1);
						low = itemCheck(item, a.t4Boots(), a.t5Boots(), result, low, found, 49).get(1);
						low = itemCheck(item, t.t4Range(), t.t5Range(), result, low, found, 128).get(1);
						low = itemCheck(item, new ItemStack(Material.SHIELD), t.t5Shield(), result, low, found, 56).get(1);
					}
				if (t.t5s().contains(result)) {
					if (low && s == 0)
						if (!result.getType().equals(Material.SHIELD))
							found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t5s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}
	
	@EventHandler
	public void restrictT6ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t6s().contains(result) || a.t6s().contains(result)) {

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t6().getType())) {
							if (!Main.equals(item, r.t6()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						found = itemCheck(item, t.t5Pick(), t.t6Pick(), result, low, found, 520).get(0);
						found = itemCheck(item, t.t5Axe(), t.t6Axe(), result, low, found, 520).get(0);
						found = shovelCheck(item, t.t5Spade(), t.t6Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t5Hoe(), t.t6Hoe(), result, low, found, 789).get(0);
						found = itemCheck(item, t.t5Sword(), t.t6Sword(), result, low, found, 789).get(0);
						found = itemCheck(item, a.t5Helmet(), a.t6Helmet(), result, low, found, 73).get(0);
						found = itemCheck(item, a.t5Chestplate(), a.t6Chestplate(), result, low, found, 66).get(0);
						found = itemCheck(item, a.t5Leggings(), a.t6Leggings(), result, low, found, 71).get(0);
						found = itemCheck(item, a.t5Boots(), a.t6Boots(), result, low, found, 107).get(0);
						found = itemCheck(item, t.t5Range(), t.t6Range(), result, low, found, 128).get(0);
						low = itemCheck(item, t.t5Pick(), t.t6Pick(), result, low, found, 520).get(1);
						low = itemCheck(item, t.t5Axe(), t.t6Axe(), result, low, found, 520).get(1);
						low = shovelCheck(item, t.t5Spade(), t.t6Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t5Hoe(), t.t6Hoe(), result, low, found, 789).get(1);
						low = itemCheck(item, t.t5Sword(), t.t6Sword(), result, low, found, 789).get(1);
						low = itemCheck(item, a.t5Helmet(), a.t6Helmet(), result, low, found, 73).get(1);
						low = itemCheck(item, a.t5Chestplate(), a.t6Chestplate(), result, low, found, 66).get(1);
						low = itemCheck(item, a.t5Leggings(), a.t6Leggings(), result, low, found, 71).get(1);
						low = itemCheck(item, a.t5Boots(), a.t6Boots(), result, low, found, 107).get(1);
						low = itemCheck(item, t.t5Range(), t.t6Range(), result, low, found, 128).get(1);
					}
				if (t.t6s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t6s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}

	@EventHandler
	public void restrictT7ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t7s().contains(result) || a.t7s().contains(result)) {

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t7().getType())) {
							if (!Main.equals(item, r.t7()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						found = itemCheck(item, t.t6Pick(), t.t7Pick(), result, low, found, 677).get(0);
						found = itemCheck(item, t.t6Axe(), t.t7Axe(), result, low, found, 677).get(0);
						found = shovelCheck(item, t.t6Spade(), t.t7Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t6Hoe(), t.t7Hoe(), result, low, found, 1016).get(0);
						found = itemCheck(item, t.t6Sword(), t.t7Sword(), result, low, found, 1016).get(0);
						found = itemCheck(item, a.t6Helmet(), a.t7Helmet(), result, low, found, 73).get(0);
						found = itemCheck(item, a.t6Chestplate(), a.t7Chestplate(), result, low, found, 66).get(0);
						found = itemCheck(item, a.t6Leggings(), a.t7Leggings(), result, low, found, 71).get(0);
						found = itemCheck(item, a.t6Boots(), a.t7Boots(), result, low, found, 107).get(0);
						found = itemCheck(item, t.t6Range(), t.t7Range(), result, low, found, 109).get(0);
						low = itemCheck(item, t.t6Pick(), t.t7Pick(), result, low, found, 677).get(1);
						low = itemCheck(item, t.t6Axe(), t.t7Axe(), result, low, found, 677).get(1);
						low = shovelCheck(item, t.t6Spade(), t.t7Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t6Hoe(), t.t7Hoe(), result, low, found, 1016).get(1);
						low = itemCheck(item, t.t6Sword(), t.t7Sword(), result, low, found, 1016).get(1);
						low = itemCheck(item, a.t6Helmet(), a.t7Helmet(), result, low, found, 73).get(1);
						low = itemCheck(item, a.t6Chestplate(), a.t7Chestplate(), result, low, found, 66).get(1);
						low = itemCheck(item, a.t6Leggings(), a.t7Leggings(), result, low, found, 71).get(1);
						low = itemCheck(item, a.t6Boots(), a.t7Boots(), result, low, found, 107).get(1);
						low = itemCheck(item, t.t6Range(), t.t7Range(), result, low, found, 109).get(1);
					}
				if (t.t7s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t7s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}

	@EventHandler
	public void restrictT8ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t8s().contains(result) || a.t8s().contains(result)) {

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t8().getType())) {
							if (!Main.equals(item, r.t8()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						found = itemCheck(item, t.t7Pick(), t.t8Pick(), result, low, found, 677).get(0);
						found = itemCheck(item, t.t7Axe(), t.t8Axe(), result, low, found, 677).get(0);
						found = shovelCheck(item, t.t7Spade(), t.t8Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t7Hoe(), t.t8Hoe(), result, low, found, 1016).get(0);
						found = itemCheck(item, t.t7Sword(), t.t8Sword(), result, low, found, 1016).get(0);
						found = itemCheck(item, a.t7Helmet(), a.t8Helmet(), result, low, found, 81).get(0);
						found = itemCheck(item, a.t7Chestplate(), a.t8Chestplate(), result, low, found, 74).get(0);
						found = itemCheck(item, a.t7Leggings(), a.t8Leggings(), result, low, found, 79).get(0);
						found = itemCheck(item, a.t7Boots(), a.t8Boots(), result, low, found, 120).get(0);
						found = itemCheck(item, t.t7Range(), t.t8Range(), result, low, found, 109).get(0);
						found = itemCheck(item, t.t5Shield(), t.t8Shield(), result, low, found, 56).get(0);
						low = itemCheck(item, t.t7Pick(), t.t8Pick(), result, low, found, 677).get(1);
						low = itemCheck(item, t.t7Axe(), t.t8Axe(), result, low, found, 677).get(1);
						low = shovelCheck(item, t.t7Spade(), t.t8Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t7Hoe(), t.t8Hoe(), result, low, found, 1016).get(1);
						low = itemCheck(item, t.t7Sword(), t.t8Sword(), result, low, found, 1016).get(1);
						low = itemCheck(item, a.t7Helmet(), a.t8Helmet(), result, low, found, 81).get(1);
						low = itemCheck(item, a.t7Chestplate(), a.t8Chestplate(), result, low, found, 74).get(1);
						low = itemCheck(item, a.t7Leggings(), a.t8Leggings(), result, low, found, 79).get(1);
						low = itemCheck(item, a.t7Boots(), a.t8Boots(), result, low, found, 120).get(1);
						low = itemCheck(item, t.t7Range(), t.t8Range(), result, low, found, 109).get(1);
						low = itemCheck(item, t.t5Shield(), t.t8Shield(), result, low, found, 56).get(1);
					}
				if (t.t8s().contains(result)) {
					if (low && s == 0)
						if (!result.getType().equals(Material.SHIELD))
							found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t8s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}

	@EventHandler
	public void restrictT9ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;
			boolean low = false;
			int c = 0;
			int s = 0;

			if (t.t9s().contains(result) || a.t9s().contains(result)) {

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t9().getType())) {
							if (!Main.equals(item, r.t9()))
								found = true;
							c++;
						}
						if (type.equals(Material.END_ROD))
							s++;
						found = itemCheck(item, t.t8Pick(), t.t9Pick(), result, low, found, 677).get(0);
						found = itemCheck(item, t.t8Axe(), t.t9Axe(), result, low, found, 677).get(0);
						found = shovelCheck(item, t.t8Spade(), t.t9Spade(), result, low, found).get(0);
						found = itemCheck(item, t.t8Hoe(), t.t9Hoe(), result, low, found, 1016).get(0);
						found = itemCheck(item, t.t8Sword(), t.t9Sword(), result, low, found, 1016).get(0);
						found = itemCheck(item, a.t8Helmet(), a.t9Helmet(), result, low, found, 81).get(0);
						found = itemCheck(item, a.t8Chestplate(), a.t9Chestplate(), result, low, found, 74).get(0);
						found = itemCheck(item, a.t8Leggings(), a.t9Leggings(), result, low, found, 79).get(0);
						found = itemCheck(item, a.t8Boots(), a.t9Boots(), result, low, found, 120).get(0);
						found = itemCheck(item, t.t8Range(), t.t9Range(), result, low, found, 83).get(0);
						found = itemCheck(item, new ItemStack(Material.ELYTRA), a.t9Elytra(), result, low, found, 108).get(0);
						low = itemCheck(item, t.t8Pick(), t.t9Pick(), result, low, found, 677).get(1);
						low = itemCheck(item, t.t8Axe(), t.t9Axe(), result, low, found, 677).get(1);
						low = shovelCheck(item, t.t8Spade(), t.t9Spade(), result, low, found).get(1);
						low = itemCheck(item, t.t8Hoe(), t.t9Hoe(), result, low, found, 1016).get(1);
						low = itemCheck(item, t.t8Sword(), t.t9Sword(), result, low, found, 1016).get(1);
						low = itemCheck(item, a.t8Helmet(), a.t9Helmet(), result, low, found, 81).get(1);
						low = itemCheck(item, a.t8Chestplate(), a.t9Chestplate(), result, low, found, 74).get(1);
						low = itemCheck(item, a.t8Leggings(), a.t9Leggings(), result, low, found, 79).get(1);
						low = itemCheck(item, a.t8Boots(), a.t9Boots(), result, low, found, 120).get(1);
						low = itemCheck(item, t.t8Range(), t.t9Range(), result, low, found, 83).get(1);
						low = itemCheck(item, new ItemStack(Material.ELYTRA), a.t9Elytra(), result, low, found, 108).get(1);
					}
				if (t.t9s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (a.t9s().contains(result)) {
					if (low && c == 1)
						found = true;
					if (!low && c != 1)
						found = true;
				}
				if (found)
					e.getInventory().setResult(null);
				else e.getInventory().setResult(result);
			}
		}
	}

	@EventHandler
	public void restrictT10ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;

			if (t.t10s().contains(result) || a.t10s().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.t10().getType()))
							if (!Main.equals(item, r.t10()))
								found = true;
						if (type.equals(Material.NETHERITE_PICKAXE) || type.equals(Material.NETHERITE_AXE) ||
								type.equals(Material.NETHERITE_SHOVEL) || type.equals(Material.NETHERITE_HOE) ||
								type.equals(Material.NETHERITE_SWORD) || type.equals(Material.NETHERITE_HELMET) ||
								type.equals(Material.NETHERITE_CHESTPLATE) || type.equals(Material.NETHERITE_LEGGINGS) ||
								type.equals(Material.NETHERITE_BOOTS) || type.equals(Material.ELYTRA) ||
								type.equals(Material.TRIDENT) || type.equals(Material.SHIELD))
							if (!(Main.equals(item, t.t9Pick()) || Main.equals(item, t.t9Axe()) || Main.equals(item, t.t9Spade()) ||
									Main.equals(item, t.t9Hoe()) || Main.equals(item, t.t9Sword()) || Main.equals(item, a.t9Helmet()) ||
									Main.equals(item, a.t9Chestplate()) || Main.equals(item, a.t9Leggings()) ||
									Main.equals(item, a.t9Boots()) || Main.equals(item, t.t9Range()) || Main.equals(item, a.t9Elytra()) ||
									Main.equals(item, t.t8Shield())))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}

	@EventHandler
	public void restrictNotToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;

			if (a.nots().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.not().getType()))
							if (!Main.equals(item, r.not()))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	@EventHandler
	public void restrictAntiToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			boolean found = false;

			if (a.antis().contains(result)) {
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(r.a().getType()))
							if (!Main.equals(item, r.a()))
								found = true;
						if (type.equals(a.notHelmet().getType()))
							if (!(Main.equals(item, a.notHelmet())))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
	
	private ArrayList<Boolean> itemCheck(ItemStack item, ItemStack lower, ItemStack higher, ItemStack result, boolean low, boolean found, int amount) {
		ItemMeta meta = result.getItemMeta();
		Damageable dam = null;
		Damageable mDam = (Damageable) meta;
		int d = 0;
		ArrayList<Boolean> set = new ArrayList<Boolean>();
		
		if (Main.equals(item, lower)) {
			low = true;
			dam = (Damageable) item.getItemMeta();
			d = dam.getDamage();
			if (d != 0)
				found = true;
		}
		if (Main.equals(item, higher)) {
			dam = (Damageable) item.getItemMeta();
			d = dam.getDamage();
			if (d == 0)
				found = true;
			if (d > amount) {
				d -= amount;
				mDam.setDamage(d);
				result.setItemMeta(meta);
			}
		}
		set.add(found);
		set.add(low);
		return set;
	}
	
	private ArrayList<Boolean> shovelCheck(ItemStack item, ItemStack lower, ItemStack higher, ItemStack result, boolean low, boolean found) {
		Damageable dam = null;
		int d = 0;
		ArrayList<Boolean> set = new ArrayList<Boolean>();
		if (Main.equals(item, lower)) {
			low = true;
			dam = (Damageable) item.getItemMeta();
			d = dam.getDamage();
			if (d != 0)
				found = true;
		}
		if (Main.equals(item, higher)) {
			dam = (Damageable) item.getItemMeta();
			d = dam.getDamage();
			if (d == 0)
				found = true;
		}
		set.add(found);
		set.add(low);
		return set;
	}
	
	private boolean vanillaCheck(Collection<Material> items, ItemStack item, ItemStack result, boolean two, boolean found, int amount) {
		Material type = item.getType();
		ItemMeta meta = result.getItemMeta();
		Damageable dam = null;
		Damageable mDam = (Damageable) meta;
		int d = 0;

		if (items.contains(type)) {
			if (two)
				found = true;
			if (item.getItemMeta().hasLore())
				found = true;
			else {
				dam = (Damageable) item.getItemMeta();
				d = dam.getDamage();
				if (d == 0)
					found = true;
				if (d > amount) {
					d -= amount;
					mDam.setDamage(d);
					result.setItemMeta(meta);
					two = true;
				}
			}
		}
		return found;
	}
	
	private boolean standardCheck(Material check, ItemStack item, ItemStack result, boolean two, boolean found, int amount) {
		Material type = item.getType();
		ItemMeta meta = result.getItemMeta();
		Damageable dam = null;
		Damageable mDam = (Damageable) meta;
		int d = 0;

		if (type.equals(check)) {
			if (two)
				found = true;
			if (item.getItemMeta().hasLore())
				found = true;
			else {
				dam = (Damageable) item.getItemMeta();
				d = dam.getDamage();
				if (d == 0)
					found = true;
				if (d > amount) {
					d -= amount;
					mDam.setDamage(d);
					result.setItemMeta(meta);
					two = true;
				}
			}
		}
		return found;
	}
}
