/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Thu Sep 06 16:51:28 IST 2018
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SobjectType
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum UserListView_SobjectTypeEnum {

    // Account
    ACCOUNT("Account"),
    // ActionApex
    ACTIONAPEX("ActionApex"),
    // ActionChatterPost
    ACTIONCHATTERPOST("ActionChatterPost"),
    // ActionEmail
    ACTIONEMAIL("ActionEmail"),
    // ActionFieldUpdate
    ACTIONFIELDUPDATE("ActionFieldUpdate"),
    // ActionKnowledgeSubmit
    ACTIONKNOWLEDGESUBMIT("ActionKnowledgeSubmit"),
    // ActionQuickCreate
    ACTIONQUICKCREATE("ActionQuickCreate"),
    // ActionSend
    ACTIONSEND("ActionSend"),
    // ActionTask
    ACTIONTASK("ActionTask"),
    // Activity
    ACTIVITY("Activity"),
    // AdditionalNumber
    ADDITIONALNUMBER("AdditionalNumber"),
    // AllInstalledPackageVersion
    ALLINSTALLEDPACKAGEVERSION("AllInstalledPackageVersion"),
    // AllOrganization
    ALLORGANIZATION("AllOrganization"),
    // AllPackage
    ALLPACKAGE("AllPackage"),
    // AllPackageVersion
    ALLPACKAGEVERSION("AllPackageVersion"),
    // AllUsersBasic
    ALLUSERSBASIC("AllUsersBasic"),
    // Announcement
    ANNOUNCEMENT("Announcement"),
    // ApexClass
    APEXCLASS("ApexClass"),
    // ApexComponent
    APEXCOMPONENT("ApexComponent"),
    // ApexLog
    APEXLOG("ApexLog"),
    // ApexPage
    APEXPAGE("ApexPage"),
    // ApexTestResult
    APEXTESTRESULT("ApexTestResult"),
    // ApexTestRunResult
    APEXTESTRUNRESULT("ApexTestRunResult"),
    // ApexTrigger
    APEXTRIGGER("ApexTrigger"),
    // AppIpRange
    APPIPRANGE("AppIpRange"),
    // AppMenuItem
    APPMENUITEM("AppMenuItem"),
    // Asset
    ASSET("Asset"),
    // AssociationQueueItem
    ASSOCIATIONQUEUEITEM("AssociationQueueItem"),
    // AsyncApexJob
    ASYNCAPEXJOB("AsyncApexJob"),
    // AsyncApiBatch
    ASYNCAPIBATCH("AsyncApiBatch"),
    // Attachment
    ATTACHMENT("Attachment"),
    // AuraDefinitionBundle
    AURADEFINITIONBUNDLE("AuraDefinitionBundle"),
    // AuthProvider
    AUTHPROVIDER("AuthProvider"),
    // AuthSession
    AUTHSESSION("AuthSession"),
    // BackgroundOperation
    BACKGROUNDOPERATION("BackgroundOperation"),
    // BrandTemplate
    BRANDTEMPLATE("BrandTemplate"),
    // BusinessHours
    BUSINESSHOURS("BusinessHours"),
    // CallCenter
    CALLCENTER("CallCenter"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CampaignMember
    CAMPAIGNMEMBER("CampaignMember"),
    // CampaignMemberStatus
    CAMPAIGNMEMBERSTATUS("CampaignMemberStatus"),
    // Case
    CASE("Case"),
    // CaseEscalation
    CASEESCALATION("CaseEscalation"),
    // Certificate
    CERTIFICATE("Certificate"),
    // CertificateIp
    CERTIFICATEIP("CertificateIp"),
    // CleanRule
    CLEANRULE("CleanRule"),
    // ClientBrowser
    CLIENTBROWSER("ClientBrowser"),
    // CollaborationGroup
    COLLABORATIONGROUP("CollaborationGroup"),
    // CollaborationGroupRecord
    COLLABORATIONGROUPRECORD("CollaborationGroupRecord"),
    // Community
    COMMUNITY("Community"),
    // ConnectedApplication
    CONNECTEDAPPLICATION("ConnectedApplication"),
    // ConnectivityAttributes
    CONNECTIVITYATTRIBUTES("ConnectivityAttributes"),
    // Contact
    CONTACT("Contact"),
    // ContentAsset
    CONTENTASSET("ContentAsset"),
    // ContentDistribution
    CONTENTDISTRIBUTION("ContentDistribution"),
    // ContentDistributionView
    CONTENTDISTRIBUTIONVIEW("ContentDistributionView"),
    // ContentDocument
    CONTENTDOCUMENT("ContentDocument"),
    // ContentFolderItem
    CONTENTFOLDERITEM("ContentFolderItem"),
    // ContentNote
    CONTENTNOTE("ContentNote"),
    // ContentVersion
    CONTENTVERSION("ContentVersion"),
    // ContentWorkspace
    CONTENTWORKSPACE("ContentWorkspace"),
    // ContextFieldAttributes
    CONTEXTFIELDATTRIBUTES("ContextFieldAttributes"),
    // Contract
    CONTRACT("Contract"),
    // CronTrigger
    CRONTRIGGER("CronTrigger"),
    // CustomEntityDefinition
    CUSTOMENTITYDEFINITION("CustomEntityDefinition"),
    // CustomHttpHeader
    CUSTOMHTTPHEADER("CustomHttpHeader"),
    // CustomIndex
    CUSTOMINDEX("CustomIndex"),
    // CustomPermission
    CUSTOMPERMISSION("CustomPermission"),
    // CustomPermissionDependency
    CUSTOMPERMISSIONDEPENDENCY("CustomPermissionDependency"),
    // CustomPermissionSet
    CUSTOMPERMISSIONSET("CustomPermissionSet"),
    // CustomReportType
    CUSTOMREPORTTYPE("CustomReportType"),
    // DandBCompany
    DANDBCOMPANY("DandBCompany"),
    // Dashboard
    DASHBOARD("Dashboard"),
    // DashboardComponent
    DASHBOARDCOMPONENT("DashboardComponent"),
    // DatacloudCompany
    DATACLOUDCOMPANY("DatacloudCompany"),
    // DatacloudContact
    DATACLOUDCONTACT("DatacloudContact"),
    // DebugLevel
    DEBUGLEVEL("DebugLevel"),
    // Document
    DOCUMENT("Document"),
    // Domain
    DOMAIN("Domain"),
    // DomainSite
    DOMAINSITE("DomainSite"),
    // DuplicateErrorLog
    DUPLICATEERRORLOG("DuplicateErrorLog"),
    // DuplicateRecordItem
    DUPLICATERECORDITEM("DuplicateRecordItem"),
    // DuplicateRecordSet
    DUPLICATERECORDSET("DuplicateRecordSet"),
    // DuplicateRule
    DUPLICATERULE("DuplicateRule"),
    // EmailBrand
    EMAILBRAND("EmailBrand"),
    // EmailDomainFilter
    EMAILDOMAINFILTER("EmailDomainFilter"),
    // EmailDomainKey
    EMAILDOMAINKEY("EmailDomainKey"),
    // EmailMessage
    EMAILMESSAGE("EmailMessage"),
    // EmailMessageRelation
    EMAILMESSAGERELATION("EmailMessageRelation"),
    // EmailRelay
    EMAILRELAY("EmailRelay"),
    // EmailRoutingAddress
    EMAILROUTINGADDRESS("EmailRoutingAddress"),
    // EmailServicesAddress
    EMAILSERVICESADDRESS("EmailServicesAddress"),
    // EmailServicesFunction
    EMAILSERVICESFUNCTION("EmailServicesFunction"),
    // EmailStatus
    EMAILSTATUS("EmailStatus"),
    // EmailTemplate
    EMAILTEMPLATE("EmailTemplate"),
    // EmbeddedServiceConfig
    EMBEDDEDSERVICECONFIG("EmbeddedServiceConfig"),
    // EnhancedEmailTemplate
    ENHANCEDEMAILTEMPLATE("EnhancedEmailTemplate"),
    // EntityHistory
    ENTITYHISTORY("EntityHistory"),
    // EntitySubscription
    ENTITYSUBSCRIPTION("EntitySubscription"),
    // Event
    EVENT("Event"),
    // EventAssociationItem
    EVENTASSOCIATIONITEM("EventAssociationItem"),
    // EventType
    EVENTTYPE("EventType"),
    // EventTypeParameter
    EVENTTYPEPARAMETER("EventTypeParameter"),
    // ExternalDataSource
    EXTERNALDATASOURCE("ExternalDataSource"),
    // ExternalDataUserAuth
    EXTERNALDATAUSERAUTH("ExternalDataUserAuth"),
    // ExternalSocialAccount
    EXTERNALSOCIALACCOUNT("ExternalSocialAccount"),
    // ExternalString
    EXTERNALSTRING("ExternalString"),
    // FeatureLicense
    FEATURELICENSE("FeatureLicense"),
    // FeedPostTemplate
    FEEDPOSTTEMPLATE("FeedPostTemplate"),
    // FlexiPage
    FLEXIPAGE("FlexiPage"),
    // FlowDefinition
    FLOWDEFINITION("FlowDefinition"),
    // FlowInterview
    FLOWINTERVIEW("FlowInterview"),
    // Folder
    FOLDER("Folder"),
    // Group
    GROUP("Group"),
    // Holiday
    HOLIDAY("Holiday"),
    // Idea
    IDEA("Idea"),
    // InteractionDefinitionVersion
    INTERACTIONDEFINITIONVERSION("InteractionDefinitionVersion"),
    // InteractionLayoutDetail
    INTERACTIONLAYOUTDETAIL("InteractionLayoutDetail"),
    // IpWhitelist
    IPWHITELIST("IpWhitelist"),
    // Lead
    LEAD("Lead"),
    // LicenseDefinition
    LICENSEDEFINITION("LicenseDefinition"),
    // LicensedCustomPermission
    LICENSEDCUSTOMPERMISSION("LicensedCustomPermission"),
    // ListEmail
    LISTEMAIL("ListEmail"),
    // ListEmailSentResult
    LISTEMAILSENTRESULT("ListEmailSentResult"),
    // ListPoolUsage
    LISTPOOLUSAGE("ListPoolUsage"),
    // ListView
    LISTVIEW("ListView"),
    // LocalizedValue
    LOCALIZEDVALUE("LocalizedValue"),
    // LoginBrand
    LOGINBRAND("LoginBrand"),
    // LoginBrandAsset
    LOGINBRANDASSET("LoginBrandAsset"),
    // LoginFlow
    LOGINFLOW("LoginFlow"),
    // LoginHistory
    LOGINHISTORY("LoginHistory"),
    // LoginIp
    LOGINIP("LoginIp"),
    // Macro
    MACRO("Macro"),
    // MailAssociationItem
    MAILASSOCIATIONITEM("MailAssociationItem"),
    // MailmergeTemplate
    MAILMERGETEMPLATE("MailmergeTemplate"),
    // MassMail
    MASSMAIL("MassMail"),
    // MatchIndexValue
    MATCHINDEXVALUE("MatchIndexValue"),
    // MatchingRule
    MATCHINGRULE("MatchingRule"),
    // MetadataChangeTemplate
    METADATACHANGETEMPLATE("MetadataChangeTemplate"),
    // MetadataContainerMember
    METADATACONTAINERMEMBER("MetadataContainerMember"),
    // MetadataContainerMemberWithBody
    METADATACONTAINERMEMBERWITHBODY("MetadataContainerMemberWithBody"),
    // MetadataContainerMemberWithSymbolTable
    METADATACONTAINERMEMBERWITHSYMBOLTABLE("MetadataContainerMemberWithSymbolTable"),
    // MobileConfig
    MOBILECONFIG("MobileConfig"),
    // MobileDevice
    MOBILEDEVICE("MobileDevice"),
    // NamedCredential
    NAMEDCREDENTIAL("NamedCredential"),
    // Note
    NOTE("Note"),
    // OauthConsumer
    OAUTHCONSUMER("OauthConsumer"),
    // ObjectPermissions
    OBJECTPERMISSIONS("ObjectPermissions"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // OpportunityLineItem
    OPPORTUNITYLINEITEM("OpportunityLineItem"),
    // Order
    ORDER("Order"),
    // OrderItem
    ORDERITEM("OrderItem"),
    // Organization
    ORGANIZATION("Organization"),
    // Package2Member
    PACKAGE2MEMBER("Package2Member"),
    // PackageBooleanValue
    PACKAGEBOOLEANVALUE("PackageBooleanValue"),
    // PackageDateValue
    PACKAGEDATEVALUE("PackageDateValue"),
    // PackageIntegerValue
    PACKAGEINTEGERVALUE("PackageIntegerValue"),
    // PackageLicense
    PACKAGELICENSE("PackageLicense"),
    // PackageOperationError
    PACKAGEOPERATIONERROR("PackageOperationError"),
    // ParallelJobStatus
    PARALLELJOBSTATUS("ParallelJobStatus"),
    // PendingChange
    PENDINGCHANGE("PendingChange"),
    // PermissionSet
    PERMISSIONSET("PermissionSet"),
    // PermissionSetAssignment
    PERMISSIONSETASSIGNMENT("PermissionSetAssignment"),
    // PermissionSetLicense
    PERMISSIONSETLICENSE("PermissionSetLicense"),
    // PermissionSetLicenseAssign
    PERMISSIONSETLICENSEASSIGN("PermissionSetLicenseAssign"),
    // PlatformCachePartition
    PLATFORMCACHEPARTITION("PlatformCachePartition"),
    // Pricebook2
    PRICEBOOK2("Pricebook2"),
    // PricebookEntry
    PRICEBOOKENTRY("PricebookEntry"),
    // ProcessDefinition
    PROCESSDEFINITION("ProcessDefinition"),
    // ProcessInstanceStep
    PROCESSINSTANCESTEP("ProcessInstanceStep"),
    // ProcessInstanceWorkitem
    PROCESSINSTANCEWORKITEM("ProcessInstanceWorkitem"),
    // ProcessTimeQueue
    PROCESSTIMEQUEUE("ProcessTimeQueue"),
    // Product2
    PRODUCT2("Product2"),
    // Profile
    PROFILE("Profile"),
    // PushUpgradeJob
    PUSHUPGRADEJOB("PushUpgradeJob"),
    // PushUpgradeJobError
    PUSHUPGRADEJOBERROR("PushUpgradeJobError"),
    // PushUpgradeRequest
    PUSHUPGRADEREQUEST("PushUpgradeRequest"),
    // QoptimizerOption
    QOPTIMIZEROPTION("QoptimizerOption"),
    // QuickActionDefinition
    QUICKACTIONDEFINITION("QuickActionDefinition"),
    // QuickText
    QUICKTEXT("QuickText"),
    // RateLimitingNotification
    RATELIMITINGNOTIFICATION("RateLimitingNotification"),
    // RemoteProxy
    REMOTEPROXY("RemoteProxy"),
    // Report
    REPORT("Report"),
    // ReportJob
    REPORTJOB("ReportJob"),
    // Scontrol
    SCONTROL("Scontrol"),
    // Scorecard
    SCORECARD("Scorecard"),
    // ScorecardAssociation
    SCORECARDASSOCIATION("ScorecardAssociation"),
    // SearchPromotionRule
    SEARCHPROMOTIONRULE("SearchPromotionRule"),
    // SettingsTemplate
    SETTINGSTEMPLATE("SettingsTemplate"),
    // SocialPersona
    SOCIALPERSONA("SocialPersona"),
    // SoftphoneLayout
    SOFTPHONELAYOUT("SoftphoneLayout"),
    // Solution
    SOLUTION("Solution"),
    // StaticResource
    STATICRESOURCE("StaticResource"),
    // Task
    TASK("Task"),
    // TaskAssociationItem
    TASKASSOCIATIONITEM("TaskAssociationItem"),
    // TenantAddOnLicense
    TENANTADDONLICENSE("TenantAddOnLicense"),
    // TenantEditionLicense
    TENANTEDITIONLICENSE("TenantEditionLicense"),
    // TenantLicensingRequest
    TENANTLICENSINGREQUEST("TenantLicensingRequest"),
    // TenantPlatformLicense
    TENANTPLATFORMLICENSE("TenantPlatformLicense"),
    // TenantUsageEntitlement
    TENANTUSAGEENTITLEMENT("TenantUsageEntitlement"),
    // TenantUserLicense
    TENANTUSERLICENSE("TenantUserLicense"),
    // Topic
    TOPIC("Topic"),
    // Training
    TRAINING("Training"),
    // TwoFactorTempCode
    TWOFACTORTEMPCODE("TwoFactorTempCode"),
    // User
    USER("User"),
    // UserAppMenuItem
    USERAPPMENUITEM("UserAppMenuItem"),
    // UserLicense
    USERLICENSE("UserLicense"),
    // UserProvAccount
    USERPROVACCOUNT("UserProvAccount"),
    // UserRole
    USERROLE("UserRole"),
    // VerificationHistory
    VERIFICATIONHISTORY("VerificationHistory"),
    // Vote
    VOTE("Vote"),
    // WorkflowRule
    WORKFLOWRULE("WorkflowRule"),
    // WorkflowTimeQueue
    WORKFLOWTIMEQUEUE("WorkflowTimeQueue");

    final String value;

    private UserListView_SobjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserListView_SobjectTypeEnum fromValue(String value) {
        for (UserListView_SobjectTypeEnum e : UserListView_SobjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
