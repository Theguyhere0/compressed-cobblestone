package me.Theguyhere.CompressedCobble.enchants;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.enchantments.Enchantment;

public class CustomEnchants {
	public static final Enchantment TELEPATHY = new EnchantmentWrapper("telepathy", "Telepathy", 1);
	public static final Enchantment STONY = new EnchantmentWrapper("stony", "Stony", 5);
	public static final Enchantment FIERY = new EnchantmentWrapper("fiery", "Fiery", 1);
	public static final Enchantment PETRIFYING = new EnchantmentWrapper("petrifying", "Petrifying", 5);
	public static final Enchantment ROCKY = new EnchantmentWrapper("rocky", "Rocky", 5);
	public static final Enchantment PEBBLY = new EnchantmentWrapper("pebbly", "Pebbly", 5);
	public static final Enchantment MEDUSA = new EnchantmentWrapper("medusa", "Medusa", 8);
	public static final Enchantment RADAR = new EnchantmentWrapper("radar", "Radar", 1);
	public static final Enchantment WATER_BREATHING = new EnchantmentWrapper("water_breathing", "Water Breathing", 1);
	public static final Enchantment HASTE = new EnchantmentWrapper("haste", "Haste", 2);
	public static final Enchantment SATURATION = new EnchantmentWrapper("saturation", "Saturation", 1);
	public static final Enchantment SPEEDY = new EnchantmentWrapper("speedy", "Speedy", 3);
	public static final Enchantment SOFT_LANDING = new EnchantmentWrapper("soft_landing", "Soft Landing", 1);
	public static final Enchantment LUCKY = new EnchantmentWrapper("lucky", "Lucky", 5);
	public static final Enchantment RESISTANCE = new EnchantmentWrapper("resistance", "Resistance", 3);
	public static final Enchantment STRENGTH = new EnchantmentWrapper("strength", "Strength", 2);
	public static final Enchantment ABSORPTION = new EnchantmentWrapper("absorption", "Absorption", 4);
	public static final Enchantment HERO = new EnchantmentWrapper("hero", "Hero", 5);
	public static final Enchantment HEALTHY = new EnchantmentWrapper("healthy", "Healthy", 1);
	public static final Enchantment DOLPHIN = new EnchantmentWrapper("dolphin", "Dolphin", 5);
	public static final Enchantment JUMP = new EnchantmentWrapper("jump", "Jump", 5);
	public static final Enchantment VULCAN = new EnchantmentWrapper("vulcan", "Vulcan", 1);
	public static final Enchantment PROJECTILE = new EnchantmentWrapper("projectile", "Projectile", 2);
	public static final Enchantment POWERED = new EnchantmentWrapper("powered", "Powered", 2);
	public static final Enchantment ROCKET = new EnchantmentWrapper("rocket", "Rocket", 1);

	public static void register() {
		boolean regTelepathy = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.TELEPATHY);
		boolean regStony = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.STONY);
		boolean regFiery = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.FIERY);
		boolean regPetrifying = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.PETRIFYING);
		boolean regRocky = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.ROCKY);
		boolean regPebbly = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.PEBBLY);
		boolean regMedusa = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.MEDUSA);
		boolean regRadar = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.RADAR);
		boolean regWaterBreathing = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.WATER_BREATHING);
		boolean regHaste = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.HASTE);
		boolean regSaturation = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.SATURATION);
		boolean regSpeedy = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.SPEEDY);
		boolean regSoftLanding = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.SOFT_LANDING);
		boolean regLucky = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.LUCKY);
		boolean regResistance = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.RESISTANCE);
		boolean regStrength = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.STRENGTH);
		boolean regAbsorption = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.ABSORPTION);
		boolean regHero = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.HERO);
		boolean regHealthy = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.HEALTHY);
		boolean regDolphin = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.DOLPHIN);
		boolean regJump = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.JUMP);
		boolean regVulcan = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.VULCAN);
		boolean regProjectile = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.PROJECTILE);
		boolean regPowered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.POWERED);
		boolean regRocket = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.ROCKET);

		if (!regTelepathy)
			registerEnchantment(TELEPATHY);
		if (!regStony)
			registerEnchantment(STONY);
		if (!regFiery)
			registerEnchantment(FIERY);
		if (!regPetrifying)
			registerEnchantment(PETRIFYING);
		if (!regRocky)
			registerEnchantment(ROCKY);
		if (!regPebbly)
			registerEnchantment(PEBBLY);
		if (!regMedusa)
			registerEnchantment(MEDUSA);
		if (!regRadar)
			registerEnchantment(RADAR);
		if (!regWaterBreathing)
			registerEnchantment(WATER_BREATHING);
		if (!regHaste)
			registerEnchantment(HASTE);
		if (!regSaturation)
			registerEnchantment(SATURATION);
		if (!regSpeedy)
			registerEnchantment(SPEEDY);
		if (!regSoftLanding)
			registerEnchantment(SOFT_LANDING);
		if (!regLucky)
			registerEnchantment(LUCKY);
		if (!regResistance)
			registerEnchantment(RESISTANCE);
		if (!regStrength)
			registerEnchantment(STRENGTH);
		if (!regAbsorption)
			registerEnchantment(ABSORPTION);
		if (!regHero)
			registerEnchantment(HERO);
		if (!regHealthy)
			registerEnchantment(HEALTHY);
		if (!regDolphin)
			registerEnchantment(DOLPHIN);
		if (!regJump)
			registerEnchantment(JUMP);
		if (!regVulcan)
			registerEnchantment(VULCAN);
		if (!regProjectile)
			registerEnchantment(PROJECTILE);
		if (!regPowered)
			registerEnchantment(POWERED);
		if (!regRocket)
			registerEnchantment(ROCKET);
	}
	
	public static void registerEnchantment(Enchantment enchantment) {
		boolean registered = true;
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			Enchantment.registerEnchantment(enchantment);
		} catch(Exception e) {
			registered = false;
			e.printStackTrace();
		}
		if (registered) {
			System.out.print("Enchantments registered");
		}
	}
}
