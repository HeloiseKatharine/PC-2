/*
Atividade 1 - Implementando herança em Java

 */
package br.com.prog2.aula7;

/**
 *
 * @author Heloise
 */
public class GerenciaFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        CaixaAgencia caixa = new CaixaAgencia();
        GerenteOperacional gerente = new GerenteOperacional();

        caixa.cpf = "45454-8655";
    }
}
