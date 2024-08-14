package com.example;

public class SequenciaDeFibonacci {
	public static void main(String[] args) {
		int n = 10;   //Essa configuração nos dá quantos números Fibonacci serão impressos
		int primeiro = 0;
		int segundo = 1;
		
		System.out.println("Primeiros " + n + " números da sequência de Fibonacci:");
		
		for (int i = 0; i < n; i++) {
			System.out.print(primeiro + " ");
			int proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
		}
		
		System.out.println(); //Segue para a próxima linha
	}	
}
