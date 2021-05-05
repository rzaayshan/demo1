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
public class Transaction {

    @JacksonXmlProperty(localName = "Currency")
    private String currency;

    @JacksonXmlProperty(localName = "Amount")
    private String amount;

    @JacksonXmlProperty(localName = "Extra")
    private Extra extra;

}
