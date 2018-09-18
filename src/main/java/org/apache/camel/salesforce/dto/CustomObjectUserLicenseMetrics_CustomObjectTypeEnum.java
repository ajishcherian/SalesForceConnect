/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CustomObjectType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum CustomObjectUserLicenseMetrics_CustomObjectTypeEnum {

    // Enterprise
    ENTERPRISE("Enterprise"),
    // Light
    LIGHT("Light");

    final String value;

    private CustomObjectUserLicenseMetrics_CustomObjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CustomObjectUserLicenseMetrics_CustomObjectTypeEnum fromValue(String value) {
        for (CustomObjectUserLicenseMetrics_CustomObjectTypeEnum e : CustomObjectUserLicenseMetrics_CustomObjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}