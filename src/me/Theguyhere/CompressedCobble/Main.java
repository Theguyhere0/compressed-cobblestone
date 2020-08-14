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
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;
import me.Theguyhere.CompressedCobble.enchants.EnchantEvents;
import me.Theguyhere.CompressedCobble.items.Resources;
import me.Theguyhere.CompressedCobble.items.Tools;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;

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
		Bukkit.addRecipe(cNotRecipe());
		Bukkit.addRecipe(cNotAltRecipe());
		Bukkit.addRecipe(cNotBackRecipe());
		Bukkit.addRecipe(cARecipe());
		Bukkit.addRecipe(cAAltRecipe());
		Bukkit.addRecipe(cABackRecipe());

//		Tools
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
		
		Bukkit.addRecipe(c0PickFixRecipe());
		Bukkit.addRecipe(c0p5PickFixRecipe());
		Bukkit.addRecipe(c1PickFixRecipe());
		Bukkit.addRecipe(c1p5PickFixRecipe());
		Bukkit.addRecipe(c2PickFixRecipe());
		Bukkit.addRecipe(c2p5PickFixRecipe());
		Bukkit.addRecipe(c3PickFixRecipe());
		Bukkit.addRecipe(c3p5PickFixRecipe());
		Bukkit.addRecipe(c4PickFixRecipe());
		Bukkit.addRecipe(c4p5PickFixRecipe());

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
		
		Bukkit.addRecipe(c0AxeFixRecipe());
		Bukkit.addRecipe(c0p5AxeFixRecipe());
		Bukkit.addRecipe(c1AxeFixRecipe());
		Bukkit.addRecipe(c1p5AxeFixRecipe());
		Bukkit.addRecipe(c2AxeFixRecipe());
		Bukkit.addRecipe(c2p5AxeFixRecipe());
		Bukkit.addRecipe(c3AxeFixRecipe());
		Bukkit.addRecipe(c3p5AxeFixRecipe());
		Bukkit.addRecipe(c4AxeFixRecipe());
		Bukkit.addRecipe(c4p5AxeFixRecipe());

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
		
		Bukkit.addRecipe(c0SpadeFixRecipe());
		Bukkit.addRecipe(c0p5SpadeFixRecipe());
		Bukkit.addRecipe(c1SpadeFixRecipe());
		Bukkit.addRecipe(c1p5SpadeFixRecipe());
		Bukkit.addRecipe(c2SpadeFixRecipe());
		Bukkit.addRecipe(c2p5SpadeFixRecipe());
		Bukkit.addRecipe(c3SpadeFixRecipe());
		Bukkit.addRecipe(c3p5SpadeFixRecipe());
		Bukkit.addRecipe(c4SpadeFixRecipe());
		Bukkit.addRecipe(c4p5SpadeFixRecipe());
		
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
		
		Bukkit.addRecipe(c0HoeFixRecipe());
		Bukkit.addRecipe(c0p5HoeFixRecipe());
		Bukkit.addRecipe(c1HoeFixRecipe());
		Bukkit.addRecipe(c1p5HoeFixRecipe());
		Bukkit.addRecipe(c2HoeFixRecipe());
		Bukkit.addRecipe(c2p5HoeFixRecipe());
		Bukkit.addRecipe(c3HoeFixRecipe());
		Bukkit.addRecipe(c3p5HoeFixRecipe());
		Bukkit.addRecipe(c4HoeFixRecipe());
		Bukkit.addRecipe(c4p5HoeFixRecipe());

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
		
		Bukkit.addRecipe(c0SwordFixRecipe());
		Bukkit.addRecipe(c0p5SwordFixRecipe());
		Bukkit.addRecipe(c1SwordFixRecipe());
		Bukkit.addRecipe(c1p5SwordFixRecipe());
		Bukkit.addRecipe(c2SwordFixRecipe());
		Bukkit.addRecipe(c2p5SwordFixRecipe());
		Bukkit.addRecipe(c3SwordFixRecipe());
		Bukkit.addRecipe(c3p5SwordFixRecipe());
		Bukkit.addRecipe(c4SwordFixRecipe());
		Bukkit.addRecipe(c4p5SwordFixRecipe());

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
		
		Bukkit.addRecipe(c0RangeFixRecipe());
		Bukkit.addRecipe(c0p5RangeFixRecipe());
		Bukkit.addRecipe(c1RangeFixRecipe());
		Bukkit.addRecipe(c1p5RangeFixRecipe());
		Bukkit.addRecipe(c2RangeFixRecipe());
		Bukkit.addRecipe(c2p5RangeFixRecipe());
		Bukkit.addRecipe(c3RangeFixRecipe());
		Bukkit.addRecipe(c3p5RangeFixRecipe());
		Bukkit.addRecipe(c4RangeFixRecipe());
		Bukkit.addRecipe(c4p5RangeFixRecipe());

		Bukkit.addRecipe(c0shieldRecipe());
		Bukkit.addRecipe(c2p5ShieldRecipe());
		Bukkit.addRecipe(c4ShieldRecipe());
		Bukkit.addRecipe(c5ShieldRecipe());

		Bukkit.addRecipe(c0ShieldFixRecipe());
		Bukkit.addRecipe(c2p5ShieldFixRecipe());
		Bukkit.addRecipe(c4ShieldFixRecipe());

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
		Bukkit.addRecipe(cNotHelmetRecipe());
		Bukkit.addRecipe(cAHelmetRecipe());

		Bukkit.addRecipe(c0HelmetFixRecipe());
		Bukkit.addRecipe(c0p5HelmetFixRecipe());
		Bukkit.addRecipe(c1HelmetFixRecipe());
		Bukkit.addRecipe(c1p5HelmetFixRecipe());
		Bukkit.addRecipe(c2HelmetFixRecipe());
		Bukkit.addRecipe(c2p5HelmetFixRecipe());
		Bukkit.addRecipe(c3HelmetFixRecipe());
		Bukkit.addRecipe(c3p5HelmetFixRecipe());
		Bukkit.addRecipe(c4HelmetFixRecipe());
		Bukkit.addRecipe(c4p5HelmetFixRecipe());

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
		Bukkit.addRecipe(cNotHelmetAltRecipe());
		Bukkit.addRecipe(cAHelmetAltRecipe());

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
		
		Bukkit.addRecipe(c0ChestplateFixRecipe());
		Bukkit.addRecipe(c0p5ChestplateFixRecipe());
		Bukkit.addRecipe(c1ChestplateFixRecipe());
		Bukkit.addRecipe(c1p5ChestplateFixRecipe());
		Bukkit.addRecipe(c2ChestplateFixRecipe());
		Bukkit.addRecipe(c2p5ChestplateFixRecipe());
		Bukkit.addRecipe(c3ChestplateFixRecipe());
		Bukkit.addRecipe(c3p5ChestplateFixRecipe());
		Bukkit.addRecipe(c4ChestplateFixRecipe());
		Bukkit.addRecipe(c4p5ChestplateFixRecipe());

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
		
		Bukkit.addRecipe(c0LeggingsFixRecipe());
		Bukkit.addRecipe(c0p5LeggingsFixRecipe());
		Bukkit.addRecipe(c1LeggingsFixRecipe());
		Bukkit.addRecipe(c1p5LeggingsFixRecipe());
		Bukkit.addRecipe(c2LeggingsFixRecipe());
		Bukkit.addRecipe(c2p5LeggingsFixRecipe());
		Bukkit.addRecipe(c3LeggingsFixRecipe());
		Bukkit.addRecipe(c3p5LeggingsFixRecipe());
		Bukkit.addRecipe(c4LeggingsFixRecipe());
		Bukkit.addRecipe(c4p5LeggingsFixRecipe());

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
		
		Bukkit.addRecipe(c0BootsFixRecipe());
		Bukkit.addRecipe(c0p5BootsFixRecipe());
		Bukkit.addRecipe(c1BootsFixRecipe());
		Bukkit.addRecipe(c1p5BootsFixRecipe());
		Bukkit.addRecipe(c2BootsFixRecipe());
		Bukkit.addRecipe(c2p5BootsFixRecipe());
		Bukkit.addRecipe(c3BootsFixRecipe());
		Bukkit.addRecipe(c3p5BootsFixRecipe());
		Bukkit.addRecipe(c4BootsFixRecipe());
		Bukkit.addRecipe(c4p5BootsFixRecipe());

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
		
		Bukkit.addRecipe(c4p5ElytraRecipe());
		Bukkit.addRecipe(c5ElytraRecipe());

		Bukkit.addRecipe(c4p5ElytraFixRecipe());
		
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
		e.getPlayer().sendMessage(ChatColor.GOLD + "This server has Compressed Cobblestone installed. Do /cchelp to visit the wiki for help.");
	}
	
	@EventHandler()
	public void destroy(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if (!(player.getInventory().getItemInMainHand().getType().equals(Material.COMMAND_BLOCK) &&
				player.getInventory().getItemInMainHand().getItemMeta().hasLore()))
			return;
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			e.setCancelled(true);
			e.getClickedBlock().setType(Material.AIR);
			int amount = player.getInventory().getItemInMainHand().getAmount();
			if (amount > 1)
				player.getInventory().getItemInMainHand().setAmount(amount - 1);
			else player.getInventory().remove(new Resources().cA());
		}
		return;
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
		items.add(new Resources().cNot());
		items.add(new Resources().cA());
		items.add(new ItemStack(Material.STICK));
		items.add(new ItemStack(Material.BLAZE_POWDER));
		items.add(new ItemStack(Material.BLAZE_ROD));
		items.add(new ItemStack(Material.END_ROD));
		items.add(new ItemStack(Material.END_CRYSTAL));
		items.add(new ItemStack(Material.STRING));
		items.add(new ItemStack(Material.SLIME_BALL));
		items.add(new ItemStack(Material.SPONGE));

////		Testing tool
//		ItemStack test = new ItemStack(Material.WOODEN_PICKAXE);
//		ItemMeta meta = test.getItemMeta();
//		
//		meta.addEnchant(Enchantment.DIG_SPEED, 30, true);
//		meta.addEnchant(Enchantment.DURABILITY, 15, true);
//		test.setItemMeta(meta);
//		test.addUnsafeEnchantment(CustomEnchants.FIERY, 1);
//		test.addUnsafeEnchantment(CustomEnchants.TELEPATHY, 1);

		
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
		tools.add(new Tools().c5Elytra());
		tools.add(new Tools().c5Shield());
		tools.add(new Tools().cNotHelmet());
		tools.add(new Tools().cAHelmet());
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
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.GRAY + "Contains 3^1 (3) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^2 (9) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^3 (27) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^4 (81) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^5 (243) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^6 (729) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^7 (2,187) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^8 (6,561) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^9 (19,683) Cobblestone");
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
			lore.add(ChatColor.GRAY + "Contains 3^10 (59,049) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.END_PORTAL_FRAME).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 59049 * item.getAmount();
						player.getInventory().clear(i);
					}
			}
			
			cobbleKeys = player.getInventory().all(Material.BARRIER).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 3^11 (177,147) Cobblestone");
			lore.add(ChatColor.DARK_RED + "" + ChatColor.ITALIC + "Warning! Item will lose value if placed.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.BARRIER).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 177147 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

			cobbleKeys = player.getInventory().all(Material.COMMAND_BLOCK).keySet();
			lore.clear();
			lore.add(ChatColor.GRAY + "Contains 3^12 (531,441) Cobblestone");
			lore.add(ChatColor.RED + "" + ChatColor.ITALIC + "Caution!! Item will destroy blocks it touches.");

			for (int i : cobbleKeys) {
				ItemStack item = player.getInventory().all(Material.COMMAND_BLOCK).get(i);
				if (item.getItemMeta().hasLore())
					if (item.getItemMeta().getLore().equals(lore)) {
						value += 531441 * item.getAmount();
						player.getInventory().clear(i);
					}
			}

//			Convert to higher tier and add back to inventory
			while (value > 0) {
				if (value >= 531441) {
					value -= 531441;
					ItemStack i = new Resources().cA();
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
					ItemStack i = new Resources().cNot();
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
	
	public ShapedRecipe cNotRecipe() {
		ItemStack item = new Resources().cNot();
		
		NamespacedKey key = new NamespacedKey(this, "cNot_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
	public ShapelessRecipe cNotAltRecipe() {
		ItemStack item = new Resources().cNot();
		
		NamespacedKey key = new NamespacedKey(this, "cNot_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.BEDROCK);
		
		return recipe;
	}
	
	public ShapelessRecipe cNotBackRecipe() {
		ItemStack item = new Resources().c5();
		item.setAmount(3);
		
		NamespacedKey key = new NamespacedKey(this, "c5_cobblestone_x3");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.BARRIER);
		
		return recipe;
	}
	
	public ShapedRecipe cARecipe() {
		ItemStack item = new Resources().cA();
		
		NamespacedKey key = new NamespacedKey(this, "cA_cobblestone");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CC", "C ");
		
		recipe.setIngredient('C', Material.BARRIER);
		
		return recipe;
	}
	
	public ShapelessRecipe cAAltRecipe() {
		ItemStack item = new Resources().cA();
		
		NamespacedKey key = new NamespacedKey(this, "cA_cobblestone_alt");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(9, Material.END_PORTAL_FRAME);
		
		return recipe;
	}
	
	public ShapelessRecipe cABackRecipe() {
		ItemStack item = new Resources().c5();
		item.setAmount(9);
		
		NamespacedKey key = new NamespacedKey(this, "c5_cobblestone_x9");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);
		
		recipe.addIngredient(Material.COMMAND_BLOCK);
		
		return recipe;
	}
	
//	Beginning of Tools recipes	
//		Pickaxes
	public ShapedRecipe c0p5PickRecipe() {
		ItemStack item = new Tools().c0p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe c1PickRecipe() {
		ItemStack item = new Tools().c1Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5PickRecipe() {
		ItemStack item = new Tools().c1p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c2PickRecipe() {
		ItemStack item = new Tools().c2Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c2p5PickRecipe() {
		ItemStack item = new Tools().c2p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c3PickRecipe() {
		ItemStack item = new Tools().c3Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c3p5PickRecipe() {
		ItemStack item = new Tools().c3p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c4PickRecipe() {
		ItemStack item = new Tools().c4Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);
		
		return recipe;
	}
	
	public ShapedRecipe c4p5PickRecipe() {
		ItemStack item = new Tools().c4p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);

		return recipe;
	}
	
	public ShapedRecipe c5PickRecipe() {
		ItemStack item = new Tools().c5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c5Pick");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_PICKAXE);

		return recipe;
	}
		
	public ShapelessRecipe c0PickFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_PICKAXE);
		
		NamespacedKey key = new NamespacedKey(this, "c0PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5PickFixRecipe() {
		ItemStack item = new Tools().c0p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1PickFixRecipe() {
		ItemStack item = new Tools().c1Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c1p5PickFixRecipe() {
		ItemStack item = new Tools().c1p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_PICKAXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2PickFixRecipe() {
		ItemStack item = new Tools().c2Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c2p5PickFixRecipe() {
		ItemStack item = new Tools().c2p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c3PickFixRecipe() {
		ItemStack item = new Tools().c3Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c3p5PickFixRecipe() {
		ItemStack item = new Tools().c3p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c4PickFixRecipe() {
		ItemStack item = new Tools().c4Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}

	public ShapelessRecipe c4p5PickFixRecipe() {
		ItemStack item = new Tools().c4p5Pick();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5PickFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_PICKAXE);
		
		return recipe;
	}

//	Axes
	public ShapedRecipe c0p5AxeRecipe() {
		ItemStack item = new Tools().c0p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);

		return recipe;
	}
	
	public ShapedRecipe c1AxeRecipe() {
		ItemStack item = new Tools().c1Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);

		return recipe;
	}
	
	public ShapedRecipe c1p5AxeRecipe() {
		ItemStack item = new Tools().c1p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_AXE);

		return recipe;
	}
	
	public ShapedRecipe c2AxeRecipe() {
		ItemStack item = new Tools().c2Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_AXE);

		return recipe;
	}
	
	public ShapedRecipe c2p5AxeRecipe() {
		ItemStack item = new Tools().c2p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CS ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_AXE);

		return recipe;
	}
	
	public ShapedRecipe c3AxeRecipe() {
		ItemStack item = new Tools().c3Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_AXE);

		return recipe;
	}
	
	public ShapedRecipe c3p5AxeRecipe() {
		ItemStack item = new Tools().c3p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_AXE);

		return recipe;
	}
	
	public ShapedRecipe c4AxeRecipe() {
		ItemStack item = new Tools().c4Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CB ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);

		return recipe;
	}
	
	public ShapedRecipe c4p5AxeRecipe() {
		ItemStack item = new Tools().c4p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);

		return recipe;
	}
	
	public ShapedRecipe c5AxeRecipe() {
		ItemStack item = new Tools().c5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c5Axe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", "CE ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_AXE);

		return recipe;
	}
	
	public ShapelessRecipe c0AxeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_AXE);
		
		NamespacedKey key = new NamespacedKey(this, "c0AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5AxeFixRecipe() {
		ItemStack item = new Tools().c0p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1AxeFixRecipe() {
		ItemStack item = new Tools().c1Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c1p5AxeFixRecipe() {
		ItemStack item = new Tools().c1p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_AXE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2AxeFixRecipe() {
		ItemStack item = new Tools().c2Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c2p5AxeFixRecipe() {
		ItemStack item = new Tools().c2p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c3AxeFixRecipe() {
		ItemStack item = new Tools().c3Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c3p5AxeFixRecipe() {
		ItemStack item = new Tools().c3p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c4AxeFixRecipe() {
		ItemStack item = new Tools().c4Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}

	public ShapelessRecipe c4p5AxeFixRecipe() {
		ItemStack item = new Tools().c4p5Axe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5AxeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_AXE);
		
		return recipe;
	}

//	Shovels
	public ShapedRecipe c0p5SpadeRecipe() {
		ItemStack item = new Tools().c0p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c1SpadeRecipe() {
		ItemStack item = new Tools().c1Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c1p5SpadeRecipe() {
		ItemStack item = new Tools().c1p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c2SpadeRecipe() {
		ItemStack item = new Tools().c2Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c2p5SpadeRecipe() {
		ItemStack item = new Tools().c2p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c3SpadeRecipe() {
		ItemStack item = new Tools().c3Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c3p5SpadeRecipe() {
		ItemStack item = new Tools().c3p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c4SpadeRecipe() {
		ItemStack item = new Tools().c4Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c4p5SpadeRecipe() {
		ItemStack item = new Tools().c4p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);

		return recipe;
	}
	
	public ShapedRecipe c5SpadeRecipe() {
		ItemStack item = new Tools().c5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c5Spade");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SHOVEL);

		return recipe;
	}
	
	public ShapelessRecipe c0SpadeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_SHOVEL);
		
		NamespacedKey key = new NamespacedKey(this, "c0SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5SpadeFixRecipe() {
		ItemStack item = new Tools().c0p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe c1SpadeFixRecipe() {
		ItemStack item = new Tools().c1Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c1p5SpadeFixRecipe() {
		ItemStack item = new Tools().c1p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_SHOVEL);
		
		return recipe;
	}
	
	public ShapelessRecipe c2SpadeFixRecipe() {
		ItemStack item = new Tools().c2Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c2p5SpadeFixRecipe() {
		ItemStack item = new Tools().c2p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c3SpadeFixRecipe() {
		ItemStack item = new Tools().c3Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c3p5SpadeFixRecipe() {
		ItemStack item = new Tools().c3p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c4SpadeFixRecipe() {
		ItemStack item = new Tools().c4Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}

	public ShapelessRecipe c4p5SpadeFixRecipe() {
		ItemStack item = new Tools().c4p5Spade();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5SpadeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_SHOVEL);
		
		return recipe;
	}
	
//	Hoes
	public ShapedRecipe c0p5HoeRecipe() {
		ItemStack item = new Tools().c0p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);

		return recipe;
	}
	
	public ShapedRecipe c1HoeRecipe() {
		ItemStack item = new Tools().c1Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);

		return recipe;
	}
	
	public ShapedRecipe c1p5HoeRecipe() {
		ItemStack item = new Tools().c1p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_HOE);

		return recipe;
	}
	
	public ShapedRecipe c2HoeRecipe() {
		ItemStack item = new Tools().c2Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_HOE);

		return recipe;
	}
	
	public ShapedRecipe c2p5HoeRecipe() {
		ItemStack item = new Tools().c2p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " S ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_HOE);

		return recipe;
	}
	
	public ShapedRecipe c3HoeRecipe() {
		ItemStack item = new Tools().c3Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_HOE);

		return recipe;
	}
	
	public ShapedRecipe c3p5HoeRecipe() {
		ItemStack item = new Tools().c3p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_HOE);

		return recipe;
	}
	
	public ShapedRecipe c4HoeRecipe() {
		ItemStack item = new Tools().c4Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " B ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);

		return recipe;
	}
	
	public ShapedRecipe c4p5HoeRecipe() {
		ItemStack item = new Tools().c4p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " E ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);

		return recipe;
	}
	
	public ShapedRecipe c5HoeRecipe() {
		ItemStack item = new Tools().c5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c5Hoe");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CP ", " E ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_HOE);

		return recipe;
	}
	
	public ShapelessRecipe c0HoeFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_HOE);
		
		NamespacedKey key = new NamespacedKey(this, "c0HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5HoeFixRecipe() {
		ItemStack item = new Tools().c0p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1HoeFixRecipe() {
		ItemStack item = new Tools().c1Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c1p5HoeFixRecipe() {
		ItemStack item = new Tools().c1p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_HOE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2HoeFixRecipe() {
		ItemStack item = new Tools().c2Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c2p5HoeFixRecipe() {
		ItemStack item = new Tools().c2p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c3HoeFixRecipe() {
		ItemStack item = new Tools().c3Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c3p5HoeFixRecipe() {
		ItemStack item = new Tools().c3p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c4HoeFixRecipe() {
		ItemStack item = new Tools().c4Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}

	public ShapelessRecipe c4p5HoeFixRecipe() {
		ItemStack item = new Tools().c4p5Hoe();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5HoeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_HOE);
		
		return recipe;
	}

//	Swords
	public ShapedRecipe c0p5SwordRecipe() {
		ItemStack item = new Tools().c0p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c1SwordRecipe() {
		ItemStack item = new Tools().c1Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c1p5SwordRecipe() {
		ItemStack item = new Tools().c1p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.STONE_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c2SwordRecipe() {
		ItemStack item = new Tools().c2Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c2p5SwordRecipe() {
		ItemStack item = new Tools().c2p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " S ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('S', Material.STICK);
		recipe.setIngredient('P', Material.IRON_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c3SwordRecipe() {
		ItemStack item = new Tools().c3Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c3p5SwordRecipe() {
		ItemStack item = new Tools().c3p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.DIAMOND_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c4SwordRecipe() {
		ItemStack item = new Tools().c4Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " B ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c4p5SwordRecipe() {
		ItemStack item = new Tools().c4p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);

		return recipe;
	}
	
	public ShapedRecipe c5SwordRecipe() {
		ItemStack item = new Tools().c5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c5Sword");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape(" C ", " P ", " E ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_ROD);
		recipe.setIngredient('P', Material.NETHERITE_SWORD);

		return recipe;
	}
	
	public ShapelessRecipe c0SwordFixRecipe() {
		ItemStack item = new ItemStack(Material.STONE_SWORD);
		
		NamespacedKey key = new NamespacedKey(this, "c0SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.COBBLESTONE);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5SwordFixRecipe() {
		ItemStack item = new Tools().c0p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe c1SwordFixRecipe() {
		ItemStack item = new Tools().c1Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.STONE_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c1p5SwordFixRecipe() {
		ItemStack item = new Tools().c1p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.IRON_SWORD);
		
		return recipe;
	}
	
	public ShapelessRecipe c2SwordFixRecipe() {
		ItemStack item = new Tools().c2Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c2p5SwordFixRecipe() {
		ItemStack item = new Tools().c2p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.DIAMOND_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c3SwordFixRecipe() {
		ItemStack item = new Tools().c3Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c3p5SwordFixRecipe() {
		ItemStack item = new Tools().c3p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c4SwordFixRecipe() {
		ItemStack item = new Tools().c4Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}

	public ShapelessRecipe c4p5SwordFixRecipe() {
		ItemStack item = new Tools().c4p5Sword();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5SwordFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_SWORD);
		
		return recipe;
	}

//	Ranged weapons
	public ShapedRecipe c0p5RangeRecipe() {
		ItemStack item = new Tools().c0p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c1RangeRecipe() {
		ItemStack item = new Tools().c1Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c1p5RangeRecipe() {
		ItemStack item = new Tools().c1p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c2RangeRecipe() {
		ItemStack item = new Tools().c2Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c2p5RangeRecipe() {
		ItemStack item = new Tools().c2p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('R', Material.STICK);
		recipe.setIngredient('S', Material.STRING);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c3RangeRecipe() {
		ItemStack item = new Tools().c3Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c3p5RangeRecipe() {
		ItemStack item = new Tools().c3p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.BOW);

		return recipe;
	}
	
	public ShapedRecipe c4RangeRecipe() {
		ItemStack item = new Tools().c4Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('R', Material.BLAZE_ROD);
		recipe.setIngredient('S', Material.SLIME_BALL);
		recipe.setIngredient('P', Material.CROSSBOW);

		return recipe;
	}
	
	public ShapedRecipe c4p5RangeRecipe() {
		ItemStack item = new Tools().c4p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		recipe.setIngredient('P', Material.CROSSBOW);

		return recipe;
	}
	
	public ShapedRecipe c5RangeRecipe() {
		ItemStack item = new Tools().c5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c5Range");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "SRS", " R ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('R', Material.END_ROD);
		recipe.setIngredient('S', Material.SPONGE);
		recipe.setIngredient('P', Material.TRIDENT);

		return recipe;
	}

	public ShapelessRecipe c0RangeFixRecipe() {
		ItemStack item = new ItemStack(Material.BOW);
		
		NamespacedKey key = new NamespacedKey(this, "c0RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.STICK);
		recipe.addIngredient(Material.STRING);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5RangeFixRecipe() {
		ItemStack item = new Tools().c0p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe c1RangeFixRecipe() {
		ItemStack item = new Tools().c1Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}

	public ShapelessRecipe c1p5RangeFixRecipe() {
		ItemStack item = new Tools().c1p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}
	
	public ShapelessRecipe c2RangeFixRecipe() {
		ItemStack item = new Tools().c2Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}

	public ShapelessRecipe c2p5RangeFixRecipe() {
		ItemStack item = new Tools().c2p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}

	public ShapelessRecipe c3RangeFixRecipe() {
		ItemStack item = new Tools().c3Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.BOW);
		
		return recipe;
	}

	public ShapelessRecipe c3p5RangeFixRecipe() {
		ItemStack item = new Tools().c3p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.CROSSBOW);
		
		return recipe;
	}

	public ShapelessRecipe c4RangeFixRecipe() {
		ItemStack item = new Tools().c4Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.CROSSBOW);
		
		return recipe;
	}

	public ShapelessRecipe c4p5RangeFixRecipe() {
		ItemStack item = new Tools().c4p5Range();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5RangeFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.TRIDENT);
		
		return recipe;
	}

//	Helmets
	public ShapedRecipe c0p5HelmetRecipe() {
		ItemStack item = new Tools().c0p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c1HelmetRecipe() {
		ItemStack item = new Tools().c1Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5HelmetRecipe() {
		ItemStack item = new Tools().c1p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c2HelmetRecipe() {
		ItemStack item = new Tools().c2Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c2p5HelmetRecipe() {
		ItemStack item = new Tools().c2p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c3HelmetRecipe() {
		ItemStack item = new Tools().c3Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c3p5HelmetRecipe() {
		ItemStack item = new Tools().c3p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c4HelmetRecipe() {
		ItemStack item = new Tools().c4Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c4p5HelmetRecipe() {
		ItemStack item = new Tools().c4p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c5HelmetRecipe() {
		ItemStack item = new Tools().c5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c5Helmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe cNotHelmetRecipe() {
		ItemStack item = new Tools().cNotHelmet();
		
		NamespacedKey key = new NamespacedKey(this, "cNotHelmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CWC", "CNC", "   ");
		
		recipe.setIngredient('C', Material.BARRIER);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('W', Material.CONDUIT);

		return recipe;
	}
	
	public ShapedRecipe cAHelmetRecipe() {
		ItemStack item = new Tools().cAHelmet();
		
		NamespacedKey key = new NamespacedKey(this, "cAHelmet");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CNC", "   ");
		
		recipe.setIngredient('C', Material.COMMAND_BLOCK);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('P', Material.GOLDEN_HELMET);

		return recipe;
	}

	public ShapelessRecipe c0HelmetFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_HELMET);
		
		NamespacedKey key = new NamespacedKey(this, "c0HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5HelmetFixRecipe() {
		ItemStack item = new Tools().c0p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe c1HelmetFixRecipe() {
		ItemStack item = new Tools().c1Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c1p5HelmetFixRecipe() {
		ItemStack item = new Tools().c1p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_HELMET);
		
		return recipe;
	}
	
	public ShapelessRecipe c2HelmetFixRecipe() {
		ItemStack item = new Tools().c2Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c2p5HelmetFixRecipe() {
		ItemStack item = new Tools().c2p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c3HelmetFixRecipe() {
		ItemStack item = new Tools().c3Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c3p5HelmetFixRecipe() {
		ItemStack item = new Tools().c3p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c4HelmetFixRecipe() {
		ItemStack item = new Tools().c4Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_HELMET);
		
		return recipe;
	}

	public ShapelessRecipe c4p5HelmetFixRecipe() {
		ItemStack item = new Tools().c4p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5HelmetFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_HELMET);
		
		return recipe;
	}

//	Helmet Alts
	public ShapedRecipe c0p5HelmetAltRecipe() {
		ItemStack item = new Tools().c0p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c1HelmetAltRecipe() {
		ItemStack item = new Tools().c1Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_HELMET);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5HelmetAltRecipe() {
		ItemStack item = new Tools().c1p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c2HelmetAltRecipe() {
		ItemStack item = new Tools().c2Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c2p5HelmetAltRecipe() {
		ItemStack item = new Tools().c2p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c3HelmetAltRecipe() {
		ItemStack item = new Tools().c3Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c3p5HelmetAltRecipe() {
		ItemStack item = new Tools().c3p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c4HelmetAltRecipe() {
		ItemStack item = new Tools().c4Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CBC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c4p5HelmetAltRecipe() {
		ItemStack item = new Tools().c4p5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CEC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe c5HelmetAltRecipe() {
		ItemStack item = new Tools().c5Helmet();
		
		NamespacedKey key = new NamespacedKey(this, "c5HelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CEC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_HELMET);

		return recipe;
	}
	
	public ShapedRecipe cNotHelmetAltRecipe() {
		ItemStack item = new Tools().cNotHelmet();
		
		NamespacedKey key = new NamespacedKey(this, "cNotHelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CWC", "CNC");
		
		recipe.setIngredient('C', Material.BARRIER);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('W', Material.CONDUIT);

		return recipe;
	}
	
	public ShapedRecipe cAHelmetAltRecipe() {
		ItemStack item = new Tools().cAHelmet();
		
		NamespacedKey key = new NamespacedKey(this, "cAHelmetAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "CPC", "CNC");
		
		recipe.setIngredient('C', Material.COMMAND_BLOCK);
		recipe.setIngredient('N', Material.NETHER_STAR);
		recipe.setIngredient('P', Material.GOLDEN_HELMET);

		return recipe;
	}

//	Chestplates
	public ShapedRecipe c0p5ChestplateRecipe() {
		ItemStack item = new Tools().c0p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c1ChestplateRecipe() {
		ItemStack item = new Tools().c1Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5ChestplateRecipe() {
		ItemStack item = new Tools().c1p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c2ChestplateRecipe() {
		ItemStack item = new Tools().c2Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c2p5ChestplateRecipe() {
		ItemStack item = new Tools().c2p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("C C", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c3ChestplateRecipe() {
		ItemStack item = new Tools().c3Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c3p5ChestplateRecipe() {
		ItemStack item = new Tools().c3p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c4ChestplateRecipe() {
		ItemStack item = new Tools().c4Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CBC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c4p5ChestplateRecipe() {
		ItemStack item = new Tools().c4p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_CHESTPLATE);

		return recipe;
	}
	
	public ShapedRecipe c5ChestplateRecipe() {
		ItemStack item = new Tools().c5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c5Chestplate");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CEC", "CPC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_CHESTPLATE);

		return recipe;
	}

	public ShapelessRecipe c0ChestplateFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_CHESTPLATE);
		
		NamespacedKey key = new NamespacedKey(this, "c0ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5ChestplateFixRecipe() {
		ItemStack item = new Tools().c0p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe c1ChestplateFixRecipe() {
		ItemStack item = new Tools().c1Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c1p5ChestplateFixRecipe() {
		ItemStack item = new Tools().c1p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_CHESTPLATE);
		
		return recipe;
	}
	
	public ShapelessRecipe c2ChestplateFixRecipe() {
		ItemStack item = new Tools().c2Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c2p5ChestplateFixRecipe() {
		ItemStack item = new Tools().c2p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c3ChestplateFixRecipe() {
		ItemStack item = new Tools().c3Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c3p5ChestplateFixRecipe() {
		ItemStack item = new Tools().c3p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c4ChestplateFixRecipe() {
		ItemStack item = new Tools().c4Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_CHESTPLATE);
		
		return recipe;
	}

	public ShapelessRecipe c4p5ChestplateFixRecipe() {
		ItemStack item = new Tools().c4p5Chestplate();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5ChestplateFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_CHESTPLATE);
		
		return recipe;
	}

//	Leggings
	public ShapedRecipe c0p5LeggingsRecipe() {
		ItemStack item = new Tools().c0p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c1LeggingsRecipe() {
		ItemStack item = new Tools().c1Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5LeggingsRecipe() {
		ItemStack item = new Tools().c1p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c2LeggingsRecipe() {
		ItemStack item = new Tools().c2Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c2p5LeggingsRecipe() {
		ItemStack item = new Tools().c2p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "C C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c3LeggingsRecipe() {
		ItemStack item = new Tools().c3Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c3p5LeggingsRecipe() {
		ItemStack item = new Tools().c3p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c4LeggingsRecipe() {
		ItemStack item = new Tools().c4Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c4p5LeggingsRecipe() {
		ItemStack item = new Tools().c4p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_LEGGINGS);

		return recipe;
	}
	
	public ShapedRecipe c5LeggingsRecipe() {
		ItemStack item = new Tools().c5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c5Leggings");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CPC", "CEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_LEGGINGS);

		return recipe;
	}
	
	public ShapelessRecipe c0LeggingsFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_LEGGINGS);
		
		NamespacedKey key = new NamespacedKey(this, "c0LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5LeggingsFixRecipe() {
		ItemStack item = new Tools().c0p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe c1LeggingsFixRecipe() {
		ItemStack item = new Tools().c1Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c1p5LeggingsFixRecipe() {
		ItemStack item = new Tools().c1p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_LEGGINGS);
		
		return recipe;
	}
	
	public ShapelessRecipe c2LeggingsFixRecipe() {
		ItemStack item = new Tools().c2Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c2p5LeggingsFixRecipe() {
		ItemStack item = new Tools().c2p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c3LeggingsFixRecipe() {
		ItemStack item = new Tools().c3Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c3p5LeggingsFixRecipe() {
		ItemStack item = new Tools().c3p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c4LeggingsFixRecipe() {
		ItemStack item = new Tools().c4Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_LEGGINGS);
		
		return recipe;
	}

	public ShapelessRecipe c4p5LeggingsFixRecipe() {
		ItemStack item = new Tools().c4p5Leggings();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5LeggingsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_LEGGINGS);
		
		return recipe;
	}

//	Boots
	public ShapedRecipe c0p5BootsRecipe() {
		ItemStack item = new Tools().c0p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c1BootsRecipe() {
		ItemStack item = new Tools().c1Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5BootsRecipe() {
		ItemStack item = new Tools().c1p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c2BootsRecipe() {
		ItemStack item = new Tools().c2Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c2p5BootsRecipe() {
		ItemStack item = new Tools().c2p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("P C", "C C", "   ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c3BootsRecipe() {
		ItemStack item = new Tools().c3Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c3p5BootsRecipe() {
		ItemStack item = new Tools().c3p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c4BootsRecipe() {
		ItemStack item = new Tools().c4Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PBC", "C C", "   ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c4p5BootsRecipe() {
		ItemStack item = new Tools().c4p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c5BootsRecipe() {
		ItemStack item = new Tools().c5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c5Boots");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PEC", "C C", "   ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapelessRecipe c0BootsFixRecipe() {
		ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
		
		NamespacedKey key = new NamespacedKey(this, "c0BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.LEATHER);
		recipe.addIngredient(Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe c0p5BootsFixRecipe() {
		ItemStack item = new Tools().c0p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BASALT);
		recipe.addIngredient(Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe c1BootsFixRecipe() {
		ItemStack item = new Tools().c1Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BLACKSTONE);
		recipe.addIngredient(Material.CHAINMAIL_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c1p5BootsFixRecipe() {
		ItemStack item = new Tools().c1p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.OBSIDIAN);
		recipe.addIngredient(Material.CHAINMAIL_BOOTS);
		
		return recipe;
	}
	
	public ShapelessRecipe c2BootsFixRecipe() {
		ItemStack item = new Tools().c2Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GILDED_BLACKSTONE);
		recipe.addIngredient(Material.IRON_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c2p5BootsFixRecipe() {
		ItemStack item = new Tools().c2p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.IRON_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c3BootsFixRecipe() {
		ItemStack item = new Tools().c3Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.MAGMA_BLOCK);
		recipe.addIngredient(Material.DIAMOND_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c3p5BootsFixRecipe() {
		ItemStack item = new Tools().c3p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.CRYING_OBSIDIAN);
		recipe.addIngredient(Material.DIAMOND_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c4BootsFixRecipe() {
		ItemStack item = new Tools().c4Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.NETHERITE_BOOTS);
		
		return recipe;
	}

	public ShapelessRecipe c4p5BootsFixRecipe() {
		ItemStack item = new Tools().c4p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5BootsFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.NETHERITE_BOOTS);
		
		return recipe;
	}

//	Boots Alts
	public ShapedRecipe c0p5BootsAltRecipe() {
		ItemStack item = new Tools().c0p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c0p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.BASALT);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c1BootsAltRecipe() {
		ItemStack item = new Tools().c1Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.BLACKSTONE);
		recipe.setIngredient('P', Material.LEATHER_BOOTS);
		
		return recipe;
	}
	
	public ShapedRecipe c1p5BootsAltRecipe() {
		ItemStack item = new Tools().c1p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c1p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.OBSIDIAN);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c2BootsAltRecipe() {
		ItemStack item = new Tools().c2Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.GILDED_BLACKSTONE);
		recipe.setIngredient('P', Material.CHAINMAIL_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c2p5BootsAltRecipe() {
		ItemStack item = new Tools().c2p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "P C", "C C");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c3BootsAltRecipe() {
		ItemStack item = new Tools().c3Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.MAGMA_BLOCK);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.IRON_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c3p5BootsAltRecipe() {
		ItemStack item = new Tools().c3p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c3p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.CRYING_OBSIDIAN);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c4BootsAltRecipe() {
		ItemStack item = new Tools().c4Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PBC", "C C");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('B', Material.BLAZE_POWDER);
		recipe.setIngredient('P', Material.DIAMOND_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c4p5BootsAltRecipe() {
		ItemStack item = new Tools().c4p5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PEC", "C C");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
	public ShapedRecipe c5BootsAltRecipe() {
		ItemStack item = new Tools().c5Boots();
		
		NamespacedKey key = new NamespacedKey(this, "c5BootsAlt");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("   ", "PEC", "C C");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.END_CRYSTAL);
		recipe.setIngredient('P', Material.NETHERITE_BOOTS);

		return recipe;
	}
	
//	Shields
	public ShapedRecipe c0shieldRecipe() {
		ItemStack item = new ItemStack(Material.SHIELD);
		
		NamespacedKey key = new NamespacedKey(this, "c0shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("PIP", "PPP", " P ");
		
		recipe.setIngredient('P', new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.CRIMSON_PLANKS,
				Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
		recipe.setIngredient('I', Material.IRON_BLOCK);

		return recipe;
	}
	
	public ShapedRecipe c2p5ShieldRecipe() {
		ItemStack item = new Tools().c2p5Shield();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CGC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.GLOWSTONE);
		recipe.setIngredient('G', Material.GOLD_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapedRecipe c4ShieldRecipe() {
		ItemStack item = new Tools().c4Shield();
		
		NamespacedKey key = new NamespacedKey(this, "c4Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CDC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.ANCIENT_DEBRIS);
		recipe.setIngredient('D', Material.DIAMOND_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapedRecipe c5ShieldRecipe() {
		ItemStack item = new Tools().c5Shield();
		
		NamespacedKey key = new NamespacedKey(this, "c5Shield");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CNC", "CPC", " C ");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('N', Material.NETHERITE_BLOCK);
		recipe.setIngredient('P', Material.SHIELD);

		return recipe;
	}

	public ShapelessRecipe c0ShieldFixRecipe() {
		ItemStack item = new ItemStack(Material.SHIELD);
		
		NamespacedKey key = new NamespacedKey(this, "c0ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(new RecipeChoice.MaterialChoice(Material.ACACIA_PLANKS, Material.BIRCH_PLANKS, Material.CRIMSON_PLANKS,
				Material.DARK_OAK_PLANKS, Material.JUNGLE_PLANKS, Material.OAK_PLANKS, Material.SPRUCE_PLANKS, Material.WARPED_PLANKS));
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}
		
	public ShapelessRecipe c2p5ShieldFixRecipe() {
		ItemStack item = new Tools().c2p5Shield();
		
		NamespacedKey key = new NamespacedKey(this, "c2p5ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.GLOWSTONE);
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}

	public ShapelessRecipe c4ShieldFixRecipe() {
		ItemStack item = new Tools().c4Shield();
		
		NamespacedKey key = new NamespacedKey(this, "c4ShieldFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.ANCIENT_DEBRIS);
		recipe.addIngredient(Material.SHIELD);
		
		return recipe;
	}

//	Elytra
	public ShapedRecipe c4p5ElytraRecipe() {
		ItemStack item = new Tools().c4p5Elytra();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5Elytra");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "CCC");
		
		recipe.setIngredient('C', Material.BEDROCK);
		recipe.setIngredient('E', Material.ELYTRA);
		
		return recipe;
	}

	public ShapedRecipe c5ElytraRecipe() {
		ItemStack item = new Tools().c5Elytra();
		
		NamespacedKey key = new NamespacedKey(this, "c5Elytra");
		
		ShapedRecipe recipe = new ShapedRecipe(key, item);
		
		recipe.shape("CCC", "CEC", "CCC");
		
		recipe.setIngredient('C', Material.END_PORTAL_FRAME);
		recipe.setIngredient('E', Material.ELYTRA);
		
		return recipe;
	}
	
	public ShapelessRecipe c4p5ElytraFixRecipe() {
		ItemStack item = new Tools().c4p5Elytra();
		
		NamespacedKey key = new NamespacedKey(this, "c4p5ElytraFix");
		
		ShapelessRecipe recipe = new ShapelessRecipe(key, item);

		recipe.addIngredient(Material.BEDROCK);
		recipe.addIngredient(Material.ELYTRA);
		
		return recipe;
	}
}
