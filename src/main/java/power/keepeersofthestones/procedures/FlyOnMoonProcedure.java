package power.keepeersofthestones.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.BlockPos;

public class FlyOnMoonProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.closeContainer();
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:rocket.fly")),
						SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("power:rocket.fly")), SoundSource.NEUTRAL,
						1, 1, false);
			}
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (entity instanceof ServerPlayer _player && !_player.level.isClientSide()) {
							ResourceKey<Level> destinationType = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation("power:moon"));
							if (_player.level.dimension() == destinationType)
								return;
							ServerLevel nextLevel = _player.server.getLevel(destinationType);
							if (nextLevel != null) {
								_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
								_player.teleportTo(nextLevel, nextLevel.getSharedSpawnPos().getX(), nextLevel.getSharedSpawnPos().getY() + 1,
										nextLevel.getSharedSpawnPos().getZ(), _player.getYRot(), _player.getXRot());
								_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
								for (MobEffectInstance _effectinstance : _player.getActiveEffects())
									_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance));
								_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
							}
						}
						if (entity instanceof LivingEntity _entity)
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 400, 1));
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 20);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 200);
	}
}
