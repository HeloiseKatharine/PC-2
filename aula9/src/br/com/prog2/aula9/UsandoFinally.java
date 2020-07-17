/*
Atividade 3 - Usando o bloco finally
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class UsandoFinally {

    public static void main(String[] args) {
        int x = 10;
        int y = 0; //3;
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            System.out.println();
        } finally {
            System.out.println("Finally executado");
        }
    }

}
