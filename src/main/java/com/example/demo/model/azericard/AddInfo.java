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
public class AddInfo {

    @JacksonXmlProperty(localName = "Parm")
    private Parm parm;

    @JacksonXmlProperty(localName = "ClientName")
    private String clientName;

//    private AddInfoGDto addInfoG;

}
