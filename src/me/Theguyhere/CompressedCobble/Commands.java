package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.List;
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
	private final Resources r;
	private final Tools t;
	private final Armor a;
	
	public Commands(Resources r, Tools t, Armor a) {
		this.r = r;
		this.t = t;
		this.a = a;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		List<ItemStack> materials = new ArrayList<>();
		materials.add(new ItemStack(Material.COBBLESTONE));
		materials.add(r.t1());
		materials.add(r.t2());
		materials.add(r.t3());
		materials.add(r.t4());
		materials.add(r.t5());
		materials.add(r.t6());
		materials.add(r.t7());
		materials.add(r.t8());
		materials.add(r.t9());
		materials.add(r.t10());
		materials.add(r.not());
		materials.add(r.a());
		materials.add(new ItemStack(Material.STICK));
		materials.add(new ItemStack(Material.BLAZE_POWDER));
		materials.add(new ItemStack(Material.BLAZE_ROD));
		materials.add(new ItemStack(Material.END_ROD));
		materials.add(new ItemStack(Material.END_CRYSTAL));
		materials.add(new ItemStack(Material.STRING));
		materials.add(new ItemStack(Material.SLIME_BALL));
		materials.add(new ItemStack(Material.SPONGE));
		materials.add(new ItemStack(Material.NETHER_STAR));
		materials.add(new ItemStack(Material.IRON_BLOCK));
		materials.add(new ItemStack(Material.GOLD_BLOCK));
		materials.add(new ItemStack(Material.DIAMOND_BLOCK));
		materials.add(new ItemStack(Material.NETHERITE_BLOCK));
		materials.add(new ItemStack(Material.CONDUIT));
		materials.add(new ItemStack(Material.LEATHER));

		List<ItemStack> cobble = new ArrayList<>();
		cobble.add(new ItemStack(Material.COBBLESTONE));
		cobble.add(r.t1());
		cobble.add(r.t2());
		cobble.add(r.t3());
		cobble.add(r.t4());
		cobble.add(r.t5());
		cobble.add(r.t6());
		cobble.add(r.t7());
		cobble.add(r.t8());
		cobble.add(r.t9());
		cobble.add(r.t10());
		cobble.add(r.not());
		cobble.add(r.a());

		List<ItemStack> tools0 = new ArrayList<>();
		for (ItemStack item: t.t0s())
			tools0.add(item);
		for (ItemStack item: a.t0s())
			tools0.add(item);

		List<ItemStack> tools1 = new ArrayList<>();
		for (ItemStack item: t.t1s())
			tools1.add(item);
		for (ItemStack item: a.t1s())
			tools1.add(item);
		tools1.add(new ItemStack(Material.SHIELD));

		List<ItemStack> tools2 = new ArrayList<>();
		for (ItemStack item: t.t2s())
			tools2.add(item);
		for (ItemStack item: a.t2s())
			tools2.add(item);
		tools2.add(new ItemStack(Material.SHIELD));

		List<ItemStack> tools3 = new ArrayList<>();
		for (ItemStack item: t.t3s())
			tools3.add(item);
		for (ItemStack item: a.t3s())
			tools3.add(item);
		tools3.add(new ItemStack(Material.SHIELD));

		List<ItemStack> tools4 = new ArrayList<>();
		for (ItemStack item: t.t4s())
			tools4.add(item);
		for (ItemStack item: a.t4s())
			tools4.add(item);
		tools4.add(new ItemStack(Material.SHIELD));

		List<ItemStack> tools5 = new ArrayList<>();
		for (ItemStack item: t.t5s())
			tools5.add(item);
		for (ItemStack item: a.t5s())
			tools5.add(item);

		List<ItemStack> tools6 = new ArrayList<>();
		for (ItemStack item: t.t6s())
			tools6.add(item);
		for (ItemStack item: a.t6s())
			tools6.add(item);
		tools6.add(t.t5Shield());

		List<ItemStack> tools7 = new ArrayList<>();
		for (ItemStack item: t.t7s())
			tools7.add(item);
		for (ItemStack item: a.t7s())
			tools7.add(item);
		tools7.add(t.t5Shield());

		List<ItemStack> tools8 = new ArrayList<>();
		for (ItemStack item: t.t8s())
			tools8.add(item);
		for (ItemStack item: a.t8s())
			tools8.add(item);

		List<ItemStack> tools9 = new ArrayList<>();
		for (ItemStack item: t.t9s())
			tools9.add(item);
		for (ItemStack item: a.t9s())
			tools9.add(item);
		tools9.add(t.t8Shield());

		List<ItemStack> tools10 = new ArrayList<>();
		for (ItemStack item: t.t10s())
			tools10.add(item);
		for (ItemStack item: a.t10s())
			tools10.add(item);

		if (label.equalsIgnoreCase("cc")) {
			// Check if player sent command
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
					player.sendMessage(ChatColor.RED + "You do not have permission!");
					return true;
				}
	
				for (ItemStack item : materials)
					Main.giveItem(player, world, loc, item);
				player.sendMessage(ChatColor.GOLD + "Materials given!");
				return true;
			}

			//	Give cobble
			if (args[0].equalsIgnoreCase("cobble")) {
				if (!player.hasPermission("cc.materials.use")) {
					player.sendMessage(ChatColor.RED + "You do not have permission!");
					return true;
				}

				for (ItemStack item : cobble)
					Main.giveItem(player, world, loc, item);
				player.sendMessage(ChatColor.GOLD + "Materials given!");
				return true;
			}

//		Give tools of different levels
			if (args[0].equalsIgnoreCase("tools")) {
				if (!player.hasPermission("cc.tools.use")) {
					player.sendMessage(ChatColor.RED + "You do not have permission!");
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
					} else if (value >= 177147) {
						value -= 177147;
						Main.giveItem(player, world, loc, r.not());
					} else if (value >= 59049) {
						value -= 59049;
						Main.giveItem(player, world, loc, r.t10());
					} else if (value >= 19683) {
						value -= 19683;
						Main.giveItem(player, world, loc, r.t9());
					} else if (value >= 6561) {
						value -= 6561;
						Main.giveItem(player, world, loc, r.t8());
					} else if (value >= 2187) {
						value -= 2187;
						Main.giveItem(player, world, loc, r.t7());
					} else if (value >= 729) {
						value -= 729;
						Main.giveItem(player, world, loc, r.t6());
					} else if (value >= 243) {
						value -= 243;
						Main.giveItem(player, world, loc, r.t5());
					} else if (value >= 81) {
						value -= 81;
						Main.giveItem(player, world, loc, r.t4());
					} else if (value >= 27) {
						value -= 27;
						Main.giveItem(player, world, loc, r.t3());
					} else if (value >= 9) {
						value -= 9;
						Main.giveItem(player, world, loc, r.t2());
					} else if (value >= 3) {
						value -= 3;
						Main.giveItem(player, world, loc, r.t1());
					} else {
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
