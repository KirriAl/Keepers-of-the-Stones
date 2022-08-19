
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.model.Modeltyrannosaurus_rex;
import power.keepeersofthestones.client.model.Modeltornadocc;
import power.keepeersofthestones.client.model.Modelshadow;
import power.keepeersofthestones.client.model.Modelrocket;
import power.keepeersofthestones.client.model.Modelmagic_arrow;
import power.keepeersofthestones.client.model.Modelglow;
import power.keepeersofthestones.client.model.ModelRaptor;
import power.keepeersofthestones.client.model.ModelPterodactyl;
import power.keepeersofthestones.client.model.ModelPlesiosaurus;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltyrannosaurus_rex.LAYER_LOCATION, Modeltyrannosaurus_rex::createBodyLayer);
		event.registerLayerDefinition(ModelPlesiosaurus.LAYER_LOCATION, ModelPlesiosaurus::createBodyLayer);
		event.registerLayerDefinition(Modeltornadocc.LAYER_LOCATION, Modeltornadocc::createBodyLayer);
		event.registerLayerDefinition(Modelshadow.LAYER_LOCATION, Modelshadow::createBodyLayer);
		event.registerLayerDefinition(ModelRaptor.LAYER_LOCATION, ModelRaptor::createBodyLayer);
		event.registerLayerDefinition(Modelmagic_arrow.LAYER_LOCATION, Modelmagic_arrow::createBodyLayer);
		event.registerLayerDefinition(Modelrocket.LAYER_LOCATION, Modelrocket::createBodyLayer);
		event.registerLayerDefinition(Modelglow.LAYER_LOCATION, Modelglow::createBodyLayer);
		event.registerLayerDefinition(ModelPterodactyl.LAYER_LOCATION, ModelPterodactyl::createBodyLayer);
	}
}
