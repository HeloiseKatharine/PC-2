package aula5;

/*
 Atividade 1 - Testando operadores - 20 minutos
Objetivo: verificar como funcionam os operadores aritméticos, unários e de
atribuição.
1 - Crie uma classe chamada Operador, com o método main.
2 - Dentro do método main, teste todos os exemplos apresentados nas
tabelas com os operadores aritméticos, unários e de atribuição
 */


/**
 *
 * @author heloh
 */
public class Operador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    
        int a = 3, b = 4, ad, sub, mult, div, resto, u1, u2, u3, u4;
        
        //operadores aritméticos
        
        ad= a + b; //Adição
        System.out.println(ad);
        
        sub = a - b;
        System.out.println(sub);//Subtração
        
        mult = a * b;
        System.out.println(mult); //multiplicação 
        
        div = a / b;
        System.out.println(div);//divisão 
        
        resto = a % b;//Resto da divisão de inteiros
        System.out.println(resto);
        
        //unários
                
        //Adiciona 1 à variável A antes de somar o valor de B.
        u1 = ++a + b;
        System.out.println(u1);//u1 = 8

        //Soma o valor original de A com o valor de B e depois adiciona 1 à variável A.
        u2 = a++ + b;
        System.out.println(u2);//u2 = 7

        //Subtrai 1 da variável A antes de somar o valor de B.
        u3 = --a + b;// u3 = 6
        System.out.println(u3);

        //Soma o valor original de A com o valor de B e depois subtrai 1 da variável A.
        u4 = a-- + b; // u4 = 7
        System.out.println(u4);


        //atribuição

        //Soma o valor de 2 variáveis e atribui o resultado à primeira
        a += b;//A = A + B
        
        //Subtrai o valor entre 2 variáveis e atribui o resultado à primeira
        a -= b; // A = A - B

        //Multiplica o valor de 2 variáveis e atribui o resultado à primeira
        a *= b;//A = A * B
        
        //Divide o valor de 2 variáveis e atribui o resultado à primeira
        a /= b; //A = A / B
        //A = 0 (se forem inteiros), A = 0.75 (se forem double ou float)
        
        //Devolve o resto da divisão entre 2 variáveis e atribui o resultado à primeira
        a %= b; //A = A %= B
        
        
    }
    
}
