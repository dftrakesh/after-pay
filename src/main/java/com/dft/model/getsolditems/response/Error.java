package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Error {

    @JsonProperty("ErrorCode")
    private String errorCode;

    @JsonProperty("ErrorLongDescription")
    private String errorLongDescription;

    @JsonProperty("ErrorDescription")
    private String errorDescription;
}
