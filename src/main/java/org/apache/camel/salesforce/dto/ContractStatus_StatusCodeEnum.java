/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist StatusCode
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum ContractStatus_StatusCodeEnum {

    // Activated
    ACTIVATED("Activated"),
    // Draft
    DRAFT("Draft"),
    // Expired
    EXPIRED("Expired"),
    // InApproval
    INAPPROVAL("InApproval"),
    // Terminated
    TERMINATED("Terminated");

    final String value;

    private ContractStatus_StatusCodeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContractStatus_StatusCodeEnum fromValue(String value) {
        for (ContractStatus_StatusCodeEnum e : ContractStatus_StatusCodeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
