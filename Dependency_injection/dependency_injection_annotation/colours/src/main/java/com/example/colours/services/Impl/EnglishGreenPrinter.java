package com.example.colours.services.Impl;

import com.example.colours.services.GreenPrinter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier
@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "Green";
    }
}
