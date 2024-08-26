package com.example;

import java.util.Scanner;

public class ConversaoDeTemperaturas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Celsius: ");
		double celsius = scanner.nextDouble();
		
		//Conversões
		double fahrenheit = celsius * 1.8 + 32;
		double kelvin = celsius + 273.15;
		double reaumur = celsius * 0.8;
		double rankine = celsius * 1.8 + 32 + 459.67;
		
		System.out.printf("Temperatura em Fahrenheit: %.2f F%n", fahrenheit);
		System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);
		System.out.printf("Temperatura em Réaumur: %.2f Re%n", reaumur);
		System.out.printf("Temperatura em Rankine: %.2f Ra%n", rankine);
		
		//Fechando o scanner
		scanner.close();
	}
}
