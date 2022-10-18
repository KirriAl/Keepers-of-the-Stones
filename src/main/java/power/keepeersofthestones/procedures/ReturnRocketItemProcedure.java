package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.RocketItemItem;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ReturnRocketItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ReturnRocketItem!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (!((sourceentity instanceof PlayerEntity) ? ((PlayerEntity) sourceentity).abilities.isCreativeMode : false)) {
			if (sourceentity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(RocketItemItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) sourceentity), _setstack);
			}
		}
	}
}
