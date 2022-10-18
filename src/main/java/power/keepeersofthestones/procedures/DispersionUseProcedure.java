package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.SmokeItem;
import power.keepeersofthestones.item.GoldenDustItem;
import power.keepeersofthestones.item.DispersionItem;
import power.keepeersofthestones.item.AmberItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class DispersionUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure DispersionUse!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure DispersionUse!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure DispersionUse!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure DispersionUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure DispersionUse!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure DispersionUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == DispersionItem.block) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).amber) {
				if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).golden_dust) {
					if (world.isRemote()) {
						Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 400);
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 200, (int) 254, (false), (false)));
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SmokeItem.helmet);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SmokeItem.body);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SmokeItem.legs);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(SmokeItem.boots);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
						if (entity instanceof PlayerEntity) {
							((PlayerEntity) entity).abilities.disableDamage = (true);
							((PlayerEntity) entity).sendPlayerAbilities();
						}
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
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
							if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PowerModVariables.PlayerVariables())).smoke) {
								if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
									if (entity instanceof PlayerEntity) {
										((PlayerEntity) entity).abilities.disableDamage = (false);
										((PlayerEntity) entity).sendPlayerAbilities();
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.head with power:smoke_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.chest with power:smoke_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.legs with power:smoke_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.feet with power:smoke_boots{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).golden_dust) {
					if (world.isRemote()) {
						Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
					}
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 400);
					if (world instanceof ServerWorld) {
						((ServerWorld) world).spawnParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, (int) 5, 3, 3, 3, 1);
					}
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 200, (int) 254, (false), (false)));
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(GoldenDustItem.helmet);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(GoldenDustItem.body);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(GoldenDustItem.legs);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(GoldenDustItem.boots);
						((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) entity).container.func_234641_j_());
					}
					if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
						if (entity instanceof PlayerEntity) {
							((PlayerEntity) entity).abilities.disableDamage = (true);
							((PlayerEntity) entity).sendPlayerAbilities();
						}
					}
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private IWorld world;

						public void start(IWorld world, int waitTicks) {
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
							if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PowerModVariables.PlayerVariables())).shadow) {
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.head with power:golden_dust_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.chest with power:golden_dust_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.legs with power:golden_dust_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"item replace entity @s armor.feet with power:golden_dust_boots{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, (int) 200);
				}
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).amber) {
				if (world.isRemote()) {
					Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 400);
				if (world instanceof ServerWorld) {
					((ServerWorld) world).spawnParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, (int) 5, 3, 3, 3, 1);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 200, (int) 254, (false), (false)));
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AmberItem.helmet);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AmberItem.body);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AmberItem.legs);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AmberItem.boots);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
				if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
					if (entity instanceof PlayerEntity) {
						((PlayerEntity) entity).abilities.disableDamage = (true);
						((PlayerEntity) entity).sendPlayerAbilities();
					}
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
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
						if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).shadow) {
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"item replace entity @s armor.head with power:amber_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"item replace entity @s armor.chest with power:amber_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"item replace entity @s armor.legs with power:amber_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"item replace entity @s armor.feet with power:amber_boots{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
								}
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 200);
			}
		}
	}
}
