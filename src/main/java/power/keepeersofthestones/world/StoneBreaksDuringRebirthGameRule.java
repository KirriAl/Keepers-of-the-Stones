package power.keepeersofthestones.world;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import java.lang.reflect.Method;

@PowerModElements.ModElement.Tag
public class StoneBreaksDuringRebirthGameRule extends PowerModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("stoneBreaksDuringRebirth", GameRules.Category.PLAYER,
			create(false));

	public StoneBreaksDuringRebirthGameRule(PowerModElements instance) {
		super(instance, 840);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
