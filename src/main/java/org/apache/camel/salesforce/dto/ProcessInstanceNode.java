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
 * Salesforce DTO for SObject ProcessInstanceNode
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("ProcessInstanceNode")
public class ProcessInstanceNode extends AbstractDescribedSObjectBase {

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

    // ProcessNodeId
    private String ProcessNodeId;

    @JsonProperty("ProcessNodeId")
    public String getProcessNodeId() {
        return this.ProcessNodeId;
    }

    @JsonProperty("ProcessNodeId")
    public void setProcessNodeId(String ProcessNodeId) {
        this.ProcessNodeId = ProcessNodeId;
    }

    // NodeStatus
    @XStreamConverter(PicklistEnumConverter.class)
    private ProcessInstanceNode_NodeStatusEnum NodeStatus;

    @JsonProperty("NodeStatus")
    public ProcessInstanceNode_NodeStatusEnum getNodeStatus() {
        return this.NodeStatus;
    }

    @JsonProperty("NodeStatus")
    public void setNodeStatus(ProcessInstanceNode_NodeStatusEnum NodeStatus) {
        this.NodeStatus = NodeStatus;
    }

    // CompletedDate
    private java.time.ZonedDateTime CompletedDate;

    @JsonProperty("CompletedDate")
    public java.time.ZonedDateTime getCompletedDate() {
        return this.CompletedDate;
    }

    @JsonProperty("CompletedDate")
    public void setCompletedDate(java.time.ZonedDateTime CompletedDate) {
        this.CompletedDate = CompletedDate;
    }

    // LastActorId
    private String LastActorId;

    @JsonProperty("LastActorId")
    public String getLastActorId() {
        return this.LastActorId;
    }

    @JsonProperty("LastActorId")
    public void setLastActorId(String LastActorId) {
        this.LastActorId = LastActorId;
    }

    // ProcessNodeName
    private String ProcessNodeName;

    @JsonProperty("ProcessNodeName")
    public String getProcessNodeName() {
        return this.ProcessNodeName;
    }

    @JsonProperty("ProcessNodeName")
    public void setProcessNodeName(String ProcessNodeName) {
        this.ProcessNodeName = ProcessNodeName;
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

        final SObjectField sObjectField1 = createField("Id", "Process Instance Node ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("ProcessInstanceId", "Process Instance ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ProcessNodeId", "Process Node ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("NodeStatus", "Node Status", "picklist", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("CompletedDate", "Completed Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("LastActorId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("ProcessNodeName", "Name", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("ElapsedTimeInDays", "Elapsed Time in Days", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("ElapsedTimeInHours", "Elapsed Time in Hours", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("ElapsedTimeInMinutes", "Elapsed Time in Minutes", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);

        description.setLabelPlural("Process Instance Node");
        description.setLabel("Process Instance Node");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/ProcessInstanceNode/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/ProcessInstanceNode");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/ProcessInstanceNode/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("ProcessInstanceNode");

        return description;
    }
}