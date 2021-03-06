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
 * Salesforce DTO for SObject OpportunityLineItem
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("OpportunityLineItem")
public class OpportunityLineItem extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
    }

    // SortOrder
    private Integer SortOrder;

    @JsonProperty("SortOrder")
    public Integer getSortOrder() {
        return this.SortOrder;
    }

    @JsonProperty("SortOrder")
    public void setSortOrder(Integer SortOrder) {
        this.SortOrder = SortOrder;
    }

    // PricebookEntryId
    private String PricebookEntryId;

    @JsonProperty("PricebookEntryId")
    public String getPricebookEntryId() {
        return this.PricebookEntryId;
    }

    @JsonProperty("PricebookEntryId")
    public void setPricebookEntryId(String PricebookEntryId) {
        this.PricebookEntryId = PricebookEntryId;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // ProductCode
    private String ProductCode;

    @JsonProperty("ProductCode")
    public String getProductCode() {
        return this.ProductCode;
    }

    @JsonProperty("ProductCode")
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    // Quantity
    private Double Quantity;

    @JsonProperty("Quantity")
    public Double getQuantity() {
        return this.Quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Double Quantity) {
        this.Quantity = Quantity;
    }

    // TotalPrice
    private Double TotalPrice;

    @JsonProperty("TotalPrice")
    public Double getTotalPrice() {
        return this.TotalPrice;
    }

    @JsonProperty("TotalPrice")
    public void setTotalPrice(Double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    // UnitPrice
    private Double UnitPrice;

    @JsonProperty("UnitPrice")
    public Double getUnitPrice() {
        return this.UnitPrice;
    }

    @JsonProperty("UnitPrice")
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    // ListPrice
    private Double ListPrice;

    @JsonProperty("ListPrice")
    public Double getListPrice() {
        return this.ListPrice;
    }

    @JsonProperty("ListPrice")
    public void setListPrice(Double ListPrice) {
        this.ListPrice = ListPrice;
    }

    // ServiceDate
    private java.time.LocalDate ServiceDate;

    @JsonProperty("ServiceDate")
    public java.time.LocalDate getServiceDate() {
        return this.ServiceDate;
    }

    @JsonProperty("ServiceDate")
    public void setServiceDate(java.time.LocalDate ServiceDate) {
        this.ServiceDate = ServiceDate;
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

        final SObjectField sObjectField1 = createField("Id", "Line Item ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OpportunityId", "Opportunity ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("SortOrder", "Sort Order", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("PricebookEntryId", "Price Book Entry ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("Product2Id", "Product ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("ProductCode", "Product Code", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Name", "Opportunity Product Name", "string", "xsd:string", 376, false, true, true, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("Quantity", "Quantity", "double", "xsd:double", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("TotalPrice", "Total Price", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("UnitPrice", "Sales Price", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("ListPrice", "List Price", "currency", "xsd:double", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("ServiceDate", "Date", "date", "xsd:date", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("Description", "Line Description", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField19);

        description.setLabelPlural("Opportunity Product");
        description.setLabel("Opportunity Product");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/OpportunityLineItem/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/OpportunityLineItem/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/OpportunityLineItem");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/OpportunityLineItem/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/OpportunityLineItem/describe/compactLayouts");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("OpportunityLineItem");

        return description;
    }
}
