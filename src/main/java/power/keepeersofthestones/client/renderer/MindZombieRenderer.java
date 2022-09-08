
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.MindZombieEntity;
import power.keepeersofthestones.client.model.ModelMindZombie;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class MindZombieRenderer extends MobRenderer<MindZombieEntity, ModelMindZombie<MindZombieEntity>> {
	public MindZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMindZombie(context.bakeLayer(ModelMindZombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MindZombieEntity entity) {
		return new ResourceLocation("power:textures/entities/mind_zombie.png");
	}
}
