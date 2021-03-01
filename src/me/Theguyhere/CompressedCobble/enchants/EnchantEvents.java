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
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
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
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.Theguyhere.CompressedCobble.Main;
import me.Theguyhere.CompressedCobble.items.Armor;
import me.Theguyhere.CompressedCobble.items.Resources;
import me.Theguyhere.CompressedCobble.items.Tools;
import net.md_5.bungee.api.ChatColor;

public class EnchantEvents implements Listener {
	private final Main plugin;
	private final Resources resources;
	private final Tools t;
	private final Armor a;
	
	public EnchantEvents(Main plugin, Resources r, Tools t, Armor a) {
		this.plugin = plugin;
		this.resources = r;
		this.t = t;
		this.a = a;
	}
	
	EntityType[] fighter = {EntityType.DROWNED, EntityType.GIANT, EntityType.HOGLIN, EntityType.HUSK, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.SKELETON,
			EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH, EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE,
			EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
	Collection<EntityType> fighters = Arrays.asList(fighter);
	
//	Tools
	@EventHandler()
	public void onBlockBreak(BlockBreakEvent event) {
		Player player = event.getPlayer();

		// Only check custom items
		if (!player.getInventory().getItemInMainHand().hasItemMeta())
			return;

		// Only apply to survival players
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;

		Block block = event.getBlock();
		Material type = block.getType();
		Location loc = player.getLocation();
		World world = player.getWorld();
		Collection<ItemStack> drops = block.getDrops(player.getInventory().getItemInMainHand());

		// Ignore if nothing drops
		if (drops.isEmpty())
			return;

		// Stony enchant
		if ((type.equals(Material.STONE) || type.equals(Material.DIORITE) || type.equals(Material.GRANITE) ||
				type.equals(Material.ANDESITE)) && player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.STONY)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.STONY);

			// Loot drop if level is high enough
			if ((type.equals(Material.STONE) || type.equals(Material.DIORITE) && lvl > 2 || type.equals(Material.GRANITE) && lvl > 2 ||
					type.equals(Material.ANDESITE) && lvl > 2)) {

				ItemStack result = giveLoot(lvl, drops.iterator().next());

				event.setDropItems(false);
				if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					Main.giveItem(player, world, loc, result);
				}
				else {
					world.dropItemNaturally(block.getLocation(), result);
				}
			}
			return;
		}

		// Fiery enchant
		if ((type.equals(Material.GOLD_ORE) || type.equals(Material.IRON_ORE) || type.equals(Material.NETHER_GOLD_ORE) ||
				type.equals(Material.ANCIENT_DEBRIS)) && player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.FIERY)) {
			event.setDropItems(false);
			
			ItemStack result = null;
			int luck = 0;
			
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS))
				luck = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(Enchantment.LOOT_BONUS_BLOCKS);
			
			int r = 1 + new Random().nextInt(luck);

			if (type.equals(Material.GOLD_ORE))
				result = new ItemStack(Material.GOLD_INGOT, r);
			if (type.equals(Material.IRON_ORE))
				result = new ItemStack(Material.IRON_INGOT, r);
			if (type.equals(Material.NETHER_GOLD_ORE))
				result = new ItemStack(Material.GOLD_INGOT, r);
			if (type.equals(Material.ANCIENT_DEBRIS))
				result = new ItemStack(Material.NETHERITE_SCRAP, r);
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				Main.giveItem(player, world, loc, result);
			}
			else {
				world.dropItemNaturally(block.getLocation(), result);
			}
			return;
		}

		// Petrifying enchant
		if ((type.equals(Material.ACACIA_LOG) || type.equals(Material.BIRCH_LOG) || type.equals(Material.DARK_OAK_LOG) || type.equals(Material.JUNGLE_LOG) ||
				type.equals(Material.OAK_LOG) || type.equals(Material.SPRUCE_LOG) || type.equals(Material.CRIMSON_STEM) || type.equals(Material.WARPED_STEM)) &&
				player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PETRIFYING)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PETRIFYING);

			ItemStack result = giveLoot(lvl, drops.iterator().next());
			
			event.setDropItems(false);
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				Main.giveItem(player, world, loc, result);
			}
			else {
				world.dropItemNaturally(block.getLocation(), result);
			}
			return;
		}

		// Rocky enchant
		if ((type.equals(Material.DIRT) || type.equals(Material.SAND) || type.equals(Material.GRAVEL) || type.equals(Material.GRASS_BLOCK) ||
				type.equals(Material.COARSE_DIRT) || type.equals(Material.PODZOL) || type.equals(Material.SOUL_SAND) || type.equals(Material.SOUL_SOIL) ||
				type.equals(Material.RED_SAND)) && player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.ROCKY)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.ROCKY);

			ItemStack result = giveLoot(lvl, drops.iterator().next());
			
			event.setDropItems(false);
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				Main.giveItem(player, world, loc, result);
			}
			else {
				world.dropItemNaturally(block.getLocation(), result);
			}
			return;
		}

		// Pebbly enchant
		if ((type.equals(Material.WHEAT) || type.equals(Material.CARROTS) || type.equals(Material.POTATOES) || type.equals(Material.BEETROOT) ||
				type.equals(Material.NETHER_WART)) && player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PEBBLY)) {
			int lvl = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PEBBLY);

			if ((type.equals(Material.WHEAT)))
				if (!block.getBlockData().getAsString().equals("minecraft:wheat[age=7]")) {
					if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						Main.giveItem(player, world, loc, drops.iterator().next());
					}
					return;
				}
			if ((type.equals(Material.CARROTS)))
				if (!block.getBlockData().getAsString().equals("minecraft:carrots[age=7]")) {
					if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
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
			if ((type.equals(Material.POTATOES)))
				if (!block.getBlockData().getAsString().equals("minecraft:potatoes[age=7]")) {
					if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						Main.giveItem(player, world, loc, drops.iterator().next());
					}
					return;
				}
			if ((type.equals(Material.BEETROOT)))
				if (!block.getBlockData().getAsString().equals("minecraft:beetroots[age=3]")) {
					if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						Main.giveItem(player, world, loc, drops.iterator().next());
					}
					return;
				}
			if ((type.equals(Material.NETHER_WART)))
				if (!block.getBlockData().getAsString().equals("minecraft:nether_warts[age=3]")) {
					if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
						event.setDropItems(false);
						Main.giveItem(player, world, loc, drops.iterator().next());
					}
					return;
				}

			ItemStack first = drops.iterator().next();
			Collection<ItemStack> rest = new HashSet<>();
			
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext()) {
					rest.add(i);
				}
			}

			ItemStack result = giveLoot(lvl, new ItemStack(first));
			
			event.setDropItems(false);
			if (result.equals(first)) {
				if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					for (ItemStack i : rest) {
						Main.giveItem(player, world, loc, i);
					}
				}
				else 
					for (ItemStack i : rest) {
						world.dropItemNaturally(block.getLocation(), i);
					}
				return;
			}
			if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				Main.giveItem(player, world, loc, result);
				return;
			}
			else world.dropItemNaturally(block.getLocation(), result);
			return;
		}

		// Solo telepathy enchant
		if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
			if (block.getState() instanceof Container)
				return;	
			event.setDropItems(false);

			Collection<ItemStack> loot = new HashSet<>();
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext())
					loot.add(i);
			}
			for (ItemStack i : loot) {
				Main.giveItem(player, world, loc, i);
			}
		}
	}
	
	@EventHandler()
	public void onMobKill(EntityDeathEvent event) {
		if (event.getEntity().getKiller() == null)
			return;
		if (!event.getEntity().getKiller().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if (event.getEntity().getKiller().getGameMode() == GameMode.CREATIVE || event.getEntity().getKiller().getGameMode() == GameMode.SPECTATOR)
			return;

		EntityType[] entities = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.CREEPER, EntityType.DROWNED, EntityType.ENDERMAN, EntityType.ENDERMITE,
				EntityType.EVOKER, EntityType.GHAST, EntityType.GIANT, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.ILLUSIONER,
				EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.SKELETON, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH,
				EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
		Collection<EntityType> mobs = Arrays.asList(entities);
		Player player = event.getEntity().getKiller();
		Location loc = player.getLocation();
		World world = player.getWorld();
		Collection<ItemStack> drops = event.getDrops();
		
		if (drops.isEmpty()) {
			return;
		}
		if (mobs.contains(event.getEntityType()) &&
				event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.MEDUSA)) {
			ItemStack first = drops.iterator().next();
			
			drops.remove(drops.iterator().next());
			
			Collection<ItemStack> rest = new HashSet<>();
			
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext()) {
					rest.add(i);
				}
			}
			drops.clear();
			int lvl = event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.MEDUSA);
			ItemStack result = giveLoot(lvl, new ItemStack(first));
			
			if (result.equals(first)) {
				rest.add(first);
				if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
					for (ItemStack i : rest) {
						Main.giveItem(player, world, loc, i);
					}
				}
				else
					for (ItemStack i : rest) {
						world.dropItemNaturally(event.getEntity().getLocation(), i);
					}
				return;
			}
			if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
				Main.giveItem(player, world, loc, result);
			}
			else {
					world.dropItemNaturally(event.getEntity().getLocation(), result);
			}
			return;
		}
		if (event.getEntity().getKiller().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TELEPATHY)) {
			Collection<ItemStack> loot = new HashSet<>();
			for (ItemStack i : drops) {
				if (drops.iterator().hasNext())
					loot.add(i);
			}
			event.getDrops().clear();
			for (ItemStack i : loot) {
				Main.giveItem(player, world, loc, i);
			}
		}
	}
							
	
//	Armor
	@EventHandler()
	public void helmet(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null)
			return;
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.RADAR))
			player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 205, 0));
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.WATER_BREATHING))
			player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 205, 0));
	}
		
	@EventHandler()
	public void haste(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getChestplate() == null)
			return;
		if (player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.HASTE)) {
			int lvl = player.getInventory().getChestplate().getItemMeta().getEnchantLevel(CustomEnchants.HASTE) - 1;
			player.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 205, lvl));
		}
	}
			
	int satCounter = 200;
	
	@EventHandler()
	public void leggings(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getLeggings() == null) {
			return;
		}
		if (player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.SATURATION))
			if (satCounter == 0) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.SATURATION, 1, 0));
				satCounter = 200;
			}
			else satCounter--;
		else player.removePotionEffect(PotionEffectType.SATURATION);
		if (player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.DOLPHIN))
			player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 205, 0));
	}
		
	@EventHandler()
	public void boots(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getBoots() == null)
			return;
		if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.SPEEDY)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.SPEEDY) - 1;
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 205, lvl));
		}
		if (player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.JUMP)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.JUMP) - 1;
			player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 205, lvl));
		}
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
	public void full(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getHelmet() == null || player.getInventory().getChestplate() == null ||
				player.getInventory().getLeggings() == null || player.getInventory().getBoots() == null)
			return;
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.LUCKY) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.LUCKY) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.LUCKY) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.LUCKY)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.LUCKY) - 1;
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.LUCK, 205, lvl));
				}
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.RESISTANCE)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.RESISTANCE) - 1;
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 205, lvl));
				}
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.STRENGTH) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.STRENGTH)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.STRENGTH) - 1;
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 205, lvl));
				}
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.ABSORPTION)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.ABSORPTION) - 1;
			if (player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (!(player.hasPotionEffect(PotionEffectType.ABSORPTION))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.ABSORPTION, 1200 + 2400 * (lvl + 1), lvl));
				}
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.HERO) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.HERO) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.HERO) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.HERO)) {
			int lvl = player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.HERO) - 1;
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
					player.addPotionEffect(new PotionEffect(PotionEffectType.HERO_OF_THE_VILLAGE, 205, lvl));
				}
		}
		if (player.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.VULCAN) && player.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.VULCAN) &&
				player.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.VULCAN) && player.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.VULCAN)) {
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4))) {
				player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 205, 0));
				if (player.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.VULCAN) == 2)
					player.setFireTicks(0);
			}
		}
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
		}
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
		}
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
						mob.setHealth(mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
					}
				}
			}
		}
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
			if ((player.getInventory().getHelmet().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4)) ||
					player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet())) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getLeggings().getItemMeta().getDisplayName().substring(0, 4)) &&
					player.getInventory().getChestplate().getItemMeta().getDisplayName().substring(0, 4).equals(player.getInventory().getBoots().getItemMeta().getDisplayName().substring(0, 4)))
				if (player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
					player.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
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
					if (mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getModifiers().isEmpty()) {
						mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boost);
//							System.out.print(mob);
						mob.setHealth(mob.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
					}
				}
			}
		}
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
	
	@EventHandler()
	public void immunity(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		if (!(player.getInventory().getItemInOffHand().getType().equals(Material.SHIELD) && player.getInventory().getItemInOffHand().getItemMeta().hasLore()))
			return;
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getItemInOffHand().getItemMeta().hasEnchant(CustomEnchants.IMMUNITY)) {
			int lvl = player.getInventory().getItemInOffHand().getItemMeta().getEnchantLevel(CustomEnchants.IMMUNITY);
			if (lvl == 1) {
				player.removePotionEffect(PotionEffectType.SLOW);
				player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
				player.removePotionEffect(PotionEffectType.CONFUSION);
				player.removePotionEffect(PotionEffectType.BLINDNESS);
				player.removePotionEffect(PotionEffectType.HUNGER);
				player.removePotionEffect(PotionEffectType.WEAKNESS);
				player.removePotionEffect(PotionEffectType.POISON);
				player.removePotionEffect(PotionEffectType.WITHER);
				player.removePotionEffect(PotionEffectType.UNLUCK);
			}
			if (lvl == 2) {
				player.removePotionEffect(PotionEffectType.GLOWING);
				player.removePotionEffect(PotionEffectType.LEVITATION);
			}
		}
	}
	
	@EventHandler()
	public void immunity(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR)
			return;
		if (player.getInventory().getItemInOffHand().getType().equals(Material.AIR))
			return;
		if (player.getInventory().getItemInOffHand().getItemMeta().hasEnchant(CustomEnchants.IMMUNITY)) {
			int lvl = player.getInventory().getItemInOffHand().getItemMeta().getEnchantLevel(CustomEnchants.IMMUNITY);
			if (lvl == 2) {
				player.removePotionEffect(PotionEffectType.SLOW);
				player.removePotionEffect(PotionEffectType.SLOW_DIGGING);
				player.removePotionEffect(PotionEffectType.CONFUSION);
				player.removePotionEffect(PotionEffectType.BLINDNESS);
				player.removePotionEffect(PotionEffectType.HUNGER);
				player.removePotionEffect(PotionEffectType.WEAKNESS);
				player.removePotionEffect(PotionEffectType.POISON);
				player.removePotionEffect(PotionEffectType.WITHER);
				player.removePotionEffect(PotionEffectType.UNLUCK);
			}
		}
	}
	
//	Weapons stuff
	Map<String, Double> projectileCooldowns = new HashMap<>();
	Map<String, Double> rocketCooldowns = new HashMap<>();

	@EventHandler()
	public void projectile(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();
		int lvl = player.getLevel();
		int req;

		if (Main.equals(item, t.t9Range())) {
			req = 45;
		}
		else if (Main.equals(item, t.t10Range())) {
			req = 50;
		}
		else return;
		if (lvl < req) {
			e.setCancelled(true);
			return;
		}
		if (player.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.PROJECTILE))
			if (e.getAction() == Action.LEFT_CLICK_AIR || e.getAction() == Action.LEFT_CLICK_BLOCK) {
				int level = player.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.PROJECTILE);
//				add cooldown
				if (projectileCooldowns.containsKey(player.getName())) {
//					player is inside hashmap
					if (projectileCooldowns.get(player.getName()) > System.currentTimeMillis()) {
//						they still have time left in the cooldown
						double timeleft = (projectileCooldowns.get(player.getName()) - System.currentTimeMillis()) / 1000;
						player.sendMessage(ChatColor.RED + "Wait " + timeleft + " second(s) to shoot!");
						return;
					}
				}
				player.launchProjectile(Arrow.class);
				projectileCooldowns.put(player.getName(), System.currentTimeMillis() + (1.0 * level * 1000));
			}
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
	}
	
	@EventHandler()
	public void rocket(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		ItemStack item = player.getInventory().getItemInMainHand();
		int lvl = player.getLevel();
		int req = 0;

		// Ignore items without item meta
		if (!item.hasItemMeta())
			return;

		// Ignore non-custom items
		if (!item.getItemMeta().hasLore())
			return;

		// Ignore items without rocket enchant
		if (!item.getItemMeta().getEnchants().containsKey(CustomEnchants.ROCKET))
			return;

		// Check for t10 trident
		if (Main.equals(item, t.t10Range())) {
			req = 50;
		}

		// Check level requirement
		if (lvl < req) {
			e.setCancelled(true);
			player.sendMessage(ChatColor.RED + "Your level is not high enough to use this!");
			return;
		}

		if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
//				add cooldown
			if (rocketCooldowns.containsKey(player.getName())) {
//					player is inside hashmap
				if (rocketCooldowns.get(player.getName()) > System.currentTimeMillis()) {
//						they still have time left in the cooldown
					double timeleft = (rocketCooldowns.get(player.getName()) - System.currentTimeMillis()) / 1000;
					player.sendMessage(ChatColor.RED + "Wait " + timeleft + " second(s) to launch!");
					e.setCancelled(true);
					return;
				}
			}
			player.launchProjectile(Firework.class);
			rocketCooldowns.put(player.getName(), System.currentTimeMillis() + (1.5 * 1000));
			e.setCancelled(true);
		}
	}
	
	private ItemStack giveLoot(int lvl, ItemStack firstItem) {
		ItemStack[] items = new ItemStack[plugin.getConfig().getStringList("loot.lvl" + lvl).size()];
		ItemStack item = null;
		Random r = new Random();
		int position = 0;

		// Get loot table from config
		for (String i : plugin.getConfig().getStringList("loot.lvl" + lvl)) {
			switch (i) {
				case "0":
					item = firstItem;
					break;
				case "1":
					item = resources.t1();
					break;
				case "2":
					item = resources.t2();
					break;
				case "3":
					item = resources.t3();
					break;
				case "4":
					item = resources.t4();
					break;
				case "5":
					item = resources.t5();
					break;
				case "6":
					item = resources.t6();
					break;
				case "7":
					item = resources.t7();
					break;
				case "8":
					item = resources.t8();
					break;
				case "9":
					item = resources.t9();
					break;
				case "10":
					item = resources.t10();
					break;
				case "11":
					item = resources.not();
					break;
				case "12":
					item = resources.a();
					break;
			}

			items[position] = item;
			position++;
		}

		// Return random loot item
		int num = r.nextInt(items.length);
		return items[num];
	}
}