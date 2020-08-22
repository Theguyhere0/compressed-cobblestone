package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.Set;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.Theguyhere.CompressedCobble.items.Armor;
import me.Theguyhere.CompressedCobble.items.Resources;
import me.Theguyhere.CompressedCobble.items.Tools;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class Commands implements CommandExecutor {
	private Resources r;
	private Tools t;
	private Armor a;
	
	public Commands(Resources r, Tools t, Armor a) {
		this.r = r;
		this.t = t;
		this.a = a;
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.COBBLESTONE));
		items.add(r.t1());
		items.add(r.t2());
		items.add(r.t3());
		items.add(r.t4());
		items.add(r.t5());
		items.add(r.t6());
		items.add(r.t7());
		items.add(r.t8());
		items.add(r.t9());
		items.add(r.t10());
		items.add(r.not());
		items.add(r.a());
		items.add(new ItemStack(Material.STICK));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(new ItemStack(Material.END_ROD));
		items.add(new ItemStack(Material.END_CRYSTAL));
		items.add(new ItemStack(Material.STRING));
		items.add(new ItemStack(Material.SLIME_BALL));
		items.add(new ItemStack(Material.SPONGE));
		items.add(new ItemStack(Material.NETHER_STAR));
		items.add(new ItemStack(Material.IRON_BLOCK));
		items.add(new ItemStack(Material.GOLD_BLOCK));
		items.add(new ItemStack(Material.DIAMOND_BLOCK));
		items.add(new ItemStack(Material.NETHERITE_BLOCK));
		items.add(new ItemStack(Material.CONDUIT));
		items.add(new ItemStack(Material.LEATHER));

		ArrayList<ItemStack> tools0 = new ArrayList<ItemStack>();
		tools0.add(new ItemStack(Material.STONE_PICKAXE));
		tools0.add(new ItemStack(Material.STONE_AXE));
		tools0.add(new ItemStack(Material.STONE_SHOVEL));
		tools0.add(new ItemStack(Material.STONE_HOE));
		tools0.add(new ItemStack(Material.STONE_SWORD));
		tools0.add(new ItemStack(Material.BOW));
		tools0.add(new ItemStack(Material.SHIELD));
		tools0.add(new ItemStack(Material.LEATHER_HELMET));
		tools0.add(new ItemStack(Material.LEATHER_CHESTPLATE));
		tools0.add(new ItemStack(Material.LEATHER_LEGGINGS));
		tools0.add(new ItemStack(Material.LEATHER_BOOTS));
		ArrayList<ItemStack> tools1 = new ArrayList<ItemStack>();
		tools1.add(t.t1Pick());
		tools1.add(t.t1Axe());
		tools1.add(t.t1Spade());
		tools1.add(t.t1Hoe());
		tools1.add(t.t1Sword());
		tools1.add(t.t1Range());
		tools1.add(new ItemStack(Material.SHIELD));
		tools1.add(a.t1Helmet());
		tools1.add(a.t1Chestplate());
		tools1.add(a.t1Leggings());
		tools1.add(a.t1Boots());
		ArrayList<ItemStack> tools2 = new ArrayList<ItemStack>();
		tools2.add(t.t2Pick());
		tools2.add(t.t2Axe());
		tools2.add(t.t2Spade());
		tools2.add(t.t2Hoe());
		tools2.add(t.t2Sword());
		tools2.add(t.t2Range());
		tools2.add(new ItemStack(Material.SHIELD));
		tools2.add(a.t2Helmet());
		tools2.add(a.t2Chestplate());
		tools2.add(a.t2Leggings());
		tools2.add(a.t2Boots());
		ArrayList<ItemStack> tools3 = new ArrayList<ItemStack>();
		tools3.add(t.t3Pick());
		tools3.add(t.t3Axe());
		tools3.add(t.t3Spade());
		tools3.add(t.t3Hoe());
		tools3.add(t.t3Sword());
		tools3.add(t.t3Range());
		tools3.add(new ItemStack(Material.SHIELD));
		tools3.add(a.t3Helmet());
		tools3.add(a.t3Chestplate());
		tools3.add(a.t3Leggings());
		tools3.add(a.t3Boots());
		ArrayList<ItemStack> tools4 = new ArrayList<ItemStack>();
		tools4.add(t.t4Pick());
		tools4.add(t.t4Axe());
		tools4.add(t.t4Spade());
		tools4.add(t.t4Hoe());
		tools4.add(t.t4Sword());
		tools4.add(t.t4Range());
		tools4.add(new ItemStack(Material.SHIELD));
		tools4.add(a.t4Helmet());
		tools4.add(a.t4Chestplate());
		tools4.add(a.t4Leggings());
		tools4.add(a.t4Boots());
		ArrayList<ItemStack> tools5 = new ArrayList<ItemStack>();
		tools5.add(t.t5Pick());
		tools5.add(t.t5Axe());
		tools5.add(t.t5Spade());
		tools5.add(t.t5Hoe());
		tools5.add(t.t5Sword());
		tools5.add(t.t5Range());
		tools5.add(t.t5Shield());
		tools5.add(a.t5Helmet());
		tools5.add(a.t5Chestplate());
		tools5.add(a.t5Leggings());
		tools5.add(a.t5Boots());
		ArrayList<ItemStack> tools6 = new ArrayList<ItemStack>();
		tools6.add(t.t6Pick());
		tools6.add(t.t6Axe());
		tools6.add(t.t6Spade());
		tools6.add(t.t6Hoe());
		tools6.add(t.t6Sword());
		tools6.add(t.t6Range());
		tools6.add(t.t5Shield());
		tools6.add(a.t6Helmet());
		tools6.add(a.t6Chestplate());
		tools6.add(a.t6Leggings());
		tools6.add(a.t6Boots());
		ArrayList<ItemStack> tools7 = new ArrayList<ItemStack>();
		tools7.add(t.t7Pick());
		tools7.add(t.t7Axe());
		tools7.add(t.t7Spade());
		tools7.add(t.t7Hoe());
		tools7.add(t.t7Sword());
		tools7.add(t.t7Range());
		tools7.add(t.t5Shield());
		tools7.add(a.t7Helmet());
		tools7.add(a.t7Chestplate());
		tools7.add(a.t7Leggings());
		tools7.add(a.t7Boots());
		ArrayList<ItemStack> tools8 = new ArrayList<ItemStack>();
		tools8.add(t.t8Pick());
		tools8.add(t.t8Axe());
		tools8.add(t.t8Spade());
		tools8.add(t.t8Hoe());
		tools8.add(t.t8Sword());
		tools8.add(t.t8Range());
		tools8.add(t.t8Shield());
		tools8.add(a.t8Helmet());
		tools8.add(a.t8Chestplate());
		tools8.add(a.t8Leggings());
		tools8.add(a.t8Boots());
		ArrayList<ItemStack> tools9 = new ArrayList<ItemStack>();
		tools9.add(t.t9Pick());
		tools9.add(t.t9Axe());
		tools9.add(t.t9Spade());
		tools9.add(t.t9Hoe());
		tools9.add(t.t9Sword());
		tools9.add(t.t9Range());
		tools9.add(t.t8Shield());
		tools9.add(a.t9Helmet());
		tools9.add(a.t9Chestplate());
		tools9.add(a.t9Leggings());
		tools9.add(a.t9Boots());
		tools9.add(a.t9Elytra());
		ArrayList<ItemStack> tools10 = new ArrayList<ItemStack>();
		tools10.add(t.t10Pick());
		tools10.add(t.t10Axe());
		tools10.add(t.t10Spade());
		tools10.add(t.t10Hoe());
		tools10.add(t.t10Sword());
		tools10.add(t.t10Range());
		tools10.add(t.t10Shield());
		tools10.add(a.t10Helmet());
		tools10.add(a.t10Chestplate());
		tools10.add(a.t10Leggings());
		tools10.add(a.t10Boots());
		tools10.add(a.t10Elytra());

		if (label.equalsIgnoreCase("cc")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Bad console!");
				return true;
			}
			Player player = (Player) sender;
			Location loc = player.getLocation();
			World world = player.getWorld();
			
//			No arguments
			if (args.length == 0) {
				player.sendMessage(ChatColor.GOLD + "Please use /cc [argument]. Use /cc help for more info.");
				return true;
			}
//			Give materials

			if (args[0].equalsIgnoreCase("materials")) {
				if (!player.hasPermission("cc.materials.use")) {
					player.sendMessage(ChatColor.RED + "You do not have permision!");
					return true;
				}
	
				for (ItemStack item : items)
					Main.giveItem(player, world, loc, item);
				player.sendMessage(ChatColor.GOLD + "Materials given!");
				return true;
			}
		
//		Give tools of different levels
			if (args[0].equalsIgnoreCase("tools")) {
				if (!player.hasPermission("cc.tools.use")) {
					player.sendMessage(ChatColor.RED + "You do not have permision!");
					return true;
				}
				if (args.length < 2) {
					player.sendMessage(ChatColor.GOLD + "Please use /cc tools [tier]. Use /cc help for more info.");
					return true;
				}
				if (args[1].equalsIgnoreCase("t0")) {
					for (ItemStack tool : tools0)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(5);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t1")) {
					for (ItemStack tool : tools1)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(5);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t2")) {
					for (ItemStack tool : tools2)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(10);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t3")) {
					for (ItemStack tool : tools3)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(15);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t4")) {
					for (ItemStack tool : tools4)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(20);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t5")) {
					for (ItemStack tool : tools5)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(25);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t6")) {
					for (ItemStack tool : tools6)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(30);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t7")) {
					for (ItemStack tool : tools7)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(35);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t8")) {
					for (ItemStack tool : tools8)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(40);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t9")) {
					for (ItemStack tool : tools9)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(45);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("t10")) {
					for (ItemStack tool : tools10)
						Main.giveItem(player, world, loc, tool);
					player.setLevel(50);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("not")) {
					Main.giveItem(player, world, loc, a.notHelmet());
					player.setLevel(55);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				if (args[1].equalsIgnoreCase("anti")) {
					Main.giveItem(player, world, loc, a.aHelmet());
					player.setLevel(60);
					player.sendMessage(ChatColor.GOLD + "Tools given!");
					return true;
				}
				player.sendMessage(ChatColor.RED + "Command was invalid!");
				return true;
			}
		
//		Redirects to wiki
			if (args[0].equalsIgnoreCase("help")) {
				player.sendMessage(ChatColor.GOLD + "For more information, click below to visit the wiki!");
				TextComponent message = new TextComponent("Visit the wiki!");
				message.setBold(true);
				message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/Theguyhere0/compressed-cobblestone/wiki"));
				player.spigot().sendMessage(message);
				return true;
			}
		
//		Converts cobblestone to higher tiers
			if (args[0].equalsIgnoreCase("craft")) {
				int value = 0;
				
	//			Add cobble equivalent and remove from inventory
				Set<Integer> cobbleKeys = player.getInventory().all(Material.COBBLESTONE).keySet();
				value += getCobble(cobbleKeys, player, 1, new ItemStack(Material.COBBLESTONE));
				
				cobbleKeys = player.getInventory().all(r.t1().getType()).keySet();
				value += getCobble(cobbleKeys, player, 3, r.t1());
				
				cobbleKeys = player.getInventory().all(r.t2().getType()).keySet();
				value += getCobble(cobbleKeys, player, 9, r.t2());
	
				cobbleKeys = player.getInventory().all(r.t3().getType()).keySet();
				value += getCobble(cobbleKeys, player, 27, r.t3());
	
				cobbleKeys = player.getInventory().all(r.t4().getType()).keySet();
				value += getCobble(cobbleKeys, player, 81, r.t4());
	
				cobbleKeys = player.getInventory().all(r.t5().getType()).keySet();
				value += getCobble(cobbleKeys, player, 243, r.t5());
	
				cobbleKeys = player.getInventory().all(r.t6().getType()).keySet();
				value += getCobble(cobbleKeys, player, 729, r.t6());
	
				cobbleKeys = player.getInventory().all(r.t7().getType()).keySet();
				value += getCobble(cobbleKeys, player, 2187, r.t7());
	
				cobbleKeys = player.getInventory().all(r.t8().getType()).keySet();
				value += getCobble(cobbleKeys, player, 6561, r.t8());
	
				cobbleKeys = player.getInventory().all(r.t9().getType()).keySet();
				value += getCobble(cobbleKeys, player, 19683, r.t9());
	
				cobbleKeys = player.getInventory().all(r.t10().getType()).keySet();
				value += getCobble(cobbleKeys, player, 59049, r.t10());
				
				cobbleKeys = player.getInventory().all(r.not().getType()).keySet();
				value += getCobble(cobbleKeys, player, 177147, r.not());
	
	//			Convert to higher tier and add back to inventory
				if (value == 0) {
					player.sendMessage(ChatColor.RED + "No cobblestone resources found.");
					return true;
				}
				
				while (value > 0) {
					if (value >= 531441) {
						value -= 531441;
						Main.giveItem(player, world, loc, r.a());
					}
					if (value >= 177147 && value < 531441) {
						value -= 177147;
						Main.giveItem(player, world, loc, r.not());
					}
					if (value >= 59049 && value < 177147) {
						value -= 59049;
						Main.giveItem(player, world, loc, r.t10());
					}
					if (value >= 19683 && value < 59049) {
						value -= 19683;
						Main.giveItem(player, world, loc, r.t9());
					}
					if (value >= 6561 && value < 19683) {
						value -= 6561;
						Main.giveItem(player, world, loc, r.t8());
					}
					if (value >= 2187 && value < 6561) {
						value -= 2187;
						Main.giveItem(player, world, loc, r.t7());
					}
					if (value >= 729 && value < 2187) {
						value -= 729;
						Main.giveItem(player, world, loc, r.t6());
					}
					if (value >= 243 && value < 729) {
						value -= 243;
						Main.giveItem(player, world, loc, r.t5());
					}
					if (value >= 81 && value < 243) {
						value -= 81;
						Main.giveItem(player, world, loc, r.t4());
					}
					if (value >= 27 && value < 81) {
						value -= 27;
						Main.giveItem(player, world, loc, r.t3());
					}
					if (value >= 9 && value < 27) {
						value -= 9;
						Main.giveItem(player, world, loc, r.t2());
					}
					if (value >= 3 && value < 9) {
						value -= 3;
						Main.giveItem(player, world, loc, r.t1());
					}
					if (value > 0 && value < 3) {
						value -= 1;
						Main.giveItem(player, world, loc, new ItemStack(Material.COBBLESTONE));
					}
				}
				player.sendMessage(ChatColor.GREEN + "Cobble crafted!");
				return true;
			}
			player.sendMessage(ChatColor.RED + "Command was invalid!");
			return true;
		}
		return false;
	}
		
	private int getCobble(Set<Integer> cobbleKeys, Player player, int n, ItemStack c) {
		int value = 0;
		for (int i : cobbleKeys) {
			ItemStack item = player.getInventory().all(c.getType()).get(i);
			if (Main.equals(item, c)) {
				value += n * item.getAmount();
				player.getInventory().clear(i);
			}
		}
		return value;
	}
}
