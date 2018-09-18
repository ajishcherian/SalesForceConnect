/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;

import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject EmailServicesFunction
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("EmailServicesFunction")
public class EmailServicesFunction extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // IsActive
    private Boolean IsActive;

    @JsonProperty("IsActive")
    public Boolean getIsActive() {
        return this.IsActive;
    }

    @JsonProperty("IsActive")
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    // FunctionName
    private String FunctionName;

    @JsonProperty("FunctionName")
    public String getFunctionName() {
        return this.FunctionName;
    }

    @JsonProperty("FunctionName")
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    // AuthorizedSenders
    private String AuthorizedSenders;

    @JsonProperty("AuthorizedSenders")
    public String getAuthorizedSenders() {
        return this.AuthorizedSenders;
    }

    @JsonProperty("AuthorizedSenders")
    public void setAuthorizedSenders(String AuthorizedSenders) {
        this.AuthorizedSenders = AuthorizedSenders;
    }

    // IsAuthenticationRequired
    private Boolean IsAuthenticationRequired;

    @JsonProperty("IsAuthenticationRequired")
    public Boolean getIsAuthenticationRequired() {
        return this.IsAuthenticationRequired;
    }

    @JsonProperty("IsAuthenticationRequired")
    public void setIsAuthenticationRequired(Boolean IsAuthenticationRequired) {
        this.IsAuthenticationRequired = IsAuthenticationRequired;
    }

    // IsTlsRequired
    private Boolean IsTlsRequired;

    @JsonProperty("IsTlsRequired")
    public Boolean getIsTlsRequired() {
        return this.IsTlsRequired;
    }

    @JsonProperty("IsTlsRequired")
    public void setIsTlsRequired(Boolean IsTlsRequired) {
        this.IsTlsRequired = IsTlsRequired;
    }

    // AttachmentOption
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_AttachmentOptionEnum AttachmentOption;

    @JsonProperty("AttachmentOption")
    public EmailServicesFunction_AttachmentOptionEnum getAttachmentOption() {
        return this.AttachmentOption;
    }

    @JsonProperty("AttachmentOption")
    public void setAttachmentOption(EmailServicesFunction_AttachmentOptionEnum AttachmentOption) {
        this.AttachmentOption = AttachmentOption;
    }

    // ApexClassId
    private String ApexClassId;

    @JsonProperty("ApexClassId")
    public String getApexClassId() {
        return this.ApexClassId;
    }

    @JsonProperty("ApexClassId")
    public void setApexClassId(String ApexClassId) {
        this.ApexClassId = ApexClassId;
    }

    // OverLimitAction
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_OverLimitActionEnum OverLimitAction;

    @JsonProperty("OverLimitAction")
    public EmailServicesFunction_OverLimitActionEnum getOverLimitAction() {
        return this.OverLimitAction;
    }

    @JsonProperty("OverLimitAction")
    public void setOverLimitAction(EmailServicesFunction_OverLimitActionEnum OverLimitAction) {
        this.OverLimitAction = OverLimitAction;
    }

    // FunctionInactiveAction
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_FunctionInactiveActionEnum FunctionInactiveAction;

    @JsonProperty("FunctionInactiveAction")
    public EmailServicesFunction_FunctionInactiveActionEnum getFunctionInactiveAction() {
        return this.FunctionInactiveAction;
    }

    @JsonProperty("FunctionInactiveAction")
    public void setFunctionInactiveAction(EmailServicesFunction_FunctionInactiveActionEnum FunctionInactiveAction) {
        this.FunctionInactiveAction = FunctionInactiveAction;
    }

    // AddressInactiveAction
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_AddressInactiveActionEnum AddressInactiveAction;

    @JsonProperty("AddressInactiveAction")
    public EmailServicesFunction_AddressInactiveActionEnum getAddressInactiveAction() {
        return this.AddressInactiveAction;
    }

    @JsonProperty("AddressInactiveAction")
    public void setAddressInactiveAction(EmailServicesFunction_AddressInactiveActionEnum AddressInactiveAction) {
        this.AddressInactiveAction = AddressInactiveAction;
    }

    // AuthenticationFailureAction
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_AuthenticationFailureActionEnum AuthenticationFailureAction;

    @JsonProperty("AuthenticationFailureAction")
    public EmailServicesFunction_AuthenticationFailureActionEnum getAuthenticationFailureAction() {
        return this.AuthenticationFailureAction;
    }

    @JsonProperty("AuthenticationFailureAction")
    public void setAuthenticationFailureAction(EmailServicesFunction_AuthenticationFailureActionEnum AuthenticationFailureAction) {
        this.AuthenticationFailureAction = AuthenticationFailureAction;
    }

    // AuthorizationFailureAction
    @XStreamConverter(PicklistEnumConverter.class)
    private EmailServicesFunction_AuthorizationFailureActionEnum AuthorizationFailureAction;

    @JsonProperty("AuthorizationFailureAction")
    public EmailServicesFunction_AuthorizationFailureActionEnum getAuthorizationFailureAction() {
        return this.AuthorizationFailureAction;
    }

    @JsonProperty("AuthorizationFailureAction")
    public void setAuthorizationFailureAction(EmailServicesFunction_AuthorizationFailureActionEnum AuthorizationFailureAction) {
        this.AuthorizationFailureAction = AuthorizationFailureAction;
    }

    // IsErrorRoutingEnabled
    private Boolean IsErrorRoutingEnabled;

    @JsonProperty("IsErrorRoutingEnabled")
    public Boolean getIsErrorRoutingEnabled() {
        return this.IsErrorRoutingEnabled;
    }

    @JsonProperty("IsErrorRoutingEnabled")
    public void setIsErrorRoutingEnabled(Boolean IsErrorRoutingEnabled) {
        this.IsErrorRoutingEnabled = IsErrorRoutingEnabled;
    }

    // ErrorRoutingAddress
    private String ErrorRoutingAddress;

    @JsonProperty("ErrorRoutingAddress")
    public String getErrorRoutingAddress() {
        return this.ErrorRoutingAddress;
    }

    @JsonProperty("ErrorRoutingAddress")
    public void setErrorRoutingAddress(String ErrorRoutingAddress) {
        this.ErrorRoutingAddress = ErrorRoutingAddress;
    }

    // IsTextAttachmentsAsBinary
    private Boolean IsTextAttachmentsAsBinary;

    @JsonProperty("IsTextAttachmentsAsBinary")
    public Boolean getIsTextAttachmentsAsBinary() {
        return this.IsTextAttachmentsAsBinary;
    }

    @JsonProperty("IsTextAttachmentsAsBinary")
    public void setIsTextAttachmentsAsBinary(Boolean IsTextAttachmentsAsBinary) {
        this.IsTextAttachmentsAsBinary = IsTextAttachmentsAsBinary;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Service ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsActive", "Active", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("FunctionName", "Email Service Name", "string", "xsd:string", 64, false, false, true, false, false, false, true);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("AuthorizedSenders", "Accept Email From", "textarea", "xsd:string", 4000, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsAuthenticationRequired", "Advanced Email Security Settings", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsTlsRequired", "TLS Required", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("AttachmentOption", "Accept Attachments", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ApexClassId", "Class ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("OverLimitAction", "Over Email Rate Limit Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("FunctionInactiveAction", "Deactivated Email Service Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("AddressInactiveAction", "Deactivated Email Address Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("AuthenticationFailureAction", "Unauthenticated Sender Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("AuthorizationFailureAction", "Unauthorized Sender Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("IsErrorRoutingEnabled", "Enable Error Routing", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("ErrorRoutingAddress", "Route Error Emails to This Email Address", "email", "xsd:string", 270, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("IsTextAttachmentsAsBinary", "Convert Text Attachments to Binary Attachments", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField21);

        description.setLabelPlural("Email Services");
        description.setLabel("Email Service");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/EmailServicesFunction/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/EmailServicesFunction");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/EmailServicesFunction/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("EmailServicesFunction");

        return description;
    }
}