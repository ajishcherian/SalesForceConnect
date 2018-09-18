/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Encoding
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum EmailTemplate_EncodingEnum {

    // Big5
    BIG5("Big5"),
    // Big5-HKSCS
    BIG5_HKSCS("Big5-HKSCS"),
    // EUC-JP
    EUC_JP("EUC-JP"),
    // GB2312
    GB2312("GB2312"),
    // ISO-2022-JP
    ISO_2022_JP("ISO-2022-JP"),
    // ISO-8859-1
    ISO_8859_1("ISO-8859-1"),
    // Shift_JIS
    SHIFT_JIS("Shift_JIS"),
    // UTF-8
    UTF_8("UTF-8"),
    // ks_c_5601-1987
    KS_C_5601_1987("ks_c_5601-1987"),
    // x-SJIS_0213
    X_SJIS_0213("x-SJIS_0213");

    final String value;

    private EmailTemplate_EncodingEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EmailTemplate_EncodingEnum fromValue(String value) {
        for (EmailTemplate_EncodingEnum e : EmailTemplate_EncodingEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
