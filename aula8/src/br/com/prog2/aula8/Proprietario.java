/*
Atividade 3 - Implementando polimorfismo
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Proprietario extends Morador {

    private Integer qtdeApartamento;
    
    //get/set
    public Integer getQtdeApartamento() {
        return qtdeApartamento;
    }

    public void setQtdeApartamento(Integer qtdeApartamento) {
        this.qtdeApartamento = qtdeApartamento;
    }

    
    @Override
    public double calcularTaxaDeposito(int qtdeVolume) {
        return qtdeVolume * 3.0;
    }

}
