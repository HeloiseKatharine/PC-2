/*Objetivo: aprender a ler dados com caixa de diálogo.*/

package br.com.prog2.aula3;

import br.com.prog2.util.DataPadraoBrasil;
import javax.swing.JOptionPane;

/**
 *
 * @author Heloise Katharine
 */

public class CadastraAlunoJOPtionPane {

    public static void main(String[] args)
    {
        String matricula = JOptionPane.showInputDialog("Digite a matrícula");
     
        String nome = JOptionPane.showInputDialog("Digite o nome");
        
        //Só para fins didáticos, isto será melhorado mais para frente
        
        String dia = JOptionPane.showInputDialog("Digite o dia do nascimento");
        
        String mes = JOptionPane.showInputDialog("Digite o mês do nascimento");
        
        String ano = JOptionPane.showInputDialog("Digite o ano do nascimento");
        
        DataPadraoBrasil dataDeNascimento = new DataPadraoBrasil(dia, mes, ano);
        
        Aluno aluno = new Aluno(matricula, nome, dataDeNascimento);
        
        /*Atividade 5 - Exibindo dados utilizando JOPtionPane */

        JOptionPane.showMessageDialog(null, "Matrícula: "+aluno.matricula+"\nNome: "+aluno.nome+"\nData de nascimento: "+aluno.dataDeNascimento.toString());      

    }
}
