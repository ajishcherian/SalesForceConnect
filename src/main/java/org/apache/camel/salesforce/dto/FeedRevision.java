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
 * Salesforce DTO for SObject FeedRevision
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("FeedRevision")
public class FeedRevision extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // FeedEntityId
    private String FeedEntityId;

    @JsonProperty("FeedEntityId")
    public String getFeedEntityId() {
        return this.FeedEntityId;
    }

    @JsonProperty("FeedEntityId")
    public void setFeedEntityId(String FeedEntityId) {
        this.FeedEntityId = FeedEntityId;
    }

    // Revision
    private Integer Revision;

    @JsonProperty("Revision")
    public Integer getRevision() {
        return this.Revision;
    }

    @JsonProperty("Revision")
    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    // Action
    @XStreamConverter(PicklistEnumConverter.class)
    private FeedRevision_ActionEnum Action;

    @JsonProperty("Action")
    public FeedRevision_ActionEnum getAction() {
        return this.Action;
    }

    @JsonProperty("Action")
    public void setAction(FeedRevision_ActionEnum Action) {
        this.Action = Action;
    }

    // EditedAttribute
    @XStreamConverter(PicklistEnumConverter.class)
    private FeedRevision_EditedAttributeEnum EditedAttribute;

    @JsonProperty("EditedAttribute")
    public FeedRevision_EditedAttributeEnum getEditedAttribute() {
        return this.EditedAttribute;
    }

    @JsonProperty("EditedAttribute")
    public void setEditedAttribute(FeedRevision_EditedAttributeEnum EditedAttribute) {
        this.EditedAttribute = EditedAttribute;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Feed Revision ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("FeedEntityId", "Feed Entity ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Revision", "Revision", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("Action", "Action", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("EditedAttribute", "Edited Attribute", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Value", "Value", "textarea", "xsd:string", 10000, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);

        description.setLabelPlural("Feed Revisions");
        description.setLabel("Feed Revision");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/FeedRevision/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/FeedRevision");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/FeedRevision/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("FeedRevision");

        return description;
    }
}
