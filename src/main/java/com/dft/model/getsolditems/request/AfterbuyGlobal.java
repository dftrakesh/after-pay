package com.dft.model.getsolditems.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AfterbuyGlobal {

    @JsonProperty("CallName")
    private String callName;

    @JsonProperty("DetailLevel")
    private String detailLevel;

    @JsonProperty("ErrorLanguage")
    private String errorLanguage;

    @JsonProperty("PartnerID")
    private String partnerID;

    @JsonProperty("PartnerPassword")
    private String partnerPassword;

    @JsonProperty("UserID")
    private String userID;

    @JsonProperty("UserPassword")
    private String userPassword;
}