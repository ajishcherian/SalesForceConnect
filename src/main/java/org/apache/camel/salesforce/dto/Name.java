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
 * Salesforce DTO for SObject Name
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("Name")
public class Name extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // LastName
    private String LastName;

    @JsonProperty("LastName")
    public String getLastName() {
        return this.LastName;
    }

    @JsonProperty("LastName")
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    // FirstName
    private String FirstName;

    @JsonProperty("FirstName")
    public String getFirstName() {
        return this.FirstName;
    }

    @JsonProperty("FirstName")
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private Name_TypeEnum Type;

    @JsonProperty("Type")
    public Name_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(Name_TypeEnum Type) {
        this.Type = Type;
    }

    // Alias
    private String Alias;

    @JsonProperty("Alias")
    public String getAlias() {
        return this.Alias;
    }

    @JsonProperty("Alias")
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    // UserRoleId
    private String UserRoleId;

    @JsonProperty("UserRoleId")
    public String getUserRoleId() {
        return this.UserRoleId;
    }

    @JsonProperty("UserRoleId")
    public void setUserRoleId(String UserRoleId) {
        this.UserRoleId = UserRoleId;
    }

    // RecordTypeId
    private String RecordTypeId;

    @JsonProperty("RecordTypeId")
    public String getRecordTypeId() {
        return this.RecordTypeId;
    }

    @JsonProperty("RecordTypeId")
    public void setRecordTypeId(String RecordTypeId) {
        this.RecordTypeId = RecordTypeId;
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

    // ProfileId
    private String ProfileId;

    @JsonProperty("ProfileId")
    public String getProfileId() {
        return this.ProfileId;
    }

    @JsonProperty("ProfileId")
    public void setProfileId(String ProfileId) {
        this.ProfileId = ProfileId;
    }

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
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

    // Phone
    private String Phone;

    @JsonProperty("Phone")
    public String getPhone() {
        return this.Phone;
    }

    @JsonProperty("Phone")
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    // Username
    private String Username;

    @JsonProperty("Username")
    public String getUsername() {
        return this.Username;
    }

    @JsonProperty("Username")
    public void setUsername(String Username) {
        this.Username = Username;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Name", "string", "xsd:string", 255, false, true, true, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("LastName", "Last Name", "string", "xsd:string", 80, false, true, true, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("FirstName", "First Name", "string", "xsd:string", 40, false, true, true, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Type", "Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Alias", "Alias", "string", "xsd:string", 8, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("UserRoleId", "Role ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("RecordTypeId", "Record Type ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("IsActive", "Active", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ProfileId", "Profile ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("Title", "Title", "string", "xsd:string", 80, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Email", "Email", "email", "xsd:string", 80, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("Phone", "Phone", "phone", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("Username", "Username", "string", "xsd:string", 80, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("LastViewedDate", "Last Viewed Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LastReferencedDate", "Last Referenced Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);

        description.setLabelPlural("Names");
        description.setLabel("Name");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Name/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Name");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Name/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("Name");

        return description;
    }
}
