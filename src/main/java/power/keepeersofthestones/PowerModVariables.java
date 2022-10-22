package power.keepeersofthestones;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class PowerModVariables {
	public PowerModVariables(PowerModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
		public static final String DATA_NAME = "power_worldvars";

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "power_mapvars";
		public boolean fire_stone = false;
		public boolean air_stone = false;
		public boolean water_stone = false;
		public boolean earth_stone = false;
		public boolean energy_stone = false;
		public boolean ice_stone = false;
		public boolean lightning_stone = false;
		public boolean sound_stone = false;
		public boolean crystal_stone = false;
		public boolean lava_stone = false;
		public boolean rain_stone = false;
		public boolean tornado_stone = false;
		public boolean ocean_stone = false;
		public boolean greenery_stone = false;
		public boolean animals_stone = false;
		public boolean metal_stone = false;
		public boolean light_stone = false;
		public boolean shadow_stone = false;
		public boolean vacuum_stone = false;
		public boolean sun_stone = false;
		public boolean moon_stone = false;
		public boolean creation_stone = false;
		public boolean destruction_stone = false;
		public boolean space_stone = false;
		public boolean blood_stone = false;
		public boolean technology_stone = false;
		public boolean time_stone = false;
		public boolean teleportation_stone = false;
		public boolean blue_portal = false;
		public boolean orange_portal = false;
		public double bposx = 0;
		public double bposy = 0;
		public double bposz = 0;
		public double oposx = 0;
		public double oposy = 0.0;
		public double oposz = 0;
		public boolean explosion_stone = false;
		public boolean amber_stone = false;
		public boolean cosmos_stone = false;
		public boolean magnet_stone = false;
		public boolean mist_stone = false;
		public boolean sand_stone = false;
		public boolean speed_stone = false;
		public boolean poison_stone = false;
		public boolean mushrooms_stone = false;
		public boolean mercury_stone = false;
		public boolean music_stone = false;
		public boolean plague_stone = false;
		public boolean gravity_stone = false;
		public boolean blue_flame_stone = false;
		public boolean spirit_stone = false;
		public boolean aether_stone = false;
		public boolean smoke_stone = false;
		public boolean form_stone = false;
		public boolean mind_stone = false;
		public boolean golden_dust_stone = false;

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			fire_stone = nbt.getBoolean("fire_stone");
			air_stone = nbt.getBoolean("air_stone");
			water_stone = nbt.getBoolean("water_stone");
			earth_stone = nbt.getBoolean("earth_stone");
			energy_stone = nbt.getBoolean("energy_stone");
			ice_stone = nbt.getBoolean("ice_stone");
			lightning_stone = nbt.getBoolean("lightning_stone");
			sound_stone = nbt.getBoolean("sound_stone");
			crystal_stone = nbt.getBoolean("crystal_stone");
			lava_stone = nbt.getBoolean("lava_stone");
			rain_stone = nbt.getBoolean("rain_stone");
			tornado_stone = nbt.getBoolean("tornado_stone");
			ocean_stone = nbt.getBoolean("ocean_stone");
			greenery_stone = nbt.getBoolean("greenery_stone");
			animals_stone = nbt.getBoolean("animals_stone");
			metal_stone = nbt.getBoolean("metal_stone");
			light_stone = nbt.getBoolean("light_stone");
			shadow_stone = nbt.getBoolean("shadow_stone");
			vacuum_stone = nbt.getBoolean("vacuum_stone");
			sun_stone = nbt.getBoolean("sun_stone");
			moon_stone = nbt.getBoolean("moon_stone");
			creation_stone = nbt.getBoolean("creation_stone");
			destruction_stone = nbt.getBoolean("destruction_stone");
			space_stone = nbt.getBoolean("space_stone");
			blood_stone = nbt.getBoolean("blood_stone");
			technology_stone = nbt.getBoolean("technology_stone");
			time_stone = nbt.getBoolean("time_stone");
			teleportation_stone = nbt.getBoolean("teleportation_stone");
			blue_portal = nbt.getBoolean("blue_portal");
			orange_portal = nbt.getBoolean("orange_portal");
			bposx = nbt.getDouble("bposx");
			bposy = nbt.getDouble("bposy");
			bposz = nbt.getDouble("bposz");
			oposx = nbt.getDouble("oposx");
			oposy = nbt.getDouble("oposy");
			oposz = nbt.getDouble("oposz");
			explosion_stone = nbt.getBoolean("explosion_stone");
			amber_stone = nbt.getBoolean("amber_stone");
			cosmos_stone = nbt.getBoolean("cosmos_stone");
			magnet_stone = nbt.getBoolean("magnet_stone");
			mist_stone = nbt.getBoolean("mist_stone");
			sand_stone = nbt.getBoolean("sand_stone");
			speed_stone = nbt.getBoolean("speed_stone");
			poison_stone = nbt.getBoolean("poison_stone");
			mushrooms_stone = nbt.getBoolean("mushrooms_stone");
			mercury_stone = nbt.getBoolean("mercury_stone");
			music_stone = nbt.getBoolean("music_stone");
			plague_stone = nbt.getBoolean("plague_stone");
			gravity_stone = nbt.getBoolean("gravity_stone");
			blue_flame_stone = nbt.getBoolean("blue_flame_stone");
			spirit_stone = nbt.getBoolean("spirit_stone");
			aether_stone = nbt.getBoolean("aether_stone");
			smoke_stone = nbt.getBoolean("smoke_stone");
			form_stone = nbt.getBoolean("form_stone");
			mind_stone = nbt.getBoolean("mind_stone");
			golden_dust_stone = nbt.getBoolean("golden_dust_stone");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("energy_stone", energy_stone);
			nbt.putBoolean("ice_stone", ice_stone);
			nbt.putBoolean("lightning_stone", lightning_stone);
			nbt.putBoolean("sound_stone", sound_stone);
			nbt.putBoolean("crystal_stone", crystal_stone);
			nbt.putBoolean("lava_stone", lava_stone);
			nbt.putBoolean("rain_stone", rain_stone);
			nbt.putBoolean("tornado_stone", tornado_stone);
			nbt.putBoolean("ocean_stone", ocean_stone);
			nbt.putBoolean("greenery_stone", greenery_stone);
			nbt.putBoolean("animals_stone", animals_stone);
			nbt.putBoolean("metal_stone", metal_stone);
			nbt.putBoolean("light_stone", light_stone);
			nbt.putBoolean("shadow_stone", shadow_stone);
			nbt.putBoolean("vacuum_stone", vacuum_stone);
			nbt.putBoolean("sun_stone", sun_stone);
			nbt.putBoolean("moon_stone", moon_stone);
			nbt.putBoolean("creation_stone", creation_stone);
			nbt.putBoolean("destruction_stone", destruction_stone);
			nbt.putBoolean("space_stone", space_stone);
			nbt.putBoolean("blood_stone", blood_stone);
			nbt.putBoolean("technology_stone", technology_stone);
			nbt.putBoolean("time_stone", time_stone);
			nbt.putBoolean("teleportation_stone", teleportation_stone);
			nbt.putBoolean("blue_portal", blue_portal);
			nbt.putBoolean("orange_portal", orange_portal);
			nbt.putDouble("bposx", bposx);
			nbt.putDouble("bposy", bposy);
			nbt.putDouble("bposz", bposz);
			nbt.putDouble("oposx", oposx);
			nbt.putDouble("oposy", oposy);
			nbt.putDouble("oposz", oposz);
			nbt.putBoolean("explosion_stone", explosion_stone);
			nbt.putBoolean("amber_stone", amber_stone);
			nbt.putBoolean("cosmos_stone", cosmos_stone);
			nbt.putBoolean("magnet_stone", magnet_stone);
			nbt.putBoolean("mist_stone", mist_stone);
			nbt.putBoolean("sand_stone", sand_stone);
			nbt.putBoolean("speed_stone", speed_stone);
			nbt.putBoolean("poison_stone", poison_stone);
			nbt.putBoolean("mushrooms_stone", mushrooms_stone);
			nbt.putBoolean("mercury_stone", mercury_stone);
			nbt.putBoolean("music_stone", music_stone);
			nbt.putBoolean("plague_stone", plague_stone);
			nbt.putBoolean("gravity_stone", gravity_stone);
			nbt.putBoolean("blue_flame_stone", blue_flame_stone);
			nbt.putBoolean("spirit_stone", spirit_stone);
			nbt.putBoolean("aether_stone", aether_stone);
			nbt.putBoolean("smoke_stone", smoke_stone);
			nbt.putBoolean("form_stone", form_stone);
			nbt.putBoolean("mind_stone", mind_stone);
			nbt.putBoolean("golden_dust_stone", golden_dust_stone);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("power", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("fire", instance.fire);
			nbt.putBoolean("air", instance.air);
			nbt.putBoolean("water", instance.water);
			nbt.putBoolean("earth", instance.earth);
			nbt.putBoolean("energy", instance.energy);
			nbt.putBoolean("ice", instance.ice);
			nbt.putBoolean("lightning", instance.lightning);
			nbt.putBoolean("sound", instance.sound);
			nbt.putBoolean("crystal", instance.crystal);
			nbt.putBoolean("lava", instance.lava);
			nbt.putBoolean("rain", instance.rain);
			nbt.putBoolean("tornado", instance.tornado);
			nbt.putBoolean("ocean", instance.ocean);
			nbt.putBoolean("active", instance.active);
			nbt.putBoolean("greenery", instance.greenery);
			nbt.putBoolean("animals", instance.animals);
			nbt.putBoolean("metal", instance.metal);
			nbt.putBoolean("light", instance.light);
			nbt.putBoolean("shadow", instance.shadow);
			nbt.putBoolean("vacuum", instance.vacuum);
			nbt.putBoolean("moon", instance.moon);
			nbt.putBoolean("sun", instance.sun);
			nbt.putBoolean("creation", instance.creation);
			nbt.putBoolean("destruction", instance.destruction);
			nbt.putBoolean("space", instance.space);
			nbt.putBoolean("selected", instance.selected);
			nbt.putBoolean("blood", instance.blood);
			nbt.putBoolean("technology", instance.technology);
			nbt.putBoolean("time", instance.time);
			nbt.putDouble("spawnx", instance.spawnx);
			nbt.putDouble("spawny", instance.spawny);
			nbt.putDouble("spawnz", instance.spawnz);
			nbt.putBoolean("battery", instance.battery);
			nbt.putBoolean("recharge_spell_sun", instance.recharge_spell_sun);
			nbt.putBoolean("recharge_spell_moon", instance.recharge_spell_moon);
			nbt.putBoolean("recharge_spell_blood", instance.recharge_spell_blood);
			nbt.putBoolean("recharge_spell_energy", instance.recharge_spell_energy);
			nbt.putBoolean("teleportation", instance.teleportation);
			nbt.putBoolean("explosion", instance.explosion);
			nbt.putBoolean("amber", instance.amber);
			nbt.putBoolean("fog", instance.fog);
			nbt.putBoolean("magnet", instance.magnet);
			nbt.putBoolean("mist", instance.mist);
			nbt.putDouble("power_level", instance.power_level);
			nbt.putBoolean("recharge_spell_blue_flame", instance.recharge_spell_blue_flame);
			nbt.putBoolean("sand", instance.sand);
			nbt.putBoolean("speed", instance.speed);
			nbt.putBoolean("turbospeed", instance.turbospeed);
			nbt.putDouble("c1x", instance.c1x);
			nbt.putDouble("c1y", instance.c1y);
			nbt.putDouble("c1z", instance.c1z);
			nbt.putDouble("c2x", instance.c2x);
			nbt.putDouble("c2y", instance.c2y);
			nbt.putDouble("c2z", instance.c2z);
			nbt.putDouble("c3x", instance.c3x);
			nbt.putDouble("c3y", instance.c3y);
			nbt.putDouble("c3z", instance.c3z);
			nbt.putBoolean("poison", instance.poison);
			nbt.putBoolean("mushrooms", instance.mushrooms);
			nbt.putBoolean("mercury", instance.mercury);
			nbt.putBoolean("music", instance.music);
			nbt.putBoolean("keeper", instance.keeper);
			nbt.putBoolean("plague", instance.plague);
			nbt.putBoolean("recharge_spell_plague", instance.recharge_spell_plague);
			nbt.putBoolean("gravity", instance.gravity);
			nbt.putBoolean("without_stone", instance.without_stone);
			nbt.putBoolean("blue_flame", instance.blue_flame);
			nbt.putBoolean("recharge_spell_gravity_boost", instance.recharge_spell_gravity_boost);
			nbt.putBoolean("recharge_spell_gravity_red", instance.recharge_spell_gravity_red);
			nbt.putBoolean("spirit", instance.spirit);
			nbt.putBoolean("aether", instance.aether);
			nbt.putBoolean("recharge_spell_time", instance.recharge_spell_time);
			nbt.putBoolean("smoke", instance.smoke);
			nbt.putBoolean("form", instance.form);
			nbt.putBoolean("mind", instance.mind);
			nbt.putBoolean("golden_dust", instance.golden_dust);
			nbt.putBoolean("ally", instance.ally);
			nbt.putBoolean("little", instance.little);
			nbt.putBoolean("big", instance.big);
			nbt.putBoolean("cursed_amethyst", instance.cursed_amethyst);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.fire = nbt.getBoolean("fire");
			instance.air = nbt.getBoolean("air");
			instance.water = nbt.getBoolean("water");
			instance.earth = nbt.getBoolean("earth");
			instance.energy = nbt.getBoolean("energy");
			instance.ice = nbt.getBoolean("ice");
			instance.lightning = nbt.getBoolean("lightning");
			instance.sound = nbt.getBoolean("sound");
			instance.crystal = nbt.getBoolean("crystal");
			instance.lava = nbt.getBoolean("lava");
			instance.rain = nbt.getBoolean("rain");
			instance.tornado = nbt.getBoolean("tornado");
			instance.ocean = nbt.getBoolean("ocean");
			instance.active = nbt.getBoolean("active");
			instance.greenery = nbt.getBoolean("greenery");
			instance.animals = nbt.getBoolean("animals");
			instance.metal = nbt.getBoolean("metal");
			instance.light = nbt.getBoolean("light");
			instance.shadow = nbt.getBoolean("shadow");
			instance.vacuum = nbt.getBoolean("vacuum");
			instance.moon = nbt.getBoolean("moon");
			instance.sun = nbt.getBoolean("sun");
			instance.creation = nbt.getBoolean("creation");
			instance.destruction = nbt.getBoolean("destruction");
			instance.space = nbt.getBoolean("space");
			instance.selected = nbt.getBoolean("selected");
			instance.blood = nbt.getBoolean("blood");
			instance.technology = nbt.getBoolean("technology");
			instance.time = nbt.getBoolean("time");
			instance.spawnx = nbt.getDouble("spawnx");
			instance.spawny = nbt.getDouble("spawny");
			instance.spawnz = nbt.getDouble("spawnz");
			instance.battery = nbt.getBoolean("battery");
			instance.recharge_spell_sun = nbt.getBoolean("recharge_spell_sun");
			instance.recharge_spell_moon = nbt.getBoolean("recharge_spell_moon");
			instance.recharge_spell_blood = nbt.getBoolean("recharge_spell_blood");
			instance.recharge_spell_energy = nbt.getBoolean("recharge_spell_energy");
			instance.teleportation = nbt.getBoolean("teleportation");
			instance.explosion = nbt.getBoolean("explosion");
			instance.amber = nbt.getBoolean("amber");
			instance.fog = nbt.getBoolean("fog");
			instance.magnet = nbt.getBoolean("magnet");
			instance.mist = nbt.getBoolean("mist");
			instance.power_level = nbt.getDouble("power_level");
			instance.recharge_spell_blue_flame = nbt.getBoolean("recharge_spell_blue_flame");
			instance.sand = nbt.getBoolean("sand");
			instance.speed = nbt.getBoolean("speed");
			instance.turbospeed = nbt.getBoolean("turbospeed");
			instance.c1x = nbt.getDouble("c1x");
			instance.c1y = nbt.getDouble("c1y");
			instance.c1z = nbt.getDouble("c1z");
			instance.c2x = nbt.getDouble("c2x");
			instance.c2y = nbt.getDouble("c2y");
			instance.c2z = nbt.getDouble("c2z");
			instance.c3x = nbt.getDouble("c3x");
			instance.c3y = nbt.getDouble("c3y");
			instance.c3z = nbt.getDouble("c3z");
			instance.poison = nbt.getBoolean("poison");
			instance.mushrooms = nbt.getBoolean("mushrooms");
			instance.mercury = nbt.getBoolean("mercury");
			instance.music = nbt.getBoolean("music");
			instance.keeper = nbt.getBoolean("keeper");
			instance.plague = nbt.getBoolean("plague");
			instance.recharge_spell_plague = nbt.getBoolean("recharge_spell_plague");
			instance.gravity = nbt.getBoolean("gravity");
			instance.without_stone = nbt.getBoolean("without_stone");
			instance.blue_flame = nbt.getBoolean("blue_flame");
			instance.recharge_spell_gravity_boost = nbt.getBoolean("recharge_spell_gravity_boost");
			instance.recharge_spell_gravity_red = nbt.getBoolean("recharge_spell_gravity_red");
			instance.spirit = nbt.getBoolean("spirit");
			instance.aether = nbt.getBoolean("aether");
			instance.recharge_spell_time = nbt.getBoolean("recharge_spell_time");
			instance.smoke = nbt.getBoolean("smoke");
			instance.form = nbt.getBoolean("form");
			instance.mind = nbt.getBoolean("mind");
			instance.golden_dust = nbt.getBoolean("golden_dust");
			instance.ally = nbt.getBoolean("ally");
			instance.little = nbt.getBoolean("little");
			instance.big = nbt.getBoolean("big");
			instance.cursed_amethyst = nbt.getBoolean("cursed_amethyst");
		}
	}

	public static class PlayerVariables {
		public boolean fire = false;
		public boolean air = false;
		public boolean water = false;
		public boolean earth = false;
		public boolean energy = false;
		public boolean ice = false;
		public boolean lightning = false;
		public boolean sound = false;
		public boolean crystal = false;
		public boolean lava = false;
		public boolean rain = false;
		public boolean tornado = false;
		public boolean ocean = false;
		public boolean active = false;
		public boolean greenery = false;
		public boolean animals = false;
		public boolean metal = false;
		public boolean light = false;
		public boolean shadow = false;
		public boolean vacuum = false;
		public boolean moon = false;
		public boolean sun = false;
		public boolean creation = false;
		public boolean destruction = false;
		public boolean space = false;
		public boolean selected = false;
		public boolean blood = false;
		public boolean technology = false;
		public boolean time = false;
		public double spawnx = 0.0;
		public double spawny = 80.0;
		public double spawnz = 0.0;
		public boolean battery = false;
		public boolean recharge_spell_sun = false;
		public boolean recharge_spell_moon = false;
		public boolean recharge_spell_blood = false;
		public boolean recharge_spell_energy = false;
		public boolean teleportation = false;
		public boolean explosion = false;
		public boolean amber = false;
		public boolean fog = false;
		public boolean magnet = false;
		public boolean mist = false;
		public double power_level = 1.0;
		public boolean recharge_spell_blue_flame = false;
		public boolean sand = false;
		public boolean speed = false;
		public boolean turbospeed = false;
		public double c1x = 0;
		public double c1y = 80.0;
		public double c1z = 0;
		public double c2x = 0;
		public double c2y = 80.0;
		public double c2z = 0.0;
		public double c3x = 0;
		public double c3y = 80.0;
		public double c3z = 0;
		public boolean poison = false;
		public boolean mushrooms = false;
		public boolean mercury = false;
		public boolean music = false;
		public boolean keeper = false;
		public boolean plague = false;
		public boolean recharge_spell_plague = false;
		public boolean gravity = false;
		public boolean without_stone = false;
		public boolean blue_flame = false;
		public boolean recharge_spell_gravity_boost = false;
		public boolean recharge_spell_gravity_red = false;
		public boolean spirit = false;
		public boolean aether = false;
		public boolean recharge_spell_time = false;
		public boolean smoke = false;
		public boolean form = false;
		public boolean mind = false;
		public boolean golden_dust = false;
		public boolean ally = false;
		public boolean little = false;
		public boolean big = false;
		public boolean cursed_amethyst = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity), new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
		clone.fire = original.fire;
		clone.air = original.air;
		clone.water = original.water;
		clone.earth = original.earth;
		clone.energy = original.energy;
		clone.ice = original.ice;
		clone.lightning = original.lightning;
		clone.sound = original.sound;
		clone.crystal = original.crystal;
		clone.lava = original.lava;
		clone.rain = original.rain;
		clone.tornado = original.tornado;
		clone.ocean = original.ocean;
		clone.greenery = original.greenery;
		clone.animals = original.animals;
		clone.metal = original.metal;
		clone.light = original.light;
		clone.shadow = original.shadow;
		clone.vacuum = original.vacuum;
		clone.moon = original.moon;
		clone.sun = original.sun;
		clone.creation = original.creation;
		clone.destruction = original.destruction;
		clone.space = original.space;
		clone.selected = original.selected;
		clone.blood = original.blood;
		clone.technology = original.technology;
		clone.time = original.time;
		clone.spawnx = original.spawnx;
		clone.spawny = original.spawny;
		clone.spawnz = original.spawnz;
		clone.battery = original.battery;
		clone.teleportation = original.teleportation;
		clone.explosion = original.explosion;
		clone.amber = original.amber;
		clone.magnet = original.magnet;
		clone.mist = original.mist;
		clone.power_level = original.power_level;
		clone.sand = original.sand;
		clone.speed = original.speed;
		clone.c1x = original.c1x;
		clone.c1y = original.c1y;
		clone.c1z = original.c1z;
		clone.c2x = original.c2x;
		clone.c2y = original.c2y;
		clone.c2z = original.c2z;
		clone.c3x = original.c3x;
		clone.c3y = original.c3y;
		clone.c3z = original.c3z;
		clone.poison = original.poison;
		clone.mushrooms = original.mushrooms;
		clone.mercury = original.mercury;
		clone.music = original.music;
		clone.keeper = original.keeper;
		clone.plague = original.plague;
		clone.gravity = original.gravity;
		clone.without_stone = original.without_stone;
		clone.blue_flame = original.blue_flame;
		clone.spirit = original.spirit;
		clone.aether = original.aether;
		clone.smoke = original.smoke;
		clone.form = original.form;
		clone.mind = original.mind;
		clone.golden_dust = original.golden_dust;
		clone.cursed_amethyst = original.cursed_amethyst;
		if (!event.isWasDeath()) {
			clone.active = original.active;
			clone.recharge_spell_sun = original.recharge_spell_sun;
			clone.recharge_spell_moon = original.recharge_spell_moon;
			clone.recharge_spell_blood = original.recharge_spell_blood;
			clone.recharge_spell_energy = original.recharge_spell_energy;
			clone.fog = original.fog;
			clone.recharge_spell_blue_flame = original.recharge_spell_blue_flame;
			clone.turbospeed = original.turbospeed;
			clone.recharge_spell_plague = original.recharge_spell_plague;
			clone.recharge_spell_gravity_boost = original.recharge_spell_gravity_boost;
			clone.recharge_spell_gravity_red = original.recharge_spell_gravity_red;
			clone.recharge_spell_time = original.recharge_spell_time;
			clone.ally = original.ally;
			clone.little = original.little;
			clone.big = original.big;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.fire = message.data.fire;
					variables.air = message.data.air;
					variables.water = message.data.water;
					variables.earth = message.data.earth;
					variables.energy = message.data.energy;
					variables.ice = message.data.ice;
					variables.lightning = message.data.lightning;
					variables.sound = message.data.sound;
					variables.crystal = message.data.crystal;
					variables.lava = message.data.lava;
					variables.rain = message.data.rain;
					variables.tornado = message.data.tornado;
					variables.ocean = message.data.ocean;
					variables.active = message.data.active;
					variables.greenery = message.data.greenery;
					variables.animals = message.data.animals;
					variables.metal = message.data.metal;
					variables.light = message.data.light;
					variables.shadow = message.data.shadow;
					variables.vacuum = message.data.vacuum;
					variables.moon = message.data.moon;
					variables.sun = message.data.sun;
					variables.creation = message.data.creation;
					variables.destruction = message.data.destruction;
					variables.space = message.data.space;
					variables.selected = message.data.selected;
					variables.blood = message.data.blood;
					variables.technology = message.data.technology;
					variables.time = message.data.time;
					variables.spawnx = message.data.spawnx;
					variables.spawny = message.data.spawny;
					variables.spawnz = message.data.spawnz;
					variables.battery = message.data.battery;
					variables.recharge_spell_sun = message.data.recharge_spell_sun;
					variables.recharge_spell_moon = message.data.recharge_spell_moon;
					variables.recharge_spell_blood = message.data.recharge_spell_blood;
					variables.recharge_spell_energy = message.data.recharge_spell_energy;
					variables.teleportation = message.data.teleportation;
					variables.explosion = message.data.explosion;
					variables.amber = message.data.amber;
					variables.fog = message.data.fog;
					variables.magnet = message.data.magnet;
					variables.mist = message.data.mist;
					variables.power_level = message.data.power_level;
					variables.recharge_spell_blue_flame = message.data.recharge_spell_blue_flame;
					variables.sand = message.data.sand;
					variables.speed = message.data.speed;
					variables.turbospeed = message.data.turbospeed;
					variables.c1x = message.data.c1x;
					variables.c1y = message.data.c1y;
					variables.c1z = message.data.c1z;
					variables.c2x = message.data.c2x;
					variables.c2y = message.data.c2y;
					variables.c2z = message.data.c2z;
					variables.c3x = message.data.c3x;
					variables.c3y = message.data.c3y;
					variables.c3z = message.data.c3z;
					variables.poison = message.data.poison;
					variables.mushrooms = message.data.mushrooms;
					variables.mercury = message.data.mercury;
					variables.music = message.data.music;
					variables.keeper = message.data.keeper;
					variables.plague = message.data.plague;
					variables.recharge_spell_plague = message.data.recharge_spell_plague;
					variables.gravity = message.data.gravity;
					variables.without_stone = message.data.without_stone;
					variables.blue_flame = message.data.blue_flame;
					variables.recharge_spell_gravity_boost = message.data.recharge_spell_gravity_boost;
					variables.recharge_spell_gravity_red = message.data.recharge_spell_gravity_red;
					variables.spirit = message.data.spirit;
					variables.aether = message.data.aether;
					variables.recharge_spell_time = message.data.recharge_spell_time;
					variables.smoke = message.data.smoke;
					variables.form = message.data.form;
					variables.mind = message.data.mind;
					variables.golden_dust = message.data.golden_dust;
					variables.ally = message.data.ally;
					variables.little = message.data.little;
					variables.big = message.data.big;
					variables.cursed_amethyst = message.data.cursed_amethyst;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
