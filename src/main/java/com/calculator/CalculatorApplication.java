package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		double a=0;
		double b=0;
		double result=0;

		Calculator calc = new Calculator();
		result=calc.calcAdd(2,7);
		System.out.println(result);
		result=calc.calcmultiplication(3,4);
		System.out.println(result);

	}
}
