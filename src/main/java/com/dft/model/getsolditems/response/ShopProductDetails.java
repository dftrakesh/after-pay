package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShopProductDetails {

    @JsonProperty("ProductID")
    private String productID;

    @JsonProperty("EAN")
    private String EAN;

    @JsonProperty("Anr")
    private String anr;

    @JsonProperty("UnitOfQuantity")
    private String unitOfQuantity;

    @JsonProperty("BasepriceFactor")
    private String basepriceFactor;
}
