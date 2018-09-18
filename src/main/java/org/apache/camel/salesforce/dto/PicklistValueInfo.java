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
 * Salesforce DTO for SObject PicklistValueInfo
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("PicklistValueInfo")
public class PicklistValueInfo extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // DurableId
    private String DurableId;

    @JsonProperty("DurableId")
    public String getDurableId() {
        return this.DurableId;
    }

    @JsonProperty("DurableId")
    public void setDurableId(String DurableId) {
        this.DurableId = DurableId;
    }

    // Value
    private String Value;

    @JsonProperty("Value")
    public String getValue() {
        return this.Value;
    }

    @JsonProperty("Value")
    public void setValue(String Value) {
        this.Value = Value;
    }

    // Label
    private String Label;

    @JsonProperty("Label")
    public String getLabel() {
        return this.Label;
    }

    @JsonProperty("Label")
    public void setLabel(String Label) {
        this.Label = Label;
    }

    // IsDefaultValue
    private Boolean IsDefaultValue;

    @JsonProperty("IsDefaultValue")
    public Boolean getIsDefaultValue() {
        return this.IsDefaultValue;
    }

    @JsonProperty("IsDefaultValue")
    public void setIsDefaultValue(Boolean IsDefaultValue) {
        this.IsDefaultValue = IsDefaultValue;
    }

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

    // ValidFor
    private String ValidFor;

    @JsonProperty("ValidFor")
    public String getValidFor() {
        return this.ValidFor;
    }

    @JsonProperty("ValidFor")
    public void setValidFor(String ValidFor) {
        this.ValidFor = ValidFor;
    }

    // EntityParticleId
    private String EntityParticleId;

    @JsonProperty("EntityParticleId")
    public String getEntityParticleId() {
        return this.EntityParticleId;
    }

    @JsonProperty("EntityParticleId")
    public void setEntityParticleId(String EntityParticleId) {
        this.EntityParticleId = EntityParticleId;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Picklist Value Info ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("DurableId", "Durable ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Value", "Value", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Label", "Label", "string", "xsd:string", 70, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsDefaultValue", "Is Default Value", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsActive", "Is Active", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ValidFor", "Valid For", "string", "xsd:string", 200, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("EntityParticleId", "Entity Particle ID", "string", "xsd:string", 150, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);

        description.setLabelPlural("Picklist Value Info");
        description.setLabel("Picklist Value Info");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/PicklistValueInfo/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/PicklistValueInfo");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/PicklistValueInfo/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("PicklistValueInfo");

        return description;
    }
}