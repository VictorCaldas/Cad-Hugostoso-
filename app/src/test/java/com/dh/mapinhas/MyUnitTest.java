package com.dh.mapinhas;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MyUnitTest {
    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();
        String result = myUnit.concatenate("one", "two");
        assertEquals("onetwo", result);

    }
}
