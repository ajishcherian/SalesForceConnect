/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist YearType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum FiscalYearSettings_YearTypeEnum {

    // Custom
    CUSTOM("Custom"),
    // Placeholder
    PLACEHOLDER("Placeholder"),
    // Standard
    STANDARD("Standard");

    final String value;

    private FiscalYearSettings_YearTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static FiscalYearSettings_YearTypeEnum fromValue(String value) {
        for (FiscalYearSettings_YearTypeEnum e : FiscalYearSettings_YearTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
