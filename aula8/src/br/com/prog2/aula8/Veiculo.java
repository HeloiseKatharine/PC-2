/*
Atividade 2 - Implementando Interface
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public interface Veiculo {

    void trocarMarcha(int marcha);

    void aumentarVelocidade(int velocidade);

    void aplicarFrenagem(int intensidade);

    default String iniciando() {
        return "Iniciando movimentação";
    }

    static String finalizando() {
        return "Finalizando movimento";
    }
}
