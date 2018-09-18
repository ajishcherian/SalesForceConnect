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
 * Salesforce DTO for SObject AuthProvider
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("AuthProvider")
public class AuthProvider extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ProviderType
    @XStreamConverter(PicklistEnumConverter.class)
    private AuthProvider_ProviderTypeEnum ProviderType;

    @JsonProperty("ProviderType")
    public AuthProvider_ProviderTypeEnum getProviderType() {
        return this.ProviderType;
    }

    @JsonProperty("ProviderType")
    public void setProviderType(AuthProvider_ProviderTypeEnum ProviderType) {
        this.ProviderType = ProviderType;
    }

    // FriendlyName
    private String FriendlyName;

    @JsonProperty("FriendlyName")
    public String getFriendlyName() {
        return this.FriendlyName;
    }

    @JsonProperty("FriendlyName")
    public void setFriendlyName(String FriendlyName) {
        this.FriendlyName = FriendlyName;
    }

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

    // RegistrationHandlerId
    private String RegistrationHandlerId;

    @JsonProperty("RegistrationHandlerId")
    public String getRegistrationHandlerId() {
        return this.RegistrationHandlerId;
    }

    @JsonProperty("RegistrationHandlerId")
    public void setRegistrationHandlerId(String RegistrationHandlerId) {
        this.RegistrationHandlerId = RegistrationHandlerId;
    }

    // ExecutionUserId
    private String ExecutionUserId;

    @JsonProperty("ExecutionUserId")
    public String getExecutionUserId() {
        return this.ExecutionUserId;
    }

    @JsonProperty("ExecutionUserId")
    public void setExecutionUserId(String ExecutionUserId) {
        this.ExecutionUserId = ExecutionUserId;
    }

    // ConsumerKey
    private String ConsumerKey;

    @JsonProperty("ConsumerKey")
    public String getConsumerKey() {
        return this.ConsumerKey;
    }

    @JsonProperty("ConsumerKey")
    public void setConsumerKey(String ConsumerKey) {
        this.ConsumerKey = ConsumerKey;
    }

    // ConsumerSecret
    private String ConsumerSecret;

    @JsonProperty("ConsumerSecret")
    public String getConsumerSecret() {
        return this.ConsumerSecret;
    }

    @JsonProperty("ConsumerSecret")
    public void setConsumerSecret(String ConsumerSecret) {
        this.ConsumerSecret = ConsumerSecret;
    }

    // ErrorUrl
    private String ErrorUrl;

    @JsonProperty("ErrorUrl")
    public String getErrorUrl() {
        return this.ErrorUrl;
    }

    @JsonProperty("ErrorUrl")
    public void setErrorUrl(String ErrorUrl) {
        this.ErrorUrl = ErrorUrl;
    }

    // AuthorizeUrl
    private String AuthorizeUrl;

    @JsonProperty("AuthorizeUrl")
    public String getAuthorizeUrl() {
        return this.AuthorizeUrl;
    }

    @JsonProperty("AuthorizeUrl")
    public void setAuthorizeUrl(String AuthorizeUrl) {
        this.AuthorizeUrl = AuthorizeUrl;
    }

    // TokenUrl
    private String TokenUrl;

    @JsonProperty("TokenUrl")
    public String getTokenUrl() {
        return this.TokenUrl;
    }

    @JsonProperty("TokenUrl")
    public void setTokenUrl(String TokenUrl) {
        this.TokenUrl = TokenUrl;
    }

    // UserInfoUrl
    private String UserInfoUrl;

    @JsonProperty("UserInfoUrl")
    public String getUserInfoUrl() {
        return this.UserInfoUrl;
    }

    @JsonProperty("UserInfoUrl")
    public void setUserInfoUrl(String UserInfoUrl) {
        this.UserInfoUrl = UserInfoUrl;
    }

    // DefaultScopes
    private String DefaultScopes;

    @JsonProperty("DefaultScopes")
    public String getDefaultScopes() {
        return this.DefaultScopes;
    }

    @JsonProperty("DefaultScopes")
    public void setDefaultScopes(String DefaultScopes) {
        this.DefaultScopes = DefaultScopes;
    }

    // IdTokenIssuer
    private String IdTokenIssuer;

    @JsonProperty("IdTokenIssuer")
    public String getIdTokenIssuer() {
        return this.IdTokenIssuer;
    }

    @JsonProperty("IdTokenIssuer")
    public void setIdTokenIssuer(String IdTokenIssuer) {
        this.IdTokenIssuer = IdTokenIssuer;
    }

    // OptionsSendAccessTokenInHeader
    private Boolean OptionsSendAccessTokenInHeader;

    @JsonProperty("OptionsSendAccessTokenInHeader")
    public Boolean getOptionsSendAccessTokenInHeader() {
        return this.OptionsSendAccessTokenInHeader;
    }

    @JsonProperty("OptionsSendAccessTokenInHeader")
    public void setOptionsSendAccessTokenInHeader(Boolean OptionsSendAccessTokenInHeader) {
        this.OptionsSendAccessTokenInHeader = OptionsSendAccessTokenInHeader;
    }

    // OptionsSendClientCredentialsInHeader
    private Boolean OptionsSendClientCredentialsInHeader;

    @JsonProperty("OptionsSendClientCredentialsInHeader")
    public Boolean getOptionsSendClientCredentialsInHeader() {
        return this.OptionsSendClientCredentialsInHeader;
    }

    @JsonProperty("OptionsSendClientCredentialsInHeader")
    public void setOptionsSendClientCredentialsInHeader(Boolean OptionsSendClientCredentialsInHeader) {
        this.OptionsSendClientCredentialsInHeader = OptionsSendClientCredentialsInHeader;
    }

    // OptionsIncludeOrgIdInId
    private Boolean OptionsIncludeOrgIdInId;

    @JsonProperty("OptionsIncludeOrgIdInId")
    public Boolean getOptionsIncludeOrgIdInId() {
        return this.OptionsIncludeOrgIdInId;
    }

    @JsonProperty("OptionsIncludeOrgIdInId")
    public void setOptionsIncludeOrgIdInId(Boolean OptionsIncludeOrgIdInId) {
        this.OptionsIncludeOrgIdInId = OptionsIncludeOrgIdInId;
    }

    // IconUrl
    private String IconUrl;

    @JsonProperty("IconUrl")
    public String getIconUrl() {
        return this.IconUrl;
    }

    @JsonProperty("IconUrl")
    public void setIconUrl(String IconUrl) {
        this.IconUrl = IconUrl;
    }

    // LogoutUrl
    private String LogoutUrl;

    @JsonProperty("LogoutUrl")
    public String getLogoutUrl() {
        return this.LogoutUrl;
    }

    @JsonProperty("LogoutUrl")
    public void setLogoutUrl(String LogoutUrl) {
        this.LogoutUrl = LogoutUrl;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Auth. Provider ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("ProviderType", "Provider Type", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("FriendlyName", "Name", "string", "xsd:string", 32, false, false, true, false, false, false, true);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("DeveloperName", "URL Suffix", "string", "xsd:string", 32, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("RegistrationHandlerId", "Class ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ExecutionUserId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ConsumerKey", "Consumer Key", "string", "xsd:string", 256, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ConsumerSecret", "Consumer Secret", "string", "xsd:string", 100, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ErrorUrl", "Custom Error URL", "string", "xsd:string", 500, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("AuthorizeUrl", "Authorize Endpoint URL", "url", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("TokenUrl", "Token Endpoint URL", "url", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("UserInfoUrl", "User Info Endpoint URL", "url", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("DefaultScopes", "Default Scopes", "string", "xsd:string", 256, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("IdTokenIssuer", "Token Issuer", "string", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("OptionsSendAccessTokenInHeader", "Send access token in header", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("OptionsSendClientCredentialsInHeader", "Send client credentials in header", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("OptionsIncludeOrgIdInId", "Include identity organization's organization ID for third-party account linkage", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IconUrl", "Icon URL", "url", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("LogoutUrl", "Custom Logout URL", "url", "xsd:string", 1500, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);

        description.setLabelPlural("Auth. Providers");
        description.setLabel("Auth. Provider");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/AuthProvider/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/AuthProvider");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/AuthProvider/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("AuthProvider");

        return description;
    }
}
