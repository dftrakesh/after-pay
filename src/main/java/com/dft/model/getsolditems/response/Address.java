package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
    @JsonProperty("AfterbuyUserID")
    private String afterbuyUserID;

    @JsonProperty("AfterbuyUserIDAlt")
    private String afterbuyUserIDAlt;

    @JsonProperty("UserIDPlattform")
    private String userIDPlatform;

    @JsonProperty("FirstName")
    private String firstName;

    @JsonProperty("LastName")
    private String lastName;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Company")
    private String company;

    @JsonProperty("Street")
    private String street;

    @JsonProperty("Street2")
    private String street2;

    @JsonProperty("PostalCode")
    private String postalCode;

    @JsonProperty("StateOrProvince")
    private String stateOrProvince;

    @JsonProperty("City")
    private String city;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("countryISO")
    private String countryISO;

    @JsonProperty("Phone")
    private String phone;

    @JsonProperty("Fax")
    private String fax;

    @JsonProperty("Mail")
    private String mail;

    @JsonProperty("TaxIDNumber")
    private String taxIDNumber;
}