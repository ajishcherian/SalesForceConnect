/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ShareType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum ContentDocumentLink_ShareTypeEnum {

    // C
    C("C"),
    // I
    I("I"),
    // V
    V("V");

    final String value;

    private ContentDocumentLink_ShareTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContentDocumentLink_ShareTypeEnum fromValue(String value) {
        for (ContentDocumentLink_ShareTypeEnum e : ContentDocumentLink_ShareTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
