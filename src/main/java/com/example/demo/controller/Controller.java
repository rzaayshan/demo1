package com.example.demo.controller;

import com.example.demo.dto.Card;
import com.example.demo.dto.CardHolderDetails;
import com.example.demo.dto.ComboCardRequest;
import com.example.demo.mapper.ComboCardMapper;
import com.example.demo.mapper.CycleAvoidingMappingContext;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
@AllArgsConstructor
public class Controller {
    private final ComboCardMapper mapper;


    @GetMapping()
    public String get(){
        ComboCardRequest comboCardRequest = new ComboCardRequest();
        comboCardRequest.setMainCard(new Card("d","f","d","d",new CardHolderDetails("n","d","c")));
        return mapper.requestToUFXMsg(comboCardRequest).toString();
    }
}
