
package power.keepeersofthestones.enchantment;

import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

public class RevengeEnchantment extends Enchantment {
	public RevengeEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return ench == Enchantments.SHARPNESS || ench == Enchantments.SMITE || ench == Enchantments.BANE_OF_ARTHROPODS
				|| ench == Enchantments.SWEEPING_EDGE || ench == Enchantments.FIRE_ASPECT || ench == Enchantments.KNOCKBACK
				|| ench == Enchantments.MOB_LOOTING || ench == Enchantments.MENDING || ench == Enchantments.UNBREAKING
				|| ench == Enchantments.VANISHING_CURSE;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return item == PowerModItems.ENERGIUM_SWORD.get() || item == PowerModItems.ENERGIUM_PICKAXE.get() || item == PowerModItems.ENERGIUM_AXE.get()
				|| item == PowerModItems.ENERGIUM_SHOVEL.get() || item == PowerModItems.ENERGIUM_HOE.get();
	}
}
