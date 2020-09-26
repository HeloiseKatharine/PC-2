/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

/**
 *
 * @author Heloise
 */
public abstract class Pedido {

    public Integer codigo;
    public String datapedido;
    public Integer quantidade;
    public String[] listalivro = new String[10];
    public Double[] valor = new Double[10];
    public Livro[] livro;

    public Pedido() {
    }

    public Pedido(Integer codigo, String datapedido, Integer quantidade, Livro[] livro) {
        this.codigo = codigo;
        this.datapedido = datapedido;
        this.quantidade = quantidade;
        this.livro = livro;
    }

    public abstract void calcvalor();

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDatapedido() {
        return datapedido;
    }

    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String[] getListalivro() {
        return listalivro;
    }

    public void setListalivro(String[] listalivro) {
        this.listalivro = listalivro;
    }

    public Double[] getValor() {
        return valor;
    }

    public void setValor(Double[] valor) {
        this.valor = valor;
    }

    public Livro[] getLivro() {
        return livro;
    }

    public void setLivro(Livro[] livro) {
        this.livro = livro;
    }

}
