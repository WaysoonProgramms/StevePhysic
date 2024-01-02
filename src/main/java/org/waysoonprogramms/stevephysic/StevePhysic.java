package org.waysoonprogramms.stevephysic;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StevePhysic implements ModInitializer {
    public static final String MOD_ID = "stevephysic";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.debug("init");
    }
}
