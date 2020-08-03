package aula5;


import javax.swing.JOptionPane;

/*
Atividade 6 - Trabalhando com do-while- 5 minutos
Objetivo: entender o funcionamento das estruturas de repetição.
1 - Crie uma classe com método main.
2 - Dentro do método main, teste o exemplo apresentado na seção 7.3
 */

/**
 *
 * @author heloh
 */
public class TrabalhandoDoWhile {

    public static void main(String[] args) {
        String s = "";
        do {
            s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
            System.out.println("Frase digitada: " + s);
        } while (!s.toLowerCase().equals("sair"));
    }
}
