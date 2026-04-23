package com.ft.visuals.mixin;

import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LightmapTextureManager.class)
public class LightmapMixin {
    @Inject(at = @At("HEAD"), method = "getBrightness", cancellable = true)
    private static void onGetBrightness(CallbackInfoReturnable<Float> info) {
        info.setReturnValue(100.0f); // Встановлюємо яскравість на максимум
    }
}
