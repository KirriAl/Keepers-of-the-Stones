
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerModTabs {
	public static CreativeModeTab TAB_BASIC_GROUP;
	public static CreativeModeTab TAB_ADDITIONAL_GROUP;
	public static CreativeModeTab TAB_MIDDLE_GROUP;
	public static CreativeModeTab TAB_GREAT_GROUP;
	public static CreativeModeTab TAB_BATTERIES;
	public static CreativeModeTab TAB_ENERGIUM;
	public static CreativeModeTab TAB_DIMENSIONS;
	public static CreativeModeTab TAB_TECHNOLOGIES;
	public static CreativeModeTab TAB_ARTIFACTS;

	public static void load() {
		TAB_BASIC_GROUP = new CreativeModeTab("tabbasic_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.FIRE_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ADDITIONAL_GROUP = new CreativeModeTab("tabadditional_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.ICE_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MIDDLE_GROUP = new CreativeModeTab("tabmiddle_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.GREENERY_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_GREAT_GROUP = new CreativeModeTab("tabgreat_group") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.SPACE_STONE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BATTERIES = new CreativeModeTab("tabbatteries") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.EMPTY_BATTERY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ENERGIUM = new CreativeModeTab("tabenergium") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.ENERGIUM_INGOT.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_DIMENSIONS = new CreativeModeTab("tabdimensions") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.DINOERA.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TECHNOLOGIES = new CreativeModeTab("tabtechnologies") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.ROCKET_ITEM.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ARTIFACTS = new CreativeModeTab("tabartifacts") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.BOOK_OF_ELEMENTS.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
