package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BuyerInfo {
    @JsonProperty("BillingAddress")
    private Address billingAddress;

    @JsonProperty("ShippingAddress")
    private Address shippingAddress;
}