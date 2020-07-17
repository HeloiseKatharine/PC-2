/*
Atividade 6 - Exercitando tratamento de exceção
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class TesteExcecao {

    public static void main(String[] args) {
        /*int numero = 8 //7;

        try {
            if (numero % 2 != 0) {
                throw new NumeroParException("Número não é par");
            }
            System.out.println(numero + " é par.");
        } catch (NumeroParException e) {
            e.printStackTrace();  
        }
         */
        try {
            testarExcecao();
        } catch (NumeroParException e) {
            e.printStackTrace();
        }

    
    }
    public static void testarExcecao() throws NumeroParException {
        int numero = 7;
        try {
            if (numero % 2 != 0) {
                throw new NumeroParException("Número não é par");
            }
            System.out.println(numero + " é par.");
        } catch (NumeroParException e) {
            e.printStackTrace();
        }
    }
}
