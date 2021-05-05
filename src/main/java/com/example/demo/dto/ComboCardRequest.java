package com.example.demo.dto;

import com.example.demo.model.azericard.Parm;
import java.util.Arrays;
import java.util.List;
import lombok.Data;

@Data
public class ComboCardRequest {
    String localBranchCode;
    List<Parm> list = Arrays.asList(new Parm("n","v"), new Parm("n","v"), new Parm("n","v"));
    Card mainCard;
    Card subCard;
}
