package com.example;

import java.util.Scanner;

public class TabuadaDoNumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem vindo(a) ao programa de tabuada de gdelacerda23");
		System.out.println("Digite um número para poder ver sua tabuada: ");
		int numero = scanner.nextInt();
		
		System.out.println("Tabuada de: " + numero + ":");
		
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;
			System.out.println(numero + " x " + i + " = " + resultado);
		}
		
		scanner.close();
	}
}
