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

public class LevelRestrictEvents implements Listener {
	private Main plugin;
	private Tools t;
	private Armor a;
	
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
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		if (!(e.getDamager() instanceof Player))
			return;
		
		Player player = (Player) e.getDamager();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (item == null || item.getType() == Material.AIR)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		}
		else {
			req = checkToolLevel(item);
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkInteract(PlayerInteractEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = e.getItem();
		
		if (item == null || item.getType() == Material.AIR)
			return;
		if (e.getAction() != Action.LEFT_CLICK_BLOCK)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		}
		else {
			req = checkToolLevel(item);
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRightclick(BlockPlaceEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (item == null || item.getType() == Material.AIR)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (!plugin.getConfig().getBoolean("vanillaLevelRestrict"))
				return;
			req = checkVanillaLevel(item.getType());
		}
		else {
			req = checkToolLevel(item);
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRanged(EntityShootBowEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		if (!(e.getEntity() instanceof Player))
			return;
		
		Player player = (Player) e.getEntity();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (!item.getItemMeta().hasLore())
			return;
		if (item == null || item.getType() == Material.AIR)
			return;
		req = checkToolLevel(item);
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkArmor(PlayerStatisticIncrementEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		
		Player player = e.getPlayer();
		
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		
		int lvl = player.getLevel();
		int req = 0;
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
			if (lvl < req) {
				Main.giveItem(player, world, loc, boots);
				player.getInventory().setBoots(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
	}
	
	@EventHandler()
	public void checkOffHand(PlayerStatisticIncrementEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		
		Player player = e.getPlayer();
		
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		
		int lvl = player.getLevel();
		int req = 0;
		ItemStack off = player.getInventory().getItemInOffHand();
		Location loc = player.getLocation();
		World world = player.getWorld();

		if (!(off == null || off.getType() == Material.AIR)) {
			if (!off.getItemMeta().hasLore()) {
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
			if (lvl < req) {
				Main.giveItem(player, world, loc, off);
				player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (player.getInventory().getItemInOffHand().getType().equals(Material.TRIDENT) && player.getInventory().getItemInOffHand().getItemMeta().hasLore())
			if (player.getInventory().getItemInOffHand().getItemMeta().hasEnchant(CustomEnchants.ROCKET)) {
				Main.giveItem(player, world, loc, off);
				player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "You can't hold this in your off hand!!");
			}
	}
	
	@EventHandler()
	public void checkShieldInteract(PlayerInteractEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;

		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack shield = e.getItem();
		
		if (shield == null || shield.getType() == Material.AIR)
			return;
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR))
			return;
		if (shield.getItemMeta().hasLore()) {
			if (Main.equals(shield, t.t5Shield()))
				req = 25;
			if (Main.equals(shield, t.t8Shield()))
				req = 40;
			if (Main.equals(shield, t.t10Shield()))
				req = 50;
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRiptide(PlayerMoveEvent e) {
		if (!plugin.getConfig().getBoolean("levelRestrict"))
			return;
		
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (!player.isRiptiding())
			return;
		if (Main.equals(item, t.t9Range()))
				req = 45;
		if (Main.equals(item, t.t10Range()))
				req = 50;
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
	
	private int checkVanillaLevel(Material m) {
		int req = 0;
		if (iron.contains(m))
			req = 10;
		if (diamond.contains(m))
			req = 20;
		if (netherite.contains(m))
			req = 30;
		return req;
	}
	
	private int checkToolLevel(ItemStack i) {
		int req = 0;
		for (ItemStack j : t.t1s())
			if (Main.equals(i, j))
				req = 5;
		for (ItemStack j : t.t2s())
			if (Main.equals(i, j))
				req = 10;
		for (ItemStack j : t.t3s())
			if (Main.equals(i, j))
				req = 15;
		for (ItemStack j : t.t4s())
			if (Main.equals(i, j))
				req = 20;
		for (ItemStack j : t.t5s())
			if (Main.equals(i, j))
				req = 25;
		for (ItemStack j : t.t6s())
			if (Main.equals(i, j))
				req = 30;
		for (ItemStack j : t.t7s())
			if (Main.equals(i, j))
				req = 35;
		for (ItemStack j : t.t8s())
			if (Main.equals(i, j))
				req = 40;
		for (ItemStack j : t.t9s())
			if (Main.equals(i, j))
				req = 45;
		for (ItemStack j : t.t10s())
			if (Main.equals(i, j))
				req = 50;
		return req;
	}
	
	private int checkArmorLevel(ItemStack i) {
		int req = 0;
		for (ItemStack j : a.t1s())
			if (Main.equals(i, j))
				req = 5;
		for (ItemStack j : a.t2s())
			if (Main.equals(i, j))
				req = 10;
		for (ItemStack j : a.t3s())
			if (Main.equals(i, j))
				req = 15;
		for (ItemStack j : a.t4s())
			if (Main.equals(i, j))
				req = 20;
		for (ItemStack j : a.t5s())
			if (Main.equals(i, j))
				req = 25;
		for (ItemStack j : a.t6s())
			if (Main.equals(i, j))
				req = 30;
		for (ItemStack j : a.t7s())
			if (Main.equals(i, j))
				req = 35;
		for (ItemStack j : a.t8s())
			if (Main.equals(i, j))
				req = 40;
		for (ItemStack j : a.t9s())
			if (Main.equals(i, j))
				req = 45;
		for (ItemStack j : a.t10s())
			if (Main.equals(i, j))
				req = 50;
		for (ItemStack j : a.nots())
			if (Main.equals(i, j))
				req = 55;
		for (ItemStack j : a.antis())
			if (Main.equals(i, j))
				req = 60;
		return req;
	}
}
