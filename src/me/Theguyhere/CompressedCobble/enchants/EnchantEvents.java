package me.Theguyhere.CompressedCobble.enchants;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.AbstractArrow.PickupStatus;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Stray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Theguyhere.CompressedCobble.Main;
import me.Theguyhere.CompressedCobble.items.Resources;
import net.md_5.bungee.api.ChatColor;

public class EnchantEvents implements Listener {
	private Plugin plugin;
	
	public EnchantEvents(Main plugin) {
		this.plugin = plugin;
	}
	
	EntityType[] fighter = {EntityType.DROWNED, EntityType.GIANT, EntityType.HOGLIN, EntityType.HUSK, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.SKELETON,
			EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH, EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE,
			EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
	Collection<EntityType> fighters = Arrays.asList(fighter);
	
//	Tools
	@EventHandler()
	public void telepathy(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.STONY)) {
			int lvl = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.STONY);
			if ((event.getBlock().getType().equals(Material.STONE) || event.getBlock().getType().equals(Material.DIORITE) && lvl > 2 ||
					event.getBlock().getType().equals(Material.GRANITE) && lvl > 2 || event.getBlock().getType().equals(Material.ANDESITE) && lvl > 2))
				return;
		}
		if ((event.getBlock().getType().equals(Material.GOLD_ORE) || event.getBlock().getType().equals(Material.IRON_ORE) ||
				event.getBlock().getType().equals(Material.NETHER_GOLD_ORE)) && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.FIERY))
			return;
		if ((event.getBlock().getType().equals(Material.ACACIA_LOG) || event.getBlock().getType().equals(Material.BIRCH_LOG) || 
				event.getBlock().getType().equals(Material.DARK_OAK_LOG) || event.getBlock().getType().equals(Material.JUNGLE_LOG) ||
				event.getBlock().getType().equals(Material.OAK_LOG) || event.getBlock().getType().equals(Material.SPRUCE_LOG) ||
				event.getBlock().getType().equals(Material.CRIMSON_STEM) || event.getBlock().getType().equals(Material.WARPED_STEM)) &&
				event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PETRIFYING))
			return;
		if ((event.getBlock().getType().equals(Material.DIRT) || event.getBlock().getType().equals(Material.SAND) || 
				event.getBlock().getType().equals(Material.GRAVEL) || event.getBlock().getType().equals(Material.GRASS_BLOCK) ||
				event.getBlock().getType().equals(Material.COARSE_DIRT) || event.getBlock().getType().equals(Material.PODZOL) ||
				event.getBlock().getType().equals(Material.SOUL_SAND) || event.getBlock().getType().equals(Material.SOUL_SOIL) ||
				event.getBlock().getType().equals(Material.RED_SAND)) && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.ROCKY))
			return;
		if ((event.getBlock().getType().equals(Material.WHEAT) || event.getBlock().getType().equals(Material.CARROTS) || 
				event.getBlock().getType().equals(Material.POTATOES) || event.getBlock().getType().equals(Material.BEETROOT) ||
				event.getBlock().getType().equals(Material.NETHER_WART)) && event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PEBBLY))
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			if (event.getBlock().getState() instanceof Container)
				return;	
			event.setDropItems(false);
			Player player = event.getPlayer();
			Block block = event.getBlock();
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
			if (drops.isEmpty())
				return;
			Collection<ItemStack> loot = new HashSet<>();
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext())
					loot.add(i);
			}
			for (ItemStack i : loot) {
				if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(i.getType()) == -1 ||
						(player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
						player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0)) {
//					inventory is full				
					world.dropItemNaturally(loc, i);
					player.sendMessage(ChatColor.RED + "Your inventory is full!");
				}
				else {
					player.getInventory().addItem(i);
					//System.out.print("Telepathy-block");
				}
			}
		}
		return;
	}
	
	@EventHandler()
	public void telepathy(EntityDeathEvent event) {
		if (event.getEntity().getKiller() == null)
			return;
		if (event.getEntity().getKiller().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getEntity().getKiller().getInventory().getItemInMainHand().hasItemMeta())
			return;
		
		EntityType[] entities = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.CREEPER, EntityType.DROWNED, EntityType.ENDERMAN, EntityType.ENDERMITE,
				EntityType.EVOKER, EntityType.GHAST, EntityType.GIANT, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.ILLUSIONER,
				EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.SKELETON, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH,
				EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
		Collection<EntityType> mobs = Arrays.asList(entities);
		if (mobs.contains(event.getEntityType()) && event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.MEDUSA))
			return;

		if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
			if (event.getEntity().getKiller().getGameMode() == GameMode.CREATIVE || event.getEntity().getKiller().getGameMode() == GameMode.SPECTATOR)
				return;
			Player player = event.getEntity().getKiller();
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			Collection<ItemStack> drops = event.getDrops();
			if (drops.isEmpty()) {
				return;
			}
			Collection<ItemStack> loot = new HashSet<>();
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext())
					loot.add(i);
			}
			event.getDrops().clear();
			for (ItemStack i : loot) {
				if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(i.getType()) == -1 ||
						(player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
						player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0)) {
//					inventory is full				
					world.dropItemNaturally(loc, i);
					player.sendMessage(ChatColor.RED + "Your inventory is full!");
				}
				else {
					player.getInventory().addItem(i);
					//System.out.print("Telepathy-mob");
				}
			}
		}
		return;
	}

	@EventHandler()
	public void stony(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.STONY)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			int lvl = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.STONY);
			if (!(event.getBlock().getType().equals(Material.STONE) || event.getBlock().getType().equals(Material.DIORITE) && lvl > 2 ||
					event.getBlock().getType().equals(Material.GRANITE) && lvl > 2 || event.getBlock().getType().equals(Material.ANDESITE) && lvl > 2))
				return;

			plugin.getConfig().getConfigurationSection("stony" + lvl).getKeys(false).forEach(key -> {
				ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("stony" + lvl + ".loot").size()];
				ItemStack item = null;
				Random r = new Random();
				int position = 0;
				Player player = event.getPlayer();
				Block block = event.getBlock();
				Location loc = player.getLocation();
				World world = player.getWorld();
				Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
				if (drops.isEmpty())
					return;
				for (String i : plugin.getConfig().getStringList("stony" + lvl + ".loot")) {
					if (i.equals("c"))
						item = drops.iterator().next();
					if (i.equals("c0p5"))
						item = new Resources().c0p5();
					if (i.equals("c1"))
						item = new Resources().c1();
					if (i.equals("c1p5"))
						item = new Resources().c1p5();
					if (i.equals("c2"))
						item = new Resources().c2();
					if (i.equals("c2p5"))
						item = new Resources().c2p5();
					items[position] = item;
					position++;
				}
				int num = r.nextInt(items.length);
				ItemStack result = items[num];
				event.setDropItems(false);
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
							(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
							player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//						inventory is full				
						world.dropItemNaturally(loc, result);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
						return;
					}
					else player.getInventory().addItem(result);
					//System.out.print("Stony-telepathy");
				}
				else {
					world.dropItemNaturally(block.getLocation(), result);
					//System.out.print("Stony");
				}
			});
		}
		return;
	}
	
	@EventHandler()
	public void fiery(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (!(event.getBlock().getType().equals(Material.GOLD_ORE) || event.getBlock().getType().equals(Material.IRON_ORE) || event.getBlock().getType().equals(Material.NETHER_GOLD_ORE)))
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.FIERY)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			event.setDropItems(false);
			ItemStack result = null;
			event.setDropItems(false);
			Player player = event.getPlayer();
			Block block = event.getBlock();
			Location loc = player.getLocation();
			World world = player.getWorld();
			int luck = 0;
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS))
				luck = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS);
			int r = 1 + new Random().nextInt(luck);
			Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
			if (drops.isEmpty())
				return;
			if (event.getBlock().getType().equals(Material.GOLD_ORE))
				result = new ItemStack(Material.GOLD_INGOT, r);
			if (event.getBlock().getType().equals(Material.IRON_ORE))
				result = new ItemStack(Material.IRON_INGOT, r);
			if (event.getBlock().getType().equals(Material.NETHER_GOLD_ORE))
				result = new ItemStack(Material.GOLD_INGOT, r);
			if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
						(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
						player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//					inventory is full				
					world.dropItemNaturally(loc, result);
					player.sendMessage(ChatColor.RED + "Your inventory is full!");
					return;
				}
				player.getInventory().addItem(result);
				//System.out.print("Fiery-telepathy");
			}
			else {
				world.dropItemNaturally(block.getLocation(), result);
				//System.out.print("Fiery");
			}
		}
		return;
	}
	
	@EventHandler()
	public void petrifying(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PETRIFYING)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			if (!(event.getBlock().getType().equals(Material.ACACIA_LOG) || event.getBlock().getType().equals(Material.BIRCH_LOG) || 
					event.getBlock().getType().equals(Material.DARK_OAK_LOG) || event.getBlock().getType().equals(Material.JUNGLE_LOG) ||
					event.getBlock().getType().equals(Material.OAK_LOG) || event.getBlock().getType().equals(Material.SPRUCE_LOG) ||
					event.getBlock().getType().equals(Material.CRIMSON_STEM) || event.getBlock().getType().equals(Material.WARPED_STEM)))
				return;

			int lvl = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PETRIFYING);
			plugin.getConfig().getConfigurationSection("stony" + lvl).getKeys(false).forEach(key -> {
				ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("stony" + lvl + ".loot").size()];
				ItemStack item = null;
				Random r = new Random();
				int position = 0;
				for (String i : plugin.getConfig().getStringList("stony" + lvl + ".loot")) {
					if (i.equals("c"))
						item = new ItemStack(event.getBlock().getType());
					if (i.equals("c0p5"))
						item = new Resources().c0p5();
					if (i.equals("c1"))
						item = new Resources().c1();
					if (i.equals("c1p5"))
						item = new Resources().c1p5();
					if (i.equals("c2"))
						item = new Resources().c2();
					if (i.equals("c2p5"))
						item = new Resources().c2p5();
					items[position] = item;
					position++;
				}
				int num = r.nextInt(items.length);
				ItemStack result = items[num];
				event.setDropItems(false);
				Player player = event.getPlayer();
				Block block = event.getBlock();
				Location loc = player.getLocation();
				World world = player.getWorld();
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
							(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
							player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//						inventory is full				
						world.dropItemNaturally(loc, result);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
						return;
					}
					player.getInventory().addItem(result);
					//System.out.print("Petrifying-telepathy");
				}
				else {
					world.dropItemNaturally(block.getLocation(), result);
					//System.out.print("Petrifying");
				}
			});
		}
		return;
	}
	
	@EventHandler()
	public void rocky(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.ROCKY)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			if (!(event.getBlock().getType().equals(Material.DIRT) || event.getBlock().getType().equals(Material.SAND) || 
					event.getBlock().getType().equals(Material.GRAVEL) || event.getBlock().getType().equals(Material.GRASS_BLOCK) ||
					event.getBlock().getType().equals(Material.COARSE_DIRT) || event.getBlock().getType().equals(Material.PODZOL) ||
					event.getBlock().getType().equals(Material.SOUL_SAND) || event.getBlock().getType().equals(Material.SOUL_SOIL) ||
					event.getBlock().getType().equals(Material.RED_SAND)))
				return;

			int lvl = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.ROCKY);
			plugin.getConfig().getConfigurationSection("stony" + lvl).getKeys(false).forEach(key -> {
				ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("stony" + lvl + ".loot").size()];
				ItemStack item = null;
				Random r = new Random();
				int position = 0;
				Player player = event.getPlayer();
				Block block = event.getBlock();
				Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());

				for (String i : plugin.getConfig().getStringList("stony" + lvl + ".loot")) {
					if (i.equals("c"))
						item = new ItemStack(drops.iterator().next());
					if (i.equals("c0p5"))
						item = new Resources().c0p5();
					if (i.equals("c1"))
						item = new Resources().c1();
					if (i.equals("c1p5"))
						item = new Resources().c1p5();
					if (i.equals("c2"))
						item = new Resources().c2();
					if (i.equals("c2p5"))
						item = new Resources().c2p5();
					items[position] = item;
					position++;
				}
				int num = r.nextInt(items.length);
				ItemStack result = items[num];
				event.setDropItems(false);
				Location loc = player.getLocation();
				World world = player.getWorld();
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
							(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
							player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//						inventory is full				
						world.dropItemNaturally(loc, result);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
						return;
					}
					player.getInventory().addItem(result);
					//System.out.print("Rocky-telepathy");
				}
				else {
					world.dropItemNaturally(block.getLocation(), result);
					//System.out.print("Rocky");
				}
			});
		}
		return;
	}
			
	@EventHandler()
	public void pebbly(BlockBreakEvent event) {
		if (event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PEBBLY)) {
			if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
				return;
			if (!(event.getBlock().getType().equals(Material.WHEAT) || event.getBlock().getType().equals(Material.CARROTS) || 
					event.getBlock().getType().equals(Material.POTATOES) || event.getBlock().getType().equals(Material.BEETROOT) ||
					event.getBlock().getType().equals(Material.NETHER_WART)))
				return;

			int lvl = event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PEBBLY);
			Player player = event.getPlayer();
			Block block = event.getBlock();
			Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			if ((event.getBlock().getType().equals(Material.WHEAT)))
				if (!event.getBlock().getBlockData().getAsString().equals("minecraft:wheat[age=7]")) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(drops.iterator().next().getType()) == -1 ||
								(player.getInventory().all(new ItemStack(drops.iterator().next().getType(), drops.iterator().next().getMaxStackSize())).size() ==
								player.getInventory().all(drops.iterator().next().getType()).size()) && player.getInventory().all(drops.iterator().next().getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, drops.iterator().next());
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
							return;
						}
						else {
							player.getInventory().addItem(drops.iterator().next());
							//System.out.print("Pebbly-immature");
						}
					}
					return;
				}
			if ((event.getBlock().getType().equals(Material.CARROTS)))
				if (!event.getBlock().getBlockData().getAsString().equals("minecraft:carrots[age=7]")) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(drops.iterator().next().getType()) == -1 ||
								(player.getInventory().all(new ItemStack(drops.iterator().next().getType(), drops.iterator().next().getMaxStackSize())).size() ==
								player.getInventory().all(drops.iterator().next().getType()).size()) && player.getInventory().all(drops.iterator().next().getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, drops.iterator().next());
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
							return;
						}
						else {
							player.getInventory().addItem(drops.iterator().next());
							//System.out.print("Pebbly-immature");
						}
					}
					return;
				}
			if ((event.getBlock().getType().equals(Material.POTATOES)))
				if (!event.getBlock().getBlockData().getAsString().equals("minecraft:potatoes[age=7]")) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(drops.iterator().next().getType()) == -1 ||
								(player.getInventory().all(new ItemStack(drops.iterator().next().getType(), drops.iterator().next().getMaxStackSize())).size() ==
								player.getInventory().all(drops.iterator().next().getType()).size()) && player.getInventory().all(drops.iterator().next().getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, drops.iterator().next());
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
							return;
						}
						else {
							player.getInventory().addItem(drops.iterator().next());
							//System.out.print("Pebbly-immature");
						}
					}
					return;
				}
			if ((event.getBlock().getType().equals(Material.BEETROOT)))
				if (!event.getBlock().getBlockData().getAsString().equals("minecraft:beetroots[age=3]")) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(drops.iterator().next().getType()) == -1 ||
								(player.getInventory().all(new ItemStack(drops.iterator().next().getType(), drops.iterator().next().getMaxStackSize())).size() ==
								player.getInventory().all(drops.iterator().next().getType()).size()) && player.getInventory().all(drops.iterator().next().getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, drops.iterator().next());
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
							return;
						}
						else {
							player.getInventory().addItem(drops.iterator().next());
							//System.out.print("Pebbly-immature");
						}
					}
					return;
				}
			if ((event.getBlock().getType().equals(Material.NETHER_WART)))
				if (!event.getBlock().getBlockData().getAsString().equals("minecraft:nether_warts[age=3]")) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(drops.iterator().next().getType()) == -1 ||
								(player.getInventory().all(new ItemStack(drops.iterator().next().getType(), drops.iterator().next().getMaxStackSize())).size() ==
								player.getInventory().all(drops.iterator().next().getType()).size()) && player.getInventory().all(drops.iterator().next().getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, drops.iterator().next());
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
							return;
						}
						else {
							player.getInventory().addItem(drops.iterator().next());
							//System.out.print("Pebbly-immature");
						}
					}
					return;
				}

			plugin.getConfig().getConfigurationSection("stony" + lvl).getKeys(false).forEach(key -> {
				ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("stony" + lvl + ".loot").size()];
				ItemStack item = null;
				Random r = new Random();
				int position = 0;
				ItemStack first = drops.iterator().next();
				Collection<ItemStack> rest = new HashSet<>();
				for (ItemStack i : drops) {
					if (drops.iterator().hasNext()) {
						rest.add(i);
					}
				}

				for (String i : plugin.getConfig().getStringList("stony" + lvl + ".loot")) {
					if (i.equals("c"))
						item = new ItemStack(first);
					if (i.equals("c0p5"))
						item = new Resources().c0p5();
					if (i.equals("c1"))
						item = new Resources().c1();
					if (i.equals("c1p5"))
						item = new Resources().c1p5();
					if (i.equals("c2"))
						item = new Resources().c2();
					if (i.equals("c2p5"))
						item = new Resources().c2p5();
					items[position] = item;
					position++;
				}
				int num = r.nextInt(items.length);
				ItemStack result = items[num];
				event.setDropItems(false);
				if (result.equals(first)) {
					if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						for (ItemStack i : rest) {
							if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(i.getType()) == -1 ||
									(player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
									player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0)) {
//								inventory is full				
								world.dropItemNaturally(loc, i);
								player.sendMessage(ChatColor.RED + "Your inventory is full!");
							}
							else {
								player.getInventory().addItem(i);
								//System.out.print("Pebbly-mature-telepathy");
							}
						}
					}
					else 
						for (ItemStack i : rest) {
							world.dropItemNaturally(block.getLocation(), i);
							//System.out.print("Pebbly-mature");
						}
					return;
				}
				if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
							(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
							player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//						inventory is full				
						world.dropItemNaturally(loc, result);
						player.sendMessage(ChatColor.RED + "Your inventory is full!");
						return;
					}
					else player.getInventory().addItem(result);
					//System.out.print("Pebbly-mature-telepathy");
					return;
				}
				else world.dropItemNaturally(block.getLocation(), result);
				//System.out.print("Pebbly-mature");
			});
		}
		return;
	}
	
	@EventHandler()
	public void medusa(EntityDeathEvent event) {
		if (event.getEntity().getKiller() == null)
			return;
		if (event.getEntity().getKiller().getInventory().getItemInMainHand() == null)
			return;
		if (!event.getEntity().getKiller().getInventory().getItemInMainHand().hasItemMeta())
			return;

		if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.MEDUSA)) {
			if (event.getEntity().getKiller().getGameMode() == GameMode.CREATIVE || event.getEntity().getKiller().getGameMode() == GameMode.SPECTATOR)
				return;
			
			EntityType[] entities = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.CREEPER, EntityType.DROWNED, EntityType.ENDERMAN, EntityType.ENDERMITE,
					EntityType.EVOKER, EntityType.GHAST, EntityType.GIANT, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.ILLUSIONER,
					EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.SKELETON, EntityType.SKELETON_HORSE,
					EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH,
					EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
			Collection<EntityType> mobs = Arrays.asList(entities);
			if (!mobs.contains(event.getEntityType()))
				return;
			
			Player player = event.getEntity().getKiller();
			Location loc = player.getLocation();
			World world = player.getWorld();
			
			Collection<ItemStack> drops = event.getDrops();
			if (drops.isEmpty())
				return;
			ItemStack first = drops.iterator().next();
			drops.remove(drops.iterator().next());
			Collection<ItemStack> rest = new HashSet<>();
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext()) {
					rest.add(i);
				}
			}
			int lvl = event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.MEDUSA);
			plugin.getConfig().getConfigurationSection("stony" + lvl).getKeys(false).forEach(key -> {
				ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("stony" + lvl + ".loot").size()];
				ItemStack item = null;
				Random r = new Random();
				int position = 0;

				for (String i : plugin.getConfig().getStringList("stony" + lvl + ".loot")) {
					if (i.equals("c"))
						item = new ItemStack(first);
					if (i.equals("c0p5"))
						item = new Resources().c0p5();
					if (i.equals("c1"))
						item = new Resources().c1();
					if (i.equals("c1p5"))
						item = new Resources().c1p5();
					if (i.equals("c2"))
						item = new Resources().c2();
					if (i.equals("c2p5"))
						item = new Resources().c2p5();
					if (i.equals("c3"))
						item = new Resources().c3();
					if (i.equals("c3p5"))
						item = new Resources().c3p5();
					if (i.equals("c4"))
						item = new Resources().c4();
					items[position] = item;
					position++;
				}
				event.getDrops().clear();
				int num = r.nextInt(items.length);
				ItemStack result = items[num];
				if (result.equals(first)) {
					rest.add(first);
					if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						for (ItemStack i : rest) {
							if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(i.getType()) == -1 ||
									(player.getInventory().all(new ItemStack(i.getType(), i.getMaxStackSize())).size() ==
									player.getInventory().all(i.getType()).size()) && player.getInventory().all(i.getType()).size() != 0)) {
	//							inventory is full				
								world.dropItemNaturally(loc, i);
								player.sendMessage(ChatColor.RED + "Your inventory is full!");
							}
							else {
								player.getInventory().addItem(i);
//								System.out.print("Medusa-telepathy");
							}
						}
					}
					else
						for (ItemStack i : rest) {
							world.dropItemNaturally(event.getEntity().getLocation(), i);
//							System.out.print("Medusa");
						}
					return;
				}
				if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					if (player.getInventory().firstEmpty() == -1 && (player.getInventory().first(result.getType()) == -1 ||
								(player.getInventory().all(new ItemStack(result.getType(), result.getMaxStackSize())).size() ==
								player.getInventory().all(result.getType()).size()) && player.getInventory().all(result.getType()).size() != 0)) {
//							inventory is full				
							world.dropItemNaturally(loc, result);
							player.sendMessage(ChatColor.RED + "Your inventory is full!");
						}
						else {
							player.getInventory().addItem(result);
//							System.out.print("Medusa-telepathy");
					}
				}
				else {
						world.dropItemNaturally(event.getEntity().getLocation(), result);
//						System.out.print("Medusa");
				}
			});
		}
		return;
	}
	
//	Armor
	@EventHandler()
	public void radar(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null) {
			player.removePotionEffect(PotionEffectType.NIGHT_VISION);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.RADAR))
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 0));
		else player.removePotionEffect(PotionEffectType.NIGHT_VISION);
	}
	
	@EventHandler()
	public void water(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null) {
			player.removePotionEffect(PotionEffectType.WATER_BREATHING);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.WATER_BREATHING))
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1000000, 0));
		else player.removePotionEffect(PotionEffectType.WATER_BREATHING);
	}
	
	@EventHandler()
	public void haste(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getChestplate() == null) {
			player.removePotionEffect(PotionEffectType.FAST_DIGGING);
			return;
		}
		if (player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.HASTE)) {
			int lvl = player.getInventory().getChestplate().getItemMeta().getEnchantLevel(CustomEnchants.HASTE) - 1;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 1000000, lvl));
		}
		else player.removePotionEffect(PotionEffectType.FAST_DIGGING);
	}
			
	public int satCounter = 200;
	
	@EventHandler()
	public void saturation(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getLeggings() == null) {
			player.removePotionEffect(PotionEffectType.SATURATION);
			return;
		}
		if (player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.SATURATION))
			if (satCounter == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1, 0));
//				System.out.print(satCounter);
				satCounter = 200;
			}
			else satCounter--;
		else player.removePotionEffect(PotionEffectType.SATURATION);
	}
		
	@EventHandler()
	public void speedy(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.SPEED);
			return;
		}
		if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.SPEEDY)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.SPEEDY) - 1;
			if (!(player.hasPotionEffect(PotionEffectType.SPEED)))
				player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 1000000, lvl));
			return;
		}
		else player.removePotionEffect(PotionEffectType.SPEED);
	}
	
	@EventHandler()
	public void speedy(EntityTargetEvent e) {
		if (fighters.contains(e.getEntityType())) {
			LivingEntity mob = (LivingEntity) e.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
				return;
			if (equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.SPEEDY)) {
				int lvl = equip.getLeggings().getItemMeta().getEnchantLevel(CustomEnchants.SPEEDY);
				int orig = (int) mob.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
				AttributeModifier boost = new AttributeModifier("boost", orig * .2 * lvl, Operation.ADD_NUMBER);
				if (mob.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getModifiers().isEmpty())
					mob.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).addModifier(boost);
			}
			return;
		}
	}
	
	@EventHandler()
	public void softLand(EntityDamageEvent event) {
		if (event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			if (event.getCause() == DamageCause.FALL)
				if (player.getInventory().getBoots() != null)
					if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.SOFT_LANDING))
							event.setCancelled(true);
		}
		if (fighters.contains(event.getEntityType())) {

		LivingEntity mob = (LivingEntity) event.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (event.getCause() == DamageCause.FALL)
				if (!(equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR))))
					if (equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.SOFT_LANDING))
							event.setCancelled(true);
		}
	}
		
	@EventHandler()
	public void lucky(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.LUCK);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.LUCKY) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.LUCKY) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.LUCKY) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.LUCKY)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.LUCKY) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.LUCK))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 1000000, lvl));
					return;
				}
		}
		else player.removePotionEffect(PotionEffectType.LUCK);
	}
	
	@EventHandler()
	public void resistance(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.RESISTANCE) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.DAMAGE_RESISTANCE))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 1000000, lvl));
					return;
				}
		}
		else player.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
	}
	
	@EventHandler()
	public void resistance(EntityDamageEvent e) {
		if (fighters.contains(e.getEntityType())) {
			LivingEntity mob = (LivingEntity) e.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (equip.getHelmet() == null || equip.getHelmet().equals(new ItemStack(Material.AIR)) || equip.getChestplate() == null ||
					equip.getChestplate().equals(new ItemStack(Material.AIR)) || equip.getLeggings() == null ||
					equip.getLeggings().equals(new ItemStack(Material.AIR)) || equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
				return;
			if (equip.getHelmet().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && equip.getChestplate().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) &&
					equip.getLeggings().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE)) {
				if (equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
						int lvl = equip.getLeggings().getItemMeta().getEnchantLevel(CustomEnchants.RESISTANCE);
						e.setDamage(e.getDamage() * (1 - .2 * lvl));
				}
			}
			return;
		}
	}

	@EventHandler()
	public void strength(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.STRENGTH)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.STRENGTH) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.INCREASE_DAMAGE))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 1000000, lvl));
					return;
				}
		}
		else player.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
	}
	
	@EventHandler()
	public void strength(EntityTargetEvent e) {
		if (fighters.contains(e.getEntityType())) {
			LivingEntity mob = (LivingEntity) e.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (equip.getHelmet() == null || equip.getHelmet().equals(new ItemStack(Material.AIR)) || equip.getChestplate() == null ||
					equip.getChestplate().equals(new ItemStack(Material.AIR)) || equip.getLeggings() == null ||
					equip.getLeggings().equals(new ItemStack(Material.AIR)) || equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
				return;
			if (equip.getHelmet().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && equip.getChestplate().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) &&
					equip.getLeggings().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.STRENGTH)) {
				if (equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					int lvl = equip.getLeggings().getItemMeta().getEnchantLevel(CustomEnchants.STRENGTH);
					AttributeModifier boost = new AttributeModifier("boost", 5 * lvl, Operation.ADD_NUMBER);
					if (mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getModifiers().isEmpty())
						mob.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				}
			}
			return;
		}
	}
	
	@EventHandler()
	public void absorption(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.ABSORPTION) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.ABSORPTION))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200 + 2400 * (lvl + 1), lvl));
					return;
				}
		}
		return;
	}
	
	@EventHandler()
	public void absorption(EntityDamageEvent e) {
		if (fighters.contains(e.getEntityType())) {
			LivingEntity mob = (LivingEntity) e.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (equip.getHelmet() == null || equip.getHelmet().equals(new ItemStack(Material.AIR)) || equip.getChestplate() == null ||
					equip.getChestplate().equals(new ItemStack(Material.AIR)) || equip.getLeggings() == null ||
					equip.getLeggings().equals(new ItemStack(Material.AIR)) || equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
				return;
			if (equip.getHelmet().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && equip.getChestplate().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) &&
					equip.getLeggings().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION)) {
				if (equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					int lvl = equip.getLeggings().getItemMeta().getEnchantLevel(CustomEnchants.ABSORPTION);
					AttributeModifier boost = new AttributeModifier("boost", 2 * lvl, Operation.ADD_NUMBER);
					if (mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
						mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
						mob.setHealth(20 + lvl * 2);
					}
				}
			}
			return;
		}
	}
	
	@EventHandler()
	public void hero(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE);
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.HERO) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.HERO) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.HERO) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.HERO)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.HERO) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 1000000, lvl));
					return;
				}
		}
		else player.removePotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE);
	}
	
	@EventHandler()
	public void health(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		AttributeModifier boost = new AttributeModifier("boost", 20, Operation.ADD_NUMBER);
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null) {
			if (!player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty())
				player.getAttribute(Attribute.GENERIC_MAX_HEALTH).removeModifier(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().iterator().next());
			return;
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.HEALTHY)) {
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
					player.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
					return;
				}
		}
		else
			if (!player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty())
				player.getAttribute(Attribute.GENERIC_MAX_HEALTH).removeModifier(player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().iterator().next());
	}
	
	@EventHandler()
	public void health(EntityDamageEvent e) {
		if (fighters.contains(e.getEntityType())) {
			LivingEntity mob = (LivingEntity) e.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (equip.getHelmet() == null || equip.getHelmet().equals(new ItemStack(Material.AIR)) || equip.getChestplate() == null ||
					equip.getChestplate().equals(new ItemStack(Material.AIR)) || equip.getLeggings() == null ||
					equip.getLeggings().equals(new ItemStack(Material.AIR)) || equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
				return;
			if (equip.getHelmet().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) && equip.getChestplate().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) &&
					equip.getLeggings().getItemMeta().hasEnchant(CustomEnchants.HEALTHY) && equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.HEALTHY)) {
				if (equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
						equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					AttributeModifier boost = new AttributeModifier("boost", 10, Operation.ADD_NUMBER);
					if (!mob.getType().equals(EntityType.PIGLIN))
						if (mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
							mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
//							System.out.print(mob);
							mob.setHealth(30);
						}
					if (mob.getType().equals(EntityType.PIGLIN))
						if (mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
							mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
//							System.out.print(mob);
							mob.setHealth(26);
						}
				}
			}
			return;
		}
	}
	
	@EventHandler()
	public void dolphin(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getLeggings() == null) {
			player.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
			return;
		}
		if (player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.DOLPHIN)) {
			if (!(player.hasPotionEffect(PotionEffectType.DOLPHINS_GRACE)))
				player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 1000000, 0));
			return;
		}
		else player.removePotionEffect(PotionEffectType.DOLPHINS_GRACE);
	}
	
	@EventHandler()
	public void jump(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.JUMP);
			return;
		}
		if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.JUMP)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.JUMP) - 1;
			if (!(player.hasPotionEffect(PotionEffectType.JUMP)))
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 1000000, lvl));
			return;
		}
		else player.removePotionEffect(PotionEffectType.JUMP);
	}
	
	@EventHandler()
	public void vulcan(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getBoots() == null) {
			player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
			return;
		}
		if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.VULCAN)) {
			if (!(player.hasPotionEffect(PotionEffectType.FIRE_RESISTANCE)))
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1000000, 0));
			return;
		}
		else player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
	}
	
	@EventHandler()
	public void vulcan(EntityDamageEvent event) {
		if (fighters.contains(event.getEntityType())) {
			LivingEntity mob = (LivingEntity) event.getEntity();
			EntityEquipment equip = mob.getEquipment();
			if (event.getCause() == DamageCause.FIRE || event.getCause() == DamageCause.FIRE_TICK || event.getCause() == DamageCause.LAVA) {
				if (equip.getHelmet() == null || equip.getHelmet().equals(new ItemStack(Material.AIR)) || equip.getChestplate() == null ||
				equip.getChestplate().equals(new ItemStack(Material.AIR)) || equip.getLeggings() == null ||
				equip.getLeggings().equals(new ItemStack(Material.AIR)) || equip.getBoots() == null || equip.getBoots().equals(new ItemStack(Material.AIR)))
					return;
				if (equip.getHelmet().getItemMeta().hasEnchant(CustomEnchants.VULCAN) && equip.getChestplate().getItemMeta().hasEnchant(CustomEnchants.VULCAN) &&
						equip.getLeggings().getItemMeta().hasEnchant(CustomEnchants.VULCAN) && equip.getBoots().getItemMeta().hasEnchant(CustomEnchants.VULCAN))
					if (equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
							equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
							equip.getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(equip.getBoots().getItemMeta().getDisplayName().substring(0, 4)))
								event.setCancelled(true);
			}
		}
	}
	
	Map<String, Double> cooldowns = new HashMap<String, Double>();
	
	@EventHandler()
	public void projectile(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if (!(player.getInventory().getItemInMainHand().getType().equals(Material.TRIDENT) && player.getInventory().getItemInMainHand().getItemMeta().hasLore()))
			return;
		if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PROJECTILE))
			if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
				int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PROJECTILE);
//				add cooldown
				if (cooldowns.containsKey(player.getName())) {
//					player is inside hashmap
					if (cooldowns.get(player.getName()) > System.currentTimeMillis()) {
//						they still have time left in the cooldown
						double timeleft = (cooldowns.get(player.getName()) - System.currentTimeMillis()) / 1000;
						player.sendMessage(ChatColor.RED + "Wait " + timeleft + " second(s) to shoot!");
						return;
					}
				}
				player.launchProjectile(Arrow.class);
				cooldowns.put(player.getName(), System.currentTimeMillis() + (1.0 * lvl * 1000));
			}
		return;
	}
	
	@EventHandler()
	public void projectile(ProjectileLaunchEvent e) {
		if (!e.getEntityType().equals(EntityType.ARROW))
			return;
		if (!(e.getEntity().getShooter() instanceof Player))
			return;
		Player player = (Player) e.getEntity().getShooter();
		Arrow arrow = (Arrow) e.getEntity();
		if (!(player.getInventory().getItemInMainHand().getType().equals(Material.TRIDENT) && player.getInventory().getItemInMainHand().getItemMeta().hasLore()))
			return;
		if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PROJECTILE)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PROJECTILE);
			arrow.setPickupStatus(PickupStatus.DISALLOWED);
			arrow.setDamage(arrow.getDamage() + 18 * lvl);
			arrow.setPierceLevel(5 * lvl);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 2 * lvl);
		}	
		return;
	}
	
	@EventHandler()
	public void powered(ProjectileLaunchEvent e) {
		if (!e.getEntityType().equals(EntityType.ARROW))
			return;
		if (!(e.getEntity().getShooter() instanceof Player))
			return;
		Player player = (Player) e.getEntity().getShooter();
		Arrow arrow = (Arrow) e.getEntity();
		if (!(player.getInventory().getItemInMainHand().getType().equals(Material.CROSSBOW) && player.getInventory().getItemInMainHand().getItemMeta().hasLore()))
			return;
		if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.POWERED)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.POWERED);
			arrow.setDamage(arrow.getDamage() + 3 * lvl);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 1 * lvl);
		}	
		return;
	}

	@EventHandler()
	public void skellyBuff(ProjectileLaunchEvent e) {
		if (!e.getEntityType().equals(EntityType.ARROW))
			return;
		if (!(e.getEntity().getShooter() instanceof Skeleton || e.getEntity().getShooter() instanceof Stray))
			return;
		LivingEntity skelly = (LivingEntity) e.getEntity().getShooter();
		Arrow arrow = (Arrow) e.getEntity();
		if (skelly.getEquipment().getBoots().getItemMeta().getDisplayName().substring(0, 4).equals("Åò4T7")) {
			arrow.setDamage(arrow.getDamage() + 2);
			return;
		}
		if (skelly.getEquipment().getBoots().getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcT8")) {
			arrow.setDamage(arrow.getDamage() + 5);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 1);
			return;
		}
		if (skelly.getEquipment().getBoots().getItemMeta().getDisplayName().substring(0, 4).equals("ÅòcÅòl")) {
			arrow.setDamage(arrow.getDamage() + 8);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 2);
			return;
		}
		if (skelly.getEquipment().getBoots().getItemMeta().getDisplayName().substring(0, 4).equals("ÅòdÅòl")) {
			arrow.setDamage(arrow.getDamage() + 12);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 3);
			return;
		}	
		return;
	}
}