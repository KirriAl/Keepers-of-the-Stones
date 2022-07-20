
package power.keepeersofthestones.village;

import power.keepeersofthestones.item.ElementalMusicDiscItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ElementalMusicDiscTradeTrade {
	@SubscribeEvent
	public static void registerWanderingTrades(WandererTradesEvent event) {
		event.getGenericTrades()
				.add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (24)), new ItemStack(ElementalMusicDiscItem.block), 1, 5, 0.05f));
	}
}
