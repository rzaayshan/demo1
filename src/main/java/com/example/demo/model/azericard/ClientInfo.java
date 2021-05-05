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
public class ClientInfo {

    @JacksonXmlProperty(localName = "ClientNumber")
    private String clientNumber;

    @JacksonXmlProperty(localName = "RegNumber")
    private String regNumber;

    @JacksonXmlProperty(localName = "ShortName")
    private String shortName;

    @JacksonXmlProperty(localName = "FirstName")
    private String firstName;

    @JacksonXmlProperty(localName = "LastName")
    private String lastName;

    @JacksonXmlProperty(localName = "SecurityName")
    private String securityName;

    @JacksonXmlProperty(localName = "Country")
    private String country;

    @JacksonXmlProperty(localName = "Language")
    private String language;

    @JacksonXmlProperty(localName = "BirthDate")
    private String birthDate;

    @JacksonXmlProperty(localName = "CompanyName")
    private String companyName;
}
