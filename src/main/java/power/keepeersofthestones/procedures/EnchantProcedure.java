package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.PowerLockPotionEffect;
import power.keepeersofthestones.enchantment.RevengeEnchantment;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import java.util.Map;

public class EnchantProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure Enchant!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure Enchant!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (EnchantmentHelper.getEnchantmentLevel(RevengeEnchantment.enchantment, itemstack) == 1) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(PowerLockPotionEffect.potion, (int) 40, (int) 0));
		} else if (EnchantmentHelper.getEnchantmentLevel(RevengeEnchantment.enchantment, itemstack) == 2) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(PowerLockPotionEffect.potion, (int) 100, (int) 0));
		} else if (EnchantmentHelper.getEnchantmentLevel(RevengeEnchantment.enchantment, itemstack) == 3) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(PowerLockPotionEffect.potion, (int) 200, (int) 0));
		}
	}
}
