/*
Atividade 6 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Edificio {

    private String nome;
    private String localizacao;
    Andar[] andares;
    
    //Declarando uma constante
    private static final int NUM_MAX_ANDAR = 6;

    public Edificio() {
        andares = new Andar[NUM_MAX_ANDAR];
    }

    //get/set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Andar[] getAndares() {
        return andares;
    }

    public void setAndares(Andar[] andares) {
        this.andares = andares;
    }
    
}
