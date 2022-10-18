package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.FlyingPotionEffect;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

public class SpecialAbilityUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure SpecialAbilityUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure SpecialAbilityUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyingPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).blue_flame) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyingPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).rain) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyingPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).lightning) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(FlyingPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
		}
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).teleportation) {
			world.setBlockState(new BlockPos(PowerModVariables.MapVariables.get(world).bposx, PowerModVariables.MapVariables.get(world).bposy,
					PowerModVariables.MapVariables.get(world).bposz), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(PowerModVariables.MapVariables.get(world).oposx, PowerModVariables.MapVariables.get(world).oposy,
					PowerModVariables.MapVariables.get(world).oposz), Blocks.AIR.getDefaultState(), 3);
			PowerModVariables.MapVariables.get(world).blue_portal = (false);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).orange_portal = (false);
			PowerModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
