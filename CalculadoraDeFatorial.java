package com.example;

import java.util.Scanner;

public class CalculadoraDeFatorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = scanner.nextInt();
		
		if (numero < 0) {
			System.out.println("Fatorial não pode ser definido para números negativos!");
		} else {
			long factorial = 1;
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
			}
			System.out.println("O fatorial de " + numero + " é: " + factorial);
		}
		
		scanner.close();
	}
}
