/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist UiSkin
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Organization_UiSkinEnum {

    // PortalDefault
    PORTALDEFAULT("PortalDefault"),
    // Theme1
    THEME1("Theme1"),
    // Theme2
    THEME2("Theme2"),
    // Theme3
    THEME3("Theme3"),
    // Webstore
    WEBSTORE("Webstore");

    final String value;

    private Organization_UiSkinEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Organization_UiSkinEnum fromValue(String value) {
        for (Organization_UiSkinEnum e : Organization_UiSkinEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
