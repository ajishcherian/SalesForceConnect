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
 * Salesforce DTO for SObject ProcessInstanceStep
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ProcessInstanceStep")
public class ProcessInstanceStep extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ProcessInstanceId
    private String ProcessInstanceId;

    @JsonProperty("ProcessInstanceId")
    public String getProcessInstanceId() {
        return this.ProcessInstanceId;
    }

    @JsonProperty("ProcessInstanceId")
    public void setProcessInstanceId(String ProcessInstanceId) {
        this.ProcessInstanceId = ProcessInstanceId;
    }

    // StepStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private ProcessInstanceStep_StepStatusEnum StepStatus;

    @JsonProperty("StepStatus")
    public ProcessInstanceStep_StepStatusEnum getStepStatus() {
        return this.StepStatus;
    }

    @JsonProperty("StepStatus")
    public void setStepStatus(ProcessInstanceStep_StepStatusEnum StepStatus) {
        this.StepStatus = StepStatus;
    }

    // OriginalActorId
    private String OriginalActorId;

    @JsonProperty("OriginalActorId")
    public String getOriginalActorId() {
        return this.OriginalActorId;
    }

    @JsonProperty("OriginalActorId")
    public void setOriginalActorId(String OriginalActorId) {
        this.OriginalActorId = OriginalActorId;
    }

    // ActorId
    private String ActorId;

    @JsonProperty("ActorId")
    public String getActorId() {
        return this.ActorId;
    }

    @JsonProperty("ActorId")
    public void setActorId(String ActorId) {
        this.ActorId = ActorId;
    }

    // Comments
    private String Comments;

    @JsonProperty("Comments")
    public String getComments() {
        return this.Comments;
    }

    @JsonProperty("Comments")
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    // StepNodeId
    private String StepNodeId;

    @JsonProperty("StepNodeId")
    public String getStepNodeId() {
        return this.StepNodeId;
    }

    @JsonProperty("StepNodeId")
    public void setStepNodeId(String StepNodeId) {
        this.StepNodeId = StepNodeId;
    }

    // ElapsedTimeInDays
    private Double ElapsedTimeInDays;

    @JsonProperty("ElapsedTimeInDays")
    public Double getElapsedTimeInDays() {
        return this.ElapsedTimeInDays;
    }

    @JsonProperty("ElapsedTimeInDays")
    public void setElapsedTimeInDays(Double ElapsedTimeInDays) {
        this.ElapsedTimeInDays = ElapsedTimeInDays;
    }

    // ElapsedTimeInHours
    private Double ElapsedTimeInHours;

    @JsonProperty("ElapsedTimeInHours")
    public Double getElapsedTimeInHours() {
        return this.ElapsedTimeInHours;
    }

    @JsonProperty("ElapsedTimeInHours")
    public void setElapsedTimeInHours(Double ElapsedTimeInHours) {
        this.ElapsedTimeInHours = ElapsedTimeInHours;
    }

    // ElapsedTimeInMinutes
    private Double ElapsedTimeInMinutes;

    @JsonProperty("ElapsedTimeInMinutes")
    public Double getElapsedTimeInMinutes() {
        return this.ElapsedTimeInMinutes;
    }

    @JsonProperty("ElapsedTimeInMinutes")
    public void setElapsedTimeInMinutes(Double ElapsedTimeInMinutes) {
        this.ElapsedTimeInMinutes = ElapsedTimeInMinutes;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Process Instance Step ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ProcessInstanceId", "Process Instance ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("StepStatus", "Step Status", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("OriginalActorId", "Original Actor ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("ActorId", "Actor ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Comments", "Comments", "string", "xsd:string", 4000, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("StepNodeId", "Process Node ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ElapsedTimeInDays", "Elapsed Time in Days", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ElapsedTimeInHours", "Elapsed Time in Hours", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ElapsedTimeInMinutes", "Elapsed Time in Minutes", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);

        description.setLabelPlural("Process Instance Step");
        description.setLabel("Process Instance Step");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ProcessInstanceStep/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ProcessInstanceStep");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ProcessInstanceStep/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ProcessInstanceStep");

        return description;
    }
}