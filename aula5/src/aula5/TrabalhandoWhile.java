/*
Atividade 5 - Trabalhando com while- 5 minutos
Objetivo: entender o funcionamento das estruturas de repetição.
1 - Crie uma classe com método main.
2 - Dentro do método main, teste o exemplo apresentado na seção 7.2.
 */
package aula5;

import javax.swing.JOptionPane;

/**
 *
 * @author heloh
 */
public class TrabalhandoWhile {

    public static void main(String[] args) {
        
        String s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
        
        while (!s.toLowerCase().equals("sair")) {
            System.out.println("Frase digitada: " + s);
            s = JOptionPane.showInputDialog("Digite uma frase (digite sair para parar)");
        }
    }
}
