
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class SandMasterMobEffect extends MobEffect {
	public SandMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13159);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.sand_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
