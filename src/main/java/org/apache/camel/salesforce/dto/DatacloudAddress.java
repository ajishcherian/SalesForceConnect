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
 * Salesforce DTO for SObject DatacloudAddress
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
@XStreamAlias("DatacloudAddress")
public class DatacloudAddress extends AbstractDescribedSObjectBase {

    private static final SObjectDescription DESCRIPTION = createSObjectDescription();

    // ExternalId
    private String ExternalId;

    @JsonProperty("ExternalId")
    public String getExternalId() {
        return this.ExternalId;
    }

    @JsonProperty("ExternalId")
    public void setExternalId(String ExternalId) {
        this.ExternalId = ExternalId;
    }

    // AddressLine1
    private String AddressLine1;

    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return this.AddressLine1;
    }

    @JsonProperty("AddressLine1")
    public void setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
    }

    // AddressLine2
    private String AddressLine2;

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return this.AddressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
    }

    // City
    private String City;

    @JsonProperty("City")
    public String getCity() {
        return this.City;
    }

    @JsonProperty("City")
    public void setCity(String City) {
        this.City = City;
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

    // Country
    private String Country;

    @JsonProperty("Country")
    public String getCountry() {
        return this.Country;
    }

    @JsonProperty("Country")
    public void setCountry(String Country) {
        this.Country = Country;
    }

    // PostalCode
    private String PostalCode;

    @JsonProperty("PostalCode")
    public String getPostalCode() {
        return this.PostalCode;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    // Latitude
    private String Latitude;

    @JsonProperty("Latitude")
    public String getLatitude() {
        return this.Latitude;
    }

    @JsonProperty("Latitude")
    public void setLatitude(String Latitude) {
        this.Latitude = Latitude;
    }

    // Longitude
    private String Longitude;

    @JsonProperty("Longitude")
    public String getLongitude() {
        return this.Longitude;
    }

    @JsonProperty("Longitude")
    public void setLongitude(String Longitude) {
        this.Longitude = Longitude;
    }

    // GeoAccuracyCode
    private String GeoAccuracyCode;

    @JsonProperty("GeoAccuracyCode")
    public String getGeoAccuracyCode() {
        return this.GeoAccuracyCode;
    }

    @JsonProperty("GeoAccuracyCode")
    public void setGeoAccuracyCode(String GeoAccuracyCode) {
        this.GeoAccuracyCode = GeoAccuracyCode;
    }

    // GeoAccuracyNum
    private String GeoAccuracyNum;

    @JsonProperty("GeoAccuracyNum")
    public String getGeoAccuracyNum() {
        return this.GeoAccuracyNum;
    }

    @JsonProperty("GeoAccuracyNum")
    public void setGeoAccuracyNum(String GeoAccuracyNum) {
        this.GeoAccuracyNum = GeoAccuracyNum;
    }


    @Override
    public final SObjectDescription description() {
        return DESCRIPTION;
    }

    private static SObjectDescription createSObjectDescription() {
        final SObjectDescription description = new SObjectDescription();



        final List<SObjectField> fields1 = new ArrayList<>();
        description.setFields(fields1);

        final SObjectField sObjectField1 = createField("Id", "Data.com System ID", "id", "tns:ID", 18, false, false, false, false, false, false, true);
        fields1.add(sObjectField1);
        final SObjectField sObjectField2 = createField("ExternalId", "Data.com Address ID", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField2);
        final SObjectField sObjectField3 = createField("AddressLine1", " Address Line 1 ", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField3);
        final SObjectField sObjectField4 = createField("AddressLine2", " Address Line 2 ", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField4);
        final SObjectField sObjectField5 = createField("City", "City", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField5);
        final SObjectField sObjectField6 = createField("State", "State", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField6);
        final SObjectField sObjectField7 = createField("Country", "Country/Territory", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField7);
        final SObjectField sObjectField8 = createField("PostalCode", "PostalCode", "string", "xsd:string", 255, false, true, false, false, false, false, false);
        fields1.add(sObjectField8);
        final SObjectField sObjectField9 = createField("Latitude", " Latitude ", "string", "xsd:string", 11, false, true, false, false, false, false, false);
        fields1.add(sObjectField9);
        final SObjectField sObjectField10 = createField("Longitude", "Longitude ", "string", "xsd:string", 11, false, true, false, false, false, false, false);
        fields1.add(sObjectField10);
        final SObjectField sObjectField11 = createField("GeoAccuracyCode", " GeoAccuracy Code", "string", "xsd:string", 15, false, true, false, false, false, false, false);
        fields1.add(sObjectField11);
        final SObjectField sObjectField12 = createField("GeoAccuracyNum", " GeoAccuracy Num", "string", "xsd:string", 3, false, true, false, false, false, false, false);
        fields1.add(sObjectField12);

        description.setLabelPlural("Data.com Addresses");
        description.setLabel("Data.com Address");

        final SObjectDescriptionUrls sObjectDescriptionUrls1 = new SObjectDescriptionUrls();
        sObjectDescriptionUrls1.setDescribe("/services/data/v34.0/sobjects/DatacloudAddress/describe");
        sObjectDescriptionUrls1.setSobject("/services/data/v34.0/sobjects/DatacloudAddress");
        sObjectDescriptionUrls1.setRowTemplate("/services/data/v34.0/sobjects/DatacloudAddress/{ID}");
        description.setUrls(sObjectDescriptionUrls1);
        description.setName("DatacloudAddress");

        return description;
    }
}
