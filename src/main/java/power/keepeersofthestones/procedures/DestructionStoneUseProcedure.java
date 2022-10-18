package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeDestructionStonePotionEffect;
import power.keepeersofthestones.potion.RechargeCreationStonePotionEffect;
import power.keepeersofthestones.potion.MergeBalancePotionEffect;
import power.keepeersofthestones.potion.DestructionMasterPotionEffect;
import power.keepeersofthestones.potion.CreationMasterPotionEffect;
import power.keepeersofthestones.item.DestructionStoneItem;
import power.keepeersofthestones.item.CreationStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class DestructionStoneUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure DestructionStoneUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == DestructionStoneItem.block) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == RechargeDestructionStonePotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) == 0
							&& entity instanceof PlayerEntity) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(
										new EffectInstance(DestructionMasterPotionEffect.potion, (int) 18000, (int) 0, (false), (false)));
						} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(
										new EffectInstance(DestructionMasterPotionEffect.potion, (int) 24000, (int) 0, (false), (false)));
						} else {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(
										new EffectInstance(DestructionMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
						}
					}
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).active) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).creation) {
					if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).battery) {
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level == 2) {
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
							}
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(RechargeCreationStonePotionEffect.potion);
							}
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(CreationStoneItem.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) entity).container.func_234641_j_());
							}
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(MergeBalancePotionEffect.potion, (int) 18000, (int) 0, (false), (false)));
						} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).power_level >= 3) {
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
							}
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(RechargeCreationStonePotionEffect.potion);
							}
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(CreationStoneItem.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) entity).container.func_234641_j_());
							}
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(MergeBalancePotionEffect.potion, (int) 24000, (int) 0, (false), (false)));
						} else {
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
							}
							if (entity instanceof LivingEntity) {
								((LivingEntity) entity).removePotionEffect(RechargeCreationStonePotionEffect.potion);
							}
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(CreationStoneItem.block);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) entity).container.func_234641_j_());
							}
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(MergeBalancePotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
						}
					}
				}
			}
		}
	}
}
