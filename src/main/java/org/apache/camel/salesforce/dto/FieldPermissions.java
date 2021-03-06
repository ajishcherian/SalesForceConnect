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
 * Salesforce DTO for SObject FieldPermissions
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("FieldPermissions")
public class FieldPermissions extends AbstractDescribedSObjectBase {

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
    private FieldPermissions_SobjectTypeEnum SobjectType;

    @JsonProperty("SobjectType")
    public FieldPermissions_SobjectTypeEnum getSobjectType() {
        return this.SobjectType;
    }

    @JsonProperty("SobjectType")
    public void setSobjectType(FieldPermissions_SobjectTypeEnum SobjectType) {
        this.SobjectType = SobjectType;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private FieldPermissions_FieldEnum Field;

    @JsonProperty("Field")
    public FieldPermissions_FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(FieldPermissions_FieldEnum Field) {
        this.Field = Field;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Field Permissions ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ParentId", "Parent ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("SobjectType", "Sobject Type Name", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Field", "Field Name", "picklist", "xsd:string", 40, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("PermissionsEdit", "Edit Field", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("PermissionsRead", "Read Field", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);

        description.setLabelPlural("Field Permissions");
        description.setLabel("Field Permissions");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/FieldPermissions/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/FieldPermissions");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/FieldPermissions/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("FieldPermissions");

        return description;
    }
}
