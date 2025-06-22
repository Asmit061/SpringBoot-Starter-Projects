package com.example.colours.services.Impl;

import com.example.colours.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class  SpanishBluePrinter implements BluePrinter {

    public String print(){
        return "Azul";
    }
}
