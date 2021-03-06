/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum CaseHistory_FieldEnum {

    // Account
    ACCOUNT("Account"),
    // Asset
    ASSET("Asset"),
    // BusinessHours
    BUSINESSHOURS("BusinessHours"),
    // Contact
    CONTACT("Contact"),
    // Description
    DESCRIPTION("Description"),
    // EngineeringReqNumber__c
    ENGINEERINGREQNUMBER__C("EngineeringReqNumber__c"),
    // IsClosedOnCreate
    ISCLOSEDONCREATE("IsClosedOnCreate"),
    // IsEscalated
    ISESCALATED("IsEscalated"),
    // Origin
    ORIGIN("Origin"),
    // Owner
    OWNER("Owner"),
    // Parent
    PARENT("Parent"),
    // PotentialLiability__c
    POTENTIALLIABILITY__C("PotentialLiability__c"),
    // Priority
    PRIORITY("Priority"),
    // Product__c
    PRODUCT__C("Product__c"),
    // Reason
    REASON("Reason"),
    // SLAViolation__c
    SLAVIOLATION__C("SLAViolation__c"),
    // Status
    STATUS("Status"),
    // Subject
    SUBJECT("Subject"),
    // Type
    TYPE("Type"),
    // closed
    CLOSED("closed"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // ownerEscalated
    OWNERESCALATED("ownerEscalated"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private CaseHistory_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CaseHistory_FieldEnum fromValue(String value) {
        for (CaseHistory_FieldEnum e : CaseHistory_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
