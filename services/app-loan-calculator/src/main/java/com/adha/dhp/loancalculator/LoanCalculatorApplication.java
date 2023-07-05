package com.adha.dhp.loancalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.adha.*"})
@EnableScheduling
public class LoanCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanCalculatorApplication.class, args);

    }
}
