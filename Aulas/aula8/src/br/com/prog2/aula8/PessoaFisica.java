/*
Atividade 1 - Implementando classe abstrata
 */
package br.com.prog2.aula8;

import java.time.LocalDate;

/**
 *
 * @author Heloise
 */
public class PessoaFisica extends Cliente {

    private String cpf;
    private String rg;
    private String sexo;
    private LocalDate dataDeNascimento;

    //a palavra-chave super chama o construtor da classe pai.
    public PessoaFisica(String cpf, String rg, String sexo, LocalDate dataDeNascimento, Integer codigo, String nome, String endereco, String uf, String cep) {
        super(codigo, nome, endereco, uf, cep);
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }

    //métodos inserir e alterar
    @Override
    public void inserir() {
    }

    @Override
    public void alterar() {
    }

//get/set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
