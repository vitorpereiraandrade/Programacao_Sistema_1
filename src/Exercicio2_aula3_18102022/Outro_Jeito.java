package Exercicio2_aula3_18102022;

import java.util.Scanner;

public class Outro_Jeito {
    public static void main(String[] args) {
        /*Faca um programa Java que solicite dois numeros ao usuario e Calcule a média e exiba o resultado */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        float n1 = scanner.nextFloat();
        System.out.println("Informe o segundo numero: ");
        float n2 = scanner.nextFloat();
        float media = (n1+n2)/2;

        System.out.println("Média entre "+n1+" e "+n2+" é: "+media);
    }
}
