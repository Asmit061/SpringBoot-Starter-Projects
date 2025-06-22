package com.example.colours.config;

import com.example.colours.services.BluePrinter;
import com.example.colours.services.ColourPrinter;
import com.example.colours.services.GreenPrinter;
import com.example.colours.services.Impl.*;
import com.example.colours.services.RedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter(){
        return new SpanishRedPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new SpanishBluePrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter){
        return new ColourPrinterImpl(redPrinter,greenPrinter,bluePrinter);
    }
}
