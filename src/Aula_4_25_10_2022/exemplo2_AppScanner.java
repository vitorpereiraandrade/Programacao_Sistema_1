package Aula_4_25_10_2022;

import java.util.Scanner;

public class exemplo2_AppScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);

    }
}
