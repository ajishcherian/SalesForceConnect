/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.thoughtworks.xstream.annotations.XStreamAlias;

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
 * Salesforce DTO for SObject ClientBrowser
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ClientBrowser")
public class ClientBrowser extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // UsersId
    private String UsersId;

    @JsonProperty("UsersId")
    public String getUsersId() {
        return this.UsersId;
    }

    @JsonProperty("UsersId")
    public void setUsersId(String UsersId) {
        this.UsersId = UsersId;
    }

    // FullUserAgent
    private String FullUserAgent;

    @JsonProperty("FullUserAgent")
    public String getFullUserAgent() {
        return this.FullUserAgent;
    }

    @JsonProperty("FullUserAgent")
    public void setFullUserAgent(String FullUserAgent) {
        this.FullUserAgent = FullUserAgent;
    }

    // ProxyInfo
    private String ProxyInfo;

    @JsonProperty("ProxyInfo")
    public String getProxyInfo() {
        return this.ProxyInfo;
    }

    @JsonProperty("ProxyInfo")
    public void setProxyInfo(String ProxyInfo) {
        this.ProxyInfo = ProxyInfo;
    }

    // LastUpdate
    private java.time.ZonedDateTime LastUpdate;

    @JsonProperty("LastUpdate")
    public java.time.ZonedDateTime getLastUpdate() {
        return this.LastUpdate;
    }

    @JsonProperty("LastUpdate")
    public void setLastUpdate(java.time.ZonedDateTime LastUpdate) {
        this.LastUpdate = LastUpdate;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Client Browser ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("UsersId", "User ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("FullUserAgent", "Full User Agent", "string", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("ProxyInfo", "Proxy Info", "string", "xsd:string", 1024, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("LastUpdate", "Last Update", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);

        description.setLabelPlural("Client Browser");
        description.setLabel("Client Browser");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ClientBrowser/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ClientBrowser");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ClientBrowser/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ClientBrowser");

        return description;
    }
}