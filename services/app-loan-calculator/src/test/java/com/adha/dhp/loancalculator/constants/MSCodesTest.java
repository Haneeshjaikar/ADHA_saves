package com.adha.dhp.loancalculator.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MSCodesTest {

    @Test
    void testValueOf() {
        assertEquals("GS", MSCodes.valueOf("GATEWAY_SERVICE").getValue());
    }
}

