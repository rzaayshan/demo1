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
public class Destination {

    @JacksonXmlProperty(localName = "ContractNumber")
    private String contractNumber;

    @JacksonXmlProperty(localName = "TransType")
    private Client client;
}
