/*
Descrição do trabalho
Implemente as classes do diagrama a seguir. Crie uma classe Teste, com o método main e, dentro dele, crie o
pedido de um livro de forma que mostre o título do livro, o nome do cliente, a data do pedido, o nome do
bolconista e o nome do cliente.
 */
package livraria;

/**
 *
 * @author Heloise
 */
public class Teste {

    public static void main(String[] args) {

        Balconista b = new Balconista();
        PedidoCliente pc = new PedidoCliente();
        Livro livro = new Livro();
        Cliente cliente = new Cliente();

        //Pedido Cliente
        pc.setQuantidade(1);
        pc.setCodigo(010201);
        pc.setDatapedido("12/12/2020");

        //Cliente
        cliente.setNome("Maria");

        //Livro
        livro.setTitulo("Maus");
        livro.setAutor("Spiegelman");

        //Bolconista
        b.setNomeusuario("Gabriela");

        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Data do pedido: " + pc.getDatapedido());
        System.out.println("Balconista: " + b.getNomeusuario());

    }
}
