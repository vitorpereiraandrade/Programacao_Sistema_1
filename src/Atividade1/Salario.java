
package Atividade1;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        System.out.println("Informe o salário bruto R$ " );
        Scanner scannerSalario = new Scanner(System.in);
        float salario = scannerSalario.nextFloat();

        System.out.println("Informe o percentual de desconto: ");
        Scanner scannerPercentualDesconto = new Scanner(System.in);
        int percentualDesconto = scannerPercentualDesconto.nextInt();

        float valorDesconto = (salario * percentualDesconto) / 100;
        float salarioLiquido = salario - valorDesconto;

        System.out.println("O salário bruto do funcionário R$"+salario);
        System.out.println("O valor do desconto é de R$"+valorDesconto);
        System.out.println("O salário líquido R$"+salarioLiquido);
    }
}
