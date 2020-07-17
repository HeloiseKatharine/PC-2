/*
Atividade 5 - Criando exceção
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class UsandoMinhaExcecao {

    public static void main(String[] args) {
        try {
            //Faça algo
            throw new ExemploMinhaExcecao();
        } catch (ExemploMinhaExcecao e) {
            System.out.println("Minha exceção: " + e.getMessage());
        }
    }

}
