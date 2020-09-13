/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculdade;

//dados do professor; **valor da hora aula; quantidade de horas por semana;** quantidade de dependentes.
//valor da hora aula e quantidade de hora semanal.
import java.util.Scanner;

/**
 *
 * @author Heloise
 */
public class Faculdade {

    Professor prof;//objeto professor
    ContraCheque contracheque;
    public Integer nD; //Número de dependentes

    public static void main(String[] args) {

        int quantprof = 50;
        int cont = 0;
        Integer resp;
        Double vlHa;
        Integer nh;

        Scanner leitor = new Scanner(System.in);

        Professor p[] = new Professor[quantprof];
        ContraCheque c[] = new ContraCheque[quantprof];
        Faculdade f[] = new Faculdade[quantprof];

        do {
            System.out.println("Digite o CTPS:");
            Integer ctps = leitor.nextInt();

            System.out.println("Digite o nome do professor:");
            String nome = leitor.next();

            System.out.println("Digite a formação do professor:");
            String formacao = leitor.next();

            p[cont] = new Professor(ctps, nome, formacao);

            System.out.println("Valor da hora aula:");
            vlHa = leitor.nextDouble();

            System.out.println("Número de horas semanais:");
            nh = leitor.nextInt();

            System.out.println("Quantidade horas noturnas:");
            Integer qHN = leitor.nextInt();

            c[cont] = new ContraCheque(vlHa, nh, qHN);

            System.out.println("Número de dependentes:");
            int auxnD = leitor.nextInt();

            c[cont].Irpf(auxnD);

            f[cont] = new Faculdade(p[cont], c[cont], auxnD);

            System.out.println("0- para continuar\n1- para sair");
            resp = leitor.nextInt();
            cont++;

        } while (resp == 0);

        for (int i = 0; i < cont; i++) {
            System.out.println(f[i].toString());
        }

        leitor.close();
    }

    public Faculdade(Professor prof, ContraCheque contracheque, Integer nD) {
        this.prof = prof;
        this.contracheque = contracheque;
        this.nD = nD;
    }

    public Integer getnD() {
        return nD;
    }

    public void setnD(Integer nD) {
        this.nD = nD;
    }

    @Override
    public String toString() {
        return "\nFaculdade{" + "\nProfessor: " + prof + "\nContra cheque: " + contracheque + "\nNúmero de dependentees: " + nD + '}';
    }
}
