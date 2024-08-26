package com.example;

import java.util.Scanner;

public class SomaDiagonalPrincipal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Inicializa uma matriz 3x3
        int[][] matriz = new int[3][3];
        
        // Variável para armazenar a soma da diagonal principal
        int somaDiagonal = 0;
        
        // Loop para preencher a matriz com os valores fornecidos pelo usuário
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) { // Itera sobre as linhas
            for (int j = 0; j < 3; j++) { // Itera sobre as colunas
                matriz[i][j] = scanner.nextInt(); // Lê o elemento da matriz
                // Se o elemento estiver na diagonal principal, soma-o
                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }
        
        // Exibe a soma dos elementos da diagonal principal
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonal);
    }
}
