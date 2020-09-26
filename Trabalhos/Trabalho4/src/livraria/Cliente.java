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
public class Cliente {

    private Integer codigo;
    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private Integer cep;
    private Integer telefone;
    private String pedcli;

    public Cliente(Integer codigo, String nome, String endereco, String cidade, String estado, Integer cep, Integer telefone, String pedcli) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.pedcli = pedcli;
    }

    public Cliente() {
    }
    

    public void inserir() {

    }

    public void consultar() {

    }

    public void alterar() {

    }

    public void excluir() {

    }

    public void efetuarPedidoClente() {

    }

    public void Pagamento() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getPedcli() {
        return pedcli;
    }

    public void setPedcli(String pedcli) {
        this.pedcli = pedcli;
    }

}
