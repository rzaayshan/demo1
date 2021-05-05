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
public class Product {

    @JacksonXmlProperty(localName = "AddInfo")
    private AddInfo addInfo;

    @JacksonXmlProperty(localName = "ProductCode1")
    private String productCode1;

    @JacksonXmlProperty(localName = "ProductName")
    private String productName;
}
