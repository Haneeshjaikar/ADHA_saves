package com.adha.dhp.loancalculator.constants;

public enum DomainCodes {
    ADJD("ADJD"),
    DMT("DMT"),
    SZHP("SZHP"),
    CPC("CPC"),
    ICP("ICP"),
    MOE("MOE"),
    ADPF("ADPF"),
    DOF("DOF"),
    MOF("MOF"),
    MOHRE("MOHRE"),
    DED("DED"),
    CID("CID"),
    GIS("GIS"),
    MOCD("MOCD"),
    DOH("DOH"),
    FAB("FAB"),
    MS("MS"),
    TAWTHEEQ("TAWTHEEQ"),
    DB("DB"),
    ECM("ECM"),
    PCA("PCA"),
    RS("RS");

    private final String value;

    DomainCodes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

