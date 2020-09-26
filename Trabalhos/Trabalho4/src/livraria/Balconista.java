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
public class Balconista {

    public String nomeusuario;
    public String senha;
    public String nivelaacesso;

    public Balconista(String nomeusuario, String senha, String nivelaacesso) {
        this.nomeusuario = nomeusuario;
        this.senha = senha;
        this.nivelaacesso = nivelaacesso;
    }

    public Balconista() {
    }

    public void login() {

    }

    public void inserir() {

    }

    public void consultar() {

    }

    public void alterar() {

    }

    public void excluir() {
    }

    public void remessaCliente() {

    }

    public void efetuarPedidoCliente() {

    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelaacesso() {
        return nivelaacesso;
    }

    public void setNivelaacesso(String nivelaacesso) {
        this.nivelaacesso = nivelaacesso;
    }

}
