package me.Theguyhere.CompressedCobble;

import java.util.Arrays;
import java.util.Collection;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.ItemStack;

public class LevelRestrictEvents implements Listener {
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
		if (!(e.getDamager() instanceof Player))
			return;
		Player player = (Player) e.getDamager();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (item == null || item.getType() == Material.AIR)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(item.getType()))
				req = 10;
			if (diamond.contains(item.getType()))
				req = 20;
			if (netherite.contains(item.getType()))
				req = 30;
		}
		else {
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
				req = 5;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
				req = 10;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
				req = 15;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
				req = 20;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
				req = 25;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
				req = 30;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
				req = 35;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
				req = 40;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
				req = 45;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
				req = 50;
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkInteract(PlayerInteractEvent e) {
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = e.getItem();
		if (item == null || item.getType() == Material.AIR)
			return;
		if (e.getAction() != Action.LEFT_CLICK_BLOCK)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(item.getType()))
				req = 10;
			if (diamond.contains(item.getType()))
				req = 20;
			if (netherite.contains(item.getType()))
				req = 30;
		}
		else {
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
				req = 5;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
				req = 10;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
				req = 15;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
				req = 20;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
				req = 25;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
				req = 30;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
				req = 35;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
				req = 40;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
				req = 45;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
				req = 50;
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRightclick(BlockPlaceEvent e) {
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (item == null || item.getType() == Material.AIR)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(item.getType()))
				req = 10;
			if (diamond.contains(item.getType()))
				req = 20;
			if (netherite.contains(item.getType()))
				req = 30;
		}
		else {
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
				req = 5;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
				req = 10;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
				req = 15;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
				req = 20;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
				req = 25;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
				req = 30;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
				req = 35;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
				req = 40;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
				req = 45;
			if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
				req = 50;
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRanged(ProjectileLaunchEvent e) {
		if (!(e.getEntity() instanceof Arrow))
			return;
		if (!(e.getEntity().getShooter() instanceof Player))
			return;
		Player player = (Player) e.getEntity().getShooter();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (!item.getItemMeta().hasLore())
			return;
		if (item == null || item.getType() == Material.AIR)
			return;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
			req = 5;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
			req = 10;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
			req = 15;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
			req = 20;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
			req = 25;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
			req = 30;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
			req = 35;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
			req = 40;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
			req = 45;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
			req = 50;
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkArmor(PlayerStatisticIncrementEvent e) {
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
				if (iron.contains(helmet.getType()))
					req = 10;
				if (diamond.contains(helmet.getType()))
					req = 20;
				if (netherite.contains(helmet.getType()))
					req = 30;
			}
			else {
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
					req = 5;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
					req = 10;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
					req = 15;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
					req = 20;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
					req = 25;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
					req = 30;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
					req = 35;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
					req = 40;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
					req = 45;
				if (helmet.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
					req = 50;
			}
			if (lvl < req) {
					if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, helmet);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else player.getInventory().addItem(helmet);
					player.getInventory().setHelmet(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(chestplate == null || chestplate.getType() == Material.AIR)) {
			if (!chestplate.getItemMeta().hasLore()) {
				if (iron.contains(chestplate.getType()))
					req = 10;
				if (diamond.contains(chestplate.getType()))
					req = 20;
				if (netherite.contains(chestplate.getType()))
					req = 30;
			}
			else {
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
					req = 5;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
					req = 10;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
					req = 15;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
					req = 20;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
					req = 25;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
					req = 30;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
					req = 35;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
					req = 40;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
					req = 45;
				if (chestplate.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
					req = 50;
			}
			if (lvl < req) {
					if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, chestplate);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else player.getInventory().addItem(chestplate);
					player.getInventory().setChestplate(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(leggings == null || leggings.getType() == Material.AIR)) {
			if (!leggings.getItemMeta().hasLore()) {
				if (iron.contains(leggings.getType()))
					req = 10;
				if (diamond.contains(leggings.getType()))
					req = 20;
				if (netherite.contains(leggings.getType()))
					req = 30;
			}
			else {
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
					req = 5;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
					req = 10;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
					req = 15;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
					req = 20;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
					req = 25;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
					req = 30;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
					req = 35;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
					req = 40;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
					req = 45;
				if (leggings.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
					req = 50;
			}
			if (lvl < req) {
					if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, leggings);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else player.getInventory().addItem(leggings);
					player.getInventory().setLeggings(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (!(boots == null || boots.getType() == Material.AIR)) {
			if (!boots.getItemMeta().hasLore()) {
				if (iron.contains(boots.getType()))
					req = 10;
				if (diamond.contains(boots.getType()))
					req = 20;
				if (netherite.contains(boots.getType()))
					req = 30;
			}
			else {
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòfT1"))
					req = 5;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT2"))
					req = 10;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòeT3"))
					req = 15;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T4"))
					req = 20;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
					req = 25;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T6"))
					req = 30;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7"))
					req = 35;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
					req = 40;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
					req = 45;
				if (boots.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
					req = 50;
			}
			if (lvl < req) {
					if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, boots);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else player.getInventory().addItem(boots);
					player.getInventory().setBoots(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
	}
	
	@EventHandler()
	public void checkShield(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		
		Player player = e.getPlayer();
		
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		
		int lvl = player.getLevel();
		int req = 0;
		ItemStack shield = player.getInventory().getItemInOffHand();
		Location loc = player.getLocation();
		World world = player.getWorld();

		if (!(shield == null || shield.getType() == Material.AIR)) {
			if (shield.getItemMeta().hasLore()) {
				if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
					req = 25;
				if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
					req = 40;
				if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
					req = 50;
			}
			if (lvl < req) {
					if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, shield);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else player.getInventory().addItem(shield);
					player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
	}
	
	@EventHandler()
	public void checkShieldInteract(PlayerInteractEvent e) {
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack shield = e.getItem();
		
		if (shield == null || shield.getType() == Material.AIR)
			return;
		if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR))
			return;
		if (shield.getItemMeta().hasLore()) {
			if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("Åò6T5"))
				req = 25;
			if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8"))
				req = 40;
			if (shield.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
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
		Player player = (Player) e.getPlayer();
		int lvl = player.getLevel();
		int req = 0;
		ItemStack item = player.getInventory().getItemInMainHand();
		
		if (!player.isRiptiding())
			return;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl"))
			req = 45;
		if (item.getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl"))
			req = 50;
			req = 50;
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
}
