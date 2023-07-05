package com.adha.dhp.loancalculator.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DomainCodesTest {

    @Test
    void testValueOf() {
        assertEquals("ADJD", DomainCodes.valueOf("ADJD").getValue());
    }
}

