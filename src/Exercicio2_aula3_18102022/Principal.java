package Exercicio2_aula3_18102022;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        /*Faca um programa Java que solicite dois numeros ao usuario e Calcule a média e exiba o resultado */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        int n1 = scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        int n2 = scanner.nextInt();

        System.out.println("Média é: "+ (n1+n2)/2);

    }
}
