package com.dft.model.getsolditems.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class Request {

    @JsonProperty("RequestAllItems")
    private Integer requestAllItems;

    @JsonProperty("ReturnHiddenItems")
    private Integer returnHiddenItems;

    @JsonProperty("AfterbuyGlobal")
    private AfterbuyGlobal afterbuyGlobal;

    @JsonProperty("DataFilter")
    private DataFilter dataFilter;
}