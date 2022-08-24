
package power.keepeersofthestones.enchantment;

import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

public class RevengeEnchantment extends Enchantment {
	public RevengeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return item == PowerModItems.ENERGIUM_SWORD.get() || item == PowerModItems.ENERGIUM_PICKAXE.get() || item == PowerModItems.ENERGIUM_AXE.get()
				|| item == PowerModItems.ENERGIUM_SHOVEL.get() || item == PowerModItems.ENERGIUM_HOE.get();
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
