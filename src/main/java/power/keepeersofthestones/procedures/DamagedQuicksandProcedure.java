package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

public class DamagedQuicksandProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure DamagedQuicksand!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).sand) {
			entity.attackEntityFrom(DamageSource.FALLING_BLOCK, (float) 11);
		}
	}
}
