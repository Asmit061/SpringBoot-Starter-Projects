package com.example.colours.services.Impl;

import com.example.colours.services.GreenPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
@Component
public class SpanishGreenPrinter implements GreenPrinter {

    public String print(){
        return "Verde";
    }
}
