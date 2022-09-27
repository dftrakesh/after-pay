package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty("HasMoreItems")
    private Integer hasMoreItems;

    @JsonProperty("Orders")
    private Orders orders;

    @JsonProperty("OrdersCount")
    private Integer ordersCount;

    @JsonProperty("LastOrderID")
    private String lastOrderID;

    @JsonProperty("ItemsCount")
    private Integer itemsCount;

    @JsonProperty("ErrorList")
    private ErrorList errorList;
}