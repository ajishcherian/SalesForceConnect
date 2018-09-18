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
 * Salesforce DTO for SObject OrderItemFeed
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("OrderItemFeed")
public class OrderItemFeed extends AbstractDescribedSObjectBase {

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
    private OrderItemFeed_TypeEnum Type;

    @JsonProperty("Type")
    public OrderItemFeed_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(OrderItemFeed_TypeEnum Type) {
        this.Type = Type;
    }

    // CommentCount
    private Integer CommentCount;

    @JsonProperty("CommentCount")
    public Integer getCommentCount() {
        return this.CommentCount;
    }

    @JsonProperty("CommentCount")
    public void setCommentCount(Integer CommentCount) {
        this.CommentCount = CommentCount;
    }

    // LikeCount
    private Integer LikeCount;

    @JsonProperty("LikeCount")
    public Integer getLikeCount() {
        return this.LikeCount;
    }

    @JsonProperty("LikeCount")
    public void setLikeCount(Integer LikeCount) {
        this.LikeCount = LikeCount;
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

    // Body
    private String Body;

    @JsonProperty("Body")
    public String getBody() {
        return this.Body;
    }

    @JsonProperty("Body")
    public void setBody(String Body) {
        this.Body = Body;
    }

    // LinkUrl
    private String LinkUrl;

    @JsonProperty("LinkUrl")
    public String getLinkUrl() {
        return this.LinkUrl;
    }

    @JsonProperty("LinkUrl")
    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
    }

    // RelatedRecordId
    private String RelatedRecordId;

    @JsonProperty("RelatedRecordId")
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    @JsonProperty("RelatedRecordId")
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    // ContentData
    // blob field url, use getBlobField to get the content
    @XStreamAlias("ContentData")
    private String ContentDataUrl;

    @JsonProperty("ContentData")
    public String getContentDataUrl() {
        return this.ContentDataUrl;
    }

    @JsonProperty("ContentData")
    public void setContentDataUrl(String ContentDataUrl) {
        this.ContentDataUrl = ContentDataUrl;
    }

    // ContentFileName
    private String ContentFileName;

    @JsonProperty("ContentFileName")
    public String getContentFileName() {
        return this.ContentFileName;
    }

    @JsonProperty("ContentFileName")
    public void setContentFileName(String ContentFileName) {
        this.ContentFileName = ContentFileName;
    }

    // ContentDescription
    private String ContentDescription;

    @JsonProperty("ContentDescription")
    public String getContentDescription() {
        return this.ContentDescription;
    }

    @JsonProperty("ContentDescription")
    public void setContentDescription(String ContentDescription) {
        this.ContentDescription = ContentDescription;
    }

    // ContentType
    private String ContentType;

    @JsonProperty("ContentType")
    public String getContentType() {
        return this.ContentType;
    }

    @JsonProperty("ContentType")
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    // ContentSize
    private Integer ContentSize;

    @JsonProperty("ContentSize")
    public Integer getContentSize() {
        return this.ContentSize;
    }

    @JsonProperty("ContentSize")
    public void setContentSize(Integer ContentSize) {
        this.ContentSize = ContentSize;
    }

    // InsertedById
    private String InsertedById;

    @JsonProperty("InsertedById")
    public String getInsertedById() {
        return this.InsertedById;
    }

    @JsonProperty("InsertedById")
    public void setInsertedById(String InsertedById) {
        this.InsertedById = InsertedById;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Feed Item ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ParentId", "Parent ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("Type", "Feed Item Type", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("CommentCount", "Comment Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("LikeCount", "Like Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("Title", "Title", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Body", "Body", "textarea", "xsd:string", 10000, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("LinkUrl", "Link Url", "url", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("RelatedRecordId", "Related Record ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("ContentData", "Content Data", "base64", "xsd:base64Binary", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("ContentFileName", "Content File Name", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("ContentDescription", "Content Description", "textarea", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("ContentType", "Content File Type", "string", "xsd:string", 120, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("ContentSize", "Content Size", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("InsertedById", "InsertedBy ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);

        description.setLabelPlural("Order Product Feed");
        description.setLabel("Order Product Feed");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/OrderItemFeed/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/OrderItemFeed");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/OrderItemFeed/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("OrderItemFeed");

        return description;
    }
}
