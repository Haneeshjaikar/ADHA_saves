package com.adha.dhp.loancalculator.util;


public enum ExceptionMessage {

    INVALID_MONTHLY_INSTALLMENT("Expected Monthly Installment is missing from the incoming message"),
    INVALID_APPLICATION_NUMBER("Application Number is missing from the incoming message"),
    INVALID_TENURE("Expected tenure is missing from the incoming message"),
    INVALID_ENTITLED_LOAN_VALUE("Entitled loan amount is missing from the incoming message");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
