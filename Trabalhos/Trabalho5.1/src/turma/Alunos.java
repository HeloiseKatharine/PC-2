/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author heloh
 */
public class Alunos {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*Pedir ao usuário para introduzir via teclado os nomes do Arquivo de entrada e do Arquivo de saída.*/
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do arquivo(entrada) e sua extensão: ");
        String arquivoEntrada = leitor.next();

        System.out.println("Nome do arquivo(saída) e sua extensão: ");
        String arquivoSaida = leitor.next();

        String nomeArq = arquivoEntrada;
        String linha = "";
        String arquivoCopia = "";

        BufferedReader arquivo = null;

        try {
            arquivo = new BufferedReader(new FileReader(nomeArq));
            while (arquivo.ready()) {
                linha = arquivo.readLine();
                System.out.println(linha);
                /*pedindo a cada passo a nota da disciplina de Programação em Java obtida pelo aluno listado*/
                System.out.println("Digite a nota do aluno");
                String nota = leitor.next();
                /*. Adicionar a nova informação no Arquivo final.*/

                arquivoCopia = arquivoCopia + linha + " " + nota + "\n";

            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                arquivo.close();
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        File f = new File(arquivoSaida);

        FileOutputStream fos = new FileOutputStream(f);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       

        String texto = arquivoCopia;

        fos.write(texto.getBytes());    
        
        fos.close();
    }
}
