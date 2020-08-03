/*
Atividade 5 - Implementando associação
 */
package br.com.prog2.aula8;

/**
 *
 * @author Heloise
 */
public class Principal {

    public static void main(String[] args) {
        //Teste da associação 1 para 1
        //Criando um objeto da classe Funcionario e outro da classe Computador
        /*Funcionario f1 = new Funcionario();
        Computador c1 = new Computador();
        
        //Atribuindo valores para os atributos dos objetos
        f1.setNome("Maria Silva");
        c1.setDescricao("Computador 1");
        
        //Fazendo a associação entre funcionario (f1) e computador (c1)
        c1.setFuncionario(f1);
        System.out.println("Funcionário: " + c1.getFuncionario().getNome()
                + ", Computador: " + c1.getDescricao());*/

 /*  
        //Teste da associação 1 para n
        Cliente5 c1 = new Cliente5();
        Cliente5 c2 = new Cliente5();
        Pedido p1 = new Pedido();
        Pedido p2 = new Pedido();
        Pedido p3 = new Pedido();
        Pedido p4 = new Pedido();
        Pedido p5 = new Pedido();

        c1.setNome("Maria Silva");
        c2.setNome("Manoel Almeida");

        p1.setValor(10.5);
        p2.setValor(38.9);
        p3.setValor(34.9);
        p4.setValor(32.9);
        p5.setValor(66.2);

        //Contando para o pedido p1 quem é o seu dono
        p1.setCliente5(c1);

        //Contando para o pedido p2, p3, p4 e p5 quem é o seu dono
        p2.setCliente5(c1);
        p3.setCliente5(c2);
        p4.setCliente5(c1);
        p5.setCliente5(c2);

        //Contando para os clientes c1 e c2 quais são seus pedidos
        Pedido[] pedidosC1 = new Pedido[3];
        pedidosC1[0] = p1;
        pedidosC1[1] = p2;
        pedidosC1[2] = p4;
        c1.setPedidos(pedidosC1);
        Pedido[] pedidosC2 = new Pedido[2];
        pedidosC2[0] = p3;
        pedidosC2[1] = p5;
        c2.setPedidos(pedidosC2);

        //Navegar nos pedidos usando for-each
        for (Pedido p : pedidosC1) {
            System.out.println("Cliente: " + p.getCliente5().getNome()
                    + ", valor do pedido: " + p.getValor());
        }
        for (Pedido p : pedidosC2) {
            System.out.println("Cliente: " + p.getCliente5().getNome()
                    + ", valor do pedido: " + p.getValor());
        }*/
        //Criando 2 objetos Aluno e 2 Diciplinas
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Disciplina d1 = new Disciplina();
        Disciplina d2 = new Disciplina();
        Disciplina d3 = new Disciplina();
//Atribuindo valores aos atributos dos alunos e das disciplinas
        a1.setRa("A123");
        a1.setNome("Aluno 1");
        a2.setRa("A456");
        a2.setNome("Aluno 2");
        d1.setCodigo("12");
        d1.setDescricao("Cálculo I");
        d1.setCargaHoraria(72);
        d2.setCodigo("13");
        d2.setDescricao("Banco de Dados");
        d2.setCargaHoraria(72);
        d3.setCodigo("14");
        d3.setDescricao("Cálculo II");
        d3.setCargaHoraria(72);
//Criando objetos Matricula
        Matricula m1 = new Matricula();
        Matricula m2 = new Matricula();
        Matricula m3 = new Matricula();
//Atribuindo valores para os atributos de matricula
        m1.setAno(2015);
        m1.setSemestre(1);
        m1.setNota(6.0);
        m2.setAno(2016);
        m2.setSemestre(2);
        m2.setNota(6.0);
        m3.setAno(2016);
        m3.setSemestre(2);
        m3.setNota(7.0);
//Ligando a matrícula ao aluno e à disciplina
        m1.setAluno(a1);
        m1.setDisciplina(d1);
        m2.setAluno(a2);
        m2.setDisciplina(d2);
        m3.setAluno(a2);
        m3.setDisciplina(d3);
        
        //Ligando o aluno às matrículas
        Matricula[] matriculas1 = new Matricula[1];
        matriculas1[0] = m1;
        a1.setMatriculas(matriculas1);
        Matricula[] matriculas2 = new Matricula[2];
        matriculas2[0] = m2;
        matriculas2[1] = m3;
        a2.setMatriculas(matriculas2);

        //Exibindo os dados
        for (Matricula m : matriculas1) {
            System.out.println(m.getAluno().getNome() + m.getDisciplina().getDescricao());
        }
        for (Matricula m : matriculas2) {
            System.out.println(m.getAluno().getNome() + " " + m.getDisciplina().getDescricao());
        }
    }
}
