
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EnergiumIngotItem extends Item {
	public EnergiumIngotItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_TECHNOLOGIES_AND_ARTIFACTS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}
}
