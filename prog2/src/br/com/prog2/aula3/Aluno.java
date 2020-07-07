package br.com.prog2.aula3;

import br.com.prog2.util.DataPadraoBrasil;

/**
 *
 * @author Heloise Katharine 
 */

public class Aluno {
    
    String matricula;
    String nome;
    DataPadraoBrasil dataDeNascimento;

    //Construtor

    public Aluno(String matricula, String nome,DataPadraoBrasil dataDeNascimento){

        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
}
