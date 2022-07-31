package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.CommandSource;

import java.util.Map;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class ResetSkillsAndLevelsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("arguments") == null) {
			if (!dependencies.containsKey("arguments"))
				PowerMod.LOGGER.warn("Failed to load dependency arguments for procedure ResetSkillsAndLevels!");
			return;
		}
		CommandContext<CommandSource> arguments = (CommandContext<CommandSource>) dependencies.get("arguments");
		try {
			for (Entity entityiterator : EntityArgument.getEntitiesAllowingNone(arguments, "name")) {
				{
					double _setval = 1;
					entityiterator.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power_level = _setval;
						capability.syncPlayerVariables(entityiterator);
					});
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
