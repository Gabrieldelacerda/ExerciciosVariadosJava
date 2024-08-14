package com.example;

import java.util.Scanner;

public class MaiorElementoArray {
	public static int encontrarMaiorElemento(int[] array) {
		int maior = array[0];
		
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o tamanho da array: ");
		int tamanho = scanner.nextInt();
		
		int[] array = new int[tamanho];
		
		System.out.println("Digite os elementos da array:");
		for (int i = 0; i < tamanho; i++) {
			array[i] = scanner.nextInt();
		}
		
		int maiorElemento = encontrarMaiorElemento(array);
		System.out.println("O maior elemento da array é: " + maiorElemento);
		
		scanner.close();
	}	
}
