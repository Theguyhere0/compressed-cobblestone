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
		Material type = item.getType();
		
		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(type))
				req = 10;
			if (diamond.contains(type))
				req = 20;
			if (netherite.contains(type))
				req = 30;
		}
		else {
			for (ItemStack j : new Tools().t1s())
				if (Main.equals(item, j))
					req = 5;
			for (ItemStack j : new Tools().t2s())
				if (Main.equals(item, j))
					req = 10;
			for (ItemStack j : new Tools().t3s())
				if (Main.equals(item, j))
					req = 15;
			for (ItemStack j : new Tools().t4s())
				if (Main.equals(item, j))
					req = 20;
			for (ItemStack j : new Tools().t5s())
				if (Main.equals(item, j))
					req = 25;
			for (ItemStack j : new Tools().t6s())
				if (Main.equals(item, j))
					req = 30;
			for (ItemStack j : new Tools().t7s())
				if (Main.equals(item, j))
					req = 35;
			for (ItemStack j : new Tools().t8s())
				if (Main.equals(item, j))
					req = 40;
			for (ItemStack j : new Tools().t9s())
				if (Main.equals(item, j))
					req = 45;
			for (ItemStack j : new Tools().t10s())
				if (Main.equals(item, j))
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
		Material type = item.getType();
		
		if (e.getAction() != Action.LEFT_CLICK_BLOCK)
			return;
		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(type))
				req = 10;
			if (diamond.contains(type))
				req = 20;
			if (netherite.contains(type))
				req = 30;
		}
		else {
			for (ItemStack j : new Tools().t1s())
				if (Main.equals(item, j))
					req = 5;
			for (ItemStack j : new Tools().t2s())
				if (Main.equals(item, j))
					req = 10;
			for (ItemStack j : new Tools().t3s())
				if (Main.equals(item, j))
					req = 15;
			for (ItemStack j : new Tools().t4s())
				if (Main.equals(item, j))
					req = 20;
			for (ItemStack j : new Tools().t5s())
				if (Main.equals(item, j))
					req = 25;
			for (ItemStack j : new Tools().t6s())
				if (Main.equals(item, j))
					req = 30;
			for (ItemStack j : new Tools().t7s())
				if (Main.equals(item, j))
					req = 35;
			for (ItemStack j : new Tools().t8s())
				if (Main.equals(item, j))
					req = 40;
			for (ItemStack j : new Tools().t9s())
				if (Main.equals(item, j))
					req = 45;
			for (ItemStack j : new Tools().t10s())
				if (Main.equals(item, j))
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
		Material type = item.getType();

		if (!item.getItemMeta().hasLore()) {
			if (iron.contains(type))
				req = 10;
			if (diamond.contains(type))
				req = 20;
			if (netherite.contains(type))
				req = 30;
		}
		else {
			for (ItemStack j : new Tools().t1s())
				if (Main.equals(item, j))
					req = 5;
			for (ItemStack j : new Tools().t2s())
				if (Main.equals(item, j))
					req = 10;
			for (ItemStack j : new Tools().t3s())
				if (Main.equals(item, j))
					req = 15;
			for (ItemStack j : new Tools().t4s())
				if (Main.equals(item, j))
					req = 20;
			for (ItemStack j : new Tools().t5s())
				if (Main.equals(item, j))
					req = 25;
			for (ItemStack j : new Tools().t6s())
				if (Main.equals(item, j))
					req = 30;
			for (ItemStack j : new Tools().t7s())
				if (Main.equals(item, j))
					req = 35;
			for (ItemStack j : new Tools().t8s())
				if (Main.equals(item, j))
					req = 40;
			for (ItemStack j : new Tools().t9s())
				if (Main.equals(item, j))
					req = 45;
			for (ItemStack j : new Tools().t10s())
				if (Main.equals(item, j))
					req = 50;
		}
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}
	}
	
	@EventHandler()
	public void checkRanged(EntityShootBowEvent e) {
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
		for (ItemStack j : new Tools().t1s())
			if (Main.equals(item, j))
				req = 5;
		for (ItemStack j : new Tools().t2s())
			if (Main.equals(item, j))
				req = 10;
		for (ItemStack j : new Tools().t3s())
			if (Main.equals(item, j))
				req = 15;
		for (ItemStack j : new Tools().t4s())
			if (Main.equals(item, j))
				req = 20;
		for (ItemStack j : new Tools().t5s())
			if (Main.equals(item, j))
				req = 25;
		for (ItemStack j : new Tools().t6s())
			if (Main.equals(item, j))
				req = 30;
		for (ItemStack j : new Tools().t7s())
			if (Main.equals(item, j))
				req = 35;
		for (ItemStack j : new Tools().t8s())
			if (Main.equals(item, j))
				req = 40;
		for (ItemStack j : new Tools().t9s())
			if (Main.equals(item, j))
				req = 45;
		for (ItemStack j : new Tools().t10s())
			if (Main.equals(item, j))
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
			Material type = helmet.getType();
			
			if (!helmet.getItemMeta().hasLore()) {
				if (iron.contains(type))
					req = 10;
				if (diamond.contains(type))
					req = 20;
				if (netherite.contains(type))
					req = 30;
			}
			else {
				for (ItemStack j : new Armor().t1s())
					if (Main.equals(helmet, j))
						req = 5;
				for (ItemStack j : new Armor().t2s())
					if (Main.equals(helmet, j))
						req = 10;
				for (ItemStack j : new Armor().t3s())
					if (Main.equals(helmet, j))
						req = 15;
				for (ItemStack j : new Armor().t4s())
					if (Main.equals(helmet, j))
						req = 20;
				for (ItemStack j : new Armor().t5s())
					if (Main.equals(helmet, j))
						req = 25;
				for (ItemStack j : new Armor().t6s())
					if (Main.equals(helmet, j))
						req = 30;
				for (ItemStack j : new Armor().t7s())
					if (Main.equals(helmet, j))
						req = 35;
				for (ItemStack j : new Armor().t8s())
					if (Main.equals(helmet, j))
						req = 40;
				for (ItemStack j : new Armor().t9s())
					if (Main.equals(helmet, j))
						req = 45;
				for (ItemStack j : new Armor().t10s())
					if (Main.equals(helmet, j))
						req = 50;
				for (ItemStack j : new Armor().nots())
					if (Main.equals(helmet, j))
						req = 55;
				for (ItemStack j : new Armor().antis())
					if (Main.equals(helmet, j))
						req = 60;
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
			Material type = chestplate.getType();
			
			if (!chestplate.getItemMeta().hasLore()) {
				if (iron.contains(type))
					req = 10;
				if (diamond.contains(type))
					req = 20;
				if (netherite.contains(type))
					req = 30;
			}
			else {
				for (ItemStack j : new Armor().t1s())
					if (Main.equals(chestplate, j))
						req = 5;
				for (ItemStack j : new Armor().t2s())
					if (Main.equals(chestplate, j))
						req = 10;
				for (ItemStack j : new Armor().t3s())
					if (Main.equals(chestplate, j))
						req = 15;
				for (ItemStack j : new Armor().t4s())
					if (Main.equals(chestplate, j))
						req = 20;
				for (ItemStack j : new Armor().t5s())
					if (Main.equals(chestplate, j))
						req = 25;
				for (ItemStack j : new Armor().t6s())
					if (Main.equals(chestplate, j))
						req = 30;
				for (ItemStack j : new Armor().t7s())
					if (Main.equals(chestplate, j))
						req = 35;
				for (ItemStack j : new Armor().t8s())
					if (Main.equals(chestplate, j))
						req = 40;
				for (ItemStack j : new Armor().t9s())
					if (Main.equals(chestplate, j))
						req = 45;
				for (ItemStack j : new Armor().t10s())
					if (Main.equals(chestplate, j))
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
			Material type = leggings.getType();
			
			if (!leggings.getItemMeta().hasLore()) {
				if (iron.contains(type))
					req = 10;
				if (diamond.contains(type))
					req = 20;
				if (netherite.contains(type))
					req = 30;
			}
			else {
				for (ItemStack j : new Armor().t1s())
					if (Main.equals(leggings, j))
						req = 5;
				for (ItemStack j : new Armor().t2s())
					if (Main.equals(leggings, j))
						req = 10;
				for (ItemStack j : new Armor().t3s())
					if (Main.equals(leggings, j))
						req = 15;
				for (ItemStack j : new Armor().t4s())
					if (Main.equals(leggings, j))
						req = 20;
				for (ItemStack j : new Armor().t5s())
					if (Main.equals(leggings, j))
						req = 25;
				for (ItemStack j : new Armor().t6s())
					if (Main.equals(leggings, j))
						req = 30;
				for (ItemStack j : new Armor().t7s())
					if (Main.equals(leggings, j))
						req = 35;
				for (ItemStack j : new Armor().t8s())
					if (Main.equals(leggings, j))
						req = 40;
				for (ItemStack j : new Armor().t9s())
					if (Main.equals(leggings, j))
						req = 45;
				for (ItemStack j : new Armor().t10s())
					if (Main.equals(leggings, j))
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
			Material type = boots.getType();

			if (!boots.getItemMeta().hasLore()) {
				if (iron.contains(type))
					req = 10;
				if (diamond.contains(type))
					req = 20;
				if (netherite.contains(type))
					req = 30;
			}
			else {
				for (ItemStack j : new Armor().t1s())
					if (Main.equals(boots, j))
						req = 5;
				for (ItemStack j : new Armor().t2s())
					if (Main.equals(boots, j))
						req = 10;
				for (ItemStack j : new Armor().t3s())
					if (Main.equals(boots, j))
						req = 15;
				for (ItemStack j : new Armor().t4s())
					if (Main.equals(boots, j))
						req = 20;
				for (ItemStack j : new Armor().t5s())
					if (Main.equals(boots, j))
						req = 25;
				for (ItemStack j : new Armor().t6s())
					if (Main.equals(boots, j))
						req = 30;
				for (ItemStack j : new Armor().t7s())
					if (Main.equals(boots, j))
						req = 35;
				for (ItemStack j : new Armor().t8s())
					if (Main.equals(boots, j))
						req = 40;
				for (ItemStack j : new Armor().t9s())
					if (Main.equals(boots, j))
						req = 45;
				for (ItemStack j : new Armor().t10s())
					if (Main.equals(boots, j))
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
	public void checkOffHand(PlayerStatisticIncrementEvent e) {
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
				if (iron.contains(off.getType()))
					req = 10;
				if (diamond.contains(off.getType()))
					req = 20;
				if (netherite.contains(off.getType()))
					req = 30;
			}
			else {
				for (ItemStack j : new Tools().t1s())
					if (Main.equals(off, j))
						req = 5;
				for (ItemStack j : new Tools().t2s())
					if (Main.equals(off, j))
						req = 10;
				for (ItemStack j : new Tools().t3s())
					if (Main.equals(off, j))
						req = 15;
				for (ItemStack j : new Tools().t4s())
					if (Main.equals(off, j))
						req = 20;
				for (ItemStack j : new Tools().t5s())
					if (Main.equals(off, j))
						req = 25;
				for (ItemStack j : new Tools().t6s())
					if (Main.equals(off, j))
						req = 30;
				for (ItemStack j : new Tools().t7s())
					if (Main.equals(off, j))
						req = 35;
				for (ItemStack j : new Tools().t8s())
					if (Main.equals(off, j))
						req = 40;
				for (ItemStack j : new Tools().t9s())
					if (Main.equals(off, j))
						req = 45;
				for (ItemStack j : new Tools().t10s())
					if (Main.equals(off, j))
						req = 50;
				for (ItemStack j : new Armor().t1s())
					if (Main.equals(off, j))
						req = 5;
				for (ItemStack j : new Armor().t2s())
					if (Main.equals(off, j))
						req = 10;
				for (ItemStack j : new Armor().t3s())
					if (Main.equals(off, j))
						req = 15;
				for (ItemStack j : new Armor().t4s())
					if (Main.equals(off, j))
						req = 20;
				for (ItemStack j : new Armor().t5s())
					if (Main.equals(off, j))
						req = 25;
				for (ItemStack j : new Armor().t6s())
					if (Main.equals(off, j))
						req = 30;
				for (ItemStack j : new Armor().t7s())
					if (Main.equals(off, j))
						req = 35;
				for (ItemStack j : new Armor().t8s())
					if (Main.equals(off, j))
						req = 40;
				for (ItemStack j : new Armor().t9s())
					if (Main.equals(off, j))
						req = 45;
				for (ItemStack j : new Armor().t10s())
					if (Main.equals(off, j))
						req = 50;
				for (ItemStack j : new Armor().nots())
					if (Main.equals(off, j))
						req = 55;
				for (ItemStack j : new Armor().antis())
					if (Main.equals(off, j))
						req = 60;
			}
			if (lvl < req) {
				if (player.getInventory().firstEmpty() == -1) {
//						inventory is full				
					world.dropItemNaturally(loc, off);
					player.sendMessage(ChatColor.RED + "Your inventory is full!");
				}
				else player.getInventory().addItem(off);
				player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			}
		}
		if (player.getInventory().getItemInOffHand().getType().equals(Material.TRIDENT) && player.getInventory().getItemInOffHand().getItemMeta().hasLore())
			if (player.getInventory().getItemInOffHand().getItemMeta().hasEnchant(CustomEnchants.ROCKET)) {
				if (player.getInventory().firstEmpty() == -1) {
//					inventory is full				
					world.dropItemNaturally(loc, off);
					player.sendMessage(ChatColor.RED + "Your inventory is full!");
				}
				else player.getInventory().addItem(off);
				player.getInventory().setItemInOffHand(null);
				player.sendMessage(ChatColor.RED + "You can't hold this in your off hand!!");
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
			if (Main.equals(shield, new Tools().t5Shield()))
				req = 25;
			if (Main.equals(shield, new Tools().t8Shield()))
				req = 50;
			if (Main.equals(shield, new Tools().t10Shield()))
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
		if (Main.equals(item, new Tools().t9Range()))
				req = 45;
		if (Main.equals(item, new Tools().t10Range()))
				req = 50;
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
		}
	}
}
