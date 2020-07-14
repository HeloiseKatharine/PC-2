/*
Atividade 4 - Trabalhando com a classe Arrays
 */
package br.com.prog2.aula6;

import java.util.Arrays;

/**
 *
 * @author Heloise
 */
public class Array4 {

    public static void main(String[] args) {

        int[] numeros = new int[5];

        //atribuindo valores
        numeros[0] = 40;
        numeros[1] = 30;
        numeros[2] = 26;
        numeros[3] = 56;
        numeros[4] = 10;

        //Imprimindo os valores do array
        for (byte i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //Ordenando o array
        Arrays.sort(numeros);

        // //Imprimindo os valores do array novamente
        System.out.println("\nOrdenados:");
        for (byte i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //buscando o elemento 40
        System.out.println("\nbuscando o elemento 40:");
        System.out.println(Arrays.binarySearch(numeros, 40));

        //buscando o elemento 89
        System.out.println("\nbuscando o elemento 89:");
        System.out.println(Arrays.binarySearch(numeros, 89));

        int[] numeros1 = new int[6];
        int[] numeros2 = new int[6];
        
        //atribuindo valores
        Arrays.fill(numeros1, 45);
        Arrays.fill(numeros2, 46);
        
        //Verificando se os dois são iguais
        System.out.println("Os dois são iguais?");
        System.out.println(Arrays.equals(numeros1, numeros2));

    }
}
