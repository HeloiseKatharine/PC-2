/*
Atividade 5 - Implementando associação
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Aluno {

    private String ra;
    private String nome;
    private Matricula[] matriculas;

    //get/set
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Matricula[] getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(Matricula[] matriculas) {
        this.matriculas = matriculas;
    }

}
