package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SoldItem {
    @JsonProperty("ItemID")
    private String itemID;

    @JsonProperty("ItemDetailsDone")
    private String itemDetailsDone;

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

    @JsonProperty("ItemEndDate")
    private String itemEndDate;

    @JsonProperty("TaxRate")
    private String taxRate;

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

    @JsonProperty("ShopProductDetails")
    private ShopProductDetails shopProductDetails;
}