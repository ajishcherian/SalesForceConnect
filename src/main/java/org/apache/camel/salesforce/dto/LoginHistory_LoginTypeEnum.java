/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist LoginType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum LoginHistory_LoginTypeEnum {

    ; // empty picklist!

    final String value;

    private LoginHistory_LoginTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LoginHistory_LoginTypeEnum fromValue(String value) {
        for (LoginHistory_LoginTypeEnum e : LoginHistory_LoginTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
