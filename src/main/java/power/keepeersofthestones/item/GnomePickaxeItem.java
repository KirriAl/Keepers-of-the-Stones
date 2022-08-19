
package power.keepeersofthestones.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

public class GnomePickaxeItem extends PickaxeItem {
	public GnomePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 5000;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 10f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.5f, new Item.Properties().tab(null).fireResistant());
	}
}
