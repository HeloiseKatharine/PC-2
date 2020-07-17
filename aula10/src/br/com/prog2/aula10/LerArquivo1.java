/*
Atividade 1 - Lendo arquivo
 */
package br.com.prog2.aula10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Heloise
 */
public class LerArquivo1 {

    public static void main(String[] args) {
        String nomeArq = "arq1.txt";//"arq.txt"; 
        String linha = "";
        BufferedReader arquivo = null;
        try {
            arquivo = new BufferedReader(new FileReader(nomeArq));
            while (arquivo.ready()) {
                linha = arquivo.readLine();
                System.out.println(linha);
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
    }
}
