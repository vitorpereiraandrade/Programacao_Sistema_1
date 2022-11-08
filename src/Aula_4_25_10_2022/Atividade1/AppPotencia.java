package Aula_4_25_10_2022.Atividade1;

// Receba dois numeros "x" e "y"
// Constura um programa em Java que eleve x a potencia de Y
// No mesmo programa, faça que o programa calcule a raiz de x em y

import java.util.Scanner;

public class AppPotencia {
    public static void main(String[] args) {
        double x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o 1º numero inteiro: ");
        x = (double) scanner.nextInt();
        System.out.println("Informe o 2º numero inteiro: ");
        y = (double) scanner.nextInt();

        double potencia = Math.pow(x, y);
        double raiz = Math.pow(x, (1 / y));
        double sqrt = Math.sqrt(x);
        System.out.println("A potencia é: "+ potencia);
        System.out.println("A raiz é: "+ raiz);
        System.out.println("A raiz quadrada é: "+ sqrt);


    }
}
