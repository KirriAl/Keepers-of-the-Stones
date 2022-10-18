
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeBoilingStoneMobEffect extends MobEffect {
	public RechargeBoilingStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26215);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_boiling_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
