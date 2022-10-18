
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@PowerModElements.ModElement.Tag
public class NunchucksItem extends PowerModElements.ModElement {
	@ObjectHolder("power:nunchucks")
	public static final Item block = null;

	public NunchucksItem(PowerModElements instance) {
		super(instance, 1015);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 15.2f;
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
		}, 3, -2.4000000000000001f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("nunchucks"));
	}
}
