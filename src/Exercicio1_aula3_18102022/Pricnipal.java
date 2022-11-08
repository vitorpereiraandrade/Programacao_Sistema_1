/**
 * @author Vitor Andrade
 * @version 1.0
 */

package Exercicio1_aula3_18102022;

import java.util.Scanner;

public class Pricnipal {

    public static void main(String[] args) {     //main
        /* nome matricula fone */
        System.out.println("Informe seu nome: ");
        Scanner scannerNome = new Scanner(System.in);
        String nome = scannerNome.nextLine();        // Pq é String - nextLine

        System.out.println("Informe a matricula: ");
        Scanner scannerMatricula = new Scanner(System.in);
        int matricula = scannerMatricula.nextInt();  //  Pq é inteiro nextInt

        System.out.println("Informe seu telefone: ");
        Scanner scannerFone = new Scanner(System.in);
        int fone = scannerFone.nextInt();


        System.out.println("Nome: "+nome+"\n"+"Matricula: "+matricula+"\n"+"Fone: "+fone);


    }
}
