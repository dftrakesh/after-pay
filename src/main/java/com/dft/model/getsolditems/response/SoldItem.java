package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SoldItem {
    @JsonProperty("ItemID")
    private Long itemID;

    @JsonProperty("ItemDetailsDone")
    private Integer itemDetailsDone;

    @JsonProperty("AlternativeItemNumber1")
    private String alternativeItemNumber1;

    @JsonProperty("AlternativeItemNumber")
    private String alternativeItemNumber;

    @JsonProperty("Anr")
    private String anr;

    @JsonProperty("IsAmazonInvoiced")
    private String isAmazonInvoiced;

    @JsonProperty("IsExternalInvoice")
    private String isExternalInvoice;

    @JsonProperty("PlatformSpecificOrderId")
    private String platformSpecificOrderId;

    @JsonProperty("eBayTransactionID")
    private Long eBayTransactionID;

    @JsonProperty("eBayPlusTransaction")
    private String eBayPlusTransaction;

    @JsonProperty("IsAmazonPrime")
    private String isAmazonPrime;

    @JsonProperty("IsAmazonBusiness")
    private String isAmazonBusiness;

    @JsonProperty("FulfillmentServiceLevel")
    private Integer fulfillmentServiceLevel;

    @JsonProperty("InternalItemType")
    private Integer internalItemType;

    @JsonProperty("ItemTitle")
    private String itemTitle;

    @JsonProperty("ItemQuantity")
    private Integer itemQuantity;

    @JsonProperty("ItemPrice")
    private String itemPrice;

    @JsonProperty("ItemOriginalCurrency")
    private ItemOriginalCurrency itemOriginalCurrency;

    @JsonProperty("ItemEndDate")
    private String itemEndDate;

    @JsonProperty("TaxRate")
    private String taxRate;

    @JsonProperty("TaxCollectedBy")
    private Integer taxCollectedBy;

    @JsonProperty("ItemWeight")
    private String itemWeight;

    @JsonProperty("ItemXmlDate")
    private String itemXmlDate;

    @JsonProperty("ItemLink")
    private String itemLink;

    @JsonProperty("ItemPlatformName")
    private String itemPlatformName;

    @JsonProperty("ItemModDate")
    private String itemModDate;

    @JsonProperty("eBayFeedbackCompleted")
    private Integer eBayFeedbackCompleted;

    @JsonProperty("eBayFeedbackReceived")
    private Integer eBayFeedbackReceived;
}