
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.EnergiumIngotItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class EnergiumItemGroup extends PowerModElements.ModElement {
	public EnergiumItemGroup(PowerModElements instance) {
		super(instance, 1040);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabenergium") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EnergiumIngotItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
