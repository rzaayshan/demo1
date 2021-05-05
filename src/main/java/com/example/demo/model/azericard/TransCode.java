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
public class TransCode {

    @JacksonXmlProperty(localName = "MsgCode")
    private String msgCode;

    @JacksonXmlProperty(localName = "ServiceCode")
    private String serviceCode;

    @JacksonXmlProperty(localName = "TransTypeId")
    private String transTypeId;

    @JacksonXmlProperty(localName = "TransTypeCode")
    private String transTypeCode;
}
