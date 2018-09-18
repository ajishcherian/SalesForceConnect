/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum ContractHistory_FieldEnum {

    // Account
    ACCOUNT("Account"),
    // ActivatedBy
    ACTIVATEDBY("ActivatedBy"),
    // ActivatedDate
    ACTIVATEDDATE("ActivatedDate"),
    // BillingAddress
    BILLINGADDRESS("BillingAddress"),
    // BillingCity
    BILLINGCITY("BillingCity"),
    // BillingCountry
    BILLINGCOUNTRY("BillingCountry"),
    // BillingGeocodeAccuracy
    BILLINGGEOCODEACCURACY("BillingGeocodeAccuracy"),
    // BillingLatitude
    BILLINGLATITUDE("BillingLatitude"),
    // BillingLongitude
    BILLINGLONGITUDE("BillingLongitude"),
    // BillingPostalCode
    BILLINGPOSTALCODE("BillingPostalCode"),
    // BillingState
    BILLINGSTATE("BillingState"),
    // BillingStreet
    BILLINGSTREET("BillingStreet"),
    // CompanySigned
    COMPANYSIGNED("CompanySigned"),
    // CompanySignedDate
    COMPANYSIGNEDDATE("CompanySignedDate"),
    // ContractTerm
    CONTRACTTERM("ContractTerm"),
    // CustomerSigned
    CUSTOMERSIGNED("CustomerSigned"),
    // CustomerSignedDate
    CUSTOMERSIGNEDDATE("CustomerSignedDate"),
    // CustomerSignedTitle
    CUSTOMERSIGNEDTITLE("CustomerSignedTitle"),
    // Description
    DESCRIPTION("Description"),
    // EndDate
    ENDDATE("EndDate"),
    // Name
    NAME("Name"),
    // Owner
    OWNER("Owner"),
    // OwnerExpirationNotice
    OWNEREXPIRATIONNOTICE("OwnerExpirationNotice"),
    // Pricebook2
    PRICEBOOK2("Pricebook2"),
    // ShippingAddress
    SHIPPINGADDRESS("ShippingAddress"),
    // ShippingCity
    SHIPPINGCITY("ShippingCity"),
    // ShippingCountry
    SHIPPINGCOUNTRY("ShippingCountry"),
    // ShippingGeocodeAccuracy
    SHIPPINGGEOCODEACCURACY("ShippingGeocodeAccuracy"),
    // ShippingLatitude
    SHIPPINGLATITUDE("ShippingLatitude"),
    // ShippingLongitude
    SHIPPINGLONGITUDE("ShippingLongitude"),
    // ShippingPostalCode
    SHIPPINGPOSTALCODE("ShippingPostalCode"),
    // ShippingState
    SHIPPINGSTATE("ShippingState"),
    // ShippingStreet
    SHIPPINGSTREET("ShippingStreet"),
    // SpecialTerms
    SPECIALTERMS("SpecialTerms"),
    // StartDate
    STARTDATE("StartDate"),
    // Status
    STATUS("Status"),
    // contractActivation
    CONTRACTACTIVATION("contractActivation"),
    // contractApproval
    CONTRACTAPPROVAL("contractApproval"),
    // contractConversion
    CONTRACTCONVERSION("contractConversion"),
    // contractDraft
    CONTRACTDRAFT("contractDraft"),
    // contractExpiration
    CONTRACTEXPIRATION("contractExpiration"),
    // contractTermination
    CONTRACTTERMINATION("contractTermination"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private ContractHistory_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContractHistory_FieldEnum fromValue(String value) {
        for (ContractHistory_FieldEnum e : ContractHistory_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
