/*
Atividade 2 - Implementando encapsulamento em Java
 */
package br.com.prog2.aula7.pct1;

import br.com.prog2.aula7.pct2.PessoaJuridica;

/**
 *
 * @author Heloise
 */
public class Cliente {

    public Integer codigo;
    private String nome;
    protected String endereco;
    String uf;
    private String cep;

    public String inserirCliente() {
        return "Ciente inserido";
    }

    public String atualizarCliente() {
        return "Ciente atualizado";
    }

    public void testarVisibilidade() {
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        Cliente c = new Cliente();
    }
}
