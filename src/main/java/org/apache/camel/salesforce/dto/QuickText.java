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
import org.apache.camel.component.salesforce.api.MultiSelectPicklistConverter;
import org.apache.camel.component.salesforce.api.MultiSelectPicklistDeserializer;
import org.apache.camel.component.salesforce.api.MultiSelectPicklistSerializer;
import org.apache.camel.component.salesforce.api.dto.AbstractDescribedSObjectBase;
import org.apache.camel.component.salesforce.api.dto.ChildRelationShip;
import org.apache.camel.component.salesforce.api.dto.InfoUrls;
import org.apache.camel.component.salesforce.api.dto.NamedLayoutInfo;
import org.apache.camel.component.salesforce.api.dto.RecordTypeInfo;
import org.apache.camel.component.salesforce.api.dto.SObjectDescription;
import org.apache.camel.component.salesforce.api.dto.SObjectDescriptionUrls;
import org.apache.camel.component.salesforce.api.dto.SObjectField;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * Salesforce DTO for SObject QuickText
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("QuickText")
public class QuickText extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // Message
    private String Message;

    @JsonProperty("Message")
    public String getMessage() {
        return this.Message;
    }

    @JsonProperty("Message")
    public void setMessage(String Message) {
        this.Message = Message;
    }

    // Category
    @XStreamConverter(PicklistEnumConverter.class)
    private QuickText_CategoryEnum Category;

    @JsonProperty("Category")
    public QuickText_CategoryEnum getCategory() {
        return this.Category;
    }

    @JsonProperty("Category")
    public void setCategory(QuickText_CategoryEnum Category) {
        this.Category = Category;
    }

    // Channel
    @XStreamConverter(MultiSelectPicklistConverter.class)
    private QuickText_ChannelEnum[] Channel;

    @JsonProperty("Channel")
    @JsonSerialize(using = MultiSelectPicklistSerializer.class)
    @JsonInclude(value = Include.ALWAYS)
    public QuickText_ChannelEnum[] getChannel() {
        return this.Channel;
    }

    @JsonProperty("Channel")
    @JsonDeserialize(using = MultiSelectPicklistDeserializer.class)
    public void setChannel(QuickText_ChannelEnum[] Channel) {
        this.Channel = Channel;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Quick Text ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("OwnerId", "Owner ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("IsDeleted", "Deleted", "boolean", "xsd:boolean", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("Name", "Quick Text Name", "string", "xsd:string", 255, false, false, true, false, false, false, true);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("CreatedDate", "Created Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("CreatedById", "Created By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("LastModifiedDate", "Last Modified Date", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("LastModifiedById", "Last Modified By ID", "reference", "tns:ID", 18, false, false, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("SystemModstamp", "System Modstamp", "datetime", "xsd:dateTime", 0, false, false, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("LastViewedDate", "Last Viewed Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("LastReferencedDate", "Last Referenced Date", "datetime", "xsd:dateTime", 0, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("Message", "Message", "textarea", "xsd:string", 4096, false, false, false, false, false, false, false);
        fields1.add(sObjectField12);
        final SObjectField sObjectField13 = createField("Category", "Category", "picklist", "xsd:string", 40, false, true, false, false, false, false, false);
        fields1.add(sObjectField13);
        final SObjectField sObjectField14 = createField("Channel", "Channel", "multipicklist", "xsd:string", 4099, false, true, false, false, false, false, false);
        fields1.add(sObjectField14);

        description.setLabelPlural("Quick Text");
        description.setLabel("Quick Text");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/QuickText/describe");
        sObjectDescriptionUrls1.setLayouts("/services/data/v34.0/sobjects/QuickText/describe/layouts");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/QuickText");
        sObjectDescriptionUrls1.setUiEditTemplate("https://na57.salesforce.com/{ID}/e");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/QuickText/{ID}");
        sObjectDescriptionUrls1.setCompactLayouts("/services/data/v34.0/sobjects/QuickText/describe/compactLayouts");
        sObjectDescriptionUrls1.setUiNewRecord("https://na57.salesforce.com/574/e");
        sObjectDescriptionUrls1.setUiDetailTemplate("https://na57.salesforce.com/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("QuickText");

        return description;
    }
}
