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
 * Salesforce DTO for SObject NamedCredential
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("NamedCredential")
public class NamedCredential extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // DeveloperName
    private String DeveloperName;

    @JsonProperty("DeveloperName")
    public String getDeveloperName() {
        return this.DeveloperName;
    }

    @JsonProperty("DeveloperName")
    public void setDeveloperName(String DeveloperName) {
        this.DeveloperName = DeveloperName;
    }

    // Language
    @XStreamConverter(PicklistEnumConverter.class)
    private NamedCredential_LanguageEnum Language;

    @JsonProperty("Language")
    public NamedCredential_LanguageEnum getLanguage() {
        return this.Language;
    }

    @JsonProperty("Language")
    public void setLanguage(NamedCredential_LanguageEnum Language) {
        this.Language = Language;
    }

    // MasterLabel
    private String MasterLabel;

    @JsonProperty("MasterLabel")
    public String getMasterLabel() {
        return this.MasterLabel;
    }

    @JsonProperty("MasterLabel")
    public void setMasterLabel(String MasterLabel) {
        this.MasterLabel = MasterLabel;
    }

    // NamespacePrefix
    private String NamespacePrefix;

    @JsonProperty("NamespacePrefix")
    public String getNamespacePrefix() {
        return this.NamespacePrefix;
    }

    @JsonProperty("NamespacePrefix")
    public void setNamespacePrefix(String NamespacePrefix) {
        this.NamespacePrefix = NamespacePrefix;
    }

    // Endpoint
    private String Endpoint;

    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return this.Endpoint;
    }

    @JsonProperty("Endpoint")
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    // PrincipalType
    @XStreamConverter(PicklistEnumConverter.class)
    private NamedCredential_PrincipalTypeEnum PrincipalType;

    @JsonProperty("PrincipalType")
    public NamedCredential_PrincipalTypeEnum getPrincipalType() {
        return this.PrincipalType;
    }

    @JsonProperty("PrincipalType")
    public void setPrincipalType(NamedCredential_PrincipalTypeEnum PrincipalType) {
        this.PrincipalType = PrincipalType;
    }

    // AuthProviderId
    private String AuthProviderId;

    @JsonProperty("AuthProviderId")
    public String getAuthProviderId() {
        return this.AuthProviderId;
    }

    @JsonProperty("AuthProviderId")
    public void setAuthProviderId(String AuthProviderId) {
        this.AuthProviderId = AuthProviderId;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Named Credential ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("DeveloperName", "Name", "string", "xsd:string", 80, false, false, true, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Language", "Master Language", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("MasterLabel", "Label", "string", "xsd:string", 80, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("NamespacePrefix", "Namespace Prefix", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Endpoint", "URL", "textarea", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("PrincipalType", "Identity Type", "picklist", "xsd:string", 255, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("AuthProviderId", "Auth. Provider ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);

        description.setLabelPlural("Named Credentials");
        description.setLabel("Named Credential");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/NamedCredential/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/NamedCredential");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/NamedCredential/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("NamedCredential");

        return description;
    }
}