package com.dft.model.getsolditems.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SoldItems {
    @JsonProperty("SoldItem")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<SoldItem> soldItemList;

    @JsonProperty("ItemsInOrder")
    private Integer itemsInOrder;
}