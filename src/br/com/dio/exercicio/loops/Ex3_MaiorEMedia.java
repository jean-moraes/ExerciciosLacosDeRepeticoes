package br.com.dio.exercicio.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior =0;
        double soma = 0;
        int count = 0;
        do {

            System.out.println("Número:");
            numero = scan.nextInt();

            count ++;
            soma = soma + numero;

            if (numero > maior) maior = numero;
        }while (count  < 5);
        soma = soma/5;

        System.out.println("O maior número é:" + maior);
        System.out.println("A média dos numeros é: " + soma);
    }


}
