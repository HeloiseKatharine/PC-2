/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Scanner;

/**
 *
 * @author Heloise
 */
public class Livro {

    private Integer codigo;
    private String titulo;
    private String autor;
    private String isbn;
    private Double preco;
    private Integer codfornecedor;

    Scanner leitor = new Scanner(System.in);

    public Livro(Integer codigo, String titulo, String autor, String isbn, Double preco, Integer codfornecedor) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.codfornecedor = codfornecedor;
    }

    public Livro() {
    }
    
    public void inserir() {

    }

    public void excluir() {

    }

    public void alterar() {

    }

    public void consultar() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodfornecedor() {
        return codfornecedor;
    }

    public void setCodfornecedor(Integer codfornecedor) {
        this.codfornecedor = codfornecedor;
    }

    public Scanner getLeitor() {
        return leitor;
    }

    public void setLeitor(Scanner leitor) {
        this.leitor = leitor;
    }
      
}
