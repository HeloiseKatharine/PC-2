/*
Atividade 2 - Implementando encapsulamento em Java
 */
package br.com.prog2.aula7.pct1;

import br.com.prog2.aula7.pct2.PessoaJuridica;
import java.time.LocalDate;

/**
 *
 * @author Heloise
 */
public class PessoaFisica extends Cliente {

    private String cpf;
    protected String rg;
    public Character sexo;
    LocalDate dataDeNascimento;

    public String validarCpf() {
        return "CPF validado";
    }

    public void testarVisibilidade() {
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Cliente c = new Cliente();
    }
}
