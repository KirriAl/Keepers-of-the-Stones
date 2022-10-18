package power.keepeersofthestones.procedures;

import power.keepeersofthestones.gui.ChoiseSecretStoneGUIGui;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import io.netty.buffer.Unpooled;

public class OpenSecretStonesProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure OpenSecretStones!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure OpenSecretStones!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure OpenSecretStones!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure OpenSecretStones!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure OpenSecretStones!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (PowerModVariables.MapVariables.get(world).fire_stone) {
			if (PowerModVariables.MapVariables.get(world).air_stone) {
				if (PowerModVariables.MapVariables.get(world).water_stone) {
					if (PowerModVariables.MapVariables.get(world).earth_stone) {
						if (PowerModVariables.MapVariables.get(world).energy_stone) {
							if (PowerModVariables.MapVariables.get(world).ice_stone) {
								if (PowerModVariables.MapVariables.get(world).lightning_stone) {
									if (PowerModVariables.MapVariables.get(world).sound_stone) {
										if (PowerModVariables.MapVariables.get(world).crystal_stone) {
											if (PowerModVariables.MapVariables.get(world).lava_stone) {
												if (PowerModVariables.MapVariables.get(world).rain_stone) {
													if (PowerModVariables.MapVariables.get(world).tornado_stone) {
														if (PowerModVariables.MapVariables.get(world).ocean_stone) {
															if (PowerModVariables.MapVariables.get(world).greenery_stone) {
																if (PowerModVariables.MapVariables.get(world).animals_stone) {
																	if (PowerModVariables.MapVariables.get(world).metal_stone) {
																		if (PowerModVariables.MapVariables.get(world).light_stone) {
																			if (PowerModVariables.MapVariables.get(world).shadow_stone) {
																				if (PowerModVariables.MapVariables.get(world).vacuum_stone) {
																					if (PowerModVariables.MapVariables.get(world).sun_stone) {
																						if (PowerModVariables.MapVariables.get(world).moon_stone) {
																							if (PowerModVariables.MapVariables
																									.get(world).creation_stone) {
																								if (PowerModVariables.MapVariables
																										.get(world).destruction_stone) {
																									if (PowerModVariables.MapVariables
																											.get(world).blood_stone) {
																										if (PowerModVariables.MapVariables
																												.get(world).technology_stone) {
																											if (PowerModVariables.MapVariables
																													.get(world).time_stone) {
																												if (PowerModVariables.MapVariables
																														.get(world).teleportation_stone) {
																													if (PowerModVariables.MapVariables
																															.get(world).explosion_stone) {
																														if (PowerModVariables.MapVariables
																																.get(world).amber_stone) {
																															if (PowerModVariables.MapVariables
																																	.get(world).space_stone) {
																																if (PowerModVariables.MapVariables
																																		.get(world).magnet_stone) {
																																	if (PowerModVariables.MapVariables
																																			.get(world).mist_stone) {
																																		if (PowerModVariables.MapVariables
																																				.get(world).sand_stone) {
																																			if (PowerModVariables.MapVariables
																																					.get(world).speed_stone) {
																																				if (PowerModVariables.MapVariables
																																						.get(world).poison_stone) {
																																					if (PowerModVariables.MapVariables
																																							.get(world).mushrooms_stone) {
																																						if (PowerModVariables.MapVariables
																																								.get(world).mercury_stone) {
																																							if (PowerModVariables.MapVariables
																																									.get(world).music_stone) {
																																								if (PowerModVariables.MapVariables
																																										.get(world).plague_stone) {
																																									if (PowerModVariables.MapVariables
																																											.get(world).gravity_stone) {
																																										if (PowerModVariables.MapVariables
																																												.get(world).blue_flame_stone) {
																																											if (PowerModVariables.MapVariables
																																													.get(world).spirit_stone) {
																																												if (PowerModVariables.MapVariables
																																														.get(world).aether_stone) {
																																													if (PowerModVariables.MapVariables
																																															.get(world).smoke_stone) {
																																														if (PowerModVariables.MapVariables
																																																.get(world).form_stone) {
																																															if (PowerModVariables.MapVariables
																																																	.get(world).mind_stone) {
																																																if (PowerModVariables.MapVariables
																																																		.get(world).golden_dust_stone) {
																																																	{
																																																		Entity _ent = entity;
																																																		if (_ent instanceof ServerPlayerEntity) {
																																																			BlockPos _bpos = new BlockPos(
																																																					x,
																																																					y,
																																																					z);
																																																			NetworkHooks
																																																					.openGui(
																																																							(ServerPlayerEntity) _ent,
																																																							new INamedContainerProvider() {
																																																								@Override
																																																								public ITextComponent getDisplayName() {
																																																									return new StringTextComponent(
																																																											"ChoiseSecretStoneGUI");
																																																								}

																																																								@Override
																																																								public Container createMenu(
																																																										int id,
																																																										PlayerInventory inventory,
																																																										PlayerEntity player) {
																																																									return new ChoiseSecretStoneGUIGui.GuiContainerMod(
																																																											id,
																																																											inventory,
																																																											new PacketBuffer(
																																																													Unpooled.buffer())
																																																													.writeBlockPos(
																																																															_bpos));
																																																								}
																																																							},
																																																							_bpos);
																																																		}
																																																	}
																																																}
																																															}
																																														}
																																													}
																																												}
																																											}
																																										}
																																									}
																																								}
																																							}
																																						}
																																					}
																																				}
																																			}
																																		}
																																	}
																																}
																															}
																														}
																													}
																												}
																											}
																										}
																									}
																								}
																							}
																						}
																					}
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
