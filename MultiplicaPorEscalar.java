package com.example;
import java.util.Scanner;

public class MultiplicaPorEscalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao programa de gdelacerda23, vamos criar uma matriz, mas dessa vez multiplicaremos.");

        int[][] matriz = new int[3][3];
        System.out.println("Matriz 3x3 criada.");

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                System.out.println("Elemento matriz[" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }
        
        System.out.println("Digite o valor do escalar para multiplicar a matriz:");
        int escalar = scanner.nextInt();
        System.out.println("Escalar lido: " + escalar);

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int resultado = matriz[i][j] * escalar;
                System.out.print(resultado + " ");
                System.out.println("Elemento matriz[" + i + "][" + j + "] multiplicado: " + resultado);
            }
            System.out.println();
        }
    }
}
