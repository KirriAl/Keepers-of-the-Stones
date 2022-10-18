
package power.keepeersofthestones.item;

import power.keepeersofthestones.itemgroup.ArtifactsItemGroup;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@PowerModElements.ModElement.Tag
public class ElementalCoinItem extends PowerModElements.ModElement {
	@ObjectHolder("power:elemental_coin")
	public static final Item block = null;

	public ElementalCoinItem(PowerModElements instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ArtifactsItemGroup.tab).maxStackSize(16).rarity(Rarity.UNCOMMON));
			setRegistryName("elemental_coin");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
