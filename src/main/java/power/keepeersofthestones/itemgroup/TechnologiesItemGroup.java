
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.RocketItemItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class TechnologiesItemGroup extends PowerModElements.ModElement {
	public TechnologiesItemGroup(PowerModElements instance) {
		super(instance, 1041);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtechnologies") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(RocketItemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
