/*
Atividade 7 - Trabalhando com ArrayList
 */
package br.com.prog2.aula9;

import java.util.*;
/**
 *
 * @author heloise
 */
public class Exemplo3 {

    public static void main(String[] args) {
        List lista = new ArrayList();//Cria uma lista de tamanho
        
        //indeterminado
        lista.add("Ana");//Adiciona elemento à lista
        lista.add("Carla");//Adiciona elemento à lista
        lista.add("Maria");//Adiciona elemento à lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));//Exibe os elementos da //lista
        }
    }
}
