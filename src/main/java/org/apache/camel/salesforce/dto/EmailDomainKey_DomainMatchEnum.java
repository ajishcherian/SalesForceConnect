/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DomainMatch
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum EmailDomainKey_DomainMatchEnum {

    // DomainAndSubdomains
    DOMAINANDSUBDOMAINS("DomainAndSubdomains"),
    // DomainOnly
    DOMAINONLY("DomainOnly"),
    // SubdomainsOnly
    SUBDOMAINSONLY("SubdomainsOnly");

    final String value;

    private EmailDomainKey_DomainMatchEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EmailDomainKey_DomainMatchEnum fromValue(String value) {
        for (EmailDomainKey_DomainMatchEnum e : EmailDomainKey_DomainMatchEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
