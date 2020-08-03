/*
 Atividade 3 - Trabalhando com if-else e switch - 10 minutos
Objetivo: entender o funcionamento das estruturas de seleção.
1 - Crie uma classe com método main.
2 - Dentro do método main, leia do teclado o conceito do aluno (A, B, C, D, E
ou F) e o valor da mensalidade. 
3 - Calcule o valor do desconto, de acordo o conceito do aluno usando if-else. 
4 - Calcule o valor do desconto, de acordo o conceito do aluno usando switch. 
5 - Em ambos os casos (item 3 e 4), exiba o conceito do aluno, valor do
desconto, o valor sem desconto e valor a pagar, considerando o desconto.
 */
package aula5;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author heloh
 */
public class Mensalidade {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        char conceito;
        float valor;
        float valor_desconto = 0;
        System.out.println("Conceito: ");
        conceito = (char) System.in.read();
        System.out.println("Valor da mensalidade: ");
        valor = teclado.nextFloat();

        //3 - Calcule o valor do desconto, de acordo o conceito do aluno usando if-else. 
        valor_desconto = valor;//o valor sem desconto
        System.out.println("o valor sem desconto = " + valor_desconto);

        if (conceito == 'A') {
            valor = (float) (valor * 0.5);
            valor_desconto = valor_desconto - valor;//valor do desconto
        } else if (conceito == 'B') {
            valor = (float) (valor * 0.6);
            valor_desconto = valor_desconto - valor;//valor do desconto 
        } else if (conceito == 'C') {
            valor = (float) (valor * 0.7);
            valor_desconto = valor_desconto - valor;//valor do desconto 
        } else if (conceito == 'D') {
            valor = (float) (valor * 0.8);
            valor_desconto = valor_desconto - valor;//valor do desconto
        } else if (conceito == 'E') {
            valor = (float) (valor * 0.9);
            valor_desconto = valor_desconto - valor;//valor do desconto 
        } else if (conceito == 'F') {
            valor = valor;
        } else {
            System.out.println("Conceito desconhecido");
        }

        //4 - Calcule o valor do desconto, de acordo o conceito do aluno usando switch. 
        /*valor_desconto = valor;//o valor sem desconto
        System.out.println("o valor sem desconto = " + valor_desconto);

        switch (conceito) {
            case 'A':
                valor = (float) (valor * 0.5);
                valor_desconto = valor_desconto - valor;//valor do desconto 
                break;
            case 'B':
                valor = (float) (valor * 0.6);
                valor_desconto = valor_desconto - valor;//valor do desconto 
                break;
            case 'C':
                valor = (float) (valor * 0.7);
                valor_desconto = valor_desconto - valor;//valor do desconto 
                break;
            case 'D':
                valor = (float) (valor * 0.8);
                valor_desconto = valor_desconto - valor;//valor do desconto 
                break;
            case 'E':
                valor = (float) (valor * 0.9);
                valor_desconto = valor_desconto - valor;//valor do desconto 
                break;
            case 'F':
                valor = valor;
                break;
            default:
                System.out.println("Conceito desconhecido");
        }*/
        System.out.println("valor do desconto = " + valor_desconto);
        System.out.println("Conceito = " + conceito);
        System.out.println("Valor da mensalidade: " + valor);
    }

}
