package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModEnchantments;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class EnchantProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(PowerModEnchantments.REVENGE.get(), itemstack) == 1) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.POWER_LOCK.get(), 40, 0));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(PowerModEnchantments.REVENGE.get(), itemstack) == 2) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.POWER_LOCK.get(), 100, 0));
		} else if (EnchantmentHelper.getItemEnchantmentLevel(PowerModEnchantments.REVENGE.get(), itemstack) == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.POWER_LOCK.get(), 200, 0));
		}
	}
}
