package br.com.prog2.aula3;

import java.util.Scanner;

/**
 *
 * @author Heloise Katharine 
 */

public class CadastraAlunoScanner {
     
    public static void main(String[] args) {
     
        //System.in indica leitura do teclado
        Scanner leitor = new Scanner(System.in);
        
        //leitura dos dados do aluno
        
        System.out.print("Digite a matrícula: ");
        int matricula = leitor.nextInt();
        
        System.out.print("Digite o nome: ");
        String nome = leitor.next();
        
        //Só para fins didáticos, isto será melhorado mais para frente

        System.out.print("Digite o dia do nascimento: ");
        String dia = leitor.next();
        
        System.out.print("Digite o mês do nascimento: ");
        String mes = leitor.next();
        
        System.out.print("Digite o ano do nascimento: ");
        String ano = leitor.next();
        
        leitor.close();
     }
}
