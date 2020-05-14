//Explicar o basico sobre pacotes(Não muito)
package br.com.bootcamp.jogo;

//Explicar sobre librarys/bibliotecas/imports
import java.util.Random;
import java.util.Scanner;

//Explicar sobre estrutura de uma classe java e montar o main primeiro
public class Forca {

    //Explicar sobre declaracao e tipos de variaveis e sinais de atribuicao
    private static char letraDigitada; //primitivo
    private static String palavraChave = ""; //Objeto(Referencia)
    private static int pontuacao =  0; //primitivo
    private static String[] palavras; //Objeto(Referencia)
    private static String dificuldade; //Objeto(Referencia)

    //Explicar sobre o método main
    public static void main(String[] args){
        getPalavra("D");
        //Falar sobre comentarios
        /*----------------001 - Lógica da dificuldade do jogo-----------------------*/

        //Dar um cheiro sobre instancia de classe(Mas não muito para nao confundir)
        Scanner in = new Scanner(System.in);

        //Exemplo de como utilizar System.out.println
        System.out.println("Olá, bem-vindx espertinhx...");
        System.out.println("Qual nivel de dificuldade?");
        System.out.print("F(Fácil); N(Normal); D(Díficil) --> ");

        //Explicar sobre atribuicao e metodos do java(Ex:toUpperCase)
        dificuldade = in.nextLine().toUpperCase();


        //Exemplo de como utilizar um switch/case e seu funcionamento
        switch(dificuldade){
            case "F":
                palavraChave = getPalavra("Facil");
                break;
            case "N":
                palavraChave = getPalavra("Normal");
                break;
            case "D":
                palavraChave = getPalavra("Dificil");
                break;
            default:
                System.out.println("Nenhuma válida!");
        }

        montaDica(palavraChave);

    }

    //Monta as linhas da dica
    private static String[] montaDica(String palavraChave) {
        String[] dica = new String[palavraChave.length()];

        //Explicar sobre for
        for(int i = 0; i < palavraChave.length(); i++){
            //falar sobre print e println
            dica[i] = " __ ";
        }
        return dica;
    }

    public static String getPalavra(String dificuldade){
        //Explicar sobre o funcionamento do if/else
        /*--------------Explicar sobre o equal e ==(igualdade)----------------
        Resumindo de modo gereal:

        a) usa objetos? Compare com equals;
        b) usa tipos primitivos? Use ==.
        */
//       String a = new String("2");
//       String b = new String("2");

       //int a = 2;
       //int b = 2;

        //Explicar sobre If
//        if(a == b) {
//            System.out.print("Explicar sobre brakpoint e mostrar a referencia da memória com ==");
//        }
//
//        if(a.equals(b)) {
//            System.out.print("Explicar sobre brakpoint e mostrar a referencia da memória com .equals");
//        }

        /*
        == testa se dois objetos são idênticos. Ou seja, se ocupam o mesmo local na memória.
        Equals testa conteúdo.
        Erro, pois obj1 nao é igual ao obj2, pois estao localizados em locais diferentes de memória
        Ok, == pode ser usado em enums, mesmo que os enums sejam objetos, já que você sabe que,
        com certeza, só haverá uma instância daquele objeto. Por outro lado, é exatamente um teste com == que um enum irá fazer,
         caso você também use o equals.
         */
        if(dificuldade.equals("Facil")){
            return sorteiaPalavraFacil();
        } else if(dificuldade.equals("Normal")){
            return sorteiaPalavraNormal();
        }else{
            return sorteiaPalavraDificil();
        }
    }

    public static String sorteiaPalavraDificil(){
        Random random = new Random();
        palavras = new String[]{"jabuticaba", "carambola", "damasco", "tomate"};

        //Explicar sobre return
        return palavras[random.nextInt(palavras.length)];
    }

    public static String sorteiaPalavraNormal(){
        Random random = new Random();
        palavras = new String[]{"abacaxi","manga","abacate","melância"};
        return palavras[random.nextInt(palavras.length)];
    }

    public static String sorteiaPalavraFacil(){
        Random random = new Random();
        palavras =  new String[]{"laranja","uva","maçã","banana"};
        return palavras[random.nextInt(palavras.length)];
    }

}
