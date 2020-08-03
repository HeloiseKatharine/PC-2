/*
Atividade 3 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

import java.time.LocalDate;

/**
 *
 * @author Heloise
 */
public abstract class Morador {

    private String nome;
    private LocalDate dataNascimento;
    private Integer numeroFilho;

    public abstract double calcularTaxaDeposito(int qtdeVolume);

    //get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getNumeroFilho() {
        return numeroFilho;
    }

    public void setNumeroFilho(Integer numeroFilho) {
        this.numeroFilho = numeroFilho;
    }

}
