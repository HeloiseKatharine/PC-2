/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

/**
 *
 * @author Heloise
 */
public class Professor {

    public Integer ctps;
    public String nome;
    public String formacao;

    //construtor
    public Professor(Integer ctps, String nome, String formacao) {
        this.ctps = ctps;
        this.nome = nome;
        this.formacao = formacao;
    }

    public Integer getCtps() {
        return ctps;
    }

    public void setCtps(Integer ctps) {
        this.ctps = ctps;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        return "{" + "ctps=" + ctps + ", nome=" + nome + ", formacao=" + formacao + '}';
    }
}
