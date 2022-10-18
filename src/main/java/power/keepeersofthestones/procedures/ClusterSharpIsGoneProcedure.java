package power.keepeersofthestones.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ClusterSharpIsGoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		class ClusterSharpIsGoneWait1 {
			private int ticks = 0;
			private float waitTicks;
			private LevelAccessor world;

			public void start(LevelAccessor world, int waitTicks) {
				this.waitTicks = waitTicks;
				this.world = world;
				MinecraftForge.EVENT_BUS.register(ClusterSharpIsGoneWait1.this);
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					ClusterSharpIsGoneWait1.this.ticks += 1;
					if (ClusterSharpIsGoneWait1.this.ticks >= ClusterSharpIsGoneWait1.this.waitTicks)
						run();
				}
			}

			private void run() {
				MinecraftForge.EVENT_BUS.unregister(ClusterSharpIsGoneWait1.this);
				world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		new ClusterSharpIsGoneWait1().start(world, 400);
	}
}
