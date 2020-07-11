/*
Atividade 2 - Trabalhando com if-else - 10 minutos
Objetivo: entender o funcionamento das estruturas de seleção.
1 - Crie uma classe com método main.
2 - Dentro do método main, leia do teclado a idade e o sexo da pessoa.
3 - Verifique se a pessoa tem idade para servir ao exército, levando em
consideração o sexo e a idade.
4 - Exiba o resultado, dizendo se a pessoa tem que servir ao exército, ou não.
 */
package aula5;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author heloh
 */
public class ServiçoMilitar {

    public static void main(String[] args) throws IOException {

        Scanner teclado = new Scanner(System.in);
        int idade;
        char sexo;

        System.out.println("Digite a sua idade: ");
        idade = teclado.nextInt();
        System.out.println("Digite o seu sexo (M/F): ");
        sexo = (char) System.in.read();

        if (idade >= 18) {
            if (sexo == 'M' || sexo == 'm') {
                System.out.println("Alistamento militar obrigatório");
            } else if (sexo == 'F' || sexo == 'f') {
                System.out.println("Alistamento militar não obrigatório");
            } else {
                System.out.println("Erro!");
            }
        } else {
            System.out.println("Você não pode se alistar.");
        }

    }
}
