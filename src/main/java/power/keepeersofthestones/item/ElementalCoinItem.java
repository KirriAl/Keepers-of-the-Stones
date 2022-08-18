
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ElementalCoinItem extends Item {
	public ElementalCoinItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ARTIFACTS).stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
