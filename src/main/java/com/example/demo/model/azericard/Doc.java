package com.example.demo.model.azericard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Doc {

    @JacksonXmlProperty(localName = "TransType")
    private TransType transType;

    @JacksonXmlElementWrapper(localName = "DocRefSet")
    @JacksonXmlProperty(localName = "Parm")
    private List<Parm> docRefSet;

    @JacksonXmlProperty(localName = "LocalDt")
    private String localDate;

    @JacksonXmlProperty(localName = "Requestor")
    @Valid
    @NotNull
    private Requestor requestor;

    @JacksonXmlProperty(localName = "Source")
    private Source source;

    @JacksonXmlProperty(localName = "DataRs")
    private DataRs dataRs;

    @JacksonXmlProperty(localName = "Destination")
    private Destination destination;

    @JacksonXmlProperty(localName = "Transaction")
    private Transaction transaction;

    @JacksonXmlProperty(localName = "Description")
    private String description;

}
