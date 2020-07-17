/*
Atividade 6 - Exercitando tratamento de exceção
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class NumeroParException extends Exception {

    private static final long serialVersionUID = 1L;

    public NumeroParException(String msg) {
        super(msg);
    }
}
