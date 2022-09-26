package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JacksonXmlRootElement(localName = "Afterbuy")
public class GetSoldItemsResponse {
    
    @JsonProperty("CallStatus")
    private String callStatus;

    @JsonProperty("CallName")
    private String callName;

    @JsonProperty("Result")
    private Result result;
}