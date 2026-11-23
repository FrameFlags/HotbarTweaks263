package itamio.hotbartweaks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotbarTweaksLogicTest {
    @Test void scrollModes() {
        assertEquals(0, HotbarTweaksLogic.scroll(0, -1, 9, false));
        assertEquals(8, HotbarTweaksLogic.scroll(0, -1, 9, true));
        assertEquals(8, HotbarTweaksLogic.scroll(8, 1, 9, false));
        assertEquals(0, HotbarTweaksLogic.scroll(8, 1, 9, true));
    }
    @Test void shifting() {
        assertEquals(4, HotbarTweaksLogic.shift(0, 3, 3, 1, 1));
        assertEquals(0, HotbarTweaksLogic.shift(8, 3, 3, 1, 1));
    }
}
