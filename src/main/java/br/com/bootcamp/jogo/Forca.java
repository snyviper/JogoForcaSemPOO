package br.com.bootcamp.jogo;

import java.util.Random;
import java.util.Scanner;

public class Forca {

    private static String[] dica;

    public static String listaPalavraDificil(){
        String[] palavras = {"carambola", "lichia", "jatoba"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)];
    }
    public static String listaPalavraNormal(){
        String[] palavras = {"Abacaxi", "Melancia", "Melao"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)];
    }
    public static String listaPalavraFacil(){
        String[] palavras = {"banana", "uva", "maca"};
        Random random = new Random();
        return palavras[random.nextInt(palavras.length-1)];
    }
    public static String[] montaDica(int qtdLetras){
        dica = new String[qtdLetras];
        for(int i=0; i<dica.length; i++){
            dica[i] = "_";
        }
        return dica;
    }

    public static void main(String[] args){
        System.out.println("Bem vindo ao jogo!");
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a dificuldade do jogo?");
        System.out.println("f(Fácil) - n(Normal) - d(Difícil)");
        String dificuldade = in.next().toUpperCase();
        String palavraChave = null;
        int qtdLetras = 0;
        switch(dificuldade){
            case "F":
                palavraChave = listaPalavraFacil();
                break;
            case "N":
                palavraChave = listaPalavraNormal();
                break;
            case "D":
                palavraChave = listaPalavraDificil();
                break;
            default:
                palavraChave = "";
                System.out.println("Nenhuma tecla válida");
        }

        String listaEmString = "";
        montaDica(palavraChave.length());
        for(String s : dica){
            listaEmString += s;
        }

        System.out.print("Qual letra voce chuta? ");
        String letraDigitada = in.next().toLowerCase();

        String[] listaLetrasCorretas = palavraChave.split("");
        int i=0;
        qtdLetras = palavraChave.length();
        while(i<qtdLetras){
            if(listaLetrasCorretas[i].equals(letraDigitada)){
                dica[i]=letraDigitada;
            }
            i++;
        }
        String novaDica = "";
        for(String s : dica){
            novaDica += s;
        }
        System.out.print(novaDica);

        System.out.println(listaEmString);
        System.out.println(palavraChave);

    }
}
