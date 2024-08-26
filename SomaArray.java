package com.example;

import java.util.Scanner;

public class SomaArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int soma = 0;
		
		//Vamos ler os números
		System.out.println("Digite seus 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		//Vamos calcular a soma
		for (int numero : numeros) {
			soma += numero;
		}
		//Vamos imprimir a soma
		System.out.println("A soma dos números é: " + soma);
		
		scanner.close();
	}
}
