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
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.COBBLESTONE));
		items.add(new Resources().t1());
		items.add(new Resources().t2());
		items.add(new Resources().t3());
		items.add(new Resources().t4());
		items.add(new Resources().t5());
		items.add(new Resources().t6());
		items.add(new Resources().t7());
		items.add(new Resources().t8());
		items.add(new Resources().t9());
		items.add(new Resources().t10());
		items.add(new Resources().not());
		items.add(new Resources().a());
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

		ArrayList<ItemStack> tools = new ArrayList<ItemStack>();
		tools.add(new Tools().t10Pick());
		tools.add(new Tools().t10Axe());
		tools.add(new Tools().t10Spade());
		tools.add(new Tools().t10Hoe());
		tools.add(new Tools().t10Sword());
		tools.add(new Tools().t10Range());
		tools.add(new Tools().t8Range());
		tools.add(new Tools().t6Range());
		tools.add(new Armor().t10Helmet());
		tools.add(new Armor().t10Chestplate());
		tools.add(new Armor().t10Leggings());
		tools.add(new Armor().t10Boots());
		tools.add(new Armor().t10Elytra());
		tools.add(new Tools().t10Shield());
		tools.add(new Armor().notHelmet());
		tools.add(new Armor().aHelmet());

//		Give materials
		if (label.equalsIgnoreCase("ccmaterials")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Bad console!");
				return true;
			}
			Player player = (Player) sender;
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			if (!player.hasPermission("ccmaterials.use")) {
				player.sendMessage(ChatColor.RED + "You do not have permision!");
				return true;
			}

			for (ItemStack item : items) {
				if (player.getInventory().firstEmpty() == -1) {
//					inventory is full				
					world.dropItemNaturally(loc, item);
				}
				player.getInventory().addItem(item);
			}
			player.sendMessage(ChatColor.GOLD + "Materials given!");
			return true;
		}
		
//		Give tools
		if (label.equalsIgnoreCase("cctools")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Bad console!");
				return true;
			}
			Player player = (Player) sender;
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			if (!player.hasPermission("cctools.use")) {
				player.sendMessage(ChatColor.RED + "You do not have permision!");
				return true;
			}
			
			for (ItemStack tool : tools) {
				if (player.getInventory().firstEmpty() == -1) {
//					inventory is full				
					world.dropItemNaturally(loc, tool);
				}
				player.getInventory().addItem(tool);
			}
			player.setLevel(60);
			player.sendMessage(ChatColor.GOLD + "Tools given!");
			return true;
		}
		
//		Redirects to wiki
		if (label.equalsIgnoreCase("cchelp")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Go to https://github.com/Theguyhere0/compressed-cobblestone/wiki");
				return true;
			}
			Player player = (Player) sender;
			TextComponent message = new TextComponent("Visit the wiki!");
			message.setBold(true);
			message.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://github.com/Theguyhere0/compressed-cobblestone/wiki"));
			player.spigot().sendMessage(message);
			return true;
		}
		
//		Converts cobblestone to higher tiers
		if (label.equalsIgnoreCase("cccraft")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Bad console!");
				return true;
			}
			Player player = (Player) sender;
			Location loc = player.getLocation();
			World world = player.getWorld();			
			int value = 0;
			
//			Add cobble equivalent and remove from inventory
			Set<Integer> cobbleKeys = player.getInventory().all(Material.COBBLESTONE).keySet();
			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.COBBLESTONE).get(i);
				value += item.getAmount();
				player.getInventory().clear(i);
			}
			
			cobbleKeys = player.getInventory().all(Material.BASALT).keySet();
			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BASALT).get(i);
				if (Main.equals(item, new Resources().t1())) {
					value += 3 * item.getAmount();
					player.getInventory().clear(i);
				}
			}
			
			cobbleKeys = player.getInventory().all(Material.BLACKSTONE).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BLACKSTONE).get(i);
				if (Main.equals(item, new Resources().t2())) {
					value += 9 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.OBSIDIAN).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.OBSIDIAN).get(i);
				if (Main.equals(item, new Resources().t3())) {
					value += 27 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.GILDED_BLACKSTONE).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.GILDED_BLACKSTONE).get(i);
				if (Main.equals(item, new Resources().t4())) {
					value += 81 * item.getAmount();
					player.getInventory().clear(i);
				}
			}
			
			cobbleKeys = player.getInventory().all(Material.GLOWSTONE).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.GLOWSTONE).get(i);
				if (Main.equals(item, new Resources().t5())) {
					value += 243 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.MAGMA_BLOCK).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.MAGMA_BLOCK).get(i);
				if (Main.equals(item, new Resources().t6())) {
					value += 729 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.CRYING_OBSIDIAN).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.CRYING_OBSIDIAN).get(i);
				if (Main.equals(item, new Resources().t7())) {
					value += 2187 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.ANCIENT_DEBRIS).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.ANCIENT_DEBRIS).get(i);
				if (Main.equals(item, new Resources().t8())) {
					value += 6561 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.BEDROCK).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BEDROCK).get(i);
				if (Main.equals(item, new Resources().t9())) {
					value += 19683 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

			cobbleKeys = player.getInventory().all(Material.END_PORTAL_FRAME).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.END_PORTAL_FRAME).get(i);
				if (Main.equals(item, new Resources().t10())) {
					value += 59049 * item.getAmount();
					player.getInventory().clear(i);
				}
			}
			
			cobbleKeys = player.getInventory().all(Material.BARRIER).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BARRIER).get(i);
				if (Main.equals(item, new Resources().not())) {
					value += 177147 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.COMMAND_BLOCK).keySet();

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.COMMAND_BLOCK).get(i);
				if (Main.equals(item, new Resources().a())) {
					value += 531441 * item.getAmount();
					player.getInventory().clear(i);
				}
			}

//			Convert to higher tier and add back to inventory
			while (value > 0) {
				if (value >= 531441) {
					value -= 531441;
					ItemStack i = new Resources().a();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 177147 && value < 531441) {
					value -= 177147;
					ItemStack i = new Resources().not();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 59049 && value < 177147) {
					value -= 59049;
					ItemStack i = new Resources().t10();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 19683 && value < 59049) {
					value -= 19683;
					ItemStack i = new Resources().t9();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 6561 && value < 19683) {
					value -= 6561;
					ItemStack i = new Resources().t8();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 2187 && value < 6561) {
					value -= 2187;
					ItemStack i = new Resources().t7();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 729 && value < 2187) {
					value -= 729;
					ItemStack i = new Resources().t6();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 243 && value < 729) {
					value -= 243;
					ItemStack i = new Resources().t5();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 81 && value < 243) {
					value -= 81;
					ItemStack i = new Resources().t4();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 27 && value < 81) {
					value -= 27;
					ItemStack i = new Resources().t3();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 9 && value < 27) {
					value -= 9;
					ItemStack i = new Resources().t2();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value >= 3 && value < 9) {
					value -= 3;
					ItemStack i = new Resources().t1();
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
				if (value > 0 && value < 3) {
					value -= 1;
					ItemStack i = new ItemStack(Material.COBBLESTONE);
					if (player.getInventory().firstEmpty() == -1 && player.getInventory().first(i.getType()) == -1) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					if ((player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
							player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0) {
//						inventory is full				
						world.dropItemNaturally(loc, i);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
					}
					else {
						player.getInventory().addItem(i);
					}
				}
			}
			player.sendMessage(ChatColor.GREEN + "Cobble crafted!");
			return true;
		}
		return false;
	}
}
