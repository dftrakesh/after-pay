package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Order {
    @JsonProperty("InvoiceNumber")
    private String invoiceNumber;

    @JsonProperty("OrderID")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> orderIDList;

    @JsonProperty("Anr")
    private String anr;

    @JsonProperty("FeedbackDate")
    private String feedbackDate;

    @JsonProperty("UserComment")
    private String userComment;

    @JsonProperty("AdditionalInfo")
    private String additionalInfo;

    @JsonProperty("FeedbackLink")
    private String feedbackLink;

    @JsonProperty("OrderDate")
    private String orderDate;

    @JsonProperty("OrderIDAlt")
    private String orderIDAlt;

    @JsonProperty("PaymentInfo")
    private PaymentInfo paymentInfo;

    @JsonProperty("BuyerInfo")
    private BuyerInfo buyerInfo;

    @JsonProperty("SoldItems")
    private SoldItems soldItems;

    @JsonProperty("ShippingInfo")
    private ShippingInfo shippingInfo;

    @JsonProperty("Tags")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Tag> tags;

    @JsonProperty("IsCheckoutConfirmedByCustomer")
    private Integer isCheckoutConfirmedByCustomer;
}