
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;
import power.keepeersofthestones.procedures.ResetSkillsAndLevelsProcedure;
import power.keepeersofthestones.procedures.DetransformKeyPriNazhatiiKlavishiProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.command.Commands;
import net.minecraft.command.CommandSource;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

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
				})).then(Commands.literal("detransform").executes(arguments -> {
					ServerWorld world = arguments.getSource().getWorld();
					double x = arguments.getSource().getPos().getX();
					double y = arguments.getSource().getPos().getY();
					double z = arguments.getSource().getPos().getZ();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getHorizontalFacing();

					DetransformKeyPriNazhatiiKlavishiProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("reset_abilty").executes(arguments -> {
					ServerWorld world = arguments.getSource().getWorld();
					double x = arguments.getSource().getPos().getX();
					double y = arguments.getSource().getPos().getY();
					double z = arguments.getSource().getPos().getZ();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getHorizontalFacing();

					ResetSkillsAndLevelsProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})));
	}
}
