package br.com.dio.exercicio.loops.Arrays;

/*Faça um Programa que leia um vetor de 10
   números reais e mostre-os na ordem
   inversa*/

public class Ex1_OrdemInversa {

    public static void main(String[] args) {

        int [] vetor = {15, -52, 28, 30, 45, -70};

        System.out.println(" VETOR: ");
        int count =0;

       /* while (count < (vetor.length)) {

            System.out.print(vetor[count] + " ");   // imprimindo usando o laço While na ordem natural
            count++;
        }*/

      /* for (int i = 0; i<6; i++) {


           System.out.print(vetor[i] + " ");      // imprimindo usando o laço For na ordem natural
       }*/

       /*int count1 = vetor.length;

       while (count1 >0){


           count1--;
           System.out.print(vetor[count1] + " "); // imprimindo vetor usando o laço While na ordem inversa
       }*/


        for (int i = vetor.length-1; i>=0; i--) {

            System.out.print(vetor[i] + " ");    // imprmindo vetor usando o laço For na ordem inversa
        }

    }



}
