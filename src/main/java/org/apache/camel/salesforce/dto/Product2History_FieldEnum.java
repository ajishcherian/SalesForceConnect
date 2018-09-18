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
public enum Product2History_FieldEnum {

    // Description
    DESCRIPTION("Description"),
    // DisplayUrl
    DISPLAYURL("DisplayUrl"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource"),
    // ExternalId
    EXTERNALID("ExternalId"),
    // Family
    FAMILY("Family"),
    // IsActive
    ISACTIVE("IsActive"),
    // Name
    NAME("Name"),
    // ProductCode
    PRODUCTCODE("ProductCode"),
    // QuantityUnitOfMeasure
    QUANTITYUNITOFMEASURE("QuantityUnitOfMeasure"),
    // StockKeepingUnit
    STOCKKEEPINGUNIT("StockKeepingUnit"),
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
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private Product2History_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Product2History_FieldEnum fromValue(String value) {
        for (Product2History_FieldEnum e : Product2History_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
