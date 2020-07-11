package aula5;

/*
Atividade 4 - Trabalhando com for - 10 minutos
Objetivo: entender o funcionamento das estruturas de repetição. 
1 - Crie uma classe com método main.
2 - Dentro do método main, teste todos os exemplos apresentados na seção 7.1.
 */
/**
 *
 * @author heloh
 */
public class EstruturasRepetição {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteração: " + (i + 1));
        }

        //ex: 1
        char a = 'O';
        String b = " Java é uma linguagem versátil";
        System.out.println(a + b);

        //ex: 2
        double x = 9.8;
        int y = 7;
        System.out.println(x + y);
        System.out.println("" + x + y);
        System.out.println("Valor de x + y: " + (x + y));
        System.out.println("Valor de x + y: " + x + y);

        //ex: 3
        System.out.println(a + x);
        System.out.println("" + a + x);

        //ex: 4
        for (int i = 10; i > 0; i--) {
            System.out.println("Valor de i: " + i);
        }

        //ex: 5
        int z =0;
        for (int i = 0; i < 10 || (z % 2) == 0; i++) {
            System.out.println("i = " + i + " z = " + z);
            z++;
        }
    }
}
