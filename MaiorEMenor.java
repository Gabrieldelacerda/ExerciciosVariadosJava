package com.example;
import java.util.Scanner;

public class MaiorEMenor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		//Vamos ler os números
		System.out.println("Digite os seus 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		//Vamos encontrar o maior e menor
		int maior = numeros[0];
		int menor = numeros[0];
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		//Vamos imprimir os resultados
		System.out.println("O maior número que temos é: " + maior);
		System.out.println("O menor número que temos é: " + menor);
		
		scanner.close();
	}
}
