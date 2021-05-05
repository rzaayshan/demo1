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
public class DataType {

    @JacksonXmlProperty(localName = "Client")
    private Client client;

    @JacksonXmlProperty(localName = "Contract")
    private Contract contract;
}
