/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Order_StatusEnum {

    // Activated
    ACTIVATED("Activated"),
    // Draft
    DRAFT("Draft");

    final String value;

    private Order_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Order_StatusEnum fromValue(String value) {
        for (Order_StatusEnum e : Order_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
