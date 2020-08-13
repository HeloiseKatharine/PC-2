/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

/**
 *
 * @author Heloise
 */
public class CadastroPaises {

    public static void main(String[] args) {

        Paises p1 = new Paises("Brasil", "Brasília", "América", "Real", "Português", 209.5f);

        System.out.println(p1.toString());
    }
}

        //leitor.close();
        /*System.out.println("Nome do pais:");
        String nome = leitor.next();
        System.out.println("capital:");
        String capital = leitor.next();
        System.out.println("continente:");
        String continente = leitor.next();
        System.out.println("moeda:");
        String moeda = leitor.next();
        System.out.println("ligua:");
        String lingua = leitor.next();
        System.out.println("População:");
        Integer quatHabitantes = leitor.nextInt();*/
