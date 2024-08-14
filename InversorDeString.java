package com.example;

import java.util.Scanner;

public class InversorDeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira uma string qualquer: ");
		String entrada = scanner.nextLine();
		
		String StringInvertida = inverterString(entrada);
		
		System.out.println("String invertida: " + StringInvertida);
		
		scanner.close();
	}
	
	//Função para inverter a string
	public static String inverterString(String entrada) {
		StringBuilder invertida = new StringBuilder(entrada);
		return invertida.reverse().toString();
	}
}
