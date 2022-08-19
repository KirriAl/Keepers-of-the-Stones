
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.RocketUseProcedure;
import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class RocketItemItem extends Item {
	public RocketItemItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_TECHNOLOGIES).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		RocketUseProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(),
				context.getPlayer());
		return retval;
	}
}
