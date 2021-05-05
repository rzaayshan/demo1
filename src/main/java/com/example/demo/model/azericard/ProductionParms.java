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
public class ProductionParms {

    @JacksonXmlProperty(localName = "CardExpiry")
    private String cardExpiry;

    @JacksonXmlProperty(localName = "SequenceNumber")
    private String sequenceNumber;

    @JacksonXmlProperty(localName = "SecurityParms")
    private SecurityParms securityParms;
}
