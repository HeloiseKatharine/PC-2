/*
Atividade 5 - Implementando associação
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Computador {

    private String patrimonio;
    private String descricao;
    private Funcionario funcionario;

    //get/set
    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
