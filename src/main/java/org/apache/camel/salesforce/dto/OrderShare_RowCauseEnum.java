/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RowCause
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum OrderShare_RowCauseEnum {

    // ImplicitChild
    IMPLICITCHILD("ImplicitChild"),
    // ImplicitParent
    IMPLICITPARENT("ImplicitParent"),
    // ImplicitPerson
    IMPLICITPERSON("ImplicitPerson"),
    // Manual
    MANUAL("Manual"),
    // Owner
    OWNER("Owner"),
    // Rule
    RULE("Rule"),
    // Team
    TEAM("Team"),
    // Territory
    TERRITORY("Territory"),
    // Territory2Forecast
    TERRITORY2FORECAST("Territory2Forecast"),
    // TerritoryManual
    TERRITORYMANUAL("TerritoryManual"),
    // TerritoryRule
    TERRITORYRULE("TerritoryRule");

    final String value;

    private OrderShare_RowCauseEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OrderShare_RowCauseEnum fromValue(String value) {
        for (OrderShare_RowCauseEnum e : OrderShare_RowCauseEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
