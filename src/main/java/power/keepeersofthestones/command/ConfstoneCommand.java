
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;
import power.keepeersofthestones.procedures.OpenMusicPlayerGUIProcedure;
import power.keepeersofthestones.procedures.DemoteKeeperProcedure;
import power.keepeersofthestones.procedures.AppointKeeperProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.command.arguments.EntityArgument;
import net.minecraft.command.Commands;
import net.minecraft.command.CommandSource;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class ConfstoneCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("confstone").requires(s -> s.hasPermissionLevel(4))
				.then(Commands.literal("rechoice").executes(arguments -> {
					ServerWorld world = arguments.getSource().getWorld();
					double x = arguments.getSource().getPos().getX();
					double y = arguments.getSource().getPos().getY();
					double z = arguments.getSource().getPos().getZ();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getHorizontalFacing();

					ResetmychoiceProcedureProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				}))
				.then(Commands.literal("level")
						.then(Commands.literal("set").then(
								Commands.argument("name", EntityArgument.player()).then(Commands.argument("level", DoubleArgumentType.doubleArg())))))
				.then(Commands.literal("music_player").executes(arguments -> {
					ServerWorld world = arguments.getSource().getWorld();
					double x = arguments.getSource().getPos().getX();
					double y = arguments.getSource().getPos().getY();
					double z = arguments.getSource().getPos().getZ();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getHorizontalFacing();

					OpenMusicPlayerGUIProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("supreme_master")
						.then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("true").executes(arguments -> {
							ServerWorld world = arguments.getSource().getWorld();
							double x = arguments.getSource().getPos().getX();
							double y = arguments.getSource().getPos().getY();
							double z = arguments.getSource().getPos().getZ();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getHorizontalFacing();

							AppointKeeperProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("arguments", arguments))
									.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
							return 0;
						})).then(Commands.literal("false").executes(arguments -> {
							ServerWorld world = arguments.getSource().getWorld();
							double x = arguments.getSource().getPos().getX();
							double y = arguments.getSource().getPos().getY();
							double z = arguments.getSource().getPos().getZ();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getHorizontalFacing();

							DemoteKeeperProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("arguments", arguments))
									.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
							return 0;
						})))));
	}
}
