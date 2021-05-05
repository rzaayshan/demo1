package com.example.demo.model.azericard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransType {

    @JacksonXmlProperty(localName = "TransCode")
    private TransCode transCode;

    @JacksonXmlProperty(localName = "TransCondition")
    private String transCondition;

    @JacksonXmlElementWrapper(localName = "TransRules")
    @JacksonXmlProperty(localName = "TransRule")
    private List<TransRule> transRules;
}
