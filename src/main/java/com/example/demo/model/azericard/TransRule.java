package com.example.demo.model.azericard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TransRule {

    @JacksonXmlProperty(localName = "ParmCode")
    private String parmCode;

    @JacksonXmlProperty(localName = "Value")
    private String value;
}
