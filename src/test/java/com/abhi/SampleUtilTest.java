package com.abhi;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleUtilTest {

    @Test
    public void testHello() {
        assertEquals("Hello from Abhi Library!", SampleUtil.hello());
    }
}
