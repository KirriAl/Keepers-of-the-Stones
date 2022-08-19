package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeMistStonePotionEffect;
import power.keepeersofthestones.potion.MistMasterPotionEffect;
import power.keepeersofthestones.item.MistStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class MistStoneUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure MistStoneUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == MistStoneItem.block) {
			if (!(new Object() {
				boolean check(Entity _entity) {
					if (_entity instanceof LivingEntity) {
						Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
						for (EffectInstance effect : effects) {
							if (effect.getPotion() == RechargeMistStonePotionEffect.potion)
								return true;
						}
					}
					return false;
				}
			}.check(entity))) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).active) {
					if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(MistMasterPotionEffect.potion, (int) 18000, (int) 0, (false), (false)));
					} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(MistMasterPotionEffect.potion, (int) 24000, (int) 0, (false), (false)));
					} else {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity)
									.addPotionEffect(new EffectInstance(MistMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
					}
				}
			}
		}
	}
}
