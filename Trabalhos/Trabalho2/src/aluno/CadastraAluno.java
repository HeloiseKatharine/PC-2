/*
a)ler uma lista de aluno fornecida pelo usuário, este deverá digitar a matrícula e o nome do aluno, bem como a
data de nascimento (pode ser dia, mês e ano);
b)o usuário deverá ir digitando alunos e notas até que digite 0 para matrícula;
c)os alunos, fornecidos pelo usuário, deverão ser armazendos em um array;
d)a cada aluno digitado, os seus dados deverão ser mostrados na tela. 
e)no fim deverá ser mostrado o total de alunos digitados
 */
package aluno;

import java.util.Date;
import java.util.Scanner;
import java.text.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Heloise
 */
public class CadastraAluno {

    static String options = "1- Cadastro Alunos;"
            + "2-Adicionar Nota;"
            + "3-Dados dos alunos;"
            + "4-Total de alunos";

    static Scanner leitor = new Scanner(System.in);

    public static void imprimemenu() {
        String[] menu = options.split(";");

        for (String option : menu) {
            System.out.println(option);
        }
    }

    //recebe lista de alunos
    public static void cadastraAlunos(List<Aluno> listaAlunos) {
        int matricula;
        String nome;
        String dataDeNascimento;

        do {
            //inserindo os valores na lista

            System.out.println("matricula:");
            matricula = leitor.nextInt();

            if (matricula != 0) {

                System.out.println("nome:");
                nome = leitor.next();

                System.out.println("data de nascimento:");
                dataDeNascimento = leitor.next();

                listaAlunos.add(new Aluno(matricula, nome, dataDeNascimento));
            }
        } while (matricula != 0);
    }

    //mostra o dados dos alunos
    public static void dados(List<Aluno> listaAlunos) {
        listaAlunos.forEach(aluno -> {
            System.out.println(aluno);
        });
    }

    //quantidade de alunos
    public static void quantAlunos(List<Aluno> listaAlunos) {
        System.out.println("Quantidade total de alunos: " + listaAlunos.size());
    }

    // add nota do aluno
    public static void addNota(List<Aluno> listaAlunos) {
        int matricula;
        

        System.out.print("Digite a matricula: ");
        matricula = leitor.nextInt();
        
        //procura a matricula do aluno na lista 
        for(Aluno aluno : listaAlunos )
        {
            if(aluno.matricula.equals(matricula)){
                System.out.print("Digite a nota para " + aluno.nome + ":");

                aluno.nota = leitor.nextDouble();
            }
        }   
    }
    
    //imprime só uma pessoa 
    

    public static void main(String[] args) {

        int option;//opção do usuario
        List listaAlunos = new ArrayList<Aluno>();

        do {
            CadastraAluno.imprimemenu();
            System.out.println("\nDigite a opção desejada: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1://cadastra aluno
                    CadastraAluno.cadastraAlunos(listaAlunos);
                    break;
                case 2:
                    CadastraAluno.addNota(listaAlunos);
                    break;
                case 3:
                    CadastraAluno.dados(listaAlunos);
                    break;
                case 4:
                    CadastraAluno.quantAlunos(listaAlunos);
                    break;
                default:
                    System.out.println("Erro! Opção inválida");
                    break;
            }

        } while (option != 0);

    }
}
