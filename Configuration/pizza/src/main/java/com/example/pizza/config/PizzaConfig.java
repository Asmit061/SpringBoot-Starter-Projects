package com.example.pizza.config;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("pizza")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PizzaConfig {

    private String sauce;
    private String topping;
    private String crust;
}
