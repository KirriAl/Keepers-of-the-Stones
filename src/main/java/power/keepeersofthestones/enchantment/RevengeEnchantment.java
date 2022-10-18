
package power.keepeersofthestones.enchantment;

import power.keepeersofthestones.item.EnergiumSwordItem;
import power.keepeersofthestones.item.EnergiumShovelItem;
import power.keepeersofthestones.item.EnergiumPickaxeItem;
import power.keepeersofthestones.item.EnergiumHoeItem;
import power.keepeersofthestones.item.EnergiumAxeItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

@PowerModElements.ModElement.Tag
public class RevengeEnchantment extends PowerModElements.ModElement {
	@ObjectHolder("power:revenge")
	public static final Enchantment enchantment = null;

	public RevengeEnchantment(PowerModElements instance) {
		super(instance, 1063);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("revenge"));
	}

	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.UNCOMMON, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == Enchantments.SHARPNESS)
				return true;
			if (ench == Enchantments.SMITE)
				return true;
			if (ench == Enchantments.BANE_OF_ARTHROPODS)
				return true;
			if (ench == Enchantments.SWEEPING)
				return true;
			if (ench == Enchantments.FIRE_ASPECT)
				return true;
			if (ench == Enchantments.KNOCKBACK)
				return true;
			if (ench == Enchantments.LOOTING)
				return true;
			if (ench == Enchantments.MENDING)
				return true;
			if (ench == Enchantments.UNBREAKING)
				return true;
			if (ench == Enchantments.VANISHING_CURSE)
				return true;
			return false;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == EnergiumSwordItem.block)
				return true;
			if (stack.getItem() == EnergiumPickaxeItem.block)
				return true;
			if (stack.getItem() == EnergiumAxeItem.block)
				return true;
			if (stack.getItem() == EnergiumShovelItem.block)
				return true;
			if (stack.getItem() == EnergiumHoeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}
