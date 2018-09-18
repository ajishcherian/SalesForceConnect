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
 * Salesforce DTO for SObject Group
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("Group")
public class Group extends AbstractDescribedSObjectBase {

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

    // RelatedId
    private String RelatedId;

    @JsonProperty("RelatedId")
    public String getRelatedId() {
        return this.RelatedId;
    }

    @JsonProperty("RelatedId")
    public void setRelatedId(String RelatedId) {
        this.RelatedId = RelatedId;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private Group_TypeEnum Type;

    @JsonProperty("Type")
    public Group_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(Group_TypeEnum Type) {
        this.Type = Type;
    }

    // Email
    private String Email;

    @JsonProperty("Email")
    public String getEmail() {
        return this.Email;
    }

    @JsonProperty("Email")
    public void setEmail(String Email) {
        this.Email = Email;
    }

    // DoesSendEmailToMembers
    private Boolean DoesSendEmailToMembers;

    @JsonProperty("DoesSendEmailToMembers")
    public Boolean getDoesSendEmailToMembers() {
        return this.DoesSendEmailToMembers;
    }

    @JsonProperty("DoesSendEmailToMembers")
    public void setDoesSendEmailToMembers(Boolean DoesSendEmailToMembers) {
        this.DoesSendEmailToMembers = DoesSendEmailToMembers;
    }

    // DoesIncludeBosses
    private Boolean DoesIncludeBosses;

    @JsonProperty("DoesIncludeBosses")
    public Boolean getDoesIncludeBosses() {
        return this.DoesIncludeBosses;
    }

    @JsonProperty("DoesIncludeBosses")
    public void setDoesIncludeBosses(Boolean DoesIncludeBosses) {
        this.DoesIncludeBosses = DoesIncludeBosses;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Group ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Name", "string", "xsd:string", 40, false, false, true, false, false, false, true);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("DeveloperName", "Developer Name", "string", "xsd:string", 80, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("RelatedId", "Related ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Type", "Type", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Email", "Email", "email", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("DoesSendEmailToMembers", "Send Email to Members", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("DoesIncludeBosses", "Include Bosses", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
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

        description.setLabelPlural("Group");
        description.setLabel("Group");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Group/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Group");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Group/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("Group");

        return description;
    }
}