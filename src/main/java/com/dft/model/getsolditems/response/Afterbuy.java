package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Afterbuy {
    
    @JsonProperty("CallStatus")
    private String callStatus;

    @JsonProperty("CallName")
    private String callName;

    @JsonProperty("Result")
    private Result result;
}