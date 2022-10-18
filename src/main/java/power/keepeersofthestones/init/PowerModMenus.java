
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import power.keepeersofthestones.world.inventory.SpaceAtlasGUIMenu;
import power.keepeersofthestones.world.inventory.SoundImitateChoiceMenu;
import power.keepeersofthestones.world.inventory.RocketPathGUIMenu;
import power.keepeersofthestones.world.inventory.RedstoneBundleGUIMenu;
import power.keepeersofthestones.world.inventory.PointGUIMenu;
import power.keepeersofthestones.world.inventory.MusicPlayerGUIMenu;
import power.keepeersofthestones.world.inventory.LevelsAndSkillsPageMenu;
import power.keepeersofthestones.world.inventory.EBWaterMenu;
import power.keepeersofthestones.world.inventory.EBVacuumMenu;
import power.keepeersofthestones.world.inventory.EBTornadoMenu;
import power.keepeersofthestones.world.inventory.EBTimeMenu;
import power.keepeersofthestones.world.inventory.EBTeleportationMenu;
import power.keepeersofthestones.world.inventory.EBTechnologyMenu;
import power.keepeersofthestones.world.inventory.EBSunMenu;
import power.keepeersofthestones.world.inventory.EBSpiritMenu;
import power.keepeersofthestones.world.inventory.EBSpeedMenu;
import power.keepeersofthestones.world.inventory.EBSpaceMenu;
import power.keepeersofthestones.world.inventory.EBSoundMenu;
import power.keepeersofthestones.world.inventory.EBSmokeMenu;
import power.keepeersofthestones.world.inventory.EBShadowMenu;
import power.keepeersofthestones.world.inventory.EBSandMenu;
import power.keepeersofthestones.world.inventory.EBRainMenu;
import power.keepeersofthestones.world.inventory.EBPoisonMenu;
import power.keepeersofthestones.world.inventory.EBPlagueMenu;
import power.keepeersofthestones.world.inventory.EBOceanMenu;
import power.keepeersofthestones.world.inventory.EBMusicMenu;
import power.keepeersofthestones.world.inventory.EBMushroomsMenu;
import power.keepeersofthestones.world.inventory.EBMoonMenu;
import power.keepeersofthestones.world.inventory.EBMistMenu;
import power.keepeersofthestones.world.inventory.EBMindMenu;
import power.keepeersofthestones.world.inventory.EBMetalMenu;
import power.keepeersofthestones.world.inventory.EBMercuryMenu;
import power.keepeersofthestones.world.inventory.EBMagnetMenu;
import power.keepeersofthestones.world.inventory.EBLightningMenu;
import power.keepeersofthestones.world.inventory.EBLightMenu;
import power.keepeersofthestones.world.inventory.EBLavaMenu;
import power.keepeersofthestones.world.inventory.EBIceMenu;
import power.keepeersofthestones.world.inventory.EBGreeneryMenu;
import power.keepeersofthestones.world.inventory.EBGravityMenu;
import power.keepeersofthestones.world.inventory.EBGoldenDustMenu;
import power.keepeersofthestones.world.inventory.EBFormMenu;
import power.keepeersofthestones.world.inventory.EBFireMenu;
import power.keepeersofthestones.world.inventory.EBExplosionMenu;
import power.keepeersofthestones.world.inventory.EBEnergyMenu;
import power.keepeersofthestones.world.inventory.EBEarthMenu;
import power.keepeersofthestones.world.inventory.EBDestructionMenu;
import power.keepeersofthestones.world.inventory.EBCrystalMenu;
import power.keepeersofthestones.world.inventory.EBCreationMenu;
import power.keepeersofthestones.world.inventory.EBBlueFlameMenu;
import power.keepeersofthestones.world.inventory.EBBloodMenu;
import power.keepeersofthestones.world.inventory.EBAnimalsMenu;
import power.keepeersofthestones.world.inventory.EBAmberMenu;
import power.keepeersofthestones.world.inventory.EBAirMenu;
import power.keepeersofthestones.world.inventory.EBAetherMenu;
import power.keepeersofthestones.world.inventory.CustomMusicPlayerMenu;
import power.keepeersofthestones.world.inventory.CultivationGUIMenu;
import power.keepeersofthestones.world.inventory.CompanionsGuiMenu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage3Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage2Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.world.inventory.ChoiseMagicPower3Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicPower2Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicPower1Menu;
import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.world.inventory.CheckPointTPMenu;
import power.keepeersofthestones.world.inventory.BuyLevel3Menu;
import power.keepeersofthestones.world.inventory.BuyLevel2Menu;
import power.keepeersofthestones.world.inventory.BuildingGUIMenu;
import power.keepeersofthestones.world.inventory.BuildInMusicPlayerMenu;
import power.keepeersofthestones.world.inventory.BatteryCreateGUIMenu;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CultivationGUIMenu> CULTIVATION_GUI = register("cultivation_gui",
			(id, inv, extraData) -> new CultivationGUIMenu(id, inv, extraData));
	public static final MenuType<SpawnAnimalsGUIMenu> SPAWN_ANIMALS_GUI = register("spawn_animals_gui",
			(id, inv, extraData) -> new SpawnAnimalsGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStoneGUIMenu> CHOISE_MAGIC_STONE_GUI = register("choise_magic_stone_gui",
			(id, inv, extraData) -> new ChoiseMagicStoneGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage2Menu> CHOISE_MAGIC_STONES_PAGE_2 = register("choise_magic_stones_page_2",
			(id, inv, extraData) -> new ChoiseMagicStonesPage2Menu(id, inv, extraData));
	public static final MenuType<CheckpointGUIMenu> CHECKPOINT_GUI = register("checkpoint_gui",
			(id, inv, extraData) -> new CheckpointGUIMenu(id, inv, extraData));
	public static final MenuType<BatteryCreateGUIMenu> BATTERY_CREATE_GUI = register("battery_create_gui",
			(id, inv, extraData) -> new BatteryCreateGUIMenu(id, inv, extraData));
	public static final MenuType<RedstoneBundleGUIMenu> REDSTONE_BUNDLE_GUI = register("redstone_bundle_gui",
			(id, inv, extraData) -> new RedstoneBundleGUIMenu(id, inv, extraData));
	public static final MenuType<BuildingGUIMenu> BUILDING_GUI = register("building_gui",
			(id, inv, extraData) -> new BuildingGUIMenu(id, inv, extraData));
	public static final MenuType<EBFireMenu> EB_FIRE = register("eb_fire", (id, inv, extraData) -> new EBFireMenu(id, inv, extraData));
	public static final MenuType<EBAirMenu> EB_AIR = register("eb_air", (id, inv, extraData) -> new EBAirMenu(id, inv, extraData));
	public static final MenuType<EBWaterMenu> EB_WATER = register("eb_water", (id, inv, extraData) -> new EBWaterMenu(id, inv, extraData));
	public static final MenuType<EBEarthMenu> EB_EARTH = register("eb_earth", (id, inv, extraData) -> new EBEarthMenu(id, inv, extraData));
	public static final MenuType<EBEnergyMenu> EB_ENERGY = register("eb_energy", (id, inv, extraData) -> new EBEnergyMenu(id, inv, extraData));
	public static final MenuType<EBIceMenu> EB_ICE = register("eb_ice", (id, inv, extraData) -> new EBIceMenu(id, inv, extraData));
	public static final MenuType<EBLightningMenu> EB_LIGHTNING = register("eb_lightning",
			(id, inv, extraData) -> new EBLightningMenu(id, inv, extraData));
	public static final MenuType<EBSoundMenu> EB_SOUND = register("eb_sound", (id, inv, extraData) -> new EBSoundMenu(id, inv, extraData));
	public static final MenuType<EBCrystalMenu> EB_CRYSTAL = register("eb_crystal", (id, inv, extraData) -> new EBCrystalMenu(id, inv, extraData));
	public static final MenuType<EBLavaMenu> EB_LAVA = register("eb_lava", (id, inv, extraData) -> new EBLavaMenu(id, inv, extraData));
	public static final MenuType<EBRainMenu> EB_RAIN = register("eb_rain", (id, inv, extraData) -> new EBRainMenu(id, inv, extraData));
	public static final MenuType<EBTornadoMenu> EB_TORNADO = register("eb_tornado", (id, inv, extraData) -> new EBTornadoMenu(id, inv, extraData));
	public static final MenuType<EBOceanMenu> EB_OCEAN = register("eb_ocean", (id, inv, extraData) -> new EBOceanMenu(id, inv, extraData));
	public static final MenuType<EBGreeneryMenu> EB_GREENERY = register("eb_greenery",
			(id, inv, extraData) -> new EBGreeneryMenu(id, inv, extraData));
	public static final MenuType<EBAnimalsMenu> EB_ANIMALS = register("eb_animals", (id, inv, extraData) -> new EBAnimalsMenu(id, inv, extraData));
	public static final MenuType<EBMetalMenu> EB_METAL = register("eb_metal", (id, inv, extraData) -> new EBMetalMenu(id, inv, extraData));
	public static final MenuType<EBLightMenu> EB_LIGHT = register("eb_light", (id, inv, extraData) -> new EBLightMenu(id, inv, extraData));
	public static final MenuType<EBShadowMenu> EB_SHADOW = register("eb_shadow", (id, inv, extraData) -> new EBShadowMenu(id, inv, extraData));
	public static final MenuType<EBVacuumMenu> EB_VACUUM = register("eb_vacuum", (id, inv, extraData) -> new EBVacuumMenu(id, inv, extraData));
	public static final MenuType<EBSunMenu> EB_SUN = register("eb_sun", (id, inv, extraData) -> new EBSunMenu(id, inv, extraData));
	public static final MenuType<EBMoonMenu> EB_MOON = register("eb_moon", (id, inv, extraData) -> new EBMoonMenu(id, inv, extraData));
	public static final MenuType<EBSpaceMenu> EB_SPACE = register("eb_space", (id, inv, extraData) -> new EBSpaceMenu(id, inv, extraData));
	public static final MenuType<EBTimeMenu> EB_TIME = register("eb_time", (id, inv, extraData) -> new EBTimeMenu(id, inv, extraData));
	public static final MenuType<EBCreationMenu> EB_CREATION = register("eb_creation",
			(id, inv, extraData) -> new EBCreationMenu(id, inv, extraData));
	public static final MenuType<EBDestructionMenu> EB_DESTRUCTION = register("eb_destruction",
			(id, inv, extraData) -> new EBDestructionMenu(id, inv, extraData));
	public static final MenuType<EBBloodMenu> EB_BLOOD = register("eb_blood", (id, inv, extraData) -> new EBBloodMenu(id, inv, extraData));
	public static final MenuType<EBTechnologyMenu> EB_TECHNOLOGY = register("eb_technology",
			(id, inv, extraData) -> new EBTechnologyMenu(id, inv, extraData));
	public static final MenuType<EBTeleportationMenu> EB_TELEPORTATION = register("eb_teleportation",
			(id, inv, extraData) -> new EBTeleportationMenu(id, inv, extraData));
	public static final MenuType<EBExplosionMenu> EB_EXPLOSION = register("eb_explosion",
			(id, inv, extraData) -> new EBExplosionMenu(id, inv, extraData));
	public static final MenuType<EBAmberMenu> EB_AMBER = register("eb_amber", (id, inv, extraData) -> new EBAmberMenu(id, inv, extraData));
	public static final MenuType<PointGUIMenu> POINT_GUI = register("point_gui", (id, inv, extraData) -> new PointGUIMenu(id, inv, extraData));
	public static final MenuType<EBBlueFlameMenu> EB_BLUE_FLAME = register("eb_blue_flame",
			(id, inv, extraData) -> new EBBlueFlameMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage3Menu> CHOISE_MAGIC_STONES_PAGE_3 = register("choise_magic_stones_page_3",
			(id, inv, extraData) -> new ChoiseMagicStonesPage3Menu(id, inv, extraData));
	public static final MenuType<SpaceAtlasGUIMenu> SPACE_ATLAS_GUI = register("space_atlas_gui",
			(id, inv, extraData) -> new SpaceAtlasGUIMenu(id, inv, extraData));
	public static final MenuType<CheckPointTPMenu> CHECK_POINT_TP = register("check_point_tp",
			(id, inv, extraData) -> new CheckPointTPMenu(id, inv, extraData));
	public static final MenuType<LevelsAndSkillsPageMenu> LEVELS_AND_SKILLS_PAGE = register("levels_and_skills_page",
			(id, inv, extraData) -> new LevelsAndSkillsPageMenu(id, inv, extraData));
	public static final MenuType<BuyLevel2Menu> BUY_LEVEL_2 = register("buy_level_2", (id, inv, extraData) -> new BuyLevel2Menu(id, inv, extraData));
	public static final MenuType<BuyLevel3Menu> BUY_LEVEL_3 = register("buy_level_3", (id, inv, extraData) -> new BuyLevel3Menu(id, inv, extraData));
	public static final MenuType<EBMistMenu> EB_MIST = register("eb_mist", (id, inv, extraData) -> new EBMistMenu(id, inv, extraData));
	public static final MenuType<SoundImitateChoiceMenu> SOUND_IMITATE_CHOICE = register("sound_imitate_choice",
			(id, inv, extraData) -> new SoundImitateChoiceMenu(id, inv, extraData));
	public static final MenuType<EBSandMenu> EB_SAND = register("eb_sand", (id, inv, extraData) -> new EBSandMenu(id, inv, extraData));
	public static final MenuType<EBSpeedMenu> EB_SPEED = register("eb_speed", (id, inv, extraData) -> new EBSpeedMenu(id, inv, extraData));
	public static final MenuType<EBPoisonMenu> EB_POISON = register("eb_poison", (id, inv, extraData) -> new EBPoisonMenu(id, inv, extraData));
	public static final MenuType<EBMagnetMenu> EB_MAGNET = register("eb_magnet", (id, inv, extraData) -> new EBMagnetMenu(id, inv, extraData));
	public static final MenuType<EBMushroomsMenu> EB_MUSHROOMS = register("eb_mushrooms",
			(id, inv, extraData) -> new EBMushroomsMenu(id, inv, extraData));
	public static final MenuType<EBMercuryMenu> EB_MERCURY = register("eb_mercury", (id, inv, extraData) -> new EBMercuryMenu(id, inv, extraData));
	public static final MenuType<MusicPlayerGUIMenu> MUSIC_PLAYER_GUI = register("music_player_gui",
			(id, inv, extraData) -> new MusicPlayerGUIMenu(id, inv, extraData));
	public static final MenuType<EBMusicMenu> EB_MUSIC = register("eb_music", (id, inv, extraData) -> new EBMusicMenu(id, inv, extraData));
	public static final MenuType<EBPlagueMenu> EB_PLAGUE = register("eb_plague", (id, inv, extraData) -> new EBPlagueMenu(id, inv, extraData));
	public static final MenuType<RocketPathGUIMenu> ROCKET_PATH_GUI = register("rocket_path_gui",
			(id, inv, extraData) -> new RocketPathGUIMenu(id, inv, extraData));
	public static final MenuType<EBGravityMenu> EB_GRAVITY = register("eb_gravity", (id, inv, extraData) -> new EBGravityMenu(id, inv, extraData));
	public static final MenuType<CustomMusicPlayerMenu> CUSTOM_MUSIC_PLAYER = register("custom_music_player",
			(id, inv, extraData) -> new CustomMusicPlayerMenu(id, inv, extraData));
	public static final MenuType<BuildInMusicPlayerMenu> BUILD_IN_MUSIC_PLAYER = register("build_in_music_player",
			(id, inv, extraData) -> new BuildInMusicPlayerMenu(id, inv, extraData));
	public static final MenuType<EBSmokeMenu> EB_SMOKE = register("eb_smoke", (id, inv, extraData) -> new EBSmokeMenu(id, inv, extraData));
	public static final MenuType<EBSpiritMenu> EB_SPIRIT = register("eb_spirit", (id, inv, extraData) -> new EBSpiritMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicPower1Menu> CHOISE_MAGIC_POWER_1 = register("choise_magic_power_1",
			(id, inv, extraData) -> new ChoiseMagicPower1Menu(id, inv, extraData));
	public static final MenuType<ChoiseMagicPower3Menu> CHOISE_MAGIC_POWER_3 = register("choise_magic_power_3",
			(id, inv, extraData) -> new ChoiseMagicPower3Menu(id, inv, extraData));
	public static final MenuType<ChoiseMagicPower2Menu> CHOISE_MAGIC_POWER_2 = register("choise_magic_power_2",
			(id, inv, extraData) -> new ChoiseMagicPower2Menu(id, inv, extraData));
	public static final MenuType<EBAetherMenu> EB_AETHER = register("eb_aether", (id, inv, extraData) -> new EBAetherMenu(id, inv, extraData));
	public static final MenuType<CompanionsGuiMenu> COMPANIONS_GUI = register("companions_gui",
			(id, inv, extraData) -> new CompanionsGuiMenu(id, inv, extraData));
	public static final MenuType<EBFormMenu> EB_FORM = register("eb_form", (id, inv, extraData) -> new EBFormMenu(id, inv, extraData));
	public static final MenuType<EBMindMenu> EB_MIND = register("eb_mind", (id, inv, extraData) -> new EBMindMenu(id, inv, extraData));
	public static final MenuType<EBGoldenDustMenu> EB_GOLDEN_DUST = register("eb_golden_dust",
			(id, inv, extraData) -> new EBGoldenDustMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
