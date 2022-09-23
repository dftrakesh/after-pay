package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingInfo {

    @JsonProperty("ShippingMethod")
    private String shippingMethod;

    @JsonProperty("ShippingCost")
    private String shippingCost;

    @JsonProperty("ShippingAdditionalCost")
    private String shippingAdditionalCost;

    @JsonProperty("ShippingTotalCost")
    private String shippingTotalCost;

    @JsonProperty("ShippingTaxRate")
    private String shippingTaxRate;

    @JsonProperty("DeliveryDate")
    private String deliveryDate;
}