package com.trader.core.enums;

public enum DatePatternsEnum {
    DATE_PATTERN_1("yyyy-MM-dd HH:mm:ss.S"),
    DATE_PATTERN_2("yyyy-MM-dd HH:mm:ss"),
    DATE_PATTERN_3("yyyy-MM-dd HH:mm"),
    DATE_PATTERN_4("yyyy-MM-dd HH"),
    DATE_PATTERN_5("yyyy-MM-dd"),
    DATE_PATTERN_6("yyyy/MM/dd HH:mm:ss.S"),
    DATE_PATTERN_7("yyyy/MM/dd HH:mm:ss"),
    DATE_PATTERN_8("yyyy/MM/dd HH:mm"),
    DATE_PATTERN_9("yyyy/MM/dd HH"),
    DATE_PATTERN_10("yyyy/MM/dd"),
    DATE_PATTERN_11("yyyy_MM_dd HH:mm:ss.S"),
    DATE_PATTERN_12("yyyy_MM_dd HH:mm:ss"),
    DATE_PATTERN_13("yyyy_MM_dd HH:mm"),
    DATE_PATTERN_14("yyyy_MM_dd HH"),
    DATE_PATTERN_15("yyyy_MM_dd"),
    DATE_PATTERN_16("yyyyMMdd HH:mm:ss.S"),
    DATE_PATTERN_17("yyyyMMdd HH:mm:ss"),
    DATE_PATTERN_18("yyyyMMdd HH:mm"),
    DATE_PATTERN_19("yyyyMMdd HH"),
    DATE_PATTERN_20("yyyyMMdd"),
    DATE_PATTERN_21("dd-MM-yyyy HH:mm:ss.S"),
    DATE_PATTERN_22("dd-MM-yyyy HH:mm:ss"),
    DATE_PATTERN_23("dd-MM-yyyy HH:mm"),
    DATE_PATTERN_24("dd-MM-yyyy HH"),
    DATE_PATTERN_25("dd-MM-yyyy"),
    DATE_PATTERN_26("dd/MM/yyyy HH:mm:ss.S"),
    DATE_PATTERN_27("dd/MM/yyyy HH:mm:ss"),
    DATE_PATTERN_28("dd/MM/yyyy HH:mm"),
    DATE_PATTERN_29("dd/MM/yyyy HH"),
    DATE_PATTERN_30("dd/MM/yyyy"),
    DATE_PATTERN_31("dd_MM_yyyy HH:mm:ss.S"),
    DATE_PATTERN_32("dd_MM_yyyy HH:mm:ss"),
    DATE_PATTERN_33("dd_MM_yyyy HH:mm"),
    DATE_PATTERN_34("dd_MM_yyyy HH"),
    DATE_PATTERN_35("dd_MM_yyyy"),
    DATE_PATTERN_36("ddMMyyyy HH:mm:ss.S"),
    DATE_PATTERN_37("ddMMyyyy HH:mm:ss"),
    DATE_PATTERN_38("ddMMyyyy HH:mm"),
    DATE_PATTERN_39("ddMMyyyy HH"),
    DATE_PATTERN_40("ddMMyyyy");

    DatePatternsEnum(String pattern) {
        this.pattern = pattern;
    }

    private String pattern;

    public String getPattern() {
        return pattern;
    }
}
