package br.com.dio.exercicio.loops;


//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50


public class Ex9_NumerosImpares {
    public static void main(String[] args) {

        System.out.println("numeros impares de 1 a 50: ");

        for (int i = 0; i <=50; i++){
            if (i % 2 !=0)
                System.out.println(i);
            }

        }
    }

