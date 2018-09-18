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
 * Salesforce DTO for SObject FeedItem
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("FeedItem")
public class FeedItem extends AbstractDescribedSObjectBase {

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
    private FeedItem_TypeEnum Type;

    @JsonProperty("Type")
    public FeedItem_TypeEnum getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(FeedItem_TypeEnum Type) {
        this.Type = Type;
    }

    // Revision
    private Integer Revision;

    @JsonProperty("Revision")
    public Integer getRevision() {
        return this.Revision;
    }

    @JsonProperty("Revision")
    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    // LastEditById
    private String LastEditById;

    @JsonProperty("LastEditById")
    public String getLastEditById() {
        return this.LastEditById;
    }

    @JsonProperty("LastEditById")
    public void setLastEditById(String LastEditById) {
        this.LastEditById = LastEditById;
    }

    // LastEditDate
    private java.time.ZonedDateTime LastEditDate;

    @JsonProperty("LastEditDate")
    public java.time.ZonedDateTime getLastEditDate() {
        return this.LastEditDate;
    }

    @JsonProperty("LastEditDate")
    public void setLastEditDate(java.time.ZonedDateTime LastEditDate) {
        this.LastEditDate = LastEditDate;
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

    // BestCommentId
    private String BestCommentId;

    @JsonProperty("BestCommentId")
    public String getBestCommentId() {
        return this.BestCommentId;
    }

    @JsonProperty("BestCommentId")
    public void setBestCommentId(String BestCommentId) {
        this.BestCommentId = BestCommentId;
    }

    // HasContent
    private Boolean HasContent;

    @JsonProperty("HasContent")
    public Boolean getHasContent() {
        return this.HasContent;
    }

    @JsonProperty("HasContent")
    public void setHasContent(Boolean HasContent) {
        this.HasContent = HasContent;
    }

    // HasLink
    private Boolean HasLink;

    @JsonProperty("HasLink")
    public Boolean getHasLink() {
        return this.HasLink;
    }

    @JsonProperty("HasLink")
    public void setHasLink(Boolean HasLink) {
        this.HasLink = HasLink;
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
        final SObjectField sObjectField9 = createField("Revision", "Revision", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("LastEditById", "Last Edit By ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("LastEditDate", "Last Edit Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("CommentCount", "Comment Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("LikeCount", "Like Count", "int", "xsd:int", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("Title", "Title", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);
        final SObjectField sObjectField15 = createField("Body", "Body", "textarea", "xsd:string", 10000, false, true, false, false, false, false, false);
        fields1.add(sObjectField15);
        final SObjectField sObjectField16 = createField("LinkUrl", "Link Url", "url", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField16);
        final SObjectField sObjectField17 = createField("RelatedRecordId", "Related Record ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField17);
        final SObjectField sObjectField18 = createField("ContentData", "Content Data", "base64", "xsd:base64Binary", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField18);
        final SObjectField sObjectField19 = createField("ContentFileName", "Content File Name", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField19);
        final SObjectField sObjectField20 = createField("ContentDescription", "Content Description", "textarea", "xsd:string", 1000, false, true, false, false, false, false, false);
        fields1.add(sObjectField20);
        final SObjectField sObjectField21 = createField("ContentType", "Content File Type", "string", "xsd:string", 120, false, true, false, false, false, false, false);
        fields1.add(sObjectField21);
        final SObjectField sObjectField22 = createField("ContentSize", "Content Size", "int", "xsd:int", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField22);
        final SObjectField sObjectField23 = createField("InsertedById", "InsertedBy ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField23);
        final SObjectField sObjectField24 = createField("BestCommentId", "Best Comment ID", "reference", "tns:ID", 18, false, true, false, false, false, false, false);
        fields1.add(sObjectField24);
        final SObjectField sObjectField25 = createField("HasContent", "Has Content", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField25);
        final SObjectField sObjectField26 = createField("HasLink", "Has Link", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField26);

        description.setLabelPlural("Feed Items");
        description.setLabel("Feed Item");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/FeedItem/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/FeedItem/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/FeedItem");
        sObjectDescriptionUrls1.setQuickActions("/services/data/v34.0/sobjects/FeedItem/quickActions");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/FeedItem/{ID}");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/0D5/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("FeedItem");

        return description;
    }
}
