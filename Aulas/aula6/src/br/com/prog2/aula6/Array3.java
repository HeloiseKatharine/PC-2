/*
Atividade 3 - Criando array
 */
package br.com.prog2.aula6;

import java.util.Scanner;

/**
 *
 * @author Heloise
 */
public class Array3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //array de pessoas
        String[][] pessoas = new String[5][3];

        //Inserindo os dados
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                pessoas[i][j] = teclado.next();
            }
        }
        //exibir os dados

        for (int i = 0; i < pessoas.length; i++) {
            for (int j = 0; j < pessoas[i].length; j++) {
                System.out.print(pessoas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
