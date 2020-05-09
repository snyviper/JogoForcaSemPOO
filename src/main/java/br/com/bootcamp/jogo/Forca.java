package br.com.bootcamp.jogo;

import java.util.Random;
import java.util.Scanner;

public class Forca {

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
    public static void main(String[] args){
        System.out.println("Bem vindo ao jogo!");
        Scanner in = new Scanner(System.in);
        System.out.println("Qual a dificuldade do jogo?");
        System.out.println("f(Fácil) - n(Normal) - d(Difícil)");
        String dificuldadeJogo = in.next();

        switch(dificuldadeJogo){
            case "f":
                System.out.println(listaPalavraFacil());
                break;
            case "n":
                System.out.println(listaPalavraNormal());
                break;
            case "d":
                System.out.println(listaPalavraDificil());
                break;
            default:
                System.out.println("Nenhuma tecla válida");
        }
    }
}
