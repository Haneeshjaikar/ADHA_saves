package com.adha.dhp.loancalculator.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LoanEntitlementTest {

    @Test
    void testConstructor() {
        LoanEntitlement actualLoanEntitlement = new LoanEntitlement();
        actualLoanEntitlement.setApplicationNumber(1L);
        actualLoanEntitlement.setEntitledLoanValue(42L);
        actualLoanEntitlement.setExpectedMonthlyInstallment(10.0d);
        actualLoanEntitlement.setExpectedRepayableLoanAmount(1L);
        actualLoanEntitlement.setMaxExpectedTenure(3);
        actualLoanEntitlement.setMinExpectedTenure(1);
        assertEquals(1L, actualLoanEntitlement.getApplicationNumber());
        assertEquals(42L, actualLoanEntitlement.getEntitledLoanValue());
        assertEquals(10.0d, actualLoanEntitlement.getExpectedMonthlyInstallment());
        assertEquals(1L, actualLoanEntitlement.getExpectedRepayableLoanAmount());
        assertEquals(3, actualLoanEntitlement.getMaxExpectedTenure());
        assertEquals(1, actualLoanEntitlement.getMinExpectedTenure());
    }
}

