package com.adha.dhp.loancalculator.constants;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class APICodesTest {

    @Test
    void testValueOf() {
        assertEquals("MS-01", APICodes.valueOf("RABBITMQ_PROFILE_REFRESH").getValue());
    }
}

