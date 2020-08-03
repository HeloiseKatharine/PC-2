/*
Atividade 3 - Manipulando arquivos e diretórios
 */
package br.com.prog2.aula10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Heloise
 */
public class ManipulaArquivo {

    public static String criarDiretorio(String path) throws IOException {

        // Criando um objeto File
        File f = new File(path);
        if (!f.exists()) {
            f.mkdir();
            return "Diretório criado com sucesso.";
        } else {
            return "Diretório já existe.";
        }
    }

    public static String criarArquivo(String arquivo) throws IOException {
        File f = new File(arquivo);
        if (!f.exists()) {
            f.createNewFile();
            return "Arquivo criado com sucesso.";
        } else {
            return "Arquivo já existe";
        }
    }

    public static void listarDiretorio(String path) throws IOException {
        File dir = new File(path);
        for (File diretorio : dir.listFiles()) {
            if (diretorio.isDirectory()) {
                System.out.println(diretorio.getName());
            }
        }
    }

    public static void listarArquivo(String path) throws IOException {
        File dir = new File(path);
        for (File arq : dir.listFiles()) {
            if (arq.isFile()) {
                System.out.println(arq.getName());
            }
        }
    }

    public static void lerArquivo(String arq) throws IOException {
        // Criar um leitor de arquivo
        BufferedReader br = new BufferedReader(new FileReader(arq));
        while (br.ready()) {
            String linha = br.readLine();
            System.out.println(linha);
        }
        br.close();
    }

    public static void gravarArquivo(String[] dados, String arq)
            throws IOException {
        
        //Criar um gravador de dados
        FileWriter fw = new FileWriter(arq, true);
        BufferedWriter bw = new BufferedWriter(fw);
        for (String s : dados) {
            bw.append(s);
            bw.newLine();
        }
        bw.close();
    }

    static void gravarArquivo(String fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
