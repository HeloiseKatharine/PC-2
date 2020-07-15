/*
Atividade 4 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Operacao {

    public int calcular(int num1, int num2) {
        return num1 + num2;
    }

    public double calcular(double num1, double num2) {
        return (num1 + num2) / 2.0;
    }

    /*public double calcular(int num1, int num2) {
        return num1 + num2;
    }*/
}
