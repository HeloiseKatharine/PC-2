/*
Atividade 3 - Fazendo o CRUD para a tabela empregado
 */
package br.com.prog2.rh.negocio;

/**
 *
 * @author Heloise
 */
public class Empregado {

    private String cpf;
    private String nome;
    private Integer idade;
    private Double salario;

    public Empregado() {
    }

    //get/set

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}
