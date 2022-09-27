package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentInfo {
    @JsonProperty("PaymentID")
    private String paymentId;

    @JsonProperty("PaymentMethod")
    private String paymentMethod;

    @JsonProperty("PaymentDate")
    private String paymentDate;

    @JsonProperty("AlreadyPaid")
    private String alreadyPaid;

    @JsonProperty("FullAmount")
    private String fullAmount;

    @JsonProperty("InvoiceDate")
    private String invoiceDate;

    @JsonProperty("PaymentFunction")
    private String paymentFunction;

    @JsonProperty("PaymentData")
    private PaymentData paymentData;
}