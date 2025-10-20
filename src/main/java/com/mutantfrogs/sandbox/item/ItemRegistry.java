package com.mutantfrogs.sandbox.item;

import com.mutantfrogs.sandbox.sound.SoundRegistry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.JukeboxSong;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.mutantfrogs.sandbox.Sandbox.MODID;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> DROOPY_MUSIC_DISC = ITEMS.register("droopy_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(SoundRegistry.DROOPY_KEY).stacksTo(1)));

    //register deferred register
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
