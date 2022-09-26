package com.dft.model.getsolditems.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FilterValues {

    @JsonProperty("DateFrom")
    private String dateFrom;

    @JsonProperty("DateTo")
    private String dateTo;

    @JsonProperty("FilterValue")
    @JacksonXmlElementWrapper(namespace = "FilterValue", useWrapping = false)
    private List<String> filterValueList;
}