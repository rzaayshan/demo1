package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCode {

    private String respCode;
    private String respText;

    public String toString() {
        return String.format("%s (%s)", respText, respCode);
    }
}
