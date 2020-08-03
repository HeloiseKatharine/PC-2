/*
Atividade 3 - Manipulando arquivos e diretórios
 */
package br.com.prog2.aula10;

import java.io.IOException;

/**
 *
 * @author Heloise
 */
public class Teste {

    public static void main(String[] args) {
        /*
        // Linux
        String pathL = "/home/jose/IFB/Ensino/20181/prog2/arquivos1";
        // Windows
        // String pathW = "C:\\Users\\Alunotgn\\workspace\\arquivos1";
        try {
            System.out.println(ManipulaArquivo.criarDiretorio(pathL));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

 /*
        // Linux
        String pathL = "/home/jose/IFB/Ensino/20181/prog2/arquivos1/";
        String arq = "teste1.txt";
        // Windows
        // String pathW = "C:\\Users\\Alunotgn\\workspace\\arquivos1\\";
        try {
            System.out.println(ManipulaArquivo.criarArquivo(pathL + arq));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/
 /*String path = "/home/jose";
        // ou String path = "C:\\User\\Alunotgn"
        try {
            ManipulaArquivo.listarDiretorio(path);
        } catch (IOException e) {
        // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
        String path = "/home/jose";
        // ou String path = "C:\\User\\Alunotgn"
        try {
            ManipulaArquivo.listarArquivo(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String arq = "/home/jose";
        // ou String path = "C:\\User\\Alunotgn"
        try {

            ManipulaArquivo.lerArquivo(arg);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        String fw = "/home/jose";
        // ou String path = "C:\\User\\Alunotgn"
        try {
            ManipulaArquivo.gravarArquivo(fw);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
