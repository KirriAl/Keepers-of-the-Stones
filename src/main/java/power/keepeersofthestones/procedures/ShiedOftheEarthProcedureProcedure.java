package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

public class ShiedOftheEarthProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.SHIELD_OF_EARTH.get()) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
			class WaitHandler7 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(WaitHandler7.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						WaitHandler7.this.ticks += 1;
						if (WaitHandler7.this.ticks >= WaitHandler7.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(WaitHandler7.this);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~ ~-2 ~2 ~4 ~2 stone outline");
				}
			}
			new WaitHandler7().start(world, 3);
			class WaitHandler11 {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					this.world = world;
					MinecraftForge.EVENT_BUS.register(WaitHandler11.this);
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						WaitHandler11.this.ticks += 1;
						if (WaitHandler11.this.ticks >= WaitHandler11.this.waitTicks)
							run();
					}
				}

				private void run() {
					MinecraftForge.EVENT_BUS.unregister(WaitHandler11.this);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
										Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~ ~-2 ~2 ~4 ~2 dirt outline");
					class WaitHandler10 {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
							this.waitTicks = waitTicks;
							this.world = world;
							MinecraftForge.EVENT_BUS.register(WaitHandler10.this);
						}

						@SubscribeEvent
						public void tick(TickEvent.ServerTickEvent event) {
							if (event.phase == TickEvent.Phase.END) {
								WaitHandler10.this.ticks += 1;
								if (WaitHandler10.this.ticks >= WaitHandler10.this.waitTicks)
									run();
							}
						}

						private void run() {
							MinecraftForge.EVENT_BUS.unregister(WaitHandler10.this);
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands()
										.performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
												"fill ~-2 ~ ~-2 ~2 ~4 ~2 air outline");
						}
					}
					new WaitHandler10().start(world, 100);
				}
			}
			new WaitHandler11().start(world, 300);
		}
	}
}
