package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentData {

    @JsonProperty("BankCode")
    private String bankCode;

    @JsonProperty("AccountHolder")
    private String accountHolder;

    @JsonProperty("BankName")
    private String bankName;

    @JsonProperty("AccountNumber")
    private String accountNumber;

    @JsonProperty("Iban")
    private String iban;

    @JsonProperty("Bic")
    private String bic;

    @JsonProperty("ReferenceNumber")
    private String referenceNumber;
}
