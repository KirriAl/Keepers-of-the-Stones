
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.EnergiumBlockProcedure;
import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class RawEnergiumItem extends Item {
	public RawEnergiumItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_TECHNOLOGIES_AND_ARTIFACTS).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnergiumBlockProcedure.execute(entity);
	}
}
