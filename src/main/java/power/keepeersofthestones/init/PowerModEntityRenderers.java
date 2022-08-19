
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.renderer.TyrannosaurusRexRenderer;
import power.keepeersofthestones.client.renderer.TornadoEntityRenderer;
import power.keepeersofthestones.client.renderer.TornadoCreateRenderer;
import power.keepeersofthestones.client.renderer.ShadowRenderer;
import power.keepeersofthestones.client.renderer.RocketRenderer;
import power.keepeersofthestones.client.renderer.RaptorRenderer;
import power.keepeersofthestones.client.renderer.RainBowRenderer;
import power.keepeersofthestones.client.renderer.PterodactylRenderer;
import power.keepeersofthestones.client.renderer.PlesiosaurusRenderer;
import power.keepeersofthestones.client.renderer.MusketRenderer;
import power.keepeersofthestones.client.renderer.GoldenCrossbowRenderer;
import power.keepeersofthestones.client.renderer.GlowRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerModEntities.TORNADO_ENTITY.get(), TornadoEntityRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TYRANNOSAURUS_REX.get(), TyrannosaurusRexRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAPTOR.get(), RaptorRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLESIOSAURUS.get(), PlesiosaurusRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PTERODACTYL.get(), PterodactylRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ROCKET.get(), RocketRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AIR_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PIECE_OF_EARTH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ENERGY_SPHERE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SHARP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLASMA_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ACUSTICAL_EXPLODE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.CLUSTER_SHARP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LAVA_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TORNADO_CREATE.get(), TornadoCreateRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WHIRLPOOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAIN_BOW.get(), RainBowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPIKE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIGER_CLAW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHURIKEN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GLOW.get(), GlowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FLASH_LIGHT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW.get(), ShadowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_SPIRAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_WEB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SUN_EXPLODE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MOON_STONES.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HOLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HEART.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIME_DILATION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MEGAWATT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PORTAL_BLAST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.EXPLOSIVE_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SPEAR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GOLDEN_CROSSBOW.get(), GoldenCrossbowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DESTRUCTION_SPHERE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AMBER_STREAKS.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.KUNAI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SAND_FLURRY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BOOMERANG.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TOXIC_CLOUD.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ELECTROMAGNETIC_PULSE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPORES.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MERCURY_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.DISCO_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MUSKET.get(), MusketRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MASS_INFECTION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.THROWING_HAMMER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLUE_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ECTOPLASM_ATTACK.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FIREBIRD_FEATHER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SMOKE_SCREEN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TRANSFORM_SPHERE.get(), ThrownItemRenderer::new);
	}
}
