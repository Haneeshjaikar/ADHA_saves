package com.adha.dhp.loancalculator.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name="Application")
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    @Id
    @Column(name="APPLICATION_NUMBER")
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  applicationNumber;

    @NotNull
    @NotEmpty
    @Column(name="ENTITLED_LOAN_VALUE")
    private Long  entitledLoanValue;


    @Column(name="EXP_REPAYABLE_LOAN_AMOUNT")
    private Long  expectedRepayableLoanAmount;

    @NotNull
    @NotEmpty
    @Column(name="EXP_MONTHLY_INSTALLMENT")
    private Double  expectedMonthlyInstallment;

    @NotNull
    @NotEmpty
    @Column(name="EXP_MIN_TENURE_IN_MONTHS")
    private Integer  minExpectedTenure;

    @NotNull
    @NotEmpty
    @Column(name="EXP_MAX_TENURE_IN_MONTHS")
    private Integer  maxExpectedTenure;
}
