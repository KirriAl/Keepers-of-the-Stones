
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MagnetMasterMobEffect extends MobEffect {
	public MagnetMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65383);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.magnet_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
