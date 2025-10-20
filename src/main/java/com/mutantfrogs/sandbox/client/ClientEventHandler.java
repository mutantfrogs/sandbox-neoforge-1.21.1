package com.mutantfrogs.sandbox.client;

import net.minecraft.client.Minecraft;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

public class ClientEventHandler {
    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        if (KeyRegistry.USE_SPYGLASS.isDown() && Minecraft.getInstance().isWindowActive()) {

        }
    }
}
