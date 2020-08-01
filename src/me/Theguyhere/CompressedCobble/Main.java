package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;
import me.Theguyhere.CompressedCobble.enchants.EnchantEvents;
import me.Theguyhere.CompressedCobble.items.Resources;
import me.Theguyhere.CompressedCobble.items.Tools;

public class Main extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
//		Resources
		Bukkit.addRecipe(cobbleConversion());
		Bukkit.addRecipe(netherrackConversion());
		Bukkit.addRecipe(coalConversion());
		Bukkit.addRecipe(redstoneConversion());
		Bukkit.addRecipe(quartzConversion());
		Bukkit.addRecipe(lapisConversion());
		Bukkit.addRecipe(ironConversion());
		Bukkit.addRecipe(goldConversion());
		Bukkit.addRecipe(emeraldConversion());
		Bukkit.addRecipe(diamondConversion());
		Bukkit.addRecipe(netheriteConversion());
		Bukkit.addRecipe(c0p5Recipe());
		Bukkit.addRecipe(c0p5BackRecipe());
		Bukkit.addRecipe(c1Recipe());
		Bukkit.addRecipe(c1AltRecipe());
		Bukkit.addRecipe(c1BackRecipe());
		Bukkit.addRecipe(c1p5Recipe());
		Bukkit.addRecipe(c1p5AltRecipe());
		Bukkit.addRecipe(c1p5BackRecipe());
		Bukkit.addRecipe(c2Recipe());
		Bukkit.addRecipe(c2AltRecipe());
		Bukkit.addRecipe(c2BackRecipe());
		Bukkit.addRecipe(c2p5Recipe());
		Bukkit.addRecipe(c2p5AltRecipe());
		Bukkit.addRecipe(c2p5BackRecipe());
		Bukkit.addRecipe(c3Recipe());
		Bukkit.addRecipe(c3AltRecipe());
		Bukkit.addRecipe(c3BackRecipe());
		Bukkit.addRecipe(c3p5Recipe());
		Bukkit.addRecipe(c3p5AltRecipe());
		Bukkit.addRecipe(c3p5BackRecipe());
		Bukkit.addRecipe(c4Recipe());
		Bukkit.addRecipe(c4AltRecipe());
		Bukkit.addRecipe(c4BackRecipe());
		Bukkit.addRecipe(c4p5Recipe());
		Bukkit.addRecipe(c4p5AltRecipe());
		Bukkit.addRecipe(c4p5BackRecipe());
		Bukkit.addRecipe(c5Recipe());
		Bukkit.addRecipe(c5AltRecipe());
		Bukkit.addRecipe(c5BackRecipe());
		
//		Tools
		Bukkit.addRecipe(shieldRecipe());
		Bukkit.addRecipe(c0p5PickRecipe());
		Bukkit.addRecipe(c1PickRecipe());
		Bukkit.addRecipe(c1p5PickRecipe());
		Bukkit.addRecipe(c2PickRecipe());
		Bukkit.addRecipe(c2p5PickRecipe());
		Bukkit.addRecipe(c3PickRecipe());
		Bukkit.addRecipe(c3p5PickRecipe());
		Bukkit.addRecipe(c4PickRecipe());
		Bukkit.addRecipe(c4p5PickRecipe());
		Bukkit.addRecipe(c5PickRecipe());
		Bukkit.addRecipe(c0p5AxeRecipe());
		Bukkit.addRecipe(c1AxeRecipe());
		Bukkit.addRecipe(c1p5AxeRecipe());
		Bukkit.addRecipe(c2AxeRecipe());
		Bukkit.addRecipe(c2p5AxeRecipe());
		Bukkit.addRecipe(c3AxeRecipe());
		Bukkit.addRecipe(c3p5AxeRecipe());
		Bukkit.addRecipe(c4AxeRecipe());
		Bukkit.addRecipe(c4p5AxeRecipe());
		Bukkit.addRecipe(c5AxeRecipe());
		Bukkit.addRecipe(c0p5SpadeRecipe());
		Bukkit.addRecipe(c1SpadeRecipe());
		Bukkit.addRecipe(c1p5SpadeRecipe());
		Bukkit.addRecipe(c2SpadeRecipe());
		Bukkit.addRecipe(c2p5SpadeRecipe());
		Bukkit.addRecipe(c3SpadeRecipe());
		Bukkit.addRecipe(c3p5SpadeRecipe());
		Bukkit.addRecipe(c4SpadeRecipe());
		Bukkit.addRecipe(c4p5SpadeRecipe());
		Bukkit.addRecipe(c5SpadeRecipe());
		Bukkit.addRecipe(c0p5HoeRecipe());
		Bukkit.addRecipe(c1HoeRecipe());
		Bukkit.addRecipe(c1p5HoeRecipe());
		Bukkit.addRecipe(c2HoeRecipe());
		Bukkit.addRecipe(c2p5HoeRecipe());
		Bukkit.addRecipe(c3HoeRecipe());
		Bukkit.addRecipe(c3p5HoeRecipe());
		Bukkit.addRecipe(c4HoeRecipe());
		Bukkit.addRecipe(c4p5HoeRecipe());
		Bukkit.addRecipe(c5HoeRecipe());
		Bukkit.addRecipe(c0p5SwordRecipe());
		Bukkit.addRecipe(c1SwordRecipe());
		Bukkit.addRecipe(c1p5SwordRecipe());
		Bukkit.addRecipe(c2SwordRecipe());
		Bukkit.addRecipe(c2p5SwordRecipe());
		Bukkit.addRecipe(c3SwordRecipe());
		Bukkit.addRecipe(c3p5SwordRecipe());
		Bukkit.addRecipe(c4SwordRecipe());
		Bukkit.addRecipe(c4p5SwordRecipe());
		Bukkit.addRecipe(c5SwordRecipe());
		Bukkit.addRecipe(c0p5RangeRecipe());
		Bukkit.addRecipe(c1RangeRecipe());
		Bukkit.addRecipe(c1p5RangeRecipe());
		Bukkit.addRecipe(c2RangeRecipe());
		Bukkit.addRecipe(c2p5RangeRecipe());
		Bukkit.addRecipe(c3RangeRecipe());
		Bukkit.addRecipe(c3p5RangeRecipe());
		Bukkit.addRecipe(c4RangeRecipe());
		Bukkit.addRecipe(c4p5RangeRecipe());
		Bukkit.addRecipe(c5RangeRecipe());

//		Armor
		Bukkit.addRecipe(c0p5HelmetRecipe());
		Bukkit.addRecipe(c1HelmetRecipe());
		Bukkit.addRecipe(c1p5HelmetRecipe());
		Bukkit.addRecipe(c2HelmetRecipe());
		Bukkit.addRecipe(c2p5HelmetRecipe());
		Bukkit.addRecipe(c3HelmetRecipe());
		Bukkit.addRecipe(c3p5HelmetRecipe());
		Bukkit.addRecipe(c4HelmetRecipe());
		Bukkit.addRecipe(c4p5HelmetRecipe());
		Bukkit.addRecipe(c5HelmetRecipe());
		Bukkit.addRecipe(c0p5HelmetAltRecipe());
		Bukkit.addRecipe(c1HelmetAltRecipe());
		Bukkit.addRecipe(c1p5HelmetAltRecipe());
		Bukkit.addRecipe(c2HelmetAltRecipe());
		Bukkit.addRecipe(c2p5HelmetAltRecipe());
		Bukkit.addRecipe(c3HelmetAltRecipe());
		Bukkit.addRecipe(c3p5HelmetAltRecipe());
		Bukkit.addRecipe(c4HelmetAltRecipe());
		Bukkit.addRecipe(c4p5HelmetAltRecipe());
		Bukkit.addRecipe(c5HelmetAltRecipe());
		Bukkit.addRecipe(c0p5ChestplateRecipe());
		Bukkit.addRecipe(c1ChestplateRecipe());
		Bukkit.addRecipe(c1p5ChestplateRecipe());
		Bukkit.addRecipe(c2ChestplateRecipe());
		Bukkit.addRecipe(c2p5ChestplateRecipe());
		Bukkit.addRecipe(c3ChestplateRecipe());
		Bukkit.addRecipe(c3p5ChestplateRecipe());
		Bukkit.addRecipe(c4ChestplateRecipe());
		Bukkit.addRecipe(c4p5ChestplateRecipe());
		Bukkit.addRecipe(c5ChestplateRecipe());
		Bukkit.addRecipe(c0p5LeggingsRecipe());
		Bukkit.addRecipe(c1LeggingsRecipe());
		Bukkit.addRecipe(c1p5LeggingsRecipe());
		Bukkit.addRecipe(c2LeggingsRecipe());
		Bukkit.addRecipe(c2p5LeggingsRecipe());
		Bukkit.addRecipe(c3LeggingsRecipe());
		Bukkit.addRecipe(c3p5LeggingsRecipe());
		Bukkit.addRecipe(c4LeggingsRecipe());
		Bukkit.addRecipe(c4p5LeggingsRecipe());
		Bukkit.addRecipe(c5LeggingsRecipe());
		Bukkit.addRecipe(c0p5BootsRecipe());
		Bukkit.addRecipe(c1BootsRecipe());
		Bukkit.addRecipe(c1p5BootsRecipe());
		Bukkit.addRecipe(c2BootsRecipe());
		Bukkit.addRecipe(c2p5BootsRecipe());
		Bukkit.addRecipe(c3BootsRecipe());
		Bukkit.addRecipe(c3p5BootsRecipe());
		Bukkit.addRecipe(c4BootsRecipe());
		Bukkit.addRecipe(c4p5BootsRecipe());
		Bukkit.addRecipe(c5BootsRecipe());
		Bukkit.addRecipe(c0p5BootsAltRecipe());
		Bukkit.addRecipe(c1BootsAltRecipe());
		Bukkit.addRecipe(c1p5BootsAltRecipe());
		Bukkit.addRecipe(c2BootsAltRecipe());
		Bukkit.addRecipe(c2p5BootsAltRecipe());
		Bukkit.addRecipe(c3BootsAltRecipe());
		Bukkit.addRecipe(c3p5BootsAltRecipe());
		Bukkit.addRecipe(c4BootsAltRecipe());
		Bukkit.addRecipe(c4p5BootsAltRecipe());
		Bukkit.addRecipe(c5BootsAltRecipe());
		Bukkit.addRecipe(elytraRecipe());
		new NamespacedKey(this, "shield");
		NamespacedKey n = NamespacedKey.minecraft("shield");
		Bukkit.removeRecipe(n);
		
		CustomEnchants.register();
		
		this.saveDefaultConfig();

		this.getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new ResourcesRecipeEvents(), this);
		this.getServer().getPluginManager().registerEvents(new ToolsRecipeEvents(), this);
		this.getServer().getPluginManager().registerEvents(new EnchantEvents(this), this);
		this.getServer().getPluginManager().registerEvents(new MobSpawnEvents(this), this);
		this.getServer().getPluginManager().registerEvents(new LevelRestrictEvents(), this);

		this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Compressed Cobblestone has been loaded and enabled!");
	}

	@Override
	public void onDisable() {

	}
	
	@EventHandler()
	public void onJoin(PlayerJoinEvent e) {
		e.getPlayer().sendMessage(ChatColor.GOLD + "This server has Compressed Cobblestone installed. Do /cchelp to get a guide book.");
	}
	
//	Debugging commands	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		items.add(new ItemStack(Material.COBBLESTONE));
		items.add(new Resources().c0p5());
		items.add(new Resources().c1());
		items.add(new Resources().c1p5());
		items.add(new Resources().c2());
		items.add(new Resources().c2p5());
		items.add(new Resources().c3());
		items.add(new Resources().c3p5());
		items.add(new Resources().c4());
		items.add(new Resources().c4p5());
		items.add(new Resources().c5());
		items.add(new ItemStack(Material.STICK));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(new ItemStack(Material.END_ROD));
		items.add(new ItemStack(Material.END_CRYSTAL));
		items.add(new ItemStack(Material.STRING));
		items.add(new ItemStack(Material.SLIME_BALL));
		items.add(new ItemStack(Material.SPONGE));

//		Testing tool
		ItemStack test = new ItemStack(Material.WOODEN_PICKAXE);
		ItemMeta meta = test.getItemMeta();
		
		meta.addEnchant(Enchantment.DIG_SPEED, 30, true);
		meta.addEnchant(Enchantment.DURABILITY, 15, true);
		test.setItemMeta(meta);
		test.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
		test.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);

		
		ArrayList<ItemStack> tools = new ArrayList<ItemStack>();
//		tools.add(new Tools().c1p5Pick());
//		tools.add(new Tools().c1p5Axe());
//		tools.add(new Tools().c1p5Spade());
//		tools.add(new Tools().c1p5Hoe());
//		tools.add(new Tools().c1p5Sword());
//		tools.add(new Tools().c1p5Helmet());
//		tools.add(new Tools().c1p5Chestplate());
//		tools.add(new Tools().c1p5Leggings());
//		tools.add(new Tools().c1p5Boots());
//		tools.add(new Tools().c3Pick());
//		tools.add(new Tools().c4Axe());
//		tools.add(new Tools().c4Spade());
//		tools.add(new Tools().c4Hoe());
//		tools.add(new Tools().c4Sword());
//		tools.add(new Tools().c4Range());
//		tools.add(new Tools().c4Helmet());
//		tools.add(new Tools().c4Chestplate());
//		tools.add(new Tools().c4Leggings());
//		tools.add(new Tools().c4Boots());
		tools.add(new Tools().c5Pick());
		tools.add(new Tools().c5Axe());
		tools.add(new Tools().c5Spade());
		tools.add(new Tools().c5Hoe());
		tools.add(new Tools().c5Sword());
		tools.add(new Tools().c5Range());
		tools.add(new Tools().c5Helmet());
		tools.add(new Tools().c5Chestplate());
		tools.add(new Tools().c5Leggings());
		tools.add(new Tools().c5Boots());
		tools.add(new Tools().elytra());
//		tools.add(test);

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
			player.setLevel(50);
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
			player.setLevel(50);
			player.sendMessage(ChatColor.GOLD + "Tools given!");
			return true;
		}
		
//		Give guide book
		if (label.equalsIgnoreCase("cchelp")) {
			if (!(sender instanceof Player)) {
				sender.sendMessage("Bad console!");
				return true;
			}
			Player player = (Player) sender;
			Location loc = player.getLocation();
			World world = player.getWorld();
			ItemStack item = new Resources().guide();

			if (player.getInventory().firstEmpty() == -1) {
//					inventory is full				
				world.dropItemNaturally(loc, item);
			}
			player.getInventory().addItem(item);
			player.sendMessage(ChatColor.GOLD + "Guide given!");
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
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.GRAY + "Contains 9^0.5 (3) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BASALT).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 3 * item.getAmount();
						player.getInventory().clear(i);
					}
			}
			
			cobbleKeys = player.getInventory().all(Material.BLACKSTONE).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^1 (9) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BLACKSTONE).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 9 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.OBSIDIAN).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^1.5 (27) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.OBSIDIAN).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 27 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.GILDED_BLACKSTONE).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^2 (81) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.GILDED_BLACKSTONE).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 81 * item.getAmount();
						player.getInventory().clear(i);
					}
			}
			
			cobbleKeys = player.getInventory().all(Material.GLOWSTONE).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^2.5 (243) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.GLOWSTONE).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 243 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.MAGMA_BLOCK).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^3 (729) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.MAGMA_BLOCK).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 729 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.CRYING_OBSIDIAN).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^3.5 (2,187) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.CRYING_OBSIDIAN).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 2187 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.ANCIENT_DEBRIS).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^4 (6,561) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.ANCIENT_DEBRIS).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 6561 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.BEDROCK).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^4.5 (19,683) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BEDROCK).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 19683 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.END_PORTAL_FRAME).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 9^5 (59,049) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.END_PORTAL_FRAME).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 59049 * item.getAmount();
						player.getInventory().clear(i);
					}
			}
			
//			Convert to higher tier and add back to inventory
			while (value > 0) {
				if (value >= 59049) {
					value -= 59049;
					ItemStack i = new Resources().c5();
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
					ItemStack i = new Resources().c4p5();
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
					ItemStack i = new Resources().c4();
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
					ItemStack i = new Resources().c3p5();
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
					ItemStack i = new Resources().c3();
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
					ItemStack i = new Resources().c2p5();
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
					ItemStack i = new Resources().c2();
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
					ItemStack i = new Resources().c1p5();
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
					ItemStack i = new Resources().c1();
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
					ItemStack i = new Resources().c0p5();
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
				if (value < 3) {
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
		
//	Beginning of Resources recipes	
	public ShapelessRecipe cobbleConversion() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 2);
		
		NamespacedKey key = new NamespacedKey(this, "cobblestone_x2");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(2, Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe netherrackConversion() {
		ItemStack item = new ItemStack(Material.COBBLESTONE);
		
		NamespacedKey key = new NamespacedKey(this, "cobblestone_alt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("NN", "N ");
		
		recipe.setIngredient('N', Material.NETHERRACK);
		
		return recipe;
	}
	
	public ShapelessRecipe coalConversion() {
		ItemStack item = new Resources().c2p5();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5_coal");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.COAL_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe redstoneConversion() {
		ItemStack item = new Resources().c2p5();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5_redstone");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.REDSTONE_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe quartzConversion() {
		ItemStack item = new Resources().c2p5();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5_quartz");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.QUARTZ_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe lapisConversion() {
		ItemStack item = new Resources().c3();
		
		NamespacedKey key = new NamespacedKey(this, "c3_lapis");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.LAPIS_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe ironConversion() {
		ItemStack item = new Resources().c3();
		
		NamespacedKey key = new NamespacedKey(this, "c3_iron");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.IRON_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe goldConversion() {
		ItemStack item = new Resources().c3p5();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5_gold");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GOLD_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe emeraldConversion() {
		ItemStack item = new Resources().c4();
		
		NamespacedKey key = new NamespacedKey(this, "c4_emerald");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.EMERALD_BLOCK);
		
		return recipe;
	}

	public ShapelessRecipe diamondConversion() {
		ItemStack item = new Resources().c4p5();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5_diamond");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.DIAMOND_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe netheriteConversion() {
		ItemStack item = new Resources().c5();
		
		NamespacedKey key = new NamespacedKey(this, "c5_netherite");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.NETHERITE_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe c0p5Recipe() {
		ItemStack item = new Resources().c0p5();
		
		NamespacedKey key = new NamespacedKey(this, "c0.5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.COBBLESTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5BackRecipe() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 3);
		
		NamespacedKey key = new NamespacedKey(this, "cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BASALT);
		
		return recipe;
	}
	
	public ShapedRecipe c1Recipe() {
		ItemStack item = new Resources().c1();
		
		NamespacedKey key = new NamespacedKey(this, "c1_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BASALT);
		
		return recipe;
	}
	
	public ShapelessRecipe c1AltRecipe() {
		ItemStack item = new Resources().c1();
		
		NamespacedKey key = new NamespacedKey(this, "c1_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.COBBLESTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1BackRecipe() {
		ItemStack item = new ItemStack(Material.COBBLESTONE, 9);
		
		NamespacedKey key = new NamespacedKey(this, "cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5Recipe() {
		ItemStack item = new Resources().c1p5();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1p5AltRecipe() {
		ItemStack item = new Resources().c1p5();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BASALT);
		
		return recipe;
	}
	
	public ShapelessRecipe c1p5BackRecipe() {
		ItemStack item = new Resources().c1();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(this, "c1_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2Recipe() {
		ItemStack item = new Resources().c2();
		
		NamespacedKey key = new NamespacedKey(this, "c2_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe c2AltRecipe() {
		ItemStack item = new Resources().c2();
		
		NamespacedKey key = new NamespacedKey(this, "c2_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2BackRecipe() {
		ItemStack item = new Resources().c1();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(this, "c1_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5Recipe() {
		ItemStack item = new Resources().c2p5();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2p5AltRecipe() {
		ItemStack item = new Resources().c2p5();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe c2p5BackRecipe() {
		ItemStack item = new Resources().c2();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(this, "c2_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3Recipe() {
		ItemStack item = new Resources().c3();
		
		NamespacedKey key = new NamespacedKey(this, "c3_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c3AltRecipe() {
		ItemStack item = new Resources().c3();
		
		NamespacedKey key = new NamespacedKey(this, "c3_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GILDED_BLACKSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c3BackRecipe() {
		ItemStack item = new Resources().c2();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(this, "c2_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5Recipe() {
		ItemStack item = new Resources().c3p5();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe c3p5AltRecipe() {
		ItemStack item = new Resources().c3p5();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapelessRecipe c3p5BackRecipe() {
		ItemStack item = new Resources().c3();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(this, "c3_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c4Recipe() {
		ItemStack item = new Resources().c4();
		
		NamespacedKey key = new NamespacedKey(this, "c4_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe c4AltRecipe() {
		ItemStack item = new Resources().c4();
		
		NamespacedKey key = new NamespacedKey(this, "c4_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.MAGMA_BLOCK);
		
		return recipe;
	}
	
	public ShapelessRecipe c4BackRecipe() {
		ItemStack item = new Resources().c3();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(this, "c3_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5Recipe() {
		ItemStack item = new Resources().c4p5();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapelessRecipe c4p5AltRecipe() {
		ItemStack item = new Resources().c4p5();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.CRYING_OBSIDIAN);
		
		return recipe;
	}
	
	public ShapelessRecipe c4p5BackRecipe() {
		ItemStack item = new Resources().c4();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(this, "c4_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapedRecipe c5Recipe() {
		ItemStack item = new Resources().c5();
		
		NamespacedKey key = new NamespacedKey(this, "c5_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapelessRecipe c5AltRecipe() {
		ItemStack item = new Resources().c5();
		
		NamespacedKey key = new NamespacedKey(this, "c5_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.ANCIENT_DEBRIS);
		
		return recipe;
	}
	
	public ShapelessRecipe c5BackRecipe() {
		ItemStack item = new Resources().c4();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(this, "c4_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
//	Beginning of Tools recipes
	public ShapedRecipe shieldRecipe() {
		ItemStack item = new ItemStack(Material.SHIELD);
		
		NamespacedKey key = new NamespacedKey(this, "shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PIP", "PPP", " P ");
		
		recipe.setIngredient('P', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.CRIMSON_PLANKS,
				Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
		recipe.setIngredient('I', Material.IRON_BLOCK);

		return recipe;
	}
	
//		Pickaxes
	public ShapedRecipe c0p5PickRecipe() {
		ItemStack item = new Tools().c0p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1PickRecipe() {
		ItemStack item = new Tools().c1Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5PickRecipe() {
		ItemStack item = new Tools().c1p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2PickRecipe() {
		ItemStack item = new Tools().c2Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5PickRecipe() {
		ItemStack item = new Tools().c2p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c3PickRecipe() {
		ItemStack item = new Tools().c3Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5PickRecipe() {
		ItemStack item = new Tools().c3p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4PickRecipe() {
		ItemStack item = new Tools().c4Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5PickRecipe() {
		ItemStack item = new Tools().c4p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c5PickRecipe() {
		ItemStack item = new Tools().c5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
//	Axes
	public ShapedRecipe c0p5AxeRecipe() {
		ItemStack item = new Tools().c0p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1AxeRecipe() {
		ItemStack item = new Tools().c1Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5AxeRecipe() {
		ItemStack item = new Tools().c1p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2AxeRecipe() {
		ItemStack item = new Tools().c2Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5AxeRecipe() {
		ItemStack item = new Tools().c2p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c3AxeRecipe() {
		ItemStack item = new Tools().c3Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5AxeRecipe() {
		ItemStack item = new Tools().c3p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4AxeRecipe() {
		ItemStack item = new Tools().c4Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5AxeRecipe() {
		ItemStack item = new Tools().c4p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c5AxeRecipe() {
		ItemStack item = new Tools().c5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
//	Shovels
	public ShapedRecipe c0p5SpadeRecipe() {
		ItemStack item = new Tools().c0p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1SpadeRecipe() {
		ItemStack item = new Tools().c1Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5SpadeRecipe() {
		ItemStack item = new Tools().c1p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2SpadeRecipe() {
		ItemStack item = new Tools().c2Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5SpadeRecipe() {
		ItemStack item = new Tools().c2p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c3SpadeRecipe() {
		ItemStack item = new Tools().c3Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5SpadeRecipe() {
		ItemStack item = new Tools().c3p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4SpadeRecipe() {
		ItemStack item = new Tools().c4Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5SpadeRecipe() {
		ItemStack item = new Tools().c4p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c5SpadeRecipe() {
		ItemStack item = new Tools().c5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
//	Hoes
	public ShapedRecipe c0p5HoeRecipe() {
		ItemStack item = new Tools().c0p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1HoeRecipe() {
		ItemStack item = new Tools().c1Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5HoeRecipe() {
		ItemStack item = new Tools().c1p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2HoeRecipe() {
		ItemStack item = new Tools().c2Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5HoeRecipe() {
		ItemStack item = new Tools().c2p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c3HoeRecipe() {
		ItemStack item = new Tools().c3Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5HoeRecipe() {
		ItemStack item = new Tools().c3p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4HoeRecipe() {
		ItemStack item = new Tools().c4Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5HoeRecipe() {
		ItemStack item = new Tools().c4p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c5HoeRecipe() {
		ItemStack item = new Tools().c5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC ", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
//	Swords
	public ShapedRecipe c0p5SwordRecipe() {
		ItemStack item = new Tools().c0p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1SwordRecipe() {
		ItemStack item = new Tools().c1Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5SwordRecipe() {
		ItemStack item = new Tools().c1p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2SwordRecipe() {
		ItemStack item = new Tools().c2Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5SwordRecipe() {
		ItemStack item = new Tools().c2p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		
		return recipe;
	}
	
	public ShapedRecipe c3SwordRecipe() {
		ItemStack item = new Tools().c3Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5SwordRecipe() {
		ItemStack item = new Tools().c3p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4SwordRecipe() {
		ItemStack item = new Tools().c4Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5SwordRecipe() {
		ItemStack item = new Tools().c4p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
	public ShapedRecipe c5SwordRecipe() {
		ItemStack item = new Tools().c5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " C ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		
		return recipe;
	}
	
//	Ranged weapons
	public ShapedRecipe c0p5RangeRecipe() {
		ItemStack item = new Tools().c0p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);

		return recipe;
	}
	
	public ShapedRecipe c1RangeRecipe() {
		ItemStack item = new Tools().c1Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5RangeRecipe() {
		ItemStack item = new Tools().c1p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		
		return recipe;
	}
	
	public ShapedRecipe c2RangeRecipe() {
		ItemStack item = new Tools().c2Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		
		return recipe;
	}
	
	public ShapedRecipe c2p5RangeRecipe() {
		ItemStack item = new Tools().c2p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		
		return recipe;
	}
	
	public ShapedRecipe c3RangeRecipe() {
		ItemStack item = new Tools().c3Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5RangeRecipe() {
		ItemStack item = new Tools().c3p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		
		return recipe;
	}
	
	public ShapedRecipe c4RangeRecipe() {
		ItemStack item = new Tools().c4Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5RangeRecipe() {
		ItemStack item = new Tools().c4p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		
		return recipe;
	}
	
	public ShapedRecipe c5RangeRecipe() {
		ItemStack item = new Tools().c5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" SC", "RRS", " SC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		
		return recipe;
	}

//	Helmets
	public ShapedRecipe c0p5HelmetRecipe() {
		ItemStack item = new Tools().c0p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1HelmetRecipe() {
		ItemStack item = new Tools().c1Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5HelmetRecipe() {
		ItemStack item = new Tools().c1p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2HelmetRecipe() {
		ItemStack item = new Tools().c2Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5HelmetRecipe() {
		ItemStack item = new Tools().c2p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3HelmetRecipe() {
		ItemStack item = new Tools().c3Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5HelmetRecipe() {
		ItemStack item = new Tools().c3p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4HelmetRecipe() {
		ItemStack item = new Tools().c4Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5HelmetRecipe() {
		ItemStack item = new Tools().c4p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5HelmetRecipe() {
		ItemStack item = new Tools().c5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
//	Helmet Alts
	public ShapedRecipe c0p5HelmetAltRecipe() {
		ItemStack item = new Tools().c0p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "C C");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1HelmetAltRecipe() {
		ItemStack item = new Tools().c1Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5HelmetAltRecipe() {
		ItemStack item = new Tools().c1p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2HelmetAltRecipe() {
		ItemStack item = new Tools().c2Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5HelmetAltRecipe() {
		ItemStack item = new Tools().c2p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3HelmetAltRecipe() {
		ItemStack item = new Tools().c3Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "CBC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5HelmetAltRecipe() {
		ItemStack item = new Tools().c3p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "CBC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4HelmetAltRecipe() {
		ItemStack item = new Tools().c4Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "CBC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5HelmetAltRecipe() {
		ItemStack item = new Tools().c4p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "CEC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5HelmetAltRecipe() {
		ItemStack item = new Tools().c5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CCC", "CEC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
//	Chestplates
	public ShapedRecipe c0p5ChestplateRecipe() {
		ItemStack item = new Tools().c0p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1ChestplateRecipe() {
		ItemStack item = new Tools().c1Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5ChestplateRecipe() {
		ItemStack item = new Tools().c1p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2ChestplateRecipe() {
		ItemStack item = new Tools().c2Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5ChestplateRecipe() {
		ItemStack item = new Tools().c2p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3ChestplateRecipe() {
		ItemStack item = new Tools().c3Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5ChestplateRecipe() {
		ItemStack item = new Tools().c3p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4ChestplateRecipe() {
		ItemStack item = new Tools().c4Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5ChestplateRecipe() {
		ItemStack item = new Tools().c4p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5ChestplateRecipe() {
		ItemStack item = new Tools().c5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CCC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}

//	Leggings
	public ShapedRecipe c0p5LeggingsRecipe() {
		ItemStack item = new Tools().c0p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1LeggingsRecipe() {
		ItemStack item = new Tools().c1Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5LeggingsRecipe() {
		ItemStack item = new Tools().c1p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2LeggingsRecipe() {
		ItemStack item = new Tools().c2Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5LeggingsRecipe() {
		ItemStack item = new Tools().c2p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3LeggingsRecipe() {
		ItemStack item = new Tools().c3Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5LeggingsRecipe() {
		ItemStack item = new Tools().c3p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4LeggingsRecipe() {
		ItemStack item = new Tools().c4Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5LeggingsRecipe() {
		ItemStack item = new Tools().c4p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5LeggingsRecipe() {
		ItemStack item = new Tools().c5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
//	Boots
	public ShapedRecipe c0p5BootsRecipe() {
		ItemStack item = new Tools().c0p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1BootsRecipe() {
		ItemStack item = new Tools().c1Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5BootsRecipe() {
		ItemStack item = new Tools().c1p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2BootsRecipe() {
		ItemStack item = new Tools().c2Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5BootsRecipe() {
		ItemStack item = new Tools().c2p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3BootsRecipe() {
		ItemStack item = new Tools().c3Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5BootsRecipe() {
		ItemStack item = new Tools().c3p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4BootsRecipe() {
		ItemStack item = new Tools().c4Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5BootsRecipe() {
		ItemStack item = new Tools().c4p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5BootsRecipe() {
		ItemStack item = new Tools().c5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
//	Boots Alts
	public ShapedRecipe c0p5BootsAltRecipe() {
		ItemStack item = new Tools().c0p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "C C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);

		return recipe;
	}
	
	public ShapedRecipe c1BootsAltRecipe() {
		ItemStack item = new Tools().c1Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "C C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);

		
		return recipe;
	}
	
	public ShapedRecipe c1p5BootsAltRecipe() {
		ItemStack item = new Tools().c1p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "C C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		
		return recipe;
	}
	
	public ShapedRecipe c2BootsAltRecipe() {
		ItemStack item = new Tools().c2Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "C C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
	
		return recipe;
	}
	
	public ShapedRecipe c2p5BootsAltRecipe() {
		ItemStack item = new Tools().c2p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "C C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		
		return recipe;
	}
	
	public ShapedRecipe c3BootsAltRecipe() {
		ItemStack item = new Tools().c3Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c3p5BootsAltRecipe() {
		ItemStack item = new Tools().c3p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4BootsAltRecipe() {
		ItemStack item = new Tools().c4Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5BootsAltRecipe() {
		ItemStack item = new Tools().c4p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
	public ShapedRecipe c5BootsAltRecipe() {
		ItemStack item = new Tools().c5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		
		return recipe;
	}
	
//	Elytra
	public ShapedRecipe elytraRecipe() {
		ItemStack item = new Tools().elytra();
		
		NamespacedKey key = new NamespacedKey(this, "elytra");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.ELYTRA);
		
		return recipe;
	}
}
