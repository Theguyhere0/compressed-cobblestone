package me.Theguyhere.CompressedCobble.items;

import java.util.Arrays;
import java.util.Collection;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.ItemStack;

import me.Theguyhere.CompressedCobble.Main;
import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;

@SuppressWarnings("SpellCheckingInspection")
public class LevelRestrictEvents implements Listener {
	private final Main plugin;
	private final Tools t;
	private final Armor a;
	
	public LevelRestrictEvents(Main plugin, Tools t, Armor a) {
		this.plugin = plugin;
		this.t = t;
		this.a = a;
	}
	
	Material[] chainmails = {Material.CHAINMAIL_HELMET, Material.CHAINMAIL_CHESTPLATE, Material.CHAINMAIL_LEGGINGS,
			Material.CHAINMAIL_BOOTS};
	Material[] irons = {Material.IRON_HELMET, Material.IRON_CHESTPLATE, Material.IRON_LEGGINGS, Material.IRON_BOOTS,
			Material.IRON_PICKAXE, Material.IRON_AXE, Material.IRON_SWORD, Material.IRON_HOE, Material.IRON_SHOVEL};
	Material[] golds = {Material.GOLDEN_HELMET, Material.GOLDEN_CHESTPLATE, Material.GOLDEN_LEGGINGS,
			Material.GOLDEN_BOOTS};
	Material[] diamonds = {Material.DIAMOND_HELMET, Material.DIAMOND_CHESTPLATE, Material.DIAMOND_LEGGINGS, Material.DIAMOND_BOOTS,
			Material.DIAMOND_PICKAXE, Material.DIAMOND_AXE, Material.DIAMOND_SWORD, Material.DIAMOND_HOE, Material.DIAMOND_SHOVEL};
	Material[] netherites = {Material.NETHERITE_HELMET, Material.NETHERITE_CHESTPLATE, Material.NETHERITE_LEGGINGS, Material.NETHERITE_BOOTS,
			Material.NETHERITE_PICKAXE, Material.NETHERITE_AXE, Material.NETHERITE_SWORD, Material.NETHERITE_HOE, Material.NETHERITE_SHOVEL};
	
	Collection<Material> chainmail = Arrays.asList(chainmails);
	Collection<Material> iron = Arrays.asList(irons);
	Collection<Material> gold = Arrays.asList(golds);
	Collection<Material> diamond = Arrays.asList(diamonds);
	Collection<Material> netherite = Arrays.asList(netherites);

	@EventHandler()
	public void checkAttack(EntityDamageByEntityEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		// Check if a player is attacking
		if (!(e.getDamager() instanceof Player))
			return;
		
		Player player = (Player) e.getDamager();
		ItemStack item = player.getInventory().getItemInMainHand();

		// Ignore if player wasn't holding anything
		if (item.getType() == Material.AIR)
			return;

		int req;

		if (!item.getItemMeta().hasLore()) {
			// Ignore vanilla items if vanilla restriction wasn't turned on
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		} else {
			req = checkToolLevel(item);
		}

		int lvl = player.getLevel();

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	@EventHandler()
	public void checkInteract(PlayerInteractEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		Player player = e.getPlayer();
		int lvl = player.getLevel();
		int req;
		ItemStack item = e.getItem();

		// Ignore if player wasn't holding anything
		if (item == null || item.getType() == Material.AIR)
			return;

		// Ignore actions that weren't left clicks on a block
		if (e.getAction() != Action.LEFT_CLICK_BLOCK)
			return;
		if (!item.getItemMeta().hasLore()) {
			// Ignore vanilla items if vanilla restriction wasn't turned on
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		} else {
			req = checkToolLevel(item);
		}

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	@EventHandler()
	public void checkRightclick(BlockPlaceEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		
		Player player = e.getPlayer();
		int req;
		ItemStack item = player.getInventory().getItemInMainHand();

		// Ignore if player wasn't holding anything
		if (item.getType() == Material.AIR)
			return;
		if (!item.getItemMeta().hasLore()) {
			// Ignore vanilla items if vanilla restriction wasn't turned on
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		}
		else {
			req = checkToolLevel(item);
		}

		int lvl = player.getLevel();

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	@EventHandler()
	public void checkRanged(EntityShootBowEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		// Check if a player is shooting
		if (!(e.getEntity() instanceof Player))
			return;
		
		Player player = (Player) e.getEntity();
		ItemStack item = player.getInventory().getItemInMainHand();

		// Ignore vanilla items
		if (!item.getItemMeta().hasLore())
			return;

		// Ignore if player wasn't holding anything
		if (item.getType() == Material.AIR)
			return;

		int lvl = player.getLevel();
		int req = checkToolLevel(item);

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	@EventHandler()
	public void checkArmor(PlayerStatisticIncrementEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		// Check for the "time since rest" event
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;

		Player player = e.getPlayer();

		// Ignore creative and spectator mode players
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;

		int lvl = player.getLevel();
		int req;
		ItemStack helmet = player.getInventory().getHelmet();
		ItemStack chestplate = player.getInventory().getChestplate();
		ItemStack leggings = player.getInventory().getLeggings();
		ItemStack boots = player.getInventory().getBoots();
		Location loc = player.getLocation();
		World world = player.getWorld();

		if (!(helmet == null || helmet.getType() == Material.AIR)) {
			if (!helmet.getItemMeta().hasLore()) {
				if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
					return;
				req = checkVanillaLevel(helmet.getType());
			}
			else {
				req = checkArmorLevel(helmet);
			}

			// Unequip if under-leveled
			if (lvl < req) {
				Main.giveItem(player, world, loc, helmet);
				player.getInventory().setHelmet(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(chestplate == null || chestplate.getType() == Material.AIR)) {
			if (!chestplate.getItemMeta().hasLore()) {
				if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
					return;
				req = checkVanillaLevel(chestplate.getType());
			}
			else {
				req = checkArmorLevel(chestplate);
			}

			// Unequip if under-leveled
			if (lvl < req) {
				Main.giveItem(player, world, loc, chestplate);
				player.getInventory().setChestplate(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(leggings == null || leggings.getType() == Material.AIR)) {
			if (!leggings.getItemMeta().hasLore()) {
				if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
					return;
				req = checkVanillaLevel(leggings.getType());
			}
			else {
				req = checkArmorLevel(leggings);
			}

			// Unequip if under-leveled
			if (lvl < req) {
				Main.giveItem(player, world, loc, leggings);
				player.getInventory().setLeggings(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(boots == null || boots.getType() == Material.AIR)) {
			if (!boots.getItemMeta().hasLore()) {
				if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
					return;
				req = checkVanillaLevel(boots.getType());
			}
			else {
				req = checkArmorLevel(boots);
			}

			// Unequip if under-leveled
			if (lvl < req) {
				Main.giveItem(player, world, loc, boots);
				player.getInventory().setBoots(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
	}

	@EventHandler()
	public void checkOffHand(PlayerStatisticIncrementEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		// Check for the "time since rest" event
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;

		Player player = e.getPlayer();

		// Ignore creative and spectator mode players
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;

		ItemStack off = player.getInventory().getItemInOffHand();

		// Ignore if player wasn't holding anything
		if (off.getType() == Material.AIR)
			return;

		int req;

		if (!off.getItemMeta().hasLore()) {
			// Ignore vanilla items if vanilla restriction wasn't turned on
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(off.getType());
		}
		else {
			req = checkToolLevel(off);
			int req2 = checkArmorLevel(off);
			if (req2 > req)
				req = req2;
		}

		int lvl = player.getLevel();
		Location loc = player.getLocation();
		World world = player.getWorld();

		// Unequip if under-leveled
		if (lvl < req) {
			Main.giveItem(player, world, loc, off);
			player.getInventory().setItemInOffHand(null);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}

		// Don't let trident with rocket go in off hand
		if (off.getType().equals(Material.TRIDENT) && off.getItemMeta().hasLore())
			if (off.getItemMeta().hasEnchant(CustomEnchants.ROCKET)) {
				Main.giveItem(player, world, loc, off);
				player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "You can't hold this in your off hand!!");
			}
	}
	
	@EventHandler()
	public void checkShieldInteract(PlayerInteractEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		ItemStack shield = e.getItem();
		
		if (shield == null || shield.getType() == Material.AIR)
			return;

		// Ignore actions that weren't right clicks
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR))
			return;

		// Ignore vanilla shields
		if (!shield.getItemMeta().hasLore())
			return;

		int req = 0;

		if (Main.equals(shield, t.t5Shield()))
			req = 25;
		if (Main.equals(shield, t.t8Shield()))
			req = 40;
		if (Main.equals(shield, t.t10Shield()))
			req = 50;

		Player player = e.getPlayer();
		int lvl = player.getLevel();

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	@EventHandler()
	public void checkRiptide(PlayerMoveEvent e) {
		// Check if level restricting was turned on
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		
		Player player = e.getPlayer();

		// Check if the player is going to riptide
		if (!player.isRiptiding())
			return;

		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();

		if (Main.equals(item, t.t9Range()))
				req = 45;
		if (Main.equals(item, t.t10Range()))
				req = 50;

		int lvl = player.getLevel();

		// Disable action if under-leveled
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	private int checkVanillaLevel(Material m) {
		if (chainmail.contains(m))
			return 5;
		else if (iron.contains(m))
			return 10;
		else if (gold.contains(m))
			return 15;
		else if (diamond.contains(m))
			return 20;
		else if (netherite.contains(m))
			return 30;
		else
			return 0;
	}
	
	private int checkToolLevel(ItemStack i) {
		if (t.t1s().contains(i))
			return 5;
		else if (t.t2s().contains(i))
			return 10;
		else if (t.t3s().contains(i))
			return 15;
		else if (t.t4s().contains(i))
			return 20;
		else if (t.t5s().contains(i))
			return 25;
		else if (t.t6s().contains(i))
			return 30;
		else if (t.t7s().contains(i))
			return 35;
		else if (t.t8s().contains(i))
			return 40;
		else if (t.t9s().contains(i))
			return 45;
		else if (t.t10s().contains(i))
			return 50;
		else
			return 0;
	}
	
	private int checkArmorLevel(ItemStack i) {
		if (a.t1s().contains(i))
			return 5;
		else if (a.t2s().contains(i))
			return 10;
		else if (a.t3s().contains(i))
			return 15;
		else if (a.t4s().contains(i))
			return 20;
		else if (a.t5s().contains(i))
			return 25;
		else if (a.t6s().contains(i))
			return 30;
		else if (a.t7s().contains(i))
			return 35;
		else if (a.t8s().contains(i))
			return 40;
		else if (a.t9s().contains(i))
			return 45;
		else if (a.t10s().contains(i))
			return 50;
		else if (a.nots().contains(i))
			return 55;
		else if (a.antis().contains(i))
			return 60;
		else
			return 0;
	}
}
