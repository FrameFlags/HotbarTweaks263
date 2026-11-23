package itamio.hotbartweaks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Hotbar Tweaks — unofficial 26.3 port (Fabric). */
public class HotbarTweaksMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Hotbar Tweaks");

    @Override
    public void onInitialize() {
        LOGGER.info("[Hotbar Tweaks] initialized on Minecraft 26.3 (Fabric)");
    }
}
