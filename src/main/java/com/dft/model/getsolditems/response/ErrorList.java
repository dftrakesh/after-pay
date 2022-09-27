package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public class ErrorList {
    @JsonProperty("Error")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Error> error;
}
