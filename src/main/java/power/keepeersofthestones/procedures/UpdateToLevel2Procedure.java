package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public class UpdateToLevel2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.ELEMENTAL_COIN
				.get())) {
			if ((new ItemStack(PowerModItems.ELEMENTAL_COIN.get())).getCount() >= 4) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.ELEMENTAL_COIN.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 4,
							_player.inventoryMenu.getCraftSlots());
				}
				{
					double _setval = 2;
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.power_level = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("power:power_up"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							new TextComponent("\u00A74Make sure that you have coins in your inventory and/or they are not in the lead hand"),
							(false));
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(
						new TextComponent("\u00A74Make sure that you have coins in your inventory and/or they are not in the lead hand"), (false));
		}
	}
}
