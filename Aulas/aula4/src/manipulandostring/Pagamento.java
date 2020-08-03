/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
1 - Crie uma classe chamada Pagamento, com um atributo chamado
valor e com um método para calcular o valor a pagar, que receba com
entrada os dias de atraso. O cálculo do valor a pagar é feito da
seguinte forma: valor + 2% de multa sobre o valor + 0,035% por dia
de atraso. Não se preocupe com data de vencimento, pois não é
obrigação dessa classe calcular esse atraso, o seu método já
receberá os dias de atraso calculados. Se não tiver atrasado, cobrar só valor nominal.

*/
package manipulandostring;

/**
 *
 * @author Heloise Katharine
 */

public class Pagamento {
    
    //Atividade 4
    
    //atributos
    Float valor; 
    int quant_dias;//dias de atraso 
    
    //status    
    public void status(){
        
        System.out.println("Valor a pagar: "+this.valor);
        System.out.println("Quantidade de dias: "+this.quant_dias);
    }
    
    //contrutor 
    public Pagamento(Float valor, int quant_dias){
        this.valor = valor;
        this.quant_dias = quant_dias;
    }
    
    //Método para calcular o valor a pagar
        
    public void calcular_valor(Float valor, int quant_dias)
    {
        if(quant_dias == 0)
        {
            this.valor = valor;
        }
        else
        {
            this.valor = (valor + ((valor*2)/100) + (quant_dias * ((valor*0.035f) / 100)));
        }
    }      
}
   
