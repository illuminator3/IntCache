package me.illuminator3.intcache.test;

import me.illuminator3.intcache.IntCache;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static me.illuminator3.intcache.IntCache.*;
import static org.assertj.core.api.Assertions.*;

public class IntCacheTest
{
    @Test
    @DisplayName("Translate")
    public void testTranslate()
    {
        int num = translate(0);

        assertThat(num).isEqualTo(-IntCache.low());

        num = translate(-128);

        assertThat(num).isEqualTo(0);
    }

    @Test
    @DisplayName("Switch Numbers")
    public void testSwitchNumbers()
    {
        switchNumbers(4, 5);

        assertThat(2 + 2).isEqualTo(5);
        assertThat(2 + 3).isEqualTo(4);
    }

    @Test
    @DisplayName("Modify")
    public void testModify()
    {
        modify(4, 5);

        assertThat(2 + 2).isEqualTo(5);
    }

    @Test
    @DisplayName("Set")
    public void testSet()
    {
        set(-low() + 4, 5);

        assertThat(2 + 2).isEqualTo(5);
    }
}