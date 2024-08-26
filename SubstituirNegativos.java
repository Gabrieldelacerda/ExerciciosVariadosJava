package com.example;

import java.util.Scanner;

public class SubstituirNegativos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		//Vamos ler os números
		System.out.println("Digite 10 números:");
		for (int i = 0; i < 10; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		//Vamos substituir os números negativos por zero
		for (int i = 0; i < 10; i++) {
			if (numeros[i] < 0) {
				numeros[i] = 0;
			}
		}
		
		//Vamos imprimir o resultado
		System.out.print("O array com números negativos substituídos por zero é: ");
		for (int i = 0; i < 10; i++) {
			System.out.print(numeros[i] + " ");
		}
	}
}
