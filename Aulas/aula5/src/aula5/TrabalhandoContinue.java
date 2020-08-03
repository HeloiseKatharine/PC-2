/*
Atividade 9 - Trabalhando com continue- 5 minutos
Objetivo: entender o funcionamento das interrupções.
1 - Crie uma classe com método main.
2 - Dentro do método main, teste o exemplo apresentado na seção 8.3. 
3 - Faça a troca dos rótulos para verificar o resultado novamente.
 */
package aula5;

/**
 *
 * @author heloh
 */
public class TrabalhandoContinue {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double num = Math.round(Math.random() * 10);
            if (num == 0) {
                break; //continue; 
            }
            System.out.println(1 / num);
        }
    }
}
