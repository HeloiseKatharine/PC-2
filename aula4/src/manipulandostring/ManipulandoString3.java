/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipulandostring;

/**
 *
 * @author heloh
 */
public class ManipulandoString3 {
    
     public static void main(String[] args) 
    {
        //Principais métodos da classe String
        
        //a) length() - retorna o tamanho da String (não confunda com o length de array).
        
        String s1 = "Programação de computadores III";
        System.out.println(s1.length());
        
        //b) charAt(int position) - captura um caracter de um String em uma posição específica
        
        String s2 = "Programação de computadores III";
        char c = s2.charAt(6);
        System.out.println(c);
        
        /*c) equals() - verifica o conteúdo de duas Strings quanto à igualdade
        de conteúdo, retorna um boolean (true ou false). O conteúdo de duas
        Strings não pode ser verificado com a utilização do operador ==, pois
        o mesmo irá comparar as referências dos objetos e não seu conteúdo.*/
        
        String s3 = new String("AAA");
        String s4 = new String("AAA");
        
        if(s3.equals(s4))
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("São diferentes");
        }
        
        
        /*d) equalsIgnoreCase() - verifica o conteúdo de duas Strings quanto à
        igualdade de conteúdo, ignorando variações entre maiúsculas e
        minúsculas.*/
        
        String s5 = new String("aAA");
        String s6 = new String("AAA");
        
        if(s5.equalsIgnoreCase(s6))
        {
            System.out.println("São iguais");
        }
        else
        {
            System.out.println("São diferentes");
        }
        
        
        /*e) compareTo() - compara duas Strings e devolve 0 (zero) se ambas
        forem iguais; um número negativo se a String que chama o método
        for menor que o String passada como parâmetro ou um número
        positivo se a String que chama o método for maior que a String que
        for passado como parâmetro. O significado do maior e menor é a
        posição dos caracteres no alfabeto.*/
 
        
        String st7 = new String("A");
        String st8 = new String("B");
        int res = st7.compareTo(st8);
        System.out.println(res);
        
        /*f) compareToIgnoreCase() - compara duas Strings ignorando
        variações entre maiúsculas e minúsculas
        e devolve 0 (zero) se ambas forem iguais; um número negativo se a
        String que chama o método for menor que o String passada como
        parâmetro ou um número positivo se a String que chama o método
        for maior que a String que for passado como parâmetro. O significado
        do maior e menor é a posição dos caracteres no alfabeto.*/
        
        String s9 = new String("A");
        String s10 = new String("a");
        int res1 = s9.compareToIgnoreCase(s10);
        System.out.println(res1);
        
        
        
        /*g) substring(int beginIndex) - retorna uma nova String, copiando um
        trecho indicado de uma String específica. Neste caso, da posição
        (beginIndex) até o fim da String.*/
        
        String s11 = "Programação de computadores III";
        String sub1 = s11.substring(12);
        System.out.println(sub1);
        
        /*O método substring é sobrecarregado, temos a seguinte implementação também: 
        substring(int beginIndex, int endIndex).
        Este método retorna uma nova String, copiando um trecho indicado
        de uma String específica. Neste caso, da posição (beginIndex) até a
        posição (endIndex – 1) ou seja, beginIndex inclusive e endIndex exclusive.*/
        
        String s12 = "Programação de computadores III";
        String sub2 = s12.substring(12,20);
        System.out.println(sub2);
        
        /*h) replace(char oldChar, char newChar) - substitui cada ocorrência de
        um caracter em um String por outro. Substitui todas as ocorrências
        de oldChar por newChar.*/
        
        String s13 = "Programação de computadores III";
        String novaS = s13.replace('r', 'l');
        System.out.println(novaS);

        /*Existem outras variações do replace, como é o caso do
        replace(CharSequence target, CharSequence replacement) - que
        substitui uma sequencia de caracteres (passados entre aspas duplas)
        por outra. Tem-se também o replaceFirst(CharSequence target, CharSequence replacement) 
        - que substitui a primeira ocorrência do
        caracter ou sequência de caracteres por um novo caracter ou nova
        sequência de caracteres. Existe também a replaceAll, que trabalha
        com expressão regular.*/

        /*i) indexOf(char caracter) - retorna a posição da primeira ocorrência de
        um caracter num String. Retorna um valor inteiro com a posição do
        caracter ou -1 caso o caracter não exista na String.*/
        
        String s14 = "Programação de computadores III";
        int posicao = s14.indexOf('a');
        
        // -> int = s14.indexOf(char caracter, int deOnde); <-
        /*este método retorna a posição da primeira ocorrência de um caracter num String a partir da
        posição especificada no segundo argumento (deOnde). Retorna um
        valor inteiro com a posição do caracter ou -1 caso o caracter não
        exista na String.*/
        
        int posicao1 = s14.indexOf('a', 5);
        
        /*int = s2.indexOf(String s1); este método retorna a posição do
        primeiro caracter da primeira ocorrência de uma String numa outra
        String. Também pode se passar um segundo argumento de onde
        iniciar a pesquisa. */
        
       int posicao2 = s14.indexOf("bc");

       
        /*j) lastIndexOf()
        int = s.lastIndexOf( . . . ); este método funciona de forma semelhante
        ao método indexOf, com todas as sobrecargas, mas localiza a última
        ocorrência de em uma String, inicia a pesquisa a partir do fim da
        String. Retorna um valor inteiro com a posição do caracter ou -1 caso
        o caracter não exista na String.*/
        
        int posicao3 = s14.indexOf('a');
        
        /*k) toUpperCase()
        String = s.toUpperCase(); este método gera um novo String com
        todas as letras em maiúsculas.*/
        
        String novaString1 = s14.toUpperCase();


        /*l) toLowerCase()
        String = s.toLowerCase(); este método gera uma nova String com
        todas as letras em minúsculas.*/

        String novaString2 = s14.toLowerCase();

        /*m) trim()s.trim(); este método gera gera uma nova String removendo os
        caracteres em branco no início e fim da String original.*/
    
        String novaString3 = s14.trim();
        
        
        /*n) startsWith()
        boolean = s2.startsWith(String prefixo); este método verifica se um
        String é iniciada com uma sequência determinada de caracteres, retornando verdadeiro em caso afirmativo.*/
        
        boolean verd1 = s14.startsWith("com");
        
        /*o) endsWith()
        boolean = s.endsWith(String sufixo); verifica se uma String é
        encerrada com uma determinada sequência de caracteres, retornando verdadeiro em caso afirmativo.*/

        boolean verd2 = s14.endsWith("res");
        
        /*p) split - o método split divide uma String em várias substrings a
        partir de um caracter previamente definido.*/
        
      
        String s = "Nome,Endereço,UF,CEP";
        String[] cabecalho = s.split(",");
        System.out.println(cabecalho[0]);//Exibe Nome
        System.out.println(cabecalho[1]);//Exibe Endereço
        System.out.println(cabecalho[2]);//Exibe UF
        System.out.println(cabecalho[3]);//Exibe CEP
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
