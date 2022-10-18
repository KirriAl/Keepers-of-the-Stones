package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class SunStoneUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.SUN_STONE.get()) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getArmorValue() : 0) == 0 && entity instanceof Player) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).active) {
					if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RECHARGE_SUN_STONE.get()) : false)) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER.get(), 18000, 0, (false), (false)));
						} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER.get(), 24000, 0, (false), (false)));
						} else {
							if (entity instanceof LivingEntity _entity)
								_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER.get(), 12000, 0, (false), (false)));
						}
					}
				}
			}
		}
	}
}
