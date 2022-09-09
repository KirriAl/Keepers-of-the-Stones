package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class SpaceUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).golden_dust) {
			{
				boolean _setval = true;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.battery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPACE_MASTER.get(), 6000, 1, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).golden_dust) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPACE_MASTER.get(), 6000, 1, (false), (false)));
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PowerModItems.PINCH_OF_GOLDEN_DUST.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
