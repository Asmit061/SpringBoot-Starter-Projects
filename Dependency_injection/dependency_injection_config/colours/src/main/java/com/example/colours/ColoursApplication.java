package com.example.colours;

import com.example.colours.services.ColourPrinter;
import com.example.colours.services.Impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log
public class ColoursApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter){
		this.colourPrinter=colourPrinter;
	}
	public static void main(String[] args) {

		SpringApplication.run(ColoursApplication.class, args);
	}

	public void run(String... args) throws Exception {
		log.info(colourPrinter.print());
	}
}
