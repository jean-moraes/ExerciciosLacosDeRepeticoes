package br.com.dio.exercicio.loops;

/*Faça um programa que leia um nome de usuário
 e a sua senha e não aceite a senha igual ao nome do usuário,
mostrando uma mensagem de erro e
voltando a pedir as informações*/

import java.util.Scanner;

public class Ex7_LoginESenha {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean validadarEntrada = false;
        String nome;
        String email;
        String senha;

        System.out.println("INSIRA SEU NOME: ");
        nome = scan.next();

        do {


            System.out.println("INSIRA SEU EMAIL: ");
            email = scan.next();

            System.out.println("INSIRA SUA SENHA: ");
            senha = scan.next();


            if (senha.equals(email))
                System.out.println("Senha Invalida, tente novamente: ");

            else {
                validadarEntrada = true;
                System.out.println("bem vindo " + nome);
            }



        } while (!validadarEntrada);


    }
}
