package com.adha.dhp.loancalculator.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ExceptionMessageTest {

    @Test
    void testValueOf() {
        assertEquals("Expected Monthly Installment is missing from the incoming message",
                ExceptionMessage.valueOf("INVALID_MONTHLY_INSTALLMENT").getMessage());
    }
}

