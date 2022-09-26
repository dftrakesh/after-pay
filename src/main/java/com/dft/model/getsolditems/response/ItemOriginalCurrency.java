package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ItemOriginalCurrency {

    @JsonProperty("ItemPrice")
    private String itemPrice;

    @JsonProperty("ItemShipping")
    private String itemShipping;

    @JsonProperty("ItemPriceCode")
    private String itemPriceCode;
}
