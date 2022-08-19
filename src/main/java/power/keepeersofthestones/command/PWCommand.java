
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;
import power.keepeersofthestones.procedures.ResetNonSelectProcedure;
import power.keepeersofthestones.procedures.OpenMusicPlayerGUIProcedure;
import power.keepeersofthestones.procedures.LevelSetProcedure;
import power.keepeersofthestones.procedures.DemoteKeeperProcedure;
import power.keepeersofthestones.procedures.AppointKeeperProcedure;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import com.mojang.brigadier.arguments.DoubleArgumentType;

@Mod.EventBusSubscriber
public class PWCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("pw").requires(s -> s.hasPermission(4))
				.then(Commands.literal("stone").then(Commands.literal("rechoice").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					ResetmychoiceProcedureProcedure.execute(world, x, y, z, entity);
					return 0;
				})).then(Commands.literal("choose").then(Commands.argument("name", EntityArgument.player()).executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					ResetNonSelectProcedure.execute(arguments);
					return 0;
				})))).then(Commands.literal("level").then(Commands.literal("set").then(Commands.argument("name", EntityArgument.player())
						.then(Commands.argument("level", DoubleArgumentType.doubleArg()).executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							LevelSetProcedure.execute(arguments, entity);
							return 0;
						})))))
				.then(Commands.literal("music_player").executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();
					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();
					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					Direction direction = entity.getDirection();

					OpenMusicPlayerGUIProcedure.execute(world, x, y, z, entity);
					return 0;
				})).then(Commands.literal("supreme_master")
						.then(Commands.argument("name", EntityArgument.player()).then(Commands.literal("true").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							AppointKeeperProcedure.execute(arguments, entity);
							return 0;
						})).then(Commands.literal("false").executes(arguments -> {
							ServerLevel world = arguments.getSource().getLevel();
							double x = arguments.getSource().getPosition().x();
							double y = arguments.getSource().getPosition().y();
							double z = arguments.getSource().getPosition().z();
							Entity entity = arguments.getSource().getEntity();
							if (entity == null)
								entity = FakePlayerFactory.getMinecraft(world);
							Direction direction = entity.getDirection();

							DemoteKeeperProcedure.execute(arguments, entity);
							return 0;
						})))));
	}
}
