/*
 Atividade 2 - Criando array 
 */
package br.com.prog2.aula6;

/**
 *
 * @author Heloise
 */
public class Array2 {

    public static void main(String[] args) {

        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            numeros[i] = i;
        }
        System.out.println("Vetor numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        Integer[] numerosInteger = new Integer[3];
        for (int j = 0; j < 3; j++) {
            numerosInteger[j] = j;
        }
        System.out.println("Vetor numerosInteger: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(numerosInteger[i]);
        }

        String nomes[] = {"Maria", "João", "JHFJ", "kddk"};
        System.out.println("Vetor nomes: ");
        for (int i = 0; i < 4; i++) {
            System.out.println(nomes[i]);
        }

        Curso[] listaDeCursos = new Curso[6];

        listaDeCursos[0] = new Curso(1, "descrição", 6);
        listaDeCursos[1] = new Curso(2, "descrição", 7);
        listaDeCursos[2] = new Curso(3, "descrição", 8);
        listaDeCursos[3] = new Curso(4, "descrição", 9);
        listaDeCursos[4] = new Curso(5, "descrição", 10);
        listaDeCursos[5] = new Curso(6, "descrição", 11);

        System.out.println("Lista de Cursos");
        for (int i = 0; i < listaDeCursos.length; i++) {
            System.out.println(listaDeCursos[i].codigo);
            System.out.println(listaDeCursos[i].descricao);
            System.out.println(listaDeCursos[i].cargaHoraria);
        }

        /*5 - Exiba na tela os resultados usando o For-Each*/
        System.out.println("\n****COM FOR-EACH****\n");

        //listaDeCursos
        for (Curso c : listaDeCursos) {
            System.out.println(c.codigo);
            System.out.println(c.descricao);
            System.out.println(c.cargaHoraria);
        }
        //nome
        for (String s : nomes) {
            System.out.println(s);
        }
        //numeros 
        for (int num : numeros) {
            System.out.println(num);
        }
        //numerosInteger
        for (int num1 : numerosInteger) {
            System.out.println(num1);
        }
    }
}
