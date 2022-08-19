
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.entity.WhirlpoolEntity;
import power.keepeersofthestones.entity.WaterFlowEntity;
import power.keepeersofthestones.entity.VacuumWebEntity;
import power.keepeersofthestones.entity.VacuumSpiralEntity;
import power.keepeersofthestones.entity.TyrannosaurusRexEntity;
import power.keepeersofthestones.entity.TransformSphereEntity;
import power.keepeersofthestones.entity.ToxicCloudEntity;
import power.keepeersofthestones.entity.TornadoEntityEntity;
import power.keepeersofthestones.entity.TornadoCreateEntity;
import power.keepeersofthestones.entity.TimeDilationEntity;
import power.keepeersofthestones.entity.TigerClawEntity;
import power.keepeersofthestones.entity.ThrowingHammerEntity;
import power.keepeersofthestones.entity.SunExplodeEntity;
import power.keepeersofthestones.entity.SporesEntity;
import power.keepeersofthestones.entity.SpikeEntity;
import power.keepeersofthestones.entity.SmokeScreenEntity;
import power.keepeersofthestones.entity.ShurikenEntity;
import power.keepeersofthestones.entity.ShadowEntity;
import power.keepeersofthestones.entity.ShadowBallEntity;
import power.keepeersofthestones.entity.SandFlurryEntity;
import power.keepeersofthestones.entity.RocketEntity;
import power.keepeersofthestones.entity.RaptorEntity;
import power.keepeersofthestones.entity.RainBowEntity;
import power.keepeersofthestones.entity.PterodactylEntity;
import power.keepeersofthestones.entity.PortalBlastEntity;
import power.keepeersofthestones.entity.PlesiosaurusEntity;
import power.keepeersofthestones.entity.PlasmaBallEntity;
import power.keepeersofthestones.entity.PieceOfEarthEntity;
import power.keepeersofthestones.entity.MusketEntity;
import power.keepeersofthestones.entity.MoonStonesEntity;
import power.keepeersofthestones.entity.MercuryBallEntity;
import power.keepeersofthestones.entity.MegawattEntity;
import power.keepeersofthestones.entity.MassInfectionEntity;
import power.keepeersofthestones.entity.MagicFireballEntity;
import power.keepeersofthestones.entity.LavaBallEntity;
import power.keepeersofthestones.entity.KunaiEntity;
import power.keepeersofthestones.entity.IceSpearEntity;
import power.keepeersofthestones.entity.IceSharpEntity;
import power.keepeersofthestones.entity.IceBallEntity;
import power.keepeersofthestones.entity.GoldenCrossbowEntity;
import power.keepeersofthestones.entity.GlowEntity;
import power.keepeersofthestones.entity.FlashLightEntity;
import power.keepeersofthestones.entity.FirebirdFeatherEntity;
import power.keepeersofthestones.entity.ExplosiveFlowEntity;
import power.keepeersofthestones.entity.EnergySphereEntity;
import power.keepeersofthestones.entity.ElectromagneticPulseEntity;
import power.keepeersofthestones.entity.EctoplasmAttackEntity;
import power.keepeersofthestones.entity.DiscoBallEntity;
import power.keepeersofthestones.entity.DestructionSphereEntity;
import power.keepeersofthestones.entity.ClusterSharpEntity;
import power.keepeersofthestones.entity.BoomerangEntity;
import power.keepeersofthestones.entity.BlueFireballEntity;
import power.keepeersofthestones.entity.BlackHoleEntity;
import power.keepeersofthestones.entity.BlackHeartEntity;
import power.keepeersofthestones.entity.AmberStreaksEntity;
import power.keepeersofthestones.entity.AirFlowEntity;
import power.keepeersofthestones.entity.AcusticalExplodeEntity;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, PowerMod.MODID);
	public static final RegistryObject<EntityType<TornadoEntityEntity>> TORNADO_ENTITY = register("tornado_entity",
			EntityType.Builder.<TornadoEntityEntity>of(TornadoEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TornadoEntityEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<TyrannosaurusRexEntity>> TYRANNOSAURUS_REX = register("tyrannosaurus_rex",
			EntityType.Builder.<TyrannosaurusRexEntity>of(TyrannosaurusRexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TyrannosaurusRexEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<RaptorEntity>> RAPTOR = register("raptor",
			EntityType.Builder.<RaptorEntity>of(RaptorEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RaptorEntity::new)

					.sized(1.2f, 2f));
	public static final RegistryObject<EntityType<PlesiosaurusEntity>> PLESIOSAURUS = register("plesiosaurus",
			EntityType.Builder.<PlesiosaurusEntity>of(PlesiosaurusEntity::new, MobCategory.WATER_CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PlesiosaurusEntity::new)

					.sized(1.5f, 2.5f));
	public static final RegistryObject<EntityType<PterodactylEntity>> PTERODACTYL = register("pterodactyl",
			EntityType.Builder.<PterodactylEntity>of(PterodactylEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PterodactylEntity::new)

					.sized(1.2f, 2f));
	public static final RegistryObject<EntityType<RocketEntity>> ROCKET = register("rocket",
			EntityType.Builder.<RocketEntity>of(RocketEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RocketEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MagicFireballEntity>> MAGIC_FIREBALL = register("projectile_magic_fireball",
			EntityType.Builder.<MagicFireballEntity>of(MagicFireballEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AirFlowEntity>> AIR_FLOW = register("projectile_air_flow",
			EntityType.Builder.<AirFlowEntity>of(AirFlowEntity::new, MobCategory.MISC).setCustomClientFactory(AirFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WaterFlowEntity>> WATER_FLOW = register("projectile_water_flow",
			EntityType.Builder.<WaterFlowEntity>of(WaterFlowEntity::new, MobCategory.MISC).setCustomClientFactory(WaterFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PieceOfEarthEntity>> PIECE_OF_EARTH = register("projectile_piece_of_earth",
			EntityType.Builder.<PieceOfEarthEntity>of(PieceOfEarthEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfEarthEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EnergySphereEntity>> ENERGY_SPHERE = register("projectile_energy_sphere",
			EntityType.Builder.<EnergySphereEntity>of(EnergySphereEntity::new, MobCategory.MISC).setCustomClientFactory(EnergySphereEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceBallEntity>> ICE_BALL = register("projectile_ice_ball",
			EntityType.Builder.<IceBallEntity>of(IceBallEntity::new, MobCategory.MISC).setCustomClientFactory(IceBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceSharpEntity>> ICE_SHARP = register("projectile_ice_sharp",
			EntityType.Builder.<IceSharpEntity>of(IceSharpEntity::new, MobCategory.MISC).setCustomClientFactory(IceSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PlasmaBallEntity>> PLASMA_BALL = register("projectile_plasma_ball",
			EntityType.Builder.<PlasmaBallEntity>of(PlasmaBallEntity::new, MobCategory.MISC).setCustomClientFactory(PlasmaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AcusticalExplodeEntity>> ACUSTICAL_EXPLODE = register("projectile_acustical_explode",
			EntityType.Builder.<AcusticalExplodeEntity>of(AcusticalExplodeEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AcusticalExplodeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ClusterSharpEntity>> CLUSTER_SHARP = register("projectile_cluster_sharp",
			EntityType.Builder.<ClusterSharpEntity>of(ClusterSharpEntity::new, MobCategory.MISC).setCustomClientFactory(ClusterSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LavaBallEntity>> LAVA_BALL = register("projectile_lava_ball",
			EntityType.Builder.<LavaBallEntity>of(LavaBallEntity::new, MobCategory.MISC).setCustomClientFactory(LavaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TornadoCreateEntity>> TORNADO_CREATE = register("projectile_tornado_create",
			EntityType.Builder.<TornadoCreateEntity>of(TornadoCreateEntity::new, MobCategory.MISC).setCustomClientFactory(TornadoCreateEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<WhirlpoolEntity>> WHIRLPOOL = register("projectile_whirlpool",
			EntityType.Builder.<WhirlpoolEntity>of(WhirlpoolEntity::new, MobCategory.MISC).setCustomClientFactory(WhirlpoolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RainBowEntity>> RAIN_BOW = register("projectile_rain_bow",
			EntityType.Builder.<RainBowEntity>of(RainBowEntity::new, MobCategory.MISC).setCustomClientFactory(RainBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SpikeEntity>> SPIKE = register("projectile_spike",
			EntityType.Builder.<SpikeEntity>of(SpikeEntity::new, MobCategory.MISC).setCustomClientFactory(SpikeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TigerClawEntity>> TIGER_CLAW = register("projectile_tiger_claw",
			EntityType.Builder.<TigerClawEntity>of(TigerClawEntity::new, MobCategory.MISC).setCustomClientFactory(TigerClawEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShurikenEntity>> SHURIKEN = register("projectile_shuriken",
			EntityType.Builder.<ShurikenEntity>of(ShurikenEntity::new, MobCategory.MISC).setCustomClientFactory(ShurikenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GlowEntity>> GLOW = register("glow",
			EntityType.Builder.<GlowEntity>of(GlowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GlowEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<FlashLightEntity>> FLASH_LIGHT = register("projectile_flash_light",
			EntityType.Builder.<FlashLightEntity>of(FlashLightEntity::new, MobCategory.MISC).setCustomClientFactory(FlashLightEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShadowEntity>> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShadowEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<ShadowBallEntity>> SHADOW_BALL = register("projectile_shadow_ball",
			EntityType.Builder.<ShadowBallEntity>of(ShadowBallEntity::new, MobCategory.MISC).setCustomClientFactory(ShadowBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VacuumSpiralEntity>> VACUUM_SPIRAL = register("projectile_vacuum_spiral",
			EntityType.Builder.<VacuumSpiralEntity>of(VacuumSpiralEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumSpiralEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<VacuumWebEntity>> VACUUM_WEB = register("projectile_vacuum_web",
			EntityType.Builder.<VacuumWebEntity>of(VacuumWebEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumWebEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SunExplodeEntity>> SUN_EXPLODE = register("projectile_sun_explode",
			EntityType.Builder.<SunExplodeEntity>of(SunExplodeEntity::new, MobCategory.MISC).setCustomClientFactory(SunExplodeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MoonStonesEntity>> MOON_STONES = register("projectile_moon_stones",
			EntityType.Builder.<MoonStonesEntity>of(MoonStonesEntity::new, MobCategory.MISC).setCustomClientFactory(MoonStonesEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackHoleEntity>> BLACK_HOLE = register("projectile_black_hole",
			EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MISC).setCustomClientFactory(BlackHoleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlackHeartEntity>> BLACK_HEART = register("projectile_black_heart",
			EntityType.Builder.<BlackHeartEntity>of(BlackHeartEntity::new, MobCategory.MISC).setCustomClientFactory(BlackHeartEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TimeDilationEntity>> TIME_DILATION = register("projectile_time_dilation",
			EntityType.Builder.<TimeDilationEntity>of(TimeDilationEntity::new, MobCategory.MISC).setCustomClientFactory(TimeDilationEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MegawattEntity>> MEGAWATT = register("projectile_megawatt",
			EntityType.Builder.<MegawattEntity>of(MegawattEntity::new, MobCategory.MISC).setCustomClientFactory(MegawattEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PortalBlastEntity>> PORTAL_BLAST = register("projectile_portal_blast",
			EntityType.Builder.<PortalBlastEntity>of(PortalBlastEntity::new, MobCategory.MISC).setCustomClientFactory(PortalBlastEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplosiveFlowEntity>> EXPLOSIVE_FLOW = register("projectile_explosive_flow",
			EntityType.Builder.<ExplosiveFlowEntity>of(ExplosiveFlowEntity::new, MobCategory.MISC).setCustomClientFactory(ExplosiveFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceSpearEntity>> ICE_SPEAR = register("projectile_ice_spear",
			EntityType.Builder.<IceSpearEntity>of(IceSpearEntity::new, MobCategory.MISC).setCustomClientFactory(IceSpearEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoldenCrossbowEntity>> GOLDEN_CROSSBOW = register("projectile_golden_crossbow",
			EntityType.Builder.<GoldenCrossbowEntity>of(GoldenCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(GoldenCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DestructionSphereEntity>> DESTRUCTION_SPHERE = register("projectile_destruction_sphere",
			EntityType.Builder.<DestructionSphereEntity>of(DestructionSphereEntity::new, MobCategory.MISC)
					.setCustomClientFactory(DestructionSphereEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<AmberStreaksEntity>> AMBER_STREAKS = register("projectile_amber_streaks",
			EntityType.Builder.<AmberStreaksEntity>of(AmberStreaksEntity::new, MobCategory.MISC).setCustomClientFactory(AmberStreaksEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KunaiEntity>> KUNAI = register("projectile_kunai",
			EntityType.Builder.<KunaiEntity>of(KunaiEntity::new, MobCategory.MISC).setCustomClientFactory(KunaiEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SandFlurryEntity>> SAND_FLURRY = register("projectile_sand_flurry",
			EntityType.Builder.<SandFlurryEntity>of(SandFlurryEntity::new, MobCategory.MISC).setCustomClientFactory(SandFlurryEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BoomerangEntity>> BOOMERANG = register("projectile_boomerang",
			EntityType.Builder.<BoomerangEntity>of(BoomerangEntity::new, MobCategory.MISC).setCustomClientFactory(BoomerangEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ToxicCloudEntity>> TOXIC_CLOUD = register("projectile_toxic_cloud",
			EntityType.Builder.<ToxicCloudEntity>of(ToxicCloudEntity::new, MobCategory.MISC).setCustomClientFactory(ToxicCloudEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ElectromagneticPulseEntity>> ELECTROMAGNETIC_PULSE = register("projectile_electromagnetic_pulse",
			EntityType.Builder.<ElectromagneticPulseEntity>of(ElectromagneticPulseEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ElectromagneticPulseEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SporesEntity>> SPORES = register("projectile_spores",
			EntityType.Builder.<SporesEntity>of(SporesEntity::new, MobCategory.MISC).setCustomClientFactory(SporesEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MercuryBallEntity>> MERCURY_BALL = register("projectile_mercury_ball",
			EntityType.Builder.<MercuryBallEntity>of(MercuryBallEntity::new, MobCategory.MISC).setCustomClientFactory(MercuryBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<DiscoBallEntity>> DISCO_BALL = register("projectile_disco_ball",
			EntityType.Builder.<DiscoBallEntity>of(DiscoBallEntity::new, MobCategory.MISC).setCustomClientFactory(DiscoBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MusketEntity>> MUSKET = register("projectile_musket",
			EntityType.Builder.<MusketEntity>of(MusketEntity::new, MobCategory.MISC).setCustomClientFactory(MusketEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MassInfectionEntity>> MASS_INFECTION = register("projectile_mass_infection",
			EntityType.Builder.<MassInfectionEntity>of(MassInfectionEntity::new, MobCategory.MISC).setCustomClientFactory(MassInfectionEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ThrowingHammerEntity>> THROWING_HAMMER = register("projectile_throwing_hammer",
			EntityType.Builder.<ThrowingHammerEntity>of(ThrowingHammerEntity::new, MobCategory.MISC).setCustomClientFactory(ThrowingHammerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BlueFireballEntity>> BLUE_FIREBALL = register("projectile_blue_fireball",
			EntityType.Builder.<BlueFireballEntity>of(BlueFireballEntity::new, MobCategory.MISC).setCustomClientFactory(BlueFireballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EctoplasmAttackEntity>> ECTOPLASM_ATTACK = register("projectile_ectoplasm_attack",
			EntityType.Builder.<EctoplasmAttackEntity>of(EctoplasmAttackEntity::new, MobCategory.MISC)
					.setCustomClientFactory(EctoplasmAttackEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FirebirdFeatherEntity>> FIREBIRD_FEATHER = register("projectile_firebird_feather",
			EntityType.Builder.<FirebirdFeatherEntity>of(FirebirdFeatherEntity::new, MobCategory.MISC)
					.setCustomClientFactory(FirebirdFeatherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SmokeScreenEntity>> SMOKE_SCREEN = register("projectile_smoke_screen",
			EntityType.Builder.<SmokeScreenEntity>of(SmokeScreenEntity::new, MobCategory.MISC).setCustomClientFactory(SmokeScreenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TransformSphereEntity>> TRANSFORM_SPHERE = register("projectile_transform_sphere",
			EntityType.Builder.<TransformSphereEntity>of(TransformSphereEntity::new, MobCategory.MISC)
					.setCustomClientFactory(TransformSphereEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TornadoEntityEntity.init();
			TyrannosaurusRexEntity.init();
			RaptorEntity.init();
			PlesiosaurusEntity.init();
			PterodactylEntity.init();
			RocketEntity.init();
			GlowEntity.init();
			ShadowEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TORNADO_ENTITY.get(), TornadoEntityEntity.createAttributes().build());
		event.put(TYRANNOSAURUS_REX.get(), TyrannosaurusRexEntity.createAttributes().build());
		event.put(RAPTOR.get(), RaptorEntity.createAttributes().build());
		event.put(PLESIOSAURUS.get(), PlesiosaurusEntity.createAttributes().build());
		event.put(PTERODACTYL.get(), PterodactylEntity.createAttributes().build());
		event.put(ROCKET.get(), RocketEntity.createAttributes().build());
		event.put(GLOW.get(), GlowEntity.createAttributes().build());
		event.put(SHADOW.get(), ShadowEntity.createAttributes().build());
	}
}
