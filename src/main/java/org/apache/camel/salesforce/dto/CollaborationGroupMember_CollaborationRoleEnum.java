/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CollaborationRole
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum CollaborationGroupMember_CollaborationRoleEnum {

    // Admin
    ADMIN("Admin"),
    // Standard
    STANDARD("Standard");

    final String value;

    private CollaborationGroupMember_CollaborationRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationGroupMember_CollaborationRoleEnum fromValue(String value) {
        for (CollaborationGroupMember_CollaborationRoleEnum e : CollaborationGroupMember_CollaborationRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}