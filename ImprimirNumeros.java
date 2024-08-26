package com.example;
import java.util.Scanner;

public class ImprimirNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número desejado: ");
		int numero = scanner.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
