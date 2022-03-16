package com.calculatorspring.calculatorspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//Cargamos los paquetes para que funcione la aplicacion :
@ComponentScan(basePackages = {"com.calculatorspring.calculatorspring.*"})
public class CalculatorspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorspringApplication.class, args);
	}

}
