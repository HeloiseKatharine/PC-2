/*
1 - Crie uma classe chamada Aluno, com os atributos matricula (Integer), nome (String) e data de nascimento. 
2 - Crie uma classe chamada CadastraAluno, com o método main, essa classe deverá fazer o seguinte:
a)ler uma lista de aluno fornecida pelo usuário, este deverá digitar a matrícula e o nome do aluno, bem como a a
data de nascimento (pode ser dia, mês e ano);
b)o usuário deverá ir digitando alunos e notas até que digite 0 para matrícula;
c)os alunos, fornecidos pelo usuário, deverão ser armazendos em um array;
d)a cada aluno digitado, os seus dados deverão ser mostrados na tela. 
e)no fim deverá ser mostrado o total de alunos digitados
 */
package aluno;

import java.util.Date;

/**
 *
 * @author Heloise
 */
public class Aluno {

    public Integer matricula;
    public String nome;
    public String dataDeNascimento;//string
    public Double nota;
    

    public Aluno(Integer matricula, String nome, String dataDeNascimento){
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Aluno(Integer matricula, Double nota) {
        this.matricula = matricula;
        this.nota = nota;
    } 

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Matricula: ").append(this.matricula).append("\n");
        
        sb.append("Nome: ").append(this.nome).append("\n");
        
        sb.append("Data de nascimento: ").append(this.dataDeNascimento).append("\n");
        
        if(nota != null){
        sb.append("Nota: ").append(this.nota).append("\n");
        }
        
        return sb.toString();
        //return "Aluno{" + "matricula=" + matricula + ", nome=" + nome + ", dataDeNascimento=" + dataDeNascimento + '}';
    }

}
