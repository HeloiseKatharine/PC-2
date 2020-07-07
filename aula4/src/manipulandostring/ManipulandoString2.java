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
public class ManipulandoString2 {
    
     public static void main(String[] args) 
    {
        String s1 = new String("A");
        String s2 = new String("A");
        
        //usando o  operador ==
        
        if(s1 == s2)
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("Não são iguais");
        }
        
        //usando o método equals.
        
        if(s1.equals(s2))
        {
            System.out.println("São iguais.");
        }
        else
        {
            System.out.println("Não são iguais.");
        }
        
        
       

    }
}
