package com.aether;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AetherMod implements ModInitializer {
    public static final String MOD_ID = "aether";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("The Aether is initializing...");
    }
}
