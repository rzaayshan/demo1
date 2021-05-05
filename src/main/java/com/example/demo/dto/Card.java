package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Card {
    private String rbsNumber;
    private String issuingProductCode;
    private String cardExpiryDate;
    private String productCode;
    private CardHolderDetails cardHolderDetails;
}
