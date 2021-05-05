package com.example.demo.model.azericard;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Requestor {

    @JacksonXmlProperty(localName = "RBSNumber")
    private String rbsNumber;

    @JacksonXmlProperty(localName = "ContractNumber")
    @NotNull
    private String contractNumber;
}
