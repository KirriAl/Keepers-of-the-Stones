
package power.keepeersofthestones.enchantment;

import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

public class IsolationEnchantment extends Enchantment {
	public IsolationEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return item == PowerModItems.ENERGIUM_PICKAXE.get() || item == PowerModItems.ENERGIUM_AXE.get() || item == PowerModItems.ENERGIUM_SWORD.get()
				|| item == PowerModItems.ENERGIUM_SHOVEL.get() || item == PowerModItems.ENERGIUM_HOE.get();
	}
}
