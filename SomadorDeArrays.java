package com.example;
import java.util.Scanner;

public class SomadorDeArrays {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		int[] soma = new int[5];
		
		//Vamos ler os elementos do nosso primeiro array
		System.out.println("Digite os elementos do primeiro array:");
		for (int i = 0; i < 5; i++) {
			array1[i] = scanner.nextInt();
		}
		
		//Vamos ler os elementos do nosso segundo array
		System.out.println("Digite os elementos do segundo array:");
		for (int i = 0; i < 5; i++) {
			array2[i] = scanner.nextInt();
		}
		
		//Vamos calcular a soma dos elementos correspondentes
		for (int i = 0; i < 5; i++) {
			soma[i] = array1[i] + array2[i];
		}
		
		//Vamos imprimir o resultado na tela
		System.out.print("A soma dos arrays é: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(soma[i] + " ");
		}
	}
}
