/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotifyForOperations
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum PushTopic_NotifyForOperationsEnum {

    // All
    ALL("All"),
    // Create
    CREATE("Create"),
    // Extended
    EXTENDED("Extended"),
    // Update
    UPDATE("Update");

    final String value;

    private PushTopic_NotifyForOperationsEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PushTopic_NotifyForOperationsEnum fromValue(String value) {
        for (PushTopic_NotifyForOperationsEnum e : PushTopic_NotifyForOperationsEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
