package Aula_5_01_11_2022;

import javax.swing.*;

public class VetorFuncionario {
    // Registre o nome, salario do funcionario e o nome dos dependentes.
    // Exiba no final as informaçoes e um acréscimo de R$ 20,00 por dependente ao salário

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do Funcionário: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário do Funcionário: "));
        int qtdDependentes = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dependentes: "));

        String[] nomeDependentes = new String[qtdDependentes];
        double salarioFamilia = 0;
        for (int i = 0; i < qtdDependentes; i++) {
            nomeDependentes[i] = JOptionPane.showInputDialog("Informe o nome do "+(i+1)+" dependente");
            salarioFamilia+=20;   // que é igual salarioFamilia = salarioFamilia + 20;
        }

        System.out.println("Funcionário: "+ nome);
        for (int i = 0; i < qtdDependentes; i++) {
            System.out.println("Dependentes "+i+": "+nomeDependentes[i]);
        }

        System.out.println("Salário: R$"+(salario+salarioFamilia));


    }
}
