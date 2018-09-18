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
 * Salesforce DTO for SObject ApexComponent
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ApexComponent")
public class ApexComponent extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

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

    // ApiVersion
    private Double ApiVersion;

    @JsonProperty("ApiVersion")
    public Double getApiVersion() {
        return this.ApiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(Double ApiVersion) {
        this.ApiVersion = ApiVersion;
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

    // ControllerType
    @XStreamConverter(PicklistEnumConverter.class)
    private ApexComponent_ControllerTypeEnum ControllerType;

    @JsonProperty("ControllerType")
    public ApexComponent_ControllerTypeEnum getControllerType() {
        return this.ControllerType;
    }

    @JsonProperty("ControllerType")
    public void setControllerType(ApexComponent_ControllerTypeEnum ControllerType) {
        this.ControllerType = ControllerType;
    }

    // ControllerKey
    private String ControllerKey;

    @JsonProperty("ControllerKey")
    public String getControllerKey() {
        return this.ControllerKey;
    }

    @JsonProperty("ControllerKey")
    public void setControllerKey(String ControllerKey) {
        this.ControllerKey = ControllerKey;
    }

    // Markup
    private String Markup;

    @JsonProperty("Markup")
    public String getMarkup() {
        return this.Markup;
    }

    @JsonProperty("Markup")
    public void setMarkup(String Markup) {
        this.Markup = Markup;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Component ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("NamespacePrefix", "Namespace Prefix", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Name", "Name", "string", "xsd:string", 80, false, false, true, false, false, false, true);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("ApiVersion", "Api Version", "double", "xsd:double", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("MasterLabel", "Label", "string", "xsd:string", 80, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Description", "Description", "textarea", "xsd:string", 4000, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ControllerType", "Controller Type", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ControllerKey", "Controller Key", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Markup", "Markup", "textarea", "xsd:string", 1048576, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);

        description.setLabelPlural("Visualforce Components");
        description.setLabel("Visualforce Component");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ApexComponent/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ApexComponent");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ApexComponent/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ApexComponent");

        return description;
    }
}