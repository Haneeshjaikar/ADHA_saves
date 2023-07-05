package com.adha.dhp.loancalculator.constants;

public enum MSCodes {
    GATEWAY_SERVICE("GS"),
    UTILITY_SERVICE("US"),
    INTEGRATION_SERVICE("IS"),
    PROPERTY_SERVICE("PROPS"),
    PROFILE_SERVICE("PROFS"),
    APPLICATION_SERVICE("AS"),
    PCA_SERVICE("PCA"),
    NOTIFICATION_SERVICE("NS"),
    DOCUMENT_SERVICE("DOC"),
    FAB_SERVICE("FAB"),
    REQUEST_SERVICE("RS");

    private final String value;

    MSCodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
