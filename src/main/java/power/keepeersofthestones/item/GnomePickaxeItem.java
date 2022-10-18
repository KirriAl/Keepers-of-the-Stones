
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@PowerModElements.ModElement.Tag
public class GnomePickaxeItem extends PowerModElements.ModElement {
	@ObjectHolder("power:gnome_pickaxe")
	public static final Item block = null;

	public GnomePickaxeItem(PowerModElements instance) {
		super(instance, 1003);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -2.5f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("gnome_pickaxe"));
	}
}
