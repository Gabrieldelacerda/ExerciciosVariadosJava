package com.example;

import java.util.Scanner;

public class checaPalindromo {
	public static boolean ePalindromo(String str) {
		
		String strLimpa = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		
		int inicio = 0;
		int fim = strLimpa.length() - 1;
		
		while (inicio < fim) {
			if (strLimpa.charAt(inicio) != strLimpa.charAt(fim)) {
				return false;
			}
			inicio++;
			fim--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Vamos verificar se a sua string é um palíndromo, digite-a: ");
		String entrada = scanner.nextLine();
		
		if (ePalindromo(entrada)) {
			System.out.println("\"" + entrada + "\" é um palíndromo.");
		} else {
			System.out.println("\"" + entrada + "\" não é um palíndromo.");
		}
		
		scanner.close();
	}
}
