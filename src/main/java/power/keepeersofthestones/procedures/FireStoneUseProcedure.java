package power.keepeersofthestones.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FireStoneUseProcedure {

	

	public static void executeProcedure(Map<String, Object> dependencies){
			if(dependencies.get("entity") == null) {
				if(!dependencies.containsKey("entity"))
					PowerMod.LOGGER.warn("Failed to load dependency entity for procedure FireStoneUse!");
				return;
			}

				Entity entity = (Entity) dependencies.get("entity");


		if (((entity instanceof LivingEntity)?((LivingEntity)entity).getHeldItemMainhand():ItemStack.EMPTY).getItem() == FireStoneItem.block) {if (!(new Object(){boolean check(Entity _entity){
		if(_entity instanceof LivingEntity){
		Collection<EffectInstance> effects=((LivingEntity)_entity).getActivePotionEffects();
		for(EffectInstance effect:effects){
		if(effect.getPotion()== RechargeFireStonePotionEffect.potion)
		return true;
		}
		}
		return false;
		}}.check(entity))) {if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new PowerModVariables.PlayerVariables())).active) {if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new PowerModVariables.PlayerVariables())).power_level==2) {if(entity instanceof LivingEntity)
	((LivingEntity)entity).addPotionEffect(new EffectInstance(FireMasterPotionEffect.potion,(int) 18000,(int) 0, (false), (false)));}else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
  .orElse(new PowerModVariables.PlayerVariables())).power_level>=3) {if(entity instanceof LivingEntity)
	((LivingEntity)entity).addPotionEffect(new EffectInstance(FireMasterPotionEffect.potion,(int) 24000,(int) 0, (false), (false)));}else{if(entity instanceof LivingEntity)
	((LivingEntity)entity).addPotionEffect(new EffectInstance(FireMasterPotionEffect.potion,(int) 12000,(int) 0, (false), (false)));}}}}
	}

}
