package com.example;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int soma = 0;
		int numero;
		
		System.out.println("Digite uma série de números. Para finalizar e poder ver a soma, digite 0.");
		
		do {
			System.out.print("Digite o número que deseja: ");
			numero = scanner.nextInt();
			soma += numero;
		} while (numero != 0);
		
		System.out.println("A soma dos números digitados é: " + soma);
		scanner.close();
	}
}
