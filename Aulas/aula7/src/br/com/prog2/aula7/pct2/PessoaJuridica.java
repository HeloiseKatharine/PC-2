/*
Atividade 2 - Implementando encapsulamento em Java
 */
package br.com.prog2.aula7.pct2;

import br.com.prog2.aula7.pct1.Cliente;
import br.com.prog2.aula7.pct1.PessoaFisica;

/**
 *
 * @author Heloise
 */
public class PessoaJuridica extends Cliente {

    private String cnpj;
    private String inscricaoEstadual;
    String razaoSocial;

    public String validarCnpj() {
        return "CNPJ validado";
    }

    public void testarVisibilidade() {
        Cliente c = new Cliente();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
    }
}
