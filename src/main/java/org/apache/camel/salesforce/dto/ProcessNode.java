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
 * Salesforce DTO for SObject ProcessNode
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ProcessNode")
public class ProcessNode extends AbstractDescribedSObjectBase {

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

    // ProcessDefinitionId
    private String ProcessDefinitionId;

    @JsonProperty("ProcessDefinitionId")
    public String getProcessDefinitionId() {
        return this.ProcessDefinitionId;
    }

    @JsonProperty("ProcessDefinitionId")
    public void setProcessDefinitionId(String ProcessDefinitionId) {
        this.ProcessDefinitionId = ProcessDefinitionId;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Process Node ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("Name", "Name", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("DeveloperName", "Unique Name", "string", "xsd:string", 80, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("ProcessDefinitionId", "Approval Process ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Description", "Description", "textarea", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);

        description.setLabelPlural("Process Node");
        description.setLabel("Process Node");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ProcessNode/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ProcessNode");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ProcessNode/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ProcessNode");

        return description;
    }
}
