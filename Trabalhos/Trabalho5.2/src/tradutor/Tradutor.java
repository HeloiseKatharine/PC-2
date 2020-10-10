/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tradutor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author heloh
 */
public class Tradutor {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do arquivo(entrada) e sua extensão: ");
        String arquivoEntrada = leitor.next();

        String nomeArq = arquivoEntrada;
        String linha = "";
        String texto = "";

        BufferedReader arquivo = null;

        try {
            arquivo = new BufferedReader(new FileReader(nomeArq));
            while (arquivo.ready()) {
                linha = arquivo.readLine();
                System.out.println(linha);

                texto = texto + linha;
            }

            texto = texto.replace("r", "");
            texto = texto.replace("l", "u");
            texto = texto.replace("R", "");
            texto = texto.replace("L", "u");
            System.out.println(texto);

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
