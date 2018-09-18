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
 * Salesforce DTO for SObject ObjectPermissions
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ObjectPermissions")
public class ObjectPermissions extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    // SobjectType
    @XStreamConverter(PicklistEnumConverter.class)
    private ObjectPermissions_SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public ObjectPermissions_SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(ObjectPermissions_SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

    // PermissionsCreate
    private Boolean PermissionsCreate;

    @JsonProperty("PermissionsCreate")
    public Boolean getPermissionsCreate() {
        return this.PermissionsCreate;
    }

    @JsonProperty("PermissionsCreate")
    public void setPermissionsCreate(Boolean PermissionsCreate) {
        this.PermissionsCreate = PermissionsCreate;
    }

    // PermissionsRead
    private Boolean PermissionsRead;

    @JsonProperty("PermissionsRead")
    public Boolean getPermissionsRead() {
        return this.PermissionsRead;
    }

    @JsonProperty("PermissionsRead")
    public void setPermissionsRead(Boolean PermissionsRead) {
        this.PermissionsRead = PermissionsRead;
    }

    // PermissionsEdit
    private Boolean PermissionsEdit;

    @JsonProperty("PermissionsEdit")
    public Boolean getPermissionsEdit() {
        return this.PermissionsEdit;
    }

    @JsonProperty("PermissionsEdit")
    public void setPermissionsEdit(Boolean PermissionsEdit) {
        this.PermissionsEdit = PermissionsEdit;
    }

    // PermissionsDelete
    private Boolean PermissionsDelete;

    @JsonProperty("PermissionsDelete")
    public Boolean getPermissionsDelete() {
        return this.PermissionsDelete;
    }

    @JsonProperty("PermissionsDelete")
    public void setPermissionsDelete(Boolean PermissionsDelete) {
        this.PermissionsDelete = PermissionsDelete;
    }

    // PermissionsViewAllRecords
    private Boolean PermissionsViewAllRecords;

    @JsonProperty("PermissionsViewAllRecords")
    public Boolean getPermissionsViewAllRecords() {
        return this.PermissionsViewAllRecords;
    }

    @JsonProperty("PermissionsViewAllRecords")
    public void setPermissionsViewAllRecords(Boolean PermissionsViewAllRecords) {
        this.PermissionsViewAllRecords = PermissionsViewAllRecords;
    }

    // PermissionsModifyAllRecords
    private Boolean PermissionsModifyAllRecords;

    @JsonProperty("PermissionsModifyAllRecords")
    public Boolean getPermissionsModifyAllRecords() {
        return this.PermissionsModifyAllRecords;
    }

    @JsonProperty("PermissionsModifyAllRecords")
    public void setPermissionsModifyAllRecords(Boolean PermissionsModifyAllRecords) {
        this.PermissionsModifyAllRecords = PermissionsModifyAllRecords;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "ObjectPermissions ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ParentId", "Parent ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("SobjectType", "Sobject Type Name", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("PermissionsCreate", "Create Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("PermissionsRead", "Read Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("PermissionsEdit", "Edit Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("PermissionsDelete", "Delete Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("PermissionsViewAllRecords", "Read All Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("PermissionsModifyAllRecords", "Edit All Records", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
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

        description.setLabelPlural("Object Permissions");
        description.setLabel("Object Permissions");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ObjectPermissions/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ObjectPermissions");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ObjectPermissions/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ObjectPermissions");

        return description;
    }
}