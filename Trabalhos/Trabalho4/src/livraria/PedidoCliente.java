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
public class PedidoCliente extends Pedido {

    private Integer codcliente;
    private String dataremessa;

    public PedidoCliente(Integer codcliente, String dataremessa, Integer codigo, String datapedido, Integer quantidade, Livro[] livro) {
        super(codigo, datapedido, quantidade, livro);
        this.codcliente = codcliente;
        this.dataremessa = dataremessa;
    }
    
    public PedidoCliente() {
    }
    
    @Override
    public void calcvalor(){
         
    }
     
    public void pagamentoCliente() {
    }

    public void remessaCliente() {

    }

    public void recuperarPedCliente() {

    }
    
    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getDataremessa() {
        return dataremessa;
    }

    public void setDataremessa(String dataremessa) {
        this.dataremessa = dataremessa;
    }

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getDatapedido() {
        return datapedido;
    }

    @Override
    public void setDatapedido(String datapedido) {
        this.datapedido = datapedido;
    }

    @Override
    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String[] getListalivro() {
        return listalivro;
    }

    @Override
    public void setListalivro(String[] listalivro) {
        this.listalivro = listalivro;
    }

    @Override
    public Double[] getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    @Override
    public void setValor(Double[] valor) {
        this.valor = valor;
    }

    @Override
    public Livro[] getLivro() {
        return livro;
    }

    @Override
    public void setLivro(Livro[] livro) {
        this.livro = livro;
    } 

}
