
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@PowerModElements.ModElement.Tag
public class MusicalAxeItem extends PowerModElements.ModElement {
	@ObjectHolder("power:musical_axe")
	public static final Item block = null;

	public MusicalAxeItem(PowerModElements instance) {
		super(instance, 908);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 14f;
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
		}, 1, -2.2000000000000002f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("musical_axe"));
	}
}
