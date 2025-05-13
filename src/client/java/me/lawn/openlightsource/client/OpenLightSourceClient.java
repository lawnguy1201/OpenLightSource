package me.lawn.openlightsource.client;

import baritone.api.BaritoneAPI;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OpenLightSourceClient implements ClientModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("openlight");

    @Override
    public void onInitializeClient()
    {

        ChestNet net = new ChestNet(BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().getBaritone());
        BaritoneAPI.getProvider().getPrimaryBaritone().getCommandManager().getRegistry().register(net);


    }


}
