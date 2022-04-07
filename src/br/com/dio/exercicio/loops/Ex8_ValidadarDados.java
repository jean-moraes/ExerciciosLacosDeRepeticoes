package br.com.dio.exercicio.loops;



/*Faça um programa que leia e valide as seguintes informações:
        Nome: maior que 3 caracteres;
        Idade: entre 0 e 150;
        Salário: maior que zero;
        Sexo: 'f' ou 'm';
        Estado Civil: 's', 'c', 'v', 'd';*/


import java.util.Scanner;

public class Ex8_ValidadarDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        do {
            System.out.println("Qual o seu nome? ");
            nome = scan.next();


        } while (nome.length() <=3);

        do {
            System.out.println("Qual sua idade? ");
            idade = scan.nextInt();

        } while (idade < 0 && idade > 150);

        do {
            System.out.println("Quanto você ganha? ");
            salario = scan.nextDouble();

        } while (salario <0);

        do {
            System.out.println("Qual seu sexo? F ou M ? ");
            sexo = scan.next();

        }while (!sexo.equalsIgnoreCase("F") &&
                !sexo.equalsIgnoreCase("M"));

        do {
            System.out.println("Qual seu estado cívil? S, C, D ou V ? ");
            estadoCivil = scan.next();

        } while (!estadoCivil.equalsIgnoreCase("S")&&
                !estadoCivil.equalsIgnoreCase("C") &&
                !estadoCivil.equalsIgnoreCase("D") &&
                !estadoCivil.equalsIgnoreCase("V"));


    }


}
