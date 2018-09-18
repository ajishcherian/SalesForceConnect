/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ContactStatusDataDotCom
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum LeadCleanInfo_ContactStatusDataDotComEnum {

    // CompanyNeverExistedDataDotCom
    COMPANYNEVEREXISTEDDATADOTCOM("CompanyNeverExistedDataDotCom"),
    // CompanyOutOfBusinessDataDotCom
    COMPANYOUTOFBUSINESSDATADOTCOM("CompanyOutOfBusinessDataDotCom"),
    // DeadEmailDomainDataDotCom
    DEADEMAILDOMAINDATADOTCOM("DeadEmailDomainDataDotCom"),
    // InactiveDataDotCom
    INACTIVEDATADOTCOM("InactiveDataDotCom"),
    // IsActiveContactDataDotCom
    ISACTIVECONTACTDATADOTCOM("IsActiveContactDataDotCom"),
    // NotAtCompanyContactDataDotCom
    NOTATCOMPANYCONTACTDATADOTCOM("NotAtCompanyContactDataDotCom"),
    // WrongEmailDataDotCom
    WRONGEMAILDATADOTCOM("WrongEmailDataDotCom"),
    // WrongPhoneAndEmailDataDotCom
    WRONGPHONEANDEMAILDATADOTCOM("WrongPhoneAndEmailDataDotCom"),
    // WrongPhoneDataDotCom
    WRONGPHONEDATADOTCOM("WrongPhoneDataDotCom");

    final String value;

    private LeadCleanInfo_ContactStatusDataDotComEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LeadCleanInfo_ContactStatusDataDotComEnum fromValue(String value) {
        for (LeadCleanInfo_ContactStatusDataDotComEnum e : LeadCleanInfo_ContactStatusDataDotComEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}