/*
Atividade 1 - Tratando exceção em tempo de execução
 */
package br.com.prog2.aula9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Heloise
 */
public class ExemploIOException {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("teste.txt"));
            String str;
            while (((str = in.readLine()) != null)) {
                System.out.println(str);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("Problemas com o arquivo: " + e.getMessage());
        }
    }
}
