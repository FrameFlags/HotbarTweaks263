package itamio.hotbartweaks;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Hotbar Tweaks — unofficial 26.3 port (NeoForge). */
@Mod(HotbarTweaksNeoForgeMod.MOD_ID)
public class HotbarTweaksNeoForgeMod {
    public static final String MOD_ID = "hotbartweaks263";
    public static final Logger LOGGER = LoggerFactory.getLogger("Hotbar Tweaks");

    public HotbarTweaksNeoForgeMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("[Hotbar Tweaks] initialized on Minecraft 26.3 (NeoForge)");
    }
}
