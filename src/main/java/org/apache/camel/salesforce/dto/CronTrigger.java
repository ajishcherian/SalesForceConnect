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
 * Salesforce DTO for SObject CronTrigger
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("CronTrigger")
public class CronTrigger extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // CronJobDetailId
    private String CronJobDetailId;

    @JsonProperty("CronJobDetailId")
    public String getCronJobDetailId() {
        return this.CronJobDetailId;
    }

    @JsonProperty("CronJobDetailId")
    public void setCronJobDetailId(String CronJobDetailId) {
        this.CronJobDetailId = CronJobDetailId;
    }

    // NextFireTime
    private java.time.ZonedDateTime NextFireTime;

    @JsonProperty("NextFireTime")
    public java.time.ZonedDateTime getNextFireTime() {
        return this.NextFireTime;
    }

    @JsonProperty("NextFireTime")
    public void setNextFireTime(java.time.ZonedDateTime NextFireTime) {
        this.NextFireTime = NextFireTime;
    }

    // PreviousFireTime
    private java.time.ZonedDateTime PreviousFireTime;

    @JsonProperty("PreviousFireTime")
    public java.time.ZonedDateTime getPreviousFireTime() {
        return this.PreviousFireTime;
    }

    @JsonProperty("PreviousFireTime")
    public void setPreviousFireTime(java.time.ZonedDateTime PreviousFireTime) {
        this.PreviousFireTime = PreviousFireTime;
    }

    // State
    private String State;

    @JsonProperty("State")
    public String getState() {
        return this.State;
    }

    @JsonProperty("State")
    public void setState(String State) {
        this.State = State;
    }

    // StartTime
    private java.time.ZonedDateTime StartTime;

    @JsonProperty("StartTime")
    public java.time.ZonedDateTime getStartTime() {
        return this.StartTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(java.time.ZonedDateTime StartTime) {
        this.StartTime = StartTime;
    }

    // EndTime
    private java.time.ZonedDateTime EndTime;

    @JsonProperty("EndTime")
    public java.time.ZonedDateTime getEndTime() {
        return this.EndTime;
    }

    @JsonProperty("EndTime")
    public void setEndTime(java.time.ZonedDateTime EndTime) {
        this.EndTime = EndTime;
    }

    // CronExpression
    private String CronExpression;

    @JsonProperty("CronExpression")
    public String getCronExpression() {
        return this.CronExpression;
    }

    @JsonProperty("CronExpression")
    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    // TimeZoneSidKey
    @XStreamConverter(PicklistEnumConverter.class)
    private CronTrigger_TimeZoneSidKeyEnum TimeZoneSidKey;

    @JsonProperty("TimeZoneSidKey")
    public CronTrigger_TimeZoneSidKeyEnum getTimeZoneSidKey() {
        return this.TimeZoneSidKey;
    }

    @JsonProperty("TimeZoneSidKey")
    public void setTimeZoneSidKey(CronTrigger_TimeZoneSidKeyEnum TimeZoneSidKey) {
        this.TimeZoneSidKey = TimeZoneSidKey;
    }

    // TimesTriggered
    private Integer TimesTriggered;

    @JsonProperty("TimesTriggered")
    public Integer getTimesTriggered() {
        return this.TimesTriggered;
    }

    @JsonProperty("TimesTriggered")
    public void setTimesTriggered(Integer TimesTriggered) {
        this.TimesTriggered = TimesTriggered;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Scheduled Job ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("CronJobDetailId", "Job ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("NextFireTime", "Next Run Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("PreviousFireTime", "Previous Run Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("State", "Job State", "string", "xsd:string", 16, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("StartTime", "Start Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("EndTime", "End Time", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("CronExpression", "Cron Expression", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("TimeZoneSidKey", "Java Time Zone Id", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("OwnerId", "User ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("TimesTriggered", "Job Fired Count", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);

        description.setLabelPlural("Scheduled Jobs");
        description.setLabel("Scheduled Jobs");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/CronTrigger/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/CronTrigger");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/CronTrigger/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("CronTrigger");

        return description;
    }
}
