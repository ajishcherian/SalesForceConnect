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
 * Salesforce DTO for SObject ProcessInstanceHistory
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ProcessInstanceHistory")
public class ProcessInstanceHistory extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // IsPending
    private Boolean IsPending;

    @JsonProperty("IsPending")
    public Boolean getIsPending() {
        return this.IsPending;
    }

    @JsonProperty("IsPending")
    public void setIsPending(Boolean IsPending) {
        this.IsPending = IsPending;
    }

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

    // TargetObjectId
    private String TargetObjectId;

    @JsonProperty("TargetObjectId")
    public String getTargetObjectId() {
        return this.TargetObjectId;
    }

    @JsonProperty("TargetObjectId")
    public void setTargetObjectId(String TargetObjectId) {
        this.TargetObjectId = TargetObjectId;
    }

    // StepStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private ProcessInstanceHistory_StepStatusEnum StepStatus;

    @JsonProperty("StepStatus")
    public ProcessInstanceHistory_StepStatusEnum getStepStatus() {
        return this.StepStatus;
    }

    @JsonProperty("StepStatus")
    public void setStepStatus(ProcessInstanceHistory_StepStatusEnum StepStatus) {
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

    // RemindersSent
    private Integer RemindersSent;

    @JsonProperty("RemindersSent")
    public Integer getRemindersSent() {
        return this.RemindersSent;
    }

    @JsonProperty("RemindersSent")
    public void setRemindersSent(Integer RemindersSent) {
        this.RemindersSent = RemindersSent;
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


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Process Instance History ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsPending", "Is Pending", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("ProcessInstanceId", "Process Instance ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("TargetObjectId", "Target Object ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("StepStatus", "Status", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("OriginalActorId", "Original Actor ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("ActorId", "Actor ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("RemindersSent", "RemindersSent", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ElapsedTimeInDays", "Elapsed Time in Days", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("ElapsedTimeInHours", "Elapsed Time in Hours", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ElapsedTimeInMinutes", "Elapsed Time in Minutes", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Comments", "Comments", "string", "xsd:string", 4000, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);

        description.setLabelPlural("Process Instance History");
        description.setLabel("Process Instance History");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ProcessInstanceHistory/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ProcessInstanceHistory");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ProcessInstanceHistory/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ProcessInstanceHistory");

        return description;
    }
}