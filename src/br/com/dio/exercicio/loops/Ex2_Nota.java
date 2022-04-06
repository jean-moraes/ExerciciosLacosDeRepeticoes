package br.com.dio.exercicio.loops;


/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

    public class Ex2_Nota {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            while (true) {

                int nota;
                System.out.println("Insira uma nota de 0 a 10");
                nota = scan.nextInt();
                if (nota >10 | nota <0) System.out.println("Insira uma nota de 0 a 10\nTente novamente: \n");
            }
        }

    }
