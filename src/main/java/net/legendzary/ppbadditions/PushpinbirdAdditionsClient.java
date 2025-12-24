package net.legendzary.ppbadditions;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.legendzary.ppbadditions.entity.ModEntities;
import net.legendzary.ppbadditions.entity.client.PushpinProjectileModel;
import net.legendzary.ppbadditions.entity.client.PushpinProjectileRenderer;

public class PushpinbirdAdditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(PushpinProjectileModel.PUSHPIN, PushpinProjectileModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.PUSHPIN, PushpinProjectileRenderer::new);
    }
}
