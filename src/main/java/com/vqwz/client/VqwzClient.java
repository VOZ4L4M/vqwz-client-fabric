package com.vqwz.client;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VqwzClient implements ClientModInitializer {
    public static final String MOD_ID = "vqwzclient";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {
        LOGGER.info("Vqwz's Client v1 initialized successfully on Minecraft 1.21.11!");
    }
}
