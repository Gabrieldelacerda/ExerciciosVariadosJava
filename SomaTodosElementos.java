package com.example;
import java.util.Scanner;

public class SomaTodosElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de gdelacerda23, vamos criar uma matriz!");

        int[][] matriz = new int[3][3];
        System.out.println("Matriz 3x3 criada.");

        int somaTotal = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                System.out.println("Elemento matriz[" + i + "][" + j + "] = " + matriz[i][j]);

                somaTotal += matriz[i][j];
                System.out.println("Soma atualizada: " + somaTotal);
            }
        }
        System.out.println("A soma de todos os elementos da matriz é: " + somaTotal);
    }
}
