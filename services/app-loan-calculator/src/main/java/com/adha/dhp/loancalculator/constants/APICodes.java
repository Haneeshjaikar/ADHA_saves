package com.adha.dhp.loancalculator.constants;

public enum APICodes {
    // API Code for MS
    RABBITMQ_PROFILE_REFRESH(DomainCodes.MS + "-01"),
    MS_FILE_UPLOAD(DomainCodes.MS + "FILE_UPLOAD"),
    MS_UPLOAD_TO_ECM(DomainCodes.MS + "UPLOAD_TO_ECM"),

    // API Code for Tawtheeq
    TAWTHEEQ_LIST(DomainCodes.TAWTHEEQ + "-LIST"),
    TAWTHEEQ_DETAILS(DomainCodes.TAWTHEEQ + "-DETAILS"),
    ALL_TAWTHEEQ_DETAILS(DomainCodes.TAWTHEEQ + "-ALL-DETAILS"),

    // API Codes for ADJD
    MARITAL_TRANSACTIONS(DomainCodes.ADJD + "-MARITAL_TRANSACTIONS"),
    POA_STATUS(DomainCodes.ADJD + "-POA_STATUS"),
    ALL_MARITAL_TRANSACTIONS(DomainCodes.ADJD + "-ALL_MARITAL_TRANSACTIONS"),
    ATTESTATION_DOCUMENT(DomainCodes.ADJD + "-ATTESTATION_DOCUMENT"),

    // API Codes for DMT
    LOOKUP_ITEMS(DomainCodes.DMT + "-LOOKUP_ITEMS"),
    HISTORY_PLOT_OWNERSHIP(DomainCodes.DMT + "-HISTORY_PLOT_OWNERSHIP"),
    OWNERID_BY_OWNERIDN(DomainCodes.DMT + "-OWNERID_BY_OWNERIDN"),
    OWNERPROFILE_BY_OWNERID(DomainCodes.DMT + "-OWNERPROFILE_BY_OWNERID"),
    PLOTOWNERS_BY_PLOTID(DomainCodes.DMT + "-PLOTOWNERS_BY_PLOTID"),
    PLOTPROFILE_BY_PLOTID(DomainCodes.DMT + "-PLOTPROFILE_BY_PLOTID"),
    PLOT_OWNERSHIP(DomainCodes.DMT + "-PLOT_OWNERSHIP"),
    SITE_PLAN(DomainCodes.DMT + "-SITE_PLAN"),
    LANDS_SHORTLIST(DomainCodes.DMT + "-LANDS_SHORTLIST"),
    OWNERSHIP_ALL_DETAILS(DomainCodes.DMT + "-OWNERSHIP_ALL_DETAILS"),

    // API Codes for SZHP
    GET_TOKEN(DomainCodes.SZHP + "-GET_TOKEN"),
    SEARCH_HOUSING_DATA(DomainCodes.SZHP + "-SEARCH_HOUSING_DATA"),
    HOUSING_DATA(DomainCodes.SZHP + "-HOUSING_DATA"),
    ASSISTANT_TYPE_DATA(DomainCodes.SZHP + "-ASSISTANT_TYPE_DATA"),
    QARAR_STATE_DATA(DomainCodes.SZHP + "-QARAR_STATE_DATA"),
    QARAR_PURPOSE_DATA(DomainCodes.SZHP + "-QARAR_PURPOSE_DATA");

    private String value;

    APICodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
