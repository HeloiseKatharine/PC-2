/*
Atividade 6 - Exercitando tratamento de exceção
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class TesteExcecao2 {

    public static void main(String[] args) {
        /*int numero = 8 //7;

        try {
            if (numero % 2 != 0) {
                throw new ResultadoNegativoException("Número não é par");
            }
            System.out.println(numero + " é par.");
        } catch (ResultadoNegativoException e) {
            e.printStackTrace();  
        }
         */
        try {
            testarExcecao2();
        } catch (ResultadoNegativoException e) {
            e.printStackTrace();
        }

    }

    public static void testarExcecao2() throws ResultadoNegativoException {
        int numero = 7;
        try {
            if (numero % 2 != 0) {
                throw new ResultadoNegativoException("Número não é par");
            }
            System.out.println(numero + " é par.");
        } catch (ResultadoNegativoException e) {
            e.printStackTrace();
        }
    }
}
