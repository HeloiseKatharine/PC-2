/*
Atividade 3 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Inquilino extends Morador {

    private Integer tempoContrato;
    
    public Integer getTempoContrato() {
        return tempoContrato;
    }

    //get/set
    public void setTempoContrato(Integer tempoContrato) {    
        this.tempoContrato = tempoContrato;
    }

    @Override
    public double calcularTaxaDeposito(int qtdeVolume) {
        return qtdeVolume * 5.0;
    }

}
