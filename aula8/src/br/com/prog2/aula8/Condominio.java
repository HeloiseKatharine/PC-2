/*
Atividade 3 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

import java.time.LocalDate;

/**
 *
 * @author Heloise
 */
public class Condominio {

    public static void main(String[] args) {

        //Criando um objeto Proprietario e outro Inquilino
        Proprietario p = new Proprietario();
        Inquilino i = new Inquilino();

        //Atribuindo valor aos atributos de p
        p.setNome("Mané Joaquim");
        LocalDate dataDeNascimento = LocalDate.of(1965, 11, 10);
        p.setDataNascimento(dataDeNascimento);
        p.setNumeroFilho(3);
        p.setQtdeApartamento(4);
        double taxaP = p.calcularTaxaDeposito(5);
        System.out.println("Proprietário: " + p.getNome());
        System.out.println("Taxa: " + taxaP);

        //Atribuindo valor para os atributos de i
        i.setNome("Margarida");
        dataDeNascimento = LocalDate.of(1954, 3, 1);
        i.setDataNascimento(dataDeNascimento);
        i.setNumeroFilho(0);
        i.setTempoContrato(12);
        double taxaI = i.calcularTaxaDeposito(5);
        System.out.println("Inquilino: " + i.getNome());
        System.out.println("Taxa: " + taxaI);
    }
}
