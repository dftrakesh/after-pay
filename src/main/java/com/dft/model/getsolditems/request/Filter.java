package com.dft.model.getsolditems.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Filter {

    /**
     * Possible values: RangeID, DateFilter, OrderID, Platform, DefaultFilter, AfterbuyUserID, UserDefinedFlag,
     *                  AfterbuyUserEmail, ShopId, Day, InvoiceNumber, AlternativeItemNumber1
     */
    @JsonProperty("FilterName")
    private String filterName;

    @JsonProperty("FilterValues")
    private FilterValues filterValues;
}