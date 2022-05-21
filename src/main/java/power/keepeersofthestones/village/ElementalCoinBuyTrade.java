
package power.keepeersofthestones.village;

import power.keepeersofthestones.item.ElementalCoinItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ElementalCoinBuyTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			trades.get(1).add(new BasicTrade(new ItemStack(Items.EMERALD, (int) (32)), new ItemStack(Items.BOOK),
					new ItemStack(ElementalCoinItem.block), 1, 100, 0.55f));
		}
	}
}
