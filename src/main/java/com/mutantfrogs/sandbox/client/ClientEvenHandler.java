package com.mutantfrogs.sandbox.client;

import net.minecraft.client.Minecraft;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.ClientTickEvent;

public class ClientEvenHandler {
    @SubscribeEvent
    public void onClientTick(ClientTickEvent.Post event) {
        if (KeyRegistry.USE_SPYGLASS.isDown() && Minecraft.getInstance().isWindowActive()) {

        }
    }
}
