/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist State
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum ProcessDefinition_StateEnum {

    // Active
    ACTIVE("Active"),
    // Inactive
    INACTIVE("Inactive"),
    // Obsolete
    OBSOLETE("Obsolete");

    final String value;

    private ProcessDefinition_StateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProcessDefinition_StateEnum fromValue(String value) {
        for (ProcessDefinition_StateEnum e : ProcessDefinition_StateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
