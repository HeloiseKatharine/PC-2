/*
Atividade 5 - Implementando associação
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Matricula {

    private Integer ano;
    private Integer semestre;
    private Double nota;
    private Aluno aluno;
    private Disciplina disciplina;

    //get/set
    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

}
