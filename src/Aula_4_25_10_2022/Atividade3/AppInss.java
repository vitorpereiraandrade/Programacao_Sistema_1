package Aula_4_25_10_2022.Atividade3;

// Esta no slide

import java.util.Scanner;

public class AppInss {
    public static void main(String[] args) {
        System.out.println("Informe o nome: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Informe o salario: ");
        double salarioBruto = scanner.nextDouble();
        double imposto = salarioBruto * (0.11);
        double salarioLiquido = salarioBruto - imposto;
        System.out.println("Nome: "+ nome);
        System.out.printf("Salário bruto R$%,.2f\n", salarioBruto);
        System.out.printf("Salário imposto R$%,.2f\n", imposto);
        System.out.printf("Salário Liquido R$%,.2f\n", salarioLiquido);


    }
}
