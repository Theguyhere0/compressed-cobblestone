package me.Theguyhere.CompressedCobble;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.NamespacedKey;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;
import me.Theguyhere.CompressedCobble.enchants.EnchantEvents;
import me.Theguyhere.CompressedCobble.items.Armor;
import me.Theguyhere.CompressedCobble.items.ArmorRecipes;
import me.Theguyhere.CompressedCobble.items.LevelRestrictEvents;
import me.Theguyhere.CompressedCobble.items.ResourceEvents;
import me.Theguyhere.CompressedCobble.items.ResourceRecipeEvents;
import me.Theguyhere.CompressedCobble.items.ResourceRecipes;
import me.Theguyhere.CompressedCobble.items.Resources;
import me.Theguyhere.CompressedCobble.items.ToolArmorRecipeEvents;
import me.Theguyhere.CompressedCobble.items.ToolRecipes;
import me.Theguyhere.CompressedCobble.items.Tools;

public class Main extends JavaPlugin implements Listener {
	private Resources r = new Resources();
	private Tools t = new Tools();
	private Armor armor = new Armor();
	private Commands commands = new Commands(r, t, armor);
	private DataManager data;
	
	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		data = new DataManager(this);

		ResourceRecipes rr = new ResourceRecipes(this, r);
		ToolRecipes tr = new ToolRecipes(this, t);
		ArmorRecipes ar = new ArmorRecipes(this, armor);

//		Resources
		if (this.getConfig().getBoolean("resourceConversion")) {
			Bukkit.addRecipe(rr.fleshConversion());
			Bukkit.addRecipe(rr.blackstoneConversion());
			Bukkit.addRecipe(rr.netherrackConversion());
			Bukkit.addRecipe(rr.coalConversion());
			Bukkit.addRecipe(rr.redstoneConversion());
			Bukkit.addRecipe(rr.quartzConversion());
			Bukkit.addRecipe(rr.lapisConversion());
			Bukkit.addRecipe(rr.ironConversion());
			Bukkit.addRecipe(rr.goldConversion());
			Bukkit.addRecipe(rr.emeraldConversion());
			Bukkit.addRecipe(rr.diamondConversion());
			Bukkit.addRecipe(rr.netheriteConversion());
		}
			
		if (this.getConfig().getBoolean("cobbleConversion")) {
			Bukkit.addRecipe(rr.t1Recipe());
			Bukkit.addRecipe(rr.t1BackRecipe());
			Bukkit.addRecipe(rr.t2Recipe());
			Bukkit.addRecipe(rr.t2AltRecipe());
			Bukkit.addRecipe(rr.t2BackRecipe());
			Bukkit.addRecipe(rr.t3Recipe());
			Bukkit.addRecipe(rr.t3AltRecipe());
			Bukkit.addRecipe(rr.t3BackRecipe());
			Bukkit.addRecipe(rr.t4Recipe());
			Bukkit.addRecipe(rr.t4AltRecipe());
			Bukkit.addRecipe(rr.t4BackRecipe());
			Bukkit.addRecipe(rr.t5Recipe());
			Bukkit.addRecipe(rr.t5AltRecipe());
			Bukkit.addRecipe(rr.t5BackRecipe());
			Bukkit.addRecipe(rr.t6Recipe());
			Bukkit.addRecipe(rr.t6AltRecipe());
			Bukkit.addRecipe(rr.t6BackRecipe());
			Bukkit.addRecipe(rr.t7Recipe());
			Bukkit.addRecipe(rr.t7AltRecipe());
			Bukkit.addRecipe(rr.t7BackRecipe());
			Bukkit.addRecipe(rr.t8Recipe());
			Bukkit.addRecipe(rr.t8AltRecipe());
			Bukkit.addRecipe(rr.t8BackRecipe());
			Bukkit.addRecipe(rr.t9Recipe());
			Bukkit.addRecipe(rr.t9AltRecipe());
			Bukkit.addRecipe(rr.t9BackRecipe());
			Bukkit.addRecipe(rr.t10Recipe());
			Bukkit.addRecipe(rr.t10AltRecipe());
			Bukkit.addRecipe(rr.t10BackRecipe());
			Bukkit.addRecipe(rr.notRecipe());
			Bukkit.addRecipe(rr.notAltRecipe());
			Bukkit.addRecipe(rr.notBackRecipe());
			Bukkit.addRecipe(rr.aRecipe());
			Bukkit.addRecipe(rr.aAltRecipe());
			Bukkit.addRecipe(rr.aBackRecipe());
		}

		if (this.getConfig().getBoolean("itemRecipes")) {
	//		Tools		
			Bukkit.addRecipe(tr.t1PickRecipe());
			Bukkit.addRecipe(tr.t2PickRecipe());
			Bukkit.addRecipe(tr.t3PickRecipe());
			Bukkit.addRecipe(tr.t4PickRecipe());
			Bukkit.addRecipe(tr.t5PickRecipe());
			Bukkit.addRecipe(tr.t6PickRecipe());
			Bukkit.addRecipe(tr.t7PickRecipe());
			Bukkit.addRecipe(tr.t8PickRecipe());
			Bukkit.addRecipe(tr.t9PickRecipe());
			Bukkit.addRecipe(tr.t10PickRecipe());
			
			Bukkit.addRecipe(tr.t0PickFixRecipe());
			Bukkit.addRecipe(tr.t1PickFixRecipe());
			Bukkit.addRecipe(tr.t2PickFixRecipe());
			Bukkit.addRecipe(tr.t3PickFixRecipe());
			Bukkit.addRecipe(tr.t4PickFixRecipe());
			Bukkit.addRecipe(tr.t5PickFixRecipe());
			Bukkit.addRecipe(tr.t6PickFixRecipe());
			Bukkit.addRecipe(tr.t7PickFixRecipe());
			Bukkit.addRecipe(tr.t8PickFixRecipe());
			Bukkit.addRecipe(tr.t9PickFixRecipe());
	
			Bukkit.addRecipe(tr.t1AxeRecipe());
			Bukkit.addRecipe(tr.t2AxeRecipe());
			Bukkit.addRecipe(tr.t3AxeRecipe());
			Bukkit.addRecipe(tr.t4AxeRecipe());
			Bukkit.addRecipe(tr.t5AxeRecipe());
			Bukkit.addRecipe(tr.t6AxeRecipe());
			Bukkit.addRecipe(tr.t7AxeRecipe());
			Bukkit.addRecipe(tr.t8AxeRecipe());
			Bukkit.addRecipe(tr.t9AxeRecipe());
			Bukkit.addRecipe(tr.t10AxeRecipe());
			
			Bukkit.addRecipe(tr.t0AxeFixRecipe());
			Bukkit.addRecipe(tr.t1AxeFixRecipe());
			Bukkit.addRecipe(tr.t2AxeFixRecipe());
			Bukkit.addRecipe(tr.t3AxeFixRecipe());
			Bukkit.addRecipe(tr.t4AxeFixRecipe());
			Bukkit.addRecipe(tr.t5AxeFixRecipe());
			Bukkit.addRecipe(tr.t6AxeFixRecipe());
			Bukkit.addRecipe(tr.t7AxeFixRecipe());
			Bukkit.addRecipe(tr.t8AxeFixRecipe());
			Bukkit.addRecipe(tr.t9AxeFixRecipe());
	
			Bukkit.addRecipe(tr.t1SpadeRecipe());
			Bukkit.addRecipe(tr.t2SpadeRecipe());
			Bukkit.addRecipe(tr.t3SpadeRecipe());
			Bukkit.addRecipe(tr.t4SpadeRecipe());
			Bukkit.addRecipe(tr.t5SpadeRecipe());
			Bukkit.addRecipe(tr.t6SpadeRecipe());
			Bukkit.addRecipe(tr.t7SpadeRecipe());
			Bukkit.addRecipe(tr.t8SpadeRecipe());
			Bukkit.addRecipe(tr.t9SpadeRecipe());
			Bukkit.addRecipe(tr.t10SpadeRecipe());
			
			Bukkit.addRecipe(tr.t0SpadeFixRecipe());
			Bukkit.addRecipe(tr.t1SpadeFixRecipe());
			Bukkit.addRecipe(tr.t2SpadeFixRecipe());
			Bukkit.addRecipe(tr.t3SpadeFixRecipe());
			Bukkit.addRecipe(tr.t4SpadeFixRecipe());
			Bukkit.addRecipe(tr.t5SpadeFixRecipe());
			Bukkit.addRecipe(tr.t6SpadeFixRecipe());
			Bukkit.addRecipe(tr.t7SpadeFixRecipe());
			Bukkit.addRecipe(tr.t8SpadeFixRecipe());
			Bukkit.addRecipe(tr.t9SpadeFixRecipe());
			
			Bukkit.addRecipe(tr.t1HoeRecipe());
			Bukkit.addRecipe(tr.t2HoeRecipe());
			Bukkit.addRecipe(tr.t3HoeRecipe());
			Bukkit.addRecipe(tr.t4HoeRecipe());
			Bukkit.addRecipe(tr.t5HoeRecipe());
			Bukkit.addRecipe(tr.t6HoeRecipe());
			Bukkit.addRecipe(tr.t7HoeRecipe());
			Bukkit.addRecipe(tr.t8HoeRecipe());
			Bukkit.addRecipe(tr.t9HoeRecipe());
			Bukkit.addRecipe(tr.t10HoeRecipe());
			
			Bukkit.addRecipe(tr.t0HoeFixRecipe());
			Bukkit.addRecipe(tr.t1HoeFixRecipe());
			Bukkit.addRecipe(tr.t2HoeFixRecipe());
			Bukkit.addRecipe(tr.t3HoeFixRecipe());
			Bukkit.addRecipe(tr.t4HoeFixRecipe());
			Bukkit.addRecipe(tr.t5HoeFixRecipe());
			Bukkit.addRecipe(tr.t6HoeFixRecipe());
			Bukkit.addRecipe(tr.t7HoeFixRecipe());
			Bukkit.addRecipe(tr.t8HoeFixRecipe());
			Bukkit.addRecipe(tr.t9HoeFixRecipe());
	
			Bukkit.addRecipe(tr.t1SwordRecipe());
			Bukkit.addRecipe(tr.t2SwordRecipe());
			Bukkit.addRecipe(tr.t3SwordRecipe());
			Bukkit.addRecipe(tr.t4SwordRecipe());
			Bukkit.addRecipe(tr.t5SwordRecipe());
			Bukkit.addRecipe(tr.t6SwordRecipe());
			Bukkit.addRecipe(tr.t7SwordRecipe());
			Bukkit.addRecipe(tr.t8SwordRecipe());
			Bukkit.addRecipe(tr.t9SwordRecipe());
			Bukkit.addRecipe(tr.t10SwordRecipe());
			
			Bukkit.addRecipe(tr.t0SwordFixRecipe());
			Bukkit.addRecipe(tr.t1SwordFixRecipe());
			Bukkit.addRecipe(tr.t2SwordFixRecipe());
			Bukkit.addRecipe(tr.t3SwordFixRecipe());
			Bukkit.addRecipe(tr.t4SwordFixRecipe());
			Bukkit.addRecipe(tr.t5SwordFixRecipe());
			Bukkit.addRecipe(tr.t6SwordFixRecipe());
			Bukkit.addRecipe(tr.t7SwordFixRecipe());
			Bukkit.addRecipe(tr.t8SwordFixRecipe());
			Bukkit.addRecipe(tr.t9SwordFixRecipe());
	
			Bukkit.addRecipe(tr.t1RangeRecipe());
			Bukkit.addRecipe(tr.t2RangeRecipe());
			Bukkit.addRecipe(tr.t3RangeRecipe());
			Bukkit.addRecipe(tr.t4RangeRecipe());
			Bukkit.addRecipe(tr.t5RangeRecipe());
			Bukkit.addRecipe(tr.t6RangeRecipe());
			Bukkit.addRecipe(tr.t7RangeRecipe());
			Bukkit.addRecipe(tr.t8RangeRecipe());
			Bukkit.addRecipe(tr.t9RangeRecipe());
			Bukkit.addRecipe(tr.t10RangeRecipe());
			
			Bukkit.addRecipe(tr.t0RangeFixRecipe());
			Bukkit.addRecipe(tr.t1RangeFixRecipe());
			Bukkit.addRecipe(tr.t2RangeFixRecipe());
			Bukkit.addRecipe(tr.t3RangeFixRecipe());
			Bukkit.addRecipe(tr.t4RangeFixRecipe());
			Bukkit.addRecipe(tr.t5RangeFixRecipe());
			Bukkit.addRecipe(tr.t6RangeFixRecipe());
			Bukkit.addRecipe(tr.t7RangeFixRecipe());
			Bukkit.addRecipe(tr.t8RangeFixRecipe());
			Bukkit.addRecipe(tr.t9RangeFixRecipe());
	
			if (this.getConfig().getBoolean("shieldChange")) {
				NamespacedKey n = NamespacedKey.minecraft("shield");
				Bukkit.removeRecipe(n);
				Bukkit.addRecipe(tr.t0shieldRecipe());
			}
			Bukkit.addRecipe(tr.t5ShieldRecipe());
			Bukkit.addRecipe(tr.t8ShieldRecipe());
			Bukkit.addRecipe(tr.t10ShieldRecipe());
	
			Bukkit.addRecipe(tr.t0ShieldFixRecipe());
			Bukkit.addRecipe(tr.t5ShieldFixRecipe());
			Bukkit.addRecipe(tr.t8ShieldFixRecipe());
	
	//		Armor		
			Bukkit.addRecipe(ar.t1HelmetRecipe());
			Bukkit.addRecipe(ar.t2HelmetRecipe());
			Bukkit.addRecipe(ar.t3HelmetRecipe());
			Bukkit.addRecipe(ar.t4HelmetRecipe());
			Bukkit.addRecipe(ar.t5HelmetRecipe());
			Bukkit.addRecipe(ar.t6HelmetRecipe());
			Bukkit.addRecipe(ar.t7HelmetRecipe());
			Bukkit.addRecipe(ar.t8HelmetRecipe());
			Bukkit.addRecipe(ar.t9HelmetRecipe());
			Bukkit.addRecipe(ar.t10HelmetRecipe());
			Bukkit.addRecipe(ar.notHelmetRecipe());
			Bukkit.addRecipe(ar.aHelmetRecipe());
	
			Bukkit.addRecipe(ar.t0HelmetFixRecipe());
			Bukkit.addRecipe(ar.t1HelmetFixRecipe());
			Bukkit.addRecipe(ar.t2HelmetFixRecipe());
			Bukkit.addRecipe(ar.t3HelmetFixRecipe());
			Bukkit.addRecipe(ar.t4HelmetFixRecipe());
			Bukkit.addRecipe(ar.t5HelmetFixRecipe());
			Bukkit.addRecipe(ar.t6HelmetFixRecipe());
			Bukkit.addRecipe(ar.t7HelmetFixRecipe());
			Bukkit.addRecipe(ar.t8HelmetFixRecipe());
			Bukkit.addRecipe(ar.t9HelmetFixRecipe());
	
			Bukkit.addRecipe(ar.t1HelmetAltRecipe());
			Bukkit.addRecipe(ar.t2HelmetAltRecipe());
			Bukkit.addRecipe(ar.t3HelmetAltRecipe());
			Bukkit.addRecipe(ar.t4HelmetAltRecipe());
			Bukkit.addRecipe(ar.t5HelmetAltRecipe());
			Bukkit.addRecipe(ar.t6HelmetAltRecipe());
			Bukkit.addRecipe(ar.t7HelmetAltRecipe());
			Bukkit.addRecipe(ar.t8HelmetAltRecipe());
			Bukkit.addRecipe(ar.t9HelmetAltRecipe());
			Bukkit.addRecipe(ar.t10HelmetAltRecipe());
			Bukkit.addRecipe(ar.notHelmetAltRecipe());
			Bukkit.addRecipe(ar.aHelmetAltRecipe());
	
			Bukkit.addRecipe(ar.t1ChestplateRecipe());
			Bukkit.addRecipe(ar.t2ChestplateRecipe());
			Bukkit.addRecipe(ar.t3ChestplateRecipe());
			Bukkit.addRecipe(ar.t4ChestplateRecipe());
			Bukkit.addRecipe(ar.t5ChestplateRecipe());
			Bukkit.addRecipe(ar.t6ChestplateRecipe());
			Bukkit.addRecipe(ar.t7ChestplateRecipe());
			Bukkit.addRecipe(ar.t8ChestplateRecipe());
			Bukkit.addRecipe(ar.t9ChestplateRecipe());
			Bukkit.addRecipe(ar.t10ChestplateRecipe());
			
			Bukkit.addRecipe(ar.t0ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t1ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t2ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t3ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t4ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t5ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t6ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t7ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t8ChestplateFixRecipe());
			Bukkit.addRecipe(ar.t9ChestplateFixRecipe());
	
			Bukkit.addRecipe(ar.t1LeggingsRecipe());
			Bukkit.addRecipe(ar.t2LeggingsRecipe());
			Bukkit.addRecipe(ar.t3LeggingsRecipe());
			Bukkit.addRecipe(ar.t4LeggingsRecipe());
			Bukkit.addRecipe(ar.t5LeggingsRecipe());
			Bukkit.addRecipe(ar.t6LeggingsRecipe());
			Bukkit.addRecipe(ar.t7LeggingsRecipe());
			Bukkit.addRecipe(ar.t8LeggingsRecipe());
			Bukkit.addRecipe(ar.t9LeggingsRecipe());
			Bukkit.addRecipe(ar.t10LeggingsRecipe());
			
			Bukkit.addRecipe(ar.t0LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t1LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t2LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t3LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t4LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t5LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t6LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t7LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t8LeggingsFixRecipe());
			Bukkit.addRecipe(ar.t9LeggingsFixRecipe());
	
			Bukkit.addRecipe(ar.t1BootsRecipe());
			Bukkit.addRecipe(ar.t2BootsRecipe());
			Bukkit.addRecipe(ar.t3BootsRecipe());
			Bukkit.addRecipe(ar.t4BootsRecipe());
			Bukkit.addRecipe(ar.t5BootsRecipe());
			Bukkit.addRecipe(ar.t6BootsRecipe());
			Bukkit.addRecipe(ar.t7BootsRecipe());
			Bukkit.addRecipe(ar.t8BootsRecipe());
			Bukkit.addRecipe(ar.t9BootsRecipe());
			Bukkit.addRecipe(ar.t10BootsRecipe());
			
			Bukkit.addRecipe(ar.t0BootsFixRecipe());
			Bukkit.addRecipe(ar.t1BootsFixRecipe());
			Bukkit.addRecipe(ar.t2BootsFixRecipe());
			Bukkit.addRecipe(ar.t3BootsFixRecipe());
			Bukkit.addRecipe(ar.t4BootsFixRecipe());
			Bukkit.addRecipe(ar.t5BootsFixRecipe());
			Bukkit.addRecipe(ar.t6BootsFixRecipe());
			Bukkit.addRecipe(ar.t7BootsFixRecipe());
			Bukkit.addRecipe(ar.t8BootsFixRecipe());
			Bukkit.addRecipe(ar.t9BootsFixRecipe());
	
			Bukkit.addRecipe(ar.t1BootsAltRecipe());
			Bukkit.addRecipe(ar.t2BootsAltRecipe());
			Bukkit.addRecipe(ar.t3BootsAltRecipe());
			Bukkit.addRecipe(ar.t4BootsAltRecipe());
			Bukkit.addRecipe(ar.t5BootsAltRecipe());
			Bukkit.addRecipe(ar.t6BootsAltRecipe());
			Bukkit.addRecipe(ar.t7BootsAltRecipe());
			Bukkit.addRecipe(ar.t8BootsAltRecipe());
			Bukkit.addRecipe(ar.t9BootsAltRecipe());
			Bukkit.addRecipe(ar.t10BootsAltRecipe());
			
			Bukkit.addRecipe(ar.t9ElytraRecipe());
			Bukkit.addRecipe(ar.t10ElytraRecipe());
	
			Bukkit.addRecipe(ar.t9ElytraFixRecipe());
		}
				
		CustomEnchants.register();
		
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new ResourceEvents(r), this);
		this.getServer().getPluginManager().registerEvents(new ResourceRecipeEvents(r), this);
		this.getServer().getPluginManager().registerEvents(new ToolArmorRecipeEvents(r, t, armor), this);
		this.getServer().getPluginManager().registerEvents(new EnchantEvents(this, r, t, armor), this);
		this.getServer().getPluginManager().registerEvents(new MobSpawnEvents(this, t, armor), this);
		this.getServer().getPluginManager().registerEvents(new LevelRestrictEvents(this, t, armor), this);
		
		this.getCommand("cc").setExecutor(commands);

		if (this.getConfig().getDouble("version") < 2.0)
			this.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Your config.yml is outdated! "
					+ "Please update to the latest version to ensure compatibility.");
		
		this.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Compressed Cobblestone has been loaded and enabled!");
	}

	@Override
	public void onDisable() {
		this.getServer().getConsoleSender().sendMessage(ChatColor.RED + "Compressed Cobblestone has been unloaded and disabled!");
	}
	
	@EventHandler()
	public void onJoin(PlayerJoinEvent e) {
		e.getPlayer().sendMessage(ChatColor.GOLD + this.getConfig().getString("playerWelcome"));
	}
	
	public static boolean equals(ItemStack a, ItemStack b) {
	    if(a == null || b == null)
	        return false;
	    if(a.getType() != b.getType())
	        return false;
	    if(a.hasItemMeta() != b.hasItemMeta())
	        return false;
	    if(a.getItemMeta().hasLore() != b.getItemMeta().hasLore())
	        return false;
	    if (a.getItemMeta().hasLore() && b.getItemMeta().hasLore())
		    if(!a.getItemMeta().getLore().equals(b.getItemMeta().getLore()))
		        return false;
	    return true;
	}
	
	public static void giveItem(Player player, World world, Location loc, ItemStack i) {
		if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(i.getType()) == -1 ||
				(player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
				player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0)) {
//			inventory is full				
			world.dropItemNaturally(loc, i);
			player.sendMessage(ChatColor.RED + "Your inventory is full!");
		}
		else {
			player.getInventory().addItem(i);
		}

	}
	
	public FileConfiguration getData() {
		return data.getConfig();
	}
	
	public void saveData() {
		data.saveConfig();
	}
}
