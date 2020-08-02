package me.Theguyhere.CompressedCobble;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Statistic;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Stray;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

import me.Theguyhere.CompressedCobble.items.Tools;

public class MobSpawnEvents implements Listener {
	private Plugin plugin;
	
	public MobSpawnEvents(Main plugin) {
		this.plugin = plugin;
	}

	private HashMap<String, Location> locations = new HashMap<>();
	private HashMap<String, Integer> tiers = new HashMap<>();

	@EventHandler()
	public void onSpawn(CreatureSpawnEvent e) {
		EntityType[] entities = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.CREEPER, EntityType.DROWNED, EntityType.ENDERMAN, EntityType.ENDERMITE,
				EntityType.EVOKER, EntityType.GIANT, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.ILLUSIONER,
				EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.SKELETON, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH,
				EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
		EntityType[] basics = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.ENDERMAN, EntityType.ENDERMITE, EntityType.EVOKER, EntityType.GHAST,
				EntityType.GUARDIAN, EntityType.ILLUSIONER, EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.RAVAGER, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH, EntityType.ZOGLIN,
				EntityType.ZOMBIE_HORSE};
		EntityType[] fulls = {EntityType.DROWNED, EntityType.GIANT, EntityType.HOGLIN, EntityType.HUSK, EntityType.PIGLIN, 
				EntityType.WITHER_SKELETON, EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};

		Collection<EntityType> mobs = Arrays.asList(entities);
		Collection<EntityType> basicMobs = Arrays.asList(basics);
		Collection<EntityType> fullMobs = Arrays.asList(fulls);
		EntityType type = e.getEntityType();
		if (!mobs.contains(type))
			return;
//		System.out.print("spawned");
		
		Location loc = e.getLocation();
		Set<String> names = new HashSet<>();
		int lvl = 0;
		if (locations.isEmpty())
			return;
		
		locations.forEach((k, v) -> {
			if (e.getEntity().getWorld().getEnvironment() == loc.getWorld().getEnvironment())
				if (loc.distance(v) < 200)
					names.add(k);
		});
		for (String i : names) {
			if (tiers.get(i) > lvl)
				lvl = tiers.get(i);
		}
		
		String config = "tier" + lvl;
		
		if (lvl == 0)
			return;
		
		if (basicMobs.contains(type)) {
			LivingEntity basic = (LivingEntity) e.getEntity();	
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			int origH = (int) basic.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
			AttributeModifier boostH = new AttributeModifier("boostH", origH * .2 * result, Operation.ADD_NUMBER);
//			System.out.print(basic);
			int origA = (int) basic.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
			AttributeModifier boostA = new AttributeModifier("boostA", origA * .2 * result, Operation.ADD_NUMBER);
			
			basic.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boostH);
			basic.setHealth(basic.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());
			basic.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boostA);
		}
				
		if (fullMobs.contains(type)) {
			LivingEntity full = (LivingEntity) e.getEntity();	
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			
			if (result == 1) {
				full.getEquipment().setHelmet(new Tools().c0p5Helmet());
				full.getEquipment().setChestplate(new Tools().c0p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c0p5Leggings());
				full.getEquipment().setBoots(new Tools().c0p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c0p5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(new Tools().c1Helmet());
				full.getEquipment().setChestplate(new Tools().c1Chestplate());
				full.getEquipment().setLeggings(new Tools().c1Leggings());
				full.getEquipment().setBoots(new Tools().c1Boots());
				full.getEquipment().setItemInMainHand(new Tools().c1Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(new Tools().c1p5Helmet());
				full.getEquipment().setChestplate(new Tools().c1p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c1p5Leggings());
				full.getEquipment().setBoots(new Tools().c1p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c1p5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(new Tools().c2Helmet());
				full.getEquipment().setChestplate(new Tools().c2Chestplate());
				full.getEquipment().setLeggings(new Tools().c2Leggings());
				full.getEquipment().setBoots(new Tools().c2Boots());
				full.getEquipment().setItemInMainHand(new Tools().c2Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(new Tools().c2p5Helmet());
				full.getEquipment().setChestplate(new Tools().c2p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c2p5Leggings());
				full.getEquipment().setBoots(new Tools().c2p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c2p5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(new Tools().c3Helmet());
				full.getEquipment().setChestplate(new Tools().c3Chestplate());
				full.getEquipment().setLeggings(new Tools().c3Leggings());
				full.getEquipment().setBoots(new Tools().c3Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(new Tools().c3p5Helmet());
				full.getEquipment().setChestplate(new Tools().c3p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c3p5Leggings());
				full.getEquipment().setBoots(new Tools().c3p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3p5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(new Tools().c4Helmet());
				full.getEquipment().setChestplate(new Tools().c4Chestplate());
				full.getEquipment().setLeggings(new Tools().c4Leggings());
				full.getEquipment().setBoots(new Tools().c4Boots());
				full.getEquipment().setItemInMainHand(new Tools().c4Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(new Tools().c4p5Helmet());
				full.getEquipment().setChestplate(new Tools().c4p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c4p5Leggings());
				full.getEquipment().setBoots(new Tools().c4p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c4p5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(new Tools().c5Helmet());
				full.getEquipment().setChestplate(new Tools().c5Chestplate());
				full.getEquipment().setLeggings(new Tools().c5Leggings());
				full.getEquipment().setBoots(new Tools().c5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 0)
				return;
			return;
		}
		
		if (type == EntityType.SKELETON || type == EntityType.STRAY) {
			LivingEntity full = (LivingEntity) e.getEntity();
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			int orig = (int) full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
			AttributeModifier boost = new AttributeModifier("boost", orig * 50 * (result - 6), Operation.ADD_NUMBER);

			if (result == 1) {
				full.getEquipment().setHelmet(new Tools().c0p5Helmet());
				full.getEquipment().setChestplate(new Tools().c0p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c0p5Leggings());
				full.getEquipment().setBoots(new Tools().c0p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c0p5Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(new Tools().c1Helmet());
				full.getEquipment().setChestplate(new Tools().c1Chestplate());
				full.getEquipment().setLeggings(new Tools().c1Leggings());
				full.getEquipment().setBoots(new Tools().c1Boots());
				full.getEquipment().setItemInMainHand(new Tools().c1Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(new Tools().c1p5Helmet());
				full.getEquipment().setChestplate(new Tools().c1p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c1p5Leggings());
				full.getEquipment().setBoots(new Tools().c1p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c1p5Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(new Tools().c2Helmet());
				full.getEquipment().setChestplate(new Tools().c2Chestplate());
				full.getEquipment().setLeggings(new Tools().c2Leggings());
				full.getEquipment().setBoots(new Tools().c2Boots());
				full.getEquipment().setItemInMainHand(new Tools().c2Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(new Tools().c2p5Helmet());
				full.getEquipment().setChestplate(new Tools().c2p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c2p5Leggings());
				full.getEquipment().setBoots(new Tools().c2p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c2p5Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(new Tools().c3Helmet());
				full.getEquipment().setChestplate(new Tools().c3Chestplate());
				full.getEquipment().setLeggings(new Tools().c3Leggings());
				full.getEquipment().setBoots(new Tools().c3Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(new Tools().c3p5Helmet());
				full.getEquipment().setChestplate(new Tools().c3p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c3p5Leggings());
				full.getEquipment().setBoots(new Tools().c3p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(new Tools().c4Helmet());
				full.getEquipment().setChestplate(new Tools().c4Chestplate());
				full.getEquipment().setLeggings(new Tools().c4Leggings());
				full.getEquipment().setBoots(new Tools().c4Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(new Tools().c4p5Helmet());
				full.getEquipment().setChestplate(new Tools().c4p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c4p5Leggings());
				full.getEquipment().setBoots(new Tools().c4p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(new Tools().c5Helmet());
				full.getEquipment().setChestplate(new Tools().c5Chestplate());
				full.getEquipment().setLeggings(new Tools().c5Leggings());
				full.getEquipment().setBoots(new Tools().c5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 0)
				return;
			return;
		}
		
		if (type == EntityType.PILLAGER) {
			LivingEntity full = (LivingEntity) e.getEntity();	
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			
			if (result == 1) {
				full.getEquipment().setHelmet(new Tools().c0p5Helmet());
				full.getEquipment().setChestplate(new Tools().c0p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c0p5Leggings());
				full.getEquipment().setBoots(new Tools().c0p5Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(new Tools().c1Helmet());
				full.getEquipment().setChestplate(new Tools().c1Chestplate());
				full.getEquipment().setLeggings(new Tools().c1Leggings());
				full.getEquipment().setBoots(new Tools().c1Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(new Tools().c1p5Helmet());
				full.getEquipment().setChestplate(new Tools().c1p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c1p5Leggings());
				full.getEquipment().setBoots(new Tools().c1p5Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(new Tools().c2Helmet());
				full.getEquipment().setChestplate(new Tools().c2Chestplate());
				full.getEquipment().setLeggings(new Tools().c2Leggings());
				full.getEquipment().setBoots(new Tools().c2Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(new Tools().c2p5Helmet());
				full.getEquipment().setChestplate(new Tools().c2p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c2p5Leggings());
				full.getEquipment().setBoots(new Tools().c2p5Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(new Tools().c3Helmet());
				full.getEquipment().setChestplate(new Tools().c3Chestplate());
				full.getEquipment().setLeggings(new Tools().c3Leggings());
				full.getEquipment().setBoots(new Tools().c3Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(new Tools().c3p5Helmet());
				full.getEquipment().setChestplate(new Tools().c3p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c3p5Leggings());
				full.getEquipment().setBoots(new Tools().c3p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c3p5Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(new Tools().c4Helmet());
				full.getEquipment().setChestplate(new Tools().c4Chestplate());
				full.getEquipment().setLeggings(new Tools().c4Leggings());
				full.getEquipment().setBoots(new Tools().c4Boots());
				full.getEquipment().setItemInMainHand(new Tools().c4Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(new Tools().c4p5Helmet());
				full.getEquipment().setChestplate(new Tools().c4p5Chestplate());
				full.getEquipment().setLeggings(new Tools().c4p5Leggings());
				full.getEquipment().setBoots(new Tools().c4p5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c4Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(new Tools().c5Helmet());
				full.getEquipment().setChestplate(new Tools().c5Chestplate());
				full.getEquipment().setLeggings(new Tools().c5Leggings());
				full.getEquipment().setBoots(new Tools().c5Boots());
				full.getEquipment().setItemInMainHand(new Tools().c4Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 0)
				return;
			return;
		}
		
		if (type == EntityType.GHAST) {
			Ghast ghast = (Ghast) e.getEntity();	
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			int orig = (int) ghast.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
			AttributeModifier boostH = new AttributeModifier("boost", orig * .2 * result, Operation.ADD_NUMBER);
			
			ghast.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boostH);
			ghast.setHealth(orig + orig * .2 * result);
		}
		
		if (type == EntityType.CREEPER) {
			Creeper creeper = (Creeper) e.getEntity();
			Integer[] items = new Integer[plugin.getConfig().getStringList(config).size()];
			int item = 0;
			Random r = new Random();
			int position = 0;
			for (String i : plugin.getConfig().getStringList(config)) {
				item = Integer.parseInt(i);
				items[position] = item;
				position++;
			}
			int num = r.nextInt(items.length);
			int result = items[num];
			if (result > 5)
				creeper.setPowered(true);
			return;
		}
	}
	
	@EventHandler()
	public void playerStat(PlayerStatisticIncrementEvent e) {
		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
//		System.out.print(e.getStatistic() + "a");
		Player player = e.getPlayer();
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR) {
			if (locations.containsKey(player.getName()))
				locations.remove(player.getName());
			if (tiers.containsKey(player.getName()))
				tiers.remove(player.getName());
			return;
		}
		int highestTier = 0;
		Set<String> keyValues = new HashSet<>();
		Collection<Material> materials = new HashSet<>();
		materials.add(Material.STONE_AXE);
		materials.add(Material.STONE_PICKAXE);
		materials.add(Material.STONE_SHOVEL);
		materials.add(Material.STONE_HOE);
		materials.add(Material.STONE_SWORD);
		materials.add(Material.IRON_AXE);
		materials.add(Material.IRON_PICKAXE);
		materials.add(Material.IRON_SHOVEL);
		materials.add(Material.IRON_HOE);
		materials.add(Material.IRON_SWORD);
		materials.add(Material.DIAMOND_AXE);
		materials.add(Material.DIAMOND_PICKAXE);
		materials.add(Material.DIAMOND_SHOVEL);
		materials.add(Material.DIAMOND_HOE);
		materials.add(Material.DIAMOND_SWORD);
		materials.add(Material.NETHERITE_AXE);
		materials.add(Material.NETHERITE_PICKAXE);
		materials.add(Material.NETHERITE_SHOVEL);
		materials.add(Material.NETHERITE_HOE);
		materials.add(Material.NETHERITE_SWORD);
		materials.add(Material.LEATHER_HELMET);
		materials.add(Material.LEATHER_CHESTPLATE);
		materials.add(Material.LEATHER_LEGGINGS);
		materials.add(Material.LEATHER_BOOTS);
		materials.add(Material.CHAINMAIL_HELMET);
		materials.add(Material.CHAINMAIL_CHESTPLATE);
		materials.add(Material.CHAINMAIL_LEGGINGS);
		materials.add(Material.CHAINMAIL_BOOTS);
		materials.add(Material.IRON_HELMET);
		materials.add(Material.IRON_CHESTPLATE);
		materials.add(Material.IRON_LEGGINGS);
		materials.add(Material.IRON_BOOTS);
		materials.add(Material.DIAMOND_HELMET);
		materials.add(Material.DIAMOND_CHESTPLATE);
		materials.add(Material.DIAMOND_LEGGINGS);
		materials.add(Material.DIAMOND_BOOTS);
		materials.add(Material.NETHERITE_HELMET);
		materials.add(Material.NETHERITE_CHESTPLATE);
		materials.add(Material.NETHERITE_LEGGINGS);
		materials.add(Material.NETHERITE_BOOTS);
		materials.add(Material.ELYTRA);
		materials.add(Material.BOW);
		materials.add(Material.CROSSBOW);
		materials.add(Material.TRIDENT);

		for (Material m : materials) {
			Set<Integer> preKeys = player.getInventory().all(m).keySet();
			for (int i : preKeys) {
				ItemStack item = player.getInventory().all(m).get(i);
				if (item.getItemMeta().hasLore())
					keyValues.add(item.getItemMeta().getDisplayName().substring(0, 4));
			}
		}
		
//		System.out.print(player.getName() + "b");
		
		if (keyValues.isEmpty()) {
			if (locations.containsKey(player.getName()))
				locations.remove(player.getName());
			if (tiers.containsKey(player.getName()))
				tiers.remove(player.getName());
			return;
		}
		
		if (keyValues.contains("ÅòfT1"))
			highestTier = 1;
		if (keyValues.contains("ÅòeT2"))
			highestTier = 2;
		if (keyValues.contains("ÅòeT3"))
			highestTier = 3;
		if (keyValues.contains("Åò6T4"))
			highestTier = 4;
		if (keyValues.contains("Åò6T5"))
			highestTier = 5;
		if (keyValues.contains("Åò4T6"))
			highestTier = 6;
		if (keyValues.contains("Åò4T7"))
			highestTier = 7;
		if (keyValues.contains("ÅòcT8"))
			highestTier = 8;
		if (keyValues.contains("ÅòcÅòl"))
			highestTier = 9;
		if (keyValues.contains("ÅòdÅòl"))
			highestTier = 10;
		
		if (highestTier == 0) {
			if (locations.containsKey(player.getName()))
				locations.remove(player.getName());
			if (tiers.containsKey(player.getName()))
				tiers.remove(player.getName());
			return;
		}
		
//		System.out.print(highestTier + "c");
		
		locations.put(player.getName(), player.getLocation());
		tiers.put(player.getName(), highestTier);
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
