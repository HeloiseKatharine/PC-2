/*
Atividade 8 - Trabalhando com break - 5 minutos
Objetivo: entender o funcionamento das interrupções.
1 - Crie uma classe com método main.
2 - Dentro do método main, teste o exemplo apresentado na seção 8.2.
 */
package aula5;

/**
 *
 * @author heloh
 */
public class TrabalhandoBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double num = Math.round(Math.random() * 10);
            if (num == 0) {
                break;
            }
            System.out.println(1 / num);
        }
    }
}
