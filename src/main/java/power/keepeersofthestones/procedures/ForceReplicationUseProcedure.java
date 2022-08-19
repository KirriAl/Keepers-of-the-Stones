package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class ForceReplicationUseProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!(sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).battery) {
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FIRE_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FIRE_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.AIR_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.AIR_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.AIR_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.WATER_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.WATER_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.WATER_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EARTH_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EARTH_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EARTH_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ENERGY_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ENERGY_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ENERGY_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ICE_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ICE_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ICE_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHTNING_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHTNING_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SOUND_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SOUND_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SOUND_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.CRYSTAL_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.CRYSTAL_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LAVA_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LAVA_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LAVA_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RAIN_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RAIN_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RAIN_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TORNADO_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TORNADO_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TORNADO_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.OCEAN_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.OCEAN_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.OCEAN_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GREENERY_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GREENERY_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GREENERY_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ANIMALS_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.ANIMALS_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ANIMALS_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.METAL_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.METAL_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.METAL_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHT_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.LIGHT_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.LIGHT_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SHADOW_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SHADOW_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SHADOW_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.VACUUM_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.VACUUM_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.VACUUM_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SUN_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SUN_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SUN_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MOON_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MOON_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MOON_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPACE_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPACE_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPACE_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLOOD_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLOOD_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLOOD_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TECHNOLOGY_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TIME_MASTER_EFFECT.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TIME_MASTER_EFFECT.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.TELEPORTATION_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.TELEPORTATION_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EXPLOSION_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.EXPLOSION_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.EXPLOSION_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MIST_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MIST_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MIST_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SAND_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SAND_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SAND_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPEED_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPEED_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPEED_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.POISON_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.POISON_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.POISON_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MAGNET_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MAGNET_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MAGNET_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MUSHROOMS_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MUSHROOMS_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MUSHROOMS_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MERCURY_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MERCURY_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MERCURY_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MUSIC_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.MUSIC_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.MUSIC_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.PLAGUE_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.PLAGUE_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.PLAGUE_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GRAVITY_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.GRAVITY_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GRAVITY_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLUE_FLAME_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.BLUE_FLAME_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLUE_FLAME_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPIRIT_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SPIRIT_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SPIRIT_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SMOKE_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.SMOKE_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.SMOKE_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FORM_MASTER.get()) : false) {
				if (!(sourceentity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.FORM_MASTER.get()) : false)) {
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FORM_MASTER.get(), 6000, 0, (false), (false)));
				}
			}
			if (!(sourceentity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.FORCE_REPLICATION.get()))
					: false)) {
				{
					Entity _ent = sourceentity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"give @s power:force_replication{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
				}
			}
		}
	}
}
