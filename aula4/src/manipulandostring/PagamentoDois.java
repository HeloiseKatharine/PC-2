/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
2 - Crie uma classe com o método main, dentro desse método, crie
vários objetos da classe Pagamento, cada objeto receberá um valor e
uma quantidade de dias de atraso diferentes e exibirá o resultado do
valor a pagar formatado com formatações 
*/
package manipulandostring;

/**
 *
 * @author Heloise Katharine
 */
public class PagamentoDois {

    public static void main(String[] args) 
    {
        //criando objetos 
        Pagamento p1 = new Pagamento(100f, 3);
        Pagamento p2 = new Pagamento(200f, 2);
        Pagamento p3 = new Pagamento(300f, 0);
        
        p1.calcular_valor(100f, 3);
        p2.calcular_valor(200f, 2);
        p3.calcular_valor(300f, 0);
        
        p1.status();
        p2.status();
        p3.status();
       
    }
}
