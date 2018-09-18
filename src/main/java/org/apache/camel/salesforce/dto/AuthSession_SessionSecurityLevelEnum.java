/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SessionSecurityLevel
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum AuthSession_SessionSecurityLevelEnum {

    // HIGH_ASSURANCE
    HIGH_ASSURANCE("HIGH_ASSURANCE"),
    // LOW
    LOW("LOW"),
    // STANDARD
    STANDARD("STANDARD");

    final String value;

    private AuthSession_SessionSecurityLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AuthSession_SessionSecurityLevelEnum fromValue(String value) {
        for (AuthSession_SessionSecurityLevelEnum e : AuthSession_SessionSecurityLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}