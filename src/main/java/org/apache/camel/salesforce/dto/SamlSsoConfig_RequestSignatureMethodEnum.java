/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RequestSignatureMethod
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum SamlSsoConfig_RequestSignatureMethodEnum {

    // RSA-SHA1
    RSA_SHA1("RSA-SHA1"),
    // RSA-SHA256
    RSA_SHA256("RSA-SHA256");

    final String value;

    private SamlSsoConfig_RequestSignatureMethodEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SamlSsoConfig_RequestSignatureMethodEnum fromValue(String value) {
        for (SamlSsoConfig_RequestSignatureMethodEnum e : SamlSsoConfig_RequestSignatureMethodEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}