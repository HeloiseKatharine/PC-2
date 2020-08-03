/*
Atividade 6 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Equipe {

    private String nome;
    private Jogador[] jogadores;
    
    //get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

}
