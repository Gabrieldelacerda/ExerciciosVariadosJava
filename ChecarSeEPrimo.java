package com.example;

import java.util.Scanner;

public class ChecarSeEPrimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		int numero = scanner.nextInt();
		
		if (ePrimo(numero)) {
			System.out.println(numero + " é um número primo.");
		} else {
			System.out.println(numero + " não é um número primo.");
		}
		
		scanner.close();
	}
	
	
	//Nossa função para checarmos se o número é primo ou não.
	public static boolean ePrimo(int numero) {
		if (numero <= 1) {
			return false;    //Menor ou igual a 1 não é primo
		}
		
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			if (numero % i == 0) {
				return false;  //Número é divisível por outro número
			}
		}
		
		
		return true;
	}
}
