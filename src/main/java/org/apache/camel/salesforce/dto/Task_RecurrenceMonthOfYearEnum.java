/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RecurrenceMonthOfYear
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Task_RecurrenceMonthOfYearEnum {

    // April
    APRIL("April"),
    // August
    AUGUST("August"),
    // December
    DECEMBER("December"),
    // February
    FEBRUARY("February"),
    // January
    JANUARY("January"),
    // July
    JULY("July"),
    // June
    JUNE("June"),
    // March
    MARCH("March"),
    // May
    MAY("May"),
    // November
    NOVEMBER("November"),
    // October
    OCTOBER("October"),
    // September
    SEPTEMBER("September");

    final String value;

    private Task_RecurrenceMonthOfYearEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Task_RecurrenceMonthOfYearEnum fromValue(String value) {
        for (Task_RecurrenceMonthOfYearEnum e : Task_RecurrenceMonthOfYearEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
