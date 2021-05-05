package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CardHolderDetails {
    private String plasticFirstName;
    private String plasticLastName;
    private String clientCompanyName;
}
