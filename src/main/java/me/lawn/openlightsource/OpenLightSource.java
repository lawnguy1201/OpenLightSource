package me.lawn.openlightsource;

import baritone.api.BaritoneAPI;
import baritone.api.pathing.goals.GoalXZ;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OpenLightSource implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("openlight");


    @Override
    public void onInitialize()
    {
        LOGGER.info("Hello Fabric World");


    }

}
