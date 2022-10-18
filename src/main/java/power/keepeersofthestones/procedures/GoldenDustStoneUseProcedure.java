package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeGoldenDustStonePotionEffect;
import power.keepeersofthestones.potion.GoldenDustMasterPotionEffect;
import power.keepeersofthestones.item.GoldenDustStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class GoldenDustStoneUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure GoldenDustStoneUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == GoldenDustStoneItem.block) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getTotalArmorValue() : 0) == 0 && entity instanceof PlayerEntity) {
				if (!(new Object() {
					boolean check(Entity _entity) {
						if (_entity instanceof LivingEntity) {
							Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
							for (EffectInstance effect : effects) {
								if (effect.getPotion() == RechargeGoldenDustStonePotionEffect.potion)
									return true;
							}
						}
						return false;
					}
				}.check(entity))) {
					if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).active) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(
									new EffectInstance(GoldenDustMasterPotionEffect.potion, (int) 100000, (int) 0, (false), (false)));
					}
				}
			}
		}
	}
}
