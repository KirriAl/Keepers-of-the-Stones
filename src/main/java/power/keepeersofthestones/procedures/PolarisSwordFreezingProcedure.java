package power.keepeersofthestones.procedures;

import net.minecraft.world.entity.Entity;

public class PolarisSwordFreezingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setTicksFrozen((int) 800);
	}
}
