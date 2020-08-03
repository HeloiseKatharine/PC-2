/*
Atividade 3 - Implementando os métodos get/set
 */
package br.com.prog2.aula7;

import java.time.LocalDate;

/**
 *
 * @author Heloise
 */
public class CadastraDivida {

    public static void main(String[] args) {
        Divida d1 = new Divida();
        d1.setCodigo(678);
        d1.setValor(980.78);
        d1.setDataDeVencimento(LocalDate.of(2018, 8, 15));
        System.out.println("Dados da dívida");
        System.out.println("Código: " + d1.getCodigo());
        System.out.println("Valor: " + d1.getValor());
        LocalDate dataDeVencimento = d1.getDataDeVencimento();
        String dataFormatada = dataDeVencimento.getDayOfMonth() + "/"+ dataDeVencimento.getMonth() + "/" + dataDeVencimento.getYear();
        System.out.println("Data de vencimento: " + dataFormatada);
    }
}
