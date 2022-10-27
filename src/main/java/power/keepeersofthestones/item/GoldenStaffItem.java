
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@PowerModElements.ModElement.Tag
public class GoldenStaffItem extends PowerModElements.ModElement {
	@ObjectHolder("power:golden_staff")
	public static final Item block = null;

	public GoldenStaffItem(PowerModElements instance) {
		super(instance, 1110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 17f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.2000000000000002f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("golden_staff"));
	}
}