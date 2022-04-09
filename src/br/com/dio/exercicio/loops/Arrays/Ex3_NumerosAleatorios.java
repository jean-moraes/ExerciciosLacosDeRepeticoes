package br.com.dio.exercicio.loops.Arrays;

/* faça um programa que leia 20 numeros inteiros aleatórios
(entre 0 a 100) armazene-os em um vetor.
ao final mostre os numeros e seus sucessores.*/


import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {

            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros aleatorios" + " ");

        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\n Sucessores dos Numeros aleatorios" + " ");

        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");

        }
    }
}
