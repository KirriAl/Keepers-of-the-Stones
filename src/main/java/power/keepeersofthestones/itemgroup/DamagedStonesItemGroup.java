
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.DamagedFireStoneItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class DamagedStonesItemGroup extends PowerModElements.ModElement {
	public DamagedStonesItemGroup(PowerModElements instance) {
		super(instance, 796);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdamaged_stones") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(DamagedFireStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
