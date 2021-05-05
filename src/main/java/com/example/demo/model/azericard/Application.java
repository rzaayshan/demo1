package com.example.demo.model.azericard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Application {

    @JacksonXmlProperty(localName = "RegNumber")
    private String regNumber;

    @JacksonXmlProperty(localName = "Institution")
    private String institution;

    @JacksonXmlProperty(localName = "OrderDprt")
    private String orderDprt;

    @JacksonXmlProperty(localName = "ObjectType")
    private String objectType;

    @JacksonXmlProperty(localName = "ActionType")
    private String actionType;

    @JacksonXmlElementWrapper(localName = "ResultDtls")
    @JacksonXmlProperty(localName = "Parm")
    private List<Parm> resultDtls;

    @JacksonXmlProperty(localName = "ObjectFor")
    private ObjectFor objectFor;

    @JacksonXmlProperty(localName = "Data")
    private DataType data;

    @JacksonXmlProperty(localName = "AddData")
    private AddData addData;

    @JacksonXmlProperty(localName = "SubApplList")
    private SubApplList subApplList;

    @JacksonXmlProperty(localName = "Status")
    private Status status;

    @JacksonXmlProperty(localName = "DataRs")
    private DataRs dataRs;
}
