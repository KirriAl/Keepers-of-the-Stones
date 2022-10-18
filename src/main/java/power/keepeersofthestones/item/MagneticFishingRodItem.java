
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.MagneticPowerUseProcedure;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.FishingRodItem;
import net.minecraft.entity.player.PlayerEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@PowerModElements.ModElement.Tag
public class MagneticFishingRodItem extends PowerModElements.ModElement {
	@ObjectHolder("power:magnetic_fishing_rod")
	public static final Item block = null;

	public MagneticFishingRodItem(PowerModElements instance) {
		super(instance, 847);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {
			@Override
			public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
				ActionResult<ItemStack> retval = super.onItemRightClick(world, entity, hand);
				ItemStack itemstack = retval.getResult();
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				MagneticPowerUseProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("entity", entity),
								new AbstractMap.SimpleEntry<>("itemstack", itemstack))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("magnetic_fishing_rod"));
	}

	private static class ItemToolCustom extends FishingRodItem {
		protected ItemToolCustom() {
			super(new Item.Properties().group(null).maxDamage(5000).isImmuneToFire());
		}

		@Override
		public int getItemEnchantability() {
			return 2;
		}
	}
}
