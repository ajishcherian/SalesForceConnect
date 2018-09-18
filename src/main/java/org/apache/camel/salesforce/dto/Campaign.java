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
 * Salesforce DTO for SObject Campaign
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("Campaign")
public class Campaign extends AbstractDescribedSObjectBase {

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

    // Type
    @XStreamConverter(PicklistEnumConverter.class)
    private Campaign_TypeEnum Type;

    @JsonProperty("Type")
    public Campaign_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(Campaign_TypeEnum Type) {
        this.Type = Type;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private Campaign_StatusEnum Status;

    @JsonProperty("Status")
    public Campaign_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(Campaign_StatusEnum Status) {
        this.Status = Status;
    }

    // StartDate
    private java.time.LocalDate StartDate;

    @JsonProperty("StartDate")
    public java.time.LocalDate getStartDate() {
        return this.StartDate;
    }

    @JsonProperty("StartDate")
    public void setStartDate(java.time.LocalDate StartDate) {
        this.StartDate = StartDate;
    }

    // EndDate
    private java.time.LocalDate EndDate;

    @JsonProperty("EndDate")
    public java.time.LocalDate getEndDate() {
        return this.EndDate;
    }

    @JsonProperty("EndDate")
    public void setEndDate(java.time.LocalDate EndDate) {
        this.EndDate = EndDate;
    }

    // ExpectedRevenue
    private Double ExpectedRevenue;

    @JsonProperty("ExpectedRevenue")
    public Double getExpectedRevenue() {
        return this.ExpectedRevenue;
    }

    @JsonProperty("ExpectedRevenue")
    public void setExpectedRevenue(Double ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    // BudgetedCost
    private Double BudgetedCost;

    @JsonProperty("BudgetedCost")
    public Double getBudgetedCost() {
        return this.BudgetedCost;
    }

    @JsonProperty("BudgetedCost")
    public void setBudgetedCost(Double BudgetedCost) {
        this.BudgetedCost = BudgetedCost;
    }

    // ActualCost
    private Double ActualCost;

    @JsonProperty("ActualCost")
    public Double getActualCost() {
        return this.ActualCost;
    }

    @JsonProperty("ActualCost")
    public void setActualCost(Double ActualCost) {
        this.ActualCost = ActualCost;
    }

    // ExpectedResponse
    private Double ExpectedResponse;

    @JsonProperty("ExpectedResponse")
    public Double getExpectedResponse() {
        return this.ExpectedResponse;
    }

    @JsonProperty("ExpectedResponse")
    public void setExpectedResponse(Double ExpectedResponse) {
        this.ExpectedResponse = ExpectedResponse;
    }

    // NumberSent
    private Double NumberSent;

    @JsonProperty("NumberSent")
    public Double getNumberSent() {
        return this.NumberSent;
    }

    @JsonProperty("NumberSent")
    public void setNumberSent(Double NumberSent) {
        this.NumberSent = NumberSent;
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

    // NumberOfLeads
    private Integer NumberOfLeads;

    @JsonProperty("NumberOfLeads")
    public Integer getNumberOfLeads() {
        return this.NumberOfLeads;
    }

    @JsonProperty("NumberOfLeads")
    public void setNumberOfLeads(Integer NumberOfLeads) {
        this.NumberOfLeads = NumberOfLeads;
    }

    // NumberOfConvertedLeads
    private Integer NumberOfConvertedLeads;

    @JsonProperty("NumberOfConvertedLeads")
    public Integer getNumberOfConvertedLeads() {
        return this.NumberOfConvertedLeads;
    }

    @JsonProperty("NumberOfConvertedLeads")
    public void setNumberOfConvertedLeads(Integer NumberOfConvertedLeads) {
        this.NumberOfConvertedLeads = NumberOfConvertedLeads;
    }

    // NumberOfContacts
    private Integer NumberOfContacts;

    @JsonProperty("NumberOfContacts")
    public Integer getNumberOfContacts() {
        return this.NumberOfContacts;
    }

    @JsonProperty("NumberOfContacts")
    public void setNumberOfContacts(Integer NumberOfContacts) {
        this.NumberOfContacts = NumberOfContacts;
    }

    // NumberOfResponses
    private Integer NumberOfResponses;

    @JsonProperty("NumberOfResponses")
    public Integer getNumberOfResponses() {
        return this.NumberOfResponses;
    }

    @JsonProperty("NumberOfResponses")
    public void setNumberOfResponses(Integer NumberOfResponses) {
        this.NumberOfResponses = NumberOfResponses;
    }

    // NumberOfOpportunities
    private Integer NumberOfOpportunities;

    @JsonProperty("NumberOfOpportunities")
    public Integer getNumberOfOpportunities() {
        return this.NumberOfOpportunities;
    }

    @JsonProperty("NumberOfOpportunities")
    public void setNumberOfOpportunities(Integer NumberOfOpportunities) {
        this.NumberOfOpportunities = NumberOfOpportunities;
    }

    // NumberOfWonOpportunities
    private Integer NumberOfWonOpportunities;

    @JsonProperty("NumberOfWonOpportunities")
    public Integer getNumberOfWonOpportunities() {
        return this.NumberOfWonOpportunities;
    }

    @JsonProperty("NumberOfWonOpportunities")
    public void setNumberOfWonOpportunities(Integer NumberOfWonOpportunities) {
        this.NumberOfWonOpportunities = NumberOfWonOpportunities;
    }

    // AmountAllOpportunities
    private Double AmountAllOpportunities;

    @JsonProperty("AmountAllOpportunities")
    public Double getAmountAllOpportunities() {
        return this.AmountAllOpportunities;
    }

    @JsonProperty("AmountAllOpportunities")
    public void setAmountAllOpportunities(Double AmountAllOpportunities) {
        this.AmountAllOpportunities = AmountAllOpportunities;
    }

    // AmountWonOpportunities
    private Double AmountWonOpportunities;

    @JsonProperty("AmountWonOpportunities")
    public Double getAmountWonOpportunities() {
        return this.AmountWonOpportunities;
    }

    @JsonProperty("AmountWonOpportunities")
    public void setAmountWonOpportunities(Double AmountWonOpportunities) {
        this.AmountWonOpportunities = AmountWonOpportunities;
    }

    // CampaignMemberRecordTypeId
    private String CampaignMemberRecordTypeId;

    @JsonProperty("CampaignMemberRecordTypeId")
    public String getCampaignMemberRecordTypeId() {
        return this.CampaignMemberRecordTypeId;
    }

    @JsonProperty("CampaignMemberRecordTypeId")
    public void setCampaignMemberRecordTypeId(String CampaignMemberRecordTypeId) {
        this.CampaignMemberRecordTypeId = CampaignMemberRecordTypeId;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Campaign ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Name", "Name", "string", "xsd:string", 80, false, false, true, false, false, false, true);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("ParentId", "Parent Campaign ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Type", "Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("Status", "Status", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("StartDate", "Start Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("EndDate", "End Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("ExpectedRevenue", "Expected Revenue in Campaign", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("BudgetedCost", "Budgeted Cost in Campaign", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ActualCost", "Actual Cost in Campaign", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ExpectedResponse", "Expected Response (%)", "percent", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("NumberSent", "Num Sent in Campaign", "double", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("IsActive", "Active", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("Description", "Description", "textarea", "xsd:string", 32000, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("NumberOfLeads", "Leads in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("NumberOfConvertedLeads", "Converted Leads in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("NumberOfContacts", "Contacts in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("NumberOfResponses", "Responses in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("NumberOfOpportunities", "Opportunities in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("NumberOfWonOpportunities", "Won Opportunities in Campaign", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("AmountAllOpportunities", "Value Opportunities in Campaign", "currency", "xsd:double", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("AmountWonOpportunities", "Value Won Opportunities in Campaign", "currency", "xsd:double", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField26);
        final SObjectField sObjectField27 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField27);
        final SObjectField sObjectField28 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField28);
        final SObjectField sObjectField29 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField29);
        final SObjectField sObjectField30 = createField("LastActivityDate", "Last Activity", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField30);
        final SObjectField sObjectField31 = createField("LastViewedDate", "Last Viewed Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField31);
        final SObjectField sObjectField32 = createField("LastReferencedDate", "Last Referenced Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField32);
        final SObjectField sObjectField33 = createField("CampaignMemberRecordTypeId", "Record Type ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField33);

        description.setLabelPlural("Campaigns");
        description.setLabel("Campaign");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/Campaign/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/Campaign/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/Campaign");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v34.0/sobjects/Campaign/quickActions");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/Campaign/{ID}");
        sObjectDescriptionUrls1.setListviews("/services/data/v34.0/sobjects/Campaign/listviews");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/Campaign/describe/compactLayouts");
        sObjectDescriptionUrls1.setApprovalLayouts("/services/data/v34.0/sobjects/Campaign/describe/approvalLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/701/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("Campaign");

        return description;
    }
}
