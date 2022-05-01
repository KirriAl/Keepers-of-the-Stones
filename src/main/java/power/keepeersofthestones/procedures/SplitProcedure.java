package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.Mth;

import java.util.Random;

public class SplitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(new Random(), 1, 10) == 1) {
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(0);
		} else if (Mth.nextInt(new Random(), 1, 10) == 2) {
			entity.setSecondsOnFire(15);
		} else if (Mth.nextInt(new Random(), 1, 10) == 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(3);
		} else if (Mth.nextInt(new Random(), 1, 10) == 4) {
			{
				boolean _setval = true;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.battery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER.get(), 1200, 1, (false), (false)));
		} else if (Mth.nextInt(new Random(), 1, 10) == 5) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.active = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Mth.nextInt(new Random(), 1, 10) == 6) {
			if (entity instanceof Player _player)
				_player.giveExperienceLevels(7);
		} else if (Mth.nextInt(new Random(), 1, 10) == 7) {
			{
				double _setval = 2;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power_level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Mth.nextInt(new Random(), 1, 10) == 8) {
			{
				double _setval = 1;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.power_level = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (Mth.nextInt(new Random(), 1, 10) == 9) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 10, (false), (false)));
		} else if (Mth.nextInt(new Random(), 1, 10) == 10) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.WITHER, 1200, 10, (false), (false)));
		}
	}
}
