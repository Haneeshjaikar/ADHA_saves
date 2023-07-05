package com.adha.dhp.loancalculator.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    void testConstructor() {
        Application actualApplication = new Application();
        actualApplication.setApplicationNumber(1L);
        actualApplication.setEntitledLoanValue(42L);
        actualApplication.setExpectedMonthlyInstallment(10.0d);
        actualApplication.setExpectedRepayableLoanAmount(1L);
        actualApplication.setMaxExpectedTenure(3);
        actualApplication.setMinExpectedTenure(1);
        assertEquals(1L, actualApplication.getApplicationNumber());
        assertEquals(42L, actualApplication.getEntitledLoanValue());
        assertEquals(10.0d, actualApplication.getExpectedMonthlyInstallment());
        assertEquals(1L, actualApplication.getExpectedRepayableLoanAmount());
        assertEquals(3, actualApplication.getMaxExpectedTenure());
        assertEquals(1, actualApplication.getMinExpectedTenure());
    }

    @Test
    void testConstructor2() {
        Application actualApplication = new Application(1L, 42L, 1L, 10.0d, 1, 3);

        assertEquals(1L, actualApplication.getApplicationNumber());
        assertEquals(1, actualApplication.getMinExpectedTenure());
        assertEquals(3, actualApplication.getMaxExpectedTenure());
        assertEquals(1L, actualApplication.getExpectedRepayableLoanAmount());
        assertEquals(10.0d, actualApplication.getExpectedMonthlyInstallment());
        assertEquals(42L, actualApplication.getEntitledLoanValue());
    }
}

