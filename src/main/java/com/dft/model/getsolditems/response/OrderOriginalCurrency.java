package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OrderOriginalCurrency {

    @JsonProperty("EbayShippingAmount")
    private String ebayShippingAmount;

    @JsonProperty("PaymentSurcharge")
    private String paymentSurcharge;

    @JsonProperty("PaymentSurchargePerCent")
    private String paymentSurchargePerCent;

    @JsonProperty("InvoiceAmount")
    private String invoiceAmount;

    @JsonProperty("ExchangeRate")
    private String exchangeRate;

    @JsonProperty("PayedAmount")
    private String paidAmount;

    @JsonProperty("ShippingAmount")
    private String shippingAmount;
}
