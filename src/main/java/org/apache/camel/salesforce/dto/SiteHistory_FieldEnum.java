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
public enum SiteHistory_FieldEnum {

    // Admin
    ADMIN("Admin"),
    // AnalyticsTrackingCode
    ANALYTICSTRACKINGCODE("AnalyticsTrackingCode"),
    // ClickjackProtectionLevel
    CLICKJACKPROTECTIONLEVEL("ClickjackProtectionLevel"),
    // DefaultDomain
    DEFAULTDOMAIN("DefaultDomain"),
    // Description
    DESCRIPTION("Description"),
    // FavoriteIcon
    FAVORITEICON("FavoriteIcon"),
    // GuestUser
    GUESTUSER("GuestUser"),
    // Guid
    GUID("Guid"),
    // IndexPage
    INDEXPAGE("IndexPage"),
    // Language
    LANGUAGE("Language"),
    // MasterLabel
    MASTERLABEL("MasterLabel"),
    // Name
    NAME("Name"),
    // NewPassTemplate
    NEWPASSTEMPLATE("NewPassTemplate"),
    // NewUserTemplate
    NEWUSERTEMPLATE("NewUserTemplate"),
    // Options
    OPTIONS("Options"),
    // Portal
    PORTAL("Portal"),
    // ServerIsDown
    SERVERISDOWN("ServerIsDown"),
    // SiteAllowStandardPortalPages
    SITEALLOWSTANDARDPORTALPAGES("SiteAllowStandardPortalPages"),
    // SiteDeleteDomain
    SITEDELETEDOMAIN("SiteDeleteDomain"),
    // SiteType
    SITETYPE("SiteType"),
    // Status
    STATUS("Status"),
    // Subdomain
    SUBDOMAIN("Subdomain"),
    // TopLevelDomain
    TOPLEVELDOMAIN("TopLevelDomain"),
    // UrlPathPrefix
    URLPATHPREFIX("UrlPathPrefix"),
    // UrlRewriterClass
    URLREWRITERCLASS("UrlRewriterClass"),
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
    // siteActive
    SITEACTIVE("siteActive"),
    // siteAllowHomePage
    SITEALLOWHOMEPAGE("siteAllowHomePage"),
    // siteAllowStandardAnswersPages
    SITEALLOWSTANDARDANSWERSPAGES("siteAllowStandardAnswersPages"),
    // siteAllowStandardIdeasPages
    SITEALLOWSTANDARDIDEASPAGES("siteAllowStandardIdeasPages"),
    // siteAllowStandardLookups
    SITEALLOWSTANDARDLOOKUPS("siteAllowStandardLookups"),
    // siteAllowStandardSearch
    SITEALLOWSTANDARDSEARCH("siteAllowStandardSearch"),
    // siteBTDisabled
    SITEBTDISABLED("siteBTDisabled"),
    // siteChangeRedirect
    SITECHANGEREDIRECT("siteChangeRedirect"),
    // siteDeleteRedirect
    SITEDELETEREDIRECT("siteDeleteRedirect"),
    // siteEnableFeeds
    SITEENABLEFEEDS("siteEnableFeeds"),
    // siteNewDomain
    SITENEWDOMAIN("siteNewDomain"),
    // siteNewRedirect
    SITENEWREDIRECT("siteNewRedirect"),
    // siteOverride401
    SITEOVERRIDE401("siteOverride401"),
    // siteOverride404
    SITEOVERRIDE404("siteOverride404"),
    // siteOverride500
    SITEOVERRIDE500("siteOverride500"),
    // siteOverride503
    SITEOVERRIDE503("siteOverride503"),
    // siteOverride509
    SITEOVERRIDE509("siteOverride509"),
    // siteOverrideChangePassword
    SITEOVERRIDECHANGEPASSWORD("siteOverrideChangePassword"),
    // siteOverrideForgotPassword
    SITEOVERRIDEFORGOTPASSWORD("siteOverrideForgotPassword"),
    // siteOverrideInactive
    SITEOVERRIDEINACTIVE("siteOverrideInactive"),
    // siteOverrideMyProfile
    SITEOVERRIDEMYPROFILE("siteOverrideMyProfile"),
    // siteOverrideRobotsTxt
    SITEOVERRIDEROBOTSTXT("siteOverrideRobotsTxt"),
    // siteOverrideSelfReg
    SITEOVERRIDESELFREG("siteOverrideSelfReg"),
    // siteOverrideTemplate
    SITEOVERRIDETEMPLATE("siteOverrideTemplate"),
    // sitePageLimitExceeded
    SITEPAGELIMITEXCEEDED("sitePageLimitExceeded"),
    // siteRequireHttps
    SITEREQUIREHTTPS("siteRequireHttps"),
    // siteRequireInsecurePortalAccess
    SITEREQUIREINSECUREPORTALACCESS("siteRequireInsecurePortalAccess"),
    // siteSetPrimaryDomain
    SITESETPRIMARYDOMAIN("siteSetPrimaryDomain"),
    // unlocked
    UNLOCKED("unlocked");

    final String value;

    private SiteHistory_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static SiteHistory_FieldEnum fromValue(String value) {
        for (SiteHistory_FieldEnum e : SiteHistory_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
