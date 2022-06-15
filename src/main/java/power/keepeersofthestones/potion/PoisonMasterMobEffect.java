
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PoisonMasterMobEffect extends MobEffect {
	public PoisonMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10040320);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.poison_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
