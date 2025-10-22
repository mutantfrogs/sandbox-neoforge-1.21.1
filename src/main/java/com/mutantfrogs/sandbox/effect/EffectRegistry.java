package com.mutantfrogs.sandbox.effect;

import com.mutantfrogs.sandbox.Sandbox;
import com.mutantfrogs.sandbox.effect.custom.ChargedEffect;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.mutantfrogs.sandbox.Sandbox.MODID;

public class EffectRegistry {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, MODID);

    public static final Holder<MobEffect> CHARGED_EFFECT = MOB_EFFECTS.register("charged",
            () -> new ChargedEffect(MobEffectCategory.BENEFICIAL, 0x7befe8));

    public static void register(IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }
}


