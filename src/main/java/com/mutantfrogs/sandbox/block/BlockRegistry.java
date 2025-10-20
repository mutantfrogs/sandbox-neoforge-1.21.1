package com.mutantfrogs.sandbox.block;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static com.mutantfrogs.sandbox.Sandbox.MODID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

    //register deferred register
    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
