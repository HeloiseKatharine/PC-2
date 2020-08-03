/*
Atividade 4 - Implementando polimorfismo
*/
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Teste1 {

    public static void main(String[] args) {

        Operacao x = new Operacao();

        int y = x.calcular(1, 2);
        double z = x.calcular(1, 2);

        System.out.println(y);
        System.out.println(z);
    }
}
