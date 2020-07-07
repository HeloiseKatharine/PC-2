/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandostring;

/**
 *
 * @author heloh
 */

/*Atividade 6 - Conversão de dados - 10 minutos
Objetivo: aprender a converter dados de um tipo para outro. 1 - Teste todos os exemplos de conversão de dados apresentados nas
seções 7, 8 e 9, após a atividade 5.*/

public class conversaodedados 
{
     public static void main(String[] args) 
    {
        
        //7. Conversão de String para tipos numéricos
        
        String sValor = new String("23.67");
        double dValor = Double.parseDouble(sValor);
        System.out.println(dValor);// Imprimer 23.67

        String sValor1 = new String("23");
        int iValor = Integer.parseInt(sValor1);
        System.out.println(iValor);//Imprime 23
    
        //8. Conversão de outros tipos para String
        Double dValor1 = 4.78;
        String sValor2 = dValor1.toString();

        Integer iValor2 = 90;
        String sValor3 = iValor2.toString();
        
        //9. Convertendo valores da base decimal para Hexa, Binário e Octal
        
        //1) Decimal -> Hexadecimal
        int i = 678945;
        System.out.println(Integer.toHexString(i));//Imprime a5c21
        
        //2) Decimal -> Binário
        int o = 678945;
        System.out.println(Integer.toBinaryString(o));//Imprime 10100101110000100001
        
        //3) Decimal -> Octal
        int u = 678945;
        System.out.println(Integer.toOctalString(u));//Imprime 2456041
    }
}
