/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.prog2.aula2;

/**
 *
 * @author Heloise Katharine 
 *  
 */
public class TipoDado {
    
    public static void main(String[] args) {
        
        /*declarando uma variável de cada tipo, incluindo os da
        classe Wrapper e atribua valores para elas*/
        
        boolean a = false; 
        char b = 'a';
        byte c = 1;
        short d = 1;
        int e = 10;
        long f = 100;
        float g = 10.0F;
        double h = 120.0;

        Double i = new Double(120.0);
        Boolean j = new Boolean("false");
        Character k = new Character('a');
        //numeros inteiros não podem ser considerados do tipi byte
        Byte l = new Byte((byte)1);
        //Short não aceita valor inteiro
        Short m = new Short((short)1);
        Integer n = new Integer(1);
        Long o = new Long(2);
        Float p = new Float(2.0F);
        
        /*Verifique se é possível atribuir o valor 66 para a variável do tipo char.*/
        
        char teste = 66;
        System.out.println(teste); //imprime 'B'
        
        /*Verifique se é possível atribuir o valor 130 para a variável do tipo byte.*/
        
        byte teste2 = (byte) 130; // em byte o menor valor é -128 e o maior é 127
        System.out.println(teste2);
        
        /*Crie duas variáveis do tipo byte, atribua o valor 125 para uma e 5 para
        outra. Crie uma terceira variável do tipo byte e atribua a soma das duas
        anteriores para ela, use cast, se for necessário. Imprima o resultado.*/
        
        byte teste3 = (byte) 125;
        byte teste4 = (byte) 5;
        byte soma = (byte) ((byte) teste3 + teste4);
        System.out.println(soma);
        
        
        /*Cria uma variável do tipo char, atribua o valor ‘A’, faça a variável do tipo
        byte receber a variável do tipo char, use cast se necessário, e imprima o
        resultado.*/
        
        char teste5 = 'A';
        byte teste6 = (byte) teste5;
        System.out.println(teste6);
        
    }
}
