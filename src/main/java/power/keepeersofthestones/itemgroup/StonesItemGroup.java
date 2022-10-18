
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.GoldenDustStoneItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class StonesItemGroup extends PowerModElements.ModElement {
	public StonesItemGroup(PowerModElements instance) {
		super(instance, 1070);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabstones") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GoldenDustStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
