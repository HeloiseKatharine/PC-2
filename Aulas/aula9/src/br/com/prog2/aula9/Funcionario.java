/*
Atividade 8 - Trabalhando com ArrayList
 */
package br.com.prog2.aula9;

/**
 *
 * @author Heloise
 */
public class Funcionario {

    private int matricula;
    private String nome;
    private double salario;

    public void bonus(double percentual) {
        this.salario = salario * (1 + percentual / 100);
    }

    //get/set
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
