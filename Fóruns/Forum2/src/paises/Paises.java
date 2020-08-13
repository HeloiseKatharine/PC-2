/*
1 - Crie uma classe com, no mínimo, 3 atributos. 
2 - Crie um objeto da classe, coloque os valores para os atributos e mostre o resultado na tela.
 */
package paises;

/**
 *
 * @author Heloise
 */
public class Paises {

    public String nome;
    public String capital;
    public String continente;
    public String moeda;
    public String lingua;
    public Float quatHabitantes;

    public Paises(String nome, String capital, String continente, String moeda, String lingua, Float quatHabitantes) {
        this.nome = nome;
        this.capital = capital;
        this.continente = continente;
        this.moeda = moeda;
        this.lingua = lingua;
        this.quatHabitantes = quatHabitantes;
    }

    @Override
    public String toString() {
        return "\nNome = " + nome + "\nCapital = " + capital + "\nContinente = " + continente + "\nMoeda = " + moeda + "\nLingua = " + lingua + "\nHabitantes = " + quatHabitantes;
    }
}
