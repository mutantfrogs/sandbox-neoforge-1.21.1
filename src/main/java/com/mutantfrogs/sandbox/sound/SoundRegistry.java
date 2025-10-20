package com.mutantfrogs.sandbox.sound;

import com.mutantfrogs.sandbox.Sandbox;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.mutantfrogs.sandbox.Sandbox.MODID;

public class SoundRegistry {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, MODID);

    private static Supplier<SoundEvent> registerSoundEvent(String name){
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(MODID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    private static ResourceKey<JukeboxSong> createSong(String name){
        return ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MODID, name));
    }

    public static final Supplier<SoundEvent> DROOPY = registerSoundEvent("droopy");
    public static final ResourceKey<JukeboxSong> DROOPY_KEY = createSong("droopy");

    public static void register(IEventBus eventBus){
        SOUND_EVENTS.register(eventBus);
    }
}
