/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CompanyStatusDataDotCom
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum AccountCleanInfo_CompanyStatusDataDotComEnum {

    // IsActiveCompanyDataDotCom
    ISACTIVECOMPANYDATADOTCOM("IsActiveCompanyDataDotCom"),
    // IsInactiveCompanyDataDotCom
    ISINACTIVECOMPANYDATADOTCOM("IsInactiveCompanyDataDotCom");

    final String value;

    private AccountCleanInfo_CompanyStatusDataDotComEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AccountCleanInfo_CompanyStatusDataDotComEnum fromValue(String value) {
        for (AccountCleanInfo_CompanyStatusDataDotComEnum e : AccountCleanInfo_CompanyStatusDataDotComEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
