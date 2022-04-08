package br.com.dio.exercicio.loops.Arrays;

/*Faça um Programa que leia um vetor de 10 caracteres,
     e diga quantas consoantes foram lidas.
     Imprima as consoantes.*/


import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        String[] consoantes = new String[5];

        int quantidadeconsoantes = 0;
        String letras;
        int count = 0;
        do {
            System.out.println("Insira as letras: ");
            letras = scan.next();

            if (!(letras.equalsIgnoreCase("a") |
                    letras.equalsIgnoreCase("e") |
                    letras.equalsIgnoreCase("i") |
                    letras.equalsIgnoreCase("o") |
                    letras.equalsIgnoreCase("u"))) {
                consoantes[count] = letras;
                quantidadeconsoantes++;

            }
            count++;


        } while (count < consoantes.length);

        System.out.println("As consoantes são: ");

        for (String consoante : consoantes) {
            if (consoante != null)
            System.out.print(consoante + " ");
        }

        System.out.println("\nnumero de consoantes: " + quantidadeconsoantes);
    }
}


