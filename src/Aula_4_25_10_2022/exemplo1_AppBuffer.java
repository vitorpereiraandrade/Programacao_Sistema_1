package Aula_4_25_10_2022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exemplo1_AppBuffer {
    public static void main(String[] args) {
        try {
            System.out.println("Informe o seu nome: ");
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String nome = bufferedReader.readLine();
            System.out.println("Informe sua idade: ");
            int idade = Integer.parseInt(bufferedReader.readLine());

            System.out.println("Nome: "+ nome);
            System.out.println("Idade: "+ idade);

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
