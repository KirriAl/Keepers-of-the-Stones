
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class EyeFireSalamanderItem extends Item {
	public EyeFireSalamanderItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ARTIFACTS).stacksTo(1).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
