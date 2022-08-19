
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.EnergiumBlockUseProcedure;
import power.keepeersofthestones.init.PowerModTabs;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

public class EnergiumSwordItem extends SwordItem {
	public EnergiumSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 650;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(PowerModItems.ENERGIUM_INGOT.get()));
			}
		}, 3, -2.4000000000000001f, new Item.Properties().tab(PowerModTabs.TAB_ENERGIUM));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		EnergiumBlockUseProcedure.execute(entity);
	}
}
