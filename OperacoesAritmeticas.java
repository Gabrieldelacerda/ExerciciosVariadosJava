package com.example;

import java.util.Scanner;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de gdelacerda23 em Java.");
        System.out.print("Insira o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Insira o segundo número: ");
        double num2 = scanner.nextDouble();

        double adicao = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("Adição: " + adicao);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if (num2 != 0) {
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }

        scanner.close();
    }
}
