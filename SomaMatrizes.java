package com.example;

import java.util.Scanner;

public class SomaMatrizes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Vamos criar duas matrizes 2x2
		int[][] matriz1 = new int[2][2];
		int[][] matriz2 = new int[2][2];
		int[][] soma = new int[2][2];
		
		//Vamos ler os elementos da primeira matriz
		System.out.println("Digite os elementos da primeira matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz1[i][j] = scanner.nextInt();
			}
		}
		
		//Segunda Matriz
		System.out.println("Digite os elementos da segunda matriz 2x2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				matriz2[i][j] = scanner.nextInt();
			}
		}
		
		//Soma
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				soma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}
		
		//Vamos imprimir a matriz resultante da soma
		System.out.println("Matriz resultante da soma:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(soma[i][j] + " ");
			}
			System.out.println();
		}
	}
}
