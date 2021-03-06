/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist EmployeesHereReliability
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum DandBCompany_EmployeesHereReliabilityEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3");

    final String value;

    private DandBCompany_EmployeesHereReliabilityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DandBCompany_EmployeesHereReliabilityEnum fromValue(String value) {
        for (DandBCompany_EmployeesHereReliabilityEnum e : DandBCompany_EmployeesHereReliabilityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
