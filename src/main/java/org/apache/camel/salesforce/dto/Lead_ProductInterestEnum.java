/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ProductInterest__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Lead_ProductInterestEnum {

    // GC1000 series
    GC1000_SERIES("GC1000 series"),
    // GC3000 series
    GC3000_SERIES("GC3000 series"),
    // GC5000 series
    GC5000_SERIES("GC5000 series");

    final String value;

    private Lead_ProductInterestEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Lead_ProductInterestEnum fromValue(String value) {
        for (Lead_ProductInterestEnum e : Lead_ProductInterestEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
