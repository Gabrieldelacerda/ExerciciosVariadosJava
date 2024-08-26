package com.example;
import java.util.Scanner;

public class ArrayEmOrdemInversa {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[10];
		
		//Vamos ler os números!
		System.out.println("Digite os seus 10 números:");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		
		//Vamos imprimir na ordem inversa.
		System.out.println("Os números na ordem inversa:");
		for (int i = numeros.length -1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
		
		scanner.close();
	}
}
