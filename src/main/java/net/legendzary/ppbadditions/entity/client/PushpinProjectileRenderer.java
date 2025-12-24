package net.legendzary.ppbadditions.entity.client;

import net.legendzary.ppbadditions.PushpinbirdAdditions;
import net.legendzary.ppbadditions.entity.custom.PushpinProjectileEntity;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;

public class PushpinProjectileRenderer extends EntityRenderer<PushpinProjectileEntity> {
    protected PushpinProjectileModel model;

    public PushpinProjectileRenderer(EntityRendererFactory.Context ctx) {
        super(ctx);
        this.model = new PushpinProjectileModel(ctx. getPart(PushpinProjectileModel.PUSHPIN));
    }

    public void render(PushpinProjectileEntity entity, float yaw, float tickDelta, MatrixStack matrices,
                       VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();

        matrices.scale(0.5f,0.5f,0.5f);

        if(!entity.isGrounded()) {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(MathHelper.lerp(tickDelta, entity.prevYaw, entity.getYaw())));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.getRenderingRotation() * 5f));
            matrices.translate(0, -1.0f, 0);
        } else {
            matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(entity.groundedOffset.getY()));
            matrices.multiply(RotationAxis.POSITIVE_X.rotationDegrees(entity.groundedOffset.getX()));
        }

        VertexConsumer vertexconsumer = ItemRenderer.getDirectItemGlintConsumer(vertexConsumers,
                this.model.getLayer(Identifier.of(PushpinbirdAdditions.MOD_ID, "textures/entity/pushpin/pushpin.png")), false, false);
        this.model.render(matrices, vertexconsumer, light, OverlayTexture.DEFAULT_UV);

        matrices.pop();
        super.render(entity, yaw, tickDelta, matrices, vertexConsumers, light);
    }

    @Override
    public Identifier getTexture(PushpinProjectileEntity entity) {
        return Identifier.of(PushpinbirdAdditions.MOD_ID, "textures/entity/pushpin/pushpin.png");
    }
}
