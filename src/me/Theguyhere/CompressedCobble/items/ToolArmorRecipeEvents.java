package me.Theguyhere.CompressedCobble.items;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import me.Theguyhere.CompressedCobble.Main;

public class ToolArmorRecipeEvents implements Listener {
	@EventHandler
	public void restrictT0ToolArmorRecipe(PrepareItemCraftEvent e) {
		if (e.getRecipe() != null) {
			ItemStack result = e.getRecipe().getResult();
			if (new Tools().t0s().contains(result) || new Armor().t0s().contains(result)) {
				boolean found = false;
				Damageable dam = null;
				int d = 0;
				boolean two = false;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BLACKSTONE))
							found = true;
						else if (new Tools().picks().contains(type) || new Tools().axes().contains(type)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 44 && d != 0)
									return;
								d -= 43;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (new Tools().spades().contains(type)) {
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
						else if (new Tools().hoes().contains(type) || new Tools().swords().contains(type)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 77 && d != 0)
									return;
								d -= 76;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (new Armor().helmets().contains(type) || new Armor().leggings().contains(type)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 12 && d != 0)
									return;
								d -= 11;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (new Armor().chestplates().contains(type)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 11 && d != 0)
									return;
								d -= 10;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (new Armor().boots().contains(type)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 17 && d != 0)
									return;
								d -= 16;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (type.equals(Material.BOW)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 129 && d != 0)
									return;
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
						else if (type.equals(Material.SHIELD)) {
							if (two)
								return;
							if (item.getItemMeta().hasLore())
								found = true;
							else {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d < 57 && d != 0)
									return;
								d -= 56;
								mDam.setDamage(d);
								result.setItemMeta(meta);
								two = true;
							}
						}
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
			if (new Tools().t1s().contains(result) || new Armor().t1s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BASALT)) {
							if (!Main.equals(item, new Resources().t1()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						if (type.equals(Material.STONE_PICKAXE) || type.equals(Material.STONE_AXE)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Tools().t1Pick()) || Main.equals(item, new Tools().t1Axe())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 43) {
									d -= 43;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (type.equals(Material.STONE_SHOVEL)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Tools().t1Spade()) ) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (type.equals(Material.STONE_HOE) || type.equals(Material.STONE_SWORD)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Tools().t1Hoe()) || Main.equals(item, new Tools().t1Sword())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 76) {
									d -= 76;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (type.equals(Material.LEATHER_HELMET) || type.equals(Material.LEATHER_LEGGINGS)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Armor().t1Helmet()) || Main.equals(item, new Armor().t1Leggings())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 11) {
									d -= 11;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (type.equals(Material.LEATHER_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Armor().t1Chestplate())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 10) {
									d -= 10;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (type.equals(Material.LEATHER_BOOTS)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Armor().t1Boots())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 16) {
									d -= 16;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (type.equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Tools().t1Range())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 128) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (new Tools().t1s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t1s().contains(result)) {
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
			if (new Tools().t2s().contains(result) || new Armor().t2s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BLACKSTONE)) {
							if (!Main.equals(item, new Resources().t2()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						if (Main.equals(item, new Tools().t1Pick()) || Main.equals(item, new Tools().t1Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t2Pick()) || Main.equals(item, new Tools().t2Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 43) {
								d -= 43;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t1Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t2Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t1Hoe()) || Main.equals(item, new Tools().t1Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t2Hoe()) || Main.equals(item, new Tools().t2Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 76) {
								d -= 76;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t1Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t2Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 41) {
								d -= 41;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t1Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t2Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 30) {
								d -= 30;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t1Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t2Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 32) {
								d -= 32;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t1Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t2Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 49) {
								d -= 49;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t1Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t2Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 128) {
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t2s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t2s().contains(result)) {
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
			if (new Tools().t3s().contains(result) || new Armor().t3s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.OBSIDIAN)) {
							if (!Main.equals(item, new Resources().t3()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						if (Main.equals(item, new Tools().t2Pick()) || Main.equals(item, new Tools().t2Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t3Pick()) || Main.equals(item, new Tools().t3Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 83) {
								d -= 83;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t2Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t3Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t2Hoe()) || Main.equals(item, new Tools().t2Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t3Hoe()) || Main.equals(item, new Tools().t3Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 125) {
								d -= 125;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t2Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t3Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 41) {
								d -= 41;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t2Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t3Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 30) {
								d -= 30;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t2Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t3Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 32) {
								d -= 32;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t2Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t3Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 49) {
								d -= 49;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t2Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t3Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 128) {
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t3s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t3s().contains(result)) {
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
			if (new Tools().t4s().contains(result) || new Armor().t4s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.GILDED_BLACKSTONE)) {
							if (!Main.equals(item, new Resources().t4()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						if (Main.equals(item, new Tools().t3Pick()) || Main.equals(item, new Tools().t3Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t4Pick()) || Main.equals(item, new Tools().t4Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 83) {
								d -= 83;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t3Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t4Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t3Hoe()) || Main.equals(item, new Tools().t3Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t4Hoe()) || Main.equals(item, new Tools().t4Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 125) {
								d -= 125;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t3Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t4Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 41) {
								d -= 41;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t3Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t4Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 30) {
								d -= 30;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t3Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t4Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 32) {
								d -= 32;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t3Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t4Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 49) {
								d -= 49;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t3Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t4Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 128) {
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t4s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t4s().contains(result)) {
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
			if (new Tools().t5s().contains(result) || new Armor().t5s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.GLOWSTONE)) {
							if (!Main.equals(item, new Resources().t5()))
								found = true;
							c++;
						}
						if (type.equals(Material.STICK))
							s++;
						if (Main.equals(item, new Tools().t4Pick()) || Main.equals(item, new Tools().t4Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t5Pick()) || Main.equals(item, new Tools().t5Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 520) {
								d -= 520;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t4Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t5Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t4Hoe()) || Main.equals(item, new Tools().t4Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t5Hoe()) || Main.equals(item, new Tools().t5Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 789) {
								d -= 789;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t4Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t5Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 41) {
								d -= 41;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t4Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t5Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 30) {
								d -= 30;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t4Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t5Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 32) {
								d -= 32;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t4Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t5Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 49) {
								d -= 49;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t4Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t5Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 128) {
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (type.equals(Material.SHIELD)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Tools().t5Shield())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 56) {
									d -= 56;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (new Tools().t5s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t5s().contains(result)) {
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
			if (new Tools().t6s().contains(result) || new Armor().t6s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.MAGMA_BLOCK)) {
							if (!Main.equals(item, new Resources().t6()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						if (Main.equals(item, new Tools().t5Pick()) || Main.equals(item, new Tools().t5Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t6Pick()) || Main.equals(item, new Tools().t6Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 520) {
								d -= 520;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t5Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t6Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t5Hoe()) || Main.equals(item, new Tools().t5Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t6Hoe()) || Main.equals(item, new Tools().t6Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 789) {
								d -= 789;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t5Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t6Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 73) {
								d -= 73;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t5Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t6Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 66) {
								d -= 66;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t5Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t6Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 71) {
								d -= 71;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t5Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t6Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 107) {
								d -= 107;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t5Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t6Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 128) {
								d -= 128;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t6s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t6s().contains(result)) {
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
			if (new Tools().t7s().contains(result) || new Armor().t7s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.CRYING_OBSIDIAN)) {
							if (!Main.equals(item, new Resources().t7()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						if (Main.equals(item, new Tools().t6Pick()) || Main.equals(item, new Tools().t6Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t7Pick()) || Main.equals(item, new Tools().t7Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 677) {
								d -= 677;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t6Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t7Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t6Hoe()) || Main.equals(item, new Tools().t6Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t7Hoe()) || Main.equals(item, new Tools().t7Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 1016) {
								d -= 1016;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t6Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t7Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 73) {
								d -= 73;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t6Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t7Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 66) {
								d -= 66;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t6Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t7Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 71) {
								d -= 71;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t6Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t7Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 107) {
								d -= 107;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t6Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t7Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 109) {
								d -= 109;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t7s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t7s().contains(result)) {
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
			if (new Tools().t8s().contains(result) || new Armor().t8s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.ANCIENT_DEBRIS)) {
							if (!Main.equals(item, new Resources().t8()))
								found = true;
							c++;
						}
						if (type.equals(Material.BLAZE_ROD))
							s++;
						if (Main.equals(item, new Tools().t7Pick()) || Main.equals(item, new Tools().t7Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Pick()) || Main.equals(item, new Tools().t8Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 677) {
								d -= 677;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t7Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t7Hoe()) || Main.equals(item, new Tools().t7Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Hoe()) || Main.equals(item, new Tools().t8Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 1016) {
								d -= 1016;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t7Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t8Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 81) {
								d -= 81;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t7Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t8Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 74) {
								d -= 74;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t7Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t8Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 79) {
								d -= 79;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t7Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t8Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 120) {
								d -= 120;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t7Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 109) {
								d -= 109;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t5Shield())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Shield())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 56) {
								d -= 56;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
					}
				if (new Tools().t8s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t8s().contains(result)) {
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
			if (new Tools().t9s().contains(result) || new Armor().t9s().contains(result)) {
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BEDROCK)) {
							if (!Main.equals(item, new Resources().t9()))
								found = true;
							c++;
						}
						if (type.equals(Material.END_ROD))
							s++;
						if (Main.equals(item, new Tools().t8Pick()) || Main.equals(item, new Tools().t8Axe())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t9Pick()) || Main.equals(item, new Tools().t9Axe())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 677) {
								d -= 677;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t8Spade())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t9Spade())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t8Hoe()) || Main.equals(item, new Tools().t8Sword())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t9Hoe()) || Main.equals(item, new Tools().t9Sword())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 1016) {
								d -= 1016;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t8Helmet())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t9Helmet())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 81) {
								d -= 81;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t8Chestplate())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t9Chestplate())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 74) {
								d -= 74;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t8Leggings())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t9Leggings())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 79) {
								d -= 79;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Armor().t8Boots())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Armor().t9Boots())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 120) {
								d -= 120;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (Main.equals(item, new Tools().t8Range())) {
							low = true;
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d != 0)
								found = true;
						}
						if (Main.equals(item, new Tools().t9Range())) {
							dam = (Damageable) item.getItemMeta();
							d = dam.getDamage();
							if (d == 0)
								found = true;
							if (d > 83) {
								d -= 83;
								mDam.setDamage(d);
								result.setItemMeta(meta);
							}
						}
						if (type.equals(Material.ELYTRA)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (Main.equals(item, new Armor().t9Elytra())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 108) {
									d -= 108;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (new Tools().t9s().contains(result)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (new Armor().t9s().contains(result)) {
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
			if (new Tools().t10s().contains(result) || new Armor().t10s().contains(result)) {
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.END_PORTAL_FRAME))
							if (!Main.equals(item, new Resources().t10()))
								found = true;
						if (type.equals(Material.NETHERITE_PICKAXE) || type.equals(Material.NETHERITE_AXE) ||
								type.equals(Material.NETHERITE_SHOVEL) || type.equals(Material.NETHERITE_HOE) ||
								type.equals(Material.NETHERITE_SWORD) || type.equals(Material.NETHERITE_HELMET) ||
								type.equals(Material.NETHERITE_CHESTPLATE) || type.equals(Material.NETHERITE_LEGGINGS) ||
								type.equals(Material.NETHERITE_BOOTS) || type.equals(Material.ELYTRA) ||
								type.equals(Material.TRIDENT) || type.equals(Material.SHIELD))
							if (!(Main.equals(item, new Tools().t9Pick()) || Main.equals(item, new Tools().t9Axe()) || Main.equals(item, new Tools().t9Spade()) ||
									Main.equals(item, new Tools().t9Hoe()) || Main.equals(item, new Tools().t9Sword()) || Main.equals(item, new Armor().t9Helmet()) ||
									Main.equals(item, new Armor().t9Chestplate()) || Main.equals(item, new Armor().t9Leggings()) ||
									Main.equals(item, new Armor().t9Boots()) || Main.equals(item, new Tools().t9Range()) || Main.equals(item, new Armor().t9Elytra()) ||
									Main.equals(item, new Tools().t8Shield())))
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
			if (new Armor().nots().contains(result)) {
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.BARRIER))
							if (!Main.equals(item, new Resources().not()))
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
			if (new Armor().antis().contains(result)) {
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						Material type = item.getType();
						if (type.equals(Material.COMMAND_BLOCK))
							if (!Main.equals(item, new Resources().a()))
								found = true;
						if (type.equals(Material.GOLDEN_HELMET))
							if (!(Main.equals(item, new Armor().aHelmet())))
								found = true;
					}
				if (found)
					e.getInventory().setResult(null);
			}
		}
	}
}
