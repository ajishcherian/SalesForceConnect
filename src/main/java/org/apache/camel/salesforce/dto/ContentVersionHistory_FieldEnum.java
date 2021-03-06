/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum ContentVersionHistory_FieldEnum {

    // ContentUrl
    CONTENTURL("ContentUrl"),
    // Description
    DESCRIPTION("Description"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource"),
    // ExternalDocumentInfo1
    EXTERNALDOCUMENTINFO1("ExternalDocumentInfo1"),
    // ExternalDocumentInfo2
    EXTERNALDOCUMENTINFO2("ExternalDocumentInfo2"),
    // IsMajorVersion
    ISMAJORVERSION("IsMajorVersion"),
    // Language
    LANGUAGE("Language"),
    // Owner
    OWNER("Owner"),
    // ReasonForChange
    REASONFORCHANGE("ReasonForChange"),
    // SharingOption
    SHARINGOPTION("SharingOption"),
    // SharingPrivacy
    SHARINGPRIVACY("SharingPrivacy"),
    // Title
    TITLE("Title"),
    // contentVersionCommented
    CONTENTVERSIONCOMMENTED("contentVersionCommented"),
    // contentVersionCreated
    CONTENTVERSIONCREATED("contentVersionCreated"),
    // contentVersionDataReplaced
    CONTENTVERSIONDATAREPLACED("contentVersionDataReplaced"),
    // contentVersionDeleted
    CONTENTVERSIONDELETED("contentVersionDeleted"),
    // contentVersionDownloaded
    CONTENTVERSIONDOWNLOADED("contentVersionDownloaded"),
    // contentVersionRated
    CONTENTVERSIONRATED("contentVersionRated"),
    // contentVersionUpdated
    CONTENTVERSIONUPDATED("contentVersionUpdated"),
    // contentVersionViewed
    CONTENTVERSIONVIEWED("contentVersionViewed"),
    // created
    CREATED("created"),
    // feedEvent
    FEEDEVENT("feedEvent"),
    // locked
    LOCKED("locked"),
    // ownerAccepted
    OWNERACCEPTED("ownerAccepted"),
    // ownerAssignment
    OWNERASSIGNMENT("ownerAssignment"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private ContentVersionHistory_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContentVersionHistory_FieldEnum fromValue(String value) {
        for (ContentVersionHistory_FieldEnum e : ContentVersionHistory_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
