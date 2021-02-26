package me.Theguyhere.CompressedCobble.items;

import me.Theguyhere.CompressedCobble.Main;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collection;

public class ToolArmorRecipeEvents implements Listener {
	private final Resources r;
	private final Tools t;
	private final Armor a;
	private final int MANY = 9999;
	
	public ToolArmorRecipeEvents(Resources r, Tools t, Armor a) {
		this.r = r;
		this.t = t;
		this.a = a;
	}

	@EventHandler
	public void restrictToolArmorCombine(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();

		// Don't check if not air
		if (!(result.getType() == Material.AIR))
			return;

		boolean found = false; // Flag for illegal recipe

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			// Prevent custom stuff from turning into normal
			if (item.getItemMeta().hasLore()) {
				found = true;
				break;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT0ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean two = false; // Flag for more than

		// Don't check if not t0
		if (!(t.t0s().contains(result) || a.t0s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();
			// Nullify use of blackstone
			if (type.equals(Material.BLACKSTONE)) {
				found = true;
				break;
			}

			// Prevent custom stuff from turning into normal
			if (item.getItemMeta().hasLore()) {
				found = true;
				break;
			}

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Ignore inputs that aren't tools or armor
			if (!(t.t0s().contains(clone) || a.t0s().contains(clone)))
				continue;

			// Prevent "fixing" new tools
			int damage = ((Damageable) item.getItemMeta()).getDamage();
			if (damage == 0) {
				found = true;
				break;
			}

			ItemMeta rMeta = result.getItemMeta();
			Damageable rDam = (Damageable) meta;

			// Check for multiple occurrences and leave vanilla fix alone
			if (!two)
				two = true;
			else {
				rDam.setDamage(0);
				result.setItemMeta(rMeta);
				break;
			}

			// Set durability
			vanillaCheck(t.picks(), item, result, 43);
			vanillaCheck(t.axes(), item, result, 43);
			vanillaCheck(t.hoes(), item, result, 66);
			vanillaCheck(t.swords(), item, result, 66);
			vanillaCheck(a.helmets(), item, result, 11);
			vanillaCheck(a.chestplates(), item, result, 10);
			vanillaCheck(a.leggings(), item, result, 11);
			vanillaCheck(a.boots(), item, result, 16);
			standardCheck(Material.BOW, item, result, 128);
			standardCheck(Material.SHIELD, item, result, 56);
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT1ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t1
		if (!(t.t1s().contains(result) || a.t1s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t1().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t1())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.STICK)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.STRING))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t0s().contains(clone) || t.t1s().contains(clone) || a.t0s().contains(clone) || a.t1s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, new ItemStack(Material.STONE_PICKAXE), t.t1Pick(), result, false, 43);
			found = foundCheck(item, new ItemStack(Material.STONE_AXE), t.t1Axe(), result, found, 43);
			found = foundCheck(item, new ItemStack(Material.STONE_SHOVEL), t.t1Spade(), result, found, MANY);
			found = foundCheck(item, new ItemStack(Material.STONE_HOE), t.t1Hoe(), result, found, 66);
			found = foundCheck(item, new ItemStack(Material.STONE_SWORD), t.t1Sword(), result, found, 66);
			found = foundCheck(item, new ItemStack(Material.LEATHER_HELMET), a.t1Helmet(), result, found, 11);
			found = foundCheck(item, new ItemStack(Material.LEATHER_CHESTPLATE), a.t1Chestplate(), result, found, 10);
			found = foundCheck(item, new ItemStack(Material.LEATHER_LEGGINGS), a.t1Leggings(), result, found, 11);
			found = foundCheck(item, new ItemStack(Material.LEATHER_BOOTS), a.t1Boots(), result, found, 16);
			found = foundCheck(item, new ItemStack(Material.BOW), t.t1Range(), result, found, 128);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, new ItemStack(Material.STONE_PICKAXE), low);
			low = lowCheck(item, new ItemStack(Material.STONE_AXE), low);
			low = lowCheck(item, new ItemStack(Material.STONE_SHOVEL), low);
			low = lowCheck(item, new ItemStack(Material.STONE_HOE), low);
			low = lowCheck(item, new ItemStack(Material.STONE_SWORD), low);
			low = lowCheck(item, new ItemStack(Material.LEATHER_HELMET), low);
			low = lowCheck(item, new ItemStack(Material.LEATHER_CHESTPLATE), low);
			low = lowCheck(item, new ItemStack(Material.LEATHER_LEGGINGS), low);
			low = lowCheck(item, new ItemStack(Material.LEATHER_BOOTS), low);
			low = lowCheck(item, new ItemStack(Material.BOW), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t1s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t1s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT2ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t2
		if (!(t.t2s().contains(result) || a.t2s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t2().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t2())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.STICK)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.STRING))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t1s().contains(clone) || t.t2s().contains(clone) || a.t1s().contains(clone) || a.t2s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t1Pick(), t.t2Pick(), result, false, 43);
			found = foundCheck(item, t.t1Axe(), t.t2Axe(), result, found, 43);
			found = foundCheck(item, t.t1Spade(), t.t2Spade(), result, found, MANY);
			found = foundCheck(item, t.t1Hoe(), t.t2Hoe(), result, found, 66);
			found = foundCheck(item, t.t1Sword(), t.t2Sword(), result, found, 66);
			found = foundCheck(item, a.t1Helmet(), a.t2Helmet(), result, found, 41);
			found = foundCheck(item, a.t1Chestplate(), a.t2Chestplate(), result, found, 30);
			found = foundCheck(item, a.t1Leggings(), a.t2Leggings(), result, found, 32);
			found = foundCheck(item, a.t1Boots(), a.t2Boots(), result, found, 49);
			found = foundCheck(item, t.t1Range(), t.t2Range(), result, found, 128);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t1Pick(), low);
			low = lowCheck(item, t.t1Axe(), low);
			low = lowCheck(item, t.t1Spade(), low);
			low = lowCheck(item, t.t1Hoe(), low);
			low = lowCheck(item, t.t1Sword(), low);
			low = lowCheck(item, a.t1Helmet(), low);
			low = lowCheck(item, a.t1Chestplate(), low);
			low = lowCheck(item, a.t1Leggings(), low);
			low = lowCheck(item, a.t1Boots(), low);
			low = lowCheck(item, t.t1Range(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t2s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t2s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT3ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t3
		if (!(t.t3s().contains(result) || a.t3s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t3().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t3())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.STICK)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.STRING))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t2s().contains(clone) || t.t3s().contains(clone) || a.t2s().contains(clone) || a.t3s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t2Pick(), t.t3Pick(), result, false, 83);
			found = foundCheck(item, t.t2Axe(), t.t3Axe(), result, found, 83);
			found = foundCheck(item, t.t2Spade(), t.t3Spade(), result, found, MANY);
			found = foundCheck(item, t.t2Hoe(), t.t3Hoe(), result, found, 125);
			found = foundCheck(item, t.t2Sword(), t.t3Sword(), result, found, 125);
			found = foundCheck(item, a.t2Helmet(), a.t3Helmet(), result, found, 41);
			found = foundCheck(item, a.t2Chestplate(), a.t3Chestplate(), result, found, 30);
			found = foundCheck(item, a.t2Leggings(), a.t3Leggings(), result, found, 32);
			found = foundCheck(item, a.t2Boots(), a.t3Boots(), result, found, 49);
			found = foundCheck(item, t.t2Range(), t.t3Range(), result, found, 128);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t2Pick(), low);
			low = lowCheck(item, t.t2Axe(), low);
			low = lowCheck(item, t.t2Spade(), low);
			low = lowCheck(item, t.t2Hoe(), low);
			low = lowCheck(item, t.t2Sword(), low);
			low = lowCheck(item, a.t2Helmet(), low);
			low = lowCheck(item, a.t2Chestplate(), low);
			low = lowCheck(item, a.t2Leggings(), low);
			low = lowCheck(item, a.t2Boots(), low);
			low = lowCheck(item, t.t2Range(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t3s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t3s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT4ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t4
		if (!(t.t4s().contains(result) || a.t4s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t4().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t4())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.STICK)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.STRING))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t3s().contains(clone) || t.t4s().contains(clone) || a.t3s().contains(clone) || a.t4s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t3Pick(), t.t4Pick(), result, false, 83);
			found = foundCheck(item, t.t3Axe(), t.t4Axe(), result, found, 83);
			found = foundCheck(item, t.t3Spade(), t.t4Spade(), result, found, MANY);
			found = foundCheck(item, t.t3Hoe(), t.t4Hoe(), result, found, 125);
			found = foundCheck(item, t.t3Sword(), t.t4Sword(), result, found, 125);
			found = foundCheck(item, a.t3Helmet(), a.t4Helmet(), result, found, 41);
			found = foundCheck(item, a.t3Chestplate(), a.t4Chestplate(), result, found, 30);
			found = foundCheck(item, a.t3Leggings(), a.t4Leggings(), result, found, 32);
			found = foundCheck(item, a.t3Boots(), a.t4Boots(), result, found, 49);
			found = foundCheck(item, t.t3Range(), t.t4Range(), result, found, 128);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t3Pick(), low);
			low = lowCheck(item, t.t3Axe(), low);
			low = lowCheck(item, t.t3Spade(), low);
			low = lowCheck(item, t.t3Hoe(), low);
			low = lowCheck(item, t.t3Sword(), low);
			low = lowCheck(item, a.t3Helmet(), low);
			low = lowCheck(item, a.t3Chestplate(), low);
			low = lowCheck(item, a.t3Leggings(), low);
			low = lowCheck(item, a.t3Boots(), low);
			low = lowCheck(item, t.t3Range(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t4s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t4s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT5ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t5
		if (!(t.t5s().contains(result) || a.t5s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t5().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t5())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.STICK)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.STRING) || type.equals(Material.GOLD_BLOCK))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t4s().contains(clone) || t.t5s().contains(clone) || a.t4s().contains(clone) || a.t5s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t4Pick(), t.t5Pick(), result, false, 520);
			found = foundCheck(item, t.t4Axe(), t.t5Axe(), result, found, 520);
			found = foundCheck(item, t.t4Spade(), t.t5Spade(), result, found, MANY);
			found = foundCheck(item, t.t4Hoe(), t.t5Hoe(), result, found, 789);
			found = foundCheck(item, t.t4Sword(), t.t5Sword(), result, found, 789);
			found = foundCheck(item, a.t4Helmet(), a.t5Helmet(), result, found, 41);
			found = foundCheck(item, a.t4Chestplate(), a.t5Chestplate(), result, found, 30);
			found = foundCheck(item, a.t4Leggings(), a.t5Leggings(), result, found, 32);
			found = foundCheck(item, a.t4Boots(), a.t5Boots(), result, found, 49);
			found = foundCheck(item, t.t4Range(), t.t5Range(), result, found, 128);
			found = foundCheck(item, new ItemStack(Material.SHIELD), t.t5Shield(), result, found, 56);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t4Pick(), low);
			low = lowCheck(item, t.t4Axe(), low);
			low = lowCheck(item, t.t4Spade(), low);
			low = lowCheck(item, t.t4Hoe(), low);
			low = lowCheck(item, t.t4Sword(), low);
			low = lowCheck(item, a.t4Helmet(), low);
			low = lowCheck(item, a.t4Chestplate(), low);
			low = lowCheck(item, a.t4Leggings(), low);
			low = lowCheck(item, a.t4Boots(), low);
			low = lowCheck(item, t.t4Range(), low);
			low = lowCheck(item, new ItemStack(Material.SHIELD), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t5s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					// Excludes the shield
					if (!result.getType().equals(Material.SHIELD))
						found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t5s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT6ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t6
		if (!(t.t6s().contains(result) || a.t6s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t6().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t6())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.BLAZE_ROD)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.SLIME_BALL) || type.equals(Material.BLAZE_POWDER))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t5s().contains(clone) || t.t6s().contains(clone) || a.t5s().contains(clone) || a.t6s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t5Pick(), t.t6Pick(), result, false, 520);
			found = foundCheck(item, t.t5Axe(), t.t6Axe(), result, found, 520);
			found = foundCheck(item, t.t5Spade(), t.t6Spade(), result, found, MANY);
			found = foundCheck(item, t.t5Hoe(), t.t6Hoe(), result, found, 789);
			found = foundCheck(item, t.t5Sword(), t.t6Sword(), result, found, 789);
			found = foundCheck(item, a.t5Helmet(), a.t6Helmet(), result, found, 73);
			found = foundCheck(item, a.t5Chestplate(), a.t6Chestplate(), result, found, 66);
			found = foundCheck(item, a.t5Leggings(), a.t6Leggings(), result, found, 71);
			found = foundCheck(item, a.t5Boots(), a.t6Boots(), result, found, 107);
			found = foundCheck(item, t.t5Range(), t.t6Range(), result, found, 128);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t5Pick(), low);
			low = lowCheck(item, t.t5Axe(), low);
			low = lowCheck(item, t.t5Spade(), low);
			low = lowCheck(item, t.t5Hoe(), low);
			low = lowCheck(item, t.t5Sword(), low);
			low = lowCheck(item, a.t5Helmet(), low);
			low = lowCheck(item, a.t5Chestplate(), low);
			low = lowCheck(item, a.t5Leggings(), low);
			low = lowCheck(item, a.t5Boots(), low);
			low = lowCheck(item, t.t5Range(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t6s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t6s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT7ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t7
		if (!(t.t7s().contains(result) || a.t7s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t7().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t7())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.BLAZE_ROD)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.SLIME_BALL) || type.equals(Material.BLAZE_POWDER))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t6s().contains(clone) || t.t7s().contains(clone) || a.t6s().contains(clone) || a.t7s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t6Pick(), t.t7Pick(), result, false, 677);
			found = foundCheck(item, t.t6Axe(), t.t7Axe(), result, found, 677);
			found = foundCheck(item, t.t6Spade(), t.t7Spade(), result, found, MANY);
			found = foundCheck(item, t.t6Hoe(), t.t7Hoe(), result, found, 1016);
			found = foundCheck(item, t.t6Sword(), t.t7Sword(), result, found, 1016);
			found = foundCheck(item, a.t6Helmet(), a.t7Helmet(), result, found, 73);
			found = foundCheck(item, a.t6Chestplate(), a.t7Chestplate(), result, found, 66);
			found = foundCheck(item, a.t6Leggings(), a.t7Leggings(), result, found, 71);
			found = foundCheck(item, a.t6Boots(), a.t7Boots(), result, found, 107);
			found = foundCheck(item, t.t6Range(), t.t7Range(), result, found, 109);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t6Pick(), low);
			low = lowCheck(item, t.t6Axe(), low);
			low = lowCheck(item, t.t6Spade(), low);
			low = lowCheck(item, t.t6Hoe(), low);
			low = lowCheck(item, t.t6Sword(), low);
			low = lowCheck(item, a.t6Helmet(), low);
			low = lowCheck(item, a.t6Chestplate(), low);
			low = lowCheck(item, a.t6Leggings(), low);
			low = lowCheck(item, a.t6Boots(), low);
			low = lowCheck(item, t.t6Range(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t7s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t7s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT8ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t8
		if (!(t.t8s().contains(result) || a.t8s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t8().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t8())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.BLAZE_ROD)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.SLIME_BALL) || type.equals(Material.BLAZE_POWDER) || type.equals(Material.DIAMOND_BLOCK))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t7s().contains(clone) || t.t8s().contains(clone) || a.t7s().contains(clone) || a.t8s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t7Pick(), t.t8Pick(), result, false, 677);
			found = foundCheck(item, t.t7Axe(), t.t8Axe(), result, found, 677);
			found = foundCheck(item, t.t7Spade(), t.t8Spade(), result, found, MANY);
			found = foundCheck(item, t.t7Hoe(), t.t8Hoe(), result, found, 1016);
			found = foundCheck(item, t.t7Sword(), t.t8Sword(), result, found, 1016);
			found = foundCheck(item, a.t7Helmet(), a.t8Helmet(), result, found, 81);
			found = foundCheck(item, a.t7Chestplate(), a.t8Chestplate(), result, found, 74);
			found = foundCheck(item, a.t7Leggings(), a.t8Leggings(), result, found, 79);
			found = foundCheck(item, a.t7Boots(), a.t8Boots(), result, found, 120);
			found = foundCheck(item, t.t7Range(), t.t8Range(), result, found, 109);
			found = foundCheck(item, t.t5Shield(), t.t8Shield(), result, found, 56);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t7Pick(), low);
			low = lowCheck(item, t.t7Axe(), low);
			low = lowCheck(item, t.t7Spade(), low);
			low = lowCheck(item, t.t7Hoe(), low);
			low = lowCheck(item, t.t7Sword(), low);
			low = lowCheck(item, a.t7Helmet(), low);
			low = lowCheck(item, a.t7Chestplate(), low);
			low = lowCheck(item, a.t7Leggings(), low);
			low = lowCheck(item, a.t7Boots(), low);
			low = lowCheck(item, t.t7Range(), low);
			low = lowCheck(item, t.t5Shield(), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t8s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					// Exclude the shield
					if (!result.getType().equals(Material.SHIELD))
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t8s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT9ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe
		boolean low = false; // Flag for lower tier item
		int c = 0; // Cobble counter
		int s = 0; // Stick counter

		// Don't check if not t9
		if (!t.t9s().contains(result) && !a.t9s().contains(result))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t9().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t9())) {
					found = true;
					break;
				}
				// Increment cobble counter
				c++;
				continue;
			}

			// Check for and increment stick material
			if (type.equals(Material.END_ROD)) {
				s++;
				continue;
			}

			// Ignore other vanilla elements
			if (type.equals(Material.SPONGE) || type.equals(Material.END_CRYSTAL))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for illegal tools
			if (!(t.t8s().contains(clone) || t.t9s().contains(clone) || a.t8s().contains(clone) || a.t9s().contains(clone))) {
				found = true;
				break;
			}

			// Check for illegal status
			found = foundCheck(item, t.t8Pick(), t.t9Pick(), result, false, 677);
			found = foundCheck(item, t.t8Axe(), t.t9Axe(), result, found, 677);
			found = foundCheck(item, t.t8Spade(), t.t9Spade(), result, found, MANY);
			found = foundCheck(item, t.t8Hoe(), t.t9Hoe(), result, found, 1016);
			found = foundCheck(item, t.t8Sword(), t.t9Sword(), result, found, 1016);
			found = foundCheck(item, a.t8Helmet(), a.t9Helmet(), result, found, 81);
			found = foundCheck(item, a.t8Chestplate(), a.t9Chestplate(), result, found, 74);
			found = foundCheck(item, a.t8Leggings(), a.t9Leggings(), result, found, 79);
			found = foundCheck(item, a.t8Boots(), a.t9Boots(), result, found, 120);
			found = foundCheck(item, t.t8Range(), t.t9Range(), result, found, 83);
			found = foundCheck(item, new ItemStack(Material.ELYTRA), a.t9Elytra(), result, found, 108);

			// Leave loop if illegal flag is flipped
			if (found)
				break;

			// Check for lower or higher tier item
			low = lowCheck(item, t.t8Pick(), low);
			low = lowCheck(item, t.t8Axe(), low);
			low = lowCheck(item, t.t8Spade(), low);
			low = lowCheck(item, t.t8Hoe(), low);
			low = lowCheck(item, t.t8Sword(), low);
			low = lowCheck(item, a.t8Helmet(), low);
			low = lowCheck(item, a.t8Chestplate(), low);
			low = lowCheck(item, a.t8Leggings(), low);
			low = lowCheck(item, a.t8Boots(), low);
			low = lowCheck(item, t.t8Range(), low);
			low = lowCheck(item, new ItemStack(Material.ELYTRA), low);
		}

		// Don't check this if illegal flag was flipped
		if (!found) {
			if (t.t9s().contains(result)) {
				// Low needs sticks
				if (low && s == 0)
					found = true;
				// High doesn't need sticks
				if (!low && s != 0)
					found = true;
			} else if (a.t9s().contains(result)) {
				// Low needs more than once cobble
				if (low && c == 1)
					found = true;
				// High only needs one cobble
				if (!low && c != 1)
					found = true;
			}
		}

		// Nullify all unwanted recipes, otherwise return desired recipe
		if (found)
			e.getInventory().setResult(null);
		else
			e.getInventory().setResult(result);
	}

	@EventHandler
	public void restrictT10ToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe

		// Don't check if not t10
		if (!(t.t10s().contains(result) || a.t10s().contains(result)))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.t10().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.t10())) {
					found = true;
					break;
				}
			}

			// Ignore other vanilla elements
			if (type.equals(Material.SPONGE) || type.equals(Material.END_CRYSTAL) || type.equals(Material.NETHERITE_BLOCK))
				continue;

			// Create a copy without damage
			ItemStack clone = item.clone();
			ItemMeta meta = clone.getItemMeta();
			((Damageable) meta).setDamage(0);
			clone.setItemMeta(meta);

			// Check for right level of items
			if (!(t.t9s().contains(clone) || a.t9s().contains(clone) || Main.equals(item, t.t8Shield()))) {
				found = true;
				break;
			}
		}

		// Nullify all unwanted recipes
		if (found)
			e.getInventory().setResult(null);
	}

	@EventHandler
	public void restrictNotToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe

		// Don't check if not a "not"
		if (!a.nots().contains(result))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.not().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.not())) {
					found = true;
					break;
				}
			}
		}

		// Nullify all unwanted recipes
		if (found)
			e.getInventory().setResult(null);
	}
	
	@EventHandler
	public void restrictAntiToolArmorRecipe(PrepareItemCraftEvent e) {
		// Don't check null recipes
		if (e.getRecipe() == null)
			return;

		ItemStack result = e.getRecipe().getResult();
		boolean found = false; // Flag for illegal recipe

		// Don't check if not an "anti"
		if (a.antis().contains(result))
			return;

		// Search crafting inputs
		for (ItemStack item: e.getInventory().getMatrix()) {
			// Don't check null items
			if (item == null)
				continue;

			Material type = item.getType();

			// Check for cobble material
			if (type.equals(r.a().getType())) {
				// Nullify counterfeit
				if (!Main.equals(item, r.a())) {
					found = true;
					break;
				}
			}

			// Check for counterfeit helmet and nullify
			if (type.equals(a.notHelmet().getType()))
				if (!(Main.equals(item, a.notHelmet()))) {
					found = true;
					break;
				}
		}

		// Nullify all unwanted recipes
		if (found)
			e.getInventory().setResult(null);
	}
	
	private boolean foundCheck(ItemStack item, ItemStack lower, ItemStack higher, ItemStack result, boolean found, int threshold) {
		ItemMeta meta = result.getItemMeta();
		Damageable mDam = (Damageable) meta;
		int damage = ((Damageable) item.getItemMeta()).getDamage();

		if (Main.equals(item, lower)) {
			// Check for undamaged lower item
			if (damage != 0)
				return true;
		} else if (Main.equals(item, higher)) {
			// Check for damaged higher item
			if (damage == 0)
				return true;
			// Modify damage of result
			else if (damage > threshold) {
				damage -= threshold;
				mDam.setDamage(damage);
				result.setItemMeta(meta);
			}
		}

		// Catch-all return
		return found;
	}
	
	private boolean lowCheck(ItemStack item, ItemStack lower, boolean low) {
		if (Main.equals(item, lower))
			return true;
		else
			return low;
	}
	
	private void vanillaCheck(Collection<Material> toolArmor, ItemStack item, ItemStack result, int threshold) {
		Material type = item.getType();

		// Check if matches tool or armor
		if (!toolArmor.contains(type))
			return;

		ItemMeta meta = result.getItemMeta();
		Damageable mDam = (Damageable) meta;
		int damage = ((Damageable) item.getItemMeta()).getDamage();

		// Check for full repair
		if (damage > threshold) {
			damage -= threshold;
			mDam.setDamage(damage);
			result.setItemMeta(meta);
		}
	}
	
	private void standardCheck(Material check, ItemStack item, ItemStack result, int threshold) {
		Material type = item.getType();

		// Check if matches tool or armor
		if (!type.equals(check))
			return;

		ItemMeta meta = result.getItemMeta();
		Damageable mDam = (Damageable) meta;
		int damage = ((Damageable) item.getItemMeta()).getDamage();

		// Check for full repair
		if (damage > threshold) {
			damage -= threshold;
			mDam.setDamage(damage);
			result.setItemMeta(meta);
		}
	}
}
