/*
Trabalho 1
1 - Criar uma classe chamada Funcionario, com os atributos matricula (Integer), nome (String), dataDeNascimento (DataPadraoBrasil)
e cargo (String). 
2 - Crie um construtor para a classe Funcionario para receber todos os seus atributos. 
3 - Crie (sobrescreva) o método toString para exibir a saída do funcionário formatada. 
4 - Crie uma classe chamada CadastraFuncionario, com o método main, e use uma das forma de leitura dos dados para ler um
funcionário e exibir seus dados na tela.
 */
package funcionario;

/**
 *
 * @author Heloise
 */
public class Funcionario {

    Integer matricula;
    String nome;
    DataPadraoBrasil dataDeNascimento;
    String cargo;

    //construtor 
    public Funcionario(Integer matricula, String nome, DataPadraoBrasil dataDeNascimento, String cargo) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.cargo = cargo;
    }

    //Crie (sobrescreva) o método toString para exibir a saída do funcionário formatada.
    @Override
    public String toString() {
        return "Matricula = " + matricula + "\nNome = " + nome + "\nData de nascimento = " + dataDeNascimento + "\nCargo = " + cargo;
    }
}
