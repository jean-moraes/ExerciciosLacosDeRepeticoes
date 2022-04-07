package br.com.dio.exercicio.loops;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicar =1;

        System.out.println("Fatorial: ");
        fatorial = scan.nextInt();

        for (int i = fatorial; i>=1; i--) {

            multiplicar = multiplicar*i;
        }

        System.out.println(fatorial + "!" + "=" + multiplicar);

    }
}



