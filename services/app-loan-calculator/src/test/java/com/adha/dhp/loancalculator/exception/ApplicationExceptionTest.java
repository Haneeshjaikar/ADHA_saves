package com.adha.dhp.loancalculator.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class ApplicationExceptionTest {

    @Test
    void testConstructor() {
        ApplicationException actualApplicationException = new ApplicationException("An error occurred");
        assertNull(actualApplicationException.getCause());
        assertEquals(0, actualApplicationException.getSuppressed().length);
        assertEquals("An error occurred", actualApplicationException.getMessage());
        assertEquals("An error occurred", actualApplicationException.getLocalizedMessage());
    }
}

