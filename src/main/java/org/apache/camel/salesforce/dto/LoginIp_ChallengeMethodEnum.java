/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ChallengeMethod
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum LoginIp_ChallengeMethodEnum {

    // Email
    EMAIL("Email"),
    // SMS
    SMS("SMS"),
    // TOTP_CHOICE
    TOTP_CHOICE("TOTP_CHOICE"),
    // TOTP_ONLY
    TOTP_ONLY("TOTP_ONLY");

    final String value;

    private LoginIp_ChallengeMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LoginIp_ChallengeMethodEnum fromValue(String value) {
        for (LoginIp_ChallengeMethodEnum e : LoginIp_ChallengeMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
