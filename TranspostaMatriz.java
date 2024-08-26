package com.example;

import java.util.Scanner;

public class TranspostaMatriz {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		
		System.out.println("Digite os elementos da matriz 3x3:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Matriz transposta:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[j][i] + " ");
			}
			System.out.println();
		}
	}
}
