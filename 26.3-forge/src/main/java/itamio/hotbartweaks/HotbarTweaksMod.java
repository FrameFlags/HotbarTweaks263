package itamio.hotbartweaks;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Hotbar Tweaks — unofficial 26.3 port (Forge). */
@Mod(HotbarTweaksMod.MOD_ID)
public class HotbarTweaksMod {
    public static final String MOD_ID = "hotbartweaks263";
    public static final Logger LOGGER = LogUtils.getLogger();

    public HotbarTweaksMod() {
        LOGGER.info("[Hotbar Tweaks] initialized on Minecraft 26.3 (Forge)");
    }
}
