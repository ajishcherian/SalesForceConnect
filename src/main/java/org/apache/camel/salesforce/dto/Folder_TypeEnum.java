/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Type
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Folder_TypeEnum {

    // Dashboard
    DASHBOARD("Dashboard"),
    // Document
    DOCUMENT("Document"),
    // Email
    EMAIL("Email"),
    // Report
    REPORT("Report");

    final String value;

    private Folder_TypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Folder_TypeEnum fromValue(String value) {
        for (Folder_TypeEnum e : Folder_TypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
