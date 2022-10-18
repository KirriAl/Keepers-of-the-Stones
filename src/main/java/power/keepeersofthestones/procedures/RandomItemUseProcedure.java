package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.RandomItemItem;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.MathHelper;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Blocks;

import java.util.Random;
import java.util.Map;

public class RandomItemUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure RandomItemUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure RandomItemUse!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure RandomItemUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY).getItem() == RandomItemItem.block) {
			if (world.isRemote()) {
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 1200);
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
					if (MathHelper.nextInt(new Random(), 1, 25) == 1) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.BREAD);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 2) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.COOKED_BEEF);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 3) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.CAKE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 4) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.STICK);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 5) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_INGOT);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 6) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.GOLD_INGOT);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 7) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_HOE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 8) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_SHOVEL);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 9) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_AXE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 10) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_SWORD);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 11) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.IRON_PICKAXE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 12) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 13) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.ENDER_PEARL);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 14) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 15) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.BONE_BLOCK);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 16) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.IRON_BLOCK);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 17) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 18) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.NETHERITE_INGOT);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 19) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 20) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.SADDLE);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 21) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.DIAMOND_HORSE_ARMOR);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 22) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.TNT);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 23) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 24) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					} else if (MathHelper.nextInt(new Random(), 1, 25) == 25) {
						if (entity instanceof PlayerEntity) {
							ItemStack _setstack = new ItemStack(Items.NETHER_STAR);
							_setstack.setCount((int) 1);
							ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 3);
		}
	}
}
