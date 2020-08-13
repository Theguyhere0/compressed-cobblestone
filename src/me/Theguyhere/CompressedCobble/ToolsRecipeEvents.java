package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import me.Theguyhere.CompressedCobble.items.Tools;

public class ToolsRecipeEvents implements Listener {
	@EventHandler
	public void restrictC0ToolRecipe(PrepareItemCraftEvent e) {
		ItemStack pick = new ItemStack(Material.STONE_PICKAXE);
		ItemStack axe = new ItemStack(Material.STONE_AXE);
		ItemStack spade = new ItemStack(Material.STONE_SHOVEL);
		ItemStack hoe = new ItemStack(Material.STONE_HOE);
		ItemStack sword = new ItemStack(Material.STONE_SWORD);
		ItemStack helmet = new ItemStack(Material.LEATHER_HELMET);
		ItemStack chestplate = new ItemStack(Material.LEATHER_CHESTPLATE);
		ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS);
		ItemStack boots = new ItemStack(Material.LEATHER_BOOTS);
		ItemStack range = new ItemStack(Material.BOW);
		ItemStack shield = new ItemStack(Material.SHIELD);

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().equals(pick) || e.getRecipe().getResult().equals(axe) || e.getRecipe().getResult().equals(spade) ||
					e.getRecipe().getResult().equals(hoe) || e.getRecipe().getResult().equals(sword) || e.getRecipe().getResult().equals(helmet) ||
					e.getRecipe().getResult().equals(chestplate) || e.getRecipe().getResult().equals(leggings) || e.getRecipe().getResult().equals(boots) ||
					e.getRecipe().getResult().equals(range)) {
				boolean found = false;
				Damageable dam = null;
				int d = 0;
				boolean two = false;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BLACKSTONE))
							found = true;
						else if (item.getType().equals(pick.getType()) || item.getType().equals(axe.getType())) {
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
						else if (item.getType().equals(spade.getType())) {
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
						else if (item.getType().equals(hoe.getType()) || item.getType().equals(sword.getType())) {
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
						else if (item.getType().equals(helmet.getType()) || item.getType().equals(leggings.getType())) {
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
						else if (item.getType().equals(chestplate.getType())) {
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
						else if (item.getType().equals(boots.getType())) {
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
						else if (item.getType().equals(range.getType())) {
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
						else if (item.getType().equals(shield.getType())) {
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
		String range = ChatColor.WHITE + "T1 Durable Stone Bow";

		ItemStack highPick = new Tools().c0p5Pick();
		ItemStack highAxe = new Tools().c0p5Axe();
		ItemStack highSpade = new Tools().c0p5Spade();
		ItemStack highHoe = new Tools().c0p5Hoe();
		ItemStack highSword = new Tools().c0p5Sword();
		ItemStack highHelmet = new Tools().c0p5Helmet();
		ItemStack highChestplate = new Tools().c0p5Chestplate();
		ItemStack highLeggings = new Tools().c0p5Leggings();
		ItemStack highBoots = new Tools().c0p5Boots();
		ItemStack highRange = new Tools().c0p5Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;
				
				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BASALT)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.STICK))
							s++;
						if (item.getType().equals(Material.STONE_PICKAXE) || item.getType().equals(Material.STONE_AXE)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
						if (item.getType().equals(Material.STONE_SHOVEL)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.STONE_HOE) || item.getType().equals(Material.STONE_SWORD)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 77) {
									d -= 76;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_HELMET) || item.getType().equals(Material.LEATHER_LEGGINGS)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 12) {
									d -= 11;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 11) {
									d -= 10;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_BOOTS)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 17) {
									d -= 16;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.STONE_PICKAXE) || result.getType().equals(Material.STONE_AXE) ||
						result.getType().equals(Material.STONE_SHOVEL) || result.getType().equals(Material.STONE_HOE) ||
						result.getType().equals(Material.STONE_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.LEATHER_HELMET) || result.getType().equals(Material.LEATHER_CHESTPLATE) ||
						result.getType().equals(Material.LEATHER_LEGGINGS) || result.getType().equals(Material.LEATHER_BOOTS)) {
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
		String range = ChatColor.YELLOW + "T2 Resilient Stone Bow";
		
		ItemStack lowPick = new Tools().c0p5Pick();
		ItemStack highPick = new Tools().c1Pick();
		ItemStack lowAxe = new Tools().c0p5Axe();
		ItemStack highAxe = new Tools().c1Axe();
		ItemStack lowSpade = new Tools().c0p5Spade();
		ItemStack highSpade = new Tools().c1Spade();
		ItemStack lowHoe = new Tools().c0p5Hoe();
		ItemStack highHoe = new Tools().c1Hoe();
		ItemStack lowSword = new Tools().c0p5Sword();
		ItemStack highSword = new Tools().c1Sword();
		ItemStack lowHelmet = new Tools().c0p5Helmet();
		ItemStack highHelmet = new Tools().c1Helmet();
		ItemStack lowChestplate = new Tools().c0p5Chestplate();
		ItemStack highChestplate = new Tools().c1Chestplate();
		ItemStack lowLeggings = new Tools().c0p5Leggings();
		ItemStack highLeggings = new Tools().c1Leggings();
		ItemStack lowBoots = new Tools().c0p5Boots();
		ItemStack highBoots = new Tools().c1Boots();
		ItemStack lowRange = new Tools().c0p5Range();
		ItemStack highRange = new Tools().c1Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BLACKSTONE)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.STICK))
							s++;
						if (item.getType().equals(Material.STONE_PICKAXE) || item.getType().equals(Material.STONE_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
						if (item.getType().equals(Material.STONE_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.STONE_HOE) || item.getType().equals(Material.STONE_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 77) {
									d -= 76;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_HELMET) || item.getType().equals(Material.CHAINMAIL_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 42) {
									d -= 41;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_CHESTPLATE) || item.getType().equals(Material.CHAINMAIL_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 31) {
									d -= 30;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_LEGGINGS) || item.getType().equals(Material.CHAINMAIL_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 33) {
									d -= 32;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.LEATHER_BOOTS) || item.getType().equals(Material.CHAINMAIL_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 50) {
									d -= 49;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.STONE_PICKAXE) || result.getType().equals(Material.STONE_AXE) ||
						result.getType().equals(Material.STONE_SHOVEL) || result.getType().equals(Material.STONE_HOE) ||
						result.getType().equals(Material.STONE_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.CHAINMAIL_HELMET) || result.getType().equals(Material.CHAINMAIL_CHESTPLATE) ||
						result.getType().equals(Material.CHAINMAIL_LEGGINGS) || result.getType().equals(Material.CHAINMAIL_BOOTS)) {
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
		String range = ChatColor.YELLOW + "T3 Metallic Stone Bow";

		ItemStack lowPick = new Tools().c1Pick();
		ItemStack highPick = new Tools().c1p5Pick();
		ItemStack lowAxe = new Tools().c1Axe();
		ItemStack highAxe = new Tools().c1p5Axe();
		ItemStack lowSpade = new Tools().c1Spade();
		ItemStack highSpade = new Tools().c1p5Spade();
		ItemStack lowHoe = new Tools().c1Hoe();
		ItemStack highHoe = new Tools().c1p5Hoe();
		ItemStack lowSword = new Tools().c1Sword();
		ItemStack highSword = new Tools().c1p5Sword();
		ItemStack lowHelmet = new Tools().c1Helmet();
		ItemStack highHelmet = new Tools().c1p5Helmet();
		ItemStack lowChestplate = new Tools().c1Chestplate();
		ItemStack highChestplate = new Tools().c1p5Chestplate();
		ItemStack lowLeggings = new Tools().c1Leggings();
		ItemStack highLeggings = new Tools().c1p5Leggings();
		ItemStack lowBoots = new Tools().c1Boots();
		ItemStack highBoots = new Tools().c1p5Boots();
		ItemStack lowRange = new Tools().c1Range();
		ItemStack highRange = new Tools().c1p5Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.OBSIDIAN)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.STICK))
							s++;
						if (item.getType().equals(Material.STONE_PICKAXE) || item.getType().equals(Material.IRON_PICKAXE) ||
								item.getType().equals(Material.STONE_AXE) || item.getType().equals(Material.IRON_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.STONE_SHOVEL) || item.getType().equals(Material.IRON_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.STONE_HOE) || item.getType().equals(Material.STONE_SWORD) ||
								item.getType().equals(Material.IRON_HOE) || item.getType().equals(Material.IRON_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 126) {
									d -= 125;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CHAINMAIL_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 42) {
									d -= 41;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CHAINMAIL_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 31) {
									d -= 30;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CHAINMAIL_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 33) {
									d -= 32;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CHAINMAIL_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 50) {
									d -= 49;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.IRON_PICKAXE) || result.getType().equals(Material.IRON_AXE) ||
						result.getType().equals(Material.IRON_SHOVEL) || result.getType().equals(Material.IRON_HOE) ||
						result.getType().equals(Material.IRON_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.CHAINMAIL_HELMET) || result.getType().equals(Material.CHAINMAIL_CHESTPLATE) ||
						result.getType().equals(Material.CHAINMAIL_LEGGINGS) || result.getType().equals(Material.CHAINMAIL_BOOTS)) {
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
		String range = ChatColor.GOLD + "T4 Gilded Stone Bow";

		ItemStack lowPick = new Tools().c1p5Pick();
		ItemStack highPick = new Tools().c2Pick();
		ItemStack lowAxe = new Tools().c1p5Axe();
		ItemStack highAxe = new Tools().c2Axe();
		ItemStack lowSpade = new Tools().c1p5Spade();
		ItemStack highSpade = new Tools().c2Spade();
		ItemStack lowHoe = new Tools().c1p5Hoe();
		ItemStack highHoe = new Tools().c2Hoe();
		ItemStack lowSword = new Tools().c1p5Sword();
		ItemStack highSword = new Tools().c2Sword();
		ItemStack lowHelmet = new Tools().c1p5Helmet();
		ItemStack highHelmet = new Tools().c2Helmet();
		ItemStack lowChestplate = new Tools().c1p5Chestplate();
		ItemStack highChestplate = new Tools().c2Chestplate();
		ItemStack lowLeggings = new Tools().c1p5Leggings();
		ItemStack highLeggings = new Tools().c2Leggings();
		ItemStack lowBoots = new Tools().c1p5Boots();
		ItemStack highBoots = new Tools().c2Boots();
		ItemStack lowRange = new Tools().c1p5Range();
		ItemStack highRange = new Tools().c2Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.GILDED_BLACKSTONE)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.STICK))
							s++;
						if (item.getType().equals(Material.IRON_PICKAXE) || item.getType().equals(Material.IRON_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.IRON_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_HOE) || item.getType().equals(Material.IRON_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 126) {
									d -= 125;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_HELMET) || item.getType().equals(Material.CHAINMAIL_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 42) {
									d -= 41;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_CHESTPLATE) || item.getType().equals(Material.CHAINMAIL_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 31) {
									d -= 30;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_LEGGINGS) || item.getType().equals(Material.CHAINMAIL_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 33) {
									d -= 32;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_BOOTS) || item.getType().equals(Material.CHAINMAIL_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 50) {
									d -= 49;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.IRON_PICKAXE) || result.getType().equals(Material.IRON_AXE) ||
						result.getType().equals(Material.IRON_SHOVEL) || result.getType().equals(Material.IRON_HOE) ||
						result.getType().equals(Material.IRON_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.IRON_HELMET) || result.getType().equals(Material.IRON_CHESTPLATE) ||
						result.getType().equals(Material.IRON_LEGGINGS) || result.getType().equals(Material.IRON_BOOTS)) {
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
		String range = ChatColor.GOLD + "T5 Shiny Stone Bow";
		String shield = ChatColor.GOLD + "T5 Shiny Stone Shield";

		ItemStack lowPick = new Tools().c2Pick();
		ItemStack highPick = new Tools().c2p5Pick();
		ItemStack lowAxe = new Tools().c2Axe();
		ItemStack highAxe = new Tools().c2p5Axe();
		ItemStack lowSpade = new Tools().c2Spade();
		ItemStack highSpade = new Tools().c2p5Spade();
		ItemStack lowHoe = new Tools().c2Hoe();
		ItemStack highHoe = new Tools().c2p5Hoe();
		ItemStack lowSword = new Tools().c2Sword();
		ItemStack highSword = new Tools().c2p5Sword();
		ItemStack lowHelmet = new Tools().c2Helmet();
		ItemStack highHelmet = new Tools().c2p5Helmet();
		ItemStack lowChestplate = new Tools().c2Chestplate();
		ItemStack highChestplate = new Tools().c2p5Chestplate();
		ItemStack lowLeggings = new Tools().c2Leggings();
		ItemStack highLeggings = new Tools().c2p5Leggings();
		ItemStack lowBoots = new Tools().c2Boots();
		ItemStack highBoots = new Tools().c2p5Boots();
		ItemStack lowRange = new Tools().c2Range();
		ItemStack highRange = new Tools().c2p5Range();
		ItemStack highShield = new Tools().c2p5Shield();

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
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(shield))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.GLOWSTONE)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.STICK))
							s++;
						if (item.getType().equals(Material.DIAMOND_PICKAXE) || item.getType().equals(Material.IRON_PICKAXE) ||
								item.getType().equals(Material.DIAMOND_AXE) || item.getType().equals(Material.IRON_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_SHOVEL) || item.getType().equals(Material.IRON_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_HOE) || item.getType().equals(Material.DIAMOND_SWORD) ||
								item.getType().equals(Material.IRON_HOE) || item.getType().equals(Material.IRON_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 790) {
									d -= 789;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 42) {
									d -= 41;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 31) {
									d -= 30;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 33) {
									d -= 32;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 50) {
									d -= 49;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.SHIELD)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highShield.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 57) {
									d -= 56;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
								System.out.print(d);
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.DIAMOND_PICKAXE) || result.getType().equals(Material.DIAMOND_AXE) ||
						result.getType().equals(Material.DIAMOND_SHOVEL) || result.getType().equals(Material.DIAMOND_HOE) ||
						result.getType().equals(Material.DIAMOND_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.IRON_HELMET) || result.getType().equals(Material.IRON_CHESTPLATE) ||
						result.getType().equals(Material.IRON_LEGGINGS) || result.getType().equals(Material.IRON_BOOTS) ||
						result.getType().equals(Material.SHIELD)) {
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
		String range = ChatColor.DARK_RED + "T6 Blazing Stone Bow";

		ItemStack lowPick = new Tools().c2p5Pick();
		ItemStack highPick = new Tools().c3Pick();
		ItemStack lowAxe = new Tools().c2p5Axe();
		ItemStack highAxe = new Tools().c3Axe();
		ItemStack lowSpade = new Tools().c2p5Spade();
		ItemStack highSpade = new Tools().c3Spade();
		ItemStack lowHoe = new Tools().c2p5Hoe();
		ItemStack highHoe = new Tools().c3Hoe();
		ItemStack lowSword = new Tools().c2p5Sword();
		ItemStack highSword = new Tools().c3Sword();
		ItemStack lowHelmet = new Tools().c2p5Helmet();
		ItemStack highHelmet = new Tools().c3Helmet();
		ItemStack lowChestplate = new Tools().c2p5Chestplate();
		ItemStack highChestplate = new Tools().c3Chestplate();
		ItemStack lowLeggings = new Tools().c2p5Leggings();
		ItemStack highLeggings = new Tools().c3Leggings();
		ItemStack lowBoots = new Tools().c2p5Boots();
		ItemStack highBoots = new Tools().c3Boots();
		ItemStack lowRange = new Tools().c2p5Range();
		ItemStack highRange = new Tools().c3Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.MAGMA_BLOCK)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.BLAZE_ROD))
							s++;
						if (item.getType().equals(Material.DIAMOND_PICKAXE) || item.getType().equals(Material.DIAMOND_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_HOE) || item.getType().equals(Material.DIAMOND_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 790) {
									d -= 789;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_HELMET) || item.getType().equals(Material.DIAMOND_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 74) {
									d -= 73;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_CHESTPLATE) || item.getType().equals(Material.DIAMOND_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 67) {
									d -= 66;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_LEGGINGS) || item.getType().equals(Material.DIAMOND_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 72) {
									d -= 71;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.IRON_BOOTS) || item.getType().equals(Material.DIAMOND_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 108) {
									d -= 107;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 129) {
									d -= 128;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.DIAMOND_PICKAXE) || result.getType().equals(Material.DIAMOND_AXE) ||
						result.getType().equals(Material.DIAMOND_SHOVEL) || result.getType().equals(Material.DIAMOND_HOE) ||
						result.getType().equals(Material.DIAMOND_SWORD) || result.getType().equals(Material.BOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.DIAMOND_HELMET) || result.getType().equals(Material.DIAMOND_CHESTPLATE) ||
						result.getType().equals(Material.DIAMOND_LEGGINGS) || result.getType().equals(Material.DIAMOND_BOOTS)) {
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
		String range = ChatColor.DARK_RED + "T7 Mystical Stone Crossbow";

		ItemStack lowPick = new Tools().c3Pick();
		ItemStack highPick = new Tools().c3p5Pick();
		ItemStack lowAxe = new Tools().c3Axe();
		ItemStack highAxe = new Tools().c3p5Axe();
		ItemStack lowSpade = new Tools().c3Spade();
		ItemStack highSpade = new Tools().c3p5Spade();
		ItemStack lowHoe = new Tools().c3Hoe();
		ItemStack highHoe = new Tools().c3p5Hoe();
		ItemStack lowSword = new Tools().c3Sword();
		ItemStack highSword = new Tools().c3p5Sword();
		ItemStack lowHelmet = new Tools().c3Helmet();
		ItemStack highHelmet = new Tools().c3p5Helmet();
		ItemStack lowChestplate = new Tools().c3Chestplate();
		ItemStack highChestplate = new Tools().c3p5Chestplate();
		ItemStack lowLeggings = new Tools().c3Leggings();
		ItemStack highLeggings = new Tools().c3p5Leggings();
		ItemStack lowBoots = new Tools().c3Boots();
		ItemStack highBoots = new Tools().c3p5Boots();
		ItemStack lowRange = new Tools().c3Range();
		ItemStack highRange = new Tools().c3p5Range();

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
				lore.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.CRYING_OBSIDIAN)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.BLAZE_ROD))
							s++;
						if (item.getType().equals(Material.DIAMOND_PICKAXE) || item.getType().equals(Material.NETHERITE_PICKAXE) ||
								item.getType().equals(Material.DIAMOND_AXE) || item.getType().equals(Material.NETHERITE_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_SHOVEL) || item.getType().equals(Material.NETHERITE_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_HOE) || item.getType().equals(Material.DIAMOND_SWORD) ||
								item.getType().equals(Material.NETHERITE_HOE) || item.getType().equals(Material.NETHERITE_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 1017) {
									d -= 1016;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 74) {
									d -= 73;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 67) {
									d -= 66;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 72) {
									d -= 71;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.DIAMOND_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 108) {
									d -= 107;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.BOW) || item.getType().equals(Material.CROSSBOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 110) {
									d -= 109;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.NETHERITE_PICKAXE) || result.getType().equals(Material.NETHERITE_AXE) ||
						result.getType().equals(Material.NETHERITE_SHOVEL) || result.getType().equals(Material.NETHERITE_HOE) ||
						result.getType().equals(Material.NETHERITE_SWORD) || result.getType().equals(Material.CROSSBOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.DIAMOND_HELMET) || result.getType().equals(Material.DIAMOND_CHESTPLATE) ||
						result.getType().equals(Material.DIAMOND_LEGGINGS) || result.getType().equals(Material.DIAMOND_BOOTS)) {
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
		String range = ChatColor.RED + "T8 Draconian Stone Crossbow";
		String shield = ChatColor.RED + "T8 Draconian Stone Shield";

		ItemStack lowPick = new Tools().c3p5Pick();
		ItemStack highPick = new Tools().c4Pick();
		ItemStack lowAxe = new Tools().c3p5Axe();
		ItemStack highAxe = new Tools().c4Axe();
		ItemStack lowSpade = new Tools().c3p5Spade();
		ItemStack highSpade = new Tools().c4Spade();
		ItemStack lowHoe = new Tools().c3p5Hoe();
		ItemStack highHoe = new Tools().c4Hoe();
		ItemStack lowSword = new Tools().c3p5Sword();
		ItemStack highSword = new Tools().c4Sword();
		ItemStack lowHelmet = new Tools().c3p5Helmet();
		ItemStack highHelmet = new Tools().c4Helmet();
		ItemStack lowChestplate = new Tools().c3p5Chestplate();
		ItemStack highChestplate = new Tools().c4Chestplate();
		ItemStack lowLeggings = new Tools().c3p5Leggings();
		ItemStack highLeggings = new Tools().c4Leggings();
		ItemStack lowBoots = new Tools().c3p5Boots();
		ItemStack highBoots = new Tools().c4Boots();
		ItemStack lowRange = new Tools().c3p5Range();
		ItemStack highRange = new Tools().c4Range();
		ItemStack lowShield = new Tools().c2p5Shield();
		ItemStack highShield = new Tools().c4Shield();

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
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(shield))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.ANCIENT_DEBRIS)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.BLAZE_ROD))
							s++;
						if (item.getType().equals(Material.NETHERITE_PICKAXE) || item.getType().equals(Material.NETHERITE_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_HOE) || item.getType().equals(Material.NETHERITE_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 1017) {
									d -= 1016;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_HELMET) || item.getType().equals(Material.DIAMOND_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 82) {
									d -= 81;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_CHESTPLATE) || item.getType().equals(Material.DIAMOND_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 75) {
									d -= 74;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_LEGGINGS) || item.getType().equals(Material.DIAMOND_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 80) {
									d -= 79;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_BOOTS) || item.getType().equals(Material.DIAMOND_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 121) {
									d -= 120;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CROSSBOW)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 110) {
									d -= 109;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.SHIELD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowShield.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highShield.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 57) {
									d -= 56;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.NETHERITE_PICKAXE) || result.getType().equals(Material.NETHERITE_AXE) ||
						result.getType().equals(Material.NETHERITE_SHOVEL) || result.getType().equals(Material.NETHERITE_HOE) ||
						result.getType().equals(Material.NETHERITE_SWORD) || result.getType().equals(Material.CROSSBOW)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.NETHERITE_HELMET) || result.getType().equals(Material.NETHERITE_CHESTPLATE) ||
						result.getType().equals(Material.NETHERITE_LEGGINGS) || result.getType().equals(Material.NETHERITE_BOOTS) ||
						result.getType().equals(Material.SHIELD)) {
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
		String range = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Trident";
		String elytra = ChatColor.RED + "" + ChatColor.BOLD + "T9 Impossible Stone Elytra";

		ItemStack lowPick = new Tools().c4Pick();
		ItemStack highPick = new Tools().c4p5Pick();
		ItemStack lowAxe = new Tools().c4Axe();
		ItemStack highAxe = new Tools().c4p5Axe();
		ItemStack lowSpade = new Tools().c4Spade();
		ItemStack highSpade = new Tools().c4p5Spade();
		ItemStack lowHoe = new Tools().c4Hoe();
		ItemStack highHoe = new Tools().c4p5Hoe();
		ItemStack lowSword = new Tools().c4Sword();
		ItemStack highSword = new Tools().c4p5Sword();
		ItemStack lowHelmet = new Tools().c4Helmet();
		ItemStack highHelmet = new Tools().c4p5Helmet();
		ItemStack lowChestplate = new Tools().c4Chestplate();
		ItemStack highChestplate = new Tools().c4p5Chestplate();
		ItemStack lowLeggings = new Tools().c4Leggings();
		ItemStack highLeggings = new Tools().c4p5Leggings();
		ItemStack lowBoots = new Tools().c4Boots();
		ItemStack highBoots = new Tools().c4p5Boots();
		ItemStack lowRange = new Tools().c4Range();
		ItemStack highRange = new Tools().c4p5Range();
		ItemStack highElytra = new Tools().c4p5Elytra();

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
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(elytra))) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;
				boolean low = false;
				Damageable dam = null;
				int d = 0;
				int c = 0;
				int s = 0;
				ItemStack result = e.getRecipe().getResult();
				ItemMeta meta = result.getItemMeta();
				Damageable mDam = (Damageable) meta;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.BEDROCK)) {
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
							c++;
						}
						if (item.getType().equals(Material.END_ROD))
							s++;
						if (item.getType().equals(Material.NETHERITE_PICKAXE) || item.getType().equals(Material.NETHERITE_AXE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowPick.getItemMeta()) || item.getItemMeta().equals(lowAxe.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highPick.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highAxe.getItemMeta().getLore())) {
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
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_SHOVEL)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowSpade.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highSpade.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_HOE) || item.getType().equals(Material.NETHERITE_SWORD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHoe.getItemMeta()) || item.getItemMeta().equals(lowSword.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHoe.getItemMeta().getLore()) ||
									item.getItemMeta().getLore().equals(highSword.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 1017) {
									d -= 1016;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowHelmet.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highHelmet.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 82) {
									d -= 81;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_CHESTPLATE)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowChestplate.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highChestplate.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 75) {
									d -= 74;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_LEGGINGS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowLeggings.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highLeggings.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 80) {
									d -= 79;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.NETHERITE_BOOTS)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowBoots.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highBoots.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 121) {
									d -= 120;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.CROSSBOW) || item.getType().equals(Material.TRIDENT)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							else if (item.getItemMeta().equals(lowRange.getItemMeta())) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highRange.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 84) {
									d -= 83;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
						if (item.getType().equals(Material.ELYTRA)) {
							if (!item.getItemMeta().hasLore()) {
								low = true;
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d != 0)
									found = true;
							}
							else if (item.getItemMeta().getLore().equals(highElytra.getItemMeta().getLore())) {
								dam = (Damageable) item.getItemMeta();
								d = dam.getDamage();
								if (d == 0)
									found = true;
								if (d > 109) {
									d -= 108;
									mDam.setDamage(d);
									result.setItemMeta(meta);
								}
							}
							else found = true;
						}
					}
				if (result.getType().equals(Material.NETHERITE_PICKAXE) || result.getType().equals(Material.NETHERITE_AXE) ||
						result.getType().equals(Material.NETHERITE_SHOVEL) || result.getType().equals(Material.NETHERITE_HOE) ||
						result.getType().equals(Material.NETHERITE_SWORD) || result.getType().equals(Material.TRIDENT)) {
					if (low && s == 0)
						found = true;
					if (!low && s != 0)
						found = true;
				}
				if (result.getType().equals(Material.NETHERITE_HELMET) || result.getType().equals(Material.NETHERITE_CHESTPLATE) ||
						result.getType().equals(Material.NETHERITE_LEGGINGS) || result.getType().equals(Material.NETHERITE_BOOTS) ||
						result.getType().equals(Material.ELYTRA)) {
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
		String elytra = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Elytra";
		String range = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Trident";
		String shield = ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD + "T10 Terminal Stone Shield";

		ItemStack p = new Tools().c4p5Pick();
		ItemStack a = new Tools().c4p5Axe();
		ItemStack sp = new Tools().c4p5Spade();
		ItemStack ho = new Tools().c4p5Hoe();
		ItemStack sw = new Tools().c4p5Sword();
		ItemStack he = new Tools().c4p5Helmet();
		ItemStack c = new Tools().c4p5Chestplate();
		ItemStack l = new Tools().c4p5Leggings();
		ItemStack b = new Tools().c4p5Boots();
		ItemStack el = new Tools().c4p5Elytra();
		ItemStack r = new Tools().c4p5Range();
		ItemStack sh = new Tools().c4Shield();

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && (e.getRecipe().getResult().getItemMeta().getDisplayName().equals(pick)) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(axe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(spade) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(hoe) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(sword) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(chestplate) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(leggings) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(boots) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(elytra) ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(range)  ||
					e.getRecipe().getResult().getItemMeta().getDisplayName().equals(shield)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.END_PORTAL_FRAME))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.NETHERITE_PICKAXE) || item.getType().equals(Material.NETHERITE_AXE) ||
								item.getType().equals(Material.NETHERITE_SHOVEL) || item.getType().equals(Material.NETHERITE_HOE) ||
								item.getType().equals(Material.NETHERITE_SWORD) || item.getType().equals(Material.NETHERITE_HELMET) ||
								item.getType().equals(Material.NETHERITE_CHESTPLATE) || item.getType().equals(Material.NETHERITE_LEGGINGS) ||
								item.getType().equals(Material.NETHERITE_BOOTS) || item.getType().equals(Material.ELYTRA) ||
								item.getType().equals(Material.TRIDENT) || item.getType().equals(Material.SHIELD)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							if (!(item.getItemMeta().equals(p.getItemMeta()) || item.getItemMeta().equals(a.getItemMeta()) ||
									item.getItemMeta().equals(sp.getItemMeta()) || item.getItemMeta().equals(ho.getItemMeta()) ||
									item.getItemMeta().equals(sw.getItemMeta()) || item.getItemMeta().equals(he.getItemMeta()) ||
									item.getItemMeta().equals(c.getItemMeta()) || item.getItemMeta().equals(l.getItemMeta()) ||
									item.getItemMeta().equals(b.getItemMeta()) || item.getItemMeta().equals(el.getItemMeta()) ||
									item.getItemMeta().equals(r.getItemMeta()) || item.getItemMeta().equals(sh.getItemMeta())))
								found = true;
						}					
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCNotToolRecipe(PrepareItemCraftEvent e) {
		String helmet = ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Not Stone Crown";

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
				lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null)
						if (item.getType().equals(Material.BARRIER))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
				if (found)
					e.getInventory().setResult(null);
			}
	}
	
	@EventHandler
	public void restrictCAToolRecipe(PrepareItemCraftEvent e) {
		String helmet = ChatColor.DARK_BLUE + "" + ChatColor.BOLD + "Anti-Stone Crown";

		ItemStack he = new Tools().cNotHelmet();

		if (e.getRecipe() != null)
			if (e.getRecipe().getResult().hasItemMeta() && e.getRecipe().getResult().getItemMeta().getDisplayName().equals(helmet)) {
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + "Contains 3^12 (531,441) Cobblestone");
				lore.add(ChatColor.RED + "" + ChatColor.ITALIC + "Caution!! Item will destroy blocks it touches.");
				boolean found = false;

				for (ItemStack item: e.getInventory().getMatrix())
					if (item != null) {
						if (item.getType().equals(Material.COMMAND_BLOCK))
							if (!item.hasItemMeta() || !lore.equals(item.getItemMeta().getLore()))
								found = true;
						if (item.getType().equals(Material.GOLDEN_HELMET)) {
							if (!item.getItemMeta().hasLore())
								found = true;
							if (!(item.getItemMeta().equals(he.getItemMeta())))
								found = true;
						}					
					}
				if (found)
					e.getInventory().setResult(null);
			}
	}
}
