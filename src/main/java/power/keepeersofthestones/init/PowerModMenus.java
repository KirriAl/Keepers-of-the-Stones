
/*
 *	MCreator note: This file will be REGENERATED on each build.
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
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class PowerModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, PowerMod.MODID);
	public static final RegistryObject<MenuType<CultivationGUIMenu>> CULTIVATION_GUI = REGISTRY.register("cultivation_gui",
			() -> IForgeMenuType.create(CultivationGUIMenu::new));
	public static final RegistryObject<MenuType<SpawnAnimalsGUIMenu>> SPAWN_ANIMALS_GUI = REGISTRY.register("spawn_animals_gui",
			() -> IForgeMenuType.create(SpawnAnimalsGUIMenu::new));
	public static final RegistryObject<MenuType<ChoiseMagicStoneGUIMenu>> CHOISE_MAGIC_STONE_GUI = REGISTRY.register("choise_magic_stone_gui",
			() -> IForgeMenuType.create(ChoiseMagicStoneGUIMenu::new));
	public static final RegistryObject<MenuType<ChoiseMagicStonesPage2Menu>> CHOISE_MAGIC_STONES_PAGE_2 = REGISTRY
			.register("choise_magic_stones_page_2", () -> IForgeMenuType.create(ChoiseMagicStonesPage2Menu::new));
	public static final RegistryObject<MenuType<CheckpointGUIMenu>> CHECKPOINT_GUI = REGISTRY.register("checkpoint_gui",
			() -> IForgeMenuType.create(CheckpointGUIMenu::new));
	public static final RegistryObject<MenuType<BatteryCreateGUIMenu>> BATTERY_CREATE_GUI = REGISTRY.register("battery_create_gui",
			() -> IForgeMenuType.create(BatteryCreateGUIMenu::new));
	public static final RegistryObject<MenuType<RedstoneBundleGUIMenu>> REDSTONE_BUNDLE_GUI = REGISTRY.register("redstone_bundle_gui",
			() -> IForgeMenuType.create(RedstoneBundleGUIMenu::new));
	public static final RegistryObject<MenuType<BuildingGUIMenu>> BUILDING_GUI = REGISTRY.register("building_gui",
			() -> IForgeMenuType.create(BuildingGUIMenu::new));
	public static final RegistryObject<MenuType<EBFireMenu>> EB_FIRE = REGISTRY.register("eb_fire", () -> IForgeMenuType.create(EBFireMenu::new));
	public static final RegistryObject<MenuType<EBAirMenu>> EB_AIR = REGISTRY.register("eb_air", () -> IForgeMenuType.create(EBAirMenu::new));
	public static final RegistryObject<MenuType<EBWaterMenu>> EB_WATER = REGISTRY.register("eb_water", () -> IForgeMenuType.create(EBWaterMenu::new));
	public static final RegistryObject<MenuType<EBEarthMenu>> EB_EARTH = REGISTRY.register("eb_earth", () -> IForgeMenuType.create(EBEarthMenu::new));
	public static final RegistryObject<MenuType<EBEnergyMenu>> EB_ENERGY = REGISTRY.register("eb_energy",
			() -> IForgeMenuType.create(EBEnergyMenu::new));
	public static final RegistryObject<MenuType<EBIceMenu>> EB_ICE = REGISTRY.register("eb_ice", () -> IForgeMenuType.create(EBIceMenu::new));
	public static final RegistryObject<MenuType<EBLightningMenu>> EB_LIGHTNING = REGISTRY.register("eb_lightning",
			() -> IForgeMenuType.create(EBLightningMenu::new));
	public static final RegistryObject<MenuType<EBSoundMenu>> EB_SOUND = REGISTRY.register("eb_sound", () -> IForgeMenuType.create(EBSoundMenu::new));
	public static final RegistryObject<MenuType<EBCrystalMenu>> EB_CRYSTAL = REGISTRY.register("eb_crystal",
			() -> IForgeMenuType.create(EBCrystalMenu::new));
	public static final RegistryObject<MenuType<EBLavaMenu>> EB_LAVA = REGISTRY.register("eb_lava", () -> IForgeMenuType.create(EBLavaMenu::new));
	public static final RegistryObject<MenuType<EBRainMenu>> EB_RAIN = REGISTRY.register("eb_rain", () -> IForgeMenuType.create(EBRainMenu::new));
	public static final RegistryObject<MenuType<EBTornadoMenu>> EB_TORNADO = REGISTRY.register("eb_tornado",
			() -> IForgeMenuType.create(EBTornadoMenu::new));
	public static final RegistryObject<MenuType<EBOceanMenu>> EB_OCEAN = REGISTRY.register("eb_ocean", () -> IForgeMenuType.create(EBOceanMenu::new));
	public static final RegistryObject<MenuType<EBGreeneryMenu>> EB_GREENERY = REGISTRY.register("eb_greenery",
			() -> IForgeMenuType.create(EBGreeneryMenu::new));
	public static final RegistryObject<MenuType<EBAnimalsMenu>> EB_ANIMALS = REGISTRY.register("eb_animals",
			() -> IForgeMenuType.create(EBAnimalsMenu::new));
	public static final RegistryObject<MenuType<EBMetalMenu>> EB_METAL = REGISTRY.register("eb_metal", () -> IForgeMenuType.create(EBMetalMenu::new));
	public static final RegistryObject<MenuType<EBLightMenu>> EB_LIGHT = REGISTRY.register("eb_light", () -> IForgeMenuType.create(EBLightMenu::new));
	public static final RegistryObject<MenuType<EBShadowMenu>> EB_SHADOW = REGISTRY.register("eb_shadow",
			() -> IForgeMenuType.create(EBShadowMenu::new));
	public static final RegistryObject<MenuType<EBVacuumMenu>> EB_VACUUM = REGISTRY.register("eb_vacuum",
			() -> IForgeMenuType.create(EBVacuumMenu::new));
	public static final RegistryObject<MenuType<EBSunMenu>> EB_SUN = REGISTRY.register("eb_sun", () -> IForgeMenuType.create(EBSunMenu::new));
	public static final RegistryObject<MenuType<EBMoonMenu>> EB_MOON = REGISTRY.register("eb_moon", () -> IForgeMenuType.create(EBMoonMenu::new));
	public static final RegistryObject<MenuType<EBSpaceMenu>> EB_SPACE = REGISTRY.register("eb_space", () -> IForgeMenuType.create(EBSpaceMenu::new));
	public static final RegistryObject<MenuType<EBTimeMenu>> EB_TIME = REGISTRY.register("eb_time", () -> IForgeMenuType.create(EBTimeMenu::new));
	public static final RegistryObject<MenuType<EBCreationMenu>> EB_CREATION = REGISTRY.register("eb_creation",
			() -> IForgeMenuType.create(EBCreationMenu::new));
	public static final RegistryObject<MenuType<EBDestructionMenu>> EB_DESTRUCTION = REGISTRY.register("eb_destruction",
			() -> IForgeMenuType.create(EBDestructionMenu::new));
	public static final RegistryObject<MenuType<EBBloodMenu>> EB_BLOOD = REGISTRY.register("eb_blood", () -> IForgeMenuType.create(EBBloodMenu::new));
	public static final RegistryObject<MenuType<EBTechnologyMenu>> EB_TECHNOLOGY = REGISTRY.register("eb_technology",
			() -> IForgeMenuType.create(EBTechnologyMenu::new));
	public static final RegistryObject<MenuType<EBTeleportationMenu>> EB_TELEPORTATION = REGISTRY.register("eb_teleportation",
			() -> IForgeMenuType.create(EBTeleportationMenu::new));
	public static final RegistryObject<MenuType<EBExplosionMenu>> EB_EXPLOSION = REGISTRY.register("eb_explosion",
			() -> IForgeMenuType.create(EBExplosionMenu::new));
	public static final RegistryObject<MenuType<EBAmberMenu>> EB_AMBER = REGISTRY.register("eb_amber", () -> IForgeMenuType.create(EBAmberMenu::new));
	public static final RegistryObject<MenuType<PointGUIMenu>> POINT_GUI = REGISTRY.register("point_gui",
			() -> IForgeMenuType.create(PointGUIMenu::new));
	public static final RegistryObject<MenuType<EBBlueFlameMenu>> EB_BLUE_FLAME = REGISTRY.register("eb_blue_flame",
			() -> IForgeMenuType.create(EBBlueFlameMenu::new));
	public static final RegistryObject<MenuType<ChoiseMagicStonesPage3Menu>> CHOISE_MAGIC_STONES_PAGE_3 = REGISTRY
			.register("choise_magic_stones_page_3", () -> IForgeMenuType.create(ChoiseMagicStonesPage3Menu::new));
	public static final RegistryObject<MenuType<SpaceAtlasGUIMenu>> SPACE_ATLAS_GUI = REGISTRY.register("space_atlas_gui",
			() -> IForgeMenuType.create(SpaceAtlasGUIMenu::new));
	public static final RegistryObject<MenuType<CheckPointTPMenu>> CHECK_POINT_TP = REGISTRY.register("check_point_tp",
			() -> IForgeMenuType.create(CheckPointTPMenu::new));
	public static final RegistryObject<MenuType<LevelsAndSkillsPageMenu>> LEVELS_AND_SKILLS_PAGE = REGISTRY.register("levels_and_skills_page",
			() -> IForgeMenuType.create(LevelsAndSkillsPageMenu::new));
	public static final RegistryObject<MenuType<BuyLevel2Menu>> BUY_LEVEL_2 = REGISTRY.register("buy_level_2",
			() -> IForgeMenuType.create(BuyLevel2Menu::new));
	public static final RegistryObject<MenuType<BuyLevel3Menu>> BUY_LEVEL_3 = REGISTRY.register("buy_level_3",
			() -> IForgeMenuType.create(BuyLevel3Menu::new));
	public static final RegistryObject<MenuType<EBMistMenu>> EB_MIST = REGISTRY.register("eb_mist", () -> IForgeMenuType.create(EBMistMenu::new));
	public static final RegistryObject<MenuType<SoundImitateChoiceMenu>> SOUND_IMITATE_CHOICE = REGISTRY.register("sound_imitate_choice",
			() -> IForgeMenuType.create(SoundImitateChoiceMenu::new));
	public static final RegistryObject<MenuType<EBSandMenu>> EB_SAND = REGISTRY.register("eb_sand", () -> IForgeMenuType.create(EBSandMenu::new));
	public static final RegistryObject<MenuType<EBSpeedMenu>> EB_SPEED = REGISTRY.register("eb_speed", () -> IForgeMenuType.create(EBSpeedMenu::new));
	public static final RegistryObject<MenuType<EBPoisonMenu>> EB_POISON = REGISTRY.register("eb_poison",
			() -> IForgeMenuType.create(EBPoisonMenu::new));
	public static final RegistryObject<MenuType<EBMagnetMenu>> EB_MAGNET = REGISTRY.register("eb_magnet",
			() -> IForgeMenuType.create(EBMagnetMenu::new));
	public static final RegistryObject<MenuType<EBMushroomsMenu>> EB_MUSHROOMS = REGISTRY.register("eb_mushrooms",
			() -> IForgeMenuType.create(EBMushroomsMenu::new));
	public static final RegistryObject<MenuType<EBMercuryMenu>> EB_MERCURY = REGISTRY.register("eb_mercury",
			() -> IForgeMenuType.create(EBMercuryMenu::new));
	public static final RegistryObject<MenuType<MusicPlayerGUIMenu>> MUSIC_PLAYER_GUI = REGISTRY.register("music_player_gui",
			() -> IForgeMenuType.create(MusicPlayerGUIMenu::new));
	public static final RegistryObject<MenuType<EBMusicMenu>> EB_MUSIC = REGISTRY.register("eb_music", () -> IForgeMenuType.create(EBMusicMenu::new));
	public static final RegistryObject<MenuType<EBPlagueMenu>> EB_PLAGUE = REGISTRY.register("eb_plague",
			() -> IForgeMenuType.create(EBPlagueMenu::new));
	public static final RegistryObject<MenuType<RocketPathGUIMenu>> ROCKET_PATH_GUI = REGISTRY.register("rocket_path_gui",
			() -> IForgeMenuType.create(RocketPathGUIMenu::new));
	public static final RegistryObject<MenuType<EBGravityMenu>> EB_GRAVITY = REGISTRY.register("eb_gravity",
			() -> IForgeMenuType.create(EBGravityMenu::new));
	public static final RegistryObject<MenuType<CustomMusicPlayerMenu>> CUSTOM_MUSIC_PLAYER = REGISTRY.register("custom_music_player",
			() -> IForgeMenuType.create(CustomMusicPlayerMenu::new));
	public static final RegistryObject<MenuType<BuildInMusicPlayerMenu>> BUILD_IN_MUSIC_PLAYER = REGISTRY.register("build_in_music_player",
			() -> IForgeMenuType.create(BuildInMusicPlayerMenu::new));
	public static final RegistryObject<MenuType<EBSmokeMenu>> EB_SMOKE = REGISTRY.register("eb_smoke", () -> IForgeMenuType.create(EBSmokeMenu::new));
	public static final RegistryObject<MenuType<EBSpiritMenu>> EB_SPIRIT = REGISTRY.register("eb_spirit",
			() -> IForgeMenuType.create(EBSpiritMenu::new));
	public static final RegistryObject<MenuType<ChoiseMagicPower1Menu>> CHOISE_MAGIC_POWER_1 = REGISTRY.register("choise_magic_power_1",
			() -> IForgeMenuType.create(ChoiseMagicPower1Menu::new));
	public static final RegistryObject<MenuType<ChoiseMagicPower3Menu>> CHOISE_MAGIC_POWER_3 = REGISTRY.register("choise_magic_power_3",
			() -> IForgeMenuType.create(ChoiseMagicPower3Menu::new));
	public static final RegistryObject<MenuType<ChoiseMagicPower2Menu>> CHOISE_MAGIC_POWER_2 = REGISTRY.register("choise_magic_power_2",
			() -> IForgeMenuType.create(ChoiseMagicPower2Menu::new));
	public static final RegistryObject<MenuType<EBAetherMenu>> EB_AETHER = REGISTRY.register("eb_aether",
			() -> IForgeMenuType.create(EBAetherMenu::new));
	public static final RegistryObject<MenuType<CompanionsGuiMenu>> COMPANIONS_GUI = REGISTRY.register("companions_gui",
			() -> IForgeMenuType.create(CompanionsGuiMenu::new));
	public static final RegistryObject<MenuType<EBFormMenu>> EB_FORM = REGISTRY.register("eb_form", () -> IForgeMenuType.create(EBFormMenu::new));
	public static final RegistryObject<MenuType<EBMindMenu>> EB_MIND = REGISTRY.register("eb_mind", () -> IForgeMenuType.create(EBMindMenu::new));
	public static final RegistryObject<MenuType<EBGoldenDustMenu>> EB_GOLDEN_DUST = REGISTRY.register("eb_golden_dust",
			() -> IForgeMenuType.create(EBGoldenDustMenu::new));
}
