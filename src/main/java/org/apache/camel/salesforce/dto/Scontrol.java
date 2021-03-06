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
 * Salesforce DTO for SObject Scontrol
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("Scontrol")
public class Scontrol extends AbstractDescribedSObjectBase {

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

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

    // EncodingKey
    @XStreamConverter(PicklistEnumConverter.class)
    private Scontrol_EncodingKeyEnum EncodingKey;

    @JsonProperty("EncodingKey")
    public Scontrol_EncodingKeyEnum getEncodingKey() {
        return this.EncodingKey;
    }

    @JsonProperty("EncodingKey")
    public void setEncodingKey(Scontrol_EncodingKeyEnum EncodingKey) {
        this.EncodingKey = EncodingKey;
    }

    // HtmlWrapper
    private String HtmlWrapper;

    @JsonProperty("HtmlWrapper")
    public String getHtmlWrapper() {
        return this.HtmlWrapper;
    }

    @JsonProperty("HtmlWrapper")
    public void setHtmlWrapper(String HtmlWrapper) {
        this.HtmlWrapper = HtmlWrapper;
    }

    // Filename
    private String Filename;

    @JsonProperty("Filename")
    public String getFilename() {
        return this.Filename;
    }

    @JsonProperty("Filename")
    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    // BodyLength
    private Integer BodyLength;

    @JsonProperty("BodyLength")
    public Integer getBodyLength() {
        return this.BodyLength;
    }

    @JsonProperty("BodyLength")
    public void setBodyLength(Integer BodyLength) {
        this.BodyLength = BodyLength;
    }

    // Binary
    // blob field url, use getBlobField to get the content
    @XStreamAlias("Binary")
    private String BinaryUrl;

    @JsonProperty("Binary")
    public String getBinaryUrl() {
        return this.BinaryUrl;
    }

    @JsonProperty("Binary")
    public void setBinaryUrl(String BinaryUrl) {
        this.BinaryUrl = BinaryUrl;
    }

    // ContentSource
    @XStreamConverter(PicklistEnumConverter.class)
    private Scontrol_ContentSourceEnum ContentSource;

    @JsonProperty("ContentSource")
    public Scontrol_ContentSourceEnum getContentSource() {
        return this.ContentSource;
    }

    @JsonProperty("ContentSource")
    public void setContentSource(Scontrol_ContentSourceEnum ContentSource) {
        this.ContentSource = ContentSource;
    }

    // SupportsCaching
    private Boolean SupportsCaching;

    @JsonProperty("SupportsCaching")
    public Boolean getSupportsCaching() {
        return this.SupportsCaching;
    }

    @JsonProperty("SupportsCaching")
    public void setSupportsCaching(Boolean SupportsCaching) {
        this.SupportsCaching = SupportsCaching;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Custom S-Control ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Label", "string", "xsd:string", 80, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("DeveloperName", "S-Control Name", "string", "xsd:string", 80, false, false, true, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Description", "Description", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("EncodingKey", "Encoding", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("HtmlWrapper", "HTML Body", "textarea", "xsd:string", 1048576, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Filename", "Filename", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("BodyLength", "Binary Length", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Binary", "Binary", "base64", "xsd:base64Binary", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ContentSource", "Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("SupportsCaching", "Prebuild In Page", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("NamespacePrefix", "Namespace Prefix", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);

        description.setLabelPlural("Custom S-Controls");
        description.setLabel("Custom S-Control");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Scontrol/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Scontrol");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Scontrol/{ID}");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/01N/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("Scontrol");

        return description;
    }
}
