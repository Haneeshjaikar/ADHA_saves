package com.adha.dhp.loancalculator.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


@Getter
@Setter
public class LoanEntitlement {

    private Long  applicationNumber;

    private Long  entitledLoanValue;

    private Long  expectedRepayableLoanAmount;

    private Double  expectedMonthlyInstallment;

    private Integer  minExpectedTenure;

    private Integer  maxExpectedTenure;
}
