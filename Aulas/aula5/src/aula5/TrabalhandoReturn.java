/*
Atividade 7 - Trabalhando com return - 5 minutos
Objetivo: entender o funcionamento das interrupções. 
1 - Crie uma classe com método main.
2 - Crie os métodos, fora do método main, dos exemplos 1 e 2 da seção 8.1
3 - Dentro do método main, teste os 
 */
package aula5;

/**
 *
 * @author heloh
 */
public class TrabalhandoReturn {

    //ex: 1
    public static void divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Divisão por zero");
            return;
        }
        System.out.println("Resultado: " + a / b);
    }

    //ex: 2
    public static double calculaSaldo(double sal, double div) {
        return sal - div;
    }

    public static void main(String[] args) {
        
        divisao(8,0);
        divisao(8,3);
        calculaSaldo(100, 50);
    }
}
