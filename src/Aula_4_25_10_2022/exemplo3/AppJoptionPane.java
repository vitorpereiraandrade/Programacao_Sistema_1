package Aula_4_25_10_2022.exemplo3;

import javax.swing.*;

public class AppJoptionPane {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null, "Informe o nome: ", "Entrada de nome", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Nome: "+ nome, "Resposta do nome", JOptionPane.WARNING_MESSAGE);
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informar a idade: "));  // Precisa por Interger pra converter quando é inteiro
        JOptionPane.showMessageDialog(null, "Idade: "+ idade);

    }
}
