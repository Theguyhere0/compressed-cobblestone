package me.Theguyhere.CompressedCobble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;
import org.bukkit.inventory.ItemStack;

import me.Theguyhere.CompressedCobble.enchants.CustomEnchants;
import me.Theguyhere.CompressedCobble.items.Armor;
import me.Theguyhere.CompressedCobble.items.Tools;

public class MobSpawnEvents implements Listener {
	private Main plugin;
	private Tools t;
	private Armor a;
	
	public MobSpawnEvents(Main p, Tools t, Armor a) {
		this.plugin = p;
		this.t = t;
		this.a = a;
	}

	@EventHandler()
	public void onSpawn(CreatureSpawnEvent e) {
		if (!plugin.getConfig().getBoolean("mobBuff"))
			return;
		EntityType[] entities = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.CREEPER, EntityType.DROWNED, EntityType.ENDER_DRAGON, EntityType.ENDERMAN, EntityType.ENDERMITE,
				EntityType.EVOKER, EntityType.GIANT, EntityType.GUARDIAN, EntityType.HOGLIN, EntityType.HUSK, EntityType.ILLUSIONER, EntityType.IRON_GOLEM,
				EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.PIGLIN, EntityType.PILLAGER, EntityType.RAVAGER, EntityType.SKELETON, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.STRAY, EntityType.VEX, EntityType.VILLAGER, EntityType.VINDICATOR, EntityType.WITCH,
				EntityType.WITHER, EntityType.WITHER_SKELETON, EntityType.ZOGLIN, EntityType.ZOMBIE, EntityType.ZOMBIE_HORSE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};
		EntityType[] basics = {EntityType.BLAZE, EntityType.CAVE_SPIDER, EntityType.ENDER_DRAGON, EntityType.ENDERMAN, EntityType.ENDERMITE, EntityType.EVOKER, EntityType.GHAST,
				EntityType.GUARDIAN, EntityType.ILLUSIONER, EntityType.IRON_GOLEM, EntityType.MAGMA_CUBE, EntityType.PHANTOM, EntityType.RAVAGER, EntityType.SKELETON_HORSE,
				EntityType.SILVERFISH, EntityType.SLIME, EntityType.SPIDER, EntityType.VEX, EntityType.VINDICATOR, EntityType.WITCH, EntityType.WITHER, EntityType.ZOGLIN,
				EntityType.ZOMBIE_HORSE};
		EntityType[] fulls = {EntityType.DROWNED, EntityType.GIANT, EntityType.HOGLIN, EntityType.HUSK, EntityType.PIGLIN, 
				EntityType.WITHER_SKELETON, EntityType.ZOMBIE, EntityType.ZOMBIE_VILLAGER, EntityType.ZOMBIFIED_PIGLIN};

		Collection<EntityType> mobs = Arrays.asList(entities);
		Collection<EntityType> basicMobs = Arrays.asList(basics);
		Collection<EntityType> fullMobs = Arrays.asList(fulls);
		EntityType type = e.getEntityType();
		if (!mobs.contains(type))
			return;
		
		Location loc = e.getLocation();
		int lvl = 0;
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		try {
			plugin.getData().getConfigurationSection("data").getKeys(false).forEach(key -> {
				Location l = plugin.getData().getLocation("data." + key + ".location");
				int t = plugin.getData().getInt("data." + key + ".tier");
				int d = plugin.getData().getInt("data." + key + ".disarming");
				if (l.getWorld().equals(loc.getWorld()))
					if (loc.distanceSquared(l) < 200 * 200) {
						int num = t;
						if (d == 1)
							num -= 3;
						if (d == 2)
							num = 0;
						nums.add(num);
					}
			});
		} catch (Exception error) {
			return;
		}
		
		for (int i : nums)
			if (i > lvl)
				lvl = i;
		
		String config = "spawn.lvl" + lvl;
		
		if (lvl == 0 || lvl == 11 || lvl == 12)
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

			basic.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boostH);
			basic.setHealth(basic.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue());

			if (type != EntityType.ENDER_DRAGON) {
				int origA = (int) basic.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).getValue();
				AttributeModifier boostA = new AttributeModifier("boostA", origA * .2 * result, Operation.ADD_NUMBER);
				
				basic.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boostA);
			}
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
				full.getEquipment().setHelmet(a.t1Helmet());
				full.getEquipment().setChestplate(a.t1Chestplate());
				full.getEquipment().setLeggings(a.t1Leggings());
				full.getEquipment().setBoots(a.t1Boots());
				full.getEquipment().setItemInMainHand(t.t1Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(a.t2Helmet());
				full.getEquipment().setChestplate(a.t2Chestplate());
				full.getEquipment().setLeggings(a.t2Leggings());
				full.getEquipment().setBoots(a.t2Boots());
				full.getEquipment().setItemInMainHand(t.t2Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(a.t3Helmet());
				full.getEquipment().setChestplate(a.t3Chestplate());
				full.getEquipment().setLeggings(a.t3Leggings());
				full.getEquipment().setBoots(a.t3Boots());
				full.getEquipment().setItemInMainHand(t.t3Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(a.t4Helmet());
				full.getEquipment().setChestplate(a.t4Chestplate());
				full.getEquipment().setLeggings(a.t4Leggings());
				full.getEquipment().setBoots(a.t4Boots());
				full.getEquipment().setItemInMainHand(t.t4Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(a.t5Helmet());
				full.getEquipment().setChestplate(a.t5Chestplate());
				full.getEquipment().setLeggings(a.t5Leggings());
				full.getEquipment().setBoots(a.t5Boots());
				full.getEquipment().setItemInMainHand(t.t5Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(a.t6Helmet());
				full.getEquipment().setChestplate(a.t6Chestplate());
				full.getEquipment().setLeggings(a.t6Leggings());
				full.getEquipment().setBoots(a.t6Boots());
				full.getEquipment().setItemInMainHand(t.t6Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(a.t7Helmet());
				full.getEquipment().setChestplate(a.t7Chestplate());
				full.getEquipment().setLeggings(a.t7Leggings());
				full.getEquipment().setBoots(a.t7Boots());
				full.getEquipment().setItemInMainHand(t.t7Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(a.t8Helmet());
				full.getEquipment().setChestplate(a.t8Chestplate());
				full.getEquipment().setLeggings(a.t8Leggings());
				full.getEquipment().setBoots(a.t8Boots());
				full.getEquipment().setItemInMainHand(t.t8Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(a.t9Helmet());
				full.getEquipment().setChestplate(a.t9Chestplate());
				full.getEquipment().setLeggings(a.t9Leggings());
				full.getEquipment().setBoots(a.t9Boots());
				full.getEquipment().setItemInMainHand(t.t9Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(a.t10Helmet());
				full.getEquipment().setChestplate(a.t10Chestplate());
				full.getEquipment().setLeggings(a.t10Leggings());
				full.getEquipment().setBoots(a.t10Boots());
				full.getEquipment().setItemInMainHand(t.t10Axe());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
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
				full.getEquipment().setHelmet(a.t1Helmet());
				full.getEquipment().setChestplate(a.t1Chestplate());
				full.getEquipment().setLeggings(a.t1Leggings());
				full.getEquipment().setBoots(a.t1Boots());
				full.getEquipment().setItemInMainHand(t.t1Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(a.t2Helmet());
				full.getEquipment().setChestplate(a.t2Chestplate());
				full.getEquipment().setLeggings(a.t2Leggings());
				full.getEquipment().setBoots(a.t2Boots());
				full.getEquipment().setItemInMainHand(t.t2Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(a.t3Helmet());
				full.getEquipment().setChestplate(a.t3Chestplate());
				full.getEquipment().setLeggings(a.t3Leggings());
				full.getEquipment().setBoots(a.t3Boots());
				full.getEquipment().setItemInMainHand(t.t3Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(a.t4Helmet());
				full.getEquipment().setChestplate(a.t4Chestplate());
				full.getEquipment().setLeggings(a.t4Leggings());
				full.getEquipment().setBoots(a.t4Boots());
				full.getEquipment().setItemInMainHand(t.t4Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(a.t5Helmet());
				full.getEquipment().setChestplate(a.t5Chestplate());
				full.getEquipment().setLeggings(a.t5Leggings());
				full.getEquipment().setBoots(a.t5Boots());
				full.getEquipment().setItemInMainHand(t.t5Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(a.t6Helmet());
				full.getEquipment().setChestplate(a.t6Chestplate());
				full.getEquipment().setLeggings(a.t6Leggings());
				full.getEquipment().setBoots(a.t6Boots());
				full.getEquipment().setItemInMainHand(t.t6Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(a.t7Helmet());
				full.getEquipment().setChestplate(a.t7Chestplate());
				full.getEquipment().setLeggings(a.t7Leggings());
				full.getEquipment().setBoots(a.t7Boots());
				full.getEquipment().setItemInMainHand(t.t6Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(a.t8Helmet());
				full.getEquipment().setChestplate(a.t8Chestplate());
				full.getEquipment().setLeggings(a.t8Leggings());
				full.getEquipment().setBoots(a.t8Boots());
				full.getEquipment().setItemInMainHand(t.t6Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(a.t9Helmet());
				full.getEquipment().setChestplate(a.t9Chestplate());
				full.getEquipment().setLeggings(a.t9Leggings());
				full.getEquipment().setBoots(a.t9Boots());
				full.getEquipment().setItemInMainHand(t.t6Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(a.t10Helmet());
				full.getEquipment().setChestplate(a.t10Chestplate());
				full.getEquipment().setLeggings(a.t10Leggings());
				full.getEquipment().setBoots(a.t10Boots());
				full.getEquipment().setItemInMainHand(t.t6Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				full.getEquipment().setItemInMainHandDropChance(0);
				full.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).addModifier(boost);
				return;
			}
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
				full.getEquipment().setHelmet(a.t1Helmet());
				full.getEquipment().setChestplate(a.t1Chestplate());
				full.getEquipment().setLeggings(a.t1Leggings());
				full.getEquipment().setBoots(a.t1Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 2) {
				full.getEquipment().setHelmet(a.t2Helmet());
				full.getEquipment().setChestplate(a.t2Chestplate());
				full.getEquipment().setLeggings(a.t2Leggings());
				full.getEquipment().setBoots(a.t2Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;					
			}
			if (result == 3) {
				full.getEquipment().setHelmet(a.t3Helmet());
				full.getEquipment().setChestplate(a.t3Chestplate());
				full.getEquipment().setLeggings(a.t3Leggings());
				full.getEquipment().setBoots(a.t3Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 4) {
				full.getEquipment().setHelmet(a.t4Helmet());
				full.getEquipment().setChestplate(a.t4Chestplate());
				full.getEquipment().setLeggings(a.t4Leggings());
				full.getEquipment().setBoots(a.t4Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 5) {
				full.getEquipment().setHelmet(a.t5Helmet());
				full.getEquipment().setChestplate(a.t5Chestplate());
				full.getEquipment().setLeggings(a.t5Leggings());
				full.getEquipment().setBoots(a.t5Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 6) {
				full.getEquipment().setHelmet(a.t6Helmet());
				full.getEquipment().setChestplate(a.t6Chestplate());
				full.getEquipment().setLeggings(a.t6Leggings());
				full.getEquipment().setBoots(a.t6Boots());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 7) {
				full.getEquipment().setHelmet(a.t7Helmet());
				full.getEquipment().setChestplate(a.t7Chestplate());
				full.getEquipment().setLeggings(a.t7Leggings());
				full.getEquipment().setBoots(a.t7Boots());
				full.getEquipment().setItemInMainHand(t.t7Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 8) {
				full.getEquipment().setHelmet(a.t8Helmet());
				full.getEquipment().setChestplate(a.t8Chestplate());
				full.getEquipment().setLeggings(a.t8Leggings());
				full.getEquipment().setBoots(a.t8Boots());
				full.getEquipment().setItemInMainHand(t.t8Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 9) {
				full.getEquipment().setHelmet(a.t9Helmet());
				full.getEquipment().setChestplate(a.t9Chestplate());
				full.getEquipment().setLeggings(a.t9Leggings());
				full.getEquipment().setBoots(a.t9Boots());
				full.getEquipment().setItemInMainHand(t.t8Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
			if (result == 10) {
				full.getEquipment().setHelmet(a.t10Helmet());
				full.getEquipment().setChestplate(a.t10Chestplate());
				full.getEquipment().setLeggings(a.t10Leggings());
				full.getEquipment().setBoots(a.t10Boots());
				full.getEquipment().setItemInMainHand(t.t8Range());
				full.getEquipment().setHelmetDropChance(0);
				full.getEquipment().setChestplateDropChance(0);
				full.getEquipment().setLeggingsDropChance(0);
				full.getEquipment().setBootsDropChance(0);
				return;
			}
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
			return;
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
		
		if (type == EntityType.VILLAGER) {
			Villager villager = (Villager) e.getEntity();
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
			int origH = (int) villager.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue();
			AttributeModifier boostH = new AttributeModifier("boost", origH * .2 * result, Operation.ADD_NUMBER);
			int origS = (int) villager.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue();
			AttributeModifier boost = new AttributeModifier("boost", origS * .2 * lvl, Operation.ADD_NUMBER);
			
			villager.getAttribute(Attribute.GENERIC_MAX_HEALTH).addModifier(boostH);
			villager.setHealth(origH + origH * .2 * result);
			villager.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).addModifier(boost);
			return;
		}
	}
	
	@EventHandler()
	public void skellyBuff(ProjectileLaunchEvent e) {
		if (!plugin.getConfig().getBoolean("mobBuff"))
			return;
		
		if (!e.getEntityType().equals(EntityType.ARROW))
			return;
		if (!(e.getEntity().getShooter() instanceof Skeleton || e.getEntity().getShooter() instanceof Stray))
			return;
		LivingEntity skelly = (LivingEntity) e.getEntity().getShooter();
		Arrow arrow = (Arrow) e.getEntity();
		if (skelly.getEquipment().getBoots() == null || skelly.getEquipment().getBoots().getType() == Material.AIR)
			return;
		if (Main.equals(skelly.getEquipment().getBoots(), a.t7Boots())) {
			arrow.setDamage(arrow.getDamage() + 2);
			return;
		}
		if (Main.equals(skelly.getEquipment().getBoots(), a.t8Boots())) {
			arrow.setDamage(arrow.getDamage() + 5);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 1);
			return;
		}
		if (Main.equals(skelly.getEquipment().getBoots(), a.t9Boots())) {
			arrow.setDamage(arrow.getDamage() + 8);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 2);
			return;
		}
		if (Main.equals(skelly.getEquipment().getBoots(), a.t10Boots())) {
			arrow.setDamage(arrow.getDamage() + 12);
			arrow.setKnockbackStrength(arrow.getKnockbackStrength() + 3);
			return;
		}	
		return;
	}
	
	Map<String, Double> statCheckCooldowns = new HashMap<String, Double>();
	
	@EventHandler()
	public void playerStat(PlayerStatisticIncrementEvent e) {
		if (!plugin.getConfig().getBoolean("mobBuff"))
			return;

		if (!e.getStatistic().equals(Statistic.TIME_SINCE_REST))
			return;
		
		Player player = e.getPlayer();
		if (statCheckCooldowns.containsKey(player.getName()))
//			player is inside hashmap
			if (statCheckCooldowns.get(player.getName()) > System.currentTimeMillis())
//				they still have time left in the cooldown
				return;
		statCheckCooldowns.put(player.getName(), System.currentTimeMillis() + (0.5 * 1000));
		
		if (player.getGameMode() == GameMode.CREATIVE || player.getGameMode() == GameMode.SPECTATOR) {
			removePlayer(player);
			return;
		}
		
		int highestTier = 0;
		int disarming = 0;
		Collection<ItemStack> keyItems = new HashSet<>();
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
		materials.add(Material.SHIELD);

		for (Material m : materials) {
			Set<Integer> preKeys = player.getInventory().all(m).keySet();
			for (int i : preKeys) {
				ItemStack item = player.getInventory().all(m).get(i);
				keyItems.add(item);
			}
		}
		
		ItemStack item = player.getInventory().getItemInOffHand();
		if (!(item == null || item.getType() == Material.AIR))	
			if (item.getItemMeta().hasLore())
				keyItems.add(item);
				
		for (ItemStack i : keyItems) {
			if (highestTier < 10) {
				for (ItemStack j : t.t10s())
					if (Main.equals(i, j))
						highestTier = 10;
				for (ItemStack j : a.t10s())
					if (Main.equals(i, j))
						highestTier = 10;
			}
			if (highestTier < 9) {
				for (ItemStack j : t.t9s())
					if (Main.equals(i, j))
						highestTier = 9;
				for (ItemStack j : a.t9s())
					if (Main.equals(i, j))
						highestTier = 9;
			}
			if (highestTier < 8) {
				for (ItemStack j : t.t8s())
					if (Main.equals(i, j))
						highestTier = 8;
				for (ItemStack j : a.t8s())
					if (Main.equals(i, j))
						highestTier = 8;
			}
			if (highestTier < 7) {
				for (ItemStack j : t.t7s())
					if (Main.equals(i, j))
						highestTier = 7;
				for (ItemStack j : a.t7s())
					if (Main.equals(i, j))
						highestTier = 7;
			}
			if (highestTier < 6) {
				for (ItemStack j : t.t6s())
					if (Main.equals(i, j))
						highestTier = 6;
				for (ItemStack j : a.t6s())
					if (Main.equals(i, j))
						highestTier = 6;
			}
			if (highestTier < 5) {
				for (ItemStack j : t.t5s())
					if (Main.equals(i, j))
						highestTier = 5;
				for (ItemStack j : a.t5s())
					if (Main.equals(i, j))
						highestTier = 5;
			}
			if (highestTier < 4) {
				for (ItemStack j : t.t4s())
					if (Main.equals(i, j))
						highestTier = 4;
				for (ItemStack j : a.t4s())
					if (Main.equals(i, j))
						highestTier = 4;
			}
			if (highestTier < 3) {
				for (ItemStack j : t.t3s())
					if (Main.equals(i, j))
						highestTier = 3;
				for (ItemStack j : a.t3s())
					if (Main.equals(i, j))
						highestTier = 3;
			}
			if (highestTier < 2) {
				for (ItemStack j : t.t2s())
					if (Main.equals(i, j))
						highestTier = 2;
				for (ItemStack j : a.t2s())
					if (Main.equals(i, j))
						highestTier = 2;
			}
			if (highestTier < 1) {
				for (ItemStack j : t.t1s())
					if (Main.equals(i, j))
						highestTier = 1;
				for (ItemStack j : a.t1s())
					if (Main.equals(i, j))
						highestTier = 1;
			}
		}
		
		if (highestTier == 0) {
			removePlayer(player);
			return;
		}
				
		if (!(player.getInventory().getHelmet() == null || player.getInventory().getHelmet().getType() == Material.AIR))
		if (player.getInventory().getHelmet().equals(a.notHelmet()) || player.getInventory().getHelmet().equals(a.aHelmet()))
			disarming = player.getInventory().getHelmet().getItemMeta().getEnchantLevel(CustomEnchants.DISARMING);
		highestTier += disarming;
		plugin.getData().set("data." + player.getName().toString() + ".location", player.getLocation());
		plugin.getData().set("data." + player.getName().toString() + ".tier", highestTier);
		plugin.getData().set("data." + player.getName().toString() + ".disarming", disarming);
		plugin.saveData();
		return;
	}
	
	private void removePlayer(Player player) {
		plugin.getData().set("data." + player.getName().toString(), null);
		plugin.saveData();
	}
}
