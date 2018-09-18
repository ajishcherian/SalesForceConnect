/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UserAccessLevel
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum UserShare_UserAccessLevelEnum {

    // Edit
    EDIT("Edit"),
    // Read
    READ("Read");

    final String value;

    private UserShare_UserAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserShare_UserAccessLevelEnum fromValue(String value) {
        for (UserShare_UserAccessLevelEnum e : UserShare_UserAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}