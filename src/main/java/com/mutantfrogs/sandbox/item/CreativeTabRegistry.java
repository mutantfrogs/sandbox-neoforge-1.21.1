package com.mutantfrogs.sandbox.item;

import com.mutantfrogs.sandbox.sound.SoundRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.mutantfrogs.sandbox.Sandbox.MODID;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final Supplier<CreativeModeTab> SANDBOX_TAB = TABS.register("sandbox_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.SAND))
                    .title(Component.translatable("creative_tab.sandbox.all"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //list items that go in the creative tab here
                        output.accept(ItemRegistry.DROOPY_MUSIC_DISC);
                    })
                    .build());

    //register deferred register
    public static void register(IEventBus eventBus){
        TABS.register(eventBus);
    }
}
