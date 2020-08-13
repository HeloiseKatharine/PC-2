/*
4 - Crie uma classe chamada CadastraFuncionario, com o método main, e use uma das forma de leitura dos dados para ler um
funcionário e exibir seus dados na tela.
 */

package funcionario;

import java.util.Scanner;

/**
 *
 * @author Heloise
 */
public class CadastraFuncionario {
    public static void main(String[] args) {
        
        //System.in indica leitura do teclado
        Scanner leitor = new Scanner(System.in); 
        
        System.out.println("Digite a matricula");
        Integer matricula = leitor.nextInt();
        
        System.out.println("Digite o seu nome");
        String nome = leitor.next();
        
        System.out.println("Digite o dia do nascimento"); 
        Integer dia = leitor.nextInt();
        
        System.out.println("Digite o mes do nascimento"); 
        Integer mes = leitor.nextInt();
        
        System.out.println("Digite o ano do nascimento"); 
        Integer ano = leitor.nextInt();
        
        System.out.println("Digite o cargo");
        String cargo = leitor.next(); 
    
        
        DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
        
        Funcionario f1 = new Funcionario(matricula, nome, dataDeNascimento, cargo);
        
        System.out.println(f1.toString());
        
        leitor.close();
                
        
    }
}
